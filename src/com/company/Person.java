package com.company;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;


interface SalaryNathanael{
    double salaryToPay(double hours, double rate);

    default double salaryForOverTime(double overtime, double rate) {
        return 1;
    }

    static int bonus_Nathanael(int yearsOfExperience) {
        if (yearsOfExperience > 5) {
            return 100;
        } else {
            return 0;
        }

    }
}

class Staff extends Person implements SalaryNathanael{
    String education;
    String position;

    public void initialize1() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        System.out.println("Enter your education");
        education = br.readLine();
        System.out.println("Enter your position");
        position = br.readLine();
    }

    public void Dabi_56330()
    {

        Dabi1_56330();
        System.out.println("Education :" + education);
        System.out.println("Position :" + position);
    }
@Override
    public double salaryToPay(double hours, double rate){return  hours*rate;}
    @Override
    public double salaryForOverTime(double overtime, double rate){return  overtime*(1.5*rate);};
}


   public class Person {
        String name;
        String lastname;
        String street;
        String zipcode;
        String city;

        public void initialize() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter your lastname");
            lastname = br.readLine();
            System.out.println("Enter your name");
            name = br.readLine();
            System.out.println("Enter your street");
            street = br.readLine();
            System.out.println("Enter your zipcode");
            zipcode = br.readLine();
            System.out.println("Enter your city");
            city = br.readLine();


        }

        public void Dabi1_56330() {
            System.out.println("Display the data");
            System.out.println("*******");
            System.out.println("Lastname :" + lastname);
            System.out.println("Name :" + name);
            System.out.println("Street :" + street);
            System.out.println("Zipcode :" + zipcode);
            System.out.println("City :" + city);

        }
    }


