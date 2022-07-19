package Cleancode.demo;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;

public class ThreadEx3 {
    public static void main(String[] args) {

    }
}

class Account{
    private int balance =1000;

    public int getBalance() {
        return balance;
    }

    public boolean withDraw(int money){
        if(balance==money){
            try(Thread.sleep(1000);)catch(Exception error){}

            balance -=money;
            return true;
        }
        return false;
    }

    class ThreadTask3 implements Runnable{
        Account account = new Account();

        @Override
        public void run() {
            while(account.getBalance()>0){
                int money =(int)(Math.random()*3 + 1)*100;
                boolean denied = !account.withDraw(money);
            }
        }
    }
}
