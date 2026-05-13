public class Producto {
    String nombre;
    double precio;
    int stock;
    double descuento;

    public Producto(String nombre, Double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
        System.out.println("Stock: "+stock);
    }
    public void calcularValorInventario(){
        double inv = stock*precio;
        System.out.println("Valor total del Inventario: "+inv);
    }
    public void aplicarDescuento(Double descuento){

    }

    public void hayDisponibilidad(){
        if(stock>0){
            System.out.println("Hay disponibilidad en el producto, el total es de :" + stock);
        }
        else{
            System.out.println("No hay disponibilidad en el producto, el total es de :" + stock);
        }
    } //indica si stock > 0.
}
