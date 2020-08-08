package real_estate_agency.menu.state.actions.search_actions;

import real_estate_agency.сonstants.Color;

public class NotFoundActions {
    public static void notFoundFlatAction() {
        System.out.println(Color.BLUE);
        System.out.println("   Found 0 flats, please enter other parameters.");
        System.out.println(Color.RESET);
    }
}
