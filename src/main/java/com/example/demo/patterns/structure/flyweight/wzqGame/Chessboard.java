package com.example.demo.patterns.structure.flyweight.wzqGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @description: Chessboard
 * @author: leiming5
 * @date: 2020-12-31 09:56
 */
public class Chessboard extends MouseAdapter {
    WeiqiFactory wf;
    JFrame f;
    Graphics graphics;

    // 棋子类型
    // 白子
    JRadioButton wz;
    // 黑子
    JRadioButton bz;

    // 坐标




    // 初始化棋盘 界面
    Chessboard() {
        wf = new WeiqiFactory();
        f = new JFrame("享元模式在五子棋游戏中的应用");
        f.setBounds(100, 100, 500, 550);
        f.setVisible(true);
        f.setResizable(false);
        // 退出后关闭系统
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 添加选择棋子类型组件
        JPanel SouthJP = new JPanel();
        f.add("South", SouthJP);
        wz = new JRadioButton("白子");
        bz = new JRadioButton("黑子", true);
        ButtonGroup group = new ButtonGroup();
        group.add(wz);
        group.add(bz);
        SouthJP.add(wz);
        SouthJP.add(bz);


        // 添加中央棋盘组件
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(null);
        centerPanel.setSize(500, 500);
        centerPanel.addMouseListener(this);
        f.add("Center", centerPanel);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        graphics = centerPanel.getGraphics();
        graphics.setColor(Color.BLUE);

        // 绘制棋盘框线
        int w = 40;    //小方格宽度和高度
         int rw = 400;    //棋盘宽度和高度
         int x = 50;
         int y = 50;
        graphics.drawRect(x, y, rw, rw);
        for (int i = 1; i < 10; i++) {
            //绘制第i条竖直线
            graphics.drawLine(x + (i * w), y, x + (i * w), y + rw);
            //绘制第i条水平线
            graphics.drawLine(x, y + (i * w), x + rw, y + (i * w));
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {

        Point point = new Point(e.getX() - 15, e.getY() - 15);

        if (wz.isSelected()) {
            ChessPieces c1 = wf.getChessPieces("w");
            c1.DownPieces(graphics, point);

        } else if (bz.isSelected()) {
            ChessPieces c2 = wf.getChessPieces("b");
            c2.DownPieces(graphics, point);
        }
    }
}
