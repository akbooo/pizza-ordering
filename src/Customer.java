import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class Customer extends Address {
    private static int lastId = 0;
    List<Order> orders;
    Address address;
    long mobile;
    String email;
    String customerName;
    int customerId;

    public Customer(String customerName, String email, long mobile, Address address){
        this.customerName = customerName;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.customerId = ++lastId;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order){
        orders.add(order);
        System.out.println("Successfully order added to ordering list.");
    }
//    public double getPayableAmount(){}

    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int newCustomerId) {
        this.customerId = newCustomerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String newCustomerName) {
        this.customerName = newCustomerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long newMobile) {
        this.mobile = newMobile;
    }
    public Address getAddress(){
        return address;
    }
    public void setAddress(Address newAddress){
        this.address = newAddress;
    }
    public List<Order> getOrders(){
        return orders;
    }
    public void setOrders(List<Order> newOrders){
        this.orders = newOrders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "orders=" + orders +
                ", address=" + address +
                ", mobile=" + mobile +
                ", email='" + email + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerId=" + customerId +
                '}';
    }
}
