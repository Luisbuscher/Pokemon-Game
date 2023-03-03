/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import JavaBeans.Fila;
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author alunos
 */
public class Frame extends JFrame implements ActionListener{
    
    JLabel titulo;
        
    JButton bJogar;
    JButton bSair;

    JLabel imagem;
    JLabel imagem2;
    
    Fila dados;
    
    public Frame(){
        
        dados = new Fila();
        
        Container fundo;
        fundo = this.getContentPane();
        fundo.setBackground(Color.darkGray);
        
        titulo = new JLabel();
        bJogar = new JButton("Jogar");
        bSair = new JButton("Sair");
        imagem = new JLabel();
        imagem2 = new JLabel();
        
        ImageIcon img_title = new ImageIcon("src/Imagens/Poke_logouu.png");
        img_title.setImage(img_title.getImage().getScaledInstance(600, 180, 100));
        
        ImageIcon img_2 = new ImageIcon("src/Imagens/Charizard_3.png");
        img_2.setImage(img_2.getImage().getScaledInstance(300, 380, 100));
        
        ImageIcon img = new ImageIcon("src/Imagens/Dragonite.png");
        img.setImage(img.getImage().getScaledInstance(200, 380, 100));
        
        
        titulo.setBounds(75, 0, 600, 180);
        titulo.setIcon(img_title);
        
        imagem.setBounds(550, 92, 200, 380);
        imagem.setIcon(img);
        
        imagem2.setBounds(20, 85, 300, 380);
        imagem2.setIcon(img_2);
        
        bJogar.setBounds(320, 220, 180, 50);
        bSair.setBounds(320, 300, 180, 50);
        
        
        bJogar.setBackground(Color.GREEN);
        bJogar.setFont(new Font("Robotto", Font.ITALIC,24));
        
        
        bSair.setBackground(Color.CYAN);
        bSair.setFont(new Font("Robotto", Font.ITALIC,24));
        
        this.add(imagem);
        this.add(imagem2);
        this.add(titulo);
        this.add(bJogar);
        this.add(bSair);
        
        bSair.addActionListener(this);
        bJogar.addActionListener(this);
        
        
        this.setSize(790, 550);
        this.setTitle("Menu Pokemón");
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(bSair)){
            System.exit(0);
        }
        
        if(e.getSource().equals(bJogar)){
            /*EscolherPokemon escolher = new EscolherPokemon(dados);
            escolher.setVisible(true);
            this.setVisible(false);*/
            
            Player player = new Player(dados);
            player.setVisible(true);
            this.setVisible(false);
        }
        
    }
    
}
