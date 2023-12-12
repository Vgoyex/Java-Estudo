package entities;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Client {
    private String name;
    private String email;
    private Date birthDate;

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
    public Client(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        DateFormat formatBirthDate = new SimpleDateFormat("dd/MM/yyyy");
        return name + " ("+formatBirthDate.format(birthDate)+")" + " - " + email;
    }


}
