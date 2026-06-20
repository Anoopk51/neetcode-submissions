class MyLinkedList {
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if( index< 0 || index >=size){
            return -1;
        }
       Node temp = head;
        int i= 0;
        while(i < index){
            temp = temp.next;
            i++;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
       Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
  }
    
    public void addAtTail(int val) {
        Node temp = head;
        Node newNode = new Node(val);
        if(temp  == null){
            addAtHead(val);
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size){
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        Node temp = head;
        Node newNode = new Node(val);
        int i=0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }
    
    public void deleteAtIndex(int index) {
       if(index < 0 || index >= size){
        return;
       }
        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        int i=0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */