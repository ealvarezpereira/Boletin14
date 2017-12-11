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
public class Coche{

    public String matricula;
    public int cont= 1;

    public void introducirCoche() {       
        matricula = JOptionPane.showInputDialog("Coche "+cont);
    }

    public void contadorCoche(){
        cont++;
    }
}
