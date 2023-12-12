package entities;

import java.time.LocalDate;
import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePHour;
    private Integer hours;

    public HourContract(){}

    public Date getDate() {
        return date;
    }

    public HourContract(Date date, Double valuePHour, Integer hours){
        this.date = date;
        this.valuePHour = valuePHour;
        this.hours = hours;
    }



    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePHour() {
        return valuePHour;
    }

    public void setValuePHour(Double valuePHour) {
        this.valuePHour = valuePHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public String toString() {
        return "HourContract{" +
                "date=" + date +
                ", valuePHour=" + valuePHour +
                ", hours=" + hours +
                '}';
    }

    public Double totalValue(){
        return hours * valuePHour;
    }


}
