//What will the output be? 
//Why is the output that?

public class Strings {

    public static void main(String[] args) {
        TestObj testObj1 = new TestObj();
        TestObj testObj2 = new TestObj();

        testObj1.setName("String");
        testObj2.setName("String");

        System.out.println(testObj1.getName().equals(testObj2.getName()));
        System.out.println(testObj1.getName() == testObj2.getName());
    }

    public static class TestObj{
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
