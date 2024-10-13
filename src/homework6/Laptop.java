package homework6;

public class Laptop extends Product {
    private String processor;
    private int ram;
    private int storage;
    private double screenSize;
    private boolean hasTouchscreen;

    public Laptop(int id, String name, String brand, double price, int stock, boolean availability, String processor, int ram, int storage, double screenSize, boolean hasTouchscreen) {
        super(id, name, brand, price, stock, availability);
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
        this.hasTouchscreen = hasTouchscreen;
    }

    public double getRam() {
        return ram;
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Процессор: " + processor);
        System.out.println("Оперативная память (RAM): " + ram + " GB");
        System.out.println("Хранилище: " + storage + " GB");
        System.out.println("Размер экрана: " + screenSize + " дюймов");
        System.out.println("Сенсорный экран: " + (hasTouchscreen ? "Да" : "Нет"));
        System.out.println();
    }
}
