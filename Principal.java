import threads.Pai;
/*=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Autor....: Euler da Silva Lima
Matrícula: 201911534
Inicio...: 26 de marco de 2021
Alteracao: 29 de marco de 2021
Nome.....: Principal.java
Funcao...: Classe principal, executando o pai que executa o restante dos processos.
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
public class Principal {
  public static void main(String[] args) {
  
  Pai pai = new Pai();
  pai.start();    

  }
}
