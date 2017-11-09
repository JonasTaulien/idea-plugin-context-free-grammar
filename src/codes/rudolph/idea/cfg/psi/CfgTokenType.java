package codes.rudolph.idea.cfg.psi;

import codes.rudolph.idea.cfg.CfgLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CfgTokenType extends IElementType {
    public CfgTokenType(@NotNull @NonNls String debugName) {
        super(debugName, CfgLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "CfgTokenType." + super.toString();
    }
}
