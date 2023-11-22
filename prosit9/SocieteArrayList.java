import java.util.ArrayList;

public class SocieteArrayList implements IGestion<Employe> {
    private ArrayList<Employe>employes;
    public SocieteArrayList(){
        employes=new ArrayList<>();
    }
   @Override
    public void ajouterEmploye(Employe employe){
        employes.add(employe);
    }
    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe employe1, Employe employe2) {
                int result = employe1.getNom().compareTo(employe2.getNom());
                if (result == 0) {
                    result = employe1.getNomDeDepartement()Departement().compareTo(employe2.getNomDeDepartement()Departement());
                    if (result == 0) {
                        result = employe1.getGrade() - employe2.getGrade();
                    }
                }
                return result;
            }
        });
    }

}



    }



}
