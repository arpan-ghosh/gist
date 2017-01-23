import java.util.Arrays;

public class ArrayList {
	
	private Object[] arrayList;
	private int size = 0;

	public ArrayList() {
		arrayList = new Object[10];
	}
	
	public Object get(int index) throws Exception {
		if (index < size) {
			return arrayList[index];
		} else {
			throw new Exception();
		}
	}
	
	public void add(Object obj) {
		if (arrayList.length - size <= 5) {
			increaseListSize();
		}
		arrayList[size++] = obj;
	}
	
	public Object remove(int index){
        if(index < size){
            Object obj = arrayList[index];
            arrayList[index] = null;
            int tmp = index;
            while(tmp < size){
            	arrayList[tmp] = arrayList[tmp+1];
            	arrayList[tmp+1] = null;
                tmp++;
            }
            size--;
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
         
    }
	
	public int totalSize() {
		return size;
	}
	
	public void increaseListSize() {
		arrayList = Arrays.copyOf(arrayList, arrayList.length*2);
		System.out.println("\nNew length: " + arrayList.length);
	}

		
	}

}
