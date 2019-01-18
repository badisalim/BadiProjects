package W2_3DerekTool;

public class Derek {
    private Tool tool;

    void setTool(Tool tool) {
        this.tool = tool;
    }

    Boolean canHangPainting() {
        if (tool == null || !tool.getName().equals("hammer")) {
            return false;
        }
        return true;
    }

    void hangPainting() {
        if (!canHangPainting()) {
            System.out.println("There is no hammer.");
        } else {
            System.out.println("He can hang the painting.");
        }
    }

}
//void hangPainting() {
//        if (canHangPainting()) {
//            System.out.println("He can hang the painting.");
//        } else {
//            System.out.println("There is no hammer.");
//        }
//    }
//
//}
