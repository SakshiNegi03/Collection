package collection1;

import java.util.*;

public class qus6 {
    public static void main(String[] args) {
    	
    	// taking values for array from user 
        Scanner a = new Scanner(System.in);

        System.out.print("Enter length of array:- ");
        int n = a.nextInt();
        int arr[] = new int[n];

        Set<Integer> hset = new LinkedHashSet<>();
        System.out.print("Enter elements in array:- ");
        for(int i=0; i<n; i++){
            arr[i] = a.nextInt();
            hset.add(arr[i]);
        }

        List<ArrayList<Integer>> freq = new ArrayList<>();
        for(int i: hset){
            int count = 0;
            for(int j=0; j<n; j++){
                if (i == arr[j]){
                    ++count;
                }
            }
            freq.add(new ArrayList<>(Arrays.asList(i, count)));
        }

        //input 5
        //      1 2 3 3 4
        freq.sort(new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> f, ArrayList<Integer> b) {
                return b.get(1)-f.get(1);
            }
        });
        
        System.out.println("Elements in order of decreasing frequency:- ");
        for(ArrayList<Integer> list: freq){
            System.out.println(list.get(0) + ": " + list.get(1));
        }
    }
}
