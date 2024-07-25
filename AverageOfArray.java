public class AverageOfArray
{
    public static void main(String[] args)
    {
        int   number[] = {1, 7, 9, 11, 12};
        int sum=0;
       for (int i=0; i<number.length; i++)
       {
           sum += number[i];
       }
       int avg = (sum/number.length);
        System.out.println(avg);
    }
}
