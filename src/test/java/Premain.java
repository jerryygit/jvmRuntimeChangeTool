import java.lang.instrument.Instrumentation;

public class Premain {
    public static void premain(String agentArgs, Instrumentation inst)  throws Exception {
        inst.addTransformer(new Transformer());
    }
}
