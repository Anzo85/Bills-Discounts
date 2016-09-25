package org.anzo.BillsAndDiscounts;

/**
 * Created by andreyz on 25.09.16.
 */
public class RegularBill implements Bill {

    public String getBill(int price, int days) {
        return " Ваш счет за проживание составляет : " + price * days + " грн " + " вы экономите " + 0 + " грн ";
    }
}
