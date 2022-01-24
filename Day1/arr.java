import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc =  new Scanner(System.in);
        int P  = sc.nextInt();
        int Q[] = new int[P];
        for(int i = 0; i<P; i++) {
            Q[i] = sc.nextInt();
        }
        for(int i=P-1; i>=0; i--){
            System.out.print(Q[i] + " ");
        }
    }
}
