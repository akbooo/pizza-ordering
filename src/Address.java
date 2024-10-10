import java.lang.String;
public class Address {
    String state;
    String district;
    String city;
    String street;
    int doorNumber;

    public Address(int doorNumber, String street, String city, String district,String state){
        this.doorNumber = doorNumber;
        this.street = street;
        this.city = city;
        this.district = district;
        this.state = state;
    }
    public Address(){}

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int newDoorNumber) {
        this.doorNumber = newDoorNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String newStreet) {
        this.street = newStreet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String newCity) {
        this.city = newCity;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String newDistrict) {
        this.district = newDistrict;
    }

    public String getState() {
        return state;
    }

    public void setState(String newState) {
        this.state = newState;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", doorNumber=" + doorNumber +
                '}';
    }
}
