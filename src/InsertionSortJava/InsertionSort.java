package InsertionSortJava;

public class InsertionSort {
    public void insertion(String[] ans){
        for (int i = 0; i < ans.length-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (ans[j].compareTo(ans[j - 1]) < 0) {
                    String temp = ans[j];
                    ans[j] = ans[j - 1];
                    ans[j - 1] = temp;
                }
            }
        }
    }
    public void display(String arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();


    }

}
