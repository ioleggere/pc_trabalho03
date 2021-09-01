package threads;
import javax.swing.ImageIcon;
import static threads.Pai.j;
import static threads.Pai.icon;
import static threads.Pai.labelgeral;
/*=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Autor....: Euler da Silva Lima
Matrícula: 201911534
Inicio...: 26 de marco de 2021
Alteracao: 29 de marco de 2021
Nome.....: Filhotres.java
Funcao...: Classe Thread representando o terceiro filho, em uma arvore genealogica, usando sleep para representar os anos passados.
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
public class Filhotres extends Thread { 

  public void run(){ 
   
    try { 

      System.out.println("Nasce o Terceiro Filho");

      Thread.sleep(55000); // Passam 55 anos (segundos) e o terceiro filho morre.

      icon = new ImageIcon(getClass().getResource("/img/terceiro filho morre.png")); // Trocando ImageIcon da classe do pai.

      labelgeral.setIcon(icon); // Setando a icon na label.

      j.add(labelgeral); // Adicionando a label na janela.

      j.repaint(); // "Atualizando" a janela.

      System.out.println("Terceiro Filho Morreu");

    } catch (InterruptedException e) {
    } // Fim do try catch.

  } //Fim do metodo run.

} //Fim da classe Filhotres.
