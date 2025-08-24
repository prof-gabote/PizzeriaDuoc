package pizzeriaduoc;

public class Cliente {
    
    private String nombre;
    private Pedido pedido;

    public Cliente() {
    }

    public Cliente(String nombre, Pedido pedido) {
        this.nombre = nombre;
        this.pedido = pedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    
}
