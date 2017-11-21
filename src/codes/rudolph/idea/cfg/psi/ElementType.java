package codes.rudolph.idea.cfg.psi;

import codes.rudolph.idea.cfg.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class ElementType extends IElementType {
    public ElementType(@NotNull @NonNls String debugName) {
        super(debugName, Language.INSTANCE);
    }
}