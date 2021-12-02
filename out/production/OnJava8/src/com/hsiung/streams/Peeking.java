package com.hsiung.streams;// streams/Peeking.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

class Peeking {
    public static void main(String[] args) throws Exception {
        String fname = "E:\\Workspace\\JavaProjects\\IdeaProjects\\StudyProjects\\OnJava8\\src\\com\\hsiung\\streams\\Cheese.dat";
        FileToWords.stream(fname)
                .skip(21)
                .limit(4)
                .map(w -> w + " ")
                .peek(System.out::print)
                .map(String::toUpperCase)
                .peek(System.out::print)
                .map(String::toLowerCase)
                .forEach(System.out::print);
    }
}
/* Output:
Well WELL well it IT it s S s so SO so
*/
