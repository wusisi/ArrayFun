import java.util.ArrayList;
import java.util.List;

public class Main {
    int val=5;
    int[] arr = {1, 3, 7, 9, 11, 13};
    int num = arr.length+1;
    int[] arr2=new int[num];


    List<Integer> list2 = new ArrayList();



    public void insert(){
        list2.add(1);
        list2.add(3);

        int i;
        for( i=0;i<arr.length;i++){
            if(arr[i]<val){
                arr2[i]=arr[i];
                continue;
            }
            else{
                int temp = arr[i];
                arr2[i]=val;
                arr2[i+1]=temp;
                break;
            }
        }
        System.out.println("********"+i);

        for(int k=i+1;k<arr.length;k++){
            arr2[k+1]=arr[k];
        }

    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Main a = new Main();
        a.insert();
        for(int i: a.arr2){
            System.out.println(i);
        }

    }
}
