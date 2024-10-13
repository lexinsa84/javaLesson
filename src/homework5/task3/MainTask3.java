package homework5.task3;

public class MainTask3 {
    public static void main(String[] args) {
        ShoppingBasket shoppingBasket = new ShoppingBasket();

        shoppingBasket.addProduct("Яблоки", 5);
        shoppingBasket.addProduct("Бананы", 3);
        shoppingBasket.addProduct("Апельсины", 7);

        shoppingBasket.displayBasket();

        shoppingBasket.updateProductQuantity("Бананы", 6);
        shoppingBasket.displayBasket();

        System.out.println("Бананы есть в basket? ");
        shoppingBasket.searchProduct("Бананы");

        shoppingBasket.removeProduct("Апельсины");
        shoppingBasket.displayBasket();
    }
}
