public class dados {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        System.out.println(b1);
        System.out.println(b2);

        short s1 = 20000;
        //hort s2 = 40000; // ultrapassa a capacidade de armazenamento

        System.out.println(s1);

       // int i1= -100000000000;
        int i2 = 26500;
        System.out.println(i2);

        long l1 = 1000000000000000000L; // "l" é para identificar quem é long do inteiro
        long l2 = 2004005000500055000L;
        System.out.println(l1);
        System.out.println(l2);

        //float f1 = 4.5;
        float f2 = 10.68f;
        System.out.println(f2);

        double d1 = 85.69;
        double d2 = 99.84d;
        System.out.println(d1);
        System.out.println(d2);

        char c1 = 'w';
        //char c2 = 'tw';
        char c3 = '\u0057';
        System.out.println(c1);
        System.out.println(c3);

        String st1 = "Fulano";
        String  st2 = "Siclano";
        //String  st3 = "ag dgb se  se et t knbjjbb &*" "&%& 75894389";
        System.out.println(st1);
        System.out.println(st2);
        //System.out.println(st3 );

        String dt1 = "18/05/2022";
        System.out.println(dt1);

        boolean bo1 = true;
        boolean bo2 = false;
        System.out.println(bo1);
        System.out.println(bo2);


    }
}
