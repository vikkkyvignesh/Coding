public class Remove_Duplicate {
    public static void main(String[] args) {
        int[] a = new int[]{3,2,3,2,3,4};
        int i=0;
        int val=3;
        int j=a.length-1;

        while (i<j)
        {
            if(a[i] == val)
            {
                int t=a[i];
                a[i] =a[j];
                a[j] = t;
                j--;
            }
            else

            {
                i++;
            }
        }

        System.out.println(j);
    }
}
