package real_estate_agency.menu.state.actions.sell_actions;

import real_estate_agency.сonstants.Color;

import java.util.Scanner;

public class SellOrLeaseActions {
    public static int sellOrLeaseAction() {
        System.out.println(Color.BLUE);
        System.out.println("   1 - Sell" + "   2 - To lease   ");
        System.out.println("   Please, select menu point.");
        System.out.println(Color.RESET);

        return new Scanner(System.in).nextInt();
    }
}
