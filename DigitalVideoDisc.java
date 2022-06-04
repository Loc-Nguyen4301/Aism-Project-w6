import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DigitalVideoDisc extends Media {
	private String director;
	private int length;

	public DigitalVideoDisc(int id, String title, String category, float cost, String director, int length) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
		this.length = length;

	}

	public boolean search(String title) {

		String[] splitString = title.split(" ");

		for (int i = 0; i < splitString.length; i++) {
			Pattern pattern = Pattern.compile(splitString[i].trim().toLowerCase());
			Matcher matcher = pattern.matcher(this.title.trim().toLowerCase());
			if (!matcher.find())
				return false;
		}
		return true;
	}
}
