class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class MyLinkedList {
    ListNode head;
    int size;

    public MyLinkedList() {
        head = new ListNode(0);
        size = 0;
    }
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        ListNode cur = head;
        while(index >= 0){
            cur = cur.next;
            index--;
        }
        return cur.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
        
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        // if(index < 0) index = 0;      
        ListNode cur = head;
        ListNode node = new ListNode(val);
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }
        node.next = cur.next; 
        cur.next = node;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return;
        ListNode cur = head;
        while(index > 0){
            cur = cur.next;
            index--;
        }
        cur.next = cur.next.next;
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