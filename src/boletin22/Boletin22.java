/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Boletin22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    ArrayList<Correo> lista = new ArrayList<>();
    Buzon obx = new Buzon(lista);
    int op = 0;
    int posicion;
    do{
    op = Integer.parseInt(JOptionPane.showInputDialog("Menú:\n" + "1. Número de correos\n2. Engadir correo\n3. Correos sen ler\n" + "4. Primer correo non leído\n5. Buscar correo\n6. Eliminar correo\n" + "7. Saír"));
        switch(op){
            case 1: JOptionPane.showMessageDialog(null, "O número total de correos é de " + obx.numeroDeCorreos());
                break;
            case 2: String mensaxe = JOptionPane.showInputDialog("Introduzca a mensaxe do correo:");
                boolean leido = Boolean.parseBoolean(JOptionPane.showInputDialog
                ("Indique se o correo foi leído ou non:\ntrue=leído\nfalse=non leído"));
                Correo c = new Correo(mensaxe, leido);
                obx.engade(c);
                break;
            case 3: 
                if(obx.porLer()==true){
                JOptionPane.showMessageDialog(null, "Todos os correos foron leídos");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Queda algún correo sen ler");
                }
                break;
            case 4: JOptionPane.showMessageDialog(null, obx.amosaPrimerNoLeido());
                    break;
            case 5: posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca a posición do correo:"));
                    JOptionPane.showMessageDialog(null, obx.amosa(posicion));
                    break;
            case 6: posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca a posición do correo:"));
                    obx.elimina(posicion);
                break;
            case 7: System.exit(0);
            }
        }while(op != 7);
    }        
}

