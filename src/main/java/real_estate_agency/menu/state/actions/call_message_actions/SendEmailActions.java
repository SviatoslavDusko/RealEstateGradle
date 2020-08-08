package real_estate_agency.menu.state.actions.call_message_actions;

import real_estate_agency.dao.impl.ClientDAOImpl;
import real_estate_agency.dao.impl.FlatDAOImpl;
import real_estate_agency.menu.Menu;
import real_estate_agency.model.ClientEntity;
import real_estate_agency.сonstants.Color;

import java.sql.SQLException;

public class SendEmailActions {
    public static void sendEmailOwnerAction(Menu menu) {
        try {
            ClientEntity owner = new ClientDAOImpl().findById(
                    new FlatDAOImpl()
                            .findById(menu.getCurrentOrder().getFlatId()).getOwnerId());

            System.out.println(Color.BLUE);
            System.out.println("   Email was send at " + owner.getEmail() + ".");
            System.out.println(Color.RESET);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
