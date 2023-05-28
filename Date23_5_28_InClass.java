package myPackage;

public class Date23_5_28_InClass {
    public static void main(String[] args) {


        // 使用for语句写出的代码
        for (int zhiZhu = 0; zhiZhu <= 100; zhiZhu++)
            for (int qintTing = 0; qintTing <= 100-zhiZhu; qintTing++)
                if ((zhiZhu*8 + qintTing*6 + (100 - zhiZhu - qintTing)*4) == 600)
                    System.out.println("zhiZhu=" + zhiZhu + "qingTing=:" + qintTing + "shuiYing=:" + (100 - zhiZhu - qintTing));










         // 使用while语句写出的代码
         /*while (zhiZhu <= 100) {
            int qintTing = 0;
            while (qintTing <= 100-zhiZhu){
                shuiYing = 100 - zhiZhu - qintTing;
                if ((zhiZhu*8 + qintTing*6 + shuiYing*4)==600)
                    System.out.println("zhiZhu=" + zhiZhu + "qingTing=:" +qintTing + "shuiYing=:" + shuiYing);
                qintTing++;
            }
            zhiZhu++;
        }*/

    }
}
