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
    else if (t == MAX_VALUE_INFINITE) {
      r = MaxValueInfinite(b, 0);
    }
    else if (t == MAX_VALUE_NUMBER) {
      r = MaxValueNumber(b, 0);
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
    else if (t == STRING) {
      r = String(b, 0);
    }
    else if (t == TERMINAL) {
      r = Terminal(b, 0);
    }
    else if (t == UNARY) {
      r = Unary(b, 0);
    }
    else if (t == UNICODE) {
      r = Unicode(b, 0);
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
    create_token_set_(MAX_VALUE, MAX_VALUE_INFINITE, MAX_VALUE_NUMBER),
    create_token_set_(ALTERNATIVE, DELIMITED_REPETITION, EXCLUSION, EXPRESSION,
      FULL_QUALIFIED_RULE_OR_MODULE_NAME, GROUP, OPTIONAL, RANGE,
      SEQUENCE, STRING, TERMINAL, UNARY,
      UNICODE),
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, ALT_OP);
    p = r; // pin = ALT_OP
    r = r && Sequence(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DELIMITED_REPETITION, null);
    r = consumeToken(b, REP_OPEN);
    p = r; // pin = REP_OPEN
    r = r && report_error_(b, DelimitedRepetition_1(b, l + 1));
    r = p && report_error_(b, Expression(b, l + 1)) && r;
    r = p && report_error_(b, DelimitedRepetition_3(b, l + 1)) && r;
    r = p && report_error_(b, DelimitedRepetition_4(b, l + 1)) && r;
    r = p && consumeToken(b, REP_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DELIMITER, null);
    r = consumeToken(b, REP_DELIM);
    p = r; // pin = REP_DELIM
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, EXC_OP);
    p = r; // pin = EXC_OP
    r = r && Alternative(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeTokens(b, 1, SUB_MODULE_OP, ID);
    p = r; // pin = SUB_MODULE_OP
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // GR_OPEN Expression GR_CLOSE
  public static boolean Group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Group")) return false;
    if (!nextTokenIs(b, GR_OPEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, GROUP, null);
    r = consumeToken(b, GR_OPEN);
    p = r; // pin = GR_OPEN
    r = r && report_error_(b, Expression(b, l + 1));
    r = p && consumeToken(b, GR_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // IMPORT_DEF FullQualifiedRuleOrModuleName [ALIAS_OP FullQualifiedRuleOrModuleName] DEFINITION_END
  public static boolean ImportDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImportDefinition")) return false;
    if (!nextTokenIs(b, IMPORT_DEF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_DEFINITION, null);
    r = consumeToken(b, IMPORT_DEF);
    p = r; // pin = IMPORT_DEF
    r = r && report_error_(b, FullQualifiedRuleOrModuleName(b, l + 1));
    r = p && report_error_(b, ImportDefinition_2(b, l + 1)) && r;
    r = p && consumeToken(b, DEFINITION_END) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MAX, null);
    r = consumeToken(b, REP_MAX_OPEN);
    p = r; // pin = REP_MAX_OPEN
    r = r && MaxValue(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // MaxValueNumber
  //            | MaxValueInfinite
  public static boolean MaxValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxValue")) return false;
    if (!nextTokenIs(b, "<max value>", INFINITE, NON_ZERO_NATURAL_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, MAX_VALUE, "<max value>");
    r = MaxValueNumber(b, l + 1);
    if (!r) r = MaxValueInfinite(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INFINITE
  public static boolean MaxValueInfinite(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxValueInfinite")) return false;
    if (!nextTokenIs(b, INFINITE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INFINITE);
    exit_section_(b, m, MAX_VALUE_INFINITE, r);
    return r;
  }

  /* ********************************************************** */
  // NON_ZERO_NATURAL_NUMBER
  public static boolean MaxValueNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MaxValueNumber")) return false;
    if (!nextTokenIs(b, NON_ZERO_NATURAL_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NON_ZERO_NATURAL_NUMBER);
    exit_section_(b, m, MAX_VALUE_NUMBER, r);
    return r;
  }

  /* ********************************************************** */
  // NATURAL_NUMBER REP_MIN_CLOSE
  public static boolean Min(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Min")) return false;
    if (!nextTokenIs(b, NATURAL_NUMBER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MIN, null);
    r = consumeTokens(b, 1, NATURAL_NUMBER, REP_MIN_CLOSE);
    p = r; // pin = NATURAL_NUMBER
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // MODULE_DEF FullQualifiedRuleOrModuleName DEFINITION_END
  public static boolean ModuleDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleDefinition")) return false;
    if (!nextTokenIs(b, MODULE_DEF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MODULE_DEFINITION, null);
    r = consumeToken(b, MODULE_DEF);
    p = r; // pin = MODULE_DEF
    r = r && report_error_(b, FullQualifiedRuleOrModuleName(b, l + 1));
    r = p && consumeToken(b, DEFINITION_END) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // OPT_OPEN Expression OPT_CLOSE
  public static boolean Optional(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Optional")) return false;
    if (!nextTokenIs(b, OPT_OPEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, OPTIONAL, null);
    r = consumeToken(b, OPT_OPEN);
    p = r; // pin = OPT_OPEN
    r = r && report_error_(b, Expression(b, l + 1));
    r = p && consumeToken(b, OPT_CLOSE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, RNG_OP);
    p = r; // pin = RNG_OP
    r = r && Unary(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ID RUL_OP Expression DEFINITION_END
  public static boolean RuleDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RuleDefinition")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RULE_DEFINITION, null);
    r = consumeTokens(b, 2, ID, RUL_OP);
    p = r; // pin = RUL_OP
    r = r && report_error_(b, Expression(b, l + 1));
    r = p && consumeToken(b, DEFINITION_END) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // STRING_TOK
  public static boolean String(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "String")) return false;
    if (!nextTokenIs(b, STRING_TOK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_TOK);
    exit_section_(b, m, STRING, r);
    return r;
  }

  /* ********************************************************** */
  // String
  //            | Unicode
  public static boolean Terminal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Terminal")) return false;
    if (!nextTokenIs(b, "<terminal>", STRING_TOK, UNICODE_TOK)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, TERMINAL, "<terminal>");
    r = String(b, l + 1);
    if (!r) r = Unicode(b, l + 1);
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

  /* ********************************************************** */
  // UNICODE_TOK
  public static boolean Unicode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Unicode")) return false;
    if (!nextTokenIs(b, UNICODE_TOK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNICODE_TOK);
    exit_section_(b, m, UNICODE, r);
    return r;
  }

}
