public class NumbersExampleRecursion {
    public static void main(String[] args)
    //write a func takes a num and prints it
            //print first 5 num:1 2 3 4 5
    {
        print(1);
    }

    static void print(int n) {
        //base condition
        if(n==5)
        {
            System.out.println(5);
            return;
        }
        //body
        System.out.println(n);
        //recursive call
        //if you are calling a func again and again,you can treat it as a seperate call in the stack
        //tail recursion ---the last function call
        print(n + 1);

    }
}
