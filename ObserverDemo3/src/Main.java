import java.util.Observer;

import observer.Alien;
import observer.Ironman;
import observer.Spiderman;
import observer.Superman;
import subject.WorldSubject;

/**
 * ����(�ϥ�java���Ѫ��[���)
 * @author Leo_Chen
 *
 */
public class Main {
    
    public static void main(String[] args){
        /*
         * �@��
         */
        WorldSubject world = new WorldSubject();
        world.setPower("gun");
        /*
         * �W�H��
         */
        Superman superman = new Superman();
        Spiderman spiderman = new Spiderman();
        Ironman ironman = new Ironman();
        Alien alien = new Alien();
        /*
         * ��@�ɵ��U���^���A���ƥ�o�ͮɥ@�ɷ|�q���L�̡C
         */
        registHeroAndBadMan(world,alien);
        registHeroAndBadMan(world,superman);
        registHeroAndBadMan(world,spiderman);
        registHeroAndBadMan(world,ironman);
        /*
         * �@�ɵo�ͤF�ƥ�
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
         * ���K�HGG�F
         */
        manDied(world,ironman);

        /*
         * �@�ɵo�ͤF�ƥ�
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
