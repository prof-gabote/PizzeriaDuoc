package pizzeriaduoc;

public class PizzeriaDuocMain {

    public static void main(String[] args) {

        System.out.println("******* EJERCICIO 1 ********\n"); // "\n" me permite hacer un salto de línea

        Pizza pizzaEjercicio1 = new Pizza();
        pizzaEjercicio1.setNombre("Peperoni");
        pizzaEjercicio1.setTamanio("XL");
        pizzaEjercicio1.setMasa("Gruesa");
        pizzaEjercicio1.setPrecioBase(8000);

        pizzaEjercicio1.preparar();
        pizzaEjercicio1.calentar();

        System.out.println("");//Solo para hacer un salto de línea

        pizzaEjercicio1.describir();

        System.out.println("");

        System.out.println("******* EJERCICIO 2 ********\n");

        Pizza pizzaEjercicio2Peperoni = new Pizza();
        pizzaEjercicio2Peperoni.setNombre("Peperoni");
        pizzaEjercicio2Peperoni.setTamanio("XL");
        pizzaEjercicio2Peperoni.setMasa("Gruesa");
        pizzaEjercicio2Peperoni.setPrecioBase(8000);

        Pizza pizzaEjercicio2Napolitana = new Pizza("Napolitana", "L", "Delgada", 7000);

        System.out.println("La pizza " + pizzaEjercicio2Napolitana.getNombre() + " cuesta $" + pizzaEjercicio2Napolitana.getPrecioBase());

        System.out.println("La pizza " + pizzaEjercicio2Peperoni.getNombre() + " cuesta $" + pizzaEjercicio2Peperoni.getPrecioBase());

        //Si usamos ((tipoDato) variable) podemos imprimir el precio como si fuera entero
        System.out.println("La pizza " + pizzaEjercicio2Napolitana.getNombre() + " cuesta $" + ((int) pizzaEjercicio2Napolitana.getPrecioBase()) + " (como int)");

        //También lo podemos hacer en variables separadas
        int precioEntero = (int) pizzaEjercicio2Peperoni.getPrecioBase(); //Aquí hacemos la conversión o casting

        System.out.println("La pizza " + pizzaEjercicio2Peperoni.getNombre() + " cuesta $" + precioEntero + " (como int)");

        System.out.println("******* EJERCICIO 3 ********\n");

        Pizza pizzaEjercicio3Carne = new Pizza("Tres carnes", "XL", "Gruesa", 12000);
        Pizza pizzaEjercicio3Queso = new Pizza("Extra queso", "M", "Delgada", 15000);
        Pizza pizzaEjercicio3Pinia = new Pizza("Pizza con Pìña", "XL", "Gruesa", 9000);

        System.out.println("*** TOTAL ***");

        double totalBruto = pizzaEjercicio3Carne.getPrecioBase() + pizzaEjercicio3Pinia.getPrecioBase() + pizzaEjercicio3Queso.getPrecioBase();
        int totalBrutoEnInt = (int) totalBruto; //Si queremos lo pasamos a INT

        double promedio = totalBruto / 3;
        int promedioEnInt = totalBrutoEnInt / 3;

        System.out.println("Total: $" + totalBrutoEnInt);
        System.out.println("Promedio: $" + promedioEnInt);

        double IVA = 0.19;

        int totalBrutoIVA = (int) Math.round(totalBruto + (totalBruto * 0.19));
        /*
        Cuando trabajamos con double, si usamos round nos retornará un dato de tipo long.
        Lo que debemos hacer, es simplemente pasarlo a int como se hizo antes.
         */

        System.out.println("totalBrutoIVA = $" + totalBrutoIVA);

        double precio1IVA = pizzaEjercicio3Carne.getPrecioBase() * 0.19;
        double precio2IVA = pizzaEjercicio3Queso.getPrecioBase() * 0.19;
        double precio3IVA = pizzaEjercicio3Pinia.getPrecioBase() * 0.19;

        double promIVA = Math.round(precio1IVA + precio2IVA + precio3IVA / 3);

        System.out.println("promIVA = " + promIVA);

        System.out.println("******* EJERCICIO 4 ********\n");

        Pizza pizzaEjercicio4Barbecue = new Pizza("Pizza Barbecue", "XXL", "New York", 15000);
        double DESCTO = 0.25;

        //El resultado llega como double y lo casteamos a int para imprimirlos sin decimal
        int valorConDescuento = (int) pizzaEjercicio4Barbecue.calcularPrecioFinal(DESCTO);

        System.out.println("Pizza: " + pizzaEjercicio4Barbecue.getNombre()
                + ". Dscto: " + DESCTO * 100 + "%. "
                + " Valor Con Descuento: $" + valorConDescuento);

        System.out.println("");
        System.out.println("******* EJERCICIO 4 ********\n");

        /*
        Como vamos a setear el peso desde el método calcularPrecioPorTamano(), tenemos varias opciones:
        1) Podemos dejar el precio base igual a todas las pizzas y en el método calcularPrecioPorTamano() podríamos agregarle un monto extra de acuerdo con el tamaño.
        2) Podemos crear las pizzas con un constructor vacío y setear todo menos el precio. Quedará automáticamente en 0-
        3) Usamos el constructor con parámetros que ya tenemos y mandamos el precio en 0.
        4) Creamos un cosntructor que permita agregar todo menos el precio, este quedará automáticamente en 0.
        Aquí implementaré la 4 opción.
         */
        Pizza pizzaEjercicio5QuesoAzul = new Pizza("Queso Azul", "L", "Delgada");

        double precioPizzaPorTamanio = pizzaEjercicio5QuesoAzul.calcularPrecioPorTamanio();

        System.out.println("precioPizzaPorTamanio = " + precioPizzaPorTamanio);

        pizzaEjercicio5QuesoAzul.setTamanio("XL");

        precioPizzaPorTamanio = pizzaEjercicio5QuesoAzul.calcularPrecioPorTamanio();

        System.out.println("precioPizzaPorTamanio = " + precioPizzaPorTamanio);

        pizzaEjercicio5QuesoAzul.setTamanio("otro");

        precioPizzaPorTamanio = pizzaEjercicio5QuesoAzul.calcularPrecioPorTamanio();

        System.out.println("precioPizzaPorTamanio = " + precioPizzaPorTamanio);

        System.out.println("");
        System.out.println("******* EJERCICIO 4 ********\n");

        //Creamos las pizzas
        Pizza pizza1 = new Pizza("Queso Azul", "L", "Delgada");
        Pizza pizza2 = new Pizza("Peperoni", "XL", "Delgada");
        
        //Creamos el pedido vacío ya que se llenará con los métodos
        Pedido pedido = new Pedido();
        
        //Definimos el pedido con delivery
        pedido.setTieneDelivery(true);
        
        Cliente ana = new Cliente("Ana María", pedido);
        
        pedido.calcularTotal(pizza1, pizza2);
        pedido.mostrarResumen(ana);

    }

}
