package sec01.exam02;

public class Key{
	public int number;
	
	public Key(int number) {
		this.number = number;
	}

	/*	원래 Object의 equals() 메소드는
	    public boolean equals(Object obj) {
        return (this == obj);
    }	*/
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return number;
	}
	
}
