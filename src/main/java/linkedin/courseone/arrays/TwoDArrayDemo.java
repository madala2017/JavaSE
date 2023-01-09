package linkedin.courseone.arrays;

public class TwoDArrayDemo {
    public static void main(String[] args) {

        int a[] = {1,2,3,4};
        int b[] = {2,4,6,8};
        int c[] = {5,6,7,8};

        int d[][] = {
                        {1,2,3},  // Jagged Arrays
                        {2,4,6,8},
                        {5,6,7,8,9}
                    };

        for(int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Using enhanced forloop on 2D Arrays");
        for (int k[] : d) {
            for (int l : k) {
                System.out.print(l+ " ");
            }
            System.out.println();
        }
    }
}
