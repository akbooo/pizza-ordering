import java.lang.String;

public class Pizza {
    private static int lastId = 0;
    PizzaBase pizzaBase;
    Topping topping;
    String size;
    double price;
    String pizzaName;
    int pizzaId;

    public Pizza(String pizzaName, double price, String size, Topping topping, PizzaBase pizzaBase){
        this.pizzaId = ++lastId;
        this.pizzaName = pizzaName;
        this.price = price;
        this.size = size;
        this.topping = topping;
        this.pizzaBase = pizzaBase;
    }

    public Pizza() {
    }

    public int getPizzaId(){
        return pizzaId;
    }
    public void setPizzaId(int newId){
        this.pizzaId = newId;
    }
    public String getPizzaName(){
        return pizzaName;
    }
    public void setPizzaName(String newName){
        this.pizzaName = newName;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public String getSize(){
        return size;
    }
    public void setSize(String newSize){
        this.size = newSize;
    }
    public Topping getTopping(){
        return topping;
    }
    public void setTopping(Topping newTopping){
        this.topping = newTopping;
    }
    public PizzaBase getPizzaBase(){
        return pizzaBase;
    }
    public void setPizzaBase(PizzaBase newPizzaBase){
        this.pizzaBase = newPizzaBase;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaBase=" + pizzaBase +
                ", topping=" + topping +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", pizzaName='" + pizzaName + '\'' +
                ", pizzaId=" + pizzaId +
                '}';
    }
}