import segment.Segment;

class Main {
  public static void main(String[] args) {
    int x = ackerman(3, 10);
    System.out.println(x);
  }
  public static int ackerman(int x, int y) {
    int res = 0;
    if (x == 0)
      res = y + 1;
    else {
      if (y == 0)
        res = ackerman(x - 1, 1);
      else
        res = ackerman(x - 1, ackerman(x, y - 1));
    }
    return res;
  }
}


class Chien {
  public String race;
  public int age;
  public String couleur;

  public Chien(String race, int age, String couleur) {
    this.race = race;
    this.age = age;
    this.couleur = couleur;
  }

  public void aboyer() {
    System.out.println("je suis un chien de race " + race);
  }

  public void dormir() {
    System.out.println("zzzzzzzzzzzzzz");
  }
}