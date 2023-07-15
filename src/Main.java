import java.util.Scanner;
class Subsequence{
    public void subsequence(String str)
    {
        int count = 0;
        int n = str.length();
        for(int i = 0; i < n; i++)
        {
            if (str.charAt(i) == 'A')
            {
                for (int j = i + 1; j < n; j++)
                {
                    if (str.charAt(j) == 'G')
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sr=scanner.nextLine();
        Subsequence ss=new Subsequence();
        ss.subsequence(sr);
        }
}
