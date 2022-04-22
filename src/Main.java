public class Main {

    public static void main(String[] args) {

        Order order = new Order(12, 34, 12, "Created");
        Order order_equals = new Order(12, 34, 12, "Created");

        Client client = new Client("Vasya", order);
        Employee employee = new Employee(order, client);

        System.out.println(order.equals(order_equals));
        order.setOrder(order.makeOrder(order.order));
        order.setStatus(order.makeOrder(order.status));
        System.out.println(order.order);
        System.out.println(order.status);
        client.print(order);
        System.out.println();
        employee.print(order);
        System.out.println();

        System.out.println(order.hashCode());


    }
}






