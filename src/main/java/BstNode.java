/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferideucum
 */
public class BstNode {
    int score;
    String username;
    String level;
    BstNode left, right;

    public BstNode(int score, String username, String level) {
        this.score = score;
        this.username = username;
        this.level = level;
        left = right = null;
    }
}
