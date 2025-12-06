import java.util.Scanner;

public class InsertArrayLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int tamanho = sc.nextInt();
        int[] array = new int[tamanho];

        System.out.println("Enter the elements of the array");
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Array inserted ");

        for(int a : array) {
            System.out.print(a + " ");
        }


        int[] array1 = {1,2,3,4,5};
        int[] array2 = {4,7,9,12,55};
        int[] soma = new int[array1.length];

        for(int i = 0; i < array1.length; i++) {
            soma[i] = array1[i] + array2[i];
        }

        System.out.println("Soma dos elementos inseridos " );
        for(int s : soma) {
            System.out.print(s + " ");
        }


       int somaTotal = 0;
       for(int i = 0; i< soma.length;i++) {
           somaTotal += soma[i];
       }
        System.out.println("Soma TOTAL dos elementos inseridos " + somaTotal);
        sc.close();
    }
}
