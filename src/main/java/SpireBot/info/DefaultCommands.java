package SpireBot.info;

public class DefaultCommands {
    public static void setup() {
        // TODO: make it configurable
        String prefix = "!spire ";

        CommandDatabase.register(prefix, "seed", InfoFinder::getSeed);
        CommandDatabase.register(prefix, "info", InfoFinder::getInfo);
        CommandDatabase.register(prefix, "help", () -> InfoFinder.getHelp(prefix));

        //CommandDatabase.register(prefix, "list", InfoFinder::getList);
        CommandDatabase.register(prefix, "list", () -> CommandDatabase.getAllCommandsByPrefix(prefix));

        CommandDatabase.register(prefix, "act1", InfoFinder::getAct1);
        CommandDatabase.register(prefix, "relics", InfoFinder::getRelics);

        // TODO: enable or disable by config
        CommandDatabase.registerPrefixErrorMessage(prefix, () -> "ERROR: Not a recognized command. Please use '" + prefix + "help' for more information about this bot.");
    }
}
