package codes.rudolph.idea.cfgr;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class ColorSettingsPage implements com.intellij.openapi.options.colors.ColorSettingsPage {
    @Nullable
    @Override
    public Icon getIcon() {
        return Icons.FILE;
    }

    @NotNull
    @Override
    public com.intellij.openapi.fileTypes.SyntaxHighlighter getHighlighter() {
        return new SyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "# My module\n" +
                "module A;\n" +
                "\n" +
                "# has some imports\n" +
                "import B;\n" +
                "import C.D as Basics;\n" +
                "import E.F.G as F.G;\n" +
                "\n" +
                "# and some syntax rules\n" +
                "A: 'Hello' NameWithoutX Basics.NewLine Message;\n" +
                "NameWithoutX: {'a'-'z' / 'x' <*};\n" +
                "\n" +
                "Message: {0> Sentence $ Basics.NewLine <3} Salutation;\n" +
                "Sentence: {\\u0020-\\u007E} '.';\n" +
                "Salutation: \"Greetings\" ['from' ('Germany' | 'USA')];";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return new AttributesDescriptor[]{
                new AttributesDescriptor("Line Comment", SyntaxHighlighter.COMMENT),
                new AttributesDescriptor("Module Keyword", SyntaxHighlighter.MODULE_DEF),
                new AttributesDescriptor("Import Keyword", SyntaxHighlighter.IMPORT_DEF),
                new AttributesDescriptor("Alias Keyword", SyntaxHighlighter.ALIAS_OP),
                new AttributesDescriptor("Identifier", SyntaxHighlighter.ID),
                new AttributesDescriptor("Submodule Separator", SyntaxHighlighter.SUB_MODULE_OP),
                new AttributesDescriptor("Rule Assignment Operator", SyntaxHighlighter.RUL_OP),
                new AttributesDescriptor("Exclusion Operator", SyntaxHighlighter.EXC_OP),
                new AttributesDescriptor("Alternative Operator", SyntaxHighlighter.ALT_OP),
                new AttributesDescriptor("Range Operator", SyntaxHighlighter.RNG_OP),
                new AttributesDescriptor("End of Definition", SyntaxHighlighter.DEFINITION_END),
                new AttributesDescriptor("Group-close Parenthesis", SyntaxHighlighter.GR_CLOSE),
                new AttributesDescriptor("Group-open Parenthesis", SyntaxHighlighter.GR_OPEN),
                new AttributesDescriptor("Optional-open Bracket", SyntaxHighlighter.OPT_OPEN),
                new AttributesDescriptor("Optional-close Bracket", SyntaxHighlighter.OPT_CLOSE),
                new AttributesDescriptor("Repetition-close Brace", SyntaxHighlighter.REP_CLOSE),
                new AttributesDescriptor("Repetition-open Brace", SyntaxHighlighter.REP_OPEN),
                new AttributesDescriptor("Repetition Delimiter Indicator", SyntaxHighlighter.REP_DELIM),
                new AttributesDescriptor("Repetition Min Indicator", SyntaxHighlighter.REP_MIN_CLOSE),
                new AttributesDescriptor("Min Number", SyntaxHighlighter.NATURAL_NUMBER),
                new AttributesDescriptor("Repetition Max Indicator", SyntaxHighlighter.REP_MAX_OPEN),
                new AttributesDescriptor("Max Number", SyntaxHighlighter.NON_ZERO_NATURAL_NUMBER),
                new AttributesDescriptor("Infinite", SyntaxHighlighter.INFINITE),
                new AttributesDescriptor("String", SyntaxHighlighter.MULTI_CHAR_STRING_TOK),
                new AttributesDescriptor("Character", SyntaxHighlighter.ONE_CHAR_STRING_TOK),
                new AttributesDescriptor("Unicode", SyntaxHighlighter.UNICODE_TOK)
        };
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Context Free Grammar";
    }
}
