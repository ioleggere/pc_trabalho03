package threads;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Autor....: Euler da Silva Lima
Matrícula: 201911534
Inicio...: 26 de marco de 2021
Alteracao: 29 de marco de 2021
Nome.....: Pai.java
Funcao...: Classe Thread representando o pai, em uma arvore genealogica, usando sleep para representar os anos passados, e start para iniciar os descendentes.
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
public class Pai extends Thread { 

    public static JFrame j = new JFrame(); // Aqui criamos uma janela JFrame, nela que sera mostrada as imagens.

    Filhoum primeirofilho = new Filhoum(); // Objeto da Thread representando o primeiro filho.

    Filhodois segundofilho = new Filhodois(); // Objeto da Thread representando o segundo filho.

    Filhotres terceirofilho = new Filhotres(); // Objeto da Thread representando o terceiro filho.

    

    public static ImageIcon icon = new ImageIcon(); // Variavel do tipo ImageIcon, onde as imagens vao ser colocadas.

    public static JLabel labelgeral = new JLabel(); // Variavel do tipo JLabel, onde as ImageIcons serao inseridas.

  public void run(){ 
   
  try {

    j.setBackground(Color.WHITE); // Setando a cor de fundo da janela de branco.
    
    j.setSize(330,700); // Setando o tamanho da janela.

    j.setTitle("Arvore Genealogica Thread"); // Setando o titulo.

    j.setVisible(true); // Definindo a janela como visivel.

    j.setResizable(false); // Nao permitir que o usuario redefina o tamanho da janela.
    
    j.add(labelgeral); // Inserindo a label na janela.

    j.repaint(); // "Reiniciando" a janela.

    System.out.println("Nasce o pai");

    icon = new ImageIcon(getClass().getResource("/img/Pai nasceu.png")); // Inserindo uma nova imagem no objeto icon.

    labelgeral.setIcon(icon); // Inserindo o icon na label.
    for(int i = 1; i<11; i++){
      Thread.sleep(1000); // Processo explicado na linha 51.
      System.out.println(i);
    }
    

    icon = new ImageIcon(getClass().getResource("/img/Pai 10 anos.png")); // Processo explicado na linha 47.

    labelgeral.setIcon(icon); // Processo explicado na linha 49.

    j.repaint(); // Processo explicado na linha 43.

    System.out.println("Pai tem 10");
    for(int i = 11; i<23; i++){
      Thread.sleep(1000); // Processo explicado na linha 51.
      System.out.println(i);
    }
    
    icon = new ImageIcon(getClass().getResource("/img/Pai 22 anos.png")); // Processo explicado na linha 47.

    labelgeral.setIcon(icon); // Processo explicado na linha 49.

    j.repaint(); // Processo explicado na linha 43.

    System.out.println("Pai tem 22");

    primeirofilho.start(); // Iniciando a thread de um dos descendentes, no caso, o primeiro filho.
    for(int i = 23; i<26; i++){
      Thread.sleep(1000); // Processo explicado na linha 51.
      System.out.println(i);
    }

    icon = new ImageIcon(getClass().getResource("/img/Pai 25 anos.png")); // Processo explicado na linha 47.

    labelgeral.setIcon(icon); // Processo explicado na linha 49.

    j.repaint(); // Processo explicado na linha 43.
 
    System.out.println("Pai tem 25");

    segundofilho.start(); // Processo explicado na linha 71.
    for(int i = 26; i<33; i++){
      Thread.sleep(1000); // Processo explicado na linha 51.
      System.out.println(i);
    }

    icon = new ImageIcon(getClass().getResource("/img/Pai 32 anos.png")); // Processo explicado na linha 47.

    labelgeral.setIcon(icon); // Processo explicado na linha 49.

    j.repaint(); // Processo explicado na linha 43.

    System.out.println("Pai tem 32");

    terceirofilho.start(); // Processo explicado na linha 71.
    for(int i = 33; i<91; i++){
      Thread.sleep(1000); // Processo explicado na linha 51.
      System.out.println(i);
    }
    
    icon = new ImageIcon(getClass().getResource("/img/pai morre.png")); // Processo explicado na linha 47.

    labelgeral.setIcon(icon); // Processo explicado na linha 49.

    j.repaint(); // Processo explicado na linha 43.

    System.out.println("Pai tem 90");
    System.out.println("Pai morreu");

    } catch (InterruptedException e) {
    } // Fim do try catch.
    
  } //Fim do run.

} // Fim da classe Pai.