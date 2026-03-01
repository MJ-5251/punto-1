public class principal {

    public static void main(String[] args) {
    
        datos[][] m = new datos[5][6];

        String[] nombres = {"Arroz", "Leche", "Pan", "Azucar", "Sal", "Aceite", "Cafe", "Chocolate", "Galletas", "Huevos","Queso", "Mantequilla", "Carne", "Pollo", "Atun", "Confites", "Lentejas", "Frijoles", "Jugo", "Cereal","Yogurt", "Harina", "Mayonesa", "Gomitas", "Salsa","Alpin", "Jabon", "Shampoo", "Crema dental", "Papel"};

        int contador = 0;  
        
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){

                String nombre = nombres[contador];
                int p = (contador + 1) * 1000;
                int c = contador + 1;

                m[i][j] = new datos(nombre, p, c);

                contador = contador + 1;
            }
        }

        
        metodos o = new metodos();
        o.buscarProducto(m);
    }
}




//public class principal {

  //  public static void main(String[] args) {

    //    datos[][] m = new datos[5][6];

      //  int contador = 1;

        //for(int i = 0; i < m.length; i++){
          //  for(int j = 0; j < m[i].length; j++){
            //    String nombre = "Producto" + contador;
              //  int p = contador * 1000;
                //int c = contador;

                //m[i][j] = new datos(nombre, p, c);

                //contador = contador+1;
            //}
        //}

        //metodos o = new metodos();

        //o.buscarProducto(m);
    //}
//}