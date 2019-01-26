package Solution2两数相加;

public class Solution2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1;
        ListNode p2=l2;

        ListNode p3=new ListNode(0);
        ListNode result=p3;

        int y=0;
        int sum;
        while (p1!=null||p2!=null){
            int v1=(p1!=null)?p1.val:0;
            int v2=(p2!=null)?p2.val:0;

            sum=v1+v2+y;
            result.next=new ListNode(sum%10);
            result=result.next;
            y=sum/10;

            p1=(p1!=null)?p1.next:null;
            p2=(p2!=null)?p2.next:null;
    }
    if (y>0){
           result.next=new ListNode(y);
    }

        return p3.next;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(8);

        ListNode l2=new ListNode(0);

        ListNode r=addTwoNumbers(l2,l1);

        while (r!=null){
            System.out.println(r.val);
            r=(r.next!=null)?r.next:null;
        }

        System.out.println("---");
    }
}
