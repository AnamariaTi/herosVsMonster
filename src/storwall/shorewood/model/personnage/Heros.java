package storwall.shorewood.model.personnage;

import storwall.shorewood.model.Personnage;
import storwall.shorewood.model.De;

public abstract class Heros extends Personnage {

    private String type;

    public Heros(String type) {
        super();
        this.type = type;
    }

    public Heros(int endurance, int force, int pointsDeVie) {
        super(endurance, force, pointsDeVie);
    }

    @Override
    public void frapper(Personnage perso) {
        De de = new De(4);
        int degats = de.lanceDe() + change(this.force);
        perso.subirDegats(degats);

    }


    @Override
    public String toString() {
        return type;

    }

    public class Humain extends Heros {
        public Humain() {
            super("Humain ");
            this.force += 1;
            this.endurance += 1;
            this.pointsDeVie = calculPointsDeVie();
        }
    }

    public class Nain extends Heros {
        public Nain() {
            super("Nain");
            this.endurance += 2;
            this.endurance = calculPointsDeVie();
        }
    }
}

