package storwall.shorewood.model;

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


}
