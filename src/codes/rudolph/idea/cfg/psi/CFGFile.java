package codes.rudolph.idea.cfg.psi;

import codes.rudolph.idea.cfg.CFGFileType;
import codes.rudolph.idea.cfg.CFGLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class CFGFile extends PsiFileBase {
    public CFGFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CFGLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return CFGFileType.INSTANCE;
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