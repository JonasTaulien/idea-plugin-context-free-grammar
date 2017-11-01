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

%state IN_MODULE_DEF

%state SUBMODULE_OR_END
%state SUBMODULE

%state IN_IMPORT_DEF
%state SUBIMPORT_OR_ALIAS_OR_END
%state SUBIMPORT
%state ALIAS

%state IN_RULE_DEF

%state EXPRESSION
%%

<YYINITIAL> {
  {COMMENT}                    { return COMMENT; }
  {MODULE_DEF}                 { yybegin(IN_MODULE_DEF); return MODULE_DEF; }
  {IMPORT_DEF}                 { yybegin(IN_IMPORT_DEF); return IMPORT_DEF; } 
  {NAME}                       { yybegin(IN_RULE_DEF); return NAME; }
  
//  {RUL_OP}                     { return RUL_OP; }
//  {RNG_OP}                     { return RNG_OP; }
//  {ALT_OP}                     { return ALT_OP; }
//  {EXC_OP}                     { return EXC_OP; }
//  {GR_OPEN}                    { return GR_OPEN; }
//  {GR_CLOSE}                   { return GR_CLOSE; }
//  {STRING}                     { return STRING; }
//  {UNICODE}                    { return UNICODE; }
//  {OPT_OPEN}                   { return OPT_OPEN; }
//  {OPT_CLOSE}                  { return OPT_CLOSE; }
//  {REP_OPEN}                   { return REP_OPEN; }
//  {REP_DELIM}                  { return REP_DELIM; }
//  {REP_CLOSE}                  { return REP_CLOSE; }
//  {NATURAL_NUMBER}             { return NATURAL_NUMBER; }
//  {REP_MIN_CLOSE}              { return REP_MIN_CLOSE; }
//  {REP_MAX_OPEN}               { return REP_MAX_OPEN; }
//  {NON_ZERO_NATURAL_NUMBER}    { return NON_ZERO_NATURAL_NUMBER; }
//  {INFINITE}                   { return INFINITE; }
}

<IN_MODULE_DEF> {
  {NAME}                       { yybegin(SUBMODULE_OR_END); return NAME; }  
}

<SUBMODULE_OR_END> {
  {SUB_MODULE_OP}              { yybegin(SUBMODULE); return SUB_MODULE_OP; }
  {DEFINITION_END}             { yybegin(YYINITIAL); return DEFINITION_END; }
}

<SUBMODULE> {
  {NAME}                       { yybegin(SUBMODULE_OR_END); return NAME; }  
}

<IN_IMPORT_DEF> {
  {NAME}                       { yybegin(SUBIMPORT_OR_ALIAS_OR_END); return NAME; }
}

<SUBIMPORT_OR_ALIAS_OR_END> {
  {SUB_MODULE_OP}              { yybegin(SUBIMPORT); return SUB_MODULE_OP; }
  {ALIAS_OP}                   { yybegin(ALIAS); return ALIAS_OP; }
  {DEFINITION_END}             { yybegin(YYINITIAL); return DEFINITION_END; }
}

<SUBIMPORT> {
  {NAME}                       { yybegin(SUBIMPORT_OR_ALIAS_OR_END); return NAME; }  
}

<ALIAS> {
  {NAME}                       { yybegin(SUBMODULE_OR_END); return NAME; }
}

<IN_RULE_DEF> {
  {RUL_OP}                     { yybegin(EXPRESSION); return RUL_OP; }
}

<EXPRESSION> {
  {NAME}                       { yybegin(???); return NAME; }
}

{WHITE_SPACE}                  { return WHITE_SPACE; }
[^]                            { return BAD_CHARACTER; }