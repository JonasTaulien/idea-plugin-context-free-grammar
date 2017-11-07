package codes.rudolph.idea.cfg;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static codes.rudolph.idea.cfg.psi.CFGTypes.*;

%%

%{
  public CFGLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class CFGLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

WHITE_SPACE=\s+

COMMENT=#[^\r\n]*
UNICODE=\\u[0-9A-Fa-f]{4}
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
NATURAL_NUMBER=(0|[1-9][0-9]*)
NON_ZERO_NATURAL_NUMBER=[1-9][0-9]*
ID=[A-Za-z_][A-Za-z_0-9]*

%state NON_ZERO_NATURAL_NUMBER_IS_FOLLOWING
%%
<YYINITIAL> {
  {WHITE_SPACE}                  { return WHITE_SPACE; }

  "module"                       { return MODULE_DEF; }
  "import"                       { return IMPORT_DEF; }
  "as"                           { return ALIAS_OP; }
  ":"                            { return RUL_OP; }
  "."                            { return SUB_MODULE_OP; }
  "-"                            { return RNG_OP; }
  "|"                            { return ALT_OP; }
  "/"                            { return EXC_OP; }
  "("                            { return GR_OPEN; }
  ")"                            { return GR_CLOSE; }
  "["                            { return OPT_OPEN; }
  "]"                            { return OPT_CLOSE; }
  "{"                            { return REP_OPEN; }
  "}"                            { return REP_CLOSE; }
  ">"                            { return REP_MIN_CLOSE; }
  "<"                            { yybegin(NON_ZERO_NATURAL_NUMBER_IS_FOLLOWING); return REP_MAX_OPEN; }
  "$"                            { return REP_DELIM; }
  "*"                            { return INFINITE; }
  ";"                            { return DEFINITION_END; }

  {COMMENT}                      { return COMMENT; }
  {UNICODE}                      { return UNICODE; }
  {STRING}                       { return STRING; }
  {NATURAL_NUMBER}               { return NATURAL_NUMBER; }
  {ID}                           { return ID; }
}


<NON_ZERO_NATURAL_NUMBER_IS_FOLLOWING> {
  {NON_ZERO_NATURAL_NUMBER}    { yybegin(YYINITIAL); return NON_ZERO_NATURAL_NUMBER; }
}

[^] { return BAD_CHARACTER; }
