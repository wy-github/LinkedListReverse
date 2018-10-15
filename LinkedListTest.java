//
//public class LinkedListTest {
//    public static void main(String[] args) {
//        Node A = new Node(1);
//        Node B = new Node(2);
//        Node C = new Node(3);
//        Node D = new Node(4);
//        A.next = B;
//        B.next = C;
//        C.next = D;
//        print(A);
//       Node temp = reverse(A);
//        print(temp);
//    }
//
//    public static Node reverse(Node node){
//        Node pre ;
//        if(node == null || node.next  == null){
//            pre = node;
//        }else{
//            Node tmp = execute(node.next);
//            node.next.next = node;
//            node.next = null;
//            pre = tmp;
//
//        }
//         return  pre;
//    }
//
//    public static Node execute(Node node) {
//        Node prev = null;
//        while (node != null) {
//            Node tmp = node;
//            node = node.next;
//            tmp.next = prev;
//            prev = tmp;
//        }
//        return prev;
//    }
//
//
////    public static void print(Node node) {
////        while (node != null) {
////            System.out.print(node.value);
////            node = node.next;
////            if (node != null) {
////                System.out.print("->");
////            } else {
////                System.out.println();
////            }
////        }
////    }
//
//}
