import java.util.InputMismatchException;
import java.util.Scanner;

public class Console_Teams extends Console {

    public Console_Teams(Event_Vector event_vector, Display_Manager display_manager, Scanner scanner) {
        super(event_vector, display_manager, scanner);
    }

    public void run()
    {
        boolean stop = false;
        Team_Name_Worker team_name_worker = new Team_Name_Worker();
        display_manager.display_menu_teams();
        display_manager.display_teams(team_name_worker.get_unique_names(event_vector));
        while(!stop)
        {
            int exit;
            display_manager.display_teams_exit();
            display_manager.display_input();
            try { exit = scanner.nextInt(); }
            catch(InputMismatchException e)
            {
                display_manager.display_input_not_int();
                scanner.nextLine();
                continue;
            }
            if (exit == 0) { stop = true; }
            else display_manager.display_input_error();
        }
    }
}
