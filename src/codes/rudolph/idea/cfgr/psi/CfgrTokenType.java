package codes.rudolph.idea.cfgr.psi;

import codes.rudolph.idea.cfgr.CfgrLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CfgrTokenType extends IElementType {
    public CfgrTokenType(@NotNull @NonNls String debugName) {
        super(debugName, CfgrLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "CfgrTokenType." + super.toString();
    }
}
