package real_estate_agency.menu.state.actions.signin_actions;

import real_estate_agency.dao.impl.ClientDAOImpl;
import real_estate_agency.dao.impl.RealtorClientDAOImpl;
import real_estate_agency.dao.impl.RealtorDAOImpl;
import real_estate_agency.model.ClientEntity;
import real_estate_agency.model.RealtorClientEntity;
import real_estate_agency.сonstants.Color;

import java.sql.SQLException;
import java.util.Scanner;

public class SignUpActions {
    public static void registerUserAction() {
        System.out.println(Color.CYAN);
        System.out.println("Please enter first name:");
        String firstName = new Scanner(System.in).nextLine();
        System.out.println("Please enter second name:");
        String secondName = new Scanner(System.in).nextLine();
        System.out.println("Please enter email:");
        String email = new Scanner(System.in).nextLine();
        System.out.println("Please enter phone number:");
        String phone = new Scanner(System.in).nextLine();
        System.out.println("Please enter password:");
        String password = new Scanner(System.in).nextLine();

        try {
            ClientEntity client = new ClientEntity(firstName, secondName, email, phone, password);
            ClientDAOImpl clientDAO = new ClientDAOImpl();
            clientDAO.create(client);

            RealtorClientEntity realtorClientEntity = new RealtorClientEntity(
                    new RealtorDAOImpl().findRandomOne().getId(),
                    clientDAO.findByEmailAndPassword(email, password).getId());
            new RealtorClientDAOImpl().create(realtorClientEntity);

            System.out.println(Color.BLUE);
            System.out.println("   You are signed up!");
            System.out.println(Color.RESET);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
