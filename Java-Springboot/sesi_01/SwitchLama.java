public class SwitchLama {
  public static void main(String[] args) {

    String result = "";

    switch ("day") {
      case "M":
      case "W":
      case "F": {
        result = "MWF";
        break;
      }

      case "T":
      case "TH":
      case "S": {
        result = "TTS";
        break;
      }

    }
    ;
    System.out.println("Old switch result : ");
    System.out.println(result);
  }
}