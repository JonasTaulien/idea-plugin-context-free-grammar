package codes.rudolph.idea.cfg;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class CFGLexerAdapter extends FlexAdapter {
    public CFGLexerAdapter() {
        super(new CFGLexer((Reader) null));
    }
}