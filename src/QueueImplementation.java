import java.util.ArrayList;


public class QueueImplementation<T> implements Queue<T> 
{
	ArrayList<T> items = new ArrayList<T>();
	
	@Override
	public boolean isEmpty() {
		if (items.isEmpty())	{
			return true;
		}
		else	 {
			return false;
		}
	}

	@Override
	public void add(T item) {
		items.add(item);
		
	}

	@Override
	public T remove() {
		T bottom;
		if (isEmpty() == true) {
			return null;
		}
		else {
			bottom = items.get(0);
			items.remove(bottom);
			return bottom;
		}
	}

}
