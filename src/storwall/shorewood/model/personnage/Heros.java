package storwall.shorewood.model.personnage;

import storwall.shorewood.model.Personnage;
import storwall.shorewood.model.De;

public abstract class Heros extends Personnage {

    private String type;

    public Heros(String type) {
        super();
        this.type = type;
    }

//    public Heros(int endurance, int force, int pointsDeVie) {
//        super(endurance, force, pointsDeVie);
//    }

    @Override
    public void frapper(Personnage perso) {
        De de = new De(4);
        int degats = de.lanceDe()+change(this.force);
        perso.subirDegats(degats);

    }


    @Override
    public String toString() {
        return type;
    }
}
