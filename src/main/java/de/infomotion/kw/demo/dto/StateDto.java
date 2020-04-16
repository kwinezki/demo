package de.infomotion.kw.demo.dto;


import de.infomotion.kw.demo.model.kwdb.State;
import de.infomotion.kw.demo.model.summerwine.SummerwineState;

import java.util.ArrayList;
import java.util.List;

public class StateDto {

    private List<SummerwineState> summerwineStateList;
    private List<State> stateList = new ArrayList<>();

    public StateDto(List<SummerwineState> summerwineStateList) {
        this.summerwineStateList = summerwineStateList;
    }

    public void transferObject() {
        summerwineStateList.forEach(summerwineState -> {
            State state = new State();
            state.setCountryShortCode(summerwineState.getCountryShortCode());
            state.setState(summerwineState.getState());
            state.setStateShortCode(summerwineState.getStateShortCode());

            stateList.add(state);

        });
    }

    public List<State> getStateList() {
        return stateList;
    }

}


