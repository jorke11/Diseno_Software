package diseno_software;

/**
 * Problema No. 7: Sumar dos matrices de tamaño n
 *
 */
public class Punto_7 {

    int[][] matriz_1;
    int[][] matriz_2;
    int[][] matriz_Final;

    public Punto_7(int x, int y) {

        matriz_1 = new int[x][y];
        matriz_2 = new int[x][y];

        matriz_Final = new int[x][y];

    }

    public void sumaMatriz() {
        for (int i = 0; i < matriz_1.length; i++) {
            for (int j = 0; j < matriz_2.length; j++) {
                matriz_Final[i][j] = matriz_1[i][j] + matriz_2[i][j];
            }
        }
    }

    public String fillData() {
        String resp = "", resp2 = "";

        for (int i = 0; i < matriz_1.length; i++) {
            resp += "\n";
            resp2 += "\n";
            for (int j = 0; j < matriz_2.length; j++) {
                matriz_1[i][j] = (int) (Math.random() * 10 + 1);
                matriz_2[i][j] = (int) (Math.random() * 10 + 1);
                resp += " | " + matriz_1[i][j] + " | ";
                resp2 += " | " + matriz_2[i][j] + " | ";
            }
        }

        return resp + ":" + resp2;
    }

    public String printMatriz() {
        String resp = "";
        for (int i = 0; i < matriz_Final.length; i++) {
            resp += "\n";
            System.out.println("\n");
            for (int j = 0; j < matriz_Final.length; j++) {
                resp += " | " + matriz_Final[i][j] + " | ";
            }
        }
        return resp;
    }

}
