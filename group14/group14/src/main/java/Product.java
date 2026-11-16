import jakarta.persistence.*;

import javax.naming.Name;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProductId;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student producer;

    private String NameOfProduct;
    private String ProductName;
    private String Description;
    private int Price;
    private int Quantity;
    private String Category;



    public Product(){

    }
    public Product(int ProductId, String NameOfProduct, String ProductName,String Description, int Price, int Quantity, String Category,
    Student producer){
        this.ProductId= ProductId;
        this.NameOfProduct= NameOfProduct;
        this.ProductName = ProductName;
        this.Description = Description;
        this.Price = Price;
        this.Category = Category;
        this.producer = producer;
    }

    public int getProductId(){
        return ProductId;
    }
    public void setProductId(int ProductId){
        this.ProductId = ProductId;
    }
    public String getNameOfProduct() {
        return NameOfProduct;
    }
    public void setNameOfProduct(String NameOfProduct){
        this.NameOfProduct = NameOfProduct;
    }
    public String getProductName(){
        return ProductName;
    }
    public void setProductName( String ProductName){
        this.ProductName = ProductName;
    }
     public String getDescription(){
        return Description;
     }
     public void setDescription(String Description){
        this.Description = Description;
     }
     public int getPrice(){
        return Price;
     }
     public void setPrice(int Price){
        this.Price = Price;
     }
     public int getQuantity(){
        return Quantity;
     }
     public void setQuantity(int Quantity){
        this.Quantity = Quantity;
     }
     public String getCategory(){
        return Category;
     }
     public void setCategory(String Category){
        this.Category = Category;
     }
     public Student getProducer(){
        return producer;

     }
     public void setProducer(Student producer){
        this.producer = producer;
     }



}



