
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int OrderId;
    private LocalDate OrderDate;
    private int TotalAmount;

    @ManyToOne
    @JoinColumn(name = "customer_Id")
    private Student customer;


    public Order(){

    }
    public Order(int OrderId, LocalDate OrderDate, int TotalAmount, Student customer){
        this.OrderId = OrderId;
        this.OrderDate = OrderDate;
        this.TotalAmount = TotalAmount;
        this.customer = customer;
    }
    public int getOrderID(){
        return OrderId;
    }
    public void setOrderId(int OrderId){
        this.OrderId = OrderId;
    }
    public LocalDate getOrderDate(){
        return OrderDate;
    }
    public void setOrderDate(LocalDate OrderDate){
        this.OrderDate = OrderDate;
    }
    public int getTotalAmount(){
        return TotalAmount;
    }
    public void  setTotalAmount(int TotalAmount){
        this.TotalAmount = TotalAmount;
    }
    public Student getCustomer(){
        return customer;
    }
    public void setCustomer(Student customer){
        this.customer = customer;
    }
}
