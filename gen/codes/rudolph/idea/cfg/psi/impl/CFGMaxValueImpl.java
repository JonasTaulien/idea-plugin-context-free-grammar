// This is a generated file. Not intended for manual editing.
package codes.rudolph.idea.cfg.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static codes.rudolph.idea.cfg.psi.CFGTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import codes.rudolph.idea.cfg.psi.*;

public class CFGMaxValueImpl extends ASTWrapperPsiElement implements CFGMaxValue {

  public CFGMaxValueImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CFGVisitor visitor) {
    visitor.visitMaxValue(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CFGVisitor) accept((CFGVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getNonZeroNaturalNumber() {
    return findChildByType(NON_ZERO_NATURAL_NUMBER);
  }

}
