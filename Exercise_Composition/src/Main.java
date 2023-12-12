import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        HourContract t = new HourContract(new Date(), 20.0,6);
        List<Worker> workersList = new ArrayList<Worker>();
        List<HourContract> contractsList = new ArrayList<HourContract>();

        System.out.print("Enter a department's name: ");
        sc.nextLine();
        String department = sc.nextLine();
        System.out.print("Write the number of workers to provide: ");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){

            System.out.println("\nWorker #" + (i+1) + ":");
            System.out.print("Insert the name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Levels: JUNIOR, " +"MID_LEVEL, " + "SENIOR");
            System.out.print("Insert the level: ");
            String lvl = sc.nextLine();
            WorkerLevel level = WorkerLevel.valueOf(lvl.toUpperCase());
            System.out.print("Insert the salary: ");
            Double baseSalary = sc.nextDouble();

            Worker worker = new Worker(name,level,baseSalary);
            workersList.add(worker);

            System.out.println("How many contracts to this worker " + "("+ name +")" + "? ");
            Integer contracts = sc.nextInt();

            //Loop for the contracts
            for(int j = 0; j < contracts; j++){
                System.out.println("Enter contract #" + (j+1) + " data");
                System.out.print("Date (DD/MM/YYYY): ");
                sc.nextLine();
                String dateStr = sc.nextLine();
                SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
                Date date;
                try {
                    date = format1.parse(dateStr);
                }catch(ParseException e){
                    date = null;
                    System.out.println("Formato de data inválido. Certifique-se de usar dd/MM/yyyy.");
                    e.printStackTrace();
                }
                System.out.print("Value per hour: ");
                Double valuePhour = sc.nextDouble();
                System.out.print("Duration (hours): ");
                Integer hours = sc.nextInt();

                HourContract contract = new HourContract(date,valuePhour,hours);
                contractsList.add(contract);
            }

            System.out.print("Enter month and year to calculate income (MM/YYYY): ");
            String dateStrM = sc.nextLine();
            String[] dateStrsplitted = dateStrM.split("/");
            worker.income(Integer.parseInt(dateStrsplitted[1]),Integer.parseInt(dateStrsplitted[0]));

        }


        //Print workers list
        System.out.println("\nWorkers List:");
        for(int i =0; i<workersList.size();i++){
            for(Worker data : workersList){
                System.out.println("Worker #"+ (i+1));
                System.out.println(data+"\n");
                i++;
            }
        }


    }
}