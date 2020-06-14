package demo01;

import java.util.Scanner;

//汽车管理类（测试类）
public class Text {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //先创建租赁业务类（具体车辆）
        ZuLin zuLin = new ZuLin();
        //给数组赋值（买车放入仓库）
        zuLin.init();
        System.out.println("************欢迎光临租赁公司************");
        System.out.println("1.轿车  2.客车  3.卡车");
        int xuanZe = 0;//选择
        boolean flas = true;//标识
        //用户租车条件
        String pinpai = " ";//品牌
        String xinhao = " ";//型号
        int zuoweishu = 0;//座位数
        int dun = 0;//自重吨位
        System.out.print("请选择您要租赁的车型:");
        //判断输入是否正确
        do {
            xuanZe = input.nextInt();
            if (xuanZe <= 3 && xuanZe > 0) {
                flas = false;
                break;
            } else {
                System.out.print("输入错误请重新选择:");
            }
        } while (flas == true);
        //租赁轿车:收集用户条件
        boolean as;
        if (xuanZe == 1) {
            do {
                as = true;
                System.out.print("请选择您要租赁的轿车品牌:1、宝马  2、别克  3、奥迪 ：");
                int s = input.nextInt();
                switch (s) {
                    case 1://租宝马
                        pinpai = "宝马";
                        System.out.print("请选择您要租赁的汽车型号:1、X6  2、550i  :");
                        int s1 = 0;
                        boolean flas1;
                        do {
                            flas1 = true;
                            s1 = input.nextInt();
                            if (s1 <= 2 && s1 > 0) {
                                flas1 = false;
                                break;
                            } else {
                                System.out.print("输入错误请重新选择:");
                            }
                        } while (flas1 == true);
                        xinhao = (s1 == 1) ? "X6" : "550i";
                        break;
                    case 2://租别克
                        pinpai = "别克";
                        System.out.print("请选择您要租赁的汽车型号:1、林荫大道  2、GL8  :");
                        int s2 = 0;
                        boolean flas2 = true;
                        do {
                            s2 = input.nextInt();
                            if (s2 <= 2 && s2 > 0) {
                                flas = false;
                                break;
                            } else {
                                System.out.print("输入错误请重新选择:");
                            }
                        } while (flas2 == true);
                        xinhao = (s2 == 1) ? "林荫大道" : "GL8";
                        break;
                    case 3://租奥迪
                        pinpai = "奥迪";
                        System.out.print("请选择您要租赁的汽车型号:1、A6  2、Q5  :");
                        int s3 = 0;
                        boolean flas3 = true;
                        do {
                            s3 = input.nextInt();
                            if (s3 <= 2 && s3 > 0) {
                                flas = false;
                                break;
                            } else {
                                System.out.print("输入错误请重新选择:");
                            }
                        } while (flas3 == true);
                        xinhao = (s3 == 1) ? "A6" : "Q5";
                        break;
                    default:
                        as = false;
                        System.out.println("输入错误，请重新输入！");
                        break;
                }
            } while (as == false);
        }
        //租赁客车
        else if (xuanZe == 2) {
            System.out.print("请选择您要租赁的客车品牌:1、金杯  2、金龙  ：");
            pinpai = (input.nextInt() == 1) ? "金杯" : "金龙";
            System.out.print("请选择您要租赁的客车座位数:1、16座   2、34座:");
            zuoweishu = (input.nextInt() == 1) ? 16 : 34;
        } else if (xuanZe == 3) {
            pinpai = "东风";
            System.out.print("请选择您要租赁的卡车自重吨位:1、5吨  2、10吨");
            dun = (input.nextInt()==1)?5:10;
        }
        //根据用户租车条件 来租车
        QiChe qiChe1 = zuLin.che1(pinpai, xinhao, zuoweishu, dun);
        System.out.print("请输入你的租赁天数:");
        int days = input.nextInt();
        float money = qiChe1.zongZuJin(days);
        System.out.print("您需要支付:" + money + "元:");
        int moneys = input.nextInt();
        System.out.println("已支付:" + moneys + "元");
        if (moneys >= money) {
            System.out.println("租车成功，请按照如下车牌号去提车:" + qiChe1.getChePaiHao());
        } else {
            System.out.println("对不起，支付金额不对！");
        }
    }
}
