import java.util.Random;

public class main {
    
    public static void main(String[] args) {

        recursiva(1);
    }

    public static int recursiva(int i) {
        if(i > 15000) return 0;
        System.out.println(i);
        return recursiva(i+1);
    }

}
