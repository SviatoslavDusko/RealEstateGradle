package real_estate_agency.menu.state.impl.search;

import real_estate_agency.menu.Menu;
import real_estate_agency.menu.state.State;
import real_estate_agency.menu.state.actions.search_actions.FlatDataSetActions;

public class SetSearchFlatDataState implements State {

    public SetSearchFlatDataState(Menu menu) {
        int keyMenu = FlatDataSetActions.setData(menu);
        if (keyMenu == 0) {
            notFound(menu);
        } else if (keyMenu == 1) {
            found(menu);
        }
    }

    @Override
    public void notFound(Menu menu) {
        menu.setState(new NotFoundState(menu));
    }

    @Override
    public void found(Menu menu) {
        menu.setState(new FoundState(menu));
    }
}
