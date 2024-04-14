package Strings;

import java.util.Arrays;

class StringOperation {
    public static void main(String[] args) {
        //String class
        System.out.println("This is StringBuffer Class:\n");

        String college = "P. S. Hirapara Mahila College ";
        String campus = "SPKM ";

        System.out.println("College: " + college);
        System.out.println("College Length: " + college.length());
        System.out.println("Remove Spaces: " + college.trim());
        System.out.println("UpperCase: " + college.toUpperCase());
        System.out.println("LowerCase: " + college.toLowerCase());
        System.out.println("Substring: " + college.substring(0, 5));

        String joinedString = campus.concat(college);   // SPKM P. S. Hirapara Mahila College

        System.out.println("Concated String: " + joinedString);

        boolean flag = college.equals(campus);

        System.out.println("Strings first and second are equal: " + flag);
        System.out.println("College Starts With - P: " + college.startsWith("P"));
        System.out.println("Campus Ends With - M: " + campus.endsWith("M"));
        System.out.println("First Character: " + college.charAt(0));
        System.out.println("Index Of - '.': " + college.indexOf("."));
        System.out.println("Last Index Of - '.': " + college.lastIndexOf("."));

        String str1 = college;  // P. S. Hirapara Mahila College

        str1 = str1.replace("P.", "Prafulbhai");    // Prafulbhai S. Hirapara Mahila College
        str1 = str1.replace("S.", "Shambhubhai");   // Prafulbhai Shambhubhai Hirapara Mahila College

        System.out.println("String1: " + str1);
        System.out.println("Replace ' ' With '_': " + college.replaceAll(" ", "_"));

        String collegeCode = String.valueOf(14003);
        System.out.println("College Code: " + collegeCode);

        String[] result = college.split(" ");

        System.out.println("result = " + Arrays.toString(result));

        char[] chars = college.toCharArray();

        System.out.println("Characters: " + Arrays.toString(chars));


//        StringBuffer Class
        System.out.println("\n\n\nThis is StringBuffer Class:\n");
        StringBuffer fullName = new StringBuffer();
        System.out.println("StringBuffer Capacity: " + fullName.capacity());
        fullName.append(college);
        System.out.println("StringBuffer Capacity: " + fullName.capacity());
        fullName.insert(0, "Shree ");
        System.out.println("Fullname: " + fullName);
        fullName.delete(0, 5);
        System.out.println("Fullname: " + fullName);
        System.out.println("StringBuffer Capacity: " + fullName.capacity());
        System.out.println("Reversed StringBuffer: " + fullName.reverse());


//        StringBuilder class
        System.out.println("\n\n\nThis is StringBuffer Class:\n");
        StringBuilder fullNam = new StringBuilder();
        System.out.println("StringBuilder Capacity: " + fullNam.capacity());
        fullNam.append(college);
        System.out.println("StringBuilder Capacity: " + fullNam.capacity());
        fullNam.insert(0, "Shree ");
        System.out.println("Fullname: " + fullNam);
        fullNam.delete(0, 5);
        System.out.println("Fullname: " + fullNam);
        System.out.println("StringBuilder Capacity: " + fullNam.capacity());
        System.out.println("Reversed StringBuilder: " + fullNam.reverse());
    }
}