package Solution2两数相加;

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode result=new ListNode(0);
        ListNode p3=result;
        int t=0;
        int sum=0;
        while (p1!=null||p2!=null){
            int n1=(p1!=null)?p1.val:0;
            int n2=(p2!=null)?p2.val:0;
             sum=t+n1+n2;
            int y=sum%10;
            t=sum/10;
            ListNode ne=new ListNode(y);
            p3.next=ne;
            p3=p3.next;
            p1=(p1!=null&&p1.next!=null)?p1.next:null;
            p2=(p2!=null&&p2.next!=null)?p2.next:null;
        }
        if (t>0){
            ListNode ne=new ListNode(t);
            p3.next=ne;
        }

        return result.next;
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
