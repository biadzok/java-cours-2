package etudiant;

class Etudiant {
  private String nom;

  public Etudiant(String nom) {
    this.nom = nom;
  }

  public void travailler() {
    System.out.println(this.nom + " se met au travail !");
  }

  public void seReposer() {
    System.out.println(this.nom + " se repose.");
  }
}

class TestEtudiant {
  public static void main(String[] args) {
    Etudiant testetudiant = new Etudiant("jeanmichel");
    testetudiant.travailler();
    testetudiant.seReposer();
  }
}