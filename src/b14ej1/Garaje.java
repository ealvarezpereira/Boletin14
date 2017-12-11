/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b14ej1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class Garaje {

    private int nCoches = 5;
    private int plazas = 5;
    long tEntrada;
    long tSalida;
    public long toto;
    private double dinero;
    double dineroI, cambio, dinerointroducido2;

    Coche coches = new Coche();
    DecimalFormat df = new DecimalFormat("#.00");

    public void funcionamientoGaraje() {

        JOptionPane.showMessageDialog(null, "Número de plazas libres: " + plazas);

        while (nCoches > 0) {
            //tEntrada y tSalida registra los milisegundos de entrada y los milisegundos de salida
            tEntrada = System.currentTimeMillis();
            coches.introducirCoche();
            tSalida = System.currentTimeMillis();
            //toto es tiempo total
            toto = tSalida - tEntrada;
            //Esta variable calcula los dineros. No funciona del todo bien, la conversión es enrevesada.
            //Supuestamente 3000 milisegundos son 3h. Cada hora son 1000 milisegundos.
            if (toto > 3000) {
                dinero = (toto - 3000) * 0.0002 + 1.5;
            } else {
                dinero = 1.5;
            }

            JOptionPane.showMessageDialog(null, "*Un café y un bocadillo después...*");

            final double dineroFinal = dinero;

            dineroI = Double.parseDouble(JOptionPane.showInputDialog("Importe: " + df.format(dinero) + ".\nIntroduzca el dinero"));

            final double dineroIntroducido1 = dineroI;

            if (dineroI >= dinero) {
                cambio = dineroI - dinero;
            } else {
                do {
                    if (dineroI > dinero) {

                        cambio = dineroI - dinero;
                        break;
                    }

                    dinero -= dineroI;
                    if (dinero == 0) {
                        break;
                    } else {
                        dineroI = Double.parseDouble(JOptionPane.showInputDialog("Importe: " + df.format(dinero) + ".\nIntroduzca el dinero"));

                    }

                } while (dinero != 0);
            }

            double dineroIfinal = dineroIntroducido1 + dineroI;

            JOptionPane.showMessageDialog(null, "Matricula: " + coches.matricula + "\nCoche " + coches.cont + "\nPlaza: " + plazas + "\nTiempo: " + toto + "\nDinero: " + df.format(dineroFinal) + "€" + "\nDinero introducido: " + df.format(dineroIfinal) + "€\nCambio: " + df.format(cambio) + "€" + "\n\nGRACIAS POR UTILIZAR NUESTRO PARKING");
            coches.contadorCoche();
            plazas--;
            nCoches--;
            if (plazas > 0) {
                JOptionPane.showMessageDialog(null, "Número de plazas libres: " + plazas);
            }
        }

        JOptionPane.showMessageDialog(null, "El garaje está lleno!");
    }

}
