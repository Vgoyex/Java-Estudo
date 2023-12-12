import java.util.ArrayList;
import java.util.List;

public class Employee {
    public Integer id;
    public String name;
    public Double balance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Employee() {
    }
    public Employee(Integer id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    public void increaseBalance(double percent){
        balance += balance * percent /100;
    }

    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Balance: " + balance + " R$";
    }
}
