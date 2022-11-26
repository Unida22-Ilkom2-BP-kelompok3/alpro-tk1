public class Operator {
public static void main(String[] args) {
boolean True = true, False = false;
int x = 8;
System.out.println("~ True : " + !True);
System.out.println("~ False : " + !False);
System.out.println();
System.out.println(x > 2 && x < 9);
System.out.println(x > 2 || x < 5);
System.out.println(!(x > 2 && x < 9));
}
}