public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2; 
        }
        //Avoids ArrayIndexOutOfBoundsException
        if (arr.length > 0) {System.out.println(arr[arr.length-1]);} else {System.out.println("The array is empty");}
    }
}