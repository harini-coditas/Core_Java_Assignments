package assignment12;

import java.util.StringTokenizer;
public class Q7FindDelimiters {
    public static void main(String[] args) {
        StringTokenizer string = new StringTokenizer("Hi ,all. How are you?","[,. ?]");
        while(string.hasMoreTokens()){
            System.out.println(string.nextToken());
        }

    }
}
/*
Hi
all
How
are
you
 */
