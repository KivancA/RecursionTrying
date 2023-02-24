public class Concept {
    public static void main(String[] args) {
    fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        //fun(n--); //-- stackoverflow
        fun(--n);
        //n-- vs --n
        //--n ----> substract first then pass
    }
}
