public class Main {

    public static void main(String[] args) {

        Order order = new Order(12, 34, 12, "Created");
        Order order_equals = new Order(12, 34, 12, "Created");

        Client client = new Client("Vasya", order);
        Employee employee = new Employee(order, client);

//вызов метода makeOrder()
        order.setOrder(order.makeOrder(order.order));
        order.setStatus(order.makeOrder(order.status));

// вызов метода print()
        client.print(order);
        System.out.println();

        employee.print(order);
        System.out.println();
        System.out.println();


// переопределение классов Object
        System.out.println(order.hashCode());
        System.out.println(order.equals(order_equals));
        System.out.println(order.toString());
    }
}






