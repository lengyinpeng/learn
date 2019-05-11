package com.example.java8Demo;


import java.util.*;
import java.util.function.Predicate;

public class Java8Tester {
    public static void main(String args[]){
        Java8Tester java8Tester = new Java8Tester();

        try {
            Java8Tester java8Tester1 = (Java8Tester) Class.forName(Java8Tester.class.getName()).newInstance();

        /**
            MathOperation add  = (int a , int b) -> a + b;

            MathOperation sub = (a,b) -> a-b;

            MathOperation mul = (int a , int b) -> { return a *b;};

            MathOperation div = ( a , b) -> a/b;

            System.out.println(java8Tester.operate(4,2 , add));
            System.out.println(java8Tester1.operate(4,2 , add));
            System.out.println();
            System.out.println(java8Tester.operate(4,2 , sub));
            System.out.println(java8Tester1.operate(4,2 , sub));
            System.out.println();
            System.out.println(java8Tester.operate(4,2 , mul));
            System.out.println(java8Tester1.operate(4,2 , mul));
            System.out.println();
            System.out.println(java8Tester.operate(4,2 , div));
            System.out.println(java8Tester1.operate(4,2 , div));


            GreetingService greetingService = (message) ->{
                System.out.println("   oo   "+message);
            };

            GreetingService greetingService1 = message ->{
                System.out.println("   0oo0   "+message);
            };
            greetingService.sayMessage("第一次");
            greetingService1.sayMessage("第二次");

            String firsts = "";
            Comparator<String> comparator = (first , secound) ->{

                        return  Integer.compare(first.length(),secound.length());

            };
            System.out.println(comparator.compare("11111","11111"));

            List names = new ArrayList();

            names.add("Google");
            names.add("Runoob");
            names.add("Taobao");
            names.add("Baidu");
            names.add("Sina");

            names.forEach(System.out::println);

        String cc = "akkakak  ";
        GreetingService greetingService = (message,s) -> System.out.println(cc + message+s);
        greetingService.say("你说啥","111");
        greetingService.says("你说啥");

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        eval(list,n-> n < 5);
        System.out.println("------      ----------          ---------");
        eval(list,n-> n%2==0);
        System.out.println("------      ----------          ---------");
        list.stream().filter(n-> n >3).forEach(System.out::println);

        List<String> list = Arrays.asList("1","2","3","","","4.2","","5","6");
        list = list.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
        list.forEach(System.out::println);

            Random random = new Random();
            Random random1 = (Random) Class.forName(Random.class.getName()).newInstance();
            random1.ints().limit(10).forEach(System.out::println);

            List<Integer> nums = Arrays.asList(6,1,2,4,5,3);
            nums = nums.parallelStream().sorted().collect(Collectors.toList());
          //  nums = nums.stream().map( i -> i *i).distinct().collect(Collectors.toList());
            nums.forEach(System.out::println);
            //int count = (int) nums.stream().filter(i -> i >=2).count();
            //System.out.println(count);

            List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
            List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

            System.out.println("筛选列表: " + filtered);
            String str = strings.stream().filter( i -> !i.isEmpty()).collect(Collectors.joining(",,,,"));
            System.out.println(str);

            List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
            IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt(i-> i).summaryStatistics();
            System.out.println(intSummaryStatistics);
            System.out.println("最大  "+ intSummaryStatistics.getMax());
            System.out.println("最小  "+ intSummaryStatistics.getMin());
            System.out.println("总数量  "+ intSummaryStatistics.getCount());
            System.out.println("总值  "+ intSummaryStatistics.getSum());

            List<Integer> list = Arrays.asList(1,2,4,3,5,6,7,8);
            int h = list.stream().filter(i -> i >6)
                    .sorted()
                    .mapToInt( i -> i - 5)
                    .sum();
            System.out.println(h);

            Integer v1 = null;
            Integer v2 = new Integer(51);
            Optional<Integer> a = Optional.ofNullable(v1);
            Optional<Integer> b = Optional.ofNullable(v2);
            System.out.println(java8Tester.sum(a,b));

            LocalDateTime localDateTime = LocalDateTime.now();
            System.out.println(localDateTime.getMonth());
            LocalDateTime date2 = localDateTime.withDayOfMonth(10).withYear(2012);
            System.out.println("date2: " + date2);
            // 12 december 2014
            LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
            System.out.println("date3: " + date3);

            // 22 小时 15 分钟
            LocalTime date4 = LocalTime.of(22, 15);
            System.out.println("date4: " + date4);

            // 解析字符串
            LocalTime date5 = LocalTime.parse("20:15:30");
            System.out.println("date5: " + date5);
         */
            // 使用基本编码
            String base64encodedString = Base64.getEncoder().encodeToString("runoob?java8".getBytes("utf-8"));
            System.out.println("Base64 编码字符串 (基本) :" + base64encodedString);
            // 解码
            byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);

            System.out.println("原始字符串: " + new String(base64decodedBytes, "utf-8"));

            base64encodedString = Base64.getUrlEncoder().encodeToString("TutorialsPoint?java8".getBytes("utf-8"));
            System.out.println("Base64 编码字符串 (URL) :" + base64encodedString);

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < 10; ++i) {
                stringBuilder.append(UUID.randomUUID().toString());
            }

            byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
            String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
            System.out.println("Base64 编码字符串 (MIME) :" + mimeEncodedString);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
     */
    public static void eval(List<Integer> list , Predicate<Integer> predicate){
        for(Integer n : list){
            if(predicate.test(n)){
                System.out.println(n);
            }
        }
    }
    public Integer sum(Optional<Integer> a, Optional<Integer> b){

        // Optional.isPresent - 判断值是否存在

        System.out.println("第一个参数值存在: " + a.isPresent());
        System.out.println("第二个参数值存在: " + b.isPresent());

        // Optional.orElse - 如果值存在，返回它，否则返回默认值
        Integer value1 = a.orElse(new Integer(0));

        //Optional.get - 获取值，值需要存在
        Integer value2 = b.get();
        return value1 + value2;
    }

}