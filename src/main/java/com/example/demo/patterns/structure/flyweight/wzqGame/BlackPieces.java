package com.example.demo.patterns.structure.flyweight.wzqGame;

import java.awt.*;

/**
 * @description: BlackPieces
 * @author: leiming5
 * @date: 2020-12-31 09:59
 */
public class BlackPieces implements ChessPieces{

    /**
     * 下黑子
     * 在指定位置绘制黑色的指定长宽为30的点椭圆形
     * @param g
     * @param pt
     */
    @Override
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x, pt.y, 30, 30);
    }

}
