package real_estate_agency.menu.state.impl.buy;

import real_estate_agency.menu.Menu;
import real_estate_agency.menu.state.State;
import real_estate_agency.menu.state.impl.search.SetSearchFlatDataState;

public class BuyOrRentState implements State {

    public BuyOrRentState(Menu menu) {
        setCharacteristicsSearchingFlat(menu);
    }

    @Override
    public void setCharacteristicsSearchingFlat(Menu menu) {
        menu.setState(new SetSearchFlatDataState(menu));
    }
}
