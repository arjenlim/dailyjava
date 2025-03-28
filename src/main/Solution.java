package main;
import java.util.*;
/*public class Solution {
    public int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i>= 0; i--){
            switch(s.charAt(i)){
                case 'I': num = 1;break;
                case 'V': num = 5;break;
                case 'X': num = 10;break;
                case 'L': num = 50;break;
                case 'C': num = 100;break;
                case 'D': num = 500;break;
                case 'M': num = 1000;break;
            }
            if (4 * num < ans) {
                System.out.println(num);
                System.out.println(ans);
                ans -= num;
            }
            else ans += num;
        }
        return ans;
    }
}*/
/*class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 != null && list2 != null){
            if(list1.val<list2.val){
                list1.next=mergeTwoLists(list1.next, list2);
                return list1;
            }
            else{
                list2.next = mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1 == null)
            return list2;
        else{
            return list1;
        }
    }
}*/
class Solution {
    public int getLucky(String s, int k) {
        ArrayList<String> num = new ArrayList<String>();
        int ans = 0;
        for (int i = 0; i< s.length(); i++){
            switch(s.charAt(i)){
                case 'a': num.add("1");
                case 'b': num.add("2");
                case 'c': num.add("3");
                case 'd': num.add("4");
                case 'e': num.add("5");
                case 'f': num.add("6");
                case 'g': num.add("7");
                case 'h': num.add("8");
                case 'i': num.add("9");
                case 'j': num.add("10");
                case 'k': num.add("11");
                case 'l': num.add("12");
                case 'm': num.add("13");
                case 'n': num.add("14");
                case 'o': num.add("15");
                case 'p': num.add("16");
                case 'q': num.add("17");
                case 'r': num.add("18");
                case 's': num.add("19");
                case 't': num.add("20");
                case 'u': num.add("21");
                case 'v': num.add("22");
                case 'w': num.add("23");
                case 'x': num.add("24");
                case 'y': num.add("25");
                case 'z': num.add("26");
            }
        }return ans;
    }
}



