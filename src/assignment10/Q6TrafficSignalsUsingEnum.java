package assignment10;

enum TrafficSignal{
        RED("STOP"), GREEN("GO"), YELLOW("DRIVE VERY SLOWLY");
        private String action;
        public String getAction(){
        return this.action;
        }
        TrafficSignal(String action){
        this.action = action;
        }
}
public class Q6TrafficSignalsUsingEnum {
    public static void main(String[] args) {
        TrafficSignal[] signals = TrafficSignal.values();
        for(TrafficSignal signal : signals){
            System.out.println("name : "+signal.name()+" action: "+signal.getAction());
        }
    }
}

/*
name : RED action: STOP
name : GREEN action: GO
name : YELLOW action: DRIVE VERY SLOWLY

 */
