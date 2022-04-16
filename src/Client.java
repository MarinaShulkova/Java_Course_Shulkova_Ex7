public class Client<T> extends Person implements Printable{


    public Client() {
    }

    @Override
    public void print(T username, int id_client, Order  order) {
        System.out.printf("Dear, %s! Your order %s, cost: %d, order status: %s", username, order.getId(), order.getCost(), order.getStatus());

    }

  }
