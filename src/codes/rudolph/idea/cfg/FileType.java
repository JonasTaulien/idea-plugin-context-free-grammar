package codes.rudolph.idea.cfg;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class FileType extends LanguageFileType {
    public static final FileType INSTANCE = new FileType();


    private FileType() {
        super(Language.INSTANCE);
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
        return Icons.FILE;
    }
}
