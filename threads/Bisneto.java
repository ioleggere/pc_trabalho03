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
Nome.....: Bisneto.java
Funcao...: Classe Thread representando o bisneto, em uma arvore genealogica, usando sleep para representar os anos passados.
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
public class Bisneto extends Thread {

  public void run(){ 

    try { 

      System.out.println("Nasce o bisneto (Primeiro filho)");
      icon = new ImageIcon(getClass().getResource("/img/bisneto nasce.png")); // Trocando ImageIcon da classe do pai.

      labelgeral.setIcon(icon); // Setando a icon na label.

      j.add(labelgeral); // Adicionando a label na janela.
      
      j.repaint();
      
      Thread.sleep(12000); // Passam 12 anos (segundos) e o bisneto morre.

      icon = new ImageIcon(getClass().getResource("/img/bisneto morre.png")); // Trocando ImageIcon da classe do pai.

      labelgeral.setIcon(icon); // Setando a icon na label.

      j.add(labelgeral); // Adicionando a label na janela.

      j.repaint(); // "Atualizando" a janela.
      
      System.out.println("Bisneto (Primeiro filho) morreu");

    } catch (InterruptedException e) {
    } // Fim do try catch.

  } //Fim do metodo run.

} //Fim da classe Bisneto.
