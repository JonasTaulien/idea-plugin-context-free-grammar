// This is a generated file. Not intended for manual editing.
package codes.rudolph.idea.cfg.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class CFGVisitor extends PsiElementVisitor {

  public void visitAlternative(@NotNull CFGAlternative o) {
    visitExpression(o);
  }

  public void visitDelimitedRepetition(@NotNull CFGDelimitedRepetition o) {
    visitUnary(o);
  }

  public void visitDelimiter(@NotNull CFGDelimiter o) {
    visitPsiElement(o);
  }

  public void visitExclusion(@NotNull CFGExclusion o) {
    visitExpression(o);
  }

  public void visitExpression(@NotNull CFGExpression o) {
    visitPsiElement(o);
  }

  public void visitFullQualifiedRuleOrModuleName(@NotNull CFGFullQualifiedRuleOrModuleName o) {
    visitUnary(o);
  }

  public void visitGroup(@NotNull CFGGroup o) {
    visitUnary(o);
  }

  public void visitImportDefinition(@NotNull CFGImportDefinition o) {
    visitPsiElement(o);
  }

  public void visitMax(@NotNull CFGMax o) {
    visitPsiElement(o);
  }

  public void visitMaxValue(@NotNull CFGMaxValue o) {
    visitPsiElement(o);
  }

  public void visitMaxValueInfinite(@NotNull CFGMaxValueInfinite o) {
    visitMaxValue(o);
  }

  public void visitMaxValueNumber(@NotNull CFGMaxValueNumber o) {
    visitMaxValue(o);
  }

  public void visitMin(@NotNull CFGMin o) {
    visitPsiElement(o);
  }

  public void visitModuleDefinition(@NotNull CFGModuleDefinition o) {
    visitPsiElement(o);
  }

  public void visitOptional(@NotNull CFGOptional o) {
    visitUnary(o);
  }

  public void visitRange(@NotNull CFGRange o) {
    visitExpression(o);
  }

  public void visitRuleDefinition(@NotNull CFGRuleDefinition o) {
    visitPsiElement(o);
  }

  public void visitSequence(@NotNull CFGSequence o) {
    visitExpression(o);
  }

  public void visitString(@NotNull CFGString o) {
    visitTerminal(o);
  }

  public void visitTerminal(@NotNull CFGTerminal o) {
    visitUnary(o);
  }

  public void visitUnary(@NotNull CFGUnary o) {
    visitExpression(o);
  }

  public void visitUnicode(@NotNull CFGUnicode o) {
    visitTerminal(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
