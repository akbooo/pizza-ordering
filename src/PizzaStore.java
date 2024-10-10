import java.util.ArrayList;
import java.util.List;
import java.lang.String;
public class PizzaStore {
    List<Customer> customers;
    List<Pizza> pizzas;
    String storeLocation;
    String storeName;
    int storeId;
    public PizzaStore(){
        this.pizzas = new ArrayList<>();
    }
    public PizzaStore(List<Pizza> pizzas, int storeId, String storeName, String storeLocation){
        this.pizzas = new ArrayList<>();
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeLocation = storeLocation;
    }
    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }
    public void deletePizza(Pizza pizza){
        pizzas.remove(pizza);
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int newStoreId) {
        this.storeId = newStoreId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String newStoreName) {
        this.storeName = newStoreName;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String newStoreLocation) {
        this.storeLocation = newStoreLocation;
    }
    public List<Pizza> getPizzas(){
        return pizzas;
    }
    public void setPizzas(List<Pizza> newPizzas){
        this.pizzas = newPizzas;
    }
    public List<Customer> getCustomers(){
        return customers;
    }
    public void setCustomers(List<Customer> newCustomers){
        this.customers = newCustomers;
    }
}
