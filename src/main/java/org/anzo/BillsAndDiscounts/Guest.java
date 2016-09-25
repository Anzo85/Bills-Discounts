package org.anzo.BillsAndDiscounts;


public class Guest implements Runnable {

    private String Name;
    private String LastName;
    private String ID;
    int count;
    public boolean checkout = true;

    public Guest(String name, String lastName, String ID) {
        this.ID = ID;
        LastName = lastName;
        Name = name;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Guest :" +
                " Name = " + Name +
                ", LastName = " + LastName +
                " Days = " + count + " ";
    }

    public void run() {
        count = 0;
        while (checkout) {
            try {
                Thread.sleep(1000*60*60*24);
            } catch (Exception e) {
            }
            count++;
            System.out.println("Guest : " + Name + ", Current Days : " + count);

        }

    }
}
