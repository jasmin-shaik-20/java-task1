import java.util.*;

class StringClass {
    Scanner sc = new Scanner(System.in);



    switch(choice)

    {
        case -> 1:
        public void DuplicateString ()
        {
            ArrayList<Character> arrayList = new ArrayList<>();
            System.out.println("Enter string: ");
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
        }
        break;


        case 2:
            public String Recursion (String str)
        {
            if (str.isEmpty()) {
                return str;
            } else {
                return (Recursion(str.substring(1)) + str.charAt(0));
            }

        }
        break;


        case 3:
            public void Occurance ()
        {
            System.out.println("Enter string for occurance: ");
            String str = sc.nextLine();
            int count[] = new int[256];
            int len = str.length();
            char[] s = str.toCharArray();
            for (int i = 0; i < len; i++) {
                if (s[i] != ' ')
                    count[(int) str.charAt(i)]++;
            }
            for (int i = 0; i < 256; i++) {
                if (count[i] != 0) {
                    System.out.println((char) i + " --> " + count[i]);
                }
            }
        }
        break;

        case 4:
            public void length ()
        {
            System.out.println("Enter String1: ");
            String str1 = sc.nextLine();
            System.out.println("Enter String2: ");
            String str2 = sc.next();
            if (str1.length() == str2.length()) {
                System.out.println("Resultant string: " + (str1 + str2));
            } else {
                if (str1.length() > str2.length()) {
                    str1 = str1.substring(str1.length() - str2.length());
                    System.out.println(str1 + str2);
                } else {
                    str2 = str2.substring(str2.length() - str1.length());
                    System.out.println(str1 + str2);

                }
            }
        }
        break;

        case 5:
            public int lengthOfLongestSubstring (String str)
        {
            int n = str.length();
            Set<Character> set = new HashSet<>();
            int i = 0, j = 0, max = 0;
            while (i < n && j < n) {
                if (!set.contains(str.charAt(j)) && str.charAt(j) != ' ') {
                    set.add(str.charAt(j++));
                    max = Math.max(max, j - i);
                } else {
                    set.remove(str.charAt(i++));
                }
            }
            return max;
        }
        break;

        case 6:
            public void permutations (String str)
        {
            List<String> result = new ArrayList<>();
            Stack<String> stack = new Stack<>();
            stack.push("");
            while (!stack.isEmpty()) {
                String prefix = stack.pop();

                if (prefix.length() == str.length()) {
                    result.add(prefix);
                } else {
                    for (int i = 0; i < str.length(); i++) {

                        String ch = String.valueOf(str.charAt(i));
                        if (!prefix.contains(ch)) {
                            stack.push(prefix + ch);

                        }
                    }
                }
            }
            System.out.println(result);

        }
        break;
    }
}}




public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        StringClass stringClass=new StringClass();
        System.out.println("Enter number to perform operations: ");
        System.out.println("1.Duplicate String  2.String Recursion  3.Ocurrance  4.length of two string  5.length of longest substring  6.Permutations");
        int choice=sc.nextInt();
        stringClass.DuplicateString();
        System.out.println("Enter string recursion: ");
        System.out.println(stringClass.Recursion(sc.nextLine()));
        stringClass.Occurance();
        stringClass.length();
        System.out.println("Enter longestSubstring: ");
        System.out.println(stringClass.lengthOfLongestSubstring(sc.nextLine()));
        System.out.println("Enter string for permutation: ");
        stringClass.permutations(sc.nextLine());

  }
}