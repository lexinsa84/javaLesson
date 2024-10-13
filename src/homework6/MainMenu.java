package homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    private List<Product> products;
    private Basket basket;
    private Scanner scanner;
    private FilterMenu filterMenu;

    public MainMenu() {
        products = new ArrayList<>();
        basket = new Basket();
        scanner = new Scanner(System.in);

        products.add(new Laptop(1, "Dell XPS 15", "Dell", 1500.0, 10, true, "Intel i7", 16, 512, 15.6, true));
        products.add(new Laptop(2, "MacBook Pro", "Apple", 2500.0, 5, true, "Apple M1", 16, 512, 13.3, false));

        filterMenu = new FilterMenu(products);
    }

    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Главное меню ---");
            System.out.println("1. Показать все товары");
            System.out.println("2. Фильтровать товары");
            System.out.println("3. Добавить товар в корзину");
            System.out.println("4. Просмотреть корзину");
            System.out.println("5. Очистить корзину");
            System.out.println("6. Оформить заказ");
            System.out.println("7. Выйти");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        displayAllProducts();
                        break;
                    case 2:
                        filterMenu.startMenu();
                        break;
                    case 3:
                        addToBasket();
                        break;
                    case 4:
                        basket.viewBasket();
                        break;
                    case 5:
                        basket.clearBasket();
                        break;
                    case 6:
                        placeOrder();
                        break;
                    case 7:
                        exit = true;
                        System.out.println("Выход из приложения.");
                        break;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                scanner.nextLine(); // Очищаем сканер от некорректного ввода
            }
        }
    }

    private void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Нет доступных товаров.");
        } else {
            System.out.println("\nДоступные товары:");
            products.forEach(Product::displayProductInfo);
        }
    }

    private void addToBasket() {
        try {
            System.out.print("Введите ID товара для добавления в корзину: ");
            int productId = scanner.nextInt();
            scanner.nextLine();

            Product selectedProduct = null;
            for (Product product : products) {
                if (product.getId() == productId) {
                    selectedProduct = product;
                    break;
                }
            }

            if (selectedProduct != null) {
                basket.addProduct(selectedProduct);
                System.out.println("Товар добавлен в корзину.");
            } else {
                throw new Exception("Товар с таким ID не найден.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            scanner.nextLine();
        }
    }

    private void placeOrder() {
        try {
            basket.checkout(); // Оформляем заказ и обновляем товары
        } catch (Exception e) {
            System.out.println("Ошибка при оформлении заказа: " + e.getMessage());
        }
    }
}
