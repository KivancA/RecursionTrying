public class Nto1 {
    public static void main(String[] args) {
        fun(5);
        System.out.println("*");
        funRev(5);
        System.out.println("*");
        funBoth(5);
    }
    static void fun(int n){
        //5 4 3 2 1
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funRev(int n){
        //1 2 3 4 5
        if(n==0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
    static void funBoth(int n){
        //5 4 3 2 1 1 2 3 4 5
        if(n==0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }

}
