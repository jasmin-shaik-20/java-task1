import java.util.*;

class StringPermutations {
    public void permutations (String str6)
    {
        List<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push("");
        while (!stack.isEmpty()) {
            String prefix = stack.pop();

            if (prefix.length() == str6.length()) {
                result.add(prefix);
            } else {
                for (int i = 0; i < str6.length(); i++) {

                    String ch = String.valueOf(str6.charAt(i));
                    if (!prefix.contains(ch)) {
                        stack.push(prefix + ch);

                    }
                }
            }
        }
        System.out.println(result);

    }

}

class Substring {
    public int lengthOfLongestSubstring (String str5)
    {
        int n = str5.length();
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, max = 0;
        while (i < n && j < n) {
            if (!set.contains(str5.charAt(j)) && str5.charAt(j) != ' ') {
                set.add(str5.charAt(j++));
                max = Math.max(max, j - i);
            } else {
                set.remove(str5.charAt(i++));
            }
        }
        return max;
    }

}

class Recursion {

    public String StringRecursion(String str1)
    {
        if (str1.isEmpty()) {
            return str1;
        } else {
            return (StringRecursion(str1.substring(1)) + str1.charAt(0));
        }
    }

}



public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean bool=true;

        while(bool)
        {
            System.out.println("Enter number to perform operations: ");
            System.out.println("1.Duplicate String  2.String Recursion  3.Ocurrance  4.length of two string  5.length of longest substring  6.Permutations");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    ArrayList<Character> arrayList = new ArrayList<>();
                    System.out.println("Enter string: ");
                    sc.nextLine();
                    String str = sc.nextLine();
                    char[] s = str.toCharArray();
                    int len = str.length();
                    for (int i = 0; i < len; i++) {
                        for (int j = i + 1; j < len; j++) {
                            if (s[i] == s[j] && (!arrayList.contains(s[i])) && s[i] != ' ') {
                                arrayList.add(s[i]);
                            }
                        }
                    }
                    System.out.println("Duplicate character: " + arrayList);
                    break;

                case 2:
                    System.out.println("Enter string recursion: ");
                    sc.nextLine();
                    String str1=sc.nextLine();
                    Recursion recursion=new Recursion();
                    System.out.println(recursion.StringRecursion(str1));
                    break;

                case 3:
                    System.out.println("Enter string for occurance: ");
                    sc.nextLine();
                    String str2 = sc.nextLine();
                    int count[] = new int[256];
                    int length = str2.length();
                    char[] s1 = str2.toCharArray();
                    for (int i = 0; i < length; i++) {
                        if (s1[i] != ' ')
                            count[(int) str2.charAt(i)]++;
                    }
                    for (int i = 0; i < 256; i++) {
                        if (count[i] != 0) {
                            System.out.println((char) i + " --> " + count[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Enter String1: ");
                    sc.nextLine();
                    String str3 = sc.nextLine();
                    System.out.println("Enter String2: ");
                    String str4 = sc.next();
                    if (str3.length() == str4.length()) {
                        System.out.println("Resultant string: " + (str3 + str4));
                    } else {
                        if (str3.length() > str4.length()) {
                            str3 = str3.substring(str3.length() - str4.length());
                            System.out.println(str3 + str4);
                        } else {
                            str4 = str4.substring(str4.length() - str3.length());
                            System.out.println(str3 + str4);

                        }
                    }
                    break;


                case 5:
                    System.out.println("Enter longestSubstring: ");
                    sc.nextLine();
                    String str5=sc.nextLine();
                    Substring substring=new Substring();
                    System.out.println(substring.lengthOfLongestSubstring(str5));
                    break;


                case 6:
                    System.out.println("Enter string for permutation: ");
                    sc.nextLine();
                    String str6=sc.nextLine();
                    StringPermutations stringPermutations=new StringPermutations();
                    stringPermutations.permutations(str6);
                    break;






            }
            System.out.println("Enter true if you want to continue: ");
            bool=sc.nextBoolean();
        }

    }
}