// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.LinkedHashMap;
// import java.util.LinkedHashSet;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Map;
// import java.util.Set;
// import java.util.TreeMap;
// import java.util.TreeSet;
import java.util.*;

public class ListMapSet {
    public static void main(String[] args) {

        //List
        List<String> list1 = new ArrayList<>();

        List<String> list2 = new LinkedList<>();

        System.out.println(list1);
        System.out.println(list2);

        //Map
        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new TreeMap<>();
        Map<String,String> map3 = new LinkedHashMap<>();

        //Set
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();
        Set<String> set3 = new LinkedHashSet<>();
    }
}
