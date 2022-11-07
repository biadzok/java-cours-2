package segment;

public class Segment {
  private int extr1;
  private int extr2;

  public Segment(int extr1, int extr2) {
    this.extr1 = extr1;
    this.extr2 = extr2;
    ordonne();
  }

  public void setExtr1(int extr1) {
    this.extr1 = extr1;
    ordonne();
  }

  public void setExtr2(int extr2) {
    this.extr2 = extr2;
    ordonne();
  }

  public int getExtr1() {
    return extr1;
  }

  public int getExtr2() {
    return extr2;
  }

  private void ordonne() {
    if (extr1 > extr2) {
      int temp = extr1;
      extr1 = extr2;
      extr2 = temp;
    }
  }

  public int longueur() {
    return extr2 - extr1;
    }

  public boolean appartient(int x) {
    boolean res = false;
    if (x <= extr2 && x >= extr1)
      res = true;
    return res;
    }

  public String toString() {
    String res = "";
    for(int i = 0; i < longueur(); i++) {
      res = "_" + res;
    }
    return res;
  }
}