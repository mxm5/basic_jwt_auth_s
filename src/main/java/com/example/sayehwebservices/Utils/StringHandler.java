package com.example.sayehwebservices.Utils;

public class StringHandler {


    public static void main(String[] args) {
        String s1 = "m.shohrati@rightel.ir";
//        -> to hex number
        String string = "6d 2e 73 68 6f 68 72 61 74 69 40 72 69 67 68 74 65 6c 2e 69 72";
        String replace = string.replace(" ", "");
        System.out.println(replace);
        String s = "6d2e73686f6872617"+"4694072696768746"+"56c2e697220746f206"+"86578206e756626572";
        // pass  // user
        String s2 = "6d2e73686f68726174694"+"07269676874656c2e6972";
        System.out.println(s2.length());
        String substring = s2.substring(0, 21);
        System.out.println(substring);
        System.out.println(substring.length());
////
//        0010074198
//
//        0010101780
//
//        0010101551
//
//        0010099913
    }
}
