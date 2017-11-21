package codes.rudolph.idea.cfgr;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class CfgrLexerAdapter extends FlexAdapter {
    public CfgrLexerAdapter() {
        super(new CfgrLexer((Reader) null));
    }
}