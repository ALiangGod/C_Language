    package Game;

import javax.swing.*;
import java.util.ArrayList;

public class GameMain {
    public static void main(String[] args) {
        ArrayList<String> userArrayList = new ArrayList<>();
        ArrayList<String> passArrayList = new ArrayList<>();
        userArrayList.add("123456");
        passArrayList.add("666666");
        LoginJFrame login = new LoginJFrame(userArrayList, passArrayList);
//        GameJFrame Game = new GameJFrame();
//        RegisterJFrame register = new RegisterJFrame(userArrayList, passArrayList);
    }
}
