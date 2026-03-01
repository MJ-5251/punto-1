import java.util.Scanner;

public class metodos {

    public void buscarProducto(datos[][] m){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese nombre del producto: ");
        String nombreBuscar = sc.next();

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){

                if(m[i][j].getNombre().equalsIgnoreCase(nombreBuscar)){
                    System.out.println("Producto encontrado en:");
                    System.out.println("Fila: " + i);
                    System.out.println("Columna: " + j);
                    return;                 
                }
            }
        }

        
        System.out.println("Producto no encontrado");
    }
}