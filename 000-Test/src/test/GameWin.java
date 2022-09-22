package test;

import javax.swing.*;

/**
 * @Author Qiao
 * @Create 2022/5/17 19:21
 */

public class GameWin extends JFrame {

    public static void main(String[] args) {
        GameWin gameWin = new GameWin();
        gameWin.launch();
    }

    void launch(){
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setTitle("黄金矿工");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
