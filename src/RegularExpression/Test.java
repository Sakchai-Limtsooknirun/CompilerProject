package RegularExpression;

public class Test {
    public static void main(String[] args) {
        REChecker check =new REChecker();

        System.out.println(check.CheckLine("102,Object Oriented Programming: with Java(3),math|advance",
                                            "([0-9]{3}),(.+)\\(([0-9])\\),([a-z]+(\\|[a-z]+)*)?"));
        System.out.println(check.CheckLine("2016-02-11","(\\d{4})-(\\d{2})-(\\d{2})"));

        System.out.println((check.fineMatchInSentence("2016-02-11-12","(\\d{2})")));

        System.out.println(check.getGroupCount());

        System.out.println(check.SpitStringingFromRE("This is my small 5555 example string which I'm going to use for 5555  pattern matching.","(\\d{4})"));


    }
}
