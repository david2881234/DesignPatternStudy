package base;

/**
 * �Q�[���(�D�D)
 * 
 * @author Leo_Chen
 * 
 */
public interface Subject {

    /**
     * ���U�[���
     */
    public void registOberserver(Observer observer);

    /**
     * �����[���
     */
    public void removeOberserver(Observer observer);

    /**
     * �����Ҧ��[���
     */
    public void notifyAllOberserver();
}