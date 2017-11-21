package codes.rudolph.idea.cfgr;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class CfgrColorSettingsPage implements ColorSettingsPage {
    @Nullable
    @Override
    public Icon getIcon() {
        return CfgrIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new CfgrSyntaxHighlighter();
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
                new AttributesDescriptor("Line Comment", CfgrSyntaxHighlighter.COMMENT),
                new AttributesDescriptor("Module Keyword", CfgrSyntaxHighlighter.MODULE_DEF),
                new AttributesDescriptor("Import Keyword", CfgrSyntaxHighlighter.IMPORT_DEF),
                new AttributesDescriptor("Alias Keyword", CfgrSyntaxHighlighter.ALIAS_OP),
                new AttributesDescriptor("Identifier", CfgrSyntaxHighlighter.ID),
                new AttributesDescriptor("Submodule Separator", CfgrSyntaxHighlighter.SUB_MODULE_OP),
                new AttributesDescriptor("Rule Assignment Operator", CfgrSyntaxHighlighter.RUL_OP),
                new AttributesDescriptor("Exclusion Operator", CfgrSyntaxHighlighter.EXC_OP),
                new AttributesDescriptor("Alternative Operator", CfgrSyntaxHighlighter.ALT_OP),
                new AttributesDescriptor("Range Operator", CfgrSyntaxHighlighter.RNG_OP),
                new AttributesDescriptor("End of Definition", CfgrSyntaxHighlighter.DEFINITION_END),
                new AttributesDescriptor("Group-close Parenthesis", CfgrSyntaxHighlighter.GR_CLOSE),
                new AttributesDescriptor("Group-open Parenthesis", CfgrSyntaxHighlighter.GR_OPEN),
                new AttributesDescriptor("Optional-open Bracket", CfgrSyntaxHighlighter.OPT_OPEN),
                new AttributesDescriptor("Optional-close Bracket", CfgrSyntaxHighlighter.OPT_CLOSE),
                new AttributesDescriptor("Repetition-close Brace", CfgrSyntaxHighlighter.REP_CLOSE),
                new AttributesDescriptor("Repetition-open Brace", CfgrSyntaxHighlighter.REP_OPEN),
                new AttributesDescriptor("Repetition Delimiter Indicator", CfgrSyntaxHighlighter.REP_DELIM),
                new AttributesDescriptor("Repetition Min Indicator", CfgrSyntaxHighlighter.REP_MIN_CLOSE),
                new AttributesDescriptor("Min Number", CfgrSyntaxHighlighter.NATURAL_NUMBER),
                new AttributesDescriptor("Repetition Max Indicator", CfgrSyntaxHighlighter.REP_MAX_OPEN),
                new AttributesDescriptor("Max Number", CfgrSyntaxHighlighter.NON_ZERO_NATURAL_NUMBER),
                new AttributesDescriptor("Infinite", CfgrSyntaxHighlighter.INFINITE),
                new AttributesDescriptor("String", CfgrSyntaxHighlighter.MULTI_CHAR_STRING_TOK),
                new AttributesDescriptor("Character", CfgrSyntaxHighlighter.ONE_CHAR_STRING_TOK),
                new AttributesDescriptor("Unicode", CfgrSyntaxHighlighter.UNICODE_TOK)
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
