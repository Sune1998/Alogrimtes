public class SearchAlgoriyme {
    public static void main(String[] args) {
        int[] numArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; // intialises array
        int num = 10; // number im lokking for.

        for (int i = 0; i <numArray.length ; i++) {

            if (num == numArray[i]){
                System.out.println("num has been found" + i);
                break;
            }
            else System.out.println("num has not been found" + i);
            
        }
    }
}
