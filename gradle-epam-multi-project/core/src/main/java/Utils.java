import com.epam.module1.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        if (str == null || str.length == 0){
            return false;
        }
        for (String s : str) {
            if (!(StringUtils.isPositiveNumber(s))){
                return false;
            }
        }
        return true;
    }
}
