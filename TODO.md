# TODO
* Continue: http://www.jetbrains.org/intellij/sdk/docs/tutorials/custom_language_support/psi_helper_and_utilities.html

## High Prio
* When cursor is next to `|`, `/` `-` or `<space>` highlight which expressions belong to that operator so that the user knows where he has to place parenthesis to get the correct binding order
* Try to make the semicolon optional.
* Change unicode syntax from `\uXXXX` to `U+XXXXXX` where the last two `X` are optional.
* Define discrete set of escape-able characters (`\n`, `\t`, `\'`, `\"` etc) and adjust syntax
* Add Commenter
* Highlight matching brace/parenthesis/bracket
* Highlight usages of thing under cursor
* Jump-To-Definition: of module
* Jump-To-Definition: of imported rule name (across modules)
* Jump-To-Definition: of aliased imported rule name
* Add check: Referenced module does not exist
* Add check: Referenced rule does not exist (across modules)
* Add check: Duplicate module name when using the `import ... as ...;` syntax
* Add check: Module name does not match file name
* Refactoring: Rename rule (across modules)
* Autocomplete: rule-names
* Autocomplete: module-names

## Medium Prio
* Formatter
* Highlight escaped characters in strings or characters
* Add listing of usages of a rule
* Write README with fancy images.
* Use 'recoverWhile' and 'name' attributes
* Refactoring: Crate new rule from expression
* Structure view
* Add Patterns:
   ```
   Variable: VariableName AtLeastOne(':' Type, Expression);
   AtLeastOne(x, y): x | [x] y;
   ```
   is equal to
   ```
   Variable: VariableName (':' Type | [':' Type] Expression)
   ```
   or
   ```
   String: QuoteEscape('"', \u0000-\u9999) | QuoteEscape("'", \u0000-\u9999)
   
   QuoteEscape(quote, elements): quote {(elements / quote) | Escape(quote)} quote
   Escape(toEscape): '\' toEscape
   ```
   is equal to
   ```
   String: ('"' {(\u0000-\u9999  / '"') | '\' '"'} '"') 
         | ("'" {(\u0000-\u9999  / "'") | '\' "'"} "'")
   ```

## Low Prio
* Own icon
* Add multiline-comments
* Add check: Same expression mutiple times in alternative
* Add support for `ε` as a replacement for `''` or `""`
* Refactorings
    * `{1>A<*}`, `{A<*}` or `{1>A}` to `{A}`
    * `{0>A<x}` to `[{A<(x-1)}]`
    * `{0>A<1}` to `[A]`
    * `A A ... A` to `{x>A<x}`
    * `A [{x>B A<y}]` to `{(x+1)> A $ B <(y+1)}`
    * Double-Quoted String containing `\"` (but not `'`) to Single-Quoted String having `"` 
    * Single-Quoted String containing `\'` (but not `"`) to Double-Quoted String having `'` 
    * Remove unneeded parenthesis
* Mark recursions
* Mark 'empty'-rules
* Automatically close strings, repetitions, groups, optionals, definitions (behind cursor)
* On hover, show character behind unicode    
* As one references a rule, that currently does not exist, automatically create it below the current rule
* Nice to haves
    * Reordering of entries, so that a used rule is always below the rule in which it was used. (Take care of recursions!)
    * Export as Styled HTML code block for using syntax in some documentation.
    * Helper for resolving ambiguities
    * Generate (E)BNF
    * Parse string against some rule -> Parse-tree or JSON
    * Match string against some rule
    * Create syntax diagram
