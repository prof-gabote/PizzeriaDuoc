package pizzeriaduoc;

class Pedido {

    private String detallePizzas;
    private double totalPagar;
    private boolean tieneDelivery;
    private double DESCTO_PROMOCIONAL = 0.10;

    //Constructores
    public Pedido() {
    }

    public Pedido(String detallePizza, double totalPagar, boolean tieneDelivery) {
        this.detallePizzas = detallePizza;
        this.totalPagar = totalPagar;
        this.tieneDelivery = tieneDelivery;
    }

    //Getters Setters
    public String getDetallePizzas() {
        return detallePizzas;
    }

    public void setDetallePizzas(String detallePizzas) {
        this.detallePizzas = detallePizzas;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public boolean isTieneDelivery() {
        return tieneDelivery;
    }

    public void setTieneDelivery(boolean tieneDelivery) {
        this.tieneDelivery = tieneDelivery;
    }

    //Custom
    public double calcularTotal(Pizza pizza1, Pizza pizza2) {

        double totalbruto = pizza1.calcularPrecioPorTamanio() + pizza2.calcularPrecioPorTamanio();
        double dscto = 0;

        if (totalbruto > 15000) {
            dscto = totalbruto * DESCTO_PROMOCIONAL;
        }

        /*
        Podemos usar String para guardar info concatenada de lo que se pidió.
        Esto lo usaremos para el resumen.
         */
        this.detallePizzas = "***** Detalle de compra *****\n"
                + "- " + pizza1.getNombre() + " " + pizza1.getTamanio() + " $" + pizza1.calcularPrecioPorTamanio() + "\n"
                + "- " + pizza1.getNombre() + " " + pizza2.getTamanio() + " $" + pizza2.calcularPrecioPorTamanio() + "\n"
                + "Subtotal: $" + (int) totalbruto + "\n"
                + "Dscto aplicado: " + (int) (this.DESCTO_PROMOCIONAL * 100) + "%\n"
                + "Monto con dscto: $" + (int) (totalbruto - dscto);

        /*
        Podemos ahorrarnos un IF con operadores ternarios. Lo que dice aquí es:
        Es tieneDelivery verdadero ? (Si sí) totalbruto - dscto + 3000 : (Si no) totalbruto - dscto
        Funciona así: variable u operación true/false ? valorSiVerdadero : valorSiFalso;
        */
        this.totalPagar = tieneDelivery ? totalbruto - dscto + 3000 : totalbruto - dscto;
        
        return totalPagar;
    }

    public void mostrarResumen(Cliente cliente) {
        System.out.println("******* RESUMEN VENTA *******");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println(detallePizzas);
        System.out.println("TOTAL A PAGAR: $" + (int) this.totalPagar);
    }

}
