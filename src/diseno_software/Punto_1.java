package diseno_software;

import java.util.Random;
import javax.swing.JTextArea;

/**
 * Problema No. 1: Se tienen los sueldos de un grupo de n empleados de una
 * empresa. Se requiere saber cuántos de estos empleados tienen un sueldo
 * superior al promedio delgrupo.
 *
 */
public class Punto_1 {

    int[] salarios;

    public Punto_1(int cantidad) {
        salarios = new int[cantidad];
    }

    public String fillData() {
        String resp = "";
        for (int i = 0; i < salarios.length; i++) {
            salarios[i] = (int) (Math.random() * 100 + 1);
            resp += (resp == "") ? "" : "\n";
            resp += salarios[i];
        }
        return resp;
    }

    public float promedio() {

        int promedio = 0;
        for (int i = 0; i < salarios.length; i++) {
            promedio = promedio + salarios[i];
        }
        promedio = (promedio / salarios.length);
        return promedio;
    }

    public int superior(float promedio) {
        int promedioSuperior = 0;

        for (int i = 0; i < salarios.length; i++) {
            System.out.println(salarios[i]);
            if (promedio < salarios[i]) {
                promedioSuperior++;
            }
        }
        return promedioSuperior;
    }
}
