package codes.rudolph.idea.cfg;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class CFGColorSettingsPage implements ColorSettingsPage {
    @Nullable
    @Override
    public Icon getIcon() {
        return Icons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new CFGSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "# My module\n" +
                "module A;\n" +
                "\n" +
                "# has some imports\n" +
                "import B;\n" +
                "import C.D as D;\n" +
                "import E.F.G as F.G;\n" +
                "\n" +
                "# and some syntax rules\n" +
                "A: 'Hello' NameWithoutX NewLine Message;\n" +
                "NameWithoutX: {'a'-'z' / 'x' <*};\n" +
                "\n" +
                "Message: {0> Sentence $ NewLine <3} Salutation;\n" +
                "Sentence: {\\u0020-\\u007E};\n" +
                "NewLine: \\u000A;\n" +
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
                new AttributesDescriptor("Line Comment", CFGSyntaxHighlighter.COMMENT),
                new AttributesDescriptor("Module Keyword", CFGSyntaxHighlighter.MODULE_DEF),
                new AttributesDescriptor("Import Keyword", CFGSyntaxHighlighter.IMPORT_DEF),
                new AttributesDescriptor("Alias Keyword", CFGSyntaxHighlighter.ALIAS_OP),
                new AttributesDescriptor("Identifier", CFGSyntaxHighlighter.ID),
                new AttributesDescriptor("Submodule Separator", CFGSyntaxHighlighter.SUB_MODULE_OP),
                new AttributesDescriptor("Rule Assignment Operator", CFGSyntaxHighlighter.RUL_OP),
                new AttributesDescriptor("Exclusion Operator", CFGSyntaxHighlighter.EXC_OP),
                new AttributesDescriptor("Alternative Operator", CFGSyntaxHighlighter.ALT_OP),
                new AttributesDescriptor("Range Operator", CFGSyntaxHighlighter.RNG_OP),
                new AttributesDescriptor("End of Definition", CFGSyntaxHighlighter.DEFINITION_END),
                new AttributesDescriptor("Group-open Parenthesis", CFGSyntaxHighlighter.GR_CLOSE),
                new AttributesDescriptor("Group-close Parenthesis", CFGSyntaxHighlighter.GR_OPEN),
                new AttributesDescriptor("Optional-open Bracket", CFGSyntaxHighlighter.OPT_OPEN),
                new AttributesDescriptor("Optional-close Bracket", CFGSyntaxHighlighter.OPT_CLOSE),
                new AttributesDescriptor("Repetition-close Brace", CFGSyntaxHighlighter.REP_CLOSE),
                new AttributesDescriptor("Repetition-open Brace", CFGSyntaxHighlighter.REP_OPEN),
                new AttributesDescriptor("Repetition Delimiter Indicator", CFGSyntaxHighlighter.REP_DELIM),
                new AttributesDescriptor("Repetition Min Indicator", CFGSyntaxHighlighter.REP_MIN_CLOSE),
                new AttributesDescriptor("Min Number", CFGSyntaxHighlighter.NATURAL_NUMBER),
                new AttributesDescriptor("Repetition Max Indicator", CFGSyntaxHighlighter.REP_MAX_OPEN),
                new AttributesDescriptor("Max Number", CFGSyntaxHighlighter.NON_ZERO_NATURAL_NUMBER),
                new AttributesDescriptor("Infinite", CFGSyntaxHighlighter.INFINITE),
                new AttributesDescriptor("String", CFGSyntaxHighlighter.STRING_TOK),
                new AttributesDescriptor("Unicode", CFGSyntaxHighlighter.UNICODE_TOK)
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
