package W2_6ToolBox;

import W2_3DerekTool.Tool;

import java.util.ArrayList;
import java.util.List;

public class ToolBox {


    private String color;

   public ToolBox(String color){

       this.color=color;
   }

    public String getColor() {


        return color;

    }
    private List<Tool>tools=new ArrayList<>();

    public void add(Tool tool){
        tools.add(tool);
    }

   public List<Tool> getListOfTools() {
        return tools;
    }



}
