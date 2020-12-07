package com.alaric.java.Dec_7;

/**
 * @ClassName SellTicket runnable接口实现
 * @Description TODO
 * @Author Alaric
 * @Date 2020/12/7
 **/
class Ticket implements Runnable {
    private int ticket = 20;

    public void salesTickets() {
        synchronized (this) {   //加同步锁
            if (ticket > 0) {   //再次判断是否还有余票
                System.out.println(Thread.currentThread().getName() + "正在卖第[ " + ticket-- + " ]张票...");
            }
        }
    }

    public void run() {
        while (ticket > 0) {    //当还有余票的时候继续卖票
            salesTickets();     //调用卖票方法

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TicketDemo {
    public static void main(String[] args) {
        Ticket t = new Ticket();

        Thread w1 = new Thread(t,"窗口一");// 创建四个窗口
        Thread w2 = new Thread(t,"窗口二");
        Thread w3 = new Thread(t,"窗口三");
        w1.start();
        w2.start();
        w3.start();
    }
}
