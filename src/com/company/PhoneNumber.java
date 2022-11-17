package com.company;

public class PhoneNumber {
    private StringBuilder code;
    private StringBuilder number;
    public PhoneNumber(String str) {
        StringBuilder stringBuilder = new StringBuilder().append(str);
        int start = str.length() - 10;
        code = new StringBuilder();
        if (stringBuilder.charAt(0) == '8'){
            code.append('7');
        } else {
            code.append(stringBuilder.substring(1, start));
        }
        number = new StringBuilder().append(stringBuilder.substring(start));
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder().append('+').append(code);
        res.append(number.substring(0, 3)).append('-');
        res.append(number.substring(3, 6)).append('-');
        res.append(number.substring(6));
        return res.toString();
    }

    public static void test(){
        String [] s = new String[3];
        PhoneNumber []nums = new PhoneNumber[3];
        s[0] = "+79175655655";
        s[1] = "+104289652211";
        s[2] ="89175655655";
        for (int i = 0; i < 3; i++){
            nums[i] = new PhoneNumber(s[i]);
            System.out.println(s[i] + ": " + nums[i]);
        }
    }
}
