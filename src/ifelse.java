/* Author: Bethlehem Teshome
Using printf
09/28/2017
* */

import java.util.Scanner;
public class ifelse {
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n,m;
        System.out.println("How would you like to see the result?");
        System.out.println("For println enter 1; And for printf enter 2. ");
        int option =x.nextInt();

        if(option==1) {  //if true or if the user chooses option one display results using println
            System.out.println("Hello Abraham");
            System.out.println("you received A on the test");
            System.out.println("your test score is 94");
            System.out.println("your test score before being rounded is 9.386e+01 ");
            System.out.println("your gpa is 3.610");
        }
        else{  // if false or if the user chooses another number that is not 1 display results using printf
            System.out.printf("Hello %s\n","Abraham"); //%s adds a string
            System.out.printf("you received  %c on the test\n",'A'); //%c adds a character
            System.out.printf("your test score is %d\n",94 ); //%d adds a decimal value
            System.out.printf("your test score before being rounded is %10.3e\n",93.8599); //%e writes value in
            // exponent form
            System.out.printf("your gpa is %4.3f\n",3.61);//4 represent how long the value is and 3 represents the
            // decimal value. f represents float number



        }

    }
}
