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
Nome.....: Netoum.java
Funcao...: Classe Thread representando o primeiro neto, em uma arvore genealogica, usando sleep para representar os anos passados.
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
public class Netoum extends Thread {

  Bisneto bisneto = new Bisneto(); // Objeto da Thread representando o bisneto.

  public void run(){
    
    try {

      System.out.println("Nasce o Primeiro neto (primeiro filho)");

      Thread.sleep(30000); // Passam 30 anos (segundos) e o bisneto nasce.

      bisneto.start();

      Thread.sleep(5000); // Passam 35 anos (segundos) e o primeiro neto morre.

      icon = new ImageIcon(getClass().getResource("/img/neto um morre.png")); // Trocando ImageIcon da classe do pai.

      labelgeral.setIcon(icon); // Setando a icon na label.

      j.add(labelgeral); // Adicionando a label na janela.

      j.repaint(); // "Atualizando" a janela.

      System.out.println("Primeiro neto (Primeiro filho) Morreu");

    } catch (InterruptedException e) {
    } // Fim do try catch.

  } //Fim do metodo run.

} //Fim da classe Netoum.
