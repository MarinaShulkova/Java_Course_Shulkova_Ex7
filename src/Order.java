public class Order implements MakeOrder {
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
// Переопределение метода makeOrder(): формирование нового номера заказа
    @Override
    public int makeOrder(int order) {
        order = order + 1;
        return order;
    }

// Переопределение метода makeOrder(): изменение статуса заказа
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

// переопределение методов Object
    @Override
    public int hashCode() {

        System.out.print("@Override hashCode method: ");
        return super.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        Order order = (Order) obj;
        System.out.print("@Override equals method: ");
        return this.order == order.order && this.cost == order.cost && this.weight == order.weight && this.status.equals(order.status);
    }

    @Override
    public String toString() {
        return "@Override toString method: order = " + order + ", cost = " + cost + ", weight = " + weight + ", status = " + status;
    }
}