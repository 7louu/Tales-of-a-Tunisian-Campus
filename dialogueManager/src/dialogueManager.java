import java.util.ArrayList;
import java.util.List;
class dialaogueNode{
    private String text;
    private List<dialaogueNode> Options;
    public dialaogueNode(String text){
        this.text = text;
        this.Options = new ArrayList<>();
    }
    public void addOption(dialaogueNode option){
        Options.add(option);
    }
    public void displayText(){
        System.out.println(text);
    }
    public void displayOptions()
    {
        for (int i=0; i < Options.size(); i++)
        {
            System.out.println((i + 1) + " . " + Options.get(i).text);
        }
    }
}
public class dialogueManager{
    private dialaogueNode root;
    public dialogueManager(String rootText)
    {
        this.root = new dialaogueNode(rootText);
    }
    public void addoptionToRoot(dialaogueNode option)
    {
        root.addOption(option);
    }
    public void traverseDialogueTree(dialaogueNode node)
    {
        node.displayText();
        node.displayOptions();
    }
    public void startConversation()
    {
        traverseDialogueTree(root);
    }

}