package demo01;
//汽车类 （父类）
public abstract class QiChe {
    //品牌   日租金  车牌号
    private String pinPai ;
    private int zuJin;
    private String chePaiHao;

    public QiChe(String pinPai, int zuJin, String chePaiHao) {
        this.pinPai = pinPai;
        this.zuJin = zuJin;
        this.chePaiHao = chePaiHao;
    }

    public String getPinPai() {
        return pinPai;
    }

    public void setPinPai(String pinPai) {
        this.pinPai = pinPai;
    }

    public int getZuJin() {
        return zuJin;
    }

    public void setZuJin(int zuJin) {
        this.zuJin = zuJin;
    }

    public String getChePaiHao() {
        return chePaiHao;
    }

    public void setChePaiHao(String chePaiHao) {
        this.chePaiHao = chePaiHao;
    }


    //总租金的计算抽象方法
    public abstract float zongZuJin(int days);
}
