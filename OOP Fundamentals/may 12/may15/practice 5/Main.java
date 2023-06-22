import java.util.ArrayList;
import java.util.List;

class Restaurant {
    private String name;
    private String location;
    private List<Table> tables;
    private Menu menu;

    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
        this.tables = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public void addMenu(Menu menu) {
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }
}

class Pub {
    private String name;
    private String location;
    private List<Table> tables;
    private Menu menu;

    public Pub(String name, String location) {
        this.name = name;
        this.location = location;
        this.tables = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public void addMenu(Menu menu) {
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }
}

// Rest of the code...


class Menu {
    private String name;
    private List<Item> items;

    public Menu(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }
}

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Table {
    private int tableNumber;
    private int capacity;
    private boolean isOccupied;
    private Customer occupyingCustomer;

    public Table(int tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isOccupied = false;
        this.occupyingCustomer = null;
    }

    public int getTableNumber() {
        return tableNumber;
    }
public int getCapacity() {
        return capacity;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Customer getOccupyingCustomer() {
        return occupyingCustomer;
    }

    public void setOccupyingCustomer(Customer occupyingCustomer) {
        this.occupyingCustomer = occupyingCustomer;
        this.isOccupied = (occupyingCustomer != null);
    }

    public void clearOccupyingCustomer() {
        this.occupyingCustomer = null;
        this.isOccupied = false;
    }
}

class Customer {
    private String name;
    private int age;
    private String gender;

    public Customer(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

class Staff {
    private String name;
    private String role;

    public Staff(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a restaurant
        Restaurant restaurant = new Restaurant("The Fine Dine", "123 Main Street");

        // Create a pub
        Pub pub = new Pub("The Cheers Pub", "456 Elm Street");

        // Create a menu for the restaurant
        Menu restaurantMenu = new Menu("Restaurant Menu");

        // Create items for the restaurant menu
        Item item1 = new Item("Steak", 25.99);
        Item item2 = new Item("Salmon", 19.99);

        // Add items to the restaurant menu
        restaurantMenu.addItem(item1);
        restaurantMenu.addItem(item2);

        // Assign the menu to the restaurant
        restaurant.addMenu(restaurantMenu);

        // Create a menu for the pub
        Menu pubMenu = new Menu("Pub Menu");

        // Create items for the pub menu
        Item item3 = new Item("Burger", 12.99);
        Item item4 = new Item("Fish and Chips", 10.99);

        // Add items to the pub menu
        pubMenu.addItem(item3);
        pubMenu.addItem(item4);

        // Assign the menu to the pub
        pub.addMenu(pubMenu);

        // Create tables for the restaurant
        Table table1 = new Table(1, 4);
        Table table2 = new Table(2, 6);

        // Add tables to the restaurant
        restaurant.addTable(table1);
        restaurant.addTable(table2);

        // Create tables for the pub
        Table table3 = new Table(1, 2);
        Table table4 = new Table(2, 4);

        // Add tables to the pub
        pub.addTable(table3);
        pub.addTable(table4);

        // Create a customer
        Customer customer = new Customer("John Doe", 30, "Male");

        // Assign the customer to a table
        table1.setOccupyingCustomer(customer);
        // Print the details
        System.out.println("Restaurant Name: " + restaurant.getName());
        System.out.println("Restaurant Location: " + restaurant.getLocation());
        System.out.println("Restaurant Menu: " + restaurant.getMenu().getName());
        System.out.println("Restaurant Tables: " + restaurant.getTables().size());
        System.out.println("Restaurant Table 1 Occupying Customer: " + table1.getOccupyingCustomer().getName());

        System.out.println();

        // Print the details
        System.out.println("Pub Name: " + pub.getName());
        System.out.println("Pub Location: " + pub.getLocation());
        System.out.println("Pub Menu: " + pub.getMenu().getName());
        System.out.println("Pub Tables: " + pub.getTables().size());

        // Clear the occupying customer from the table
        table1.clearOccupyingCustomer();

        // Print the details
        System.out.println("Restaurant Table 1 Occupying Customer: " + table1.getOccupyingCustomer());

    }
}