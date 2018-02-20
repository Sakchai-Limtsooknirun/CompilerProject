package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REChecker {
    private int count = 0 ;

    public String CheckLine(String sentence, String RE) {
        Pattern r = Pattern.compile(RE);
        Matcher m = r.matcher(sentence);
        count+=m.groupCount();
        //if (m.groupCount() == 1) {
        if (m.find() && sentence == m.group(0)) {
            return ("This Regular Expression:  " + RE + "\n  is Match : Sentence String : " + sentence);
        } else {

            return ("This Regular Expression:  " + RE + "\n  is  Not Match : Sentence String : " + sentence);
        }


    }

    public String fineMatchInSentence(String sentence, String RE) {
        Pattern r = Pattern.compile(RE);
        Matcher m = r.matcher(sentence);
        //if (m.groupCount() == 1) {

        if (m.find()) {
            count+=m.groupCount();
            return ("This Regular Expression:  " + RE + "\n  is Match :Word in Sentence String : " + m.group(0));
        } else {

            return ("This Regular Expression:  " + RE + "\n  is  Not Match : All Sentence String :");
        }

    }
    public int getGroupCount(){
        return count;
    }

    public String SpitStringingFromRE(String sentence, String RE) {
        String BeforeSplit = "";
        String[] splitString = (sentence.split(RE));
        for (String string : splitString) {
            BeforeSplit += string;
        }
        return BeforeSplit;
        
    }

}
