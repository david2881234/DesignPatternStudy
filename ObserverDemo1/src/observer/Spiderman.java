package observer;

import base.Observer;
/**
 * �j��H
 * @author admin
 *
 */
public class Spiderman implements Observer{
    public void receiveNotify(String message){
        System.out.println("Spiderman receive world's message:"+message);   
        nothing();      
    }
    public void nothing(){
        System.out.println("Spiderman zzz...");
    }
}
