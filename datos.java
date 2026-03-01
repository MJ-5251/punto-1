public class datos {

    private String Nombre;
    private int Precio;
    private int Cantidad;

    public datos(String nombre, int precio, int cantidad) {
        this.Nombre = nombre;
        this.Precio = precio;
        this.Cantidad = cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public datos() {
    }

    
}