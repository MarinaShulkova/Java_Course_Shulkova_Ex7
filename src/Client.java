public class Client<C, T extends Order> implements Printable{
    private T order;
    C client;
    int order_id;
    int cost;
    int weight;
    String status;

    public Client(C client, T order) {
        this.client = client;
        this.status = order.status;

    }
// переопределение метода print() интерфейса Printable
    @Override
    public void print(Order order) {
        System.out.printf("Dear, %s! Your order number is %d and the cost is %d usd. Your order has sent to our employee. Current status is %s", client, order.order, cost, status);
    }

}