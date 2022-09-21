package application;

import entities.Employee;
import entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char isOutsourced = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (isOutsourced == 'n') {
                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            }
            else {
                System.out.print("Additional charge: ");
                double charge = sc.nextDouble();
                Employee employee = new OutSourcedEmployee(name, hours, valuePerHour, charge);
                employees.add(employee);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        sc.close();
    }
}
