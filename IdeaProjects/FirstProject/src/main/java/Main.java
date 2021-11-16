import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args){

        String s = "Привіт усім, хто живе на місяці";
       String truncate = StringUtils.truncate(s, 10);
        System.out.println(truncate);
    }
}
