import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 số nguyên");
        int num = sc.nextInt();
        int low = 0;
        int height = arr.length - 1;
        boolean check = false;
        while (low <= height) {
            int mid = (low + height) / 2;
            if (arr[mid] == num) {
                System.out.println("phần tử " + num + " nằm ở vị trí số " + mid);
                check = true;
                break;
            } else if (arr[mid] > num) {
                low = mid + 1;
            } else {
                height = mid - 1;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy số " + num);
        }

        /*Scanner sc = new Scanner(System.in);
        System.out.println("nhap 1 so nguyen ");
        int so = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==so){
                System.out.println("so cua ban "+ so+" nam o vi tri so: "+i);
                check = true;
            }
        }
        if (!check){
            System.out.println("khong tim thay");
        }*/
    }
}


