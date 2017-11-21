package codes.rudolph.idea.cfgr.psi;

import codes.rudolph.idea.cfgr.CfgrFileType;
import codes.rudolph.idea.cfgr.CfgrLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class CfgrFile extends PsiFileBase {
    public CfgrFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CfgrLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return CfgrFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Context Free Grammar";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}