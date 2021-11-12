/**
 *
 * @author FranCILDO Alves
 */

public class Delta (){
    public Double calculaDeltaDouble (double a, double b, double c){
        double delta = Math.pow(b, 2) - (4*a*c);
        return delta;
    }
}
