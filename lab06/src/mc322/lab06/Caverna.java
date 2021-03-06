package mc322.lab06;

public class Caverna {
  public static final int NLIN = 4;
  public static final int NCOL = 4;
  public static final char[] numeracao = { '1', '2', '3', '4' };
  public Sala[][] salas;

  public Caverna() {
    salas = new Sala[NLIN][NCOL];
    for (int i = 0; i < NLIN; i++) {
      for (int j = 0; j < NCOL; j++) {
        salas[i][j] = new Sala(i, j);
      }
    }
  }

  public String exibe() {
    Componente c;
    for (int i = 0; i < NLIN; i++) {
      // Imprime numeros das linhas da caverna
      System.out.print(numeracao[i]);
      // Imprime caverna
      for (int j = 0; j < NCOL; j++) {
        if (salas[i][j].visitada == true) {
          c = salas[i][j].obtemComponentePorOrdemDePrioridade();
          if (c == null) {
            System.out.print(" " + '#');
          } else {
            System.out.print(" " + c.tipo);
          }
        } else {
          System.out.print(" " + '-');
        }
      }
      System.out.println();
    }
    System.out.print(" ");
    // Imprime numero das colunas da caverna
    for (int i = 0; i < NCOL; i++) {
      System.out.print(" " + numeracao[i]);
    }
    System.out.println();
    System.out.println();

    return "";
  }

  public void colocaNaSala(Componente c) {
    salas[c.lin - 1][c.col - 1].colocaComponente(c);
  }

  public void removeDaSala(Componente c) {
    salas[c.lin - 1][c.col - 1].removeComponente(c);
  }

  public boolean removeDaSalaComponenteDoTipo(int lin, int col, char tipo) {
    Componente c = this.salas[lin - 1][col - 1].obtemComponenteDoTipo(tipo);
    if (c != null) {
      removeDaSala(c);
      return true;
    }
    return false;
  }
}
