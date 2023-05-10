package Game;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class LoginJFrame extends JFrame implements MouseListener {
    char[] str = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public LoginJFrame(){

        initLoginJFrame();

        initImage();

        //设置界面显示
        this.setVisible(true);


    }

    private void initImage() {
        this.getContentPane().removeAll();
        // 设置用户名
        JLabel namejLabel = new JLabel(new ImageIcon("myModule\\src\\Game\\image\\login\\username.png"));
        namejLabel.setBounds(113, 155, 47, 17);
        this.getContentPane().add(namejLabel);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(180, 153, 140, 25);
        this.getContentPane().add(jTextField);

        //设置密码
        JLabel passjLabel = new JLabel(new ImageIcon("myModule\\src\\Game\\image\\login\\password.png"));
        passjLabel.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passjLabel);

        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setBounds(180, 193, 140, 25);
        this.getContentPane().add(jPasswordField);

        //设置验证码
        JLabel codejLabel = new JLabel(new ImageIcon("myModule\\src\\Game\\image\\login\\code.png"));
        codejLabel.setBounds(108, 235, 56, 21);
        this.getContentPane().add(codejLabel);

        JTextField codejTextField1 = new JTextField();
        codejTextField1.setBounds(180, 233, 140, 25);
        this.getContentPane().add(codejTextField1);

        JLabel initcodejLabel = new JLabel(initCode());
        initcodejLabel.setBounds(200, 233, 60, 25);
        this.getContentPane().add(initcodejLabel);

        //设置登陆 注册按钮
        JLabel loginjLabel = new JLabel(new ImageIcon("myModule\\src\\Game\\image\\login\\login.png"));
        loginjLabel.setBounds(98, 283, 128, 47);
        this.getContentPane().add(loginjLabel);
        JLabel registerjLabel = new JLabel(new ImageIcon("myModule\\src\\Game\\image\\login\\register.png"));
        registerjLabel.setBounds(298, 283, 128, 47);
        this.getContentPane().add(registerjLabel);


        //设置背景
        JLabel backgroundjLabel = new JLabel(new ImageIcon("myModule\\src\\Game\\image\\login\\background.png"));
        backgroundjLabel.setBounds(0, 0, 470, 390);
        this.getContentPane().add(backgroundjLabel);

        this.getContentPane().repaint();
    }

    private String initCode() {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 4; j++){
            Random r = new Random();
            int i = r.nextInt(0, 26);
            sb.append(str[i]);
        }
        return sb.toString();
    }

    private void initLoginJFrame() {
        //创建界面时设置信息
        //设置界面长宽
        this.setSize(488, 430);
        //设置界面的标题
        this.setTitle("登录界面");
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置置顶
        this.setAlwaysOnTop(true);
        //设置退出
        this.setDefaultCloseOperation(3);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
