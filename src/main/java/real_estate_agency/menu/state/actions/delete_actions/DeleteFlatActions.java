package real_estate_agency.menu.state.actions.delete_actions;

import real_estate_agency.dao.impl.FlatDAOImpl;
import real_estate_agency.dao.impl.OrderDAOImpl;
import real_estate_agency.menu.Menu;
import real_estate_agency.сonstants.Color;

import java.sql.SQLException;

public class DeleteFlatActions {
    public static void deleteFlatAction(Menu menu) {
        try {
            OrderDAOImpl orderDAO = new OrderDAOImpl();
            orderDAO.delete(menu.getCurrentOrder().getId());

            FlatDAOImpl flatDAO = new FlatDAOImpl();
            flatDAO.delete(menu.getCurrentOrder().getFlatId());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(Color.BLUE);
        System.out.println("   Flat deleted.");
        System.out.println(Color.RESET);
        System.exit(0);
    }
}
