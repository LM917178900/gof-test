package com.example.demo.patterns.structure.flyweight.wzqGame;

import java.awt.*;

public class WhitePieces implements ChessPieces {

    @Override
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.WHITE);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
