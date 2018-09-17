import java.util.ArrayList;

public class Shape implements ShapeInterface{

	private String name;
	ArrayList<ShapeInterface> myShapes;
	
	
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}


	/**
	 * 
	 * @param name
	 */
	public Shape(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public double getArea() {
		double areas = 0;
		for(ShapeInterface shape : myShapes) {
			areas += shape.getArea();
		}
		return areas;
			
		
		
	}


}
