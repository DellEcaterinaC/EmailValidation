import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Boolean found = false;
        int trials = 1;

        List<String> emails = Arrays.asList("utremblay@gmail.com", "haylie74@farrell.com", "zechariah.spinka@hotmail.com", "wgorczany@yahoo.com", "branson23@smitham.com", "jeromy37@gmail.com", "ihoppe@gmail.com", "estamm@hotmail.com", "brent10@green.org", "ana83@kilback.biz", "jmohr@gmail.com", "rmann@nienow.com", "etha53@yahoo.com", "leone.rosenbaum@klocko.com", "aubrey.stroman@yahoo.com", "paucek.rylee@hotmail.com", "walter.ernestine@yahoo.com", "novella04@champlin.com", "kfritsch@lindgren.biz", "anthony04@ankunding.com", "glenda.hayes@hotmail.com", "nash90@huels.org", "yost.cielo@gmail.com", "krajcik.rowena@yahoo.com", "effertz.bo@leannon.com", "nikita92@maggio.com", "ngoodwin@quitzon.com", "swaniawski.guadalupe@kozey.org", "sean29@ohara.com", "okoch@hotmail.com");
        String employeeEmail;

        Scanner scanner = new Scanner(System.in);

        while(trials !=0)
        {
            System.out.println("Enter the email your are looking for: ");
            employeeEmail = scanner.nextLine();

            for(String s: emails)
            {
                if(s.equals(employeeEmail))
                {
                    found = true;
                }
            }

            if(found) {
                System.out.println("Employee email validated.");
            }
            else
            {
                System.out.println("Employee email is not in the system.");
            }
            found = false;
        }
    }
}
