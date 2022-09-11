public class main3 {
    public static void main(String args[]){
        int a = 0;
        int b = 1;
        int n = 20;
        System.out.println();
       for(int i = 1; i<=n; i++){
        System.out.print(a +  "  ");
        int nextTerm = a + b;
        a = b;
        b = nextTerm;
       }
    }
}
