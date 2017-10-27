package codes.rudolph.idea.cfg.psi;

import codes.rudolph.idea.cfg.CFGLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CFGElementType extends IElementType {
    public CFGElementType(@NotNull @NonNls String debugName) {
        super(debugName, CFGLanguage.INSTANCE);
    }
}