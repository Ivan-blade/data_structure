import java.util.*;

public class flab {
    public static void main(String args[]) {
        // 其实日期 2020-2-25
        // data 初始震荡后所剩金额比率
        // origin_rest 无震荡暴跌后剩余比率
        // origin_1 初始本金剩余--不取一定山顶。。。庄家总不至于只割山顶的人吧
        // origin_2 先涨到山顶再下跌的本金比率
        double origin_1 = 1;
        double origin_2 = back(1, 0.6);
        double origin_rest = 0.4;
        double data = init(origin_1,origin_rest);
        System.out.println("初次震荡后本金所剩比率: "+data);
        // 初始震荡后经过周期震荡后的本金所剩比率
        // 参数每个周期一涨一跌比率
        // 震荡周期数
        // 这里一个周期为一周
        int round = 6;
        // 用一个月为单位分析更快一点
        double month_1 = round/4;
        double res_rate = 0.1;
        double res = result(data,res_rate,round);
        System.out.println("经过"+month_1+"个月，"+round+"轮周期"+"幅度为"+res_rate+"的震荡，本金剩余"+ res);

        // end 目标剩余利率
        double end = 0.35;
        int total_num = cal_num(data,end,res_rate); 
        double month_2 = total_num/4;
        System.out.println("本金跌至"+end+"所需轮数为"+total_num+"需要"+month_2+"个月");
    }

    public static int cal_num(double data,double end,double rate) {
        int num = 0;
        while(data > end ) {
            data = back(data,rate);
            num++;
        }
        return num;
    }

    // num1 初始利率
    // num2 下跌后利率
    public static double init(double num1,double num2) {
        return num2/num1;
    }

    // 每个周期一涨一跌变化
    public static double back(double temp,double rate) {
        return temp * (1 + rate) * (1 - rate);
    }


    public static double result(double temp,double rate,int num) {
        while(num > 0) {
            temp = back(temp,rate);
            num--;
        }
        return temp;
    }
}