import static java.lang.Integer.parseInt;

public class Client<T> extends Order{
    private T client;

    public Client(T client) {
        this.client = client;
    }

    @Override
    public String MakeOrder(String order) {
        int order1 = parseInt(order) + 1;
        return Integer.toString(order1);
    }

    @Override
    // переопределяем print() из интерфейса Printable
    public void print(int order, int cost, int weight, String status) {
        System.out.printf("Dear, %s! Your order number %s, cost: %d rub", client, order, cost);
    }

/*    @Override
    public String toString() {
        return String.valueOf(client);
    }

    public T getClient() {
        return client;
    }*/
}