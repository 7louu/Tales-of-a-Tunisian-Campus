import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class dialogueNode {
    private String text;
    public ArrayList<String> options_list;
    public List<dialogueNode> options;
    boolean isFinishNode;
    public dialogueNode(String text)
    {
        this.text = text;
        this.options = new ArrayList<>();
        isFinishNode = false;
        options_list = new ArrayList<>();
    }
    public dialogueNode(String text,boolean finishNode)
    {
        this.text = text;
        this.options = new ArrayList<>();
        isFinishNode = finishNode;
        options_list = new ArrayList<>();
    }

    public  void add_list_options(String aa)
    {
        options_list.add(aa);
    }
    public void addOption(dialogueNode option) {
        options.add(option);
    }

    public void displayText() {
        System.out.println(text);
    }

    public void displayOptions()
    {
        for (int i = 0; i < options_list.size(); i++)
        {
            System.out.println((i + 1) + ". " + options_list.get(i));
        }

    }
}

public class dialogueManager {
    private dialogueNode rootNode;
    private dialogueNode currentNode;
    Level level;
    public dialogueManager(dialogueNode rootNode,Level l) {
        this.rootNode = rootNode;
        this.currentNode = rootNode;
        level =l;
    }

    public void addNode(dialogueNode parentNode, dialogueNode newNode) {
        parentNode.addOption(newNode);
    }

    public void startConversation(dialogueNode node) {
        currentNode = node;
        currentNode.displayText();
        if(node.isFinishNode)
        {
            System.out.println("Enzel 3la ay felsa bch tet3ada lel level el jey.");
            Scanner scannere = new Scanner(System.in);
            String name=scannere.next();
            level.finishLevel();
            return;
        }
        currentNode.displayOptions();
        Scanner scanner = new Scanner(System.in);
        String name=scanner.next();
        int choice = Integer.parseInt(name);
        System.out.println(choice);
        if (choice <= currentNode.options.size()) {
            startConversation(currentNode.options.get(choice-1));
        }
        else {
            System.out.println("Choose a valide choice.");
            startConversation(currentNode);
        }
    }
}
