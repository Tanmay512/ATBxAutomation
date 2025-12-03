package Ex_Switch;

public class TestStatusHandler {
    public static void main(String[] args) {
        String status="SKIP";
        switch (status){
            case "FAIL":
                System.out.println("Capture screenshot, attach logs, mark defect");
                break;
            case "SKIP":
                System.out.println("Mark skipped in report");
                break;
            case "BLOCKED":
                System.out.println("Stop dependent tests");
                break;
            case "RETRY":
                System.out.println("Add to retry queue");
                break;
            case "PASS":
                System.out.println("Record pass and move to next");
                break;
            case "LINKED":
                System.out.println("its linked");
                break;
            default:
                System.out.println("Unkown state");



        }

    }
}
