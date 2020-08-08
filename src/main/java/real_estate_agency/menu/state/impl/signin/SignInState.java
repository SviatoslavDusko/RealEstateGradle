package real_estate_agency.menu.state.impl.signin;

import real_estate_agency.menu.Menu;
import real_estate_agency.menu.state.State;
import real_estate_agency.menu.state.actions.signin_actions.SignInActions;
import real_estate_agency.menu.state.actions.signin_actions.StartActions;
import real_estate_agency.menu.state.impl.buy.BuyOrRentState;
import real_estate_agency.menu.state.impl.sell.SellOrLeaseState;

public class SignInState implements State {
    public SignInState(Menu menu) {
        int keyMenu = SignInActions.successfulSignInAction(menu);

        while (keyMenu != 1 && keyMenu != 2) {
            StartActions.wrongNumberEnteredAction();
            keyMenu = SignInActions.afterLogInAction();
        }

        if (keyMenu == 1) {
            buyOrRent(menu);
        } else if (keyMenu == 2) {
            sellOrToLease(menu);
        }
    }

    @Override
    public void buyOrRent(Menu menu) {
        menu.setState(new BuyOrRentState(menu));
    }

    @Override
    public void sellOrToLease(Menu menu) {
        menu.setState(new SellOrLeaseState(menu));
    }
}
