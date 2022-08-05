package lab.projectOzzy;

import lab.projectOzzy.category.Category;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private Double price;
    private Integer stock;
    private Integer remainingStack;
    private UUID categoryId;                                       //product iD NEEDS TO MATCH with category iD

    public Product(UUID id, String name, Double price, Integer stock, Integer remainingStack, UUID categoryId) {//call constructor
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.remainingStack = remainingStack;
        this.categoryId = categoryId;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getRemainingStack() {
        return remainingStack;
    }

    public UUID getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() throws Exception{                      //methode created in loop case 1
        for (Category category:StaticConstants.CATEGORY_LIST) {               //u have categoryid. please go to date base and check all categories ids
            if (getCategoryId().toString().equals(category.getId().toString())){
                return category.getName();                                //and find matching one and return it names corresponding that category id
            }
            }
        throw new Exception("Category not found,"+ getName());            //EXCEPTION MUST HANDLE WHO CALLED
        }


}
