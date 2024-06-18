package JavaBasics.section13;

public class TowersOfHanoi {

    public static void main(String[] args) {
        
        final int SRC = 0, AUX = 1, DEST = 2;
        
        Towers t1 = new Towers(4);
        t1.printTower();
        
        t1.solve(SRC, DEST, AUX);
    }

}