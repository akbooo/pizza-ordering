import java.time.LocalDate;
import java.util.List;
import java.lang.String;
import java.util.List;

public class Order {
    private static int lastId = 0;
    List<Pizza> pizzas;
    String orderDescription;
    double payableBillAmount;
    String orderDate;
    int orderId;

    public Order(){}
    public Order(double payableBillAmount, String orderDescription){
        this.orderDate = String.valueOf(LocalDate.now());
        this.payableBillAmount = payableBillAmount;
        this.orderDescription = orderDescription;
        this.orderId = ++lastId;
    }
    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int newOrderId) {
        this.orderId = newOrderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public double getPayableBillAmount() {
        return payableBillAmount;
    }

    public void setPayableBillAmount(double newPayableBillAmount) {
        this.payableBillAmount = newPayableBillAmount;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String newOrderDescription) {
        this.orderDescription = newOrderDescription;
    }
    public List<Pizza> getPizzas(){
        return pizzas;
    }
    public void setPizzas(List<Pizza> newPizzas) {
        this.pizzas = newPizzas;
    }

    @Override
    public String toString() {
        return "Order{" +
                ", orderDescription='" + orderDescription + '\'' +
                ", payableBillAmount=" + payableBillAmount +
                ", orderDate='" + orderDate + '\'' +
                ", orderId=" + orderId +
                '}';
    }
}
