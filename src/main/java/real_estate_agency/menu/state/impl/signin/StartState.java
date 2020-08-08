package real_estate_agency.menu.state.impl.signin;

import real_estate_agency.menu.Menu;
import real_estate_agency.menu.state.State;
import real_estate_agency.menu.state.actions.signin_actions.StartActions;

public class StartState implements State {

    public StartState(Menu menu) {
        int keyMenu = StartActions.signInOrSignUpAction();
        if (keyMenu == 1) {
            signIn(menu);
        } else if (keyMenu == 2) {
            signUp(menu);
        } else {
            StartActions.wrongNumberEnteredAction();
            new StartState(menu);
        }
    }

    @Override
    public void signIn(Menu menu) {
        menu.setState(new SignInState(menu));
    }

    @Override
    public void signUp(Menu menu) {
        menu.setState(new SignUpState(menu));
    }
}
