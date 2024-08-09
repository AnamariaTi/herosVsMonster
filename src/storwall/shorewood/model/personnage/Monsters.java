package storwall.shorewood.model.personnage;

import storwall.shorewood.model.De;
import storwall.shorewood.model.Personnage;

public abstract class Monsters extends Personnage {
    private String type;
    private int or;
    private int cuir;

    public Monsters() {
    }

    public Monsters(String type) {
        super();
        this.type = type;
    }

    public Monsters(int endurance, int force, int pointsDeVie) {
        super(endurance, force, pointsDeVie);
    }

    public int getCuir() {
        return cuir;
    }

    public int getOr() {
        return or;
    }

    public String getType() {
        return type;
    }


    @Override
    public void frapper(Personnage personnage) {
        De de = new De(4);
        int degats = de.lanceDe();
    }
}
