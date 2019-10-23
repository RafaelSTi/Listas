
public class LinkedIntList {

    private ListNode first;
    private int size;

    public LinkedIntList() {
        first = null;
        size = 0;
    }

    public ListNode getFirst() {
        return first;
    }

    LinkedIntList(LinkedIntList l) {
        first = l.getFirst();
        size = l.size;
    }

    void print() {

        ListNode cursor = first;

        while (cursor != null) {
            System.out.println(cursor.val);
            cursor = cursor.next;
        }
    }

    public int indexOf(int v) {
        int index = 0;
        ListNode cursor;
        for (cursor = first; cursor != null && cursor.val != v; cursor = cursor.next) {
            index++;
        }
        if (cursor == null) {
            index = -1;
        }
        return index;
    }

    public void add(int v, int index) {
        if (index == 0) {
            first = new ListNode(v, first);
        } else {
            ListNode cursor = first;
            for (int i = 0; i < index - 1; i++) {
                cursor = cursor.next;
            }
            cursor.next = new ListNode(v, cursor.next) ;
        }
        size++;
    }
          
   
}