// This is a generated file. Not intended for manual editing.
package codes.rudolph.idea.cfg.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static codes.rudolph.idea.cfg.psi.CFGTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CFGParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ALTERNATIVE) {
      r = Alternative(b, 0);
    }
    else if (t == DELIMITED_REPETITION) {
      r = DelimitedRepetition(b, 0);
    }
    else if (t == DELIMITER) {
      r = Delimiter(b, 0);
    }
    else if (t == EXCLUSION) {
      r = Exclusion(b, 0);
    }
    else if (t == EXPRESSION) {
      r = Expression(b, 0);
    }
    else if (t == FULL_QUALIFIED_RULE_OR_MODULE_NAME) {
      r = FullQualifiedRuleOrModuleName(b, 0);
    }
    else if (t == GROUP) {
      r = Group(b, 0);
    }
    else if (t == IMPORT_DEFINITION) {
      r = ImportDefinition(b, 0);
    }
    else if (t == MAX) {
      r = Max(b, 0);
    }
    else if (t == MAX_VALUE) {
      r = MaxValue(b, 0);
    }
    else if (t == MIN) {
      r = Min(b, 0);
    }
    else if (t == MODULE_DEFINITION) {
      r = ModuleDefinition(b, 0);
    }
    else if (t == OPTIONAL) {
      r = Optional(b, 0);
    }
    else if (t == RANGE) {
      r = Range(b, 0);
    }
    else if (t == RULE_DEFINITION) {
      r = RuleDefinition(b, 0);
    }
    else if (t == SEQUENCE) {
      r = Sequence(b, 0);
    }
    else if (t == TERMINAL) {
      r = Terminal(b, 0);
    }
    else if (t == UNARY) {
      r = Unary(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return ContextFreeGrammar(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ALTERNATIVE, DELIMITED_REPETITION, EXCLUSION, EXPRESSION,
      FULL_QUALIFIED_RULE_OR_MODULE_NAME, GROUP, OPTIONAL, RANGE,
      SEQUENCE, TERMINAL, UNARY),
  };

  /* ********************************************************** */
  // Sequence (ALT_OP Sequence)*
  public static boolean Alternative(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Alternative")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, ALTERNATIVE, "<alternative>");
    r = Sequence(b, l + 1);
    r = r && Alternative_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ALT_OP Sequence)*
  private static boolean Alternative_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Alternative_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Alternative_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Alternative_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ALT_OP Sequence
  private static boolean Alternative_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Alternative_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALT_OP);
    r = r && Sequence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COMMENT* ModuleDefinition (ImportDefinition | COMMENT)* (RuleDefinition | COMMENT)*
  static boolean ContextFreeGrammar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContextFreeGrammar")) return false;
    if (!nextTokenIs(b, "", COMMENT, MODULE_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ContextFreeGrammar_0(b, l + 1);
    r = r && ModuleDefinition(b, l + 1);
    r = r && ContextFreeGrammar_2(b, l + 1);
    r = r && ContextFreeGrammar_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT*
  private static boolean ContextFreeGrammar_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContextFreeGrammar_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, COMMENT)) break;
      if (!empty_element_parsed_guard_(b, "ContextFreeGrammar_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (ImportDefinition | COMMENT)*
  private static boolean ContextFreeGrammar_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContextFreeGrammar_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ContextFreeGrammar_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ContextFreeGrammar_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ImportDefinition | COMMENT
  private static boolean ContextFreeGrammar_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContextFreeGrammar_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImportDefinition(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (RuleDefinition | COMMENT)*
  private static boolean ContextFreeGrammar_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContextFreeGrammar_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ContextFreeGrammar_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ContextFreeGrammar_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // RuleDefinition | COMMENT
  private static boolean ContextFreeGrammar_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContextFreeGrammar_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RuleDefinition(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // REP_OPEN [Min] Expression [Delimiter] [Max] REP_CLOSE
  public static boolean DelimitedRepetition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DelimitedRepetition")) return false;
    if (!nextTokenIs(b, REP_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REP_OPEN);
    r = r && DelimitedRepetition_1(b, l + 1);
    r = r && Expression(b, l + 1);
    r = r && DelimitedRepetition_3(b, l + 1);
    r = r && DelimitedRepetition_4(b, l + 1);
    r = r && consumeToken(b, REP_CLOSE);
    exit_section_(b, m, DELIMITED_REPETITION, r);
    return r;
  }

  // [Min]
  private static boolean DelimitedRepetition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DelimitedRepetition_1")) return false;
    Min(b, l + 1);
    return true;
  }

  // [Delimiter]
  private static boolean DelimitedRepetition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DelimitedRepetition_3")) return false;
    Delimiter(b, l + 1);
    return true;
  }

  // [Max]
  private static boolean DelimitedRepetition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DelimitedRepetition_4")) return false;
    Max(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // REP_DELIM Expression
  public static boolean Delimiter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Delimiter")) return false;
    if (!nextTokenIs(b, REP_DELIM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REP_DELIM);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, DELIMITER, r);
    return r;
  }

  /* ********************************************************** */
  // Alternative [EXC_OP Alternative]
  public static boolean Exclusion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Exclusion")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXCLUSION, "<exclusion>");
    r = Alternative(b, l + 1);
    r = r && Exclusion_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [EXC_OP Alternative]
  private static boolean Exclusion_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Exclusion_1")) return false;
    Exclusion_1_0(b, l + 1);
    return true;
  }

  // EXC_OP Alternative
  private static boolean Exclusion_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Exclusion_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXC_OP);
    r = r && Alternative(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Exclusion
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPRESSION, "<expression>");
    r = Exclusion(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ID (SUB_MODULE_OP ID)*
  public static boolean FullQualifiedRuleOrModuleName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FullQualifiedRuleOrModuleName")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && FullQualifiedRuleOrModuleName_1(b, l + 1);
    exit_section_(b, m, FULL_QUALIFIED_RULE_OR_MODULE_NAME, r);
    return r;
  }

  // (SUB_MODULE_OP ID)*
  private static boolean FullQualifiedRuleOrModuleName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FullQualifiedRuleOrModuleName_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FullQualifiedRuleOrModuleName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FullQualifiedRuleOrModuleName_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SUB_MODULE_OP ID
  private static boolean FullQualifiedRuleOrModuleName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FullQualifiedRuleOrModuleName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SUB_MODULE_OP, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GR_OPEN Expression GR_CLOSE
  public static boolean Group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Group")) return false;
    if (!nextTokenIs(b, GR_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GR_OPEN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, GR_CLOSE);
    exit_section_(b, m, GROUP, r);
    return r;
  }

  /* ********************************************************** */
  // IMPORT_DEF FullQualifiedRuleOrModuleName [ALIAS_OP FullQualifiedRuleOrModuleName] DEFINITION_END
  public static boolean ImportDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDefinition")) return false;
    if (!nextTokenIs(b, IMPORT_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT_DEF);
    r = r && FullQualifiedRuleOrModuleName(b, l + 1);
    r = r && ImportDefinition_2(b, l + 1);
    r = r && consumeToken(b, DEFINITION_END);
    exit_section_(b, m, IMPORT_DEFINITION, r);
    return r;
  }

  // [ALIAS_OP FullQualifiedRuleOrModuleName]
  private static boolean ImportDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDefinition_2")) return false;
    ImportDefinition_2_0(b, l + 1);
    return true;
  }

  // ALIAS_OP FullQualifiedRuleOrModuleName
  private static boolean ImportDefinition_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDefinition_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALIAS_OP);
    r = r && FullQualifiedRuleOrModuleName(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // REP_MAX_OPEN MaxValue
  public static boolean Max(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Max")) return false;
    if (!nextTokenIs(b, REP_MAX_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REP_MAX_OPEN);
    r = r && MaxValue(b, l + 1);
    exit_section_(b, m, MAX, r);
    return r;
  }

  /* ********************************************************** */
  // NON_ZERO_NATURAL_NUMBER 
  //            | INFINITE
  public static boolean MaxValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxValue")) return false;
    if (!nextTokenIs(b, "<max value>", INFINITE, NON_ZERO_NATURAL_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MAX_VALUE, "<max value>");
    r = consumeToken(b, NON_ZERO_NATURAL_NUMBER);
    if (!r) r = consumeToken(b, INFINITE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NATURAL_NUMBER REP_MIN_CLOSE
  public static boolean Min(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Min")) return false;
    if (!nextTokenIs(b, NATURAL_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NATURAL_NUMBER, REP_MIN_CLOSE);
    exit_section_(b, m, MIN, r);
    return r;
  }

  /* ********************************************************** */
  // MODULE_DEF FullQualifiedRuleOrModuleName DEFINITION_END
  public static boolean ModuleDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDefinition")) return false;
    if (!nextTokenIs(b, MODULE_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MODULE_DEF);
    r = r && FullQualifiedRuleOrModuleName(b, l + 1);
    r = r && consumeToken(b, DEFINITION_END);
    exit_section_(b, m, MODULE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // OPT_OPEN Expression OPT_CLOSE
  public static boolean Optional(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Optional")) return false;
    if (!nextTokenIs(b, OPT_OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPT_OPEN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, OPT_CLOSE);
    exit_section_(b, m, OPTIONAL, r);
    return r;
  }

  /* ********************************************************** */
  // Unary [RNG_OP Unary]
  public static boolean Range(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Range")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, RANGE, "<range>");
    r = Unary(b, l + 1);
    r = r && Range_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [RNG_OP Unary]
  private static boolean Range_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Range_1")) return false;
    Range_1_0(b, l + 1);
    return true;
  }

  // RNG_OP Unary
  private static boolean Range_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Range_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RNG_OP);
    r = r && Unary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID RUL_OP Expression DEFINITION_END
  public static boolean RuleDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RuleDefinition")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, RUL_OP);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, DEFINITION_END);
    exit_section_(b, m, RULE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // Range+
  public static boolean Sequence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Sequence")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, SEQUENCE, "<sequence>");
    r = Range(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!Range(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Sequence", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING
  //            | UNICODE
  public static boolean Terminal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Terminal")) return false;
    if (!nextTokenIs(b, "<terminal>", STRING, UNICODE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERMINAL, "<terminal>");
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, UNICODE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Terminal
  //         | FullQualifiedRuleOrModuleName
  //         | Optional
  //         | DelimitedRepetition
  //         | Group
  public static boolean Unary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Unary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, UNARY, "<unary>");
    r = Terminal(b, l + 1);
    if (!r) r = FullQualifiedRuleOrModuleName(b, l + 1);
    if (!r) r = Optional(b, l + 1);
    if (!r) r = DelimitedRepetition(b, l + 1);
    if (!r) r = Group(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
