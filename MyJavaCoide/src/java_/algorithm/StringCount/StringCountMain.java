package java_.algorithm.StringCount;

import java.util.Scanner;

public class StringCountMain {
    static String [] strs;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入需要测试的字符串的个数：");
        int N = in.nextInt();
        strs = new String[N];
        for (int i=0;i<N;i++){
            System.out.print("请输入第"+i+"个字符串:");
            strs[i]=in.next();
        }
        /*for (String str:strs){
            stringCount(str);
        }*/

        for (int i=0;i<strs.length;i++){
            stringCount(strs[i]);
        }//为什么直接运行和调试的结果不一样？是由于多线程导致的吗？
    }

    static void stringCount(String str){
        String[] strings = str.split("");
        int count_max=0;
        String temp_string="";
        for (int i=0;i<strings.length;i++){
            int temp=1;
            for (int j=i+1;j<strings.length;j++) {
                if (strings[i].equals(strings[j])) {
                    temp++;
                }else break;
            }
            if (temp>count_max){
                count_max=temp;
                temp_string=strings[i];
            }

        }
        System.out.print(temp_string+"\t");
        System.err.println(count_max);
    }
}


