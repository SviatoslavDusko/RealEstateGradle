package real_estate_agency.menu.state.impl.sell;

import real_estate_agency.menu.Menu;
import real_estate_agency.menu.state.State;
import real_estate_agency.menu.state.actions.sell_actions.SellOrLeaseActions;
import real_estate_agency.menu.state.actions.signin_actions.StartActions;

public class SellOrLeaseState implements State {
    public SellOrLeaseState(Menu menu) {
        int keyMenu = SellOrLeaseActions.sellOrLeaseAction();

        if (keyMenu == 1) {
            sell(menu);
        } else if (keyMenu == 2) {
            toLease(menu);
        } else {
            StartActions.wrongNumberEnteredAction();
            new SellOrLeaseState(menu);
        }
    }

    @Override
    public void sell(Menu menu) {
        menu.setState(new SellState(menu));
    }

    @Override
    public void toLease(Menu menu) {
        menu.setState(new LeaseState(menu));
    }


}
