package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private List<HourContract> contracts = new ArrayList<HourContract>();

    public Worker(){
    }

    public Worker(String name, WorkerLevel level, Double baseSalary){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }




    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }


    public Double income(Integer year, Integer month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContract data : contracts){
            cal.setTime(data.getDate());
            Integer data_year = cal.get(Calendar.YEAR);
            Integer data_month = cal.get(Calendar.MONTH);;
            if(year == data_year && month == data_month){
                sum += data.totalValue();
            }
        }
        return sum;
    }


    public String toString(){
        return "Name: " + name + "\nLevel: " + level + "\nBase Salary: " + baseSalary;
    }
}
