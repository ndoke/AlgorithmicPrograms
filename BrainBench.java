public class BrainBench<B>{
	B b;
	@SuppressWarnings("hiding")
	public <B> void print(B b) {
		System.out.println(b.getClass().getName());
	}
	
	@SuppressWarnings("rawtypes")
	public static void main (String args[]) {
		BrainBench<BrainBench> b = new BrainBench<>();
		b.print("Hello, World");
	}
}