import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Contenu {
    private long id;
    private String contact_id;
    private String reference;
    private String datevalidationprovider;
    private String dateOrder;
    private String datereceive_estimated;
    private long branchs_id;
    private String user_text_5;
    private double weight;
    private String branch_name;
    private double quantity;
    private double quantityreceive;
    private String contact_name;
    private String numero_commande,numero_livraison, statut,creation,modification,date_reception,type_message;
    private Fournisseur fournisseur;
    private Site site_reception;

    private Ligne items;
    public Contenu(){
    this.id=0;
    this.contact_id="";
    this.reference="";
    this.datevalidationprovider="";
    this.dateOrder="";
    this.datereceive_estimated="";
    this.branchs_id=0;
    this.user_text_5="";
    this.weight=0.0;
    this.branch_name="";
    this.quantity=0.0;
    this.quantityreceive=0.0;
    this.contact_name="";
    this.numero_commande="";
    this.numero_livraison="";
    this.statut="";
    this.creation="";
    this.modification="";
    this.date_reception="";
    this.type_message="";
    this.fournisseur=null;
    this.site_reception=null;
}
    public void setId(long id) {
        this.id = id;
    }
    public void setFournisseur(JSONObject contenu){
        fournisseur =new Fournisseur(contenu);
    }
    public void setSite_reception(JSONObject contenu){
        site_reception =new Site(contenu);
    }
    public void setContact_id(String contact_id) {
        this.contact_id = contact_id;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public void setDatevalidationprovider(String datevalidationprovider) {
        this.datevalidationprovider = datevalidationprovider;
    }
    public void setDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
    }
    public void setDatereceive_estimated(String datereceive_estimated) {
        this.datereceive_estimated = datereceive_estimated;
    }
    public void setBranchs_id(long branchs_id) {
        this.branchs_id = branchs_id;
    }

    public void setUser_text_5(String user_text_5) {
        this.user_text_5 = user_text_5;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public void setQuantityreceive(double quantityreceive) {
        this.quantityreceive = quantityreceive;
    }
    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }
    public void setNumero_commande(String numero_commande) {
        this.numero_commande = numero_commande;
    }
    public void setNumero_livraison(String numero_livraison) {
        this.numero_livraison = numero_livraison;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }
    public void setCreation(String creation) {
        this.creation = creation;
    }
    public void setModification(String modification) {
        this.modification = modification;
    }
    public void setDate_reception(String date_reception) {
        this.date_reception = date_reception;
    }

    public String getType_message() {
        return type_message;
    }

    public void setType_message(String type_message) {
        this.type_message = type_message;
    }

    public Ligne getItems() {
        return items;
    }

    public void setItems(Ligne items) {
        this.items = items;
    }


    public Ligne getLigne(){
        return items;
    }

    int indentation=2;
    @Override
    public String toString() {
        return String.format("\"Contenu\": {\n")+
                String.format(Original.tabs(indentation)+"\t\t\"type_message: %s\n",type_message)+
                String.format(Original.tabs(indentation)+"\t\t\"id: %s\n",id)+
                String.format(Original.tabs(indentation)+"numero_commande: %s\n",numero_commande)+
                String.format(Original.tabs(indentation)+"numero_livraison: %s\n",numero_livraison)+
                String.format(Original.tabs(indentation)+"statut: %s\n",statut)+
                String.format(Original.tabs(indentation)+"creation: %s\n",creation)+
                String.format(Original.tabs(indentation)+"modification: %s\n",modification)+
                String.format(Original.tabs(indentation)+"date_reception: %s\n",date_reception)+
                String.format(Original.tabs(indentation)+"contact_id: \"%s\"\n",contact_id)+
                String.format(Original.tabs(indentation)+"reference: \"%s\"\n",reference)+
                String.format(Original.tabs(indentation)+"datevalidationprovider: \"%s\"\n",datevalidationprovider)+
                String.format(Original.tabs(indentation)+"dateOrder: \"%s\"\n",dateOrder)+
                String.format(Original.tabs(indentation)+"datereceive_estimated: \"%s\"\n",datereceive_estimated)+
                String.format(Original.tabs(indentation)+"branchs_id: \"%s\"\n",branchs_id)+
                String.format(Original.tabs(indentation)+"user_text_5: \"%s\"\n",user_text_5)+
                String.format(Original.tabs(indentation)+"weight: \"%s\"\n",weight)+
                String.format(Original.tabs(indentation)+"branch_name: \"%s\"\n",branch_name)+
                String.format(Original.tabs(indentation)+"quantity: \"%s\"\n",quantity)+
                String.format(Original.tabs(indentation)+"quantityreceive: \"%s\"\n",quantityreceive)+
                String.format(Original.tabs(indentation)+"contact_name: \"%s\"\n",contact_name)+
                String.format(Original.tabs(indentation)+"fournisseur: %s\n",fournisseur==null?"null":fournisseur)+
                String.format(Original.tabs(indentation)+"site_reception: %s\n",site_reception==null?"null":site_reception)+
                String.format(Original.tabs(indentation)+"ligne: [\n\t\t\t{\n%s\n\t\t\t}\n\t\t]",items==null?"null":items)+
                "\t\t},";

    }
}
