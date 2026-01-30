// MyBirthday application
public class MyBirthday {
    public static void main(String[] args) {
        byte currentDay = Byte.parseByte(args[0]); 
        byte currentDate = Byte.parseByte(args[1]); 
        byte myBirthdayDate = Byte.parseByte(args[2]); 

        // value below is a constant
        final byte DAYS_A_WEEK = 7; 
        
        // Tasks

        // 1. calc number of days from current date
        //    to birthday
        byte daysTillBirthday = (byte) (myBirthdayDate - currentDate);


        // 2. use this along with the current weekday 
        //    to find when the birthday falls
        byte birthdayDay = (byte) ((currentDay + daysTillBirthday)%7);


        // 3. Display the result
        System.out.println("birthdayDay : " + birthdayDay);
    

    }
}