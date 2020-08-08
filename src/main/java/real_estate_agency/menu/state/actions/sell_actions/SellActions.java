package real_estate_agency.menu.state.actions.sell_actions;

import real_estate_agency.dao.impl.FlatDAOImpl;
import real_estate_agency.dao.impl.RealtorClientDAOImpl;
import real_estate_agency.menu.Menu;
import real_estate_agency.model.FlatEntity;
import real_estate_agency.сonstants.Color;

import java.sql.SQLException;
import java.util.Scanner;

public class SellActions {
    public static void sellAction(Menu menu) {
        System.out.println(Color.CYAN);
        System.out.println("Enter address:");
        String address = new Scanner(System.in).nextLine();
        System.out.println("Enter floor:");
        Integer floor = new Scanner(System.in).nextInt();
        System.out.println("Enter room count:");
        Integer roomCount = new Scanner(System.in).nextInt();
        System.out.println("Enter square:");
        Integer square = new Scanner(System.in).nextInt();
        System.out.println("Enter price:");
        Integer price = new Scanner(System.in).nextInt();
        System.out.println(Color.RESET);

        try {
            FlatEntity flatEntity = new FlatEntity(menu.getCurrentClient().getId(),
                    new RealtorClientDAOImpl().findByClientId(menu.getCurrentClient().getId()).getRealtorId(),
                    address, floor, roomCount, square, "sell", price);
            FlatDAOImpl flatDAO = new FlatDAOImpl();
            flatDAO.create(flatEntity);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(Color.BLUE);
        System.out.println("   You are added flat (Sell)!");
        System.out.println(Color.RESET);
    }
}
