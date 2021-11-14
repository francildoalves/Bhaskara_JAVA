/**
 *
 * @author FranCILDO Alves
 */

 /*
 private double LadoA;
 private double b;
 private double c;
 */
     

public class Delta(){

    /**
     * 
     * Adds two values.
     *
     * @param a - first numeric value for the ADD operation
     * @param b -  second numeric value for same purposes
     * @param c -  third numeric value for same purposes
     * @return a operação do valor de delta
     */
    public static double calculaDeltaDouble (double a,  double b, double c){
        double delta = Math.pow(b, 2) - (4*a*c);
        return delta;
    }

}
