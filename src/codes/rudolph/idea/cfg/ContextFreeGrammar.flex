package codes.rudolph.idea.cfg;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static codes.rudolph.idea.cfg.psi.Types.*;

%%

%{
  public Lexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class Lexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

WHITE_SPACE=\s+

COMMENT=#[^\r\n]*
UNICODE_TOK=\\u[0-9A-Fa-f]{4}
MULTI_CHAR_STRING_TOK=(('')|(\"\")|('(([^'\\]{2}[^'\\]*)|(([^'\\]|(\\.))+(\\.)+([^'\\]|(\\.))*)|(([^'\\]|(\\.))*(\\.)+([^'\\]|(\\.))+))')|(\"(([^\"\\]{2}[^\"\\]*)|(([^\"\\]|(\\.))+(\\.)+([^\"\\]|(\\.))*)|(([^\"\\]|(\\.))*(\\.)+([^\"\\]|(\\.))+))\"))
ONE_CHAR_STRING_TOK=(('([^'\\]|(\\.))')|(\"([^\"\\]|(\\.))\"))
NATURAL_NUMBER=(0|[1-9][0-9]*)
NON_ZERO_NATURAL_NUMBER=[1-9][0-9]*
ID=[A-Za-z_][A-Za-z_0-9]*

%state MAX_VALUE
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
  "<"                            { yybegin(MAX_VALUE); return REP_MAX_OPEN; }
  "$"                            { return REP_DELIM; }
  ";"                            { return DEFINITION_END; }

  {COMMENT}                      { return COMMENT; }
  {UNICODE_TOK}                  { return UNICODE_TOK; }
  {MULTI_CHAR_STRING_TOK}        { return MULTI_CHAR_STRING_TOK; }
  {ONE_CHAR_STRING_TOK}          { return ONE_CHAR_STRING_TOK; }
  {NATURAL_NUMBER}               { return NATURAL_NUMBER; }
  {ID}                           { return ID; }
}


<MAX_VALUE> {
  {WHITE_SPACE}                  { return WHITE_SPACE; }
  
  {NON_ZERO_NATURAL_NUMBER}    { yybegin(YYINITIAL); return NON_ZERO_NATURAL_NUMBER; }
  "*"                          { yybegin(YYINITIAL); return INFINITE; }
}

[^] { return BAD_CHARACTER; }
