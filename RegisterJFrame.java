package Game;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class RegisterJFrame extends JFrame implements MouseListener {
    private ArrayList<String> userArrayList;
    private ArrayList<String> passArrayList;

    String path1 = "myModule\\src\\Game\\image\\register\\rbutton";
    int path2 = 1;
    JLabel rbutton = new JLabel(new ImageIcon(path1 + path2 + ".png"));
    String path3 = "myModule\\src\\Game\\image\\register\\r";
    int path4 = 1;
    JLabel r = new JLabel(new ImageIcon(path3+ path4 + ".png"));

    JTextField user = new JTextField();
    JPasswordField pass = new JPasswordField();




    public RegisterJFrame(ArrayList<String> userArrayList, ArrayList<String> passArrayList){
        this.userArrayList = userArrayList;
        this.passArrayList = passArrayList;

        initRegisterJFRame();

        initImage();

        //设置界面显示
        this.setVisible(true);
    }

    private void initRegisterJFRame() {
        //创建界面时设置信息
        //设置界面长宽
        this.setSize(488, 430);
        //设置界面的标题
        this.setTitle("游戏 注册");
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置置顶
        this.setAlwaysOnTop(true);
        //设置退出
        this.setDefaultCloseOperation(3);
    }

    private void initImage(){
        this.getContentPane().removeAll();

        JLabel userjLabel = new JLabel(new ImageIcon("myModule\\src\\Game\\image\\register\\ruser.png"));
        userjLabel.setBounds(105,145,79, 17);
        this.getContentPane().add(userjLabel);
        user.setBounds(200, 140, 140, 25);
        this.getContentPane().add(user);

        JLabel passjLabel = new JLabel(new ImageIcon("myModule\\src\\Game\\image\\register\\rpass.png"));
        passjLabel.setBounds(120, 175, 64, 16);
        this.getContentPane().add(passjLabel);
        pass.setBounds(200, 170, 140, 25);
        this.getContentPane().add(pass);

        JLabel againjLabel = new JLabel(new ImageIcon("myModule\\src\\Game\\image\\register\\again.png"));
        againjLabel.setBounds(88,205, 96, 17);
        this.getContentPane().add(againjLabel);
        JPasswordField again = new JPasswordField();
        again.setBounds(200, 200, 140, 25);
        this.getContentPane().add(again);

        rbutton.setBounds(270, 270, 128, 47);
        rbutton.addMouseListener(this);
        this.getContentPane().add(rbutton);
        r.setBounds(88, 270, 128, 47);
        r.addMouseListener(this);
        this.getContentPane().add(r);

        JLabel backGroundjLabel = new JLabel(new ImageIcon("myModule\\src\\Game\\image\\register\\background.png"));
        backGroundjLabel.setBounds(0, 0, 470, 390);
        this.getContentPane().add(backGroundjLabel);

        this.getContentPane().repaint();
    }

    private void adduser(ArrayList<String> userArrayList, ArrayList<String> passwordArrayList){
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i).equals(user.getText())){
                addjDialog("该账户已存在");
                return;
            }
        }
        userArrayList.add(user.getText());
        passwordArrayList.add(new String(pass.getPassword()));
    }

    private void addjDialog(String a){
        JLabel jLabel = new JLabel(a);
        JDialog jDialog = new JDialog();
        jDialog.getContentPane().add(jLabel);
        jDialog.setSize(150, 80);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);
        jDialog.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if (source == r){
            this.setVisible(false);
            new LoginJFrame(userArrayList, passArrayList);
        }else if (source == rbutton) {
            userArrayList.add(user.getText());
            passArrayList.add(new String(pass.getPassword()));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        Object source = e.getSource();
//        if (source == rbutton) {
//            rbutton.removeAll();
//            path2++;
//            rbutton.repaint();
//        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object source = e.getSource();
        if (source == rbutton){
            adduser(userArrayList, passArrayList);
            path2--;
            initImage();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
