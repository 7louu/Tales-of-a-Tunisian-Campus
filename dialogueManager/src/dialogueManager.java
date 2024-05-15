import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class dialogueNode {
    private String text;
    private List<dialogueNode> options;

    public dialogueNode(String text)
    {
        this.text = text;
        this.options = new ArrayList<>();
    }

    public void addOption(dialogueNode option) {
        options.add(option);
    }

    public void displayText() {
        System.out.println(text);
    }

    public void displayOptions() {
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i).text);
        }

    }
}

public class dialogueManager {
    private dialogueNode rootNode;
    private dialogueNode currentNode;

    public dialogueManager(dialogueNode rootNode)
    {
        this.rootNode = rootNode;
        this.currentNode = rootNode;
    }

    public void addNode(dialogueNode parentNode, dialogueNode newNode) {
        parentNode.addOption(newNode);
    }

    public void startConversation()
    {
        currentNode = rootNode;
        while (currentNode != null) {
            currentNode.displayText();
            currentNode.displayOptions();
        }
    }
}
