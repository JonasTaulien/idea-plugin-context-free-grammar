package codes.rudolph.idea.cfgr;

import com.intellij.lang.Language;

public class CfgrLanguage extends Language {
    public static final CfgrLanguage INSTANCE = new CfgrLanguage();

    private CfgrLanguage() {
        super("CfgrLanguage");
    }
}