package storwall.shorewood.model;

import java.util.Random;

public class De {

    private int minDe ;
    private int maxDe ;
    private Random random ;


    public De(int maxDe ){
        this.minDe = 1   ;
        this.maxDe = maxDe ;
        this.random = new Random();

    }



    public int lanceDe(){
      return random.nextInt(maxDe -minDe+1)+minDe;
    }
}
