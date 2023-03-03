/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

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
public class EscolherPokemon extends JFrame implements ActionListener {
    
    JLabel titulo;
    JLabel titulo2;
    
    JTextField buscar;
    JButton bBuscar;
    JButton listar;
    JButton confirmar;
    JButton limpar;
    JButton gerar;
    JButton menu;
    
    JLabel imagem1;
    JLabel imagem2;
    JLabel imagem3;
    
    
    // -- VARIAVEIS
    
    String nome_player;
    String poke1;
    String poke2;
    String poke3;
    int cont = 0;
    int gerado = 0;
    
    Fila dados;
    
    //String url = "jdbc:mysql://localhost//pokemon/teste";
    //String user = "root";
    //String senha = "";
    
    public EscolherPokemon(Fila dados){
        
        this.dados = dados;
        
        Container fundo;
        fundo = this.getContentPane();
        fundo.setBackground(Color.darkGray);
        
        Jogadores temp=(Jogadores) dados.dequeue(0);
        nome_player = temp.getNome();
        
        titulo = new JLabel();
        titulo2 = new JLabel("Escolha seus pokémons:");
        buscar = new JTextField();
        bBuscar = new JButton("Buscar");
        listar = new JButton();
        confirmar = new JButton("Confirmar");
        limpar = new JButton("Limpar");
        gerar = new JButton("Gerar");
        menu = new JButton("Menu");
        
        imagem1 = new JLabel();
        imagem2 = new JLabel();
        imagem3 = new JLabel();
        
        ImageIcon img_listar = new ImageIcon("src/Imagem_Batalha/pokeball.png");
        img_listar.setImage(img_listar.getImage().getScaledInstance(45, 38, 100));
        listar.setBounds(730, 140, 45, 38);
        listar.setIcon(img_listar);
        
        
        ImageIcon img_title = new ImageIcon("src/Imagens/Pokemon_logo2.png");
        img_title.setImage(img_title.getImage().getScaledInstance(600, 180, 100));
        
        
        titulo.setBounds(75, -25, 600, 180);
        titulo.setIcon(img_title);
        
        titulo2.setBounds(90, 145, 300, 25);
        buscar.setBounds(390, 145, 160, 26);
        bBuscar.setBounds(565, 140, 115, 35);
        menu.setBounds(20, 445, 150, 60);
        limpar.setBounds(285, 445, 150, 60);
        gerar.setBounds(450, 445, 150, 60);
        confirmar.setBounds(615, 445, 160, 60);
        
        titulo2.setFont(new Font("Robotto", Font.ITALIC,24));
        titulo2.setForeground(Color.white);
        
        menu.setBackground(Color.red);
        menu.setFont(new Font("Robotto", Font.ITALIC,24));
        
        //limpar.setBackground(Color.red);
        limpar.setFont(new Font("Robotto", Font.ITALIC,24));
        
        //gerar.setBackground(Color.red);
        gerar.setFont(new Font("Robotto", Font.ITALIC,24));
        
        confirmar.setBackground(Color.GREEN);
        confirmar.setFont(new Font("Robotto", Font.ITALIC,24));
        
        
        this.add(titulo);
        this.add(titulo2);
        this.add(buscar);
        this.add(bBuscar);
        this.add(listar);
        this.add(menu);
        this.add(limpar);
        this.add(gerar);
        this.add(confirmar);
        this.add(imagem1);
        this.add(imagem2);
        this.add(imagem3);
        
        menu.addActionListener(this);
        limpar.addActionListener(this);
        bBuscar.addActionListener(this);
        confirmar.addActionListener(this);
        gerar.addActionListener(this);
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
        
        if (e.getSource().equals(limpar)){
            if(gerado == 0 && cont == 0){
                JOptionPane.showMessageDialog(null, "Já está limpo!");
            }
            else if(cont > 0){
                buscar.setText("");
                imagem1.setIcon(null);
                imagem2.setIcon(null);
                imagem3.setIcon(null);
                cont = 0;
                gerado = 0;
            }
            else{
                Jogadores temp=(Jogadores) dados.dequeue(0);
                buscar.setText("");
                imagem1.setIcon(null);
                imagem2.setIcon(null);
                imagem3.setIcon(null);
                cont = 0;
                gerado = 0;
            }
        }
        
        if(e.getSource().equals(listar)){
            JOptionPane.showMessageDialog(null, "------ LISTA DE POKÉMONS DISPONIVEIS ------\n\n1 - Charizard\n2 - Blastoise\n"
                    + "3 - Venusaur\n4 - Dragonite\n5 - Flareon\n6 - Snorlax\n7 - Onix\n8 - Chansey\n10 - Pikachu");
        }
        
        if (e.getSource().equals(bBuscar)){
            if (cont == 0){
            ImageIcon img_1 = new ImageIcon("src/Imagens_pokemons/"+buscar.getText()+".png");
            img_1.setImage(img_1.getImage().getScaledInstance(230, 200, 100));
            imagem1.setBounds(20, 165, 250, 280);
            imagem1.setIcon(img_1);
            this.add(imagem1);
            poke1 = buscar.getText();
            cont += 1;
            }
            
            else if (cont == 1){
                ImageIcon img_2 = new ImageIcon("src/Imagens_pokemons/"+buscar.getText()+".png");
                img_2.setImage(img_2.getImage().getScaledInstance(230, 200, 100));
                imagem2.setBounds(280, 165, 250, 280);
                imagem2.setIcon(img_2);
                this.add(imagem2);
                poke2 = buscar.getText();
                cont += 1;
            }
            else if (cont == 2){
                ImageIcon img_3 = new ImageIcon("src/Imagens_pokemons/"+buscar.getText()+".png");
                img_3.setImage(img_3.getImage().getScaledInstance(230, 200, 100));
                imagem3.setBounds(530, 165, 250, 280);
                imagem3.setIcon(img_3);
                this.add(imagem3);
                poke3 = buscar.getText();
                cont += 1;
            }
        }
        
        if (e.getSource().equals(gerar)){
            if (gerado != 1){
                Jogadores jogadores = new Jogadores();

                jogadores.setNome(nome_player);
                jogadores.setPoke1("Charizard");
                jogadores.setPoke2("Blastoise");
                jogadores.setPoke3("Venusaur");
                jogadores.setNome_oponente("dadwa");
                jogadores.setPoke1_oponente("");
                jogadores.setPoke2_oponente("");
                jogadores.setPoke3_oponente("");
                dados.queue(jogadores);

                buscar.setText("");
                imagem1.setIcon(null);
                imagem2.setIcon(null);
                imagem3.setIcon(null);
                cont = 0;

                ImageIcon img_1 = new ImageIcon("src/Imagens_pokemons/Charizard.png");
                img_1.setImage(img_1.getImage().getScaledInstance(230, 200, 100));
                imagem1.setBounds(20, 165, 250, 280);
                imagem1.setIcon(img_1);
                this.add(imagem1);
                poke1 = buscar.getText();
                cont += 1;

                ImageIcon img_2 = new ImageIcon("src/Imagens_pokemons/Blastoise.png");
                img_2.setImage(img_2.getImage().getScaledInstance(230, 200, 100));
                imagem2.setBounds(280, 165, 250, 280);
                imagem2.setIcon(img_2);
                this.add(imagem2);
                poke2 = buscar.getText();
                cont += 1;

                ImageIcon img_3 = new ImageIcon("src/Imagens_pokemons/Venusaur.png");
                img_3.setImage(img_3.getImage().getScaledInstance(230, 200, 100));
                imagem3.setBounds(530, 165, 250, 280);
                imagem3.setIcon(img_3);
                this.add(imagem3);
                poke3 = buscar.getText();
                cont += 1;
                gerado = 1;
            }
            else{
                JOptionPane.showMessageDialog(null, "Você já gerou seus pokémons");
            }
        }
        
        if  (e.getSource().equals(confirmar)){
            if (cont < 3){
                JOptionPane.showMessageDialog(null, "Você confirmou "+cont+" Pokémons. Você precisa de uma equipe de 3 pokémons, por favor, tente novamente!");
            }
            else if(gerado == 1){
                buscar.setText("");
                imagem1.setIcon(null);
                imagem2.setIcon(null);
                imagem3.setIcon(null);
                cont = 0;
                EscolherOponente escolherOponente = new EscolherOponente(dados);
                escolherOponente.setVisible(true);
                this.setVisible(false);
            }
            else if(gerado == 0){
                Jogadores jogadores = new Jogadores();
            
                jogadores.setNome(nome_player);
                jogadores.setPoke1(poke1);
                jogadores.setPoke2(poke2);
                jogadores.setPoke3(poke3);
                jogadores.setNome_oponente("dadwa");
                jogadores.setPoke1_oponente("");
                jogadores.setPoke2_oponente("");
                jogadores.setPoke3_oponente("");
                dados.queue(jogadores);
                
                buscar.setText("");
                imagem1.setIcon(null);
                imagem2.setIcon(null);
                imagem3.setIcon(null);
                cont = 0;
                EscolherOponente escolherOponente = new EscolherOponente(dados);
                escolherOponente.setVisible(true);
                this.setVisible(false);
            }
        }

    }
    
}