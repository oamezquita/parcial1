/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import javax.swing.JOptionPane;

/**
 *
 * @author 202
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static int vocalOConsonante(String j){
        int x=0;
        
        if(j.equals("a")||j.equals("e")||j.equals("i")||j.equals("o")||j.equals("u"))
        {
        x=1;
        }
        return x;}
    public static void main(String[] args) {
         
    String j=JOptionPane.showInputDialog("digite una letra");
    JOptionPane.showMessageDialog(null,Parcial1.vocalOConsonante(j));
    }
}
