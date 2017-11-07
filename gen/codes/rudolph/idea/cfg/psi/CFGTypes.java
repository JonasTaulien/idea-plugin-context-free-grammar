// This is a generated file. Not intended for manual editing.
package codes.rudolph.idea.cfg.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import codes.rudolph.idea.cfg.psi.impl.*;

public interface CFGTypes {

  IElementType ALTERNATIVE = new CFGElementType("ALTERNATIVE");
  IElementType DELIMITED_REPETITION = new CFGElementType("DELIMITED_REPETITION");
  IElementType DELIMITER = new CFGElementType("DELIMITER");
  IElementType EXCLUSION = new CFGElementType("EXCLUSION");
  IElementType EXPRESSION = new CFGElementType("EXPRESSION");
  IElementType FULL_QUALIFIED_RULE_OR_MODULE_NAME = new CFGElementType("FULL_QUALIFIED_RULE_OR_MODULE_NAME");
  IElementType GROUP = new CFGElementType("GROUP");
  IElementType IMPORT_DEFINITION = new CFGElementType("IMPORT_DEFINITION");
  IElementType MAX = new CFGElementType("MAX");
  IElementType MAX_VALUE = new CFGElementType("MAX_VALUE");
  IElementType MIN = new CFGElementType("MIN");
  IElementType MODULE_DEFINITION = new CFGElementType("MODULE_DEFINITION");
  IElementType OPTIONAL = new CFGElementType("OPTIONAL");
  IElementType RANGE = new CFGElementType("RANGE");
  IElementType RULE_DEFINITION = new CFGElementType("RULE_DEFINITION");
  IElementType SEQUENCE = new CFGElementType("SEQUENCE");
  IElementType TERMINAL = new CFGElementType("TERMINAL");
  IElementType UNARY = new CFGElementType("UNARY");

  IElementType ALIAS_OP = new CFGTokenType("as");
  IElementType ALT_OP = new CFGTokenType("|");
  IElementType COMMENT = new CFGTokenType("COMMENT");
  IElementType DEFINITION_END = new CFGTokenType(";");
  IElementType EXC_OP = new CFGTokenType("/");
  IElementType GR_CLOSE = new CFGTokenType(")");
  IElementType GR_OPEN = new CFGTokenType("(");
  IElementType ID = new CFGTokenType("ID");
  IElementType IMPORT_DEF = new CFGTokenType("import");
  IElementType INFINITE = new CFGTokenType("*");
  IElementType MODULE_DEF = new CFGTokenType("module");
  IElementType NATURAL_NUMBER = new CFGTokenType("NATURAL_NUMBER");
  IElementType NON_ZERO_NATURAL_NUMBER = new CFGTokenType("NON_ZERO_NATURAL_NUMBER");
  IElementType OPT_CLOSE = new CFGTokenType("]");
  IElementType OPT_OPEN = new CFGTokenType("[");
  IElementType REP_CLOSE = new CFGTokenType("}");
  IElementType REP_DELIM = new CFGTokenType("$");
  IElementType REP_MAX_OPEN = new CFGTokenType("<");
  IElementType REP_MIN_CLOSE = new CFGTokenType(">");
  IElementType REP_OPEN = new CFGTokenType("{");
  IElementType RNG_OP = new CFGTokenType("-");
  IElementType RUL_OP = new CFGTokenType(":");
  IElementType STRING = new CFGTokenType("STRING");
  IElementType SUB_MODULE_OP = new CFGTokenType(".");
  IElementType UNICODE = new CFGTokenType("UNICODE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ALTERNATIVE) {
        return new CFGAlternativeImpl(node);
      }
      else if (type == DELIMITED_REPETITION) {
        return new CFGDelimitedRepetitionImpl(node);
      }
      else if (type == DELIMITER) {
        return new CFGDelimiterImpl(node);
      }
      else if (type == EXCLUSION) {
        return new CFGExclusionImpl(node);
      }
      else if (type == FULL_QUALIFIED_RULE_OR_MODULE_NAME) {
        return new CFGFullQualifiedRuleOrModuleNameImpl(node);
      }
      else if (type == GROUP) {
        return new CFGGroupImpl(node);
      }
      else if (type == IMPORT_DEFINITION) {
        return new CFGImportDefinitionImpl(node);
      }
      else if (type == MAX) {
        return new CFGMaxImpl(node);
      }
      else if (type == MAX_VALUE) {
        return new CFGMaxValueImpl(node);
      }
      else if (type == MIN) {
        return new CFGMinImpl(node);
      }
      else if (type == MODULE_DEFINITION) {
        return new CFGModuleDefinitionImpl(node);
      }
      else if (type == OPTIONAL) {
        return new CFGOptionalImpl(node);
      }
      else if (type == RANGE) {
        return new CFGRangeImpl(node);
      }
      else if (type == RULE_DEFINITION) {
        return new CFGRuleDefinitionImpl(node);
      }
      else if (type == SEQUENCE) {
        return new CFGSequenceImpl(node);
      }
      else if (type == TERMINAL) {
        return new CFGTerminalImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
