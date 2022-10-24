package org.kook.design.patterns.bridge.example2;

public class Main {
    public static void main(String[] args) {

        System.out.println("***** short view artist *****");
        View v1 = new ShortFormView(new ArtistResource());
        System.out.println(v1.show());

        System.out.println("***** short view book *****");
        View v2 = new ShortFormView(new BookResource());
        System.out.println(v2.show());

        System.out.println("***** long view artist *****");
        View v3 = new LongFormView(new ArtistResource());
        System.out.println(v3.show());

        System.out.println("***** long view book *****");
        View v4 = new LongFormView(new BookResource());
        System.out.println(v4.show());

    }
}
