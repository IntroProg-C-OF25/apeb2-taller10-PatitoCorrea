
import java.util.Scanner;

/***
 * Crea un programa que gestione el inventario de una tienda, así como la emisión de facturas. 
 * Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, con información como nombre, precio y cantidad. 
 * El programa debe permitir facturar un producto dado su código, y unidades deseadas. Adicional se debe agregar a la factura al 15% del IVA,
 * y si la compra superar los $100, se debe aplicar un descuento.
 * Nota: Considere la alternativa de inexistencias en Stop, para el caso, muestre la alerta respectiva.
 */
public class Ejercicio05_InventarioTienda2 {
    public static void main(String[] args) {
        int opcion, cantidad, stock;
        double precio, subtotal, iva, total;
        Scanner tcl = new Scanner(System.in);
        String[][] inventario = {
            {"001", "Producto1", "10.0", "50"},
            {"002", "Producto2", "15.5", "30"},
            {"003", "Producto3", "20.0", "40"},
            {"004", "Producto4", "5.0", "100"}
        };
        while (true) {
            System.out.println("\n--- Gestión de Inventario ---");
            System.out.println("1. Facturar producto");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = tcl.nextInt();
            if (opcion == 1) {
                System.out.print("Ingrese el código del producto: ");
                String codigo = tcl.next();
                int index = -1;
                for (int i = 0; i < inventario.length; i++) {
                    if (inventario[i][0].equals(codigo)) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    System.out.println("Producto: " + inventario[index][1]);
                    System.out.print("Ingrese la cantidad deseada: ");
                    cantidad = tcl.nextInt();
                    stock = Integer.parseInt(inventario[index][3]);
                    if (cantidad <= stock) {
                        precio = Double.parseDouble(inventario[index][2]);
                        subtotal = cantidad * precio;
                        iva = subtotal * 0.15;
                        total = subtotal + iva;
                        if (total > 100) {
                            total = total * 0.9;  // 10% de descuento
                            System.out.println("¡Se aplicó un descuento del 10% por superar los $100!");
                        }
                        inventario[index][3] = Integer.toString(stock - cantidad);
                        System.out.println("\n--- Factura ---");
                        System.out.println("Subtotal: $" + subtotal);
                        System.out.println("IVA (15%): $" + iva);
                        System.out.println("Total: $" + total);
                    } else {
                        System.out.println("¡No hay suficiente stock! Disponible: " + stock);
                    }
                } else {
                    System.out.println("Producto no encontrado.");
                }
            } else if (opcion == 2) {
                break;
            } else {
                System.out.println("Opción inválida.");
            }
        }
    }
}
/***
 * --- Gestión de Inventario ---
1. Facturar producto
2. Salir
Seleccione una opción: 1
Ingrese el código del producto: 001
Producto: Producto1
Ingrese la cantidad deseada: 3

--- Factura ---
Subtotal: $30.0
IVA (15%): $4.5
Total: $34.5

--- Gestión de Inventario ---
1. Facturar producto
2. Salir
Seleccione una opción: 2
 */
