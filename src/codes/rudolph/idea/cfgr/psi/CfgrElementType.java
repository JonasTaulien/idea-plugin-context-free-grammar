package codes.rudolph.idea.cfgr.psi;

import codes.rudolph.idea.cfgr.CfgrLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CfgrElementType extends IElementType {
    public CfgrElementType(@NotNull @NonNls String debugName) {
        super(debugName, CfgrLanguage.INSTANCE);
    }
}