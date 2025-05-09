/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author safaalev
 */
public class DLinkedList<T> {
    DNode<T> header, tail;
    private int size = 0;

    DLinkedList() {
        header = tail = null;
    }

    void addFirst(T data) {
        DNode<T> newNode = new DNode(data);
        if (header == null) {
            header = tail = newNode;
        } else {
            newNode.next = header;
            header.prev = newNode;
            header = newNode;
        }
        size++;
    }
    public int dFind(int target) {
        DNode temp = header;
        for (int i = 1; i < target; i++) {
            if (temp == null || temp.next == null) {
                return -1;
            }
            temp = temp.next;
        }
        if (temp == null || temp.data == null) {
            return -1;
        }
        return (Integer) temp.data;
    }
    void print() {
        DNode<T> temp = header;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }
}
