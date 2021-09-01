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
Nome.....: Filhoum.java
Funcao...: Classe Thread representando o primeiro filho, em uma arvore genealogica, usando sleep para representar os anos passados.
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
public class Filhoum extends Thread { 
  Netoum primeironeto = new Netoum(); // Objeto da Thread representando o primeiro neto.


  public void run(){
    
    try {
            
      System.out.println("Nasce o Primeiro Filho"); 

      Thread.sleep(16000); // Passam 16 anos (segundos) e o primeiro neto nasce.

      icon = new ImageIcon(getClass().getResource("/img/primeiro neto nasce.png")); // Trocando ImageIcon da classe do pai.
   
      labelgeral.setIcon(icon); // Setando a icon na label.

      j.add(labelgeral); // Adicionando a label na janela.

      j.repaint(); // "Atualizando" a janela. 

      primeironeto.start();

      Thread.sleep(45000); // Passam 61 anos (segundos) e o primeiro filho morre.

      icon = new ImageIcon(getClass().getResource("/img/filho um morre.png")); // Trocando ImageIcon da classe do pai.
   
      labelgeral.setIcon(icon); // Setando a icon na label.

      j.add(labelgeral); // Adicionando a label na janela.

      j.repaint(); // "Atualizando" a janela.
      
      System.out.println("Primeiro Filho Morreu");

    } catch (InterruptedException e) {
    } // Fim do try catch.

  }//Fim do metodo run.

} //Fim da classe Filhoum.
