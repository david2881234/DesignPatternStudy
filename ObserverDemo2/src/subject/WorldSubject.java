package subject;

import java.util.Observable;


/**
 * �@�� (�Q�[���)
 * 
 * @author Leo_Chen
 * 
 */
public class WorldSubject extends Observable {


    private String message;

    /**
     * ���ƥ�o�͡A�����Ҧ��[���
     * 
     * @param message
     */
    public void haveProblem(String message) {
        this.message = message;
        setChanged();
        System.out.println("------------------------------");
        notifyObservers(this.message);
        System.out.println("------------------------------");
    }
}