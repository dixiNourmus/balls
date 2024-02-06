import jdk.swing.interop.SwingInterOpUtils;

public class batman {

    public static  void main(String[] args) {

        int inBalance = 1000;
        double interest = 1.05;
        double yearOne = inBalance * interest;
        double yearTwo = yearOne * interest;
        double yearThree = yearTwo * interest;

        System.out.println("year one total is " + yearOne);
        System.out.println("year two total is " + yearTwo);
        System.out.println("year three total is " + yearThree);

    }
}
