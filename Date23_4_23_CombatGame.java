package myPackage;

public class Date23_4_23_CombatGame {
    public static void main(String[] args) {
        Date23_4_23_GameClass qiao_feng = new Date23_4_23_GameClass("QiaoFeng", 100);
        Date23_4_23_GameClass jiu_zhi_mo = new Date23_4_23_GameClass("JiuZhiMo", 100);
        int qiao_feng_volume = qiao_feng.getVolume();
        int jiu_zhi_mo_volume = jiu_zhi_mo.getVolume();
        while(qiao_feng_volume > 0 && jiu_zhi_mo_volume > 0)
        {
            qiao_feng.attack(jiu_zhi_mo);
            jiu_zhi_mo_volume = jiu_zhi_mo.getVolume();
            if (jiu_zhi_mo_volume <= 0)
            {
                System.out.println("QiaoFeng is winner");
                break;
            }
            jiu_zhi_mo.attack(qiao_feng);
            qiao_feng_volume = qiao_feng.getVolume();
            if(qiao_feng_volume <= 0)
            {
                System.out.println("JiuZhiMo is winner");
                break;
            }
        }
    }
}
