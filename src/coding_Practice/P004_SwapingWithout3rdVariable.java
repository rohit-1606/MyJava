package coding_Practice;

public class P004_SwapingWithout3rdVariable {
    public static void main(String[] args) {
        swapwithoutThirdVariable();
    }
        public static void swapwithoutThirdVariable(){
            int a=10;
            int b=20;
            System.out.println("Before swaping " + a + " " + b);
            a=a+b;
            b=a-b;
            a=a-b;

            System.out.println("After swaping " + a +" " + b);

        }
}
