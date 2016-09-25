package org.anzo.BillsAndDiscounts;

/**
 * Created by andreyz on 25.09.16.
 */
public class MoreThenFiveDaysBill implements Bill {

    public String getBill(int price, int days) {
        return " Ваш счет за проживание составляет : " + (price * days - 20) + " грн " + " вы экономите " + 20 + " грн ";
    }
}
