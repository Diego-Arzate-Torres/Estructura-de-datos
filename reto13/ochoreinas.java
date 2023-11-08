package reto13;

public class ochoreinas {
    private static final int TAMAÑO = 8;
    private int[] reinas = new int[TAMAÑO];
    private int numeroDeSoluciones = 0;

    public ochoreinas() {
        ponerReinas(0);
        System.out.println("Número de soluciones: " + numeroDeSoluciones);
    }

    private void ponerReinas(int ilera) {
        if (ilera == TAMAÑO) {
            imprimirReinas();
            numeroDeSoluciones++;
            return;
        }
        for (int col = 0; col < TAMAÑO; col++) {
            if (puedePoner(ilera, col)) {
                reinas[ilera] = col;
                ponerReinas(ilera + 1);
            }
        }
    }

    public boolean puedePoner(int ilera, int col) {
        for (int i = 0; i < ilera; i++) {
            if (reinas[i] == col || reinas[i] - i == col - ilera || reinas[i] + i == col + ilera) {
                return false;
            }
        }
        return true;
    }

    public void imprimirReinas() {
        for (int i = 0; i < TAMAÑO; i++) {
            for (int j = 0; j < TAMAÑO; j++) {
                if (reinas[i] == j) {
                    System.out.print(" Q ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
