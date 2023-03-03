/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;


import javax.swing.JOptionPane;
import JavaBeans.Fila;
import JavaBeans.Jogadores;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import static java.awt.Transparency.TRANSLUCENT;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author f
 */
public class EscolherOponente extends JFrame implements ActionListener{
    
    JLabel titulo;
    JLabel titulo2;
    
    JButton confirmar;
    JButton voltar;
    JButton limpar;
    
    JButton bMestre1;
    JButton bMestre2;
    JButton bMestre3;
    JButton bMestre4;
    
    JLabel mestre_imagem;
    
    int cont = 0;
    
    Fila dados;
    
    public EscolherOponente(Fila dados){
        
        this.dados = dados;
        
        Container fundo;
        fundo = this.getContentPane();
        fundo.setBackground(Color.darkGray);
        
        titulo = new JLabel();
        titulo2 = new JLabel("Selecione seu adversário:");
        confirmar = new JButton("Confirmar");
        voltar = new JButton("Voltar");
        limpar = new JButton("Limpar");
        bMestre1 = new JButton();
        bMestre2 = new JButton();
        bMestre3 = new JButton();
        bMestre4 = new JButton();
        mestre_imagem = new JLabel();
        
        ImageIcon mestre_1 = new ImageIcon("src/Imagens/Ash.png");
        mestre_1.setImage(mestre_1.getImage().getScaledInstance(200, 200, 100));
        bMestre1.setBounds(30, 180, 160, 240);
        bMestre1.setIcon(mestre_1);
        bMestre1.setBackground(Color.white);
        
        ImageIcon mestre_2 = new ImageIcon("src/Imagens/Brok.png");
        mestre_2.setImage(mestre_2.getImage().getScaledInstance(230, 200, 100));
        bMestre2.setBounds(210, 180, 160, 240);
        bMestre2.setIcon(mestre_2);
        bMestre2.setBackground(Color.white);
        
        ImageIcon mestre_3 = new ImageIcon("src/Imagens/Gary.jpeg");
        mestre_3.setImage(mestre_3.getImage().getScaledInstance(230, 200, 100));
        bMestre3.setBounds(400, 180, 160, 240);
        bMestre3.setIcon(mestre_3);
        bMestre3.setBackground(Color.white);
        
        ImageIcon mestre_4 = new ImageIcon("src/Imagens/Team_rocket.png");
        mestre_4.setImage(mestre_4.getImage().getScaledInstance(230, 200, 100));
        bMestre4.setBounds(590, 180, 160, 240);
        bMestre4.setIcon(mestre_4);
        bMestre4.setBackground(Color.white);
        
        
        ImageIcon img_title = new ImageIcon("src/Imagens/Pokemon_logo2.png");
        img_title.setImage(img_title.getImage().getScaledInstance(600, 180, 100));
        
        
        titulo.setBounds(75, -30, 600, 180);
        titulo.setIcon(img_title);
        
        
        titulo2.setBounds(220, 130, 350, 25);
        voltar.setBounds(20, 445, 150, 60);
        limpar.setBounds(305, 445, 150, 60);
        confirmar.setBounds(615, 445, 160, 60);
        
        
        titulo2.setFont(new Font("Robotto", Font.ITALIC,26));
        titulo2.setForeground(Color.white);
        
        voltar.setBackground(Color.red);
        voltar.setFont(new Font("Robotto", Font.ITALIC,24));
        
        //limpar.setBackground(Color.red);
        limpar.setFont(new Font("Robotto", Font.ITALIC,24));
        
        confirmar.setBackground(Color.GREEN);
        confirmar.setFont(new Font("Robotto", Font.ITALIC,24));
        
        voltar.addActionListener(this);
        limpar.addActionListener(this);
        bMestre1.addActionListener(this);
        bMestre2.addActionListener(this);
        bMestre3.addActionListener(this);
        bMestre4.addActionListener(this);
        confirmar.addActionListener(this);
        
        
        this.add(titulo);
        this.add(titulo2);
        this.add(voltar);
        this.add(limpar);
        this.add(confirmar);
        this.add(bMestre1);
        this.add(bMestre2);
        this.add(bMestre3);
        this.add(bMestre4);
        this.add(mestre_imagem);
        
        
        this.setSize(790, 550);
        this.setTitle("Escolha de time");
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(false);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(bMestre1)){
            Jogadores oponente = new Jogadores();
            
            oponente.setNome_oponente("Ash");
            oponente.setPoke1_oponente("Charizard");
            oponente.setPoke2_oponente("Pikachu");
            oponente.setPoke3_oponente("Blastoise");
            dados.queue(oponente);
            titulo2.setText("Confirme seu oponente:");
            bMestre1.setVisible(false);
            bMestre2.setVisible(false);
            bMestre3.setVisible(false);
            bMestre4.setVisible(false);
            ImageIcon imagem = new ImageIcon("src/Imagens/Ash.png");
            imagem.setImage(imagem.getImage().getScaledInstance(250, 210, 100));
            mestre_imagem.setBounds(265, 180, 250, 250);
            mestre_imagem.setIcon(imagem);
            this.add(mestre_imagem);
            cont = 1;
        }
        else if(e.getSource().equals(bMestre2)){
            Jogadores oponente = new Jogadores();
            
            oponente.setNome_oponente("Brok");
            oponente.setPoke1_oponente("Onix");
            oponente.setPoke2_oponente("Venusaur");
            oponente.setPoke3_oponente("Chansey");
            dados.queue(oponente);
            titulo2.setText("Confirme seu oponente:");
            bMestre1.setVisible(false);
            bMestre2.setVisible(false);
            bMestre3.setVisible(false);
            bMestre4.setVisible(false);
            ImageIcon imagem = new ImageIcon("src/Imagens/Brok.png");
            imagem.setImage(imagem.getImage().getScaledInstance(250, 210, 100));
            mestre_imagem.setBounds(265, 180, 250, 250);
            mestre_imagem.setIcon(imagem);
            this.add(mestre_imagem);
            cont = 1;
        }
        else if(e.getSource().equals(bMestre3)){
            Jogadores oponente = new Jogadores();
            
            oponente.setNome_oponente("Gary");
            oponente.setPoke1_oponente("Flareon");
            oponente.setPoke2_oponente("Dragonite");
            oponente.setPoke3_oponente("Snorlax");
            dados.queue(oponente);
            titulo2.setText("Confirme seu oponente:");
            bMestre1.setVisible(false);
            bMestre2.setVisible(false);
            bMestre3.setVisible(false);
            bMestre4.setVisible(false);
            ImageIcon imagem = new ImageIcon("src/Imagens/Garyy.png");
            imagem.setImage(imagem.getImage().getScaledInstance(250, 210, 100));
            mestre_imagem.setBounds(265, 180, 250, 250);
            mestre_imagem.setIcon(imagem);
            this.add(mestre_imagem);
            cont = 1;
        }
        else if(e.getSource().equals(bMestre4)){
            Jogadores jogadores = new Jogadores();
            
            jogadores.setNome_oponente("Rocket");
            jogadores.setPoke1_oponente("Snorlax");
            jogadores.setPoke2_oponente("Gengar");
            jogadores.setPoke3_oponente("Pikachu");
            dados.queue(jogadores);
            titulo2.setText("Confirme seu oponente:");
            bMestre1.setVisible(false);
            bMestre2.setVisible(false);
            bMestre3.setVisible(false);
            bMestre4.setVisible(false);
            ImageIcon imagem = new ImageIcon("src/Imagens/Team_rocket.png");
            imagem.setImage(imagem.getImage().getScaledInstance(250, 210, 100));
            mestre_imagem.setBounds(265, 180, 250, 250);
            mestre_imagem.setIcon(imagem);
            this.add(mestre_imagem);
            cont = 1;
        }
        if(e.getSource().equals(limpar)){
            if(cont != 0){
                Jogadores temp=(Jogadores) dados.dequeue(1);
            cont = 0;
            bMestre1.setVisible(true);
            bMestre2.setVisible(true);
            bMestre3.setVisible(true);
            bMestre4.setVisible(true);
            mestre_imagem.setIcon(null);
            titulo2.setText("Selecione seu adversário:");
            }
            else{
                JOptionPane.showMessageDialog(null, "Já está limpo!");
            }
        }
        if(e.getSource().equals(voltar)){
            Jogadores temp=(Jogadores) dados.dequeue(0);
            EscolherPokemon escolherPokemon = new EscolherPokemon(dados);
            this.dispose();
            escolherPokemon.setVisible(true);
        }
        if  (e.getSource().equals(confirmar)){
            if (cont == 0){
                JOptionPane.showMessageDialog(null, "Você não escolheu nenhum adversário, por favor selecione um oponente digno!");
            }
            else{
                cont = 0;
                Batalha batalha = new Batalha(dados);
                batalha.setVisible(true);
                this.setVisible(false);
            }
        }

    }

}
