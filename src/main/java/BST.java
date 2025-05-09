
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferideucum
 */
public class BST {
 BstNode root;

    public void insert(int score, String username, String level) {
        root = insertRec(root, score, username, level);
    }

    private BstNode insertRec(BstNode root, int score, String username, String level) {
        if (root == null) {
            return new BstNode(score, username, level);
        }
        if (score < root.score) {
            root.left = insertRec(root.left, score, username, level);
        } else {
            root.right = insertRec(root.right, score, username, level);
        }
        return root;
    }

public void printDescending() {
    System.out.println("USERNAME\tLEVEL\tSCORE");
    reverseInorderTraversal(root);
}

private void reverseInorderTraversal(BstNode node) {
    if (node != null) {
        reverseInorderTraversal(node.right); 
        System.out.println(node.username + "\t" + node.level + "\t" + node.score);
        reverseInorderTraversal(node.left); 
    }
}


   public BstNode findMinForUser(String username) {
    return findMinForUserRec(root, username.toLowerCase(), null);
}

private BstNode findMinForUserRec(BstNode node, String username, BstNode currentMin) {
    if (node == null) return currentMin;

    if (node.username.toLowerCase().equals(username)) {
        if (currentMin == null || node.score < currentMin.score) {
            currentMin = node;
        }
    }

    currentMin = findMinForUserRec(node.left, username, currentMin);
    currentMin = findMinForUserRec(node.right, username, currentMin);

    return currentMin;
}


public BstNode findMaxForUser(String username) {
    return findMaxForUserRec(root, username.toLowerCase(), null);
}

private BstNode findMaxForUserRec(BstNode node, String username, BstNode currentMax) {
    if (node == null) return currentMax;

    if (node.username.toLowerCase().equals(username)) {
        if (currentMax == null || node.score > currentMax.score) {
            currentMax = node;
        }
    }

    currentMax = findMaxForUserRec(node.left, username, currentMax);
    currentMax = findMaxForUserRec(node.right, username, currentMax);

    return currentMax;
}


 
   
}
