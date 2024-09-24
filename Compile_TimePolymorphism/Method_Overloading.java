
//  Multiple Functions with the same name but different parameter

package Compile_TimePolymorphism;

/**
 * Method_Overloading
 */
public class Method_Overloading {

    public static void main(String[] args) {
        claculator calc =new claculator();
        System.out.println(calc.sum(1, 02));
        System.out.println(calc.sum(1,2,3));
        System.out.println();

    }
}
class claculator{
    int  sum(int a ,int b){
        return a+b;
    }

    float sum (float a,float b){
        return a+b;
    }
    int sum (int a, int b,int c){
        return a+b+c;
    }
}