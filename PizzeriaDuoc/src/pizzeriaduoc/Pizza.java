package pizzeriaduoc;

public class Pizza {

    private String nombre;
    private String tamanio;
    private String masa;
    private double precioBase;

    //Constructores
    public Pizza() {
    }

    public Pizza(String nombre, String tamanio, String masa, double precio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.masa = masa;
        this.precioBase = precio;
    }

    //Podemos tener muchos constructores con diferentes parámetros. Este es para el ejercicio 5
    public Pizza(String nombre, String tamanio, String masa) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.masa = masa;
    }

    //Getter Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
    //Custom
    
    public void preparar(){
        System.out.println("Preparando la pizza " + this.nombre);
    }
    
    public void calentar(){
        System.out.println("Calentando la pizza " + this.nombre);
    }
    
    public void describir(){
        System.out.println("**** Detalle Pizza ****");
        System.out.println("- Nombre: " + this.nombre);
        System.out.println("- Tamaño: " + this.tamanio);
        System.out.println("- Tipo de masa: " + this.masa);
        System.out.println("- Precio: $" + ((int) this.precioBase)); // con ((tipoDato) variale) convertimos el dato a int para mostrarlo sin 0
    }
    
    public double calcularPrecioFinal (double descuento){
        /*
        Si el descuento es de 30%, esto equivale a 0.3.
        Cuando a 1 le restamos el descuento, lo que se hace es pensar en un 100% (total del producto) y restarle el descuento (30%),
        lo que nos indica que el precio total del producto es del 70% del precio original.
        En decimales, queda así: 1 (100%) - 0.3 (descuento del 30%) = 0,7 del precio (70%).
        */
        double valorConDescuento = this.precioBase * (1 - descuento);
        return valorConDescuento;
    }
    
    public double calcularPrecioPorTamanio(){
        /*
        Las cadenas no las podemos comparar con "==" como en Python. Debemos usar el método equals.
        */
        if (this.tamanio.equalsIgnoreCase("M")) {
            this.precioBase = 5000;
            return this.precioBase;
        }
        if (this.tamanio.equalsIgnoreCase("L")) {
            this.precioBase = 8000;
            return this.precioBase;
        }
        if (this.tamanio.equalsIgnoreCase("XL")) {
            this.precioBase = 10000;
            return this.precioBase;
        }
        
        return 0;
    }
}
