// This is a generated file. Not intended for manual editing.
package codes.rudolph.idea.cfg.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import codes.rudolph.idea.cfg.psi.impl.*;

public interface CFGTypes {

  IElementType ALTERNATIVE = new CFGElementType("ALTERNATIVE");
  IElementType ALTERNATIVE_X = new CFGElementType("ALTERNATIVE_X");
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
  IElementType RANGE_X = new CFGElementType("RANGE_X");
  IElementType RULE_DEFINITION = new CFGElementType("RULE_DEFINITION");
  IElementType SEQUENCE = new CFGElementType("SEQUENCE");
  IElementType SEQUENCE_X = new CFGElementType("SEQUENCE_X");
  IElementType TERMINAL = new CFGElementType("TERMINAL");
  IElementType UNARY = new CFGElementType("UNARY");

  IElementType ALIAS_OP = new CFGTokenType("ALIAS_OP");
  IElementType ALTERNATIVE_1_0 = new CFGTokenType("Alternative_1_0");
  IElementType ALT_OP = new CFGTokenType("ALT_OP");
  IElementType COMMENT = new CFGTokenType("COMMENT");
  IElementType DEFINITION_END = new CFGTokenType("DEFINITION_END");
  IElementType EXCLUSION_1_0 = new CFGTokenType("Exclusion_1_0");
  IElementType EXC_OP = new CFGTokenType("EXC_OP");
  IElementType GR_CLOSE = new CFGTokenType("GR_CLOSE");
  IElementType GR_OPEN = new CFGTokenType("GR_OPEN");
  IElementType IMPORT_DEF = new CFGTokenType("IMPORT_DEF");
  IElementType INFINITE = new CFGTokenType("INFINITE");
  IElementType MODULE_DEF = new CFGTokenType("MODULE_DEF");
  IElementType NAME = new CFGTokenType("NAME");
  IElementType NATURAL_NUMBER = new CFGTokenType("NATURAL_NUMBER");
  IElementType NON_ZERO_NATURAL_NUMBER = new CFGTokenType("NON_ZERO_NATURAL_NUMBER");
  IElementType OPT_CLOSE = new CFGTokenType("OPT_CLOSE");
  IElementType OPT_OPEN = new CFGTokenType("OPT_OPEN");
  IElementType RANGE_1_0 = new CFGTokenType("Range_1_0");
  IElementType REP_CLOSE = new CFGTokenType("REP_CLOSE");
  IElementType REP_DELIM = new CFGTokenType("REP_DELIM");
  IElementType REP_MAX_OPEN = new CFGTokenType("REP_MAX_OPEN");
  IElementType REP_MIN_CLOSE = new CFGTokenType("REP_MIN_CLOSE");
  IElementType REP_OPEN = new CFGTokenType("REP_OPEN");
  IElementType RNG_OP = new CFGTokenType("RNG_OP");
  IElementType RUL_OP = new CFGTokenType("RUL_OP");
  IElementType SEQUENCE_1_0 = new CFGTokenType("Sequence_1_0");
  IElementType SEQ_OP = new CFGTokenType("SEQ_OP");
  IElementType STRING = new CFGTokenType("STRING");
  IElementType SUB_MODULE_OP = new CFGTokenType("SUB_MODULE_OP");
  IElementType UNICODE = new CFGTokenType("UNICODE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ALTERNATIVE) {
        return new CFGAlternativeImpl(node);
      }
      else if (type == ALTERNATIVE_X) {
        return new CFGAlternativeXImpl(node);
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
      else if (type == EXPRESSION) {
        return new CFGExpressionImpl(node);
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
      else if (type == RANGE_X) {
        return new CFGRangeXImpl(node);
      }
      else if (type == RULE_DEFINITION) {
        return new CFGRuleDefinitionImpl(node);
      }
      else if (type == SEQUENCE) {
        return new CFGSequenceImpl(node);
      }
      else if (type == SEQUENCE_X) {
        return new CFGSequenceXImpl(node);
      }
      else if (type == TERMINAL) {
        return new CFGTerminalImpl(node);
      }
      else if (type == UNARY) {
        return new CFGUnaryImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
