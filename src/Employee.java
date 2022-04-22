public class Employee <T extends Order,C extends Client> implements Printable{
    T order;
    C client;
    int order_id;
    int cost;
    int weight;
    String status;
    public Employee(T order, C client) {
        this.client = client;

    }

    @Override
    public void print (Order order) {
        System.out.printf("New order: %s, from client: %s weight: %d lbs, order status changed to: %s", order.order, client.client, weight, order.status);
    }

}