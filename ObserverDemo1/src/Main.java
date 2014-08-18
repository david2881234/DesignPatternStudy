import observer.Alien;
import observer.Ironman;
import observer.Spiderman;
import observer.Superman;
import subject.WorldSubject;
import base.Observer;

/**
 * ����
 * @author Leo_Chen
 *
 */
public class Main {
    
    public static void main(String[] args){
        /*
         * �@��
         */
        WorldSubject world = new WorldSubject();
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
        registHeroAndBadMan(world,superman);
        registHeroAndBadMan(world,spiderman);
        registHeroAndBadMan(world,ironman);
        registHeroAndBadMan(world,alien);
        /*
         * �@�ɵo�ͤF�ƥ�
         */
        world.haveProblem("Snooppy is too Fat!");
        world.haveProblem("Andy's toys disappear!");
        world.haveProblem("Bomb!!AAAAAAAAA!");
        
        /*
         * ���K�HGG�F
         */
        manDied(world,ironman);

        /*
         * �@�ɵo�ͤF�ƥ�
         */
        world.haveProblem("God! please help me!");
    }
    
    public static void registHeroAndBadMan(WorldSubject world,Observer man){
        world.registOberserver(man);
    }
    public static void manDied(WorldSubject world,Observer man){
    	System.out.println(man.getClass()+" died!! remove from world observer");
        world.removeOberserver(man);
    }
}
