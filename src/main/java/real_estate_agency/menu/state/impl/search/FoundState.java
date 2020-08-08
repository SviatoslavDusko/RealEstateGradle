package real_estate_agency.menu.state.impl.search;

import real_estate_agency.menu.Menu;
import real_estate_agency.menu.state.State;
import real_estate_agency.menu.state.actions.search_actions.FoundActions;
import real_estate_agency.menu.state.actions.signin_actions.StartActions;
import real_estate_agency.menu.state.impl.call_message.CallState;
import real_estate_agency.menu.state.impl.call_message.SendEmailState;

public class FoundState implements State {
    public FoundState(Menu menu) {
        int keyMenu = FoundActions.foundAction(menu);
        if (keyMenu == 1) {
            sendEmailOwner(menu);
        } else if (keyMenu == 2) {
            callOwner(menu);
        } else {
            StartActions.wrongNumberEnteredAction();
            new FoundState(menu);
        }
    }

    @Override
    public void sendEmailOwner(Menu menu) {
        menu.setState(new SendEmailState(menu));
    }

    @Override
    public void callOwner(Menu menu) {
        menu.setState(new CallState(menu));
    }
}
