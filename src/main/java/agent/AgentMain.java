package agent;

import clazz.Base;
import trans.Transformer;

import java.lang.instrument.Instrumentation;

public class AgentMain {
    public static void agentmain(String agentArgs, Instrumentation inst) throws Exception {
        inst.addTransformer(new Transformer(), true);
        try {
            inst.retransformClasses(Base.class);
            System.out.println("Agent Load Done.");
        } catch (Exception e) {
            System.out.println("agent load failed!");
        }
    }
}
