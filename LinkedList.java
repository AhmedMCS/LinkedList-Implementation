public class LinkedList {
    Node head;

public void insert(int data) {
    Node node = new Node();
    node.data = data;
    node.next = null;

    if(head == null){
    head = node;
    } else {
        Node n = head;
        while(n.next != null) {
            n = n.next;
        }
        n.next = node;
    }
}

public void insertAtStart(int data) {
    Node node = new Node();
    node.data = data;
    node.next = head;
    head = node;
}
public void delete (int index) {
    Node current = new Node();
    Node prev = new Node();
    prev.next = null;
    if (index < 0 || head == null)
        return;

    if (index == 0) {
       head = head.next;
    } else {
    if (index == 1) {
        prev = head;
        current = prev.next;
        prev.next = current.next;
    } 
    else {
    current = head;
    for (int i = 0; i < index-1; i++) {
        prev = current;
        current = current.next;
    }
    prev.next = current.next;
    
}
    }
}

public void insertMid(int index, int data) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;

    if (index==0) {
        insertAtStart(data);
    } else if (index == 1) 
    {
    Node temp = head.next;
    head.next = newNode;
    newNode.next = temp;
    } else {

    Node current = head;
    Node prev = null;
    for (int i = 0; i < index-1; i++) {
        prev = current;
        current = current.next;
    }
    newNode.next = current;
    prev.next = newNode;
    
    }
}

public void show() {
    Node node = head;
    while(node != null){
        System.out.println(node.data);
        node = node.next;
    }
}
}
