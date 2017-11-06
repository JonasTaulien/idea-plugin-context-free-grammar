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

COMMENT="#"[^\r\n]*

RUL_OP=":"
SUB_MODULE_OP=[.]
RNG_OP="-"
ALT_OP="|"
EXC_OP="/"
SEQ_OP=\s+

GR_OPEN="("
GR_CLOSE=")"

OPT_OPEN="["
OPT_CLOSE="]"

REP_OPEN="{"
REP_CLOSE="}"
REP_MIN_CLOSE=">"
REP_MAX_OPEN="<"
REP_DELIM="$"
INFINITE="*"
DEFINITION_END=";"

UNICODE="\\u"[0-9A-Fa-f]{4}
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
NATURAL_NUMBER=(0|[1-9][0-9]*)
NON_ZERO_NATURAL_NUMBER=[1-9][0-9]*
NAME=[A-Za-z_][A-Za-z_0-9]*

WHITE_SPACE=\s+

MODULE_DEF="module"
IMPORT_DEF="import"
ALIAS_OP="as"

%state NON_ZERO_NATURAL_NUMBER_IS_FOLLOWING
%%
<YYINITIAL> {
  {WHITE_SPACE}                { return WHITE_SPACE; }

  {COMMENT}                    { return COMMENT; }
  {MODULE_DEF}                 { return MODULE_DEF; }
  {DEFINITION_END}             { return DEFINITION_END; }
  {IMPORT_DEF}                 { return IMPORT_DEF; }
  {ALIAS_OP}                   { return ALIAS_OP; }
  {NAME}                       { return NAME; }
  {RUL_OP}                     { return RUL_OP; }
  {SUB_MODULE_OP}              { return SUB_MODULE_OP; }
  {EXC_OP}                     { return EXC_OP; }
  {SEQ_OP}                     { return SEQ_OP; }
  {ALT_OP}                     { return ALT_OP; }
  {RNG_OP}                     { return RNG_OP; }
  {STRING}                     { return STRING; }
  {UNICODE}                    { return UNICODE; }
  {OPT_OPEN}                   { return OPT_OPEN; }
  {OPT_CLOSE}                  { return OPT_CLOSE; }
  {REP_OPEN}                   { return REP_OPEN; }
  {REP_CLOSE}                  { return REP_CLOSE; }
  {NATURAL_NUMBER}             { return NATURAL_NUMBER; }
  {REP_MIN_CLOSE}              { return REP_MIN_CLOSE; }
  {REP_DELIM}                  { return REP_DELIM; }
  {REP_MAX_OPEN}               { yybegin(NON_ZERO_NATURAL_NUMBER_IS_FOLLOWING); return REP_MAX_OPEN; }
  {INFINITE}                   { return INFINITE; }
  {GR_OPEN}                    { return GR_OPEN; }
  {GR_CLOSE}                   { return GR_CLOSE; }
}

<NON_ZERO_NATURAL_NUMBER_IS_FOLLOWING> {
  {NON_ZERO_NATURAL_NUMBER}    { yybegin(YYINITIAL); return NON_ZERO_NATURAL_NUMBER; }
}

[^] { return BAD_CHARACTER; }
