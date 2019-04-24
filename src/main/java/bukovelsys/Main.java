package bukovelsys;

import bukovelsys.cards.SkiPass;
import bukovelsys.cards.SkiPassType;
import bukovelsys.services.AccountSystem;
import bukovelsys.services.Turnstile;

//singleton read telegram
public class Main {
    public static void main (String[] args){
        AccountSystem accountSystem =new AccountSystem();

        SkiPass daySkiPass = accountSystem.createDaySkiPass(5);
        SkiPass daySkiPass2 = accountSystem.createDaySkiPass(5);

/*        System.out.println(accountSystem.getSkiPassList().size());

        System.out.println(daySkiPass.getId());
        System.out.println(daySkiPass2.getId());*////
        Turnstile turnstile = new Turnstile();
        //turnstile.getStat(SkiPassType.SEASON);
        Map<SkiPassType,Integer> mp = turnstile.getCounterPassed();
        mp.put(SkiPassType.SEASON, 5);
        mp.put(SkiPassType.HALF_DAY_AFTERNOON, 2);

        Map<SkiPassType,Integer> mc = turnstile.getCounterCanceled();
        mc.put(SkiPassType.DAY_LIMIT,3);
        mc.put(SkiPassType.SEASON, 1);

        turnstile.getStat();

        turnstile.getStat(SkiPassType.DAY_LIMIT);







    }
}
