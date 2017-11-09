package codes.rudolph.idea.cfg;

import com.intellij.lang.Language;

public class CfgLanguage extends Language {
    public static final CfgLanguage INSTANCE = new CfgLanguage();

    private CfgLanguage() {
        super("CfgLanguage");
    }
}