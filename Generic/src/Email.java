public class Email extends AbstractParam<String>{
	@Override
	protected void printValue() {
		System.out.println("My email is " + value);
	}
}
