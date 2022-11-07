import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Original {
    private long id;
    private String message_type;
    private String creation;
    private int exported;
    private Contenu contenu;

       public Original(String stringJson) throws NullPointerException{
        JSONParser parser = new JSONParser();
        JSONObject jsn;
        try{
            jsn= (JSONObject) parser.parse(stringJson);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        JSONObject l= (JSONObject) jsn.get("contenu");


        contenu=getContenuFromJson(l);
        contenu.setFournisseur(l);
        contenu.setSite_reception(l);
    }



    /**
     * Dans cette fontion on extrait l'objet Ligne qui est dans le code JSon
     *
     * @param object  l'objet json , source de données
     * @return Ligne extrait dans le code
     */
    public static Ligne getLigneFromJson( JSONObject object){
        JSONArray lignes=(JSONArray)object.get("lignes");
        final JSONObject ln = (JSONObject)lignes.get(0);

        String code_produit=(String)ln.get("code_produit");
        String libelle_fr=(String)ln.get("libelle_fr");
        long quantite=(long)ln.get("quantite");
        String unite=(String)ln.get("unite");
        String id=(String)ln.get("id");;
        long lieu=(long)ln.get("lieu");
        long nb_jour_dlc_apres_decongelation=(long)ln.get("nb_jour_dlc_apres_decongelation");
        long nb_jour_dlv=(long)ln.get("nb_jour_dlv");
        long nb_jour_blocage=(long)ln.get("nb_jour_blocage");
        Boolean fragile=(Boolean) ln.get("fragile");
        String numero_lot=(String)ln.get("numero_lot");
        String dlc=(String)ln.get("dlc");
        String categorie=(String)ln.get("categorie");
        long idpurchaseorder=ln.get("idpurchaseorder")==null? 0:(long)ln.get("idpurchaseorder");
        String idproducts=(String)ln.get("idproducts");
        double quantityorder=ln.get("quantityorder")==null?0.0 : (double)ln.get("quantityorder");
        long branchs_id=ln.get("branchs_id")==null? 0:(long)ln.get("branchs_id");


        Ligne ligne=new Ligne();

        ligne.setBranchs_id(branchs_id);

        ligne.setCategorie(categorie);
        ligne.setDlc(dlc);
        ligne.setId(id);
        ligne.setFragile(fragile);
        ligne.setCode_produit(code_produit);
        ligne.setIdproducts(idproducts);
        ligne.setCode_produit(code_produit);
        ligne.setLibelle_fr(libelle_fr);
        ligne.setUnite(unite);
        ligne.setQuantityorder(quantityorder);
        ligne.setQuantite(quantite);
        ligne.setNumero_lot(numero_lot);
        ligne.setNb_jour_dlv(nb_jour_dlv);
        ligne.setNb_jour_dlc_apres_decongelation(nb_jour_dlc_apres_decongelation);
        ligne.setNb_jour_blocage(nb_jour_blocage);
        ligne.setLieu(lieu);
        ligne.setIdpurchaseorder(idpurchaseorder);

        return ligne;
    }

    /**
     * Dans cette fontion on extrait l'objet Contenu qui est dans le code JSonObject l
     *
     * @param l  l'objet json , source de données
     * @return Contenu extrait dans le code
     */
    public static  Contenu getContenuFromJson(JSONObject l){

        /*String numero_commande=(String)l.get("numero_commande");
        System.out.println("numero_commande:"+numero_commande);
        String numero_livraison=(String)l.get("numero_livraison");
        String statut=(String)l.get("statut");
        String creation=(String)l.get("creation");
        String modification=(String)l.get("modification");
        String date_reception=(String)l.get("date_reception");
        long id=(long)l.get("id");
        String contact_id=(String)l.get("contact_id");
        String reference=(String)l.get("reference");
        String datevalidationprovider=(String)l.get("datevalidationprovider");
        String dateOrder=(String)l.get("dateOrder");
        String datereceive_estimated=(String)l.get("datereceive_estimated");
        int branchs_id=(int)l.get("branchs_id");
        String user_text_5=(String)l.get("user_text_5");
        double weight=(double)l.get("weight");
        String branch_name=(String)l.get("branch_name");
        double quantity=(double)l.get("quantity");
        double quantityreceive=(double)l.get("quantityreceive");
        String contact_name=(String)l.get("contact_name");





        Contenu contenu=new Contenu();

        contenu.setBranchs_id(branchs_id);
        contenu.setBranch_name(branch_name);
        contenu.setWeight(weight);
        contenu.setUser_text_5(user_text_5);
        contenu.setReference(reference);
        contenu.setQuantityreceive(quantityreceive);
        contenu.setDatevalidationprovider(datevalidationprovider);
        contenu.setId(id);
        contenu.setDatereceive_estimated(datereceive_estimated);
        contenu.setDateOrder(dateOrder);
        contenu.setQuantity(quantity);
        contenu.setContact_name(contact_name);
        contenu.setContact_id(contact_id);

        contenu.setNumero_commande(numero_commande);
        contenu.setNumero_livraison(numero_livraison);
        contenu.setStatut(statut);
        contenu.setCreation(creation);
        contenu.setModification(modification);
        contenu.setDate_reception(date_reception);


        contenu.setBranchs_id(branchs_id);



        contenu.setNumero_commande(numero_commande);
        contenu.setNumero_livraison(numero_livraison);
        contenu.setStatut(statut);
        contenu.setCreation(creation);
        contenu.setModification(modification);
        contenu.setDate_reception(date_reception);



        contenu.setBranch_name(branch_name);
        contenu.setWeight(weight);
        contenu.setUser_text_5(user_text_5);
        contenu.setReference(reference);
        contenu.setQuantityreceive(quantityreceive);
        contenu.setDatevalidationprovider(datevalidationprovider);
        contenu.setId(id);
        contenu.setDatereceive_estimated(datereceive_estimated);
        contenu.setDateOrder(dateOrder);
        contenu.setQuantity(quantity);
        contenu.setContact_name(contact_name);
        contenu.setContact_id(contact_id);





        Ligne items=getLigneFromJson(l);
        contenu.setItems(items);*/

        long id= (long) l.get("id");
        String contact_id=(String)l.get("contact_id");
        String reference=(String)l.get("reference");
        String datevalidationprovider=(String)l.get("datevalidationprovider");
        String dateOrder=(String)l.get("dateOrder");
        String datereceive_estimated=(String)l.get("datereceive_estimated");
        long branchs_id=l.get("branchs_id")==null?0:(long)l.get("branchs_id");
        String user_text_5=(String)l.get("user_text_5");
        double weight=l.get("weight")==null ? 0.0:(double)l.get("weight");
        String branch_name=l.get("branch_name")==null ? "":(String)l.get("branch_name");
        double quantity=l.get("quantity")==null ? 0.0:(double)l.get("quantity");
        double quantityreceive=l.get("quantityreceive")==null ? 0.0:(double)l.get("quantityreceive");
        String contact_name=(String)l.get("contact_name");

        String numero_commande=(String)l.get("numero_commande");
        String numero_livraison=(String)l.get("numero_livraison");
        String statut=(String)l.get("statut");
        String creation=(String)l.get("creation");
        String modification=(String)l.get("modification");
        String date_reception=(String)l.get("date_reception");


        Contenu contenu=new Contenu();
        contenu.setBranchs_id(branchs_id);
        contenu.setBranch_name(branch_name);
        contenu.setWeight(weight);
        contenu.setUser_text_5(user_text_5);
        contenu.setReference(reference);
        contenu.setQuantityreceive(quantityreceive);
        contenu.setDatevalidationprovider(datevalidationprovider);
        contenu.setId(id);
        contenu.setDatereceive_estimated(datereceive_estimated);
        contenu.setDateOrder(dateOrder);
        contenu.setQuantity(quantity);
        contenu.setContact_name(contact_name);
        contenu.setContact_id(contact_id);

        contenu.setNumero_commande(numero_commande);
        contenu.setNumero_livraison(numero_livraison);
        contenu.setStatut(statut);
        contenu.setCreation(creation);
        contenu.setModification(modification);
        contenu.setDate_reception(date_reception);

        Ligne items=getLigneFromJson(l);
        contenu.setItems(items);



        return contenu;
    }


    public Original(int id, String message_type, String creation, int exported, Contenu contenu) {
        this.id = id;
        this.message_type = message_type;
        this.creation = creation;
        this.exported = exported;
        this.contenu = contenu;
    }



    public Contenu getContenu() {
        return contenu;
    }


    @Override
    public String toString() {
        return
                String.format("\"original\": {\n")+
                String.format("\t\"id: %s\n",id)+
                String.format("\t\"message_type: %s\n",message_type)+
                String.format("\t\"creation: %s\n",creation)+
                String.format("\t\"exported: %s\n",exported)+
                String.format("\t\"contenu: [\n\t%s\n]",contenu==null?"null":contenu)+

                "}";
    }
}




