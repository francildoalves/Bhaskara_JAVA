import javax.swing.JOptionPane;

/**
 *
 * @author FranCILDO Alves
 */

 
public class App {
    public static void main(String[] args) throws Exception {
        double a;
        double b;
        double c;

        
        Delta delta = new Delta();


        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C:"));
        delta.calculaDeltaDouble(a, b, c);
    }
}
