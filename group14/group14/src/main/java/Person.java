import java.time.LocalDate;

public abstract class Person {
    String Fname;
    String Lname;
    long PhoneNo;
    LocalDate Dob;
    String Address;
    String Email;


    public Person (){

    }
    public Person(String Fname, String Lname, long PhoneNo, LocalDate Dob, String Address,String Email){
     this.Fname =  Fname;
     this.Lname = Lname;
     this.PhoneNo = PhoneNo;
     this.Dob = Dob;
     this.Address = Address;
     this.Email = Email;



    }
}
