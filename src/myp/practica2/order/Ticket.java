package myp.practica2.order;

import java.util.Scanner;
/**
 * Clase para tickets.
 */
public class Ticket {
    /*Representacion en cadena del ticket */
    private String receipt;
    
    /**
     * Constructor principal de la clase Ticket
     * @param order de la cual se quiere crear el ticket.
     */
    public Ticket(Order order){
        this.receipt = createReceipt(order);
    }

    /**
     * Regresa una representacion en cadena del ticket.
     * @return una representacion en cadena del ticket.
     */
    public String toString(){
        if (receipt == null) throw new NoSuchElementException("La orden es vacia.");

        return receipt;
    }

    /**
     * Metodo auxiliar que crea una representacion en cadena (recibo) de una orden dada. Se presupone que la orden
     * contiene al menos un elemento definido (pizza o helado). 
     * @param order orden con la cual se va a crear el recibo.
     * @return un representacion en cadena de la orden.
     */
    private String createReceipt(Order order){
        StringBuilder sb = new StringBuilder();
        Pizza pizza = order.getPizza();
        IceCream iceCream = order.getIceCream();
        
        if (pizza != null){
            sb.append(pizza.getDescription());
            sb.append("-: "+ pizza.getPrice()+ "$");
            sb.append();
        }

        if (iceCream != null){
            sb.append(iceCream.getDescription());
            sb.append("-: "+ IceCream.getCost()+ "$");
            sb.append();
        }
        return sb.toString();
    }

    
}
