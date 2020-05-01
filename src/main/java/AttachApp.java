import com.sun.tools.attach.VirtualMachine;

public class AttachApp {
    public static void main(String[] args) throws Exception {
        VirtualMachine vm = VirtualMachine.attach(args[0]);
        vm.loadAgent(args[1]);
    }
}
