package bean;

import sun.applet.Main;

/**
 * Created by yinxu on 2016/10/23.
 */
public class PrimePrint {
    public  boolean isPrime(int  num){
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%1==0){
                    return false;
                }
            }

        return  true;
    }


    public void printPrime(){
        for(int i=2;i<100;i++){

            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
}
