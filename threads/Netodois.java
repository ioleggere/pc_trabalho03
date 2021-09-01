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
Nome.....: Netodois.java
Funcao...: Classe Thread representando o segundo neto, em uma arvore genealogica, usando sleep para representar os anos passados.
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
public class Netodois extends Thread {

  public void run(){
    
    try {

      System.out.println("Nasce o Segundo neto (Segundo filho)");

      Thread.sleep(33000); // Passam 33 anos (segundos) e o segundo neto morre.

      icon = new ImageIcon(getClass().getResource("/img/neto dois morre.png")); // Trocando ImageIcon da classe do pai.
   
      labelgeral.setIcon(icon); // Setando a icon na label.

      j.add(labelgeral); // Adicionando a label na janela.

      j.repaint(); // "Atualizando" a janela.

      System.out.println("Segundo neto (Segundo filho) morreu");

    } catch (InterruptedException e) {
    } // Fim do try catch.

  } //Fim do metodo run.
   
} //Fim da classe Netodois.
