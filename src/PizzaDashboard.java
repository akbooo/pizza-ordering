import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public final class PizzaDashboard {
    static Scanner sc = new Scanner(System.in);
    static PizzaService pizzaService = new PizzaService(new PizzaStore());
    static Customer customer;

    public static void main(String[] args) {
        mainMenuOfPizzaDashBoard();
    }

    public static void mainMenuOfPizzaDashBoard() {
        System.out.println("Welcome to Annisa!");
        boolean exe = true;

        do {
            try {
                mainestMenu();
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Welcome to ADMIN role!");
                        openAdminRole();
                        exe = false;
                        break;
                    case 2:
                        System.out.println("Welcome to Customer Console!!");
                        openCustomerRole();
                        exe = false;
                        break;
                    default:
                        System.out.println("No such option!!!");
                }
            } catch (InputMismatchException var2) {
                System.out.println("Only integer between 1-2!!!");
                sc.nextLine();
            }
        } while(exe);

    }

    public static void mainestMenu() {
        System.out.println("Choose your role to login: ");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
    }

    public static void openAdminRole() {
        boolean exe1 = true;

        label48:
        do {
            mainMenuOfAdmin();

            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println(" >> Add new pizza menu << ");
                        boolean c = true;
                        Topping topping = new Topping();
                        System.out.print("Enter Topping name: ");
                        sc.nextLine();
                        String s1 = sc.nextLine();
                        topping.setToppingName(s1);
                        boolean validSpiceLevel;
                        do{
                            System.out.print("Enter Topping spice level(basic, mediate, full): ");
                            String s2 = sc.nextLine();
                            validSpiceLevel = isValidSpiceLevel(s2);
                            topping.setSpiceLevel(s2);
                            if (!validSpiceLevel) {
                                System.out.println("Invalid spice level. Valid options are: basic, mediate, full.");
                            }
                        }while(!validSpiceLevel);
                        System.out.print("Enter description for Topping: ");
                        String s3 = sc.nextLine();
                        topping.setDescription(s3);
                        System.out.println("==========================");
                        PizzaBase base = new PizzaBase();
                        System.out.print("Enter Base name: ");
                        String s4 = sc.nextLine();
                        base.setBaseName(s4);
                        boolean validType;
                        do {
                            System.out.print("Enter type(thin, thick): ");
                            String s5 = sc.next();
                            validType = isValidPizzaType(s5);
                            base.setBaseType(s5);
                            if (!validType) {
                                System.out.println("Invalid pizza type. Valid options are: thin, thick.");
                            }
                        } while (!validType);
                        System.out.print("Enter description for base: ");
                        String s6 = sc.next();
                        base.setDescription(s6);
                        System.out.println("===============================");
                        Pizza pizza = new Pizza();
                        System.out.print("Enter pizza name: ");
                        sc.nextLine();
                        String s7 = sc.nextLine();
                        pizza.setPizzaName(s7);
                        System.out.print("Enter pizza Price: ");
                        Double s8 = sc.nextDouble();
                        pizza.setPrice(s8);
                        boolean validSize;
                        do {
                            System.out.print("Enter type(small, medium, large): ");
                            String s9 = sc.next();
                            validSize = isValidPizzaSize(s9);
                            pizza.setSize(s9);
                            if (!validSize) {
                                System.out.println("Invalid pizza type. Valid options are: small, medium, large.");
                            }
                        } while (!validSize);
                        pizza.setTopping(topping);
                        pizza.setPizzaBase(base);
                        pizzaService.addNewPizza(pizza);
                        System.out.println("New pizza successfully added to the menu!");
                        System.out.println(pizza.toString());
                        break;
                    case 2:
                        List<Pizza> pizs = pizzaService.getPizzas();
                        if(pizs.isEmpty()){
                            System.out.println("There is no pizza to upgrade price to.");
                        }
                        else{
                            System.out.println(" >> Upgrading price menu << ");
                            System.out.print("Enter the name of pizza: ");
                            sc.nextLine();
                            String name = sc.nextLine();
                            System.out.print("Enter the new price: ");
                            int newPrice = sc.nextInt();
                            Pizza answer = pizzaService.getPizzaByName(name);
                            pizzaService.updatePrice(answer, (double)newPrice);
                            System.out.println("Price successfully updated. ");
                            System.out.println(answer.toString());
                        }
                        break;
                    case 3:
                        List<Pizza> pizss = pizzaService.getPizzas();
                        if(pizss.isEmpty()){
                            System.out.println("There is no pizza to delete to.");
                        }
                        else{
                            System.out.println(" >> Deleting pizza menu << ");
                            System.out.print("Enter the name of pizza: ");
                            sc.nextLine();
                            String nameForSearch = sc.nextLine();
                            Pizza found = pizzaService.getPizzaByName(nameForSearch);
                            pizzaService.deletePizza(found);
                            System.out.println("Pizza successfully deleted.");
                        }
                        break;
                    case 4:
                        List<Pizza> forMenu = pizzaService.getPizzas();
                        if (forMenu.isEmpty()) {
                            System.out.println("There is no pizza in menu.");
                        }
                        else{
                            System.out.println(" >> All pizzas in menu <<");
                            for(Pizza p : forMenu){
                                System.out.println(p);
                            }
                        }
                        break;
                    case 5:
                        searchingMenu();
                        break;
                    case 6:
                        mainMenuOfPizzaDashBoard();
                        break;
                    default:
                        System.out.println("No such option!!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter only integers between 1-6!!!");
                sc.nextLine();
            }
        } while(exe1);

    }

    public static void searchingMenu() {
        List<Pizza> pizza = pizzaService.getPizzas();
        if (pizza.size()<=0) {
            System.out.println("There is no pizza in menu to search for.");
            return;
        }

        System.out.println(" >> Searching for pizza menu << ");
        System.out.println("1. Search by Name");
        System.out.println("2. Search by Id");
        System.out.println("3. Search by Size");
        System.out.print("How to search?: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                boolean k = true;
                do {
                    try {
                        System.out.println("Enter the name: ");
                        String s4 = sc.nextLine();
                        Pizza p1 = pizzaService.getPizzaByName(s4);
                        System.out.println(p1.toString());
                        k = false;
                    } catch (Exception e) {
                        System.out.println("Have not found! Try again: ");
                    }
                }while(k);
                break;
            case 2:
                boolean j = true;
                do {
                    try {
                        System.out.println("Enter the Id:");
                        int forId = sc.nextInt();
                        Pizza p2 = pizzaService.getPizzaById(forId);
                        j = false;
                    }catch(Exception e){
                        System.out.println("Have not found! Try again: ");
                    }
                }while(j);
                break;
            case 3:
                boolean g = true;
                do {
                    try {
                        System.out.println("Enter the size: ");
                        String s5 = sc.nextLine();
                        Pizza p3 = pizzaService.getPizzaBySize(s5);
                        System.out.println(p3.toString());
                        g = false;
                    }catch(Exception e){
                        System.out.println("Have not found! Try again:");
                    }
                }while(g);
                break;
            default:
                System.out.println("Do not have such option.");
        }

    }

    public static void mainMenuOfAdmin() {
        System.out.println("Choose an option: ");
        System.out.println("1. Add pizza");
        System.out.println("2. Update price");
        System.out.println("3. Delete pizza");
        System.out.println("4. View all pizzas");
        System.out.println("5. Search for pizza");
        System.out.println("6. Exit");
    }

    public static void openCustomerRole() {
        boolean is = true;

        do {
            try {
                System.out.println("Enter your doorNumber: ");
                sc.nextLine();
                int doorNumber = sc.nextInt();
                System.out.println("Enter your street: ");
                String street = sc.next();
                System.out.println("Enter your city: ");
                String city = sc.next();
                System.out.println("Enter your district: ");
                String district = sc.next();
                System.out.println("Enter your state: ");
                String state = sc.next();

                Address a = new Address(doorNumber, street, city, district, state);

                System.out.println("Enter your name: ");
                sc.nextLine();
                String name = sc.next();
                System.out.println("Enter your email: ");
                String email = sc.next();
                System.out.println("Enter your mobile: ");
                int mobile = sc.nextInt();

                customer = new Customer(name, email, mobile, a);
                System.out.println("Thank you for sharing your information! You are added to Annisa's Customers list.");
                System.out.println(customer);
                is = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Information is not full!");
            }
        } while (is);
        while (true) {
            mainMenuOfCustomer();
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println(" >> Ordering menu << ");
                    System.out.println("Available pizzas: ");
                    List<Pizza> forMenu = pizzaService.getPizzas();
                    for (Pizza i : forMenu) {
                        System.out.println("[" + i.toString() + "]");
                    }
                    System.out.print("Enter the name of pizza you want to order: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    Pizza toOrder = pizzaService.getPizzaByName(name);
                    pizzaService.orderNewPizza(toOrder, customer);
                    break;
                case 2:
                    List<Order> toPay = customer.getOrders();
                    if (toPay.isEmpty()) {
                        System.out.println("You have not ordered yet!");
                    } else {
                        double sum = 0;
                        for (Order i : toPay) {
                            sum += i.getPayableBillAmount();
                        }
                        System.out.println("Your payable bill amount for all your orders is: " + sum);
                    }
                    break;
                case 3:
                    forMenu = pizzaService.getPizzas();
                    if (forMenu.isEmpty()) {
                        System.out.println("There is no pizza in menu.");
                    } else {

                        System.out.println(" >> Available pizzas in menu <<");
                        for (Pizza i : forMenu) {
                            System.out.println(i);
                        }
                    }
                    break;

                case 4:
                    List<Order> ness = customer.getOrders();
                    if (ness.isEmpty()) {
                        System.out.println("You have not ordered yet.");
                    } else {
                        System.out.println("You ordered: ");
                        for (Order i : ness) {
                            System.out.println(i);
                        }
                    }
                    break;
                case 5:
                    searchingMenu();
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    System.out.println("No such option!");
            }
        }
    }

    public static void mainMenuOfCustomer() {
        System.out.println("Choose an Option: ");
        System.out.println("1. Order Pizza");
        System.out.println("2. Pay bill");
        System.out.println("3. View all pizza");
        System.out.println("4. View your orders");
        System.out.println("5. Search Pizza");
        System.out.println("6. Exit");
    }
    public static boolean isValidSpiceLevel(String spiceLevel) {
        spiceLevel = spiceLevel.trim().toLowerCase();

        return spiceLevel.equals("basic") || spiceLevel.equals("mediate") || spiceLevel.equals("full");
    }

    public static boolean isValidPizzaType(String type) {
        type = type.trim().toLowerCase();

        return type.equals("thin") || type.equals("thick");
    }

    public static boolean isValidPizzaSize(String size) {
        size = size.trim().toLowerCase();

        return size.equals("small") || size.equals("medium") || size.equals("large");
    }
}