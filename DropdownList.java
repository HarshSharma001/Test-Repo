
public class DropdownList {
	private String title;
	private boolean isSelected;
	private int level;
	private String colour;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	

	public DropdownList(String title, boolean isSelected, int level, String colour) {
		super();
		this.title = title;
		this.isSelected = isSelected;
		this.level = level;
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "DropdownList [title=" + title + ", isSelected=" + isSelected + ", level=" + level + ", colour=" + colour
				+ "]";
	}
}
