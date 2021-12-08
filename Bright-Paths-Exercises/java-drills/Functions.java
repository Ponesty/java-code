import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {
        helloWorld();
        greeting("Jerrell");
        System.out.println(add(9,10));
        System.out.println(faveColorFinder("blue"));
        System.out.println(thatsOdd(23));
        int[] arr = {10,101,20,300,100};
        System.out.println(Arrays.toString(bigOrSmall(arr)));
    };
    private static void helloWorld() {
        System.out.println("Hello, World!");
    };
    private static void greeting(String name){
        System.out.println("Hello, " + name);
    };
    private static int add(int n1, int n2){
        return n1+n2;
    };
    private static String faveColorFinder(String color){
        switch(color) {
            case "red":
                return color + " is a great color";
            case "green":
                return color + " is a solid favorite color";
            case "black":
                return "so trendy";
            default:
                return "you need to evaluate your favorite color choice";
        }
    };

    private static String thatsOdd(int num){
        if(num % 2 == 0){
            return "That's not odd!";
        } else{
            return "That is odd indeed";
        }
    };
    private static String[] bigOrSmall(int[] arr){
        String[] answer = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 100){
                answer[i] = "big";
            } else{
                answer[i] = "small";
            }
        }
        return answer;
    };
};
