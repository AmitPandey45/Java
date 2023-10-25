package src.com.accessmodifierdemo;

import src.com.defaultexample.OtherPkgDefaultAccessModifier;
import src.com.protectedexample.OtherPkgProtectedAccessModifier;

class SamePkgExtndProtectedAccessModifier extends SamePkgProtectedAccessModifier {

}

class OtherPkgExtndProtectedAccessModifier extends OtherPkgProtectedAccessModifier {
    protected void call()
    {
        System.out.println("==== Different package subclass => can call protected ====");
        System.out.println("Extended OtherPkgExtndProtectedAccessModifier marks: "+this.marks);
        this.display();
    }
}

class OtherPkgExtndDefaultAccessModifier extends OtherPkgDefaultAccessModifier {
    void call()
    {
        System.out.println("==== Different package subclass => cann't call default ====");
        // System.out.println("Extended OtherPkgExtndProtectedAccessModifier marks: "+this.marks);
        // this.display();
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        // 1. public
        var samePkgPub = new SamePkgPublicAccessModifier();
        System.out.println("==== same package public =====");
        System.out.println("SamePkgPublicAccessModifier marks: "+samePkgPub.marks);
        samePkgPub.display();

        // 2. default
        System.out.println("==== same package default =====");
        var samePkgDefault = new SamePkgDefaultAccessModifier();
        System.out.println("SamePkgDefaultAccessModifier marks: "+samePkgDefault.marks);
        samePkgDefault.display();

        // 3. protected
        System.out.println("==== same package protected =====");
        var samePkgProt = new SamePkgProtectedAccessModifier();
        System.out.println("SamePkgProtectedAccessModifier marks: "+samePkgProt.marks);
        samePkgProt.display();
        System.out.println("==== same package extnd protected =====");
        var samePkgExtndProt = new SamePkgExtndProtectedAccessModifier();
        System.out.println("Extended SamePkgExtndProtectedAccessModifier marks: "+samePkgExtndProt.marks);
        samePkgExtndProt.display();

        // 4. private (cann't access)
        System.out.println("==== same package private (cann't access) =====");
        // var samePkgPrvt = new SamePkgPrivateAccessModifier();
        // System.out.println("Extended SamePkgPrivateAccessModifier marks: "+samePkgPrvt.marks);
        // samePkgPrvt.display();

        // other packages
        System.out.println("==== Other package demo ====");
        System.out.println("==== Different package subclass ====");
        System.out.println("==== Different package subclass => can call protected ====");
        var otherPkgExtndProt = new OtherPkgExtndProtectedAccessModifier();
        System.out.println("Extended OtherPkgExtndProtectedAccessModifier => ");
        otherPkgExtndProt.call();


        System.out.println("==== Different package non-subclass ====");
        System.out.println("==== Different package non-subclass => cann't call protected ====");
        // var otherPkgProt = new OtherPkgProtectedAccessModifier();
        // otherPkgProt.marks;
        // otherPkgProt.display();

        System.out.println("==== Different package non-subclass => cann't call default ====");
        // var otherPkgDefault = new OtherPkgDefaultAccessModifier();
        // otherPkgDefault.marks;
        // otherPkgDefault.display();
    }
}

// SamePkgDefaultAccessModifier.java
// SamePkgPrivateAccessModifier.java
// SamePkgProtectedAccessModifier.java
// SamePkgPublicAccessModifier.java

// OtherPkgDefaultAccessModifier.java
// OtherPkgPrivateAccessModifier.java
// OtherPkgProtectedAccessModifier.java
// OtherPkgPublicAccessModifier.java


//                                  Private     Protected       Public      Default

// Same Class                          Yes         Yes            Yes         Yes

// Same package subclass               No          Yes            Yes         Yes

// Same package non-subclass           No          Yes            Yes         Yes

// Different package subclass          No          Yes            Yes         No

// Different package non-subclass      No          No             Yes         No