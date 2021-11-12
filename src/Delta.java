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
    public static double calculaDeltaDouble (double a,  double b, double c){
        double delta = Math.pow(b, 2) - (4*a*c);
        return delta;
    }

}
