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
     * Subject line
     *
     * <p>Description of the method with optional {@code code} and {@link Object links to Javadoc}
     * </p>
     *
     * <pre>
     *    raw input
     * </pre>
     *
     * @param a - first numeric value for the ADD operation
     * @param b -  second numeric value for same purposes
     * @param c -  third numeric value for same purposes
     * @return a operação do valor de delta
     * @throws SomeException if bar goes wrong
     * @see someOtherMethod()
     * @since 2.2.2
     * @author me
     */

    public static double calculaDeltaDouble (double a,  double b, double c){
        double delta = Math.pow(b, 2) - (4*a*c);
        return delta;
    }

}
