/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio6q6;

/**
 *
 * @author yasmi
 */
public class Desafio6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
      int numero, somatorionumNeg;
        somatorionumNeg = 0;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe "
                    + "valores inteiros ou zero (0) para sair\n"
                    + "Digite:"));
            if(numero<0){
                somatorionumNeg = somatorionumNeg + numero;
            }
        }while(numero!=0);
        JOptionPane.showMessageDialog(null, "O Somatório do número "
                + "negativos digitado é: "+somatorionumNeg);
    }
    
}
