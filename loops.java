public class loops {
    public static void main(String[] args) {
        //for loop
        int i;
        for (i = 0; i < 11; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        //do while
        int j = 10;
        do {
            System.out.print(" " + j);
            j--;
        }
        while (j >= 0);
        System.out.println();

        //while loop
        int l =0;
        while(l <=10){
            System.out.print(" " +l);
            l++;
        }


        int sum = 0;
        for (i = 1; i< 11; i++) {
            sum = sum + i;
            System.out.println(" " + sum);
        }
        System.out.println();

    }
}