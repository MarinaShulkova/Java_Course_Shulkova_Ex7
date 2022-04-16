public class Employee extends  Person implements Printable {

    public Employee() {
    }

    @Override
    void print(int id_client, Order order) {
        System.out.printf("ID Client: %d, order: %s, cost: %d, weight: %d, order status: %s", id_client, order.getId(), order.getCost(), order.getWeight(), order.getStatus());

    }
}

