package common;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[0];
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. N Nhập số N (N lẻ dương)");
            System.out.println("2. Kiểm tra N có là số nguyên tố");
            System.out.println("3. Hiển thị danh sách N số nguyên tố đầu tiên");
            System.out.println("4. Nhập vào mảng gồm N phần tử");
            System.out.println("5. Hiển thị danh sách mảng vừa nhập ở 4");
            System.out.println("6. Liệt kê danh sách các số nguyên tố trong mảng vừa nhập");
            System.out.println("7. Kiểm tra N có tồn tại trong mảng vừa nhập, nếu có trả về vị trí của N trong mảng");
            System.out.println("8. Xóa N khỏi mảng vừa nhập");
            System.out.println("9. Sắp xếp các phần tử của mảng vừa nhập ở 4 theo thứ tự tăng dần");
            System.out.println("Nhập số câu");
            choice = scanner.nextInt();

            switch (choice) {
//               Bài 1. Nhập số N (N lẻ dương), yêu cầu nhập cho đến khi N thỏa mãn điều kiện
                case 1:
                    int n;
                    System.out.println("Nhập n: ");
                    n = scanner.nextInt();

                    if (n % 2 != 0) {
                        System.out.println("n là số lẻ dương");
                    } else {
                        for (int i = 0; i < n; i++) {
                            System.out.print(" nhập lại");
                        }
                    }
                    break;
//                   Bài 2. Kiểm tra N có là số nguyên tố
                case 2:
                    System.out.print("nhập số: ");
                    int number = scanner.nextInt();
                    if (number < 2)
                        System.out.println(number + " không phải là số nguyên tố");
                    else {
                        int i = 2;
                        boolean check = true;
                        while (i <= Math.sqrt(number)) {
                            if (number % i == 0) {
                                check = false;
                                break;
                            }
                            i++;
                        }
                        if (check)
                            System.out.println(number + "là số nguyên tố");
                        else {
                            System.out.println(number + " không phải là số nguyên tố");
                        }
                    }
                    break;
//               Bài 3. Hiển thị danh sách N số nguyên tố đầu tiên
                case 3:
                    int a;
                    int check = 1;
                    int num = 3;
                    System.out.println("Nhập n số nguyên tố đầu tiên:");
                    a = scanner.nextInt();
                    if (a >= 1) {
                        System.out.println(a + " Số nguyên tố đầu tiên là:");
                        System.out.println(2);
                    }
                    for (int i = 2; i <= a; ) {
                        for (int j = 2; j <= Math.sqrt(num); j++) {
                            if (num % j == 0) {
                                check = 0;
                                break;
                            }
                        }
                        if (check != 0) {
                            System.out.println(num);
                            i++;
                        }
                        check = 1;
                        num++;
                    }
                    break;
//               Bài 4. Nhập vào mảng gồm N phần tử
                case 4:
                    int b;
                    do {
                        System.out.println("Nhập vào số phần tử của mảng: ");
                        b = scanner.nextInt();
                    } while (b < 0);
                    array = new int[b];
                    System.out.println("Nhập vào mảng các phần tử: ");
                    for (int i = 0; i < b; i++) {
                        System.out.print("Nhập phần tử thứ " + i + ": ");
                        array[i] = scanner.nextInt();
                    }
//                   Bài 5. Hiển thị danh sách mảng vừa nhập ở 4
                case 5:
                    System.out.println("Mảng vừa nhập: ");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i] );
                    }
                    break;
//               Bài 6. Liệt kê danh sách các số nguyên tố trong mảng vừa nhập
                case 6:
                    for (int i = 0; i < array.length; i ++)
                        if (CheckPrime (array[i]))
                            System.out.println("các số nguyên tố trong mảng vừa nhập :" + array[i]);
                    break;
//               Bài 7. Kiểm tra N có tồn tại trong mảng vừa nhập, nếu có trả về vị trí của N trong mảng
                case 7:
                    int counter, item;
                    System.out.println("Nhập vào giá trị cần kiểm tra trong mảng");
                    item = scanner.nextInt();
                    for (counter = 0; counter < array.length; counter++)
                    {
                        if (array[counter] == item)
                        {
                            System.out.println(item+" Đang ở vị trí "+(counter+1));
                            break;
                        }
                    }
                    if (counter == array.length)
                        System.out.println(item + " Không tồn tại trong mảng.");
                    break;
//               Bài 8. Xóa N khỏi mảng vừa nhập
                case 8:
                    int i, c;
                    System.out.println("Nhập số cần xóa: ");
                    int d = scanner.nextInt();
                    for (c = i = 0; i < array.length; i++) {
                        if (array[i] != d) {
                            array[c] = array[i];
                            c++;
                        }
                    }
                    System.out.println("Mảng còn lại sau khi xóa phần tử " + d + " là: ");
                    for (i = 0; i < array.length; i++) {
                        System.out.print(array[i] );
                    }
                    break;
//               Bài 9. Sắp xếp các phần tử của mảng vừa nhập ở 4 theo thứ tự tăng dần
                case 9:
                    int temp;
                    for ( i = 0; i < (array.length - 1); i++) {
                        for (int j = 0; j < array.length - i - 1; j++) {
                            if (array[j] > array[j + 1]) {
                                temp = array[j];
                                array[j] = array[j + 1];
                                array[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("mảng sau khi sắp xếp là: ");
                    for (i = 0; i < array.length; i++) {
                        System.out.print(array[i]);
                    }
                    break;
            }
        }
    }


    public  static boolean CheckPrime(int n)
    {
        if (n == 1) return false;
        for (int i = 2; i <= Math.sqrt (n); i ++)
            if (n% i == 0) return false;
        return true;
    }
}

