package real_estate_agency.menu.state.impl.search;

import real_estate_agency.menu.Menu;
import real_estate_agency.menu.state.State;
import real_estate_agency.menu.state.actions.search_actions.NotFoundActions;

public class NotFoundState implements State {
    public NotFoundState(Menu menu) {
        NotFoundActions.notFoundFlatAction();
        setCharacteristicsSearchingFlat(menu);
    }

    @Override
    public void setCharacteristicsSearchingFlat(Menu menu) {
        menu.setState(new SetSearchFlatDataState(menu));
    }
}
