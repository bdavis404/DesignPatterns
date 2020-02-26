package com.bkd.momento;

import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {

    private List<DocumentState> states = new ArrayList<>();

    public void push(DocumentState state) {
        states.add(state);
    }

    public DocumentState pop() {
        int lastIndex = states.size() - 1;
        DocumentState lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }
}
