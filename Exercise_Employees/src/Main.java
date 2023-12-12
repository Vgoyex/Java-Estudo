import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arrayId = new ArrayList<Integer>();
        List<String> arrayName = new ArrayList<String>();
        List<Double> arrayBalance = new ArrayList<Double>();

        List<Employee> employeesList = new ArrayList<Employee>();

        System.out.print("Type a number for N: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("Id: ");

            Integer id = sc.nextInt();
            Integer valid = validId(id,employeesList);
            if(valid != null){
                id = valid;
                System.out.println("The Id that was insert already exists");
                System.out.println("New Id: " + id);
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Balance: ");
            Double balance = sc.nextDouble();

            arrayId.add(id);
            arrayName.add(name);
            arrayBalance.add(balance);
            Employee employee = new Employee(id,name,balance);

            employeesList.add(employee);
        }

        System.out.println();

        System.out.print("Enter the employee id that will have a salary increase: ");
        int rid = sc.nextInt();

        //Validation with lambda instead of using the function "hasId()"
        // Employee emp = employeesList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        Integer positionRid = hasId(employeesList, rid);

        if(positionRid != null ){
            System.out.print("Enter the percentage: ");
            Double percent = sc.nextDouble();
            //Search for the position of the Id that was passed as an argument
            employeesList.get(positionRid).increaseBalance(percent);
        }else{
            System.out.println("This id: " + rid + " does not exist!");
        }

        System.out.println();

        System.out.println("List of employees");
        for(Employee data : employeesList){
            System.out.println(data);
        }


    }



    //Valid if an id is valid or not, if it`s not transform that invalid id into a valid one
    public static Integer validId(int id, List<Employee> list) {
        for (int i = 0; i < list.size() ; i++) {
            //In that case Id already exists
            if (list.get(i).getId() == id) {
                return (list.get(i).getId() + 1);
            }
        }
        return null;
    }


    //If the Id exists, the function will return his position at the list
    public static Integer hasId(List<Employee> list, int id){
        for(int i = 0; i < list.size() ; i++){
            if(list.get(i).getId() == id){
                return  i;
            }
        }
        return null;
    }
}

