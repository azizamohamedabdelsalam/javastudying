package hashmap;

import java.util.List;
import java.util.Objects;

public class Product {
    private String name;
    private String description;
    private List<String> tags;

    // standard getters/setters/constructors

    public Product() {
    }

    public Product(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Product addTagsOfOtherProduct(Product product) {
        this.tags.addAll(product.getTags());
        return this;
    }
//Note that hashCode() and equals() need to be overridden only for classes that we want to use
// as map keys,not for classes that are only used as values in a map.

    // HashMap stores elements in so-called buckets and the number of buckets is called capacity.
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}

