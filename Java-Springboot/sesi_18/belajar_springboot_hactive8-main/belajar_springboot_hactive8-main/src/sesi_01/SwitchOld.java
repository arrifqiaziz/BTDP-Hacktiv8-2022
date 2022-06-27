package sesi_01;

public class SwitchOld {
	public static void main (String args[]) {
		String result = "";
		String day = "M";
		switch (day)
		{
			case "M":
			case "W":
			case "F":
			{
				result = "MWF";
			}
			case "T":
			case "TH":
			case "S":
			{
				result = "TTS";
				break;
			}
		};
		System.out.println("Old Switch result:");
		System.out.println(result);
	}
}
