package sesi_01;
public class SwitchNew {
	public static void main (String args[]) {
		String day = "dsfsdfsdM";
		String result = switch (day)
		{
			case "M", "W", "F" -> "MWF";
			case "T", "TH", "S" -> "TTS";
			default -> 
			{
				if(day.isEmpty())
					System.out.println("Please insert a valid day.");
				else
					System.out.println("Looks like a Sunday.");
				throw new IllegalStateException("Invalid day: " + day);
			}
		};
		System.out.println(result);
	}
}
