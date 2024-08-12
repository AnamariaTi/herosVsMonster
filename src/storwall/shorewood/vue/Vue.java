package storwall.shorewood.vue;

import storwall.shorewood.model.Personnage;

import java.sql.SQLOutput;

public class Vue implements InterfaceVue {


    private final int tailleCart = 15;
    private String[][] carte;


    public void display() {
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("Bienvenue dans la forêt de Shorewood");
        System.out.println("Forêt enchantée du pays de Stormwall");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
    }


    public Vue() {
        this.carte = new String[tailleCart][tailleCart];
        initCarte();
    }


    public void initCarte() {
        for (int i = 0; i < tailleCart; i++) {
            for (int j = 0; j < tailleCart; j++) {
                carte[i][j] = ".";
            }
        }
    }

    public void displayCart() {
        for (int i = 0; i < tailleCart; i++) {
            for (int j = 0; j < tailleCart; j++) {
                System.out.println(carte[i][j] + " ");
            }
        }
    }


    public void displayMessage(String message) {
        System.out.println(message);
    }

}
