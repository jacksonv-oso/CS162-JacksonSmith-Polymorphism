//package com.company;

import javax.management.ConstructorParameters;

public class Main {

    public static void main(String[] args) {

        /**TODO
         * Created an Array to hold all employee subclass objects.
         */
        Employee employees[] = new Employee[3];
        employees[0] = new TechnicalWriter("Mark",50000,4,2);
        employees[1] = new Engineer("Natashia",50000,7,3);
        employees[2] = new ProductManager("Carlos", 50000, 8,5);

        /**
         * For-loop that prints the objects passed arguments in the terminal.
         */
        for (int i = 0; i < 3; ++i)
            System.out.println(employees[i].toString()+"\n");
        Owner.giveRaise();
    }
}
