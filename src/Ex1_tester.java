import ex1.Ex1_main;

public class Ex1_tester {
    public static void main(String[] args) {
        if(args==null || args.length<4) {
            args = new String[4];
            args[0] = "207867342,314915778";
            args[1] = "data/B5.json";
            args[2] = "Outputs/output_B5_d.csv";
            long time = System.currentTimeMillis();
            args[3] = "out/Ex1_report_case_" + "_" + time + "_ID_.log";
        }
        Ex1_main.main(args);
    }
}
