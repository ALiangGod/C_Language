package Game;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class GameJFrame extends JFrame {

    int[][] date = new int[4][4];
    public GameJFrame(){

        initDate(date);

        initJFRame();

        initJFrameBar();

        initImage(date);







        //设置界面显示
        this.setVisible(true);

    }
    private void initDate(int[][] date){
        int[] date1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for(int i = 0; i < date1.length; i++){
            int index = r.nextInt(date1.length);
            int temp = date1[i];
            date1[i] = date1[index];
            date1[index] = temp;
        }

        for (int i = 0; i < date1.length; i++) {
            date[i/4][i%4] = date1[i];
        }
    }

    private void initImage(int[][] date) {
        /*// 创建图片
        ImageIcon icon = new ImageIcon("D:\\IDEA\\myModule\\src\\Game\\image\\animal\\animal1\\2.jpg");
        // 创建一个容器放置图片
        JLabel jLabel = new JLabel(icon);
        jLabel.setBounds(0, 0, 105, 105);
        this.getContentPane().add(jLabel);*/
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                JLabel jLabel = new JLabel(new ImageIcon("D:\\IDEA\\myModule\\src\\Game\\image\\animal\\animal1\\"+date[i][j]+".jpg"));
                jLabel.setBounds(105 * j, 105 * i, 105, 105);
                this.getContentPane().add(jLabel);
            }
        }
    }

    private void initJFrameBar() {
        //设置菜单
        //创建菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单下面项目对象
        JMenu jMenu1 = new JMenu("功能");
        JMenu jMenu2 = new JMenu("给开发者钱钱儿");
        //创建功能里面的选项
        JMenuItem rePlayGame = new JMenuItem("重新开始游戏");
        JMenuItem reLoginGame = new JMenuItem("重新登陆游戏");
        JMenuItem exitGame = new JMenuItem("退出游戏");

        JMenuItem reCharge = new JMenuItem("充值小二维码");
        //添加选项到功能
        jMenu1.add(rePlayGame);
        jMenu1.add(reLoginGame);
        jMenu1.add(exitGame);

        jMenu2.add(reCharge);
        //添加功能到菜单
        jMenuBar.add(jMenu1);
        jMenuBar.add(jMenu2);
        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFRame() {
        //创建界面时设置信息
        //设置界面长宽
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("拼图小游戏 V1.0");
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置置顶
        this.setAlwaysOnTop(true);
        //设置退出
        this.setDefaultCloseOperation(3);
        //取消居中放置控件
        this.setLayout(null);
    }
}
