package real_estate_agency.menu.state.impl.sell;

import real_estate_agency.menu.Menu;
import real_estate_agency.menu.state.State;
import real_estate_agency.menu.state.actions.sell_actions.LeaseActions;

public class LeaseState implements State {
    public LeaseState(Menu menu) {
        LeaseActions.leaseAction(menu);
        addFlat(menu);
    }

    @Override
    public void addFlat(Menu menu) {
        menu.setState(new AddFlatState(menu));
    }
}
