package diseno_software;

import java.util.ArrayList;

/**
 * Problema No. 4: Recibir un arreglo de n elementos y generar otro, pero sin
 * elementos repetidos.
 *
 */
public class Punto_4 {

    int[] arregloEnteros;
    int dobles = 0;

    public Punto_4(int cantidad) {
        arregloEnteros = new int[cantidad];
    }

    public String fillData() {
        String resp = "";
        for (int i = 0; i < arregloEnteros.length; i++) {
            arregloEnteros[i] = (int) (Math.random() * 10 + 1);
            resp += (resp == "") ? "" : "\n";
            resp += arregloEnteros[i];
        }
        return resp;
    }

    public int[] getNumberRepeat() {
        int tmp = 0, j = 0, dobles = 0;
        for (int i = 0; i < arregloEnteros.length; i++) {
            tmp = arregloEnteros[i];

            for (j = i + 1; j < arregloEnteros.length; j++) {
                if (arregloEnteros[i] != -1) {
                    if (arregloEnteros[j] == tmp) {
                        arregloEnteros[i] = -1;
                        dobles++;
                    }
                }
            }
        }
        return arregloEnteros;
    }

    public String getDataFilter(int[] arregloEnteros) {
        int j = 0;
        String resp = "";
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] != -1) {
                resp += (resp.equals("")) ? "" : "\n";
                resp += arregloEnteros[i];
                j++;
            }
        }
        return resp;
    }
}
