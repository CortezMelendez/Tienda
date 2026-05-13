import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int descuento = 0;
    System.out.println("Ingrese el valor del descuento para los productos");
    descuento = sc.nextInt();
    Producto producto = new Producto("Galletas", 22.0, 10);
    Producto producto1 = new Producto("Sabritas", 20.0, 50);
    Producto producto2 = new Producto("Jugo", 15.0, 0);

    producto.mostrarInfo();
    producto.calcularValorInventario();
    producto.aplicarDescuento();
    producto.hayDisponibilidad();
    System.out.println("===========================================");
    producto1.mostrarInfo();
    producto1.calcularValorInventario();
    producto1.aplicarDescuento();
    producto1.hayDisponibilidad();
    System.out.println("===========================================");
    producto2.mostrarInfo();
    producto2.calcularValorInventario();
    producto2.aplicarDescuento();
    producto2.hayDisponibilidad();
}
}
