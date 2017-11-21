package codes.rudolph.idea.cfgr.psi;

import codes.rudolph.idea.cfgr.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ElementType extends IElementType {
    public ElementType(@NotNull @NonNls String debugName) {
        super(debugName, Language.INSTANCE);
    }
}