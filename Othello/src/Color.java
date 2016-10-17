
public enum Color {
	WHITE("W", 1),
	BLACK("B", 0),
	NONE("_", 9);

	private Color flip;
	private String display;

	Color(String display, int flip) {
		this.display = display;
		if (flip == 1)
			this.flip = Color.BLACK;
		else
			this.flip = Color.WHITE;
	}

	public String getDisplay() {
		return display;
	}

	public Color getflip() {
		if (flip == 1)
			return Color.BLACK;
		else
			return Color.WHITE;
	}


	public int getFlip() {
		return flip;
	}

}