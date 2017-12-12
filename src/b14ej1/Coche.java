/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b14ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class Coche {

    public String matricula;
    public int cont = 1;

    public void introducirCoche() {
        matricula = JOptionPane.showInputDialog("Coche " + cont);

        //Bucle que te obliga a introducir una matrícula
        while (matricula == null || matricula.equals("")) {
            matricula = JOptionPane.showInputDialog("No se ha reconocido la matrícula.");
        }

    }

    public void contadorCoche() {
        //Metodo utilizado para que cuente los coches a la hora de mostrarlo (Por hacer bonito, es irrelevante su uso.)
        cont++;
    }
}
