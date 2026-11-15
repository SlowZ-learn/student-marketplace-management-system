import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
public class Student extends Person {

    public Student(){

    }
    public Student(String Fname, String Lname, long PhoneNo, LocalDate Dob, String Address, String Email) {


        super(Fname, Lname, PhoneNo, Dob, Address, Email);
    }
    @OneToMany(mappedBy = "producer")
    private List<Product> products;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int StudentId;
    private String UserName;
    private String Password;


    private int getStudentId() {
        return StudentId;
    }

    private void setStudentID(int StudentId) {
        this.StudentId = StudentId;
    }


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    private String getPassword() {
        return Password;
    }

    private void setPassword(String Password){
        this.Password = Password;
    }
}