package coding_Practice;

public class P005_SwapingUsing3rdVariable {
    public static void main(String[] args) {
        swapusingThirdVariable();
    }
    public static void swapusingThirdVariable(){
        int a=10;
        int b=20;
        int temp;
        System.out.println("Before swaping " + a +" " + b);
        temp=a;
        a=b;
        b=temp;

        System.out.println("After swaping " + a+ " " + b);


    }
}
