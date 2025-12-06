public class incArray {
    public static void main(String[] args) {
        int[] array = {1,5,3,9,2};

        boolean ordenado = true;
        for (int i = 0; i< array.length; i++) {
            if(array[i] > array[i+ 1]){
                ordenado = false;
                break;
            }
        }

        if(ordenado) {
            System.out.println("Ordenado");
        } else {

            System.out.println("NAO - Ordenado");
        }
    }
}
