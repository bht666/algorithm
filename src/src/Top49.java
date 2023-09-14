import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @projectName: algorithm
 * @package: PACKAGE_NAME
 * @className: Top49
 * @author: 施博杰
 * @description: TODO
 * @date: 2023/9/14 10:30
 * @version: 1.0
 */
public class Top49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for(String str:strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String tstr=new String(arr);
            List<String> list = map.getOrDefault(tstr , new ArrayList<String>());
            list.add(str);
            map.put(tstr ,list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
