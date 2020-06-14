package demo01;

//业务类
public class ZuLin {
    //定义一个汽车类型的数组（仓库）
    QiChe[] qiChes = new QiChe[12];

    //汽车初始化方法
    public void init() {
       /*
        用父类类型的对象来接收 ——子类对象（创建子类对象）
        数组qiChes[]就是父类的一组对象
        初始化：买车
        */

        qiChes[0] = new JiaoChe("宝马", 800, " (京NY28588)", "X6");
        qiChes[1] = new JiaoChe("宝马", 600, " (京CNY3284)", "550i");
        qiChes[2] = new JiaoChe("别克", 300, " (京NT37465)", "林荫大道");
        qiChes[3] = new JiaoChe("别克", 800, " (京NT96968)", "GL8");
        qiChes[4] = new JiaoChe("奥迪", 800, " (京SQ12342)", "A6");
        qiChes[5] = new JiaoChe("奥迪", 900, " (粤SQ66688)", "Q5");
        qiChes[6] = new KeChe  ("金杯", 800, " (京6566754)", 16);
        qiChes[7] = new KeChe  ("金龙", 800, " (京8696997)", 16);
        qiChes[8] = new KeChe  ("金杯", 1500, "(京9696969)", 34);
        qiChes[9] = new KeChe  ("金龙", 1500, "(京7525444)", 34);
        qiChes[10] = new KaChe ("东风", 2000, "(湘AS42731)", 5);
        qiChes[11] = new KaChe ("东风", 2800, "(沪AW42731)", 10);


    }

    //租车方法:根据用户需去数组（仓库）中查找相应的车辆，并给用户
    public QiChe che1(String pinPai, String xinHao, int zuoweishu,int dun) {
        //声明汽车 根据用户选择条件来挑选具体汽车
        QiChe qiChe = null;
        //遍历数组qiChes[](仓库)
        for (QiChe qi : qiChes) {
            //先判断给的对象具体  是轿车类  还是客车类
            if (qi instanceof JiaoChe) {
                //如果是轿车类，进行强转 接收
                JiaoChe jiaoChe = (JiaoChe) qi;
                //轿车类对象jiaoChe属性与用户条件比对，并赋值给汽车类对象qiChe 返回（在仓库中找到并赋值给汽车，在返回具体车辆）
                if (jiaoChe.getPinPai().equals(pinPai) && jiaoChe.getXinHao().equals(xinHao)) {
                        qiChe = jiaoChe;
                        break;
                }
            } else if (qi instanceof KeChe){
                //如果是客车，就进行品牌、座位数 比对
                KeChe keChe = (KeChe) qi;
                if (keChe.getPinPai().equals(pinPai) && keChe.getZuoWeiShu() == zuoweishu) {
                    //将keChe具体对象赋给汽车对象qiChe
                    qiChe = keChe;
                    break;
                }
            }else {
                KaChe kaChe = (KaChe) qi;
                if (kaChe.getPinPai().equals(pinPai)&&kaChe.getDun()==dun){
                    qiChe = kaChe;
                }
            }
        }
        return qiChe;
    }

}
