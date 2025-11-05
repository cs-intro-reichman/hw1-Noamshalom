// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        String suffix;
        if (hours < 12) {
        suffix = "AM";
        } else {
        suffix = "PM";
        }

        int displayHour;
        if (hours == 0) {            
            displayHour = 0;
        } else if (hours <= 12) {    
            displayHour = hours;     
        } else {                     
            displayHour = hours - 12;
        }

		if (minutes < 10) {
            System.out.println(displayHour + ":0" + minutes + " " + suffix);
        } else {
            System.out.println(displayHour + ":" + minutes + " " + suffix);
        }
    }
}

			

	