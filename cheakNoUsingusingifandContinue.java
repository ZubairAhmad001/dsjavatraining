public class cheakNoUsingusingifandContinue {
    public static void main(String[] args) {
        for(int i=1; i<10; i++)
            if(i%2==0){
                System.out.println("even no: " + i);
            }
        else{
                //System.out.println("odd number: " + i);
                continue;
            }
    }
}
