public class DigitProduct {
    public static void main(String[] args) {
        int ans= prod(1342);
        // if it include 0 ans will be 0
        int ans2=prod(707);
        System.out.println(ans);
        System.out.println(ans2);
    }
    static int prod(int n){
        if(n%10==n){
            return n;
        }
        return(n%10) * prod(n/10);
    }
}
