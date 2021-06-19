import java.util.Collection;

public class FruitHelper {
	public void eatAll(Collection<? extends Fruit> fruits) {}

	public void addApple(Collection<? super Apple> apples){}
}
