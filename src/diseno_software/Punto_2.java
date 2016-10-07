package diseno_software;

import java.util.Vector;

/**
 * Problema No. 2: Determinar el mayor y el menor de n números
 *
 */
public class Punto_2 {

    int[] Vector;

    public Punto_2(int cantidad) {
        Vector = new int[cantidad];
    }

    public String fillData() {
        String resp = "";
        for (int i = 0; i < Vector.length; i++) {
            Vector[i] = (int) (Math.random() * 10000000 + 1);
            resp += (resp == "") ? "" : "\n";
            resp += Vector[i];
        }
        return resp;
    }

    public int getMayor() {
        int mayor = 0;
        mayor = Vector[0];
        for (int i = 0; i < Vector.length; i++) {
            if (mayor < Vector[i]) {
                mayor = Vector[i];
            }
        }
        return mayor;
    }

    public int getMenor() {
        int menor = 0;
        menor = Vector[0];
        for (int i = 0; i < Vector.length; i++) {
            if (menor > Vector[i]) {
                menor = Vector[i];
            }
        }
        return menor;
    }

}
