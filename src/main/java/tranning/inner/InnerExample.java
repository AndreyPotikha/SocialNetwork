package tranning.inner;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;

public class InnerExample {

    private class NestedClass{ }
    private static class NestedStaticClass{ }
    public static enum NestedEnum{ ONE }

    public void method() {
        class InnerClass { }
        Comparator<String> lenghtComparotor = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };
    }

    public static void main(String[] args) {
        InnerExample.NestedStaticClass aClass = new InnerExample.NestedStaticClass();
        Map.Entry<String, String> entry = new AbstractMap.SimpleEntry<>("","");
    }
}


class SecondClass{

        }
