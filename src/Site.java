import org.json.simple.JSONObject;

public class Site{
    long site_id;
    String nom_site;
    String telephone;

    public Site(int site_id) {
        this.site_id = site_id;
        this.nom_site = "";
        this.telephone = "";
    }

    public Site(int site_id, String nom_site, String tetephone) {
        this.site_id = site_id;
        this.nom_site = nom_site;
        this.telephone = tetephone;
    }

    public Site(JSONObject contenu) {
        JSONObject fournisseur=(JSONObject)contenu.get("site_reception");

        this.site_id= (long) fournisseur.get("site_id");
        this.nom_site=(String)fournisseur.get("nom_site");
        this.telephone=(String)fournisseur.get("telephone");

    }
int indentation=4;
    @Override
    public String toString() {
        return
                String.format(": {\n")+
                String.format(Original.tabs(indentation)+"site_id: \"%s\"\n",site_id)+
                String.format(Original.tabs(indentation)+"nom_site: \"%s\"\n",nom_site)+
                String.format(Original.tabs(indentation)+"tetephone: \"%s\"\n",telephone)+
                Original.tabs(indentation-2)+"},";
    }
}
