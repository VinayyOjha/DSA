
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreqOfArrayElements{
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 1, 3, 3, 2, 2, 4};

        System.out.println(countFreq(arr));
    }

    private static List<List<Integer>> countFreq(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        for (int element : arr) {
            if (!map.containsKey(element)) map.put(element, map.getOrDefault(element, 0) + 1);
            else
                map.put(element, map.get(element) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            list.add(temp);
        }
        return list;
    }
}