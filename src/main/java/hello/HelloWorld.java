package hello;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
	for (int i=0; i>=0; i++) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			i++;
		}
	}
    }
}
