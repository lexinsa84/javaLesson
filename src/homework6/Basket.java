package homework6;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product) throws Exception {
        if (!product.isAvailable()) {
            throw new Exception("Товар недоступен для покупки.");
        }
        if (items.contains(product)) {
            throw new Exception("Товар уже добавлен в корзину.");
        }
        items.add(product);
    }

    public void viewBasket() {
        if (items.isEmpty()) {
            System.out.println("Корзина пуста.");
        } else {
            System.out.println("Товары в корзине:");
            items.forEach(Product::displayProductInfo);
        }
    }

    public void clearBasket() {
        items.clear();
        System.out.println("Корзина очищена.");
    }

    public List<Product> getItems() {
        return items;
    }

    // Метод для оформления заказа и обновления количества товара
    public void checkout() throws Exception {
        if (items.isEmpty()) {
            throw new Exception("Корзина пуста.");
        }

        for (Product product : items) {
            product.updateStock(1); // Обновляем количество товара (предполагаем, что покупаем по 1 единице каждого товара)
        }

        clearBasket();
        System.out.println("Заказ оформлен.");
    }
}
