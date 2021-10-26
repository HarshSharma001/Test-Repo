import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		List<DropdownList> dropDownList = new ArrayList<>();
		dropDownList.add(new DropdownList("Alcohol", false, 0, "blue"));
		dropDownList.add(new DropdownList("Breakup", false, 0, "blue"));
		dropDownList.add(new DropdownList("Insanity", false, 0, "blue"));
		dropDownList.add(new DropdownList("Love", false, 0, "blue"));
		dropDownList.add(new DropdownList("Emotional", false, 0, "blue"));
		dropDownList.add(new DropdownList("Reality", false, 0, "blue"));
		dropDownList.add(new DropdownList("Range", false, 0, "blue"));
		dropDownList.add(new DropdownList("Distance", false, 0, "blue"));
		dropDownList.add(new DropdownList("Winter", false, 0, "blue"));
		dropDownList.add(new DropdownList("Summer", false, 0, "blue"));

		Scanner sc = new Scanner(System.in);
		
		String selectedOptions1 = "";
		String selectedOptions2 = "";
		
		while (sc.hasNext()) {
			//level 1 => 1st Drop down list, level2 => 2nd Drop down list
			int level = sc.nextInt();
			if(level > 2) {
				System.out.println("Dropdown list 1 = "+selectedOptions1);
				System.out.println("Dropdown list 2 = "+selectedOptions2);
				break;
			}
			//clearing the previous selected options
			selectedOptions1 = "";
			selectedOptions2 = "";
			//choice 1 => select element, choice 2 => unselect element
			int choice = sc.nextInt();
			if (choice == 1) {
				int selectItem = sc.nextInt() - 1;
				DropdownList currentItem = dropDownList.get(selectItem);
				currentItem.setSelected(true);
				currentItem.setLevel(level);
			} else if (choice == 2) {
				int unselectItem = sc.nextInt() - 1;
				DropdownList currentItem = dropDownList.get(unselectItem);
				currentItem.setSelected(false);
				currentItem.setLevel(0);
			}

			String finalDropDown1 = "[ ";
			String finalDropDown2 = "[ ";
			
			for (DropdownList obj : dropDownList) {
				if (obj.getLevel() == 0) {
					finalDropDown1 += "{" + obj.getTitle() + "}, ";
					finalDropDown2 += "{" + obj.getTitle() + "}, ";
				} else if (obj.getLevel() == 1) {
					finalDropDown1 += "{" + obj.getTitle() + " => selected }, ";
					selectedOptions1 += obj.getTitle() + ",";
				} else if (obj.getLevel() == 2) {
					finalDropDown2 += "{" + obj.getTitle() + " => selected }, ";
					selectedOptions2 += obj.getTitle() + ",";
				}
			}
			finalDropDown1 = finalDropDown1.substring(0, finalDropDown1.length() - 2) + " ]";
			finalDropDown2 = finalDropDown2.substring(0, finalDropDown2.length() - 2) + " ]";
			
			if(selectedOptions1.length() >= 2) 
			selectedOptions1 = selectedOptions1.substring(0, selectedOptions1.length() - 1);
			if(selectedOptions2.length() >= 2)
			selectedOptions2 = selectedOptions2.substring(0, selectedOptions2.length() - 1);
			
			System.out.println(finalDropDown1);
			System.out.println(finalDropDown2);
		}
	}
}
