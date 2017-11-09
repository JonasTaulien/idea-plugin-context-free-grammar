package codes.rudolph.idea.cfg.psi;

import codes.rudolph.idea.cfg.CfgLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CfgElementType extends IElementType {
    public CfgElementType(@NotNull @NonNls String debugName) {
        super(debugName, CfgLanguage.INSTANCE);
    }
}