public class SearchInArray {
    public static void main(String[] args) {
        int [] num = { 1, 2, 3,4,5};
        int search = 4;
        boolean isInArray = false;
        for(int i =0; i < num.length;i++){
            if(search == num[i]){
                isInArray = true;
                break;

            }
        }
        if(isInArray){
            System.out.println("Value is present in array " );
        }else{
            System.out.println("Value is not present in array");
        }
    }
}
