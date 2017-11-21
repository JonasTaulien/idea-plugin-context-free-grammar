package codes.rudolph.idea.cfgr;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SyntaxHighlighterFactory extends com.intellij.openapi.fileTypes.SyntaxHighlighterFactory {
    @NotNull
    @Override
    public com.intellij.openapi.fileTypes.SyntaxHighlighter getSyntaxHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile) {
        return new SyntaxHighlighter();
    }
}
