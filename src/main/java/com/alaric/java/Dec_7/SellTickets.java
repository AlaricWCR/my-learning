package com.alaric.java.Dec_7;

/**
 * @ClassName SellTicket  继承Thread类
 * @Description TODO
 * @Author Alaric
 * @Date 2020/12/7
 **/
public class SellTickets {

    public static void main(String[] args) {
        for(int i=1; i<4; i++){
            TicketWindow tw = new TicketWindow();
            tw.setName("TicketWindow-" + i);
            tw.start();
        }
    }
}

class TicketWindow extends Thread{
    private int tickets = 5;//车票总量
    @Override
    public void run(){
        while(true){
            if(tickets>0){
                System.out.println(Thread.currentThread().getName() + "准备出票,剩余票数:" + tickets + "张");
                tickets--;
                System.out.println(Thread.currentThread().getName() + "卖出一张,剩余票数:" + tickets + "张");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else{
                System.out.println(Thread.currentThread().getName() + "余票不足,停止售票!");
                break;
            }
        }
    }

}

