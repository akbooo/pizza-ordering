import java.lang.String;
public class Topping extends Pizza {
    String description;
    String spiceLevel;
    String toppingName;
    public Topping(){}
    public Topping(String toppingName, String spiceLevel, String description){
        this.toppingName = toppingName;
        this.spiceLevel = spiceLevel;
        this.description = description;
    }
    public String getToppingName(){
        return toppingName;
    }
    public void setToppingName(String newToppingName){
        this.toppingName = newToppingName;
    }
    public String getSpiceLevel(){
        return spiceLevel;
    }
    public void setSpiceLevel(String newSpiceLevel){
        this.spiceLevel = newSpiceLevel;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "description='" + description + '\'' +
                ", spiceLevel='" + spiceLevel + '\'' +
                ", toppingName='" + toppingName + '\'' +
                '}';
    }
}
