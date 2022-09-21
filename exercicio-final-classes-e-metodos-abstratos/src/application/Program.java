package application;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program {
    public static void main(String[] args) {

        Person person = new LegalPerson("SoftTech", 400000.00, 25);
        System.out.println(String.format("%.2f", person.totalTax()));

        Person person1 = new PhysicalPerson("Bob", 120000.00, 1000.00);
        System.out.println(String.format("%.2f", person1.totalTax()));
    }
}
