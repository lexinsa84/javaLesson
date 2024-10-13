package homework6;

public abstract class Product {
    private int id;
    private String name;
    private String brand;
    private double price;
    private int stock; // Количество товаров в наличии
    private boolean available;

    public Product(int id, String name, String brand, double price, int stock, boolean available) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.stock = stock;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean isAvailable() {
        return available;
    }

    // Обновляем количество товара при покупке
    public void updateStock(int quantity) throws Exception {
        if (quantity > stock) {
            throw new Exception("Недостаточное количество товара на складе.");
        }
        stock -= quantity;
        if (stock == 0) {
            available = false; // Если товара нет, делаем его недоступным
        }
    }

    public void displayProductInfo() {
        System.out.println("ID: " + id + ", Название: " + name + ", Бренд: " + brand + ", Цена: $" + price + ", В наличии: " + stock + ", Доступность: " + (available ? "Да" : "Нет"));
    }
}
