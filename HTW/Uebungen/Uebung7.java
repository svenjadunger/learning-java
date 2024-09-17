public class Uebung7 {
    
/**
     * Gibt den Index des ersten Vorkommens der gesuchten Zahl zurück.
     * Falls die Zahl im Array nicht vorhanden ist, gibt die Methode -1 zurück.
     * 
     * @param arr das Array von Zahlen
     * @param num die Zahl, die im Array gesucht werden soll
     * @return der Index des ersten Vorkommens der gesuchten Zahl oder -1, wenn die Zahl nicht im Array vorhanden ist
     */
    public static int findNumberIndex(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        // Test
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {};
        int[] arr4 = {10};
        
        System.out.println(findNumberIndex(arr1, 3)); 
        System.out.println(findNumberIndex(arr2, 6)); 
        System.out.println(findNumberIndex(arr3, 1)); 
        System.out.println(findNumberIndex(arr4, 3)); 

    }
}
