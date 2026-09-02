public static ListNode mergeKLists(ListNode[] lists) {
    if (lists == null || lists.length == 0) return null;

    ListNode result = lists[0];
    for (int i = 1; i < lists.length; i++) {
        result = mergeTwoLists(result, lists[i]);
    }

    return result;
}

private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;

    while (l1 != null && l2 != null) {
        if (l1.val <= l2.val) {
            curr.next = l1;
            l1 = l1.next;
        } else {
            curr.next = l2;
            l2 = l2.next;
        }
        curr = curr.next;
    }

    curr.next = (l1 != null) ? l1 : l2;
    return dummy.next;
}