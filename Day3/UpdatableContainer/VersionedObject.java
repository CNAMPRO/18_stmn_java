public class VersionedObject implements Updatable, Identified {

	private int version;
	private String  id;
	
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void update() {
		System.out.println("UPDATED");
	}
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void update(VersionedObject object) {
		// TODO Auto-generated method stub
		
	}
	
	
}

