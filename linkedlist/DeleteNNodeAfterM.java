package linkedlist;

public class DeleteNNodeAfterM {

    private class ListNode {
        int val;
        ListNode next;
    }

    public ListNode deleteNodes(ListNode head, int m, int n) {
        int met = 0;
        ListNode driver = head;
        while (driver != null) {
            met++;
            if (met == m) {
                met = 0;
                ListNode driverRemove = driver;
                while (met != n && driverRemove != null) {
                    met++;
                    driverRemove = driverRemove.next;
                }
                if (driverRemove == null) {
                    driver.next = null;
                    return head;
                }
                met = 0;
                driver.next = driverRemove.next;
            }
            driver = driver.next;
        }
        return head;
    }
}
