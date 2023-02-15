import java.util.InputMismatchException;
import java.util.Scanner;

public class Console_Probability extends Console {

    public Console_Probability(Event_Vector event_vector, Display_Manager display_manager, Scanner scanner) {
        super(event_vector, display_manager, scanner);
    }

    public void run()
    {
        boolean stop = false;
        while(!stop)
        {
            int amount;
            display_manager.display_menu_probability(event_vector);
            display_manager.display_input();
            try { amount = scanner.nextInt(); }
            catch(InputMismatchException e)
            {
                display_manager.display_input_not_int();
                scanner.nextLine();
                continue;
            }
            if (amount <= event_vector.size()) for (int i = 0; i < amount; i++) { display_manager.display_result(event_vector.get(i), i + 1); }
            else display_manager.display_input_out_of_range();
            System.out.flush();
            if (amount == 0) { stop = true; }
        }
    }
}
