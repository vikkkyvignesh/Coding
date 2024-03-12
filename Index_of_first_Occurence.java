/*
*
* here we have to find the index of first occurence of String b in String a
*
* by traversing the whole String in a
*
* */

public class Index_of_first_Occurence {
    public static void main(String[] args) {
        String a = "sadbutsad";
        String b = "sad";
boolean res = false;

        for(int i=0, j=b.length();j<a.length();i++,j++)
        {
 res = a.substring(i,j).equals(b);
 if(res)
 {
     System.out.println(i);
 }
        }

    }
}
