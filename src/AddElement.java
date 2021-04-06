import java.net.BindException;
import java.util.Scanner;

public class AddElement {
    public static int getLength(Scanner scanner){
        int size;
        do{
            System.out.println(" mời bạn nhập vào chiều dài mảng bạn muốn: ");
            size = scanner.nextInt();
            if ( size < 1 ){
                System.out.println(" chiều dài mảng không được nhỏ hơn 0!");
            }
        }while ( size < 1);
        return size;
    }
    public static int[] array(int number, Scanner scanner){
        int [] arr = new int[number];
        for ( int i = 0; i < arr.length; i++ ){
            System.out.print("a["+ i +"] = ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static void showArr( int [] arr){
        for (int a : arr) {
            System.out.println(a);

        }

    }
    public static int [] newArray(int[]arr, Scanner scanner){
        int [] newarray = new int[arr.length+1];
        System.out.print(" nhập vào vị trí bạn muốn chèn: ");
        int index = scanner.nextInt();
        System.out.print("giá trị bạn muốn chèn vào mảng: ");
        int number = scanner.nextInt();
        for ( int i = 0; i < index; i++ ){
            newarray[i] = arr[i];
        }
        newarray[index] = number;
        for ( int i = index+1; i < newarray.length; i++ ){
            newarray[i] = arr[i - 1];
        }return newarray;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = getLength(scanner);
        int [] arr = array(length,scanner);
        int [] arr1 = newArray(arr,scanner);
        System.out.println("mảng mới được chèn thêm phần tử là: ");
        showArr(arr1);
    }
}
