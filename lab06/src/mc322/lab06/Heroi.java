package mc322.lab06;

public class Heroi extends Componente {
  public Heroi(int lin, int col) {
    super(lin, col, 'P', 2, true);
  }

  public void move(int lin, int col) {
    super.lin = lin;
    super.col = col;
  }

  public void equipaFlecha() {

  }

  public void disparaFlecha() {

  }

  public void capturaOuro() {
    this.cv.removeComponenteDeMaiorPrioridadeDaSala(this.lin, this.col);
  }

  public void saiDaCaverna() {

  }
}
