package com.fubaisum.groovy.practice;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by sum on 10/5/16.
 */
public class CallingScript {
    public static void main(String[] args) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("groovy");
        System.out.println("Calling script from java");
        try {
            scriptEngine.eval("println 'Hello from Groovy'");

            scriptEngine.put("name", "Venkat");
            String script = "println \"Hello ${name} from Groovy\";name += '!'";
            scriptEngine.eval(script);
            String name = (String) scriptEngine.get("name");
            System.out.println("Back in Java: " + name);

        } catch (ScriptException e) {
            System.out.println(e);
        }

        
    }
}
