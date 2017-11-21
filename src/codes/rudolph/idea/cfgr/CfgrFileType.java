package codes.rudolph.idea.cfgr;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class CfgrFileType extends LanguageFileType {
    public static final CfgrFileType INSTANCE = new CfgrFileType();


    private CfgrFileType() {
        super(CfgrLanguage.INSTANCE);
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
        return "cfgr";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return CfgrIcons.FILE;
    }
}
