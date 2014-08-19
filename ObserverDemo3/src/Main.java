import java.util.Observer;

import observer.Alien;
import observer.Ironman;
import observer.Spiderman;
import observer.Superman;
import subject.WorldSubject;

/**
 * 測試(使用java提供的觀察者)
 * @author Leo_Chen
 *
 */
public class Main {
    
    public static void main(String[] args){
        /*
         * 世界
         */
        WorldSubject world = new WorldSubject();
        world.setPower("gun");
        /*
         * 超人們
         */
        Superman superman = new Superman();
        Spiderman spiderman = new Spiderman();
        Ironman ironman = new Ironman();
        Alien alien = new Alien();
        /*
         * 跟世界註冊為英雄，當有事件發生時世界會通知他們。
         */
        registHeroAndBadMan(world,alien);
        registHeroAndBadMan(world,superman);
        registHeroAndBadMan(world,spiderman);
        registHeroAndBadMan(world,ironman);
        /*
         * 世界發生了事件
         */
        world.haveProblem("Snooppy is too Fat!");
        System.out.println("------------------------------");
        world.haveProblem("Andy's toys disappear!");
        System.out.println("------------------------------");
        world.haveProblem("Bomb!!AAAAAAAAA!");
        System.out.println("------------------------------");
        world.worldWillDestroy();
        System.out.println("------------------------------");
        
        /*
         * 鋼鐵人GG了
         */
        manDied(world,ironman);

        /*
         * 世界發生了事件
         */
        world.haveProblem("God! please help me!");
        System.out.println("------------------------------");
        world.worldWillDestroy();
        System.out.println("------------------------------");
    }
    
    public static void registHeroAndBadMan(WorldSubject world,Observer man){
        world.addObserver(man);
    }
    public static void manDied(WorldSubject world,Observer man){
        world.deleteObserver(man);
    }
}
