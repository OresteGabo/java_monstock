import org.json.simple.JSONObject;

public class Fournisseur{
    private String code;
    private String nom;
    private String telephone;

    public Fournisseur() {
        this.code = "";
        this.nom = "";
        this.telephone = "";
    }

    public Fournisseur(JSONObject contenu) {
        JSONObject fournisseur=(JSONObject)contenu.get("fournisseur");

        this.code= (String) fournisseur.get("code");
        this.nom=(String)fournisseur.get("nom");
        this.telephone=(String)fournisseur.get("telephone");

    }
    public Fournisseur(String code, String nom, String telephone) {
        this.code = code;
        this.nom = nom;
        this.telephone = telephone;
    }


    @Override
    public String toString() {
        return  String.format(": {\n")+
                String.format("\t\t\t\t\"code: \"%s\"\n",code)+
                String.format("\t\t\t\t\"nom: \"%s\"\n",nom)+
                String.format("\t\t\t\t\"telephone: \"%s\"\n",telephone)+
                "\t\t},";
    }

}