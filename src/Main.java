import java.util.*;
public class Main {
    public char[][] createKeyboard() {
        return new char[][]  {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };
    }
    public void printKeyboard() {
        //char[][] arr = new Main().createKeyboard();
        System.out.println(Arrays.toString(new Main().createKeyboard()[0]));
        System.out.println(Arrays.toString(new Main().createKeyboard()[1]));
        System.out.println(Arrays.toString(new Main().createKeyboard()[2]));
        System.out.println(Arrays.toString(new Main().createKeyboard()[3]));

//        for (char[] tmp : arr) {
//            System.out.println(Arrays.toString(tmp));
//        };
//        for (int i=0; i<arr.length;i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        };
    }
    public static void main(String[] args) {
        new Main().printKeyboard();
    }
}
