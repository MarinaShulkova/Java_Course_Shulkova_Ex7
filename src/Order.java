public class  Order <T> implements Printable{
    private T id;
    private int cost;
    private int weight;
    private String status;
    public Order(T id, int cost, int weight, String status) {
        this.id = id;
        this.cost = cost;
        this.weight = weight;
        this.status = status;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void print() {
        System.out.printf("Order ID: %s, order cost: %d, order weight: %d, order status: %s", id, cost, weight, status);
    }
}

