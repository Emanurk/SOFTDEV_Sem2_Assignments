import javax.print.event.PrintJobListener;

public class App {
    public static void main(String[] args) throws Exception {
        boolean Property = false;
        System.out.println(Property);

        Property<String> myStringProperty = new Property<String>();
        myStringProperty.set("Hi");
        System.out.println(myStringProperty.get());
        myStringProperty.set("Hello");
        System.out.println(myStringProperty.get());

    }
}