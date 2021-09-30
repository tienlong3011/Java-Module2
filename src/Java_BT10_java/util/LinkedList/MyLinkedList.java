package Java_BT10_java.util.LinkedList;

public class MyLinkedList {
    private Node head;
    private int numNodes;


    private class Node{
        private Object data;
        private Node next;


        public Node(Object data) {
            this.data = data;
        }


        public Object getData() {
            return data;
        }
    }


    public void addFirst(Object data){
        Node newNode = new Node(data);
        Node temp = head;
        head = newNode;
        head.next = temp;
        numNodes++;
    }


    public void add(int index, Object data){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }


    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
}


