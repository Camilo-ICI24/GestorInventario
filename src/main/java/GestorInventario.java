import java.util.InputMismatchException;
import java.util.Scanner;

class GestorInventario {

    public static void main(String[] args) {
        Object[][] matrizProductos = crearMatrizProductos();
        definirProducto("Bloxy Cola", 1, 4, matrizProductos);


    }

    public static Object[][] crearMatrizProductos() { // Esta función crea la matriz de productos
        Object[][] productos = new Object[10][3];
        return productos;
    }

    public static void definirProducto(String nombreProducto, int idProducto, int cantidad, Object[][] productos) {
        for (int fila = 0; fila < productos.length; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (productos[fila][columna] != null) {
                    productos[fila][0] = idProducto;
                    productos[fila][1] = nombreProducto;
                    productos[fila][2] = cantidad;
                }
            } // Este método define un producto que será añadido a la matriz principal
        }
    }

    public static void agregarProducto(int idProducto, int cantidad, Object[][] productos) {

    }

    public static int solicitarId() {
        Scanner ingresar = new Scanner(System.in);
        System.out.println("Ingrese la ID de su producto: ");
        int idInteresada = ingresar.nextInt();
        try {
            return idInteresada;
        } catch (InputMismatchException e) {
            System.out.println("ID no válida");
        } finally {
            ingresar.close();
        }
        return idInteresada;
    }
}
