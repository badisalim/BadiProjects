package W2_6ToolBox;

import W2_3DerekTool.Tool;

import java.util.List;

public class ToolShopApplication {

    public static void main(String[] args) {

        ToolBox toolBox=new ToolBox("red");
        ShopAssistant shopAssistant=new ShopAssistant();
        List<Tool> tools = shopAssistant.getTools();
        System.out.println(toolBox.getColor());
        for (Tool tool :
                tools) {
            System.out.println(tool.getName());
        }

    }
}
