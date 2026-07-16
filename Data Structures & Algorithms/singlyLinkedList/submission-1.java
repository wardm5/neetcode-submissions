class LinkedList {
    public Node head;

    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        if (this.head == null)
            return -1;
        if (index == 0)
            return this.head.get();
        Node curr = head;
        while (curr != null && index > 0) {
            curr = curr.next;
            index--;
        }
        if (index > 0 || curr == null)
            return -1;
        return curr.get();
    }

    public void insertHead(int val) {
        Node newHead = new Node(val);
        newHead.next = this.head;
        head = newHead;
    }

    public void insertTail(int val) {
        if (this.head == null) {
            head = new Node(val);
            return;
        }

        Node tempHead = this.head;
        while (tempHead.next != null) {
            tempHead = tempHead.next;
        }
        tempHead.next = new Node(val);
    }

    public boolean remove(int index) {
        if (this.head == null) return false;
        if (index == 0) {
            this.head = this.head.next;
            return true;
        }

        Node tempHead = this.head;
        int i = 0;
        while (tempHead != null && i < index - 1) {
            tempHead = tempHead.next;
            i++;
        }

        if (tempHead == null || tempHead.next == null) return false;
        tempHead.next = tempHead.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        Node tempHead = this.head;
        while (tempHead != null) {
            list.add(tempHead.get());
            tempHead = tempHead.next;
        }
        return list;
    }
}

class Node {
    private int val;
    public Node next;
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
    public int get() {
        return this.val;
    }
}
