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
public class Batalha extends JFrame implements ActionListener {
    
    JLabel titulo;
    JLabel fundo;
    JLabel icon_vida;
    JLabel icon_vida2;
    
   
    JLabel vida_poke;
    JLabel texto_vida_poke_oponente;
   
    JTextField text;
    JButton ok_text;
    JButton ok_text2;
    JButton skill1;
    JButton skill2;
    JButton skill3;
    JButton skill4;
    
    JButton poke1;
    JButton poke2;
    JButton poke3;
    JLabel borda;
    JButton sair;
    
    JLabel poke;
    JLabel poke_oponente;
    JLabel oponente;
    
    //-- Oponente -- //
        int poke_atual_oponente = 1;
        //-- Inicial --//
        String mestre_oponente = "";
        String poke1_oponente = "";
        String poke2_oponente = "";
        String poke3_oponente = "";
        
        //-- Poke Atual Oponente --//
        int vida_poke_oponente = 250;
        String tipo_poke_oponente;
        String fraqueza_poke_oponente;
            //-- Skill 1 --//
            String skill1_poke_oponente;
            String tipo_skill1_poke_oponente;
            int qtd_skill1_poke_oponente;
            String elemento_skill1_poke_oponente;
            //-- Skill 2 --//
            String skill2_poke_oponente;
            String tipo_skill2_poke_oponente;
            int qtd_skill2_poke_oponente;
            String elemento_skill2_poke_oponente;
            //-- Skill 3 --//
            String skill3_poke_oponente;
            String tipo_skill3_poke_oponente;
            int qtd_skill3_poke_oponente;
            String elemento_skill3_poke_oponente;
            
        //-- Poke 2 Oponente --//
            int vida_poke2_oponente;
            String tipo_poke2_oponente;
            String fraqueza_poke2_oponente;
                //-- Skill 1 --//
                String skill1_poke2_oponente;
                String tipo_skill1_poke2_oponente;
                int qtd_skill1_poke2_oponente;
                String elemento_skill1_poke2_oponente;
                //-- Skill 2 --//
                String skill2_poke2_oponente;
                String tipo_skill2_poke2_oponente;
                int qtd_skill2_poke2_oponente;
                String elemento_skill2_poke2_oponente;
                //-- Skill 3 --//
                String skill3_poke2_oponente;
                String tipo_skill3_poke2_oponente;
                int qtd_skill3_poke2_oponente;
                String elemento_skill3_poke2_oponente;
                
        //-- Poke 3 Oponente --//
            int vida_poke3_oponente;
            String tipo_poke3_oponente;
            String fraqueza_poke3_oponente;
                //-- Skill 1 --//
                String skill1_poke3_oponente;
                String tipo_skill1_poke3_oponente;
                int qtd_skill1_poke3_oponente;
                String elemento_skill1_poke3_oponente;
                //-- Skill 2 --//
                String skill2_poke3_oponente;
                String tipo_skill2_poke3_oponente;
                int qtd_skill2_poke3_oponente;
                String elemento_skill2_poke3_oponente;
                //-- Skill 3 --//
                String skill3_poke3_oponente;
                String tipo_skill3_poke3_oponente;
                int qtd_skill3_poke3_oponente;
                String elemento_skill3_poke3_oponente;
        
    
    //-- Player --//
        String player;
        int poke_atual = 1;
        //-- Poke 1 --//
        String poke1_player;
        int vida_poke1_player;
        String tipo_poke1_player;
        String fraqueza_poke1_player;
            //-- Skill 1 --//
            String skill1_poke1_player;
            String tipo_skill1_poke1_player; //testando
            int qtd_skill1_poke1_player; //testando
            String elemento_skill1_poke1_player;
            //-- Skill 2 --//
            String skill2_poke1_player;
            String tipo_skill2_poke1_player;
            int qtd_skill2_poke1_player;
            String elemento_skill2_poke1_player;
            //-- Skill 3 --//
            String skill3_poke1_player;
            String tipo_skill3_poke1_player;
            int qtd_skill3_poke1_player;
            String elemento_skill3_poke1_player;
            //-- Boost --//
            String boost_poke1_player;
            String tipo_boost_poke1_player;
            int qtd_boost_poke1;
            int defesa_poke1 = 0;
            int ataque_poke1 = 0;
        
        //-- Poke 2 --//
        String poke2_player;
        int vida_poke2_player;
        String tipo_poke2_player;
        String fraqueza_poke2_player;
            //-- Skill 1 --//
            String skill1_poke2_player;
            String tipo_skill1_poke2_player;
            int qtd_skill1_poke2_player;
            String elemento_skill1_poke2_player;
            //-- Skill 2 --//
            String skill2_poke2_player;
            String tipo_skill2_poke2_player;
            int qtd_skill2_poke2_player;
            String elemento_skill2_poke2_player;
            //-- Skill 3 --//
            String skill3_poke2_player;
            String tipo_skill3_poke2_player;
            int qtd_skill3_poke2_player;
            String elemento_skill3_poke2_player;
            //-- Boost --//
            String boost_poke2_player;
            String tipo_boost_poke2_player;
            int qtd_boost_poke2;
            int defesa_poke2 = 0;
            int ataque_poke2 = 0;
        
        //-- Poke 3 --//
        String poke3_player;
        int vida_poke3_player;
        String tipo_poke3_player;
        String fraqueza_poke3_player;
            //-- Skill 1 --//
            String skill1_poke3_player;
            String tipo_skill1_poke3_player;
            int qtd_skill1_poke3_player;
            String elemento_skill1_poke3_player;
            //-- Skill 2 --//
            String skill2_poke3_player;
            String tipo_skill2_poke3_player;
            int qtd_skill2_poke3_player;
            String elemento_skill2_poke3_player;
            //-- Skill 3 --//
            String skill3_poke3_player;
            String tipo_skill3_poke3_player;
            int qtd_skill3_poke3_player;
            String elemento_skill3_poke3_player;
            //-- Boost --//
            String boost_poke3_player;
            String tipo_boost_poke3_player;
            int qtd_boost_poke3;
            int defesa_poke3 = 0;
            int ataque_poke3 = 0;
        
    
    EscolherOponente escolherOponente;
    
    int cont = 0;
    int cont2 = 0;
    int cont_troca;
    boolean vez = true;
    int morte_oponente = 0;
    int morte_player = 0;
    int ataque_do_oponente = 0;
    int poke1_vida = 1;
    int poke2_vida = 1;
    int poke3_vida = 1;
    int derrotas;
    int vitorias;
    
    Fila dados;
    
    public Batalha(Fila dados){
        
        this.dados = dados;
        
        escolherOponente = new EscolherOponente(dados);
        
        Container background;
        background = this.getContentPane();
        background.setBackground(Color.darkGray);
        
        
        titulo = new JLabel();
        fundo = new JLabel();
        //nome_poke_oponente = new JLabel("");
        texto_vida_poke_oponente = new JLabel("250");
        //tela_poke_oponente = new JLabel("");
       
        //nome_poke = new JLabel("");
        vida_poke = new JLabel("250");
        //tela_poke = new JLabel("");
       
        text = new JTextField("");
        ok_text = new JButton("Continuar");
        ok_text2 = new JButton("Continuar");
        
        
        poke1 = new JButton();
        poke2 = new JButton();
        poke3 = new JButton();
        sair = new JButton();
        
        poke = new JLabel();
        poke_oponente = new JLabel("25");
        oponente = new JLabel();
        
        borda = new JLabel();
        icon_vida = new JLabel();
        icon_vida2 = new JLabel();
        
        //System.out.println(mestre_oponente);
   
        while (cont2 == 0){
            Jogadores temp=(Jogadores) dados.dequeue(0);
            player = temp.getNome();
            poke1_player = temp.getPoke1();
            poke2_player = temp.getPoke2();
            poke3_player = temp.getPoke3();
            cont2 = 1;
        }
        
        ImageIcon img_vida1 = new ImageIcon("src/Imagem_Batalha/health2.png");
        img_vida1.setImage(img_vida1.getImage().getScaledInstance(20, 20, 100));
        icon_vida.setBounds(355, 85, 20, 20);
        icon_vida.setIcon(img_vida1);
        texto_vida_poke_oponente.setBounds(390, 80, 55, 30);
        texto_vida_poke_oponente.setForeground(Color.cyan);
        texto_vida_poke_oponente.setFont(new Font("Robotto", Font.ITALIC,24));
        
        ImageIcon img_vida2 = new ImageIcon("src/Imagem_Batalha/health2.png");
        img_vida2.setImage(img_vida2.getImage().getScaledInstance(20, 20, 100));
        icon_vida2.setBounds(65, 280, 20, 20);
        icon_vida2.setIcon(img_vida2);
        vida_poke.setBounds(100, 275, 55, 30);
        vida_poke.setForeground(Color.cyan);
        vida_poke.setFont(new Font("Robotto", Font.ITALIC,24));
        
        
        
        ImageIcon imgPoke = new ImageIcon("src/Pokemon_batalha/"+poke1_player+"_back.png");
        imgPoke.setImage(imgPoke.getImage().getScaledInstance(280, 290, 100));
        poke.setBounds(150, 110, 280, 290);
        poke.setIcon(imgPoke);
        
        
        ImageIcon fundo_1 = new ImageIcon("src/Imagem_Batalha/back_battle3.jpeg");
        fundo_1.setImage(fundo_1.getImage().getScaledInstance(790, 368, 100));
        
        fundo.setBounds(0, 0, 790, 368);
        fundo.setIcon(fundo_1);
        
        ImageIcon borda_1 = new ImageIcon("src/Imagem_Batalha/borda3.png");
        borda_1.setImage(borda_1.getImage().getScaledInstance(305, 210, 100));
        
        borda.setBounds(515, 335, 310, 210);
        borda.setIcon(borda_1);
        
        ImageIcon poke_1 = new ImageIcon("src/Imagens_pokemons/"+poke1_player+".png");
        poke_1.setImage(poke_1.getImage().getScaledInstance(60, 50, 100));
        poke1.setBounds(570, 410, 60, 50);
        poke1.setIcon(poke_1);
        poke1.setBackground(Color.white);
        System.out.println(poke_1);
        
        ImageIcon poke_2 = new ImageIcon("src/Imagens_pokemons/"+poke2_player+".png");
        poke_2.setImage(poke_2.getImage().getScaledInstance(60, 50, 100));
        poke2.setBounds(640, 410, 60, 50);
        poke2.setIcon(poke_2);
        poke2.setBackground(Color.white);        
        
        ImageIcon poke_3 = new ImageIcon("src/Imagens_pokemons/"+poke3_player+".png");
        poke_3.setImage(poke_3.getImage().getScaledInstance(60, 50, 100));
        poke3.setBounds(710, 410, 60, 50);
        poke3.setIcon(poke_3);
        poke3.setBackground(Color.white);
        
        
        while (cont == 0){
            Jogadores temp=(Jogadores) dados.dequeue(0);
            System.out.println(temp.getNome_oponente());
            mestre_oponente = temp.getNome_oponente();
            poke1_oponente = temp.getPoke1_oponente();
            poke2_oponente = temp.getPoke2_oponente();
            poke3_oponente = temp.getPoke3_oponente();
            cont += 1;
            
            if(mestre_oponente.equalsIgnoreCase("ash")){
                ImageIcon img_oponente = new ImageIcon("src/Imagem_Batalha/Ash.png");
                img_oponente.setImage(img_oponente.getImage().getScaledInstance(95, 145, 100));
                oponente.setBounds(445, 105, 95, 145);
                oponente.setIcon(img_oponente);
            }

            else if(mestre_oponente.equalsIgnoreCase("Brok")){
                ImageIcon img_oponente = new ImageIcon("src/Imagem_Batalha/Brok.png");
                img_oponente.setImage(img_oponente.getImage().getScaledInstance(95, 145, 100));
                oponente.setBounds(445, 105, 95, 145);
                oponente.setIcon(img_oponente);
            }

            else if(mestre_oponente.equalsIgnoreCase("Gary")){
                ImageIcon img_oponente = new ImageIcon("src/Imagem_Batalha/Gary2.png");
                img_oponente.setImage(img_oponente.getImage().getScaledInstance(95, 145, 100));
                oponente.setBounds(445, 105, 95, 145);
                oponente.setIcon(img_oponente);
            }

            else if(mestre_oponente.equalsIgnoreCase("Rocket")){
                ImageIcon img_oponente = new ImageIcon("src/Imagem_Batalha/Team_rocket.png");
                img_oponente.setImage(img_oponente.getImage().getScaledInstance(95, 145, 100));
                oponente.setBounds(445, 105, 95, 145);
                oponente.setIcon(img_oponente);
            }
        }
        
        ImageIcon imgPoke_oponente = new ImageIcon("src/Pokemon_batalha/"+poke1_oponente+".png");
        imgPoke_oponente.setImage(imgPoke_oponente.getImage().getScaledInstance(120, 130, 100));
        poke_oponente.setBounds(360, 135, 120, 130);
        poke_oponente.setIcon(imgPoke_oponente);
        
        ImageIcon imgSair = new ImageIcon("src/Imagem_Batalha/pokeball.png");
        imgSair.setImage(imgSair.getImage().getScaledInstance(45, 45, 100));
        sair.setBounds(5, 5, 50, 50);
        sair.setIcon(imgSair);
        
        
        text.setFont(new Font("Robotto", Font.ITALIC,16));
        text.setBounds(10, 375, 500, 90);
        text.setVisible(false);
        ok_text.setBounds(220, 470, 100, 30);
        ok_text.setVisible(false);
        ok_text2.setBounds(220, 470, 100, 30);
        ok_text2.setVisible(false);
        
        poke1.addActionListener(this);
        poke2.addActionListener(this);
        poke3.addActionListener(this);
        sair.addActionListener(this);
        ok_text.addActionListener(this);
        ok_text2.addActionListener(this);
        
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemon","root","");
            System.out.println("Conectado.");

            String sql = "SELECT * FROM player WHERE nick = ('"+player+"')";
            PreparedStatement ps=conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            derrotas = rs.getInt("derrotas");
            vitorias = rs.getInt("vitorias");
            
            rs.close();
            conexao.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu erro, irmão!");
        }
        
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemon","root","");
            System.out.println("Conectado.");

            //-- Pokemon_1 - Oponente --//
            String sql = "SELECT * FROM pokemons WHERE nome = ('"+poke1_oponente+"')";
            PreparedStatement ps=conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            tipo_poke_oponente = rs.getString("tipo");
            vida_poke_oponente = rs.getInt("vida");
            fraqueza_poke_oponente = rs.getString("fraqueza");
                //-- Skill 1 --//
                skill1_poke_oponente = rs.getString("skill_1");
                tipo_skill1_poke_oponente = rs.getString("tipo_skill_1");
                qtd_skill1_poke_oponente = rs.getInt("qtd_skill_1");
                elemento_skill1_poke_oponente = rs.getString("elemento_skill_1");
                //-- Skill 2 --//
                skill2_poke_oponente = rs.getString("skill_2");
                tipo_skill2_poke_oponente = rs.getString("tipo_skill_2");
                qtd_skill2_poke_oponente = rs.getInt("qtd_skill_2");
                elemento_skill2_poke_oponente = rs.getString("elemento_skill_2");
                //-- Skill 3 --//
                skill3_poke_oponente = rs.getString("skill_3");
                tipo_skill3_poke_oponente = rs.getString("tipo_skill_3");
                qtd_skill3_poke_oponente = rs.getInt("qtd_skill_3");
                elemento_skill3_poke_oponente = rs.getString("elemento_skill_3");
            
            rs.close();
            conexao.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu erro na conexão. :(");
        }
        
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemon","root","");
            System.out.println("Conectado.");

            //-- Pokemon_2 - Oponente --//
            String sql = "SELECT * FROM pokemons WHERE nome = ('"+poke2_oponente+"')";
            PreparedStatement ps=conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            tipo_poke2_oponente = rs.getString("tipo");
            vida_poke2_oponente = rs.getInt("vida");
            fraqueza_poke2_oponente = rs.getString("fraqueza");
                //-- Skill 1 --//
                skill1_poke2_oponente = rs.getString("skill_1");
                tipo_skill1_poke2_oponente = rs.getString("tipo_skill_1");
                qtd_skill1_poke2_oponente = rs.getInt("qtd_skill_1");
                elemento_skill1_poke2_oponente = rs.getString("elemento_skill_1");
                //-- Skill 2 --//
                skill2_poke2_oponente = rs.getString("skill_2");
                tipo_skill2_poke2_oponente = rs.getString("tipo_skill_2");
                qtd_skill2_poke2_oponente = rs.getInt("qtd_skill_2");
                elemento_skill2_poke2_oponente = rs.getString("elemento_skill_2");
                //-- Skill 3 --//
                skill3_poke2_oponente = rs.getString("skill_3");
                tipo_skill3_poke2_oponente = rs.getString("tipo_skill_3");
                qtd_skill3_poke2_oponente = rs.getInt("qtd_skill_3");
                elemento_skill3_poke2_oponente = rs.getString("elemento_skill_3");
            
            rs.close();
            conexao.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu erro na conexão. :(");
        }
        
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemon","root","");
            System.out.println("Conectado.");

            //-- Pokemon_3 - Oponente --//
            String sql = "SELECT * FROM pokemons WHERE nome = ('"+poke3_oponente+"')";
            PreparedStatement ps=conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            tipo_poke3_oponente = rs.getString("tipo");
            vida_poke3_oponente = rs.getInt("vida");
            fraqueza_poke3_oponente = rs.getString("fraqueza");
                //-- Skill 1 --//
                skill1_poke3_oponente = rs.getString("skill_1");
                tipo_skill1_poke3_oponente = rs.getString("tipo_skill_1");
                qtd_skill1_poke3_oponente = rs.getInt("qtd_skill_1");
                elemento_skill1_poke3_oponente = rs.getString("elemento_skill_1");
                //-- Skill 2 --//
                skill2_poke3_oponente = rs.getString("skill_2");
                tipo_skill2_poke3_oponente = rs.getString("tipo_skill_2");
                qtd_skill2_poke3_oponente = rs.getInt("qtd_skill_2");
                elemento_skill2_poke3_oponente = rs.getString("elemento_skill_2");
                //-- Skill 3 --//
                skill3_poke3_oponente = rs.getString("skill_3");
                tipo_skill3_poke3_oponente = rs.getString("tipo_skill_3");
                qtd_skill3_poke3_oponente = rs.getInt("qtd_skill_3");
                elemento_skill3_poke3_oponente = rs.getString("elemento_skill_3");
            
            rs.close();
            conexao.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu erro na conexão. :(");
        }
        //-- MONTAGEM DBC PLAYER --//
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemon","root","");
            System.out.println("Conectado.");

            //-- Pokemon_1 - Player --//
            String sql = "SELECT * FROM pokemons WHERE nome = ('"+poke1_player+"')";
            PreparedStatement ps=conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            tipo_poke1_player = rs.getString("tipo");
            vida_poke1_player = rs.getInt("vida");
            fraqueza_poke1_player = rs.getString("fraqueza");
                //-- Skill 1 --//
                skill1_poke1_player = rs.getString("skill_1");
                tipo_skill1_poke1_player = rs.getString("tipo_skill_1");
                qtd_skill1_poke1_player = rs.getInt("qtd_skill_1");
                elemento_skill1_poke1_player = rs.getString("elemento_skill_1");
                //-- Skill 2 --//
                skill2_poke1_player = rs.getString("skill_2");
                tipo_skill2_poke1_player = rs.getString("tipo_skill_2");
                qtd_skill2_poke1_player = rs.getInt("qtd_skill_2");
                elemento_skill2_poke1_player = rs.getString("elemento_skill_2");
                //-- Skill 3 --//
                skill3_poke1_player = rs.getString("skill_3");
                tipo_skill3_poke1_player = rs.getString("tipo_skill_3");
                qtd_skill3_poke1_player = rs.getInt("qtd_skill_3");
                elemento_skill3_poke1_player = rs.getString("elemento_skill_3");
                //-- Boost --//
                boost_poke1_player = rs.getString("boost");
                tipo_boost_poke1_player = rs.getString("tipo_boost");
                qtd_boost_poke1 = rs.getInt("qtd_boost");
                defesa_poke1 = 0;
                ataque_poke1 = 0;
            
            rs.close();
            conexao.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu erro na conexão. :(");
        }
        
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemon","root","");
            System.out.println("Conectado.");

            //-- Pokemon_2 - Player --//
            String sql = "SELECT * FROM pokemons WHERE nome = ('"+poke2_player+"')";
            PreparedStatement ps=conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            tipo_poke2_player = rs.getString("tipo");
            vida_poke2_player = rs.getInt("vida");
            fraqueza_poke2_player = rs.getString("fraqueza");
                //-- Skill 1 --//
                skill1_poke2_player = rs.getString("skill_1");
                tipo_skill1_poke2_player = rs.getString("tipo_skill_1");
                qtd_skill1_poke2_player = rs.getInt("qtd_skill_1");
                elemento_skill1_poke2_player = rs.getString("elemento_skill_1");
                //-- Skill 2 --//
                skill2_poke2_player = rs.getString("skill_2");
                tipo_skill2_poke2_player = rs.getString("tipo_skill_2");
                qtd_skill2_poke2_player = rs.getInt("qtd_skill_2");
                elemento_skill2_poke2_player = rs.getString("elemento_skill_2");
                //-- Skill 3 --//
                skill3_poke2_player = rs.getString("skill_3");
                tipo_skill3_poke2_player = rs.getString("tipo_skill_3");
                qtd_skill3_poke2_player = rs.getInt("qtd_skill_3");
                elemento_skill3_poke2_player = rs.getString("elemento_skill_3");
                //-- Boost --//
                boost_poke2_player = rs.getString("boost");
                tipo_boost_poke2_player = rs.getString("tipo_boost");
                qtd_boost_poke2 = rs.getInt("qtd_boost");
                defesa_poke1 = 0;
                ataque_poke1 = 0;
            
            rs.close();
            conexao.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu erro na conexão. :(");
        }
        
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemon","root","");
            System.out.println("Conectado.");

            //-- Pokemon_3 - Player --//
            String sql = "SELECT * FROM pokemons WHERE nome = ('"+poke3_player+"')";
            PreparedStatement ps=conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            tipo_poke3_player = rs.getString("tipo");
            vida_poke3_player = rs.getInt("vida");
            fraqueza_poke3_player = rs.getString("fraqueza");
                //-- Skill 1 --//
                skill1_poke3_player = rs.getString("skill_1");
                tipo_skill1_poke3_player = rs.getString("tipo_skill_1");
                qtd_skill1_poke3_player = rs.getInt("qtd_skill_1");
                elemento_skill1_poke3_player = rs.getString("elemento_skill_1");
                //-- Skill 2 --//
                skill2_poke3_player = rs.getString("skill_2");
                tipo_skill2_poke3_player = rs.getString("tipo_skill_2");
                qtd_skill2_poke3_player = rs.getInt("qtd_skill_2");
                elemento_skill2_poke3_player = rs.getString("elemento_skill_2");
                //-- Skill 3 --//
                skill3_poke3_player = rs.getString("skill_3");
                tipo_skill3_poke3_player = rs.getString("tipo_skill_3");
                qtd_skill3_poke3_player = rs.getInt("qtd_skill_3");
                elemento_skill3_poke3_player = rs.getString("elemento_skill_3");
                //-- Boost --//
                boost_poke3_player = rs.getString("boost");
                tipo_boost_poke3_player = rs.getString("tipo_boost");
                qtd_boost_poke3 = rs.getInt("qtd_boost");
                defesa_poke1 = 0;
                ataque_poke1 = 0;
            
            rs.close();
            conexao.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu erro na conexão. :(");
        }
        
        skill1 = new JButton(skill1_poke1_player);
        skill2 = new JButton(skill2_poke1_player);
        skill3 = new JButton(skill3_poke1_player);
        skill4 = new JButton(boost_poke1_player);
        
        skill1.setFont(new Font("Robotto", Font.BOLD,20));
        skill1.setBounds(10, 370, 260, 65);
        
        skill2.setFont(new Font("Robotto", Font.BOLD,20));
        skill2.setBounds(285, 370, 260, 65);
        
        skill3.setFont(new Font("Robotto", Font.BOLD,20));
        skill3.setBounds(10, 445, 260, 65);

        skill4.setFont(new Font("Robotto", Font.BOLD,20));
        skill4.setBounds(285, 445, 260, 65);
        
        skill1.setBackground(Color.red);
        skill2.setBackground(Color.yellow);
        skill3.setBackground(Color.green);
        skill4.setBackground(Color.blue);
        
        skill1.addActionListener(this);
        skill2.addActionListener(this);
        skill3.addActionListener(this);
        skill4.addActionListener(this);
        
        this.add(titulo);
        this.add(text);
        this.add(ok_text);
        this.add(ok_text2);
        this.add(skill1);
        this.add(skill2);
        this.add(skill3);
        this.add(skill4);
        this.add(poke1);
        this.add(poke2);
        this.add(poke3);
        this.add(borda);
        this.add(poke);
        this.add(poke_oponente);
        this.add(oponente);
        this.add(sair);
        this.add(icon_vida);
        this.add(texto_vida_poke_oponente);
        this.add(icon_vida2);
        this.add(vida_poke);
        this.add(fundo);
       
       
        this.setSize(790, 550);
        this.setTitle("Batalha");
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(false);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(sair)){
            this.dispose();
            Frame frame = new Frame();
            frame.setVisible(true);
        }
        
        if(e.getSource().equals(ok_text)){
            text.setText("");
            text.setVisible(false);
            ok_text.setVisible(false);
            skill1.setVisible(true);
            skill2.setVisible(true);
            skill3.setVisible(true);
            skill4.setVisible(true);
            vez = false;
        }
        if(e.getSource().equals(ok_text2)){
            text.setText("");
            text.setVisible(false);
            ok_text2.setVisible(false);
            skill1.setVisible(true);
            skill2.setVisible(true);
            skill3.setVisible(true);
            skill4.setVisible(true);
            vez = true;
        }

        if(e.getSource().equals(poke1)){
            if(cont_troca >= 3){
                JOptionPane.showMessageDialog(null, "Você não pode mais trocar Pokémons, ja fez 3 trocas!");
            }
            else if(vida_poke1_player <= 0){
                JOptionPane.showMessageDialog(null, "Você não pode mais trocar para este pokémon, ele foi jogar no Vasco");
            }
            else{
                poke_atual = 1;
                skill1.setText(skill1_poke1_player);
                skill2.setText(skill2_poke1_player);
                skill3.setText(skill3_poke1_player);
                skill4.setText(boost_poke1_player);
                ImageIcon imgPoke = new ImageIcon("src/Pokemon_batalha/"+poke1_player+"_back.png");
                imgPoke.setImage(imgPoke.getImage().getScaledInstance(280, 290, 100));
                poke.setBounds(150, 110, 280, 290);
                poke.setIcon(imgPoke);
                cont_troca += 1;
                vida_poke.setText(String.valueOf(vida_poke1_player));
            }
        }
        if(e.getSource().equals(poke2)){
            if(cont_troca >= 3){
                JOptionPane.showMessageDialog(null, "Você não pode mais trocar Pokémons, ja fez 3 trocas!");
            }
            else if(vida_poke2_player <= 0){
                JOptionPane.showMessageDialog(null, "Você não pode mais trocar para este pokémon, ele foi jogar no Vasco");
            }
            else{
                poke_atual = 2;
                skill1.setText(skill1_poke2_player);
                skill2.setText(skill2_poke2_player);
                skill3.setText(skill3_poke2_player);
                skill4.setText(boost_poke2_player);
                ImageIcon imgPoke = new ImageIcon("src/Pokemon_batalha/"+poke2_player+"_back.png");
                imgPoke.setImage(imgPoke.getImage().getScaledInstance(280, 290, 100));
                poke.setBounds(150, 110, 280, 290);
                poke.setIcon(imgPoke);
                cont_troca += 1;
                vida_poke.setText(String.valueOf(vida_poke2_player));
            }
        }
        if(e.getSource().equals(poke3)){
            if(cont_troca >= 3){
                JOptionPane.showMessageDialog(null, "Você não pode mais trocar Pokémons, ja fez 3 trocas!");
            }
            else if(vida_poke3_player <= 0){
                JOptionPane.showMessageDialog(null, "Você não pode mais trocar para este pokémon, ele foi jogar no Vasco");
            }
            else{
                poke_atual = 3;
                skill1.setText(skill1_poke3_player);
                skill2.setText(skill2_poke3_player);
                skill3.setText(skill3_poke3_player);
                skill4.setText(boost_poke3_player);
                ImageIcon imgPoke = new ImageIcon("src/Pokemon_batalha/"+poke3_player+"_back.png");
                imgPoke.setImage(imgPoke.getImage().getScaledInstance(280, 290, 100));
                poke.setBounds(150, 110, 280, 290);
                poke.setIcon(imgPoke);
                cont_troca += 1;
                vida_poke.setText(String.valueOf(vida_poke3_player));
            }
        }
        
        if(e.getSource().equals(skill1)){
            if(vez == false){
                JOptionPane.showMessageDialog(null, "Não é sua vez, aguarde a jogada do adversário!");
            }
            else if(poke_atual == 1){
                if(tipo_skill1_poke1_player.equals("dano")){
                    vida_poke_oponente -= qtd_skill1_poke1_player;
                    texto_vida_poke_oponente.setText(String.valueOf(vida_poke_oponente));
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke1_player+" usou "+skill1_poke1_player+"\ne causou "+qtd_skill1_poke1_player+" de dano!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
                else{
                    vida_poke1_player += qtd_skill1_poke1_player;
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke1_player+" usou "+skill1_poke1_player+"\ne recuperou "+qtd_skill1_poke1_player+" de vida!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
            }
            else if(poke_atual == 2){
                if(tipo_skill1_poke1_player.equalsIgnoreCase("dano")){
                    vida_poke_oponente -= qtd_skill1_poke2_player;
                    texto_vida_poke_oponente.setText(String.valueOf(vida_poke_oponente));
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke2_player+" usou "+skill1_poke2_player+"\ne causou "+qtd_skill1_poke2_player+" de dano!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
                else{
                    vida_poke2_player += qtd_skill1_poke2_player;
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke2_player+" usou "+skill1_poke2_player+"\ne recuperou "+qtd_skill1_poke2_player+" de vida!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
            }
            else if(poke_atual == 3){
                if(tipo_skill1_poke1_player.equalsIgnoreCase("dano")){
                    vida_poke_oponente -= qtd_skill1_poke3_player;
                    texto_vida_poke_oponente.setText(String.valueOf(vida_poke_oponente));
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke3_player+" usou "+skill1_poke3_player+"\ne causou "+qtd_skill1_poke3_player+" de dano!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
                else{
                    vida_poke3_player += qtd_skill1_poke3_player;
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke3_player+" usou "+skill1_poke3_player+"\ne recuperou "+qtd_skill1_poke3_player+" de vida!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
            }

        }
        
        if(e.getSource().equals(skill2)){
            if(vez == false){
                JOptionPane.showMessageDialog(null, "Não é sua vez, aguarde a jogada do adversário!");
            }
            else if(poke_atual == 1){
                if(tipo_skill2_poke1_player.equalsIgnoreCase("dano")){
                    vida_poke_oponente -= qtd_skill2_poke1_player;
                    texto_vida_poke_oponente.setText(String.valueOf(vida_poke_oponente));
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke1_player+" usou "+skill2_poke1_player+"\ne causou "+qtd_skill2_poke1_player+" de dano!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
                else{
                    vida_poke1_player += qtd_skill2_poke1_player;
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke1_player+" usou "+skill2_poke1_player+"\ne recuperou "+qtd_skill2_poke1_player+" de vida!");
                    vida_poke.setText(String.valueOf(vida_poke1_player));
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
            }
            else if(poke_atual == 2){
                if(tipo_skill2_poke1_player.equalsIgnoreCase("dano")){
                    vida_poke_oponente -= qtd_skill2_poke2_player;
                    texto_vida_poke_oponente.setText(String.valueOf(vida_poke_oponente));
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke2_player+" usou "+skill2_poke2_player+"\ne causou "+qtd_skill2_poke2_player+" de dano!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
                else{
                    vida_poke2_player += qtd_skill2_poke2_player;
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke2_player+" usou "+skill2_poke2_player+"\ne recuperou "+qtd_skill2_poke2_player+" de vida!");
                    vida_poke.setText(String.valueOf(vida_poke2_player));
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
            }
            else if(poke_atual == 3){
                if(tipo_skill2_poke1_player.equalsIgnoreCase("dano")){
                    vida_poke_oponente -= qtd_skill2_poke3_player;
                    texto_vida_poke_oponente.setText(String.valueOf(vida_poke_oponente));
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke3_player+" usou "+skill2_poke3_player+"\ne causou "+qtd_skill2_poke3_player+" de dano!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
                else{
                    vida_poke3_player += qtd_skill2_poke3_player;
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke3_player+" usou "+skill2_poke3_player+"\ne recuperou "+qtd_skill2_poke3_player+" de vida!");
                    vida_poke.setText(String.valueOf(vida_poke3_player));
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
            }
          
        }
        
        if(e.getSource().equals(skill3)){
            if(vez == false){
                JOptionPane.showMessageDialog(null, "Não é sua vez, aguarde a jogada do adversário!");
            }
            else if(poke_atual == 1){
                if(tipo_skill3_poke1_player.equalsIgnoreCase("dano")){
                    vida_poke_oponente -= qtd_skill3_poke1_player;
                    texto_vida_poke_oponente.setText(String.valueOf(vida_poke_oponente));
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke1_player+" usou "+skill3_poke1_player+"\ne causou "+qtd_skill3_poke1_player+" de dano!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
                else{
                    vida_poke1_player += qtd_skill3_poke1_player;
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke1_player+" usou "+skill3_poke1_player+"\ne recuperou "+qtd_skill3_poke1_player+" de vida!");
                    vida_poke.setText(String.valueOf(vida_poke1_player));
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
            }
            else if(poke_atual == 2){
                if(tipo_skill3_poke1_player.equalsIgnoreCase("dano")){
                    vida_poke_oponente -= qtd_skill3_poke2_player;
                    texto_vida_poke_oponente.setText(String.valueOf(vida_poke_oponente));
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke2_player+" usou "+skill3_poke2_player+"\ne causou "+qtd_skill3_poke2_player+" de dano!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
                else{
                    vida_poke2_player += qtd_skill3_poke2_player;
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke2_player+" usou "+skill3_poke2_player+"\ne recuperou "+qtd_skill3_poke2_player+" de vida!");
                    vida_poke.setText(String.valueOf(vida_poke2_player));
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
            }
            else if(poke_atual == 3){
                if(tipo_skill3_poke1_player.equalsIgnoreCase("dano")){
                    vida_poke_oponente -= qtd_skill3_poke3_player;
                    texto_vida_poke_oponente.setText(String.valueOf(vida_poke_oponente));
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke3_player+" usou "+skill3_poke3_player+"\ne causou "+qtd_skill3_poke3_player+" de dano!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
                else{
                    vida_poke3_player += qtd_skill3_poke3_player;
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke3_player+" usou "+skill3_poke3_player+"\ne recuperou "+qtd_skill3_poke3_player+" de vida!");
                    vida_poke.setText(String.valueOf(vida_poke3_player));
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
            }
           
        }
        
        if(e.getSource().equals(skill4)){
            if(vez == false){
                JOptionPane.showMessageDialog(null, "Não é sua vez, aguarde a jogada do adversário!");
            }
            else if(poke_atual == 1){
                if(tipo_boost_poke1_player.equalsIgnoreCase("defesa")){
                    defesa_poke1 += 2;
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke1_player+" usou "+boost_poke1_player+"\ne reforcou "+qtd_boost_poke1+" de defesa!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
                else{
                    ataque_poke1 += 2;
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke1_player+" usou "+boost_poke1_player+"\ne reforcou "+qtd_boost_poke1+" de ataque!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
            }
            else if(poke_atual == 2){
                if(tipo_boost_poke2_player.equalsIgnoreCase("defesa")){
                    defesa_poke2 += 2;
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke2_player+" usou "+boost_poke2_player+"\ne reforcou "+qtd_boost_poke2+" de defesa!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
                else{
                    ataque_poke2 += 2;
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke2_player+" usou "+boost_poke2_player+"\ne reforcou "+qtd_boost_poke2+" de ataque!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
            }
            else if(poke_atual == 3){
                if(tipo_boost_poke3_player.equalsIgnoreCase("defesa")){
                    defesa_poke3 += 2;
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke3_player+" usou "+boost_poke3_player+"\ne reforcou "+qtd_boost_poke3+" de defesa!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
                else{
                    ataque_poke3 += 2;
                    text.setVisible(true);
                    ok_text.setVisible(true);
                    text.setText(poke3_player+" usou "+boost_poke3_player+"\ne reforcou "+qtd_boost_poke3+" de ataque!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
            }
            
        }
        
        if(poke_atual == 1){
            skill1.setText(skill1_poke1_player);
            skill2.setText(skill2_poke1_player);
            skill3.setText(skill3_poke1_player);
            skill4.setText(boost_poke1_player);
        }
        else if(poke_atual == 2){
            skill1.setText(skill1_poke2_player);
            skill2.setText(skill2_poke2_player);
            skill3.setText(skill3_poke2_player);
            skill4.setText(boost_poke2_player);
        }
        else if(poke_atual == 3){
            skill1.setText(skill1_poke3_player);
            skill2.setText(skill2_poke3_player);
            skill3.setText(skill3_poke3_player);
            skill4.setText(boost_poke3_player);
        }
        
        //--MORTE OPONENTE--//
        
        if(vida_poke_oponente <= 0){
            if(morte_oponente == 0){
                ImageIcon imgPoke_oponente = new ImageIcon("src/Pokemon_batalha/"+poke2_oponente+".png");
                imgPoke_oponente.setImage(imgPoke_oponente.getImage().getScaledInstance(120, 130, 100));
                poke_oponente.setBounds(360, 135, 120, 130);
                poke_oponente.setIcon(imgPoke_oponente);
                
                poke1_oponente = poke2_oponente;
                vida_poke_oponente = vida_poke2_oponente;
                tipo_poke_oponente = tipo_poke2_oponente;
                fraqueza_poke_oponente = fraqueza_poke2_oponente;
                //-- Skill 1 --//
                skill1_poke_oponente = skill1_poke2_oponente;
                tipo_skill1_poke_oponente = tipo_skill1_poke2_oponente;
                qtd_skill1_poke_oponente = qtd_skill1_poke2_oponente;
                elemento_skill1_poke_oponente = elemento_skill1_poke2_oponente;
                //-- Skill 2 --//
                skill2_poke_oponente = skill2_poke2_oponente;
                tipo_skill2_poke_oponente = tipo_skill2_poke2_oponente;
                qtd_skill2_poke_oponente = qtd_skill2_poke2_oponente;
                elemento_skill2_poke_oponente = elemento_skill2_poke2_oponente;
                //-- Skill 3 --//
                skill3_poke_oponente = skill3_poke2_oponente;
                tipo_skill3_poke_oponente = tipo_skill3_poke2_oponente;
                qtd_skill3_poke_oponente = qtd_skill3_poke2_oponente;
                elemento_skill3_poke_oponente = elemento_skill3_poke2_oponente;
                
                texto_vida_poke_oponente.setText(String.valueOf(vida_poke_oponente));
                morte_oponente += 1;
            }
            
            else if(morte_oponente == 1){
                ImageIcon imgPoke_oponente = new ImageIcon("src/Pokemon_batalha/"+poke3_oponente+".png");
                imgPoke_oponente.setImage(imgPoke_oponente.getImage().getScaledInstance(120, 130, 100));
                poke_oponente.setBounds(360, 135, 120, 130);
                poke_oponente.setIcon(imgPoke_oponente);
                
                poke1_oponente = poke3_oponente;
                vida_poke_oponente = vida_poke3_oponente;
                tipo_poke_oponente = tipo_poke3_oponente;
                fraqueza_poke_oponente = fraqueza_poke3_oponente;
                //-- Skill 1 --//
                skill1_poke_oponente = skill1_poke3_oponente;
                tipo_skill1_poke_oponente = tipo_skill1_poke3_oponente;
                qtd_skill1_poke_oponente = qtd_skill1_poke3_oponente;
                elemento_skill1_poke_oponente = elemento_skill1_poke3_oponente;
                //-- Skill 2 --//
                skill2_poke_oponente = skill2_poke3_oponente;
                tipo_skill2_poke_oponente = tipo_skill2_poke3_oponente;
                qtd_skill2_poke_oponente = qtd_skill2_poke3_oponente;
                elemento_skill2_poke_oponente = elemento_skill2_poke3_oponente;
                //-- Skill 3 --//
                skill3_poke_oponente = skill3_poke3_oponente;
                tipo_skill3_poke_oponente = tipo_skill3_poke3_oponente;
                qtd_skill3_poke_oponente = qtd_skill3_poke3_oponente;
                elemento_skill3_poke_oponente = elemento_skill3_poke3_oponente;
                
                texto_vida_poke_oponente.setText(String.valueOf(vida_poke_oponente));
                morte_oponente += 1;
            }
            
            else if(morte_oponente >= 2){
                try {
                    vitorias += 1;
                    Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemon","root","");

                    String sql = "UPDATE player SET vitorias = '"+vitorias+"' WHERE nick = '"+player+"'";
                    //String sql = "SELECT * FROM PLAYER WHERE nickname = ('"+buscar.getText()+"')";
                    PreparedStatement ps=conexao.prepareStatement(sql);
                    
                    ps.executeUpdate();
                    ps.close();
                    conexao.close();
            
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Deu erro na conexão. :(");
                }
                
                JOptionPane.showMessageDialog(null, "O TREINADOR RIVAL TEVE TODOS OS SEUS GAL... POKÉMONS DERROTADOS!");
                this.dispose();
                Frame frame = new Frame();
                frame.setVisible(true);
            }

        }
        
        //-- ATAQUE OPONENTE --//
        
        if(vez == false){
            
            if(ataque_do_oponente == 0){
                System.out.println("primeiro");
                ataque_do_oponente = 1;
                if(tipo_skill1_poke_oponente.equalsIgnoreCase("dano")){
                        if(poke_atual == 1){
                            vida_poke1_player -= qtd_skill1_poke_oponente;
                            vida_poke.setText(String.valueOf(vida_poke1_player));
                        }
                        else if(poke_atual == 2){
                            vida_poke2_player -= qtd_skill1_poke_oponente;
                            vida_poke.setText(String.valueOf(vida_poke2_player));
                        }
                        else if(poke_atual == 3){
                            vida_poke3_player -= qtd_skill1_poke_oponente;
                            vida_poke.setText(String.valueOf(vida_poke3_player));
                        }
                    text.setVisible(true);
                    ok_text2.setVisible(true);
                    text.setText(poke1_oponente+" usou "+skill1_poke_oponente+"\ne causou "+qtd_skill1_poke_oponente+" de dano!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                    }
                else{
                    vida_poke_oponente += qtd_skill1_poke_oponente;
                    text.setVisible(true);
                    ok_text2.setVisible(true);
                    text.setText(poke_oponente+" usou "+skill1_poke_oponente+"\ne recuperou "+qtd_skill1_poke_oponente+" de vida!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
            }
            else if(ataque_do_oponente == 1){
                ataque_do_oponente = 0;
                if(tipo_skill2_poke_oponente.equalsIgnoreCase("dano")){
                        if(poke_atual == 1){
                            vida_poke1_player -= qtd_skill2_poke_oponente;
                            vida_poke.setText(String.valueOf(vida_poke1_player));
                        }
                        else if(poke_atual == 2){
                            vida_poke2_player -= qtd_skill2_poke_oponente;
                            vida_poke.setText(String.valueOf(vida_poke2_player));
                        }
                        else if(poke_atual == 3){
                            vida_poke3_player -= qtd_skill2_poke_oponente;
                            vida_poke.setText(String.valueOf(vida_poke3_player));
                        }
                    text.setVisible(true);
                    ok_text2.setVisible(true);
                    text.setText(poke1_oponente+" usou "+skill2_poke_oponente+"\ne causou "+qtd_skill2_poke_oponente+" de dano!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                    }
                else{
                    vida_poke_oponente += qtd_skill2_poke_oponente;
                    text.setVisible(true);
                    ok_text2.setVisible(true);
                    text.setText(poke_oponente+" usou "+skill2_poke_oponente+"\ne recuperou "+qtd_skill2_poke_oponente+" de vida!");
                    skill1.setVisible(false);
                    skill2.setVisible(false);
                    skill3.setVisible(false);
                    skill4.setVisible(false);
                }
            }
            
            vez = true;
            
            if((vida_poke1_player <= 0)&&(poke1_vida == 1)){
                poke1.setVisible(false);
                poke1_vida = 0;
                if(vida_poke2_player > 0){
                    poke_atual = 2;
                    ImageIcon imgPoke = new ImageIcon("src/Pokemon_batalha/"+poke2_player+"_back.png");
                    imgPoke.setImage(imgPoke.getImage().getScaledInstance(280, 290, 100));
                    poke.setBounds(150, 110, 280, 290);
                    poke.setIcon(imgPoke);
                    cont_troca += 1;
                    morte_player += 1;
                    vida_poke.setText(String.valueOf(vida_poke3_player));
                }
                else if(vida_poke3_player > 0){
                    poke_atual = 3;
                    ImageIcon imgPoke = new ImageIcon("src/Pokemon_batalha/"+poke3_player+"_back.png");
                    imgPoke.setImage(imgPoke.getImage().getScaledInstance(280, 290, 100));
                    poke.setBounds(150, 110, 280, 290);
                    poke.setIcon(imgPoke);
                    cont_troca += 1;
                    morte_player += 1;
                    vida_poke.setText(String.valueOf(vida_poke3_player));
                }
                else{
                    try {
                    derrotas += 1;
                    Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemon","root","");
                    System.out.println(player);
                    System.out.println(derrotas);

                    String sql = "UPDATE player SET derrotas = '"+derrotas+"' WHERE nick = '"+player+"'";
                    //String sql = "SELECT * FROM PLAYER WHERE nickname = ('"+buscar.getText()+"')";
                    PreparedStatement ps=conexao.prepareStatement(sql);
                    
                    ps.executeUpdate();
                    ps.close();
                    conexao.close();
            
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Deu erro na conexão. :(");
                }
                    
                    JOptionPane.showMessageDialog(null, "VOCÊ TEVE TODOS OS SEUS GAL... POKÉMONS DERROTADOS!\n RETORNANDO AO MENU");
                    this.dispose();
                    Frame frame = new Frame();
                    frame.setVisible(true);
                }
        }
            
        if((vida_poke2_player <= 0)&&(poke2_vida == 1)){
            poke2.setVisible(false);
            poke2_vida = 0;
            if(vida_poke3_player > 0){
                poke_atual = 3;
                ImageIcon imgPoke = new ImageIcon("src/Pokemon_batalha/"+poke3_player+"_back.png");
                imgPoke.setImage(imgPoke.getImage().getScaledInstance(280, 290, 100));
                poke.setBounds(150, 110, 280, 290);
                poke.setIcon(imgPoke);
                cont_troca += 1;
                morte_player += 1;
                vida_poke.setText(String.valueOf(vida_poke3_player));
            }
            else if(vida_poke1_player > 0){
                poke_atual = 1;
                ImageIcon imgPoke = new ImageIcon("src/Pokemon_batalha/"+poke1_player+"_back.png");
                imgPoke.setImage(imgPoke.getImage().getScaledInstance(280, 290, 100));
                poke.setBounds(150, 110, 280, 290);
                poke.setIcon(imgPoke);
                cont_troca += 1;
                morte_player += 1;
                vida_poke.setText(String.valueOf(vida_poke3_player));
            }
            else{
                try {
                    derrotas += 1;
                    Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemon","root","");
                    System.out.println(player);
                    System.out.println(derrotas);

                    String sql = "UPDATE player SET derrotas = '"+derrotas+"' WHERE nick = '"+player+"'";
                    //String sql = "SELECT * FROM PLAYER WHERE nickname = ('"+buscar.getText()+"')";
                    PreparedStatement ps=conexao.prepareStatement(sql);
                    
                    ps.executeUpdate();
                    ps.close();
                    conexao.close();
            
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Deu erro na conexão. :(");
                }
                
                JOptionPane.showMessageDialog(null, "VOCÊ TEVE TODOS OS SEUS GAL... POKÉMONS DERROTADOS!\n RETORNANDO AO MENU");
                this.dispose();
                Frame frame = new Frame();
                frame.setVisible(true);
            }
        }
        
        if((vida_poke3_player <= 0)&&(poke3_vida == 1)){
            poke3.setVisible(false);
            poke3_vida = 0;
            if(vida_poke1_player > 0){
                poke_atual = 1;
                ImageIcon imgPoke = new ImageIcon("src/Pokemon_batalha/"+poke1_player+"_back.png");
                imgPoke.setImage(imgPoke.getImage().getScaledInstance(280, 290, 100));
                poke.setBounds(150, 110, 280, 290);
                poke.setIcon(imgPoke);
                cont_troca += 1;
                morte_player += 1;
                vida_poke.setText(String.valueOf(vida_poke3_player));
            }
            else if(vida_poke2_player > 0){
                poke_atual = 2;
                ImageIcon imgPoke = new ImageIcon("src/Pokemon_batalha/"+poke2_player+"_back.png");
                imgPoke.setImage(imgPoke.getImage().getScaledInstance(280, 290, 100));
                poke.setBounds(150, 110, 280, 290);
                poke.setIcon(imgPoke);
                cont_troca += 1;
                morte_player += 1;
                vida_poke.setText(String.valueOf(vida_poke3_player));
            }
            else{
                try {
                    derrotas += 1;
                    Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemon","root","");
                    System.out.println(player);
                    System.out.println(derrotas);

                    String sql = "UPDATE player SET derrotas = '"+derrotas+"' WHERE nick = '"+player+"'";
                    //String sql = "SELECT * FROM PLAYER WHERE nickname = ('"+buscar.getText()+"')";
                    PreparedStatement ps=conexao.prepareStatement(sql);
                    
                    ps.executeUpdate();
                    ps.close();
                    conexao.close();
            
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Deu erro na conexão. :(");
                }
                
                JOptionPane.showMessageDialog(null, "VOCÊ TEVE TODOS OS SEUS GAL... POKÉMONS DERROTADOS!\n RETORNANDO AO MENU");
                this.dispose();
                Frame frame = new Frame();
                frame.setVisible(true);
            }
        }
        }

    }
    
}