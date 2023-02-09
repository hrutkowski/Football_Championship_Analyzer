import java.util.InputMismatchException;
import java.util.Scanner;

public class Console_Manager {

    private Console_Probability console_probability;
    private Console_Teams console_teams;
    private Event_Vector event_vector;
    private Display_Manager display_manager;
    private Scanner scanner;

    public Console_Manager(Event_Vector event_vector)
    {
        this.display_manager = new Display_Manager();
        this.scanner = new Scanner(System.in);
        this.event_vector = event_vector;
        this.console_probability = new Console_Probability(event_vector, display_manager, scanner );
        this.console_teams = new Console_Teams(event_vector, display_manager, scanner);
    }

    public void run()
    {
        boolean menu = true;

        while(menu)
        {
            int choice;
            display_manager.display_menu();
            try { choice = scanner.nextInt(); }
            catch(InputMismatchException e)
            {
                display_manager.display_input_not_int();
                scanner.nextLine();
                continue;
            }
            switch (choice)
            {
                case 3: menu = false; break;
                case 1: console_probability.run(); break;
                case 2: console_teams.run(); break;
                default: display_manager.display_input_error(); break;
            }
        }
    }
}
