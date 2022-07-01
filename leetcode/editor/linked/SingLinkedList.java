package linked;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2022-07-01 22:42
 * @Description: 单向链表
 */

public class SingLinkedList {

    public static void main(String[] args) {
        Node node = new Node();
        node.add(1);
        node.add(2);
        node.add(3);
        node.add(5);
        node.print();

    }


    static class Node {

        private int data;

        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }

        public Node() {
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void add(int data) {
            Node node = new Node(data);
            if (this.next == null) {
                this.next = node;
            } else {
                this.next.add(data);
            }
        }


        public void print() {
            while (this.next != null) {
                System.out.print(this.next.data+"-->");
                this.next = next.next;
            }
            System.out.println("NULL");
        }
    }
}
