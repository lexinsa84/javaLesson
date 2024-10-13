package homework6;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter {

    public List<Product> filterByCategory(List<Product> products, String category) {
        return products.stream()
                .filter(product -> product.getClass().getSimpleName().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public List<Product> filterByBrand(List<Product> products, String brand) {
        return products.stream()
                .filter(product -> product.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }

    public List<Product> filterByPriceRange(List<Product> products, double minPrice, double maxPrice) {
        return products.stream()
                .filter(product -> product.getPrice() >= minPrice && product.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public List<Product> filterByAvailability(List<Product> products) {
        return products.stream()
                .filter(Product::isAvailable)
                .collect(Collectors.toList());
    }

    public List<Product> filterByRam(List<Product> products, int ramSize) {
        return products.stream()
                .filter(product -> product instanceof Laptop && ((Laptop) product).getRam() >= ramSize)
                .collect(Collectors.toList());
    }
}
