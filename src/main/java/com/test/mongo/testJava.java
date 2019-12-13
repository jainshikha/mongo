package com.test.mongo;

public class testJava {
   /* public static void main(String argu[]) {

      *//*  String str = "w3schools";
        int cnt = 0;
        char[] inp = str.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
               // System.out.println(inp[i] +"i and j are "+ inp[j]);
                if (inp[i] == inp[j]) {
                    System.out.println(inp[j]);
                    cnt++;
                    break;
                }
            }
        }

        List<Integer> numbers = Arrays.asList(new Integer[]{1,2,1,3,4,4});
        numbers.stream().filter(i -> Collections.frequency(numbers, i) >1)
                .collect(Collectors.toSet()).forEach(System.out::println);
        IntStream stream = "12345_abcdefg".chars();
        stream.forEach(p -> System.out.println("tfhvgh"+p));

        //OR

        Stream<String> stream1 = Stream.of("A$B$C".split("\\$"));
        stream1.forEach(p -> System.out.println(p));*//*
int re =  shortestPalindrome("babab");
    }
    public static String shortestPalindrome(String s) {
        int i=0;
        int j=s.length()-1;

        while(j>=0){
            if(s.charAt(i)==s.charAt(j)){
                i++;
            }
            j--;
        }

        if(i==s.length())
            return s;

        String suffix = s.substring(i);
        String prefix = new StringBuilder(suffix).reverse().toString();
        String mid = shortestPalindrome(s.substring(0, i));
        return prefix+mid+suffix;
    }*/
   /*static int hole[] = { 1, 0, 0, 0, 1, 0, 1, 0, 2, 1 };
    static int countHoles(int num) {
        int holes = 0;
        while (num > 0) {
            int d = num % 10;
            holes += hole[d];
            num /= 10;
        }
        return holes;
    }
    public static void main (String[] args)
    {
        int num = 630;
        System.out.println(countHoles(num));
    }*/
  /* public static String merge(String s1, String s2)
   {
       // To store the final string
       StringBuilder result = new StringBuilder();

       // For every index in the strings
       for (int i = 0; i < s1.length() || i < s2.length(); i++) {

           // First choose the ith character of the
           // first string if it exists
           if (i < s1.length())
               result.append(s1.charAt(i));

           // Then choose the ith character of the
           // second string if it exists
           if (i < s2.length())
               result.append(s2.charAt(i));
       }

       return result.toString();
   }

    // Driver code
    public static void main(String[] args)
    {
        String s1 = "geeks";
        String s2 = "forgeeks";
        System.out.println(merge(s1, s2));
    }*/
   //findMinInsertions(str.toCharArray(),0, str.length()-1)
   static int shortestPalindrome(String str){
       return findMinInsertions(str.toCharArray(),0, str.length()-1);
   }
   static int findMinInsertions(char str[], int l, int h)
   {
       // Base Cases
       if (l > h) return Integer.MAX_VALUE;
       if (l == h) return 0;
       if (l == h - 1) return (str[l] == str[h])? 0 : 1;

       // Check if the first and last characters
       // are same. On the basis of the  comparison
       // result, decide which subrpoblem(s) to call
       return (str[l] == str[h])?
               findMinInsertions(str, l + 1, h - 1):
               (Integer.min(findMinInsertions(str, l, h - 1),
                       findMinInsertions(str, l + 1, h)) + 1);
   }
    // Driver program to test above functions
    public static void main(String args[])
    {
        String str= "abab";
        int re = shortestPalindrome(str);
        System.out.println(re);
    }
}

