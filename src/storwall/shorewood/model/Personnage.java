package storwall.shorewood.model;

import java.lang.reflect.Array;



public abstract class Personnage {

    protected int endurance;
    protected int force;
    protected int pointsDeVie;
    protected int x;
    protected int y;


    public Personnage() {

    }


    public Personnage(int endurance, int force, int pointsDeVie) {
        this.endurance = endurance;
        this.force = force;
        this.pointsDeVie = pointsDeVie;
    }


    public int getEndurance() {
        return endurance;
    }

    public int getForce() {
        return force;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public abstract void frapper(Personnage personnage);


    public void position(int x, int y) {
        this.x = x;
        this.y = y;
    }


    private int caracteristiquePersonnage() {
        De de = new De(6);
        int[] lancer = new int[4];
        for (int i = 0; i < 4; i++) {
            lancer[i] = de.lanceDe();

        }
        java.util.Arrays.sort(lancer);
        return lancer[1] + lancer[2] + lancer[3];
    }

    private int calculPointsDeVie() {
        return endurance + change(endurance);
    }

    public void subirDegats(int degats) {
        this.pointsDeVie -= degats;
    }

    public int change(int caracter) {
        if (caracter < 5) {
            return -1;
        }
        if (caracter < 10) {
            return 0;
        }
        if (caracter < 15) {
            return +1;
        }
        return +2;
    }

}
