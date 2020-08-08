package real_estate_agency.menu.state.impl.delete;

import real_estate_agency.menu.Menu;
import real_estate_agency.menu.state.State;
import real_estate_agency.menu.state.actions.delete_actions.DeleteFlatActions;

public class DeleteFlatState implements State {
    public DeleteFlatState(Menu menu) {
        DeleteFlatActions.deleteFlatAction(menu);
    }
}
