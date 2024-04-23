public class SinglyLinkedList1 {
    public static void main(String[] args) {
        singlyLinkedList sll = new singlyLinkedList();
        sll.insertAtBeginning(2);
        sll.insertAtBeginning(3);
       // sll.insertAtBeginning(4);
       // sll.insertAtBeginning(5);
       // sll.insertAtBeginning(6);

        //sll.printList();

       // sll.insertAtEnd(1);
       // sll.insertAtEnd(2);
        sll.insertAtEnd(4);
        sll.insertAtEnd(8);

        //sll.printList();

       // sll.insertAtBetween(0, 4);

        //sll.printList();

        //sll.insertAtBetween(0, 9);
        //sll.printList();
        sll.deleteNode(3);
        sll.deleteNode(4);
        sll.deleteNode(2);
        sll.deleteNode(8);
        sll.deleteNode(4);
        sll.printList();
    }
}

class Node{
    Node next;
    int data;
    Node(int data){
        this.next = null;
        this.data = data;
    }
}

class singlyLinkedList{
    Node head = null;


     void insertAtBeginning(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    void insertAtBetween(int data, int num){
        Node newNode = new Node(data);

        Node temp = head;

        while(temp!=null && temp.data!=num){
            temp = temp.next;
        }

        if(temp==null){
            System.out.println("Value doesn't exists");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head==null){
            newNode = head;
            return;
        }

        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = newNode;
    }
    
    void deleteNode(int num){
        Node currentNode = head;
        Node prevNode = null;

        while(currentNode!=null && currentNode.data!=num){
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        if(currentNode==head){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            head = head.next;
            return;
        }

        prevNode.next = currentNode.next;
    }
    void printList(){
        Node tempNode = head;

        while(tempNode!=null){
            System.out.print(tempNode.data+" ");
            tempNode = tempNode.next;
        }
    }
}