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
