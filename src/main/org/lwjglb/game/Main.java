package org.lwjglb.game;

import org.lwjglb.engine.GameEngine;
import org.lwjglb.engine.IGameLogic;
 
public class Main {
 
    public static void main(String[] args) {
        try {
            boolean vSync = true;
            IGameLogic gameLogic = new DummyGame();
            GameEngine gameEng = new GameEngine("GAME", 1200, 900, vSync, gameLogic);
            gameEng.start();
        } catch (Exception excp) {
            excp.printStackTrace();
            System.exit(-1);
        }
    }
}