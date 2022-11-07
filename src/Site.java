public class Site{
    long site_id;
    String nom_site;
    String tetephone;

    public Site(int site_id) {
        this.site_id = site_id;
        this.nom_site = "";
        this.tetephone = "";
    }

    public Site(int site_id, String nom_site, String tetephone) {
        this.site_id = site_id;
        this.nom_site = nom_site;
        this.tetephone = tetephone;
    }

    @Override
    public String toString() {
        return "\"site_reception\": {" +
                String.format("\"site_id: %s\"\n",site_id)+
                String.format("\"nom_site: %s\"\n",nom_site)+
                String.format("\"tetephone: %s\"\n",tetephone)+
                "},\n";
    }
}
