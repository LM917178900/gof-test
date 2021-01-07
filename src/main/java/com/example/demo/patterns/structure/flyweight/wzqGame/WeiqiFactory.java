package com.example.demo.patterns.structure.flyweight.wzqGame;

import java.util.ArrayList;

/**
 * 棋子工厂：制造两种类型的棋子
 *
 * @description: WeiqiFactory
 * @author: leiming5
 * @date: 2020-12-31 10:01
 * @author leiming5
 */
public class WeiqiFactory {

    private ArrayList<ChessPieces> qz;
    public WeiqiFactory() {
        qz = new ArrayList<ChessPieces>();

        ChessPieces w = new WhitePieces();
        qz.add(w);

        ChessPieces b = new BlackPieces();
        qz.add(b);
    }

    /**
     * 获取白棋子或者是黑色棋子
     *
     * @param type 棋子类型
     * @return 棋子
     * @author leiming5
     */
    public ChessPieces getChessPieces(String type) {

        if (type.equalsIgnoreCase("w")) {
            return (ChessPieces) qz.get(0);
        } else if (type.equalsIgnoreCase("b")) {
            return (ChessPieces) qz.get(1);
        } else {
            return null;
        }
    }

}
