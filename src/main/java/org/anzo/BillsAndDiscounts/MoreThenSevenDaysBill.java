package org.anzo.BillsAndDiscounts;


public class MoreThenSevenDaysBill implements Bill {

    public String getBill(int price, int days) {
        return " Ваш счет за проживание составляет : " + (price * days - 50) + " грн " + " вы экономите " + 50 + " грн ";
    }
}
