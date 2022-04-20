import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
    int order = 12;
    int cost = 34;
    int weight = 12;
    String status = "";

        Order client = new Client("Vasya");
        Order employee = new Employee();

        order = parseInt(client.MakeOrder(Integer.toString(order)));
        status = employee.MakeOrder(status);

        client.print(order, cost, weight, status);
        System.out.println();
        employee.print(order, cost, weight, status);

 //       System.out.println(client.toString());

    }
}