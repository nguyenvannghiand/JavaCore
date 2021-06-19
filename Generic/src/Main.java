import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Param<Integer> paramInteger = new Param<>();
		paramInteger.setValue(10); // luc nay ham setValue chi chap nhan gia tri co kieu Integer
		System.out.println(paramInteger.value);

		Param<String> paramString = new Param<>();
		paramString.setValue("HelloWorld!"); // luc nay ham setValue chi chap nhan gia tri co kieu String
		System.out.println(paramString.value);

		Email email = new Email();
		email.value = "helloworld@gmail.com";
		email.printValue();
		//
		Height<Float> heightFloat = new Height<>(); // kieu du lieu se duoc xu ly laf Float
		heightFloat.value = 10f;
		heightFloat.printValue();
		Height<Long> heightLong = new Height<>(); // kieu du lieu se duoc xu ly la Long
		heightLong.value = 1000L;
		heightLong.printValue();

		//
		MultiGenericParam<String, String> aParam = new MultiGenericParam<>("value1", "value2");
		MultiGenericParam<Integer, Double> dayOfWeekDegrees = new MultiGenericParam<>(1, 9.8);
		//
		FruitHelper fruitHelper = new FruitHelper();
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Apple());
		// Hop le, do Apple ke thua Fruit nen Apple chinh la 1 Fruit
		// ArrayList fruits chap nhan xy ly cac doi tuong Fruit nen Apple cung duoc chap nhan
		Collection<Banana> bananas = new ArrayList<>();
		bananas.add(new Banana());

	}
}
