package com.company;

public class Shirt {
    private StringBuilder code;
    private StringBuilder name;
    private StringBuilder color;
    private StringBuilder size;

    public Shirt(String str) {
        String[] arr = str.split(",");
        if (arr.length < 4){
            this.code = new StringBuilder().append("error");
            this.name = new StringBuilder().append("error");
            this.color = new StringBuilder().append("error");
            this.size = new StringBuilder().append("error");
        } else{
            this.code = new StringBuilder().append(arr[0]);
            this.name = new StringBuilder().append(arr[1]);
            this.color = new StringBuilder().append(arr[2]);
            this.size = new StringBuilder().append(arr[3]);
        }
    }

    @Override
    public String toString() {
        return "code=" + code.toString() +
                ",name=" + name.toString() +
                ",color=" + color.toString() +
                ",size=" + size.toString();
    }
    public static void test(){
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] shirts1 = new Shirt[11];
        for (int i = 0; i < 11; i++){
            shirts1[i] = new Shirt(shirts[i]);
        }
        for (Shirt s: shirts1
             ) {
            System.out.println(s);
        }
    }
}
