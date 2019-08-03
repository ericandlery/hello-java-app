package java11.lambda;

public interface LambdaAnimal {
	
	void run();
	
	void eat();
	
	void play(String game);
	
	default void test() {
		System.out.println("I'm an animal!");
	}

}
