package day10;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
        super(message);
    }
}

public class EmployeeBonus {
    public double Bonus(String joiningDate) throws InvalidAgeException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Long experience = null;
        LocalDate ld = null;
        LocalDate today = null;
        try {
            ld = LocalDate.parse(joiningDate, dtf);
            today = LocalDate.now();
            experience = ChronoUnit.YEARS.between(ld, today);
        } catch (Exception e) {
            System.out.println("Please pass the date in correct format");
            System.exit(0);

        }
        if (ld.isAfter(today)) {
            InvalidAgeException ef = new InvalidAgeException("Age should not be in the future");
            throw ef;

        }

        if (experience < 1)
            return 5000.00;

        else if (experience >= 1 && experience <= 2)
            return 8000.00;
        else
            return 10000.00;


    }
}

