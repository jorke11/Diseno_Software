package diseno_software;

import java.awt.SystemColor;
import java.util.Scanner;

/**
 * Problema No. 6: Almacenar en un arreglo las calificaciones de n estudiantes y
 * determinar:  El promedio general del grupo.  Número de estudiantes
 * aprobados y estudiantes reprobados.  Porcentaje de estudiantes aprobados y
 * estudiantes reprobados.
 *
 * @author JohanSanchez
 */
public class Punto_6 {

    float[] notas;

    public Punto_6(int num) {
        notas = new float[num];
    }

    public String fillData() {
        String resp = "";
        for (int i = 0; i < notas.length; i++) {
            resp += (resp == "") ? "" : "\n";
            resp += notas[i];
        }
        return resp;
    }

    public float[] fillArray() {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 5 + 1);
        }
        return notas;
    }

    public float promedio(float[] notas) {
        float total = 0;
        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }
        return (total / notas.length);
    }

    public static int aprobados(float[] notas) {
        int total = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 3.0) {
                total++;
            }
        }
        return total;
    }

    public static int reprobados(float[] notas) {
        int total = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 3.0) {
                total++;
            }
        }
        
        return total;
    }
}
