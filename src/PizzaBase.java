import java.lang.String;
public class PizzaBase extends Pizza{
    String description;
    String baseType;
    String baseName;
    public PizzaBase(){}

    public PizzaBase(String baseName,String baseType, String description){
        this.baseName = baseName;
        this.baseType = baseType;
        this.description = description;
    }
    public String getBaseName(){
        return baseName;
    }
    public void setBaseName(String newBaseName) {
        this.baseName = newBaseName;
    }
    public String getBaseType() {
        return baseType;
    }
    public void setBaseType(String newBaseType){
        this.baseType = newBaseType;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    @Override
    public String toString() {
        return "PizzaBase{" +
                "description='" + description + '\'' +
                ", baseType='" + baseType + '\'' +
                ", baseName='" + baseName + '\'' +
                '}';
    }
}
