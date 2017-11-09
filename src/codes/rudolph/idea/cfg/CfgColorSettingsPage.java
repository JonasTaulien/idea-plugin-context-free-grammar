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

public class CfgColorSettingsPage implements ColorSettingsPage {
    @Nullable
    @Override
    public Icon getIcon() {
        return CfgIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new CfgSyntaxHighlighter();
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
                new AttributesDescriptor("Line Comment", CfgSyntaxHighlighter.COMMENT),
                new AttributesDescriptor("Module Keyword", CfgSyntaxHighlighter.MODULE_DEF),
                new AttributesDescriptor("Import Keyword", CfgSyntaxHighlighter.IMPORT_DEF),
                new AttributesDescriptor("Alias Keyword", CfgSyntaxHighlighter.ALIAS_OP),
                new AttributesDescriptor("Identifier", CfgSyntaxHighlighter.ID),
                new AttributesDescriptor("Submodule Separator", CfgSyntaxHighlighter.SUB_MODULE_OP),
                new AttributesDescriptor("Rule Assignment Operator", CfgSyntaxHighlighter.RUL_OP),
                new AttributesDescriptor("Exclusion Operator", CfgSyntaxHighlighter.EXC_OP),
                new AttributesDescriptor("Alternative Operator", CfgSyntaxHighlighter.ALT_OP),
                new AttributesDescriptor("Range Operator", CfgSyntaxHighlighter.RNG_OP),
                new AttributesDescriptor("End of Definition", CfgSyntaxHighlighter.DEFINITION_END),
                new AttributesDescriptor("Group-close Parenthesis", CfgSyntaxHighlighter.GR_CLOSE),
                new AttributesDescriptor("Group-open Parenthesis", CfgSyntaxHighlighter.GR_OPEN),
                new AttributesDescriptor("Optional-open Bracket", CfgSyntaxHighlighter.OPT_OPEN),
                new AttributesDescriptor("Optional-close Bracket", CfgSyntaxHighlighter.OPT_CLOSE),
                new AttributesDescriptor("Repetition-close Brace", CfgSyntaxHighlighter.REP_CLOSE),
                new AttributesDescriptor("Repetition-open Brace", CfgSyntaxHighlighter.REP_OPEN),
                new AttributesDescriptor("Repetition Delimiter Indicator", CfgSyntaxHighlighter.REP_DELIM),
                new AttributesDescriptor("Repetition Min Indicator", CfgSyntaxHighlighter.REP_MIN_CLOSE),
                new AttributesDescriptor("Min Number", CfgSyntaxHighlighter.NATURAL_NUMBER),
                new AttributesDescriptor("Repetition Max Indicator", CfgSyntaxHighlighter.REP_MAX_OPEN),
                new AttributesDescriptor("Max Number", CfgSyntaxHighlighter.NON_ZERO_NATURAL_NUMBER),
                new AttributesDescriptor("Infinite", CfgSyntaxHighlighter.INFINITE),
                new AttributesDescriptor("String", CfgSyntaxHighlighter.MULTI_CHAR_STRING_TOK),
                new AttributesDescriptor("Character", CfgSyntaxHighlighter.ONE_CHAR_STRING_TOK),
                new AttributesDescriptor("Unicode", CfgSyntaxHighlighter.UNICODE_TOK)
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
