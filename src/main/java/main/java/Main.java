package main.java;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        System.out.println(calc("sqrt", 25));
        System.out.println(calc("sqrt", 10));
        System.out.println(calc("/", 10, 50));
        System.out.println(calc("///", 7));
        System.out.println(calc("sqrt", -1));
        System.out.println(calc("*", Double.MAX_VALUE, Double.MAX_VALUE));
        System.out.println(new Logic().resLogic(true, true, "con"));
        System.out.println(new Logic().resLogic(true, false, "imp"));    }

    public static double calc(String operator, double... a) {
        if (a.length > 2 || a.length < 1) {
            return Double.NaN;
        } else if (a.length == 2) {

            if (operator.equals("+")) {
                return a[0] + a[1];
            }
            if (operator.equals("-")) {
                return a[0] - a[1];
            }
            if (operator.equals("*")) {
                return a[0] - a[1];
            }
            if (operator.equals("/")) {
                if (a[1] == 0) {
                    return Double.NaN;
                } else {
                    return a[0] / a[1];
                }
            }
        } else if (a.length == 1){
            if (operator.equals("sqrt")){
                return sqrt(a[0]);
            }
            if (operator.equals("2")){
                return a[0]*a[0];
            }

        }
        return Double.NaN;
    }

}

