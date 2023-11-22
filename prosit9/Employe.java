public class Employe {
    private int identifiant;
    private String nom;
    private String prenom;
    private String nomDeDepartement;
    private int grade;
    public Employe(){}
    public Employe(int identifiant,String nom,String prenom,String nomDeDepartement,int grade){
        this.grade=grade;
        this.identifiant=identifiant;
        this.nom=nom;
        this.prenom=prenom;
        this.nomDeDepartement=nomDeDepartement;
    }
    public int getIdentifiant(){
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getGrade() {
        return grade;
    }

    public String getNomDeDepartement() {
        return nomDeDepartement;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNomDeDepartement(String nomDeDepartement) {
        this.nomDeDepartement = nomDeDepartement;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    @Override
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        if (obj==null || getClass() != obj.getClass()){
            return false;
        }
        Employe employe=(Employe)obj;
        return identifiant== employe.identifiant && nom.equals(employe.nom);
    }

    @Override
    public String toString(){
        return "Employe{"+
                "identifiant"+identifiant+
                "nom"+nom+
                "prenom"+prenom+
                "grade"+grade+
                "nomdeDepartement"+nomDeDepartement+"}";
    }
    public interface IGestion<T>{
        public void ajouterEmploye(T t);
        public boolean rechercherEmploe(String nom);
        public boolean rechercherEmploye(T t);
        public void supprimerEmploye(T t);

        public void displayEmploye();
        public void trierEmployeParid();//Comparable
        public void trierEmployeParNomDepartementEtGrade();//Comparator

    }
}

