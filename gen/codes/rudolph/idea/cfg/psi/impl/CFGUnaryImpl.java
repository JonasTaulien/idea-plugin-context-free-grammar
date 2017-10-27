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

public class CFGUnaryImpl extends ASTWrapperPsiElement implements CFGUnary {

  public CFGUnaryImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CFGVisitor visitor) {
    visitor.visitUnary(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CFGVisitor) accept((CFGVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CFGDelimitedRepetition getDelimitedRepetition() {
    return findChildByClass(CFGDelimitedRepetition.class);
  }

  @Override
  @Nullable
  public CFGFullQualifiedRuleOrModuleName getFullQualifiedRuleOrModuleName() {
    return findChildByClass(CFGFullQualifiedRuleOrModuleName.class);
  }

  @Override
  @Nullable
  public CFGGroup getGroup() {
    return findChildByClass(CFGGroup.class);
  }

  @Override
  @Nullable
  public CFGOptional getOptional() {
    return findChildByClass(CFGOptional.class);
  }

  @Override
  @Nullable
  public CFGTerminal getTerminal() {
    return findChildByClass(CFGTerminal.class);
  }

}
