import java.util.Scanner;

abstract class Level{
    private int levelNumber;
    protected dialogueNode root;
    private Player player;
    public Level(int levelNumber)
    {
        this.levelNumber = levelNumber;
    }

    public void startLevel()
    {
        System.out.println("Level Started!");
        System.out.println("Level 1 : Profet el Python");
        System.out.println("You can exit the game by typing '20' as a choice" );
        createFirstDialogue();
    }
    public dialogueManager createFirstDialogue()
    {
        return  null;
    }
    public void finishLevel()
    {
        System.out.println("Level Completed successfully!");
    }
}
class firstLevel extends Level{
    private firstBoss B1;
    private dialogueManager dialogueManager;

    public firstLevel(firstBoss B1)
    {
        super(1);
        this.B1 = B1;
    }

    @Override
    public void startLevel()
    {
        super.startLevel();
        dialogueManager.startConversation(root);
    }

    @Override
    public void finishLevel()
    {
        super.finishLevel();
        firstSide side1 = new firstSide(100,100);
        secondLevel l2 = new secondLevel(side1);
        l2.startLevel();
    }
    public dialogueManager createFirstDialogue()
    {
        root = new dialogueNode("Ya marhbe");
        root.add_list_options("1-Bonjourat Madame");
        root.add_list_options("2-Saba7 hal sbe7");

        // Creating node1 and its options
        dialogueNode node1 = new dialogueNode("Chbikom l tawa ??????");
        node1.add_list_options("1-Noum ghlebni Madame");
        node1.add_list_options("2-Na9ra b 7 mleyen w 700 ma tdaberch aalya wa9teh nji");
        root.addOption(node1);
        root.addOption(node1);

        // Creating node2 and its options
        dialogueNode node2 = new dialogueNode("aalech baba balekchy aamel aalina mzeya");
        node2.add_list_options("1-Madame bllhy salli aal nibi hal sbeh");
        node2.add_list_options("2-ch7ra9 ch3irek enty ?");
        node1.addOption(node2);
        node1.addOption(node2);

        // Creating node3 and its options
        dialogueNode node3 = new dialogueNode("profet python t7awlet l 7nach", true);
        node3.add_list_options("1-bech t7areb?");
        node3.add_list_options("2-chtar errojla harba?");
        node2.addOption(node3);
        node2.addOption(node3);
        dialogueManager = new dialogueManager(root,this);
        return dialogueManager;
    }
}
class secondLevel extends Level{
    private firstSide side1;
    private dialogueManager dialogueManager;
    public secondLevel(firstSide side1)
    {
        super(2);
        this.side1 = side1;
    }

    @Override
    public void startLevel()
    {
        super.startLevel();
        System.out.println("Level 2 : Weld classek");
        dialogueManager = createSecondDialogue();
        dialogueManager.startConversation(root);
    }

    @Override
    public void finishLevel()
    {
        super.finishLevel();
        secondSide side2 = new secondSide();
        thirdLevel l3 = new thirdLevel(side2);
        l3.startLevel();
    }

    public dialogueManager createSecondDialogue()
    {
        root = new dialogueNode("Ahla bel m3alem");
        root.add_list_options("1-Makhyeb mandhrek");
        root.add_list_options("2-ahla b wejh el na7s");

        // Creating node1 and its options
        dialogueNode node1 = new dialogueNode("chtodkhol ta9ra ?");
        node1.add_list_options("1- tdaber aalya!");
        node1.add_list_options("2- esba9 ataw nakhlet");
        root.addOption(node1);
        root.addOption(node1);

        // Creating node2 and its options
        dialogueNode node2 = new dialogueNode("haya haya bara nemchiw");
        node2.add_list_options("1-naamlou 9ahwa w nemchiw");
        node2.add_list_options("2-msabah aalik enty w thebni nodkhol na9ra bellehy!");
        node1.addOption(node2);
        node1.addOption(node2);

        // Creating node3 and its options
        dialogueNode node3 = new dialogueNode("hatenti wejh 9raya");
        node3.add_list_options("1-9adeh jebt note fi lbase ?");
        node3.add_list_options("2-azyen mennek!");
        node2.addOption(node3);
        node2.addOption(node3);

        // Creating node4 and its options
        dialogueNode node4 = new dialogueNode("Lee dhaher aala zinek",true);
        node4.add_list_options("1-beaugosse aalik w enty men dekhel taaref hani sbe9t akhlet");
        node3.addOption(node4);
        node3.addOption(node4);

        dialogueManager = new dialogueManager(root,this);
        return dialogueManager;
    }
}
class thirdLevel extends Level{
    private secondSide side2;
    private dialogueManager dialogueManager;
    public thirdLevel(secondSide side2)
    {
        super(3);
        this.side2 = side2;
    }

    @Override
    public void startLevel()
    {
        super.startLevel();
        System.out.println("Level 3 : SAHABTEK !!!!!");
        dialogueManager = createThirdDialogue();
        dialogueManager.startConversation(root);
    }

    @Override
    public void finishLevel()
    {
        super.finishLevel();
        thirdSide side3 = new thirdSide();
        fourthLevel l4 = new fourthLevel(side3);
        l4.startLevel();
    }
    public dialogueManager createThirdDialogue()
    {
        root = new dialogueNode("bonjour azizi");
        root.add_list_options("1-bonjour habibi");
        root.add_list_options("2-3inaya chna7welek");

        // Creating node1 and its options
        dialogueNode node1 = new dialogueNode("chaandek taaml ?");
        node1.add_list_options("1-nendeb aala ayemi");
        node1.add_list_options("2-bech netleha bik");
        root.addOption(node1);
        root.addOption(node1);

        // Creating node2 and its options
        dialogueNode node2 = new dialogueNode("haya naamlou 9ahwa ?");
        node2.add_list_options("1-naamlou hata zouz");
        node2.add_list_options("2-hyeti lik");
        node1.addOption(node2);
        node1.addOption(node2);

        // Creating node3 and its options
        dialogueNode node3 = new dialogueNode("win nemchiw ?");
        node3.add_list_options("1-base fl buvette");
        node3.add_list_options("2-nekhdhou 9hawy w nerkchou fl stade");
        node2.addOption(node3);
        node2.addOption(node3);

        // Creating node4 and its options
        dialogueNode node4 = new dialogueNode("hani maak Azizi",true);
        node4.add_list_options("1-adheka aaleh nhebek");
        node3.addOption(node4);
        node3.addOption(node4);

        dialogueManager = new dialogueManager(root,this);
        return dialogueManager;
    }
}
class fourthLevel extends Level{
    private thirdSide side3;
    private dialogueManager dialogueManager;
    public fourthLevel(thirdSide side3)
    {
        super(4);
        this.side3 = side3;
    }
    @Override
    public void startLevel()
    {
        super.startLevel();
        System.out.println("Level 4 : El 3DOU ");
        dialogueManager = createFourthDialogue();
        dialogueManager.startConversation(root);
    }

    @Override
    public void finishLevel()
    {
        super.finishLevel();
        secondBoss finalBoss = new secondBoss();
        fifthLevel l5 = new fifthLevel(finalBoss);
        l5.startLevel();
    }
    public dialogueManager createFourthDialogue()
    {
         root = new dialogueNode("aw jee hedha");
        root.add_list_options("1-met9ala9");
        root.add_list_options("2-bech no93od aala 9albek");

        // Creating node1 and its options
        dialogueNode node1 = new dialogueNode("chbik jey skhoun");
        node1.add_list_options("1-mandhrek يثير الاشمئزاز");
        root.addOption(node1);
        root.addOption(node1);

        // Creating node2 and its options
        dialogueNode node2 = new dialogueNode("chou aka lmandher aad");
        node2.add_list_options("1-wallahy ken majinech fi blasa Mohtarma rani toht maak fl niveau akther");
        node1.addOption(node2);
        node1.addOption(node2);

        // Creating node3 and its options
        dialogueNode node3 = new dialogueNode("chou aka niveau elli aandek");
        node3.add_list_options("1-tatla3 tahbet no93od sidek w bech takhlatli lezmk taxi");
        node2.addOption(node3);
        node2.addOption(node3);

        // Creating node4 and its options
        dialogueNode node4 = new dialogueNode("nfoutek hata aala karrita");
        node4.add_list_options("1-aya tlammm la nejbedlek khonnarek w ndha7ek aalik khal9 rabbi");
        node3.addOption(node4);
        node3.addOption(node4);

        // Creating node5 and its options
        dialogueNode node5 = new dialogueNode("bara bsahtek",true);
        node5.add_list_options("1-sahitek nhebek rayedh aayech weldi haya egleb ayy");
        node4.addOption(node5);
        node4.addOption(node5);


        dialogueManager = new dialogueManager(root,this);
        return dialogueManager;
    }
}
class fifthLevel extends Level{
    private secondBoss B2;
    private dialogueManager dialogueManager;
    public fifthLevel(secondBoss B2)
    {
        super(5);
        this.B2 = B2;
    }
    @Override
    public void startLevel()
    {
        super.startLevel();
        System.out.println("Final Level: A7sen Profa fl EPI");
        dialogueManager = createFifthDialogue();
        dialogueManager.startConversation(root);
    }

    @Override
    public void finishLevel() {
        super.finishLevel();
        System.out.println("You have completed the Game !!");
        Player player = new Player();
        player.checkStats();
    }

    public dialogueManager createFifthDialogue()
    {
         root = new dialogueNode("haya behy ki mazelna nchoufou wjouhkom");
        root.add_list_options("1-sada9ni madame hata ahna twahachnek");

        // Creating node1 and its options
        dialogueNode node1 = new dialogueNode("winkom hal ghiba");
        node1.add_list_options("1-wallahy madame khedma w noum w taab w sahrya manajmouch njou sbeh");
        root.addOption(node1);

        // Creating node2 and its options
        dialogueNode node2 = new dialogueNode("rakom bech tdhorou rwe7kom aadi etti7ou eliminés w bech tekhdhou note khayba fl controle continue");
        node2.add_list_options("1-naaref madame thebna kif ma ahna nhebouk w matdhornech");
        node1.addOption(node2);

        // Creating node3 and its options
        dialogueNode node3 = new dialogueNode("behy behy yezi bla dharben lougha .. aya het errasmi w chaamltou fl projet");
        node3.add_list_options("1-mani 9otlek madame jawek nice w thanna aalina nharet l presentation taw tchouf errjel");
        node2.addOption(node3);

        // Creating node4 and its options
        dialogueNode node4 = new dialogueNode("lee nheb nchouf l'avancement mte3kom");
        node4.add_list_options("1-ok madame taw nabaathlk mail fih l avancement");
        node3.addOption(node4);

        // Creating node5 and its options
        dialogueNode node5 = new dialogueNode("ezrbou rwehkom raw deadline 9rib");
        node5.add_list_options("1-thanna madame ghir enty hadher el 20");
        node4.addOption(node5);

        // Creating node6 and its options
        dialogueNode node6 = new dialogueNode("nchlh tkounou capable taarefni nheb les etudiants mte3i w nhebelhom ken lkhir");
        node6.add_list_options("1-wallahy madame mataarech hata ahna 9adeh nhebouk … et surtout Aarafet");
        node5.addOption(node6);

        // Creating node7 and its options
        dialogueNode node7 = new dialogueNode("behy behy fl presentation taw nahkiw");
        node7.add_list_options("1-behy madame miselech tkhalina nemchiw naamlou 9ahwa w narj3oulek S2 w t9ayedna S1 hadhrin khater mazelna ki fo9na menoum");
        node6.addOption(node7);

        // Creating node8 and its options
        dialogueNode node8 = new dialogueNode("ayy miselech vas-y", true);
        node8.add_list_options("1-Rabbi ykhalik lina");
        node7.addOption(node8);
        dialogueManager = new dialogueManager(root,this);
        return dialogueManager;
    }
}


