public class DNode<T> {
    T data;
    DNode <T> currentNode;
    DNode <T> next;
    DNode <T> prev;
    DNode(T data){
        this.currentNode=null;
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
