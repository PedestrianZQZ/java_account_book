package com.icedtea.java;
import java.util.Scanner;
import java.util.ArrayList;

/*
用java写的一个小项目，功能是一个命令行的记账系统，有3个功能，分别是记账，查询，删除
*/

class Record{
    int num;  // 记录的金额
    String reason;  // 记录的理由
}

class Debtbook{
    ArrayList<Record> myBook = new ArrayList<Record>();
}

public class HelloWorld {
    public static void main(String args[]){

        Debtbook db = new Debtbook();
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        while(true){
            System.out.println("请选择要使用的功能：");
            System.out.println("1.记账");
            System.out.println("2.查询");
            System.out.println("3.删除");
            System.out.println("4.退出");
            flag = scanner.nextInt();
            if(flag == 1){
                System.out.println("请输入金额和理由");
                int num = scanner.nextInt();
                String reason = scanner.next();
                Record temp = new Record();
                temp.num = num;
                temp.reason = reason;
                db.myBook.add(temp);
                System.out.println("记账成功");
            }
            else if (flag == 2){
                System.out.println("序号\t金额\t理由");
                for(int i = 0; i < db.myBook.size(); i++){
                    System.out.printf("%d\t%d\t%s", i, db.myBook.get(i).num, db.myBook.get(i).reason);
                }
                System.out.println();
            }
            else if (flag == 3) {
                System.out.println("序号\t金额\t理由");
                for(int i = 0; i < db.myBook.size(); i++){
                    System.out.printf("%d\t%d\t%s", i, db.myBook.get(i).num, db.myBook.get(i).reason);
                }
                System.out.println();
                System.out.println("请输入要删除的序号");
                int index = scanner.nextInt();
                if (index < db.myBook.size()){
                    db.myBook.remove(index);
                    System.out.println("删除成功");
                }
                else {
                    System.out.println("删除失败，索引越界");
                }
            }
            else if (flag == 4){
                System.out.print("您确定吗？(y/n)");
                String str = scanner.next();
                if (str.charAt(0) == 'y'){
                    System.out.println("退出系统");
                    break;
                }
                else{
                    continue;
                }
            }
            else{
                System.out.println("输入非法，请重试");
                continue;
            }
        }
    }
}
