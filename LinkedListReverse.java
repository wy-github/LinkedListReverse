public class LinkedListReverse {
    public static void main(String[] args) {
        Node A = new Node(11);
        Node B = new Node(22);
        Node C = new Node(33);
        Node D = new Node(44);
        A.next = B;
        B.next = C;
        C.next = D;
        print(A);
        print(reverse(A));
    }

    public static Node reverse(Node head){
        Node reversedHead = null; //反转过后的单链表存储头结点
        Node node = head; //定义node指向head;
        Node prev = null; //定义存储前一个结点
        while(node != null){
            Node next = node.next; //定义next指向node的下一个结点
            if(next==null){ //如果node的下一个结点为空，则node即为结果
                reversedHead = node;
            }
            node.next = prev; //修改node的指针域指向prev
            prev = node; //将node结点复制给prev
            node = next; //将node的下一个结点复制给node
        }
        return reversedHead;
    }

    public static void print(Node node) {
        while (node != null) {
            System.out.print(node.value);
            node = node.next;
            if (node != null) {
                System.out.print("->");
            } else {
                System.out.println();
            }
        }
    }

}
