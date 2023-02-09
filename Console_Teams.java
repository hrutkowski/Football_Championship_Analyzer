import java.util.InputMismatchException;
import java.util.Scanner;

public class Console_Teams extends Console {

    public Console_Teams(Event_Vector event_vector, Display_Manager display_manager, Scanner scanner) {
        super(event_vector, display_manager, scanner);
    }

    public void run()
    {
        boolean stop = false;
        while(!stop)
        {
            int exit = 0;
            try
            {
                display_manager.display_menu_teams();
                exit = scanner.nextInt();
            }
            catch(InputMismatchException e)
            {
                display_manager.display_input_not_int();
                scanner.nextLine();
                continue;
            }
            if (exit == 0) { stop = true; }
        }
    }
}
