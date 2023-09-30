package Day14_ForLoops;

public class NestedForLoop1 {
    public static void main(String[] args) {
        int week = 4;
        int days = 7;

        //outher loop prints week
        for (int i = 1; i <=week ; i++) {
            System.out.println("Week : " + i);
            //inner loop prints days
            for (int j = 1; j <= days; j++) {
                System.out.println("---Day : " + j);
            }
        }

    }
}
