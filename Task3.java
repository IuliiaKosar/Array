package Array;

public class Task3 {
    public static void main(String[] args) {
        String [] colors = {"Red", "Yellow", "brown", "Blue", "White", "Orange", "Green", "Pink", "Violet", "Black"};

        // print out every element in reverse order


        for (String rev  : colors){
            String reverse = "";
            for(int i = rev.length()-1; i >=0; i--){
                reverse +=rev.charAt(i);

            }
            System.out.print(reverse+", ");
        }

    }
}
