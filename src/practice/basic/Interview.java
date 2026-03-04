package practice.basic;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview {
        public static void main(String[] args) {
            String s = "AaaaA Nnn Kkkkk Ii TTTtt";
            charcterCount(s);
        }

        static void charcterCount(String str){

            Map<Character, Long> map = str.chars()
                    .mapToObj(c ->(char)c)
                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
            System.out.println(map);
        }
}
