package core;

public class Stack implements iStack {

	 private int size = 5;
	 private Object stack[] = new Object[size];
	 private int tmp=0;
	
	 public Stack() {
		
	 }
	 
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(stack==null) {
			return true;
		}else 
			return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void push(Object a) {
		// TODO Auto-generated method stub
		stack[tmp] = a;
		tmp++;
	}

	@Override
	public Object Top() {
		// TODO Auto-generated method stub
		Object t = stack[tmp-1];
		return t;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		tmp--;
		Object p = stack[tmp];
		return p;
	}
	
}