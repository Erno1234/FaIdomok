
package faidomok;

public abstract class FaIdom {
   private static final double fajsuly  = 0.8;
 
   public abstract double terfogat();
   
   public double suly(){
       double terfogat = terfogat();
       
       return fajsuly * terfogat;
   }

    public static double getFajsuly() {
        return fajsuly;
    }
   
   @Override
    public String toString() {
        return "FaIdom{" + '}';
    }
   
   
}
