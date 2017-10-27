package codes.rudolph.idea.cfg;

import com.intellij.lang.Language;

public class CFGLanguage extends Language {
    public static final CFGLanguage INSTANCE = new CFGLanguage();

    private CFGLanguage() {
        super("CFGLanguage");
    }
}