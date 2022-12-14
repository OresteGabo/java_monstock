

public class Ligne {
    private String id;
    private String code_produit;
    private String libelle_fr;
    private long quantite;
    private String unite;
    private long lieu;
    private long nb_jour_dlc_apres_decongelation;
    private long nb_jour_dlv;
    private long nb_jour_blocage;
    private Boolean fragile;
    private String numero_lot;
    private String dlc;
    private String categorie;
    private long idpurchaseorder;
    private String idproducts;
    private double quantityorder;
    private long branchs_id;

    public Ligne(){
        id="";
        code_produit="";
        libelle_fr="";
        quantite=0;
        unite="";
        lieu=0;
        nb_jour_dlc_apres_decongelation=0;
        nb_jour_dlv=0;
        nb_jour_blocage=0;
        fragile=false;
        numero_lot="";
        dlc="";
        categorie="";
        idpurchaseorder=0;
        idproducts="";
        quantityorder=0.0;
        branchs_id=0;
    }



    public void setId(String id) {
        this.id = id;
    }

    public void setCode_produit(String code_produit) {
        this.code_produit = code_produit;
    }

    public void setLibelle_fr(String libelle_fr) {
        this.libelle_fr = libelle_fr;
    }

    public void setQuantite(long quantite) {
        this.quantite = quantite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public void setLieu(long lieu) {
        this.lieu = lieu;
    }

    public void setNb_jour_dlc_apres_decongelation(long nb_jour_dlc_apres_decongelation) {
        this.nb_jour_dlc_apres_decongelation = nb_jour_dlc_apres_decongelation;
    }

    public void setNb_jour_dlv(long nb_jour_dlv) {
        this.nb_jour_dlv = nb_jour_dlv;
    }

    public void setNb_jour_blocage(long nb_jour_blocage) {
        this.nb_jour_blocage = nb_jour_blocage;
    }

    public void setFragile(Boolean fragile) {
        this.fragile = fragile;
    }

    public void setNumero_lot(String numero_lot) {
        this.numero_lot = numero_lot;
    }

    public void setDlc(String dlc) {
        this.dlc = dlc;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setIdpurchaseorder(long idpurchaseorder) {
        this.idpurchaseorder = idpurchaseorder;
    }

    public void setIdproducts(String idproducts) {
        this.idproducts = idproducts;
    }

    public void setQuantityorder(double quantityorder) {
        this.quantityorder = quantityorder;
    }

    public void setBranchs_id(long branchs_id) {
        this.branchs_id = branchs_id;
    }

    @Override
    public String toString() {
        return
                String.format(Original.tabs(4)+"id: \"%s\"\n",id)+
                String.format(Original.tabs(4)+"code_produit: \"%s\"\n",code_produit)+
                String.format(Original.tabs(4)+"libelle_fr: \"%s\"\n",libelle_fr)+
                String.format(Original.tabs(4)+"quantite: %s\n",quantite)+
                String.format(Original.tabs(4)+"unite: \"%s\"\n",unite)+
                String.format(Original.tabs(4)+"lieu: %s\n",lieu)+
                String.format(Original.tabs(4)+"nb_jour_dlc_apres_decongelation: %s\n",nb_jour_dlc_apres_decongelation)+
                String.format(Original.tabs(4)+"nb_jour_dlv: %s\n",nb_jour_dlv)+
                String.format(Original.tabs(4)+"nb_jour_blocage: %s\n",nb_jour_blocage)+
                String.format(Original.tabs(4)+"fragile: \"%s\"\n",fragile)+
                String.format(Original.tabs(4)+"numero_lot: \"%s\"\n",numero_lot)+
                String.format(Original.tabs(4)+"dlc: \"%s\"\n",dlc)+
                String.format(Original.tabs(4)+"categorie: \"%s\"\n",categorie)+
                String.format(Original.tabs(4)+"idpurchaseorder: \"%s\"\n",idpurchaseorder)+
                String.format(Original.tabs(4)+"idproducts: \"%s\"\n",idproducts)+
                String.format(Original.tabs(4)+"quantityorder: \"%s\"\n",quantityorder)+
                String.format(Original.tabs(4)+"branchs_id: \"%s\"\n",branchs_id)+
                "";

    }
}
