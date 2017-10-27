package codes.rudolph.idea.cfg.psi;

import codes.rudolph.idea.cfg.CFGLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CFGTokenType extends IElementType {
    public CFGTokenType(@NotNull @NonNls String debugName) {
        super(debugName, CFGLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "CFGTokenType." + super.toString();
    }
}
