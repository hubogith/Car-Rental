package demo01;
//卡车类
public class KaChe extends QiChe {
    private int dun;
    public KaChe(String pinPai, int zuJin, String chePaiHao,int dun) {
        super(pinPai, zuJin, chePaiHao);
        this.dun = dun;
    }

    public double getDun() {
        return dun;
    }

    public void setDun(int dun) {
        this.dun = dun;
    }

    @Override
    public float zongZuJin(int days) {
        float zu= super.getZuJin()*days;
        //根据吨位、天数进行打折
        if (this.dun>0&&this.dun<=5){
            if (days>=3&&days<7){
                zu = zu*0.8f;
            }else if (days>=7&&days<30){
                zu = zu*0.7f;
            }else if (days>=30&&days<150){
                zu = zu * 0.6f;
            }else if (days>=150){
                zu = zu * 0.5f;
            }
        }else if (this.dun>5&&this.dun<=10){
                if (days>=3&&days<7){
                    zu = zu*0.9f;
                }else if (days>=7&&days<30){
                    zu = zu*0.7f;
                }else if (days>=30&&days<150){
                    zu = zu * 0.5f;
                }else if (days>=150){
                    zu = zu * 0.4f;
                }
        }

        return zu;
    }
}
