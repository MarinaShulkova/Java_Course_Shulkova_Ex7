public class Order implements MakeOrder{
    public int order;
    public int cost;
    public int weight;
    public String status;

    public Order(int order, int cost, int weight, String status) {
        this.order = order;
        this.cost = cost;
        this.weight = weight;
        this.status = status;
    }

    @Override
    public int makeOrder(int order) {
        order = order + 1;
        return order;
    }

    @Override
    public String makeOrder(String status) {
        switch (status) {
            case "Created":
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
        }
        return status;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {

        System.out.println("sleep");
        return super.hashCode();
    }



    @Override
    public boolean equals(Object obj) {
        Order order = (Order) obj;
        System.out.println("@Override equals method");
         return this.order == order.order && this.cost == order.cost && this.weight == order.weight && this.status.equals(order.status);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}