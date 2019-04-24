package bukovelsys.services;

import bukovelsys.cards.*;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class AccountSystem {

    private List<SkiPass> skiPassList = new LinkedList<>();

    private int lastSkiPassId;
    private int startMonthOfSeason = 9 ;
    private int endMonthOfSeason = 4;




    private static  class AccountSystemHolder{
        public static final AccountSystem ACCOUNT_SYSTEM_INSTANCE = new AccountSystem();
    }

    public static AccountSystem getAccountingSystem(){
        return  AccountSystemHolder.ACCOUNT_SYSTEM_INSTANCE;
    }

    public SkiPass createHalfDayMorningSkiPass(){
        HalfDayMorningSkiPass skiPass = new HalfDayMorningSkiPass();
        skiPassList.add(skiPass);
        return  skiPass;
    }





    public SkiPass createHalfDayAfternoonSkiPass(){

        HalfDayAfternoonSkiPass skiPass = new HalfDayAfternoonSkiPass();
        skiPassList.add(skiPass);
        return  skiPass;

    }
    public SkiPass createDaySkiPass(int days){

        DaySkiPass skiPass = new DaySkiPass(days);
        skiPassList.add(skiPass);
        return  skiPass;

    }
    public SkiPass ceateHolidayHalfDayMorningSkiPass(){

        HolidayHalfDayMorningSkiPass skiPass = new HolidayHalfDayMorningSkiPass();
        skiPassList.add(skiPass);


        return  skiPass;

    }
    public SkiPass ceateHolidayHalfDayAfternoonSkiPass(){
        HolidayHalfDayAfternoonSkiPass skiPass = new HolidayHalfDayAfternoonSkiPass();
        skiPassList.add(skiPass);

        return skiPass;

    }
    public SkiPass createHolidaySkiPass(int days){

        HolidaySkiPass skiPass = new HolidaySkiPass(days);
        skiPassList.add(skiPass);
        return skiPass;

    }
    public SkiPass createSeasonSkiPass(){
        SeasonSkiPass skiPass = new SeasonSkiPass();
        skiPassList.add(skiPass);
        return skiPass;

    }
    public void blockSkiPass (SkiPass skiPass){
        skiPass.setBlocked(true);
    }

    public int getNextId(){

        return ++this.lastSkiPassId;

    }

    public int getStartMonthOfSeason() {
        return startMonthOfSeason;
    }

    public int getEndMonthOfSeason() {
        return endMonthOfSeason;
    }

    public List<SkiPass> getSkiPassList() {
        return skiPassList;
    }
}
