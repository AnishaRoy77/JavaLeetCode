public class Display {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5};

        // Displaying Array (naive way)
        System.out.println("Printing using naive way :\n ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);


        //Displaying array using for loop

        for(int i=0; i<arr.length;i++){
            System.out.println("Printing using for loop :\n");
            System.out.println(arr[i]);
        }

        //printing array in reverse order using  for-each loop
        System.out.println("Printing using for-each loop :\n");
        for(int element : arr){
            System.out.println(element);
        }
    }
}
