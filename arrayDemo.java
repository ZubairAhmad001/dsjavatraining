public class arrayDemo {
    public static void main(String[] args) {
        //String[] names = new String[5];
        String[] words = {"Zubair", "Ankit", "Madhur", "Danish", "Nevin"};
        for( int i=0;  i< words.length; i++){
            System.out.println(words[i]);
        }
        System.out.println();
        words[1]="tiwari";
        for( int i=0;  i< words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
