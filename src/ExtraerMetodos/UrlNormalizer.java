package ExtraerMetodos;
/**
 * @autor:Alvaro Perez
 * */
public class UrlNormalizer {

	public String normalize(String title) {
		String url = "";
		// First we trim whitespaces
		url = trimSpaces(title);

		// Remove special chars
		url = removeSpecialChars(url);

		// Replace white spaces with hyphens
		url = replaceSpaces(url);

		// lowercase everything
		url = url.toLowerCase();

		return url;
	}

	private String trimSpaces(String title) {
		String url;
		url = title.trim();
		return url;
	}

	private String replaceSpaces(String url) {
		String spacesReplaced = "";
		for (int i = 0; i < url.length(); i++) {
			if (url.charAt(i) == ' ') {
				spacesReplaced += "-";
			} else {
				spacesReplaced += url.charAt(i);
			}
		}
		url = spacesReplaced;
		return url;
	}

	private String removeSpecialChars(String url) {
		String specialRemoved = "";
		for (int i = 0; i < url.length(); i++) {
			if (url.charAt(i) != ',' && url.charAt(i) != ':' 
					&& url.charAt(i) != '.' && url.charAt(i) != '?') {
				specialRemoved += url.charAt(i);
			}
		}

		url = specialRemoved;
		return url;
	}
}