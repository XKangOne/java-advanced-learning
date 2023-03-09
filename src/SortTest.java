import java.util.*;

/***
 * @description:
 * @author: yk
 * @date:
 * @param:
 * @return:
 **/
public class SortTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("orange");
        list.add("tomato");
        list.add("apple");
        list.add("litchi");
        list.add("Banana");
        Iterator<String> str = list.iterator();
        System.out.println("排序前：");
        while (str.hasNext()){
            String next = str.next();
            System.out.print(next+" ");
        }
        System.out.println();
        System.out.println("区分大小写排序后:");
        Collections.sort(list);
        for (String str1:list){
            System.out.print(str1+" ");
        }
        System.out.println();
        System.out.println("不区分大小写:");
        //不区分大小写
        Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String str2:list){
            System.out.print(str2+" ");
        }
    }

}
