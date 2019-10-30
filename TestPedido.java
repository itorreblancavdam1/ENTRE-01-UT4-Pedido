
/**
 *  Clase para probar el resto de clases
 *  
 */
public class TestPedido
{
    private Pedido pedido1; 
    private Pedido pedido2; 

    /**
     * Constructor  
     */
    public TestPedido()    {
        // crear pedido1
        Fecha fecha1 = new Fecha(4, 9, 2019);
        Cliente cliente1 = new Cliente("Juan Soto", "Avda. Pio XII", "Pamplona", "Navarra");
        Producto producto1 = new Producto("Rotulador fosforescente", 6.7);
        Producto producto2 = new Producto("Memoria USB 64GB", 14.8);
        LineaPedido linea1 = new LineaPedido(producto1, 20);
        LineaPedido linea2 = new LineaPedido(producto2, 10);
        pedido1 = new Pedido(fecha1, cliente1, linea1, linea2);


        // crear pedido2
        Fecha fecha2 = new Fecha(4, 9, 2019);
        Cliente cliente2 = new Cliente("Elisa Nuin","C/ Rio Alzania 7","Pamplona","Navarra");
        Producto producto3= new Producto("Sacapuntas manual",16.64);
        Producto producto4 = new Producto("Corrector Tippex",5.99);
        LineaPedido linea12 = new LineaPedido(producto3, 20);
        LineaPedido linea22 = new LineaPedido(producto4, 10);
        pedido2 = new Pedido(fecha2, cliente2, linea12, linea22);

    }

    /**
     * Muestra la información de los dos pedidos (ver enunciado)
     */
    public void mostrarPedidos() {
        System.out.print("Pedido 1");
        System.out.println(pedido1.toString());
        System.out.print("Pedido 2");
        System.out.println(pedido2.toString());

        if(pedido1.masAntiguoQue(pedido2)){
            System.out.println("El pedido 1 se a realazado antes que el pedido 2");
        }
        else 
        {
            System.out.println("El pedido 2 se a realazado antes que el pedido 1");
        }
    }
}
