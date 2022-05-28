package demo;

public class OperatorsDemo {
    public static void main(String[] args) {
        int var_1 = 5;
        float var_f = 3.3f;
        double var_d = 5.15;
        Calculator calculator_1 = new Calculator();
        System.out.println(calculator_1.add(var_1, var_1));
        System.out.println(calculator_1.add(var_f, var_f));
        System.out.println(calculator_1.add(var_d, var_d));
    }
}

class Calculator {
    public int add(int a, int b){
        System.out.println("Sum of two integers: ");
        return a+b;
    }

    public float add(float a, float b){ // overloading: same name, different return type
        System.out.println("Sum of two floats: ");
        return a+b;
    }

    public double add(double a, double b){ //
        System.out.println("Sum of two doubles: ");
        return a+b;
    }
}
