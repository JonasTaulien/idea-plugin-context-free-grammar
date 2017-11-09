package codes.rudolph.idea.cfg;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class CfgFileType extends LanguageFileType {
    public static final CfgFileType INSTANCE = new CfgFileType();


    private CfgFileType() {
        super(CfgLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Context Free Grammar";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Context Free Grammar file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "cfg";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return CfgIcons.FILE;
    }
}
