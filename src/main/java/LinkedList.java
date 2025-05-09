public class LinkedList <T> {

    Node<T> head;

    void addFirst(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public int find(int target) {
        Node temp = head;
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
        Node<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
