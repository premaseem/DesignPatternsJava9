/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class CyclomatricComplexity {

    /*
    Problem Statement: Need to print biggest number from given numbers
     */

    public static void main (String[] args) {

        Integer a=7,b=4,c=10,d=18;

        if (a > b) {
            if(a > c){
                if (a >d){
                    System.out.println(a+ " is biggest");
                }
            }
        }

        if (b > c) {
            if(b > d){
                if (b >a){
                    System.out.println(b+ " is biggest");
                }
            }
        }

        if (c > b) {
            if(c > a){
                if (c >d){
                    System.out.println(c+" is biggest");
                }
            }
        }

        if (d > b) {
            if(d > c){
                if (d >a){
                    System.out.println(d+" is biggest");
                }
            }
        }
    }
}

// Take Away:
// If the decision points are more, then complexity of the program is more.
// If program has high complexity number, then probability of error is high
// with increased time for maintenance and trouble shoot.