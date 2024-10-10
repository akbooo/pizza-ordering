import java.util.List;
import java.lang.String;

public class PizzaService implements PizzaInterface{
    String pizzaNotFoundMessage;
    PizzaStore pizzaStore;
    public PizzaService(PizzaStore pizzaStore){
        this.pizzaStore = pizzaStore;
    }
    public void addNewPizza(Pizza pizza){
        pizzaStore.addPizza(pizza);
    }
    public void deletePizza(Pizza pizza){
        pizzaStore.deletePizza(pizza);
    }

    @Override
    public Pizza getPizzaByName() {
        return null;
    }

    @Override
    public Pizza getPizzaById() {
        return null;
    }

    @Override
    public Pizza getPizzaBySize() {
        return null;
    }

    @Override
    public Pizza orderNewPizza() {
        return null;
    }

    public Pizza updatePrice(Pizza pizza, double newPrice){
        pizza.setPrice(newPrice);
        return pizza;
    }
    @Override
    public List<Pizza> getPizzas(){
        return pizzaStore.getPizzas();
    }

    @Override
    public Pizza updatePrice() {
        return null;
    }

    @Override
    public void deletePizza() {

    }

    @Override
    public Pizza addNewPizza() {
        return null;
    }

    public Pizza orderNewPizza(Pizza pizza, Customer customer){
        Order order = new Order(pizza.getPrice(), pizza.toString());
        customer.addOrder(order);
        return pizza;
    }

    public Pizza getPizzaByName(String pizzaName){
        List<Pizza> pizzas = pizzaStore.getPizzas();
        for(Pizza i : pizzas) {
            if (i.getPizzaName().equals(pizzaName)) {
                return i;
            }
        }
        return null;
    }
    public Pizza getPizzaById(int pizzaId) {
        List<Pizza> pizzas = pizzaStore.getPizzas();
        for (Pizza i : pizzas) {
            if (i.getPizzaId() == pizzaId) {
                return i;
            }
        }
        return null;
    }
    public Pizza getPizzaBySize(String size){
        List<Pizza> pizzas = pizzaStore.getPizzas();
        for(Pizza i : pizzas) {
            if (i.getSize().equals(size)) {
                return i;
            }
        }
        return null;
    }
}
