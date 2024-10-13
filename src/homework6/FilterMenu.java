package homework6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FilterMenu {

    private ProductFilter productFilter;
    private List<Product> products;
    private Scanner scanner;
    private Map<String, Object> selectedFilters;

    public FilterMenu(List<Product> products) {
        this.productFilter = new ProductFilter();
        this.products = products;
        this.scanner = new Scanner(System.in);
        this.selectedFilters = new HashMap<>();
    }

    public void startMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nВыберите параметр фильтрации:");
            System.out.println("1. Фильтрация по категории");
            System.out.println("2. Фильтрация по бренду");
            System.out.println("3. Фильтрация по диапазону цен");
            System.out.println("4. Фильтрация по наличию");
            System.out.println("5. Фильтрация по оперативной памяти (RAM)");
            System.out.println("6. Применить фильтры");
            System.out.println("7. Очистить фильтры");
            System.out.println("8. Выйти");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        filterByCategory();
                        break;
                    case 2:
                        filterByBrand();
                        break;
                    case 3:
                        filterByPriceRange();
                        break;
                    case 4:
                        filterByAvailability();
                        break;
                    case 5:
                        filterByRam();
                        break;
                    case 6:
                        applyFilters();
                        break;
                    case 7:
                        clearFilters();
                        break;
                    case 8:
                        exit = true;
                        System.out.println("Выход из меню фильтрации.");
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

    private void filterByCategory() {
        System.out.print("Введите категорию: ");
        String category = scanner.nextLine();
        selectedFilters.put("category", category);
    }

    private void filterByBrand() {
        System.out.print("Введите бренд: ");
        String brand = scanner.nextLine();
        selectedFilters.put("brand", brand);
    }

    private void filterByPriceRange() {
        try {
            System.out.print("Введите минимальную цену: ");
            double minPrice = scanner.nextDouble();
            System.out.print("Введите максимальную цену: ");
            double maxPrice = scanner.nextDouble();
            scanner.nextLine();
            if (minPrice < 0 || maxPrice < 0 || minPrice > maxPrice) {
                throw new Exception("Некорректный диапазон цен.");
            }
            selectedFilters.put("minPrice", minPrice);
            selectedFilters.put("maxPrice", maxPrice);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            scanner.nextLine();
        }
    }

    private void filterByAvailability() {
        selectedFilters.put("availability", true);
    }

    private void filterByRam() {
        try {
            System.out.print("Введите минимальный объем оперативной памяти (GB): ");
            int ramSize = scanner.nextInt();
            scanner.nextLine();
            if (ramSize <= 0) {
                throw new Exception("Некорректное значение оперативной памяти.");
            }
            selectedFilters.put("ram", ramSize);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            scanner.nextLine();
        }
    }

    private void applyFilters() {
        try {
            List<Product> filteredProducts = products;

            if (selectedFilters.containsKey("category")) {
                String category = (String) selectedFilters.get("category");
                filteredProducts = productFilter.filterByCategory(filteredProducts, category);
            }

            if (selectedFilters.containsKey("brand")) {
                String brand = (String) selectedFilters.get("brand");
                filteredProducts = productFilter.filterByBrand(filteredProducts, brand);
            }

            if (selectedFilters.containsKey("minPrice") && selectedFilters.containsKey("maxPrice")) {
                double minPrice = (double) selectedFilters.get("minPrice");
                double maxPrice = (double) selectedFilters.get("maxPrice");
                filteredProducts = productFilter.filterByPriceRange(filteredProducts, minPrice, maxPrice);
            }

            if (selectedFilters.containsKey("availability")) {
                filteredProducts = productFilter.filterByAvailability(filteredProducts);
            }

            if (selectedFilters.containsKey("ram")) {
                int ramSize = (int) selectedFilters.get("ram");
                filteredProducts = productFilter.filterByRam(filteredProducts, ramSize);
            }

            if (filteredProducts.isEmpty()) {
                System.out.println("Товары по заданным параметрам не найдены.");
            } else {
                System.out.println("Найденные товары:");
                filteredProducts.forEach(Product::displayProductInfo);
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void clearFilters() {
        selectedFilters.clear();
        System.out.println("Фильтры очищены.");
    }
}
