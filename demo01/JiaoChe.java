package demo01;

//轿车类
public class JiaoChe extends QiChe {
    //轿车型号
    private String xinHao;
//轿车构造方法
    public JiaoChe(String pinPai, int zuJin, String chePaiHao, String xinHao) {
        super(pinPai, zuJin, chePaiHao);
        this.xinHao = xinHao;
    }
    public String getXinHao() {
        return xinHao;
    }
    public void setXinHao(String xinHao) {
        this.xinHao = xinHao;
    }

    @Override
    public float zongZuJin(int days) {
        //根据天数进行打折
        float zu = super.getZuJin()*days;
        if (days>7&&days<=30){
            zu = zu*0.9f;
        }else if (days>30&&days<=150){
            zu = zu*0.8f;
        }else if (days>=150){
            zu = zu * 0.7f;
        }
        return zu;
    }
}
