package edu.ycp.ece220.rgb;

/**
 * Class whose instances represent points in the x/y plane.
 * Note that Point objects are immutable: once created,
 * their x and y values may not be changed.
 * 
 * @author David Hovemeyer
 */
public class Point {
	// TODO: add fields
	//Point myPoint = new Point();
	//Point myPoint;
	public double x, y;
	/**
	 * Constructor.
	 * 
	 * @param x  the Point's x coordinate value
	 * @param y  the Point's y coordinate value
	 */
	public Point(double x, double y) {
		//throw new UnsupportedOperationException("TODO - implement");
//		x = myPoint.x;
//		y = myPoint.y;
//		myPoint = new Point(x, y);
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Return the point's x coordinate value.
	 * 
	 * @return the point's x coordinate value
	 */
	public double getX() {
		//throw new UnsupportedOperationException("TODO - implement");
		double xval = this.x;
		return xval;
	}
	
	/**
	 * Return the point's y coordinate value
	 * 
	 * @return the point's y coordinate value
	 */
	public double getY() {
		//throw new UnsupportedOperationException("TODO - implement");
		double yval = this.y;
		return yval;
	}

	/**
	 * Return the geometric distance between this point and
	 * the point given as the parameter.
	 * 
	 * @param other another Point object
	 * @return the geometric distance between this point and the other point
	 */
	public double distanceTo(Point other) {
		//throw new UnsupportedOperationException("TODO - implement");
		double distance = Math.sqrt((other.getX() - this.x) * (other.getX() - this.x) + (other.getY() - this.y) * (other.getY() - this.y));
		return distance;
	}

	public Point complexAdd(Point other) {
		double a = this.x;
		double b = this.y;
		double c = other.x;
		double d = other.y;
		
		return new Point(a + c, b + d);
	}

	public Point complexMultiply(Point other) {
		double a = this.x;
		double b = this.y;
		double c = other.x;
		double d = other.y;
		double xval = (a * c) - (b * d);	
		double yval = (b * c) + (a * d);
		return  new Point(xval, yval);
		//(ac - bd) + (bc + ad)
	}
}
