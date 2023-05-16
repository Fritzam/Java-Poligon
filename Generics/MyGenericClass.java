package Generics;

class MyGenericClass <T extends Number, V extends Number>{

    T myValue;
    V myValue2;
    MyGenericClass(T myValue, V myValue2) {
        this.myValue = myValue;
        this.myValue2 = myValue2;
    }

    public V getValue() {
        return myValue2;
    }
}
