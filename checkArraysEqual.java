import java.util.Scanner;

public class checkArraysEqual {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for user to enter first array
        System.out.print("Enter list1: ");
        int[][] list1 = getArray();

        // Prompt for user to enter second array
        System.out.print("Enter list2: ");
        int[][] list2 = getArray();

        // Checks if the two arrays are identical then prints the result
        if (equals(list1, list2)) {
            System.out.println("The two arrays are identical.");
         } else {
        System.out.println("The two arrays are not identical.");
    }
}

// Method for 3 x 3 array with user input
public static int[][] getArray() {
    Scanner input = new Scanner(System.in);
    final int ROWS = 3;
    final int COLUMNS = 3;
    int[][] m = new int[ROWS][COLUMNS];
    for (int i = 0; i < ROWS; i++) {
        for (int j = 0; j < COLUMNS; j++) {
            m[i][j] = input.nextInt();
        }
    }
    return m;
}

// Method for checking if arrays are identical
public static boolean equals(int[][] m1, int[][] m2) {
    if (m1.length != m2.length || m1[0].length != m2[0].length) {
        return false;
    }

    // Check through each element of the arrays, 
    // if there's a difference, returns false
    for (int i = 0; i < m1.length; i++) {
        for (int j = 0; j < m1[i].length; j++) {
            if (m1[i][j] != m2[i][j]) {
                return false;
            }
        }
    }
    
    // If all elements are equal, the arrays are identical
    return true;

    }
}