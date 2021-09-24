public class sum {
    public static void main(String[] args) {
        float[] marks = {90.5f, 78.6f, 85.32f};
        float sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];

        }
        System.out.print(" sum of marks = " +  sum);
    }
}
