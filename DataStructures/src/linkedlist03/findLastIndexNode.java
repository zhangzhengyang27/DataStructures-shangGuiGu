package linkedlist03;

public class findLastIndexNode {

    // 查找单链表中的倒数第k个结点 【新浪面试题】
    //1. 正数:链表的总长度 - k

    public static HeroNode findLastIndexNode(HeroNode head, int index) {

        if (head.next == null) {
            return null;
        }

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        int size = singleLinkedList.getLength(head);

        if (index <= 0 || index > size) {
            return null;
        }
        //定义给辅助变量， for 循环定位到倒数的index
        HeroNode cur = head.next;
        for (int i = 0; i < size - index; i++) {
            cur = cur.next;
        }
        return cur;
    }
}
