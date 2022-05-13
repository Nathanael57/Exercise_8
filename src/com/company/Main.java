package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Staff s = new Staff();
        s.initialize1();
        s.Dabi1_56330();

        double salary = s.salaryToPay(180, 40);
        System.out.println("The employee received the salary in the amount of " + salary);
        double salaryForOverTime = s.salaryForOverTime(10, 40);
        System.out.println("The employee received the salary for overtime " + salaryForOverTime);
        int bonus = SalaryNathanael.bonus_Nathanael(6);
        s.initialize();
        s.Dabi_56330();
    }
}
