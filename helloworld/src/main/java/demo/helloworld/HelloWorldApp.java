package demo.helloworld;

import act.Act;
import act.inject.DefaultValue;
import org.osgl.mvc.annotation.GetAction;

import static act.controller.Controller.Util.render;

/**
 * The simple hello world app.
 * <p>Run this app, try to update some of the code, then
 * press F5 in the browser to watch the immediate change
 * in the browser!</p>
 */
@SuppressWarnings("unused")
public class HelloWorldApp {

    @GetAction
    public void home(@DefaultValue("world") String who) {
        render(who);
    }

    @GetAction("/echo/{msg}")
    public String echo(String msg) {
        return msg + "xsyy";
    }

    public static void main(String[] args) throws Exception {
        Act.start("Hello World");
    }

}
