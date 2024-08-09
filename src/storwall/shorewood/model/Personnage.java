package storwall.shorewood.model;

public  abstract class Personnage {

    private int endurance ;
    private int force ;
    private int pointsDeVie;
    private int x ;
    private int y ;



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
}
