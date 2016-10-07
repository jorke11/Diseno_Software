package diseno_software;

/**
 * Problema No. 3: Generar un arreglo con los primeros n números enteros primos.
 *
 */
public class Punto_3 {

    /*
    * Metodo obtiene los numeros primos deseados por usuario
     */
    public String getPrimoNum(int cantidad) {
        String res = "\n";
        int x = 2;
        int divisor = 0;
        int cont = 2;
        cantidad++;
        while (x <= cantidad) {
            divisor = 2;
            while (cont % divisor != 0) {
                divisor++;
            }
            if (divisor == cont) {
                res += (res.equals("\n")) ? "" : "\n";
                res += cont;
                System.out.println(cont);

                x++;
            }
            cont++;
        }
        return res;
    }
}