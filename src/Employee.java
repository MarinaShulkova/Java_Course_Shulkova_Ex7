public class Employee extends Order {

    public Employee() {
    }

    @Override
    public String MakeOrder(String status) {
        switch (status) {
            case "":
                status = "Processing";
                return status;
            case "Processing":
                status = "Sending";
                return status;
            case "Sending":
                status = "Send";
                return status;

            default:
                System.out.println("Processing error");
                break;
        } return status;
    }

    @Override
    public void print (int order, int cost, int weight, String status) {
        System.out.printf("New order: %s, weight: %d kg, order status: %s", order, weight, status);
    }
}