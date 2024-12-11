package menu.controller;

import java.util.List;
import menu.model.Coach;
import menu.view.OutPutView;

public class OutPutController {
    public final OutPutView outPutView;
    private static final String LINE_SEPARATOR = System.lineSeparator();

    public OutPutController(OutPutView outPutView) {
        this.outPutView = outPutView;
    }

    public void run(List<Coach> coaches) {
        
    }


}
