public class Personne {
    private String nom;
    private int age;
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    public void afficherInfos() {
        System.out.println("Nom: " + nom);
        System.out.println("Âge: " + age);
    }
    public static void main(String[] args) {
        String nomPersonne = args[0];
        int agePersonne = Integer.parseInt(args[1]);
        Personne personne = new Personne(nomPersonne , agePersonne);
        personne.afficherInfos();
    }
}