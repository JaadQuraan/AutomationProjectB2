package com.loop.test.day8_webtables_config;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.PizzaOrderWebTableUtil;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
/*
1. go to https://loopcamp.vercel.app/web-tables.html
2. create a method to test given field for a given name
3. test type
4. test amount
5. test date
6. test street
7. test city
8. test state
9. test zip
10. test card
11. test card number
12. test exp
 */
public class T2_Pizza_Order extends TestBase {

    @Test
    public void test_pizza_type(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Alexandra Gray";
        String expectedPizzaType = "Thin Crust";
        String actualPizzaType = PizzaOrderWebTableUtil.returnAnyFieldValue(driver,name,"Pizza Type");
        assertEquals(actualPizzaType,expectedPizzaType,"Actual does not match expected");
    }
    @Test
    public void test_amount(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Bart Fisher";
    }


}
