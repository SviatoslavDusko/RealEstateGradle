package real_estate_agency.menu.state.actions.search_actions;

import real_estate_agency.dao.impl.OrderDAOImpl;
import real_estate_agency.menu.Menu;
import real_estate_agency.model.OrderEntity;
import real_estate_agency.сonstants.Color;

import java.sql.SQLException;
import java.util.Scanner;

public class FoundActions {
    public static int foundAction(Menu menu) {
        try {
            OrderDAOImpl orderDAO = new OrderDAOImpl();
            OrderEntity order = new OrderEntity(menu.getCurrentFlat().getId(), menu.getCurrentClient().getId());

            orderDAO.create(order);
            menu.setCurrentOrder(orderDAO.findByFlatId(menu.getCurrentFlat().getId()));

            System.out.println(Color.BLUE);
            System.out.println("   Your order: " + orderDAO.findByFlatId(menu.getCurrentFlat().getId()));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("   1 - Send Email owner   " + "   2 - Call owner  ");
        System.out.println("   Please, select menu point.");
        System.out.println(Color.RESET);

        return new Scanner(System.in).nextInt();
    }
}
