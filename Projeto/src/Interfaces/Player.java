/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.sql.ResultSet;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import JavaBeans.Fila;
import JavaBeans.Jogadores;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author f
 */
public class Player extends JFrame implements ActionListener {
    
    JLabel titulo;
    JLabel titulo2;
    
    JTextField buscar;
    JButton listar;
    JButton proximo;
    JButton cadastrar;
    JButton menu;
    
    JLabel imagem1;
    JLabel imagem2;
    JLabel imagem3;
    
    
    // -- VARIAVEIS
    
    String poke1;
    String poke2;
    String poke3;
    int gerado = 0;
    String nome_player;
    String nick = "";
    
    Fila dados;
    
    public Player(Fila dados){
        
        this.dados = dados;
        
        Container fundo;
        fundo = this.getContentPane();
        fundo.setBackground(Color.darkGray);
        
        titulo = new JLabel();
        titulo2 = new JLabel("Digite seu nickname:");
        buscar = new JTextField();
        listar = new JButton();
        cadastrar = new JButton("Cadastrar");
        proximo = new JButton("Proximo");
        menu = new JButton("Menu");
        
        imagem1 = new JLabel();
        imagem2 = new JLabel();
        imagem3 = new JLabel();
        
        ImageIcon img_listar = new ImageIcon("src/Imagem_Batalha/pokeball.png");
        img_listar.setImage(img_listar.getImage().getScaledInstance(48, 38, 100));
        listar.setBounds(605, 230, 48, 38);
        listar.setIcon(img_listar);
        
        
        ImageIcon img_title = new ImageIcon("src/Imagens/Pokemon_logo2.png");
        img_title.setImage(img_title.getImage().getScaledInstance(600, 180, 100));
        
        
        titulo.setBounds(75, -25, 600, 180);
        titulo.setIcon(img_title);
        
        titulo2.setBounds(100, 235, 300, 25);
        buscar.setBounds(340, 235, 250, 26);        
        cadastrar.setBounds(210, 300, 150, 60);
        proximo.setBounds(405, 300, 160, 60);
        menu.setBounds(10, 455, 140, 50);
        
        titulo2.setFont(new Font("Robotto", Font.ITALIC,24));
        titulo2.setForeground(Color.white);
        
        menu.setBackground(Color.red);
        menu.setFont(new Font("Robotto", Font.ITALIC,24));
        
        
        //gerar.setBackground(Color.red);
        cadastrar.setFont(new Font("Robotto", Font.ITALIC,24));
        
        //proximo.setBackground(Color.GREEN);
        proximo.setFont(new Font("Robotto", Font.ITALIC,24));
        
        
        this.add(titulo);
        this.add(titulo2);
        this.add(buscar);
        this.add(listar);
        this.add(menu);
        this.add(cadastrar);
        this.add(proximo);
        this.add(imagem1);
        this.add(imagem2);
        this.add(imagem3);
        
        menu.addActionListener(this);
        proximo.addActionListener(this);
        cadastrar.addActionListener(this);
        listar.addActionListener(this);
        
        
        this.setSize(790, 550);
        this.setTitle("Escolha de time");
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(false);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(menu)){
            Frame frame = new Frame();
            this.dispose();
            frame.setVisible(true);
        }
        
        if(e.getSource().equals(listar)){
            try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemon","root","");
            System.out.println("Conectado.");

            String sql = "SELECT nick FROM player";
            PreparedStatement ps=conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                nick += (rs.getString("nick")+"\n");
            }
            //nome_player = rs.getString("nick");
            
            rs.close();
            conexao.close();
            
            System.out.println(nick);
            
            JOptionPane.showMessageDialog(null, "------ LISTA DE NICKS CADASTRADOS ------\n"+nick);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro");
        }
           
    }
        
        if (e.getSource().equals(cadastrar)){
            
            try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemon","root","");
            System.out.println("Conectado.");

            String sql = "INSERT INTO player (nick) values (?)";
            //String sql = "SELECT * FROM PLAYER WHERE nickname = ('"+buscar.getText()+"')";
            PreparedStatement ps=conexao.prepareStatement(sql);
            ps.setString(1, buscar.getText());
            
            ps.executeUpdate();
            conexao.close();
            nome_player = buscar.getText();
            JOptionPane.showMessageDialog(null, "Player cadastrado!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossivel cadastrar, talvez esse nick ja esteja em uso");
        }
            
        }
        
        if  (e.getSource().equals(proximo)){
            try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemon","root","");
            System.out.println("Conectado.");

            String sql = "SELECT * FROM player WHERE nick = ('"+buscar.getText()+"')";
            PreparedStatement ps=conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            nome_player = rs.getString("nick");
            Jogadores jogadores = new Jogadores();
            
            jogadores.setNome(nome_player);
            jogadores.setPoke1("");
            jogadores.setPoke2("");
            jogadores.setPoke3("");
            jogadores.setNome_oponente("dadwa");
            jogadores.setPoke1_oponente("");
            jogadores.setPoke2_oponente("");
            jogadores.setPoke3_oponente("");
            dados.queue(jogadores);
            
            rs.close();
            conexao.close();
            
            EscolherPokemon escolherPokemon = new EscolherPokemon(dados);
            escolherPokemon.setVisible(true);
            this.setVisible(false);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Esse nick ainda não foi cadastrado, por favor, insira um nick válido ou cadastre um novo!\n"
                    + "Lembrando que com um nick cadastrado você mantém seu progresso salvo.");
        }
            
    }
        
    }

}