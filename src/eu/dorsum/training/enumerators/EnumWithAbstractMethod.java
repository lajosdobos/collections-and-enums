package eu.dorsum.training.enumerators;

public enum EnumWithAbstractMethod {
    FIRST {
        int j = 10;   // Field of FIRST
 
        void methodOfFirst() {
            System.out.println(j);  //Field j can be used within the constant body
        }
 
        @Override
        void abstractMethod() {
            methodOfFirst();     //methodOfFirst() can be used within the constant body
        }
    },
 
    SECOND {
        int k = 20;   //Field of SECOND
 
        void methodOfSecond() {
            System.out.println(k);  //Field k can be used within the constant body
        }
 
        @Override
        void abstractMethod() {
            methodOfSecond();     //methodOfSecond() can be used within the constant body
        }
    };
 
    int i;   //this field is available in all constants
 
    abstract void abstractMethod();  //this method is available in all constants
}
