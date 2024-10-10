import java.util.List;

public interface PizzaInterface{
    public Pizza getPizzaByName();
    public Pizza getPizzaById();
    public Pizza getPizzaBySize();
    public Pizza orderNewPizza();
    public List<Pizza> getPizzas();
    public Pizza updatePrice();
    public void deletePizza();
    public Pizza addNewPizza();
}