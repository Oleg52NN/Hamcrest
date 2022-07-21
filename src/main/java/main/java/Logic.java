package main.java;
public class Logic {
    private boolean first;
    private boolean second;


    public String resLogic(boolean a, boolean b, String s) {
        if(s.equals("con")) {
           if(conjunction(a, b)){
                return "Истину глаголете!";
            }
            else {
                return "Неправда ваша!";
            }
        }
        else if(s.equals("imp")) {
            if (!implication(a, b)){
                return "Ваши выводы ошибочны!";
            }
            else {
                return "То ли полуправда, то ли ложь, то ли истина?";
            }
        }
        return "Ерунду не пишите!";
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public void setSecond(boolean second) {
        this.second = second;
    }

    public boolean isFirst() {
        return first;
    }

    public boolean isSecond() {
        return second;
    }

     boolean conjunction(boolean a, boolean b) {
        if (a & b) {
            return true;
        } else {
            return false;
        }
    }
    boolean implication(boolean a, boolean b) {
        if (a == true & b == false ) {
            return false;
        } else {
            return true;
        }
    }

}

