package real_estate_agency.menu.state.impl.signin;

import real_estate_agency.menu.Menu;
import real_estate_agency.menu.state.State;
import real_estate_agency.menu.state.actions.signin_actions.SignUpActions;

public class SignUpState implements State {
    public SignUpState(Menu menu) {
        SignUpActions.registerUserAction();
        signIn(menu);
    }

    @Override
    public void signIn(Menu menu) {
        menu.setState(new StartState(menu));
    }
}
