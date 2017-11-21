package codes.rudolph.idea.cfgr;

public class Language extends com.intellij.lang.Language {
    public static final Language INSTANCE = new Language();

    private Language() {
        super("CfgrLanguage");
    }
}