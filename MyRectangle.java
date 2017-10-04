// CS 401 Lab 5
// Fill in the indicated code sections to complete this class.  Then test it
// by compiling and executing Lab5.java.

public class MyRectangle
{
	// Declare instance variables here.  See toString() method below for names.

	// declare the default value of 0

	private int width = 0; 
	private int height = 0;
	private int startX = 0;
	private int startY = 0;

	private int area = 0;
	private boolean inside;

	public MyRectangle()
	{
		// Default constructor -- initialize all instance variables
		// to 0
		width = 0;
		height = 0;
		startX = 0;
		startY=0;
	}

	public MyRectangle(int x, int y, int w, int h)
	{
		startX = x;
		startY= y;
		width = w;
		height = h;

		// Initialize instance variables based on parameters shown.
		// Be careful to get the order correct!
	}

	public int area(){
		area = width*height;
		return area;
	}

	// I have written this method for you.  Note how a StringBuilder is
	// utilized, since (as we discussed in lecture) it can be modified
	// without having to create a new object each time (unlike a String).
	public String toString()
	{
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}

	public boolean isInside(int x, int y)
	{
		
		// This is the trickiest of the methods to write.  This should
		// return true if point (x,y) is anywhere within the borders of the
		// current MyRectangle (including the borders themselves).  Use a
		// pencil and paper to figure out how this can be determined with
		// just a few simple relational operations.


		if ((x>(width + startX)) || (x<startX) || (y<startY) || (y>(height + startY))){
			inside = false;
		}
		else{
			inside = true;
		}


		return inside;
	}

	public void setSize(int w, int h)
	{
		width = w;
		height = h;
		//return width, heigth;
		// Update width and height as shown
	}

	public void setPosition(int x, int y)
	{
		startX =x;
		startY =y;
		// Update startX and startY as shown
	}

}