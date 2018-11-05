
public class MyObject extends AUpdatableObject {

	public int id;
	public int version;
	
	public MyObject(int id, int version) {
		this.id = id;
		this.version = version;
	}

	public int getUid() {
		// TODO Auto-generated method stub
		return id;
	}

	public void update(AUpdatableObject update) {
		version = ((MyObject) update).version;

	}
	
	public String toString() {
		return String.valueOf(id) + " " + String.valueOf(version);
	}

}
