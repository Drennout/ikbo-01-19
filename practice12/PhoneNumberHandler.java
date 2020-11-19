package practice12;

public class PhoneNumberHandler {

    public static String handler(String number){
        if(number.charAt(0) == '8')
            number = rusNumber(number);

        number = normalization(number);
        return number;
    }
    private static String rusNumber( String number){
        StringBuffer num = new StringBuffer(number);
        num.deleteCharAt(0);
        number = "+7" + num;
        return number;
    }

    private static String normalization(String number){
        number.replaceAll("\\s+","");
        StringBuffer tmp = new StringBuffer("");
        int indx = 0;

        for(int i =  number.length() - 1; i >= 0; i--){
            if(i == number.length() - 5 || i == number.length() - 8 || i == number.length() - 11 )
                tmp.insert(indx++, '-');

            tmp.insert(indx++, number.charAt(i));
        }

        StringBuffer normal = new StringBuffer("");
        indx = 0;

        for (int i = tmp.length() - 1; i >= 0; i--){
            normal.setLength(normal.length() + 1);
            normal.insert(indx++, tmp.charAt(i));
        }

        return normal.toString();
    }

}
