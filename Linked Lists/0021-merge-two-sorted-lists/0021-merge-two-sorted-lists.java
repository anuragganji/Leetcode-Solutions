/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = null;
        ListNode start = null;//to store starting node
        //add one node at a time until one of the linked lists is empty
        while(list1 != null && list2 != null){
            if(list1.val<list2.val){
                if(list==null){
                    //If it is first node
                    list=list1;
                    start = list;
                }else{
                    list.next = list1;
                    list = list.next;
                }
                
                list1 = list1.next;
            }else{
                if(list==null){
                    list=list2;
                    start = list;
                }else{
                    list.next = list2;
                    list = list.next;
                }
                list2 = list2.next;
            }
        }
        //Add the remaining nodes of the non empty linked list
       if(list1!=null){
           if(list==null){
               list = list1;
               start = list;
           }else{
               list.next = list1;
           }
       }
       if(list2!=null){
           if(list==null){
               list = list2;
               start = list;
           }else{
               list.next = list2;
           }
       }
        
        return start;
    }
}