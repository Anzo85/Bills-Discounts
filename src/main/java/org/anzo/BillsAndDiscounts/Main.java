package org.anzo.BillsAndDiscounts;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args) throws Exception {


        billCalculation();


    }

    public static void billCalculation() throws Exception {


        BufferedReader set = new BufferedReader(new InputStreamReader(System.in));

        Guest guest1 = new Guest(setName(), setLastName(), setId());
        System.out.println(guest1.getName() + " успешно зарегистрирован ! ");
        Bill seven = new MoreThenSevenDaysBill();
        Bill five = new MoreThenFiveDaysBill();
        Bill reg = new RegularBill();

        Price price = new Price();

        Thread go = new Thread(guest1);

        go.start();

        boolean checkInput = true;
        String s = set.readLine();
        while (checkInput) {
            if (s.equals("checkout")) {
                guest1.checkout = false;
                go.stop();
                if (guest1.count > 7) {
                    System.out.println(guest1 + seven.getBill(price.getPrice(), guest1.count));
                    break;
                } else if (guest1.count > 5) {
                    System.out.println(guest1 + five.getBill(price.getPrice(), guest1.count));
                    break;
                } else
                    System.out.println(guest1 + reg.getBill(price.getPrice(), guest1.count));
                break;

            } else {
                checkInput = false;
                System.out.println("Error");
                go.stop();
            }
        }
    }

    public static String setName() throws Exception {
        BufferedReader set = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Введите имя :");
        String name = set.readLine();
        return name;
    }

    public static String setLastName() throws Exception {
        BufferedReader set = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Введите фамилию :");
        String lastName = set.readLine();
        return lastName;
    }

    public static String setId() throws Exception {
        BufferedReader set = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Введите паспортные данные:");
        String iD = set.readLine();
        return iD;
    }
}




