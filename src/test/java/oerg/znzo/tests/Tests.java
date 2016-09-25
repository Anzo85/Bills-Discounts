package oerg.znzo.tests;


import org.anzo.BillsAndDiscounts.Bill;
import org.anzo.BillsAndDiscounts.MoreThenFiveDaysBill;
import org.anzo.BillsAndDiscounts.MoreThenSevenDaysBill;
import org.anzo.BillsAndDiscounts.RegularBill;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Tests {

    Bill seven;
    Bill five;
    Bill reg;


    @Before

    public void setUp() {
        seven = new MoreThenSevenDaysBill();
        five = new MoreThenFiveDaysBill();
        reg = new RegularBill();
    }

    @Test

    public void testSeven(){

        assertThat(seven.getBill(10,10),is( " Ваш счет за проживание составляет : " + 50 + " грн " + " вы экономите " + 50 + " грн "));
    }

    @Test
    public void testFive(){

        assertThat(five.getBill(6,10),is( " Ваш счет за проживание составляет : " + 40 + " грн " + " вы экономите " + 20 + " грн "));
    }

    @Test
    public void testRegular(){

        assertThat(reg.getBill(3,10),is( " Ваш счет за проживание составляет : " + 30 + " грн " + " вы экономите " + 0 + " грн "));
    }

}
