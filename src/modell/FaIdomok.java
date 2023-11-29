package modell;

import faidomok.FaIdom;
import faidomok.Gomb;
import faidomok.Hasab;
import java.util.List;

public class FaIdomok {

    private List<FaIdom> idomok;

    public static void main(String[] args) {
        new FaIdomok().run();
    }

    public void run() {
        FaIdomok idom = new FaIdomok();
        idom.idomok.add(new Gomb(5.0));
        idom.idomok.add(new Hasab(2.0, 4.0, 8.0));
         idom.idomok.add(new Gomb(4.0));
        idom.idomok.add(new Hasab(3.0, 5.0, 7.0));
         idom.idomok.add(new Gomb(8.0));
        idom.idomok.add(new Hasab(4.0, 6.0, 6.0));
        minV();
        maxV();
        
        for (FaIdom henger : idom.idomok) {
            System.out.println(idomok.toString());
        }
        System.out.println("Az összes idom súlya: " + idom.osszSuly());
        System.out.println("A gömbök összsúlya: " + idom.osszGombSuly());
        System.out.println("Legkisebb térfogatú idom: " + idom.minV());
        System.out.println("Legnagyobb térfogatú idom: " + idom.maxV());
    }

    public double osszGombSuly() {
        double osszSuly = 0;
        for (int i = 0; i < idomok.size(); i++) {
            FaIdom tipus = idomok.get(i);
            if (tipus instanceof Gomb) {
                osszSuly += ((Gomb) tipus).suly();
            }
        }
        return osszSuly;
    }

    public double osszSuly() {
        double osszSuly = 0;
        for (int i = 0; i < idomok.size(); i++) {
            FaIdom tipus = idomok.get(i);
            {
                osszSuly += tipus.suly();
            }
        }
        return osszSuly;
    }

    public FaIdom minV() {
        double min = idomok.get(0).terfogat();
        FaIdom minIdom = idomok.get(0);
        for (int i = 1; i <= idomok.size() - 1; i++) {
            if (min > idomok.get(i).terfogat()) {
                min = idomok.get(i).terfogat();
                minIdom = idomok.get(i);
            }
        }
        return minIdom;
    }

    public FaIdom maxV() {
        double max = idomok.get(0).terfogat();
        FaIdom maxIdom = idomok.get(0);
        for (int i = 1; i <= idomok.size() - 1; i++) {
            if (max < idomok.get(i).terfogat()) {
                max = idomok.get(i).terfogat();
                maxIdom = idomok.get(0);
            }
        }
        return maxIdom;
    }

}
