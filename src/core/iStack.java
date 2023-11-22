package core;

public interface iStack {
	
	boolean isEmpty();
	int getSize();

	void push(Object a);
	Object Top();
	
	Object pop();
}
