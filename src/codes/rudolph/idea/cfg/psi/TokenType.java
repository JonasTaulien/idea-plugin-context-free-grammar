package codes.rudolph.idea.cfg.psi;

import codes.rudolph.idea.cfg.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class TokenType extends IElementType {
    public TokenType(@NotNull @NonNls String debugName) {
        super(debugName, Language.INSTANCE);
    }

    @Override
    public String toString() {
        return "TokenType." + super.toString();
    }
}
