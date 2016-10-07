package diseno_software;

public class Punto_5 {

    int[] arregloEnteros;
    int dobles = 0;

    public Punto_5(int cantidad) {
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

    public void reAsignacion() {
        /**
         * Reasignacion de numeros reptedios
         */
        int tmp = 0, j = 0;
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
    }

    public int[] cleanMatriz() {
        int j = 0;
        int[] res = new int[arregloEnteros.length - dobles];
        j = 0;
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] != -1) {
                res[j] = arregloEnteros[i];
                j++;
            }
        }

        return res;
    }

    public int[] ordenar(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;

                }
            }
        }
        return A;
    }

    public String printMatriz(int[] ord) {
        /**
         * Impresion del array final
         */
        String resp = "";
        for (int i = 0; i < ord.length; i++) {
            resp += (resp == "") ? "" : "\n";
            resp += ord[i];
        }
        return resp;
    }
}
