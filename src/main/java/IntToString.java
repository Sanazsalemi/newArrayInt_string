public class IntToString {

    public static void main(String[] args) {
        int[] myArray = {1 ,4 ,7 , 9};
        String[] Str = {"One" ,"Four", "Seven","Nine"};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 1) {
                System.out.println(Str[i]);
            } else if (myArray[i] == 4) {
                System.out.println(Str[i]);
            } else if (myArray[i] == 7) {
                System.out.println(Str[i]);
            } else if (myArray[i] ==9 ) {
                System.out.println(Str[i]);}
            else{
                System.out.println("null");
            }
        }
    }
}
