package academy.teenfuture.crse.problem_09;

public class Square {
	private int sideLength;

	public Square(int sideLength) {
		this.sideLength = sideLength;
	}

	public int getSideLength() {
		return sideLength;
	}

	public void setSideLength(int sidelength) {
		this.sideLength = sidelength;
	}

	public int getAreaOfSquare() {
		return sideLength * sideLength;
	}

}