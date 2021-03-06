package tranning.clone;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ObjectVsCloneable implements Cloneable{

    private int firstField;
    private List<String> strings = new ArrayList<>();

    public ObjectVsCloneable() {
        System.out.println("in constructor");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append("firstField=").append(firstField);
        sb.append(", strings=").append(strings);
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectVsCloneable withoutCloneable = getExampleObject();

        System.out.println(withoutCloneable);
        ObjectVsCloneable cloned = (ObjectVsCloneable) withoutCloneable.clone();
        System.out.println(cloned);

        changeStrings(withoutCloneable, cloned);
    }

    private static void changeStrings(ObjectVsCloneable withoutCloneable, ObjectVsCloneable cloned) {
        cloned.getStrings().add("three");

        System.out.println("After we've added one more string to cloned");
        System.out.println(withoutCloneable);
        System.out.println(cloned);
    }

    private static ObjectVsCloneable getExampleObject() {
        ObjectVsCloneable withoutCloneable = new ObjectVsCloneable();
        withoutCloneable.setFirstField(32);
        withoutCloneable.getStrings().add("one");
        withoutCloneable.getStrings().add("two");
        return withoutCloneable;
    }
}
