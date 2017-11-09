package codes.rudolph.idea.cfg;

import codes.rudolph.idea.cfg.psi.CFGTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class CFGSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey ALIAS_OP = createTextAttributesKey(
            "CFG_ALIAS_OP", DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey ALT_OP = createTextAttributesKey(
            "CFG_ALT_OP", DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey COMMENT = createTextAttributesKey(
            "CFG_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT
    );
    public static final TextAttributesKey DEFINITION_END = createTextAttributesKey(
            "CFG_DEFINITION_END", DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey EXC_OP = createTextAttributesKey(
            "CFG_EXC_OP", DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey GR_CLOSE = createTextAttributesKey(
            "CFG_GR_CLOSE", DefaultLanguageHighlighterColors.PARENTHESES
    );
    public static final TextAttributesKey GR_OPEN = createTextAttributesKey(
            "CFG_GR_OPEN", DefaultLanguageHighlighterColors.PARENTHESES
    );
    public static final TextAttributesKey ID = createTextAttributesKey(
            "CFG_ID", DefaultLanguageHighlighterColors.IDENTIFIER
    );
    public static final TextAttributesKey IMPORT_DEF = createTextAttributesKey(
            "CFG_IMPORT_DEF", DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey INFINITE = createTextAttributesKey(
            "CFG_INFINITE", DefaultLanguageHighlighterColors.NUMBER
    );
    public static final TextAttributesKey MODULE_DEF = createTextAttributesKey(
            "CFG_MODULE_DEF", DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey NATURAL_NUMBER = createTextAttributesKey(
            "CFG_NATURAL_NUMBER", DefaultLanguageHighlighterColors.NUMBER
    );
    public static final TextAttributesKey NON_ZERO_NATURAL_NUMBER = createTextAttributesKey(
            "CFG_NON_ZERO_NATURAL_NUMBER", DefaultLanguageHighlighterColors.NUMBER
    );
    public static final TextAttributesKey OPT_CLOSE = createTextAttributesKey(
            "CFG_OPT_CLOSE", DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey OPT_OPEN = createTextAttributesKey(
            "CFG_OPT_OPEN", DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey REP_CLOSE = createTextAttributesKey(
            "CFG_REP_CLOSE", DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey REP_DELIM = createTextAttributesKey(
            "CFG_REP_DELIM", DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey REP_MAX_OPEN = createTextAttributesKey(
            "CFG_REP_MAX_OPEN", DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey REP_MIN_CLOSE = createTextAttributesKey(
            "CFG_REP_MIN_CLOSE", DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey REP_OPEN = createTextAttributesKey(
            "CFG_REP_OPEN", DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey RNG_OP = createTextAttributesKey(
            "CFG_RNG_OP", DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey RUL_OP = createTextAttributesKey(
            "CFG_RUL_OP", DefaultLanguageHighlighterColors.KEYWORD
    );
    public static final TextAttributesKey MULTI_CHAR_STRING_TOK = createTextAttributesKey(
            "CFG_MULTI_CHAR_STRING_TOK", DefaultLanguageHighlighterColors.STRING
    );
    public static final TextAttributesKey ONE_CHAR_STRING_TOK = createTextAttributesKey(
            "CFG_ONE_CHAR_STRING_TOK", DefaultLanguageHighlighterColors.NUMBER
    );
    public static final TextAttributesKey SUB_MODULE_OP = createTextAttributesKey(
            "CFG_SUB_MODULE_OP", DefaultLanguageHighlighterColors.DOT
    );
    public static final TextAttributesKey UNICODE_TOK = createTextAttributesKey(
            "CFG_UNICODE", DefaultLanguageHighlighterColors.NUMBER
    );
    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey(
            "CFG_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER
    );

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new CFGLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(CFGTypes.ALIAS_OP)) {
            return new TextAttributesKey[]{ALIAS_OP};
        } else if (tokenType.equals(CFGTypes.ALT_OP)) {
            return new TextAttributesKey[]{ALT_OP};
        } else if (tokenType.equals(CFGTypes.COMMENT)) {
            return new TextAttributesKey[]{COMMENT};
        } else if (tokenType.equals(CFGTypes.DEFINITION_END)) {
            return new TextAttributesKey[]{DEFINITION_END};
        } else if (tokenType.equals(CFGTypes.EXC_OP)) {
            return new TextAttributesKey[]{EXC_OP};
        } else if (tokenType.equals(CFGTypes.GR_CLOSE)) {
            return new TextAttributesKey[]{GR_CLOSE};
        } else if (tokenType.equals(CFGTypes.GR_OPEN)) {
            return new TextAttributesKey[]{GR_OPEN};
        } else if (tokenType.equals(CFGTypes.ID)) {
            return new TextAttributesKey[]{ID};
        } else if (tokenType.equals(CFGTypes.IMPORT_DEF)) {
            return new TextAttributesKey[]{IMPORT_DEF};
        } else if (tokenType.equals(CFGTypes.INFINITE)) {
            return new TextAttributesKey[]{INFINITE};
        } else if (tokenType.equals(CFGTypes.MODULE_DEF)) {
            return new TextAttributesKey[]{MODULE_DEF};
        } else if (tokenType.equals(CFGTypes.NATURAL_NUMBER)) {
            return new TextAttributesKey[]{NATURAL_NUMBER};
        } else if (tokenType.equals(CFGTypes.NON_ZERO_NATURAL_NUMBER)) {
            return new TextAttributesKey[]{NON_ZERO_NATURAL_NUMBER};
        } else if (tokenType.equals(CFGTypes.OPT_CLOSE)) {
            return new TextAttributesKey[]{OPT_CLOSE};
        } else if (tokenType.equals(CFGTypes.OPT_OPEN)) {
            return new TextAttributesKey[]{OPT_OPEN};
        } else if (tokenType.equals(CFGTypes.REP_CLOSE)) {
            return new TextAttributesKey[]{REP_CLOSE};
        } else if (tokenType.equals(CFGTypes.REP_DELIM)) {
            return new TextAttributesKey[]{REP_DELIM};
        } else if (tokenType.equals(CFGTypes.REP_MAX_OPEN)) {
            return new TextAttributesKey[]{REP_MAX_OPEN};
        } else if (tokenType.equals(CFGTypes.REP_MIN_CLOSE)) {
            return new TextAttributesKey[]{REP_MIN_CLOSE};
        } else if (tokenType.equals(CFGTypes.REP_OPEN)) {
            return new TextAttributesKey[]{REP_OPEN};
        } else if (tokenType.equals(CFGTypes.RNG_OP)) {
            return new TextAttributesKey[]{RNG_OP};
        } else if (tokenType.equals(CFGTypes.RUL_OP)) {
            return new TextAttributesKey[]{RUL_OP};
        } else if (tokenType.equals(CFGTypes.MULTI_CHAR_STRING_TOK)) {
            return new TextAttributesKey[]{MULTI_CHAR_STRING_TOK};
        } else if (tokenType.equals(CFGTypes.ONE_CHAR_STRING_TOK)) {
            return new TextAttributesKey[]{ONE_CHAR_STRING_TOK};
        } else if (tokenType.equals(CFGTypes.SUB_MODULE_OP)) {
            return new TextAttributesKey[]{SUB_MODULE_OP};
        } else if (tokenType.equals(CFGTypes.UNICODE_TOK)) {
            return new TextAttributesKey[]{UNICODE_TOK};
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return new TextAttributesKey[]{BAD_CHARACTER};
        } else {
            return new TextAttributesKey[0];
        }
    }
}
