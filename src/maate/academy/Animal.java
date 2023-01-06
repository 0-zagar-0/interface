package maate.academy;

public class Animal {
    public static String STATIC_FIELD = "abc";
    private String name = "abcd";

    {
        name = "xyz";
        STATIC_FIELD = "bddd";
        System.out.println("Aaimal non static block");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("Aaimal constructor");
    }

    static {
        STATIC_FIELD = "cbd";
        System.out.println("Aaimal static block");
    }

    @Override
    public String toString() {
        return name;
    }
}
