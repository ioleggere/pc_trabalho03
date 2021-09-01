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
Nome.....: Filhodois.java
Funcao...: Classe Thread representando o segundo filho, em uma arvore genealogica, usando sleep para representar os anos passados.
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
public class Filhodois extends Thread { 
  Netodois segundoneto = new Netodois(); // Objeto da Thread representando o segundo neto.
  public void run(){ 
    try {

      System.out.println("Nasce o Segundo Filho");

      Thread.sleep(20000); // Passam 20 anos (segundos) e o segundo neto nasce.

      icon = new ImageIcon(getClass().getResource("/img/segundo neto nasce.png")); // Trocando ImageIcon da classe do pai.
   
      labelgeral.setIcon(icon); // Setando a icon na label.

      j.add(labelgeral); // Adicionando a label na janela.

      j.repaint(); // "Atualizando" a janela.

      segundoneto.start();
      
      Thread.sleep(35000); // Passam 55 anos (segundos) e o segundo filho morre.

      icon = new ImageIcon(getClass().getResource("/img/neto dois morre.png")); // Trocando ImageIcon da classe do pai.
   
      labelgeral.setIcon(icon); // Setando a icon na label.

      j.add(labelgeral); // Adicionando a label na janela.

      j.repaint(); // "Atualizando" a janela.

      System.out.println("Segundo Filho Morreu");

    } catch (InterruptedException e) {
    } // Fim do try catch.

  } //Fim do metodo run.

} //Fim da classe Filhodois.
