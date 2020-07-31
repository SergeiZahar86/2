package _Java8._Глава_30_Регулярные_выражения._6;
// Use a reluctant quantifier.
import java.util.regex.*;
class RegExpr6 {
    public static void main (String args[]) {
        // Use reluctant matching behavoir.
        Pattern pat = Pattern.compile("e.+?d");
        Matcher mat = pat.matcher("extend cup end table");
        while (mat.find())
            System.out.println("Match: " + mat.group());
    }
}

