package week5;

import java.util.Scanner;

public class home {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter length of array");
    int array_lenght = Integer.parseInt(scan.next());

    int[] array = new int[array_lenght];

    for (int i = 0 ; i < array_lenght ; i++)
    {
        scan = new Scanner(System.in);
        array[i] = Integer.parseInt(scan.next());
    }

    System.out.println("1. Sort ASC");
    System.out.println("2. Sort DESC");
    System.out.println("3. Search");
    System.out.println("4. Stirring");
    System.out.println("5. Sum");
    System.out.println("6. Max");
    System.out.println("7. Min");
    System.out.println("8. SQRT");
    System.out.println("9. Simmetry");
    System.out.println("10. Inverse");
    System.out.println("11. Show");
    System.out.println("12. Exit");

    scan = new Scanner(System.in);
    int in  =Integer.parseInt(scan.next());

    switch (in)
    {
        case 1 :ASC(array);
            break;
        case 2:DESC(array);
            break;
        case 3:Search(array);

            break;
        case 4:Stirring();
            break;
        case 5 :Sum(array);
            break;
        case 6:Max(array);
            break;
        case 7:Min(array);
            break;
        case 8:SQRT(array);
            break;
        case 9:Simmetry(array);
            break;
        case 11:Show(array);
            break;
        case 12:Exit();
            break;

        default:
            System.out.println("Please enter number from 1 to 12");
            break;
    }


}

    public static void ASC(int[] array)
    {
        for (int i = 0 ; i < array.length; i++)
        {
            for (int j = i+1 ; j < array.length; j++)

                if (array[i] > array[j])
                {
                    int x =array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
        }
        Show(array);
        Refresh();
    }

    private static void Refresh() {
        System.out.println();
        System.out.println("Please enter any key for restart");
        Scanner scan = new Scanner(System.in);
        scan.next();
        main(new String[1]);
    }

    public static void DESC(int[] array)
    {
        for (int i = 0 ; i < array.length; i++)
        {
            for (int j = i+1 ; j < array.length; j++)

                if (array[i] < array[j])
                {
                    int x =array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
        }
        Show(array);
        Refresh();
    }

    public static void Search(int[] array)
    {
        for (int value : array) {
            System.out.print(value + " , ");
        }
        System.out.println("Please enter numer of array: ");
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.next());

        for (int i= 0 ; i < array.length ; i++)
        {
            if (array[i] == number)
            {
                System.out.print("Position of numer (" +number+") is:" +i);
                break;
            }
        }
        Refresh();
    }
    public static void Stirring()
    {
        //
    }
    public static void Sum(int[] array)
    {
        int sum = 0 ;
        for (int value : array) {
            sum += value;
        }
        System.out.print("The sum of the elements of array is:" + sum);
        Refresh();
    }
    public static void Max(int[] array)
    {
        for (int i = 0 ; i < array.length; i++)
        {
            for (int j = i+1 ; j < array.length; j++)

                if (array[i] > array[j])
                {
                    int x =array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
        }
        System.out.print("Max element of the array is:" + array[array.length -1]);
        Refresh();
    }
    public static void Min(int[] array)
    {
        for (int i = 0 ; i < array.length; i++)
        {
            for (int j = i+1 ; j < array.length; j++)

                if (array[i] > array[j])
                {
                    int x =array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
        }
        System.out.print("Max element of the array is:" + array[0]);
        Refresh();
    }
    public static void SQRT(int[] array)
    {
        double sum = 0 ;
        for (int value : array) {
            sum += value;
        }
        sum /= array.length;
        System.out.print("The SQRT of the elements of array is:" + sum);
        Refresh();
    }
    public static void Simmetry(int[] array) {
        boolean symmetric = false;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[array.length - 1]) {
                symmetric = true;
                break;
            }
        }
        System.out.print("The array symmetric :" + symmetric);
        Refresh();
    }


    public static void Show(int... array)
    {
        for (int value : array) System.out.print(value + ", ");
        Refresh();
    }
    public static void Exit()
    {
        System.exit(0);
    }

}


