package AccessModifiers.Package2;

import AccessModifiers.Package1.*;

public class ASub extends A {
    public static void main(String[] args) {
        ASub asub = new ASub();
        System.out.println(asub.protectedMessage);

    }

}
