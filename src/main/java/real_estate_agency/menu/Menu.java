package real_estate_agency.menu;

import real_estate_agency.dao.impl.ClientDAOImpl;
import real_estate_agency.menu.state.State;
import real_estate_agency.menu.state.impl.signin.StartState;
import real_estate_agency.model.ClientEntity;
import real_estate_agency.model.FlatEntity;
import real_estate_agency.model.OrderEntity;

import java.sql.SQLException;

public class Menu {
    private State state;
    private ClientEntity currentClient;
    private OrderEntity currentOrder;
    private FlatEntity currentFlat;

    public Menu() {
        this.state = new StartState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public ClientEntity getCurrentClient() {
        return currentClient;
    }

    public void setCurrentClient(String email, String password) throws SQLException {
        currentClient = new ClientDAOImpl().findByEmailAndPassword(email, password);
    }

    public OrderEntity getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(OrderEntity currentOrder) {
        this.currentOrder = currentOrder;
    }

    public FlatEntity getCurrentFlat() {
        return currentFlat;
    }

    public void setCurrentFlat(FlatEntity currentFlat) {
        this.currentFlat = currentFlat;
    }
}
