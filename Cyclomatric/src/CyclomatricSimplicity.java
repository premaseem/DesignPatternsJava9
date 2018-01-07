import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class CyclomatricSimplicity {

    /*
    Problem Statement: Need to print biggest number from given numbers
     */

    public static void main (String[] args) {

        Integer a=7,b=4,c=10,d=18;
        // Event when we need to modify parameter, things can be done
        // with minimal code changes

        PrintBiggestNumber(a,b,c,d);
    }

    private static void PrintBiggestNumber (Integer... numbers) {
        System.out.println();
        List list = Arrays.asList(numbers);
        Comparable max = Collections.max(list);
        System.out.println(max + " is biggest (KISS)");
    }
}

// Take Away:
// KISS - Keep it simple stupid.
// Design clean dry less code which can absorb changes.
