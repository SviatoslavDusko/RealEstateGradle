package real_estate_agency.menu.state.impl.call_message;

import real_estate_agency.menu.Menu;
import real_estate_agency.menu.state.State;
import real_estate_agency.menu.state.actions.call_message_actions.SendEmailActions;
import real_estate_agency.menu.state.impl.delete.DeleteFlatState;

public class SendEmailState implements State {
    public SendEmailState(Menu menu) {
        SendEmailActions.sendEmailOwnerAction(menu);
        deleteFlat(menu);
    }

    @Override
    public void deleteFlat(Menu menu) {
        menu.setState(new DeleteFlatState(menu));
    }
}
