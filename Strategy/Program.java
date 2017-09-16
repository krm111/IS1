import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        calc.register("+", new Suma());
        calc.register("-", new Resta());
        calc.register("*", new Multiplicacion());
        calc.register("/", new Division());
        calc.register("#", new Numeral());
        calc.register("%", new P());
        
        while(true) {
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            int c = calc.execute(op, a, b);
            System.out.println(c);
        }
    }
}
