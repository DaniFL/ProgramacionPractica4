package dominio;

public class CalculadoraDistancias {

    /**
     * Calcula la distancia de edición, tal y como la expone
     * Jurafsky entre las cadenas ` s1` y ` s2`.
     */
    public static int distancia(String cadena1, String cadena2) {
        int distancia;
         int m = cadena1.length();
         int n = cadena2.length();
         int[][] d = new int[m + 1][n + 1];
         for (int i = 0; i <= m; i++) {
             d[i][0] = i;
         }
         for (int j = 0; j <= n; j++) {
             d[0][j] = j;
         }
         for (int j = 1; j <= n; j++) {
             for (int i = 1; i <= m; i++) {
                 if (cadena1.charAt(i - 1) == cadena2.charAt(j - 1)) {
                     d[i][j] = d[i - 1][j - 1];
                 }
                 else {
                     d[i][j] = Math.min(d[i - 1][j] + 1, Math.min(d[i][j - 1] + 1, d[i - 1][j - 1] + 1));
                 }
             }
         }
         distancia = d[m][n];
         return distancia;
    }
}
