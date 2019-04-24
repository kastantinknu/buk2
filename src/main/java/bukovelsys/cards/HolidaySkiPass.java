package bukovelsys.cards;

import bukovelsys.services.AccountSystem;

import java.util.Date;

public class HolidaySkiPass extends SkiPass {
    private int dayQuantity;

    public HolidaySkiPass(int dayQuantity){
        this.dayQuantity = dayQuantity;
        // this.expirationDate = expirationDate;
        this.skiPassType = SkiPassType.HOLIDAY_DAY_LIMIT;
        this.id = AccountSystem.getAccountingSystem().getNextId();



    }
}
