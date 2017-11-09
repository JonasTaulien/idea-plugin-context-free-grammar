package codes.rudolph.idea.cfg.psi;

import codes.rudolph.idea.cfg.CfgFileType;
import codes.rudolph.idea.cfg.CfgLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class CfgFile extends PsiFileBase {
    public CfgFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CfgLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return CfgFileType.INSTANCE;
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