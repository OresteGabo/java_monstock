

public class Main {

    public static void main(String[] args)  {

        String json= """
                {
                                "id":  101796,
                                "message_type":  "SupplierOrder",
                                "creation":  "2022-10-25  13:39:00",
                                "exported":  0,
                                "contenu":  {
                                        "type_message":  "commande_fournisseur",
                                        "id":  1504678,
                                        "fournisseur":  {
                                                "code":  "989",
                                                "nom":  "RUNGIS  LABORATOIRE",
                                                "telephone":  ""
                                        },
                                        "site_reception":  {
                                                "site_id":  58,
                                                "nom_site":  "PREST  DISTRIBUTION",
                                                "telephone":  ""
                                        },
                                        "numero_commande":  "00240296",
                                        "numero_livraison":  "RG005119",
                                        "statut":  "en_commande",
                                        "creation":  "2022-10-25  13:39:00",
                                        "modification":  "2022-10-25  13:39:00",
                                        "date_reception":  "2022-10-25",
                                        "lignes":  [
                                                {
                                                        "id":  "14198564/54981",
                                                        "code_produit":  "57652",
                                                        "libelle_fr":  "Panettone  au  Marron  Glacé  Signature  Noël  2022",
                                                        "quantite":  130,
                                                        "unite":  "pièce",
                                                        "lieu":  1,
                                                        "nb_jour_dlc_apres_decongelation":  42,
                                                        "nb_jour_dlv":  0,
                                                        "nb_jour_blocage":  21,
                                                        "fragile":  false,
                                                        "numero_lot":  "00079663",
                                                        "dlc":  "2023-04-20",
                                                        "categorie":  "A  partager"
                                                }
                                        ]
                                }
                        }""";

        Original c = new Original(json);
        //Affichage de l'objet contenu en forme json
        System.out.println(c.getContenu());

        //affichage de l'objet Ligne en forme json
        //System.out.println(c.getContenu().getItems());

    }


}

