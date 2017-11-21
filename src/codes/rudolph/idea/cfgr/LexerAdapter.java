package codes.rudolph.idea.cfgr;

import com.intellij.lexer.FlexAdapter;

public class LexerAdapter extends FlexAdapter {
    public LexerAdapter() {
        super(new Lexer());
    }
}