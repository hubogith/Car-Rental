package demo01;
//客车类
public class KeChe extends QiChe {
    //座位数
    private int zuoWeiShu;
    public KeChe(String pinPai, int zuJin, String chePaiHao, int zuoWeiShu) {
        super(pinPai, zuJin, chePaiHao);
        this.zuoWeiShu = zuoWeiShu;
    }
    public int getZuoWeiShu() {
        return zuoWeiShu;
    }
    public void setZuoWeiShu(int zuoWeiShu) {
        this.zuoWeiShu = zuoWeiShu;
    }
    @Override
    public float zongZuJin(int days) {
        //根据天数进行打折
        float zu = super.getZuJin()*days;
        if (days>=3&&days<7){
            zu = zu*0.9f;
        }else if (days>=7&&days<30){
            zu = zu*0.8f;
        }else if (days>=30&&days<150){
            zu = zu * 0.7f;
        }else if (days>=150){
            zu = zu * 0.6f;
        }
        return zu;


    }
}
