# TODO
## High Prio
* Document and describe the 'Context Free Grammar'-Syntax in README.md
* Add Commenter
* Highlight matching brace/parenthesis/bracket
* Highlight usages of thing under cursor
* Add Jump-To-Definition (across modules)
* Add check: Referenced module does not exist
* Add check: Referenced rule does not exist (across modules)
* Add check: Duplicate rule-name (across modules)
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

## Low Prio
* Own icon
* Add multiline-comments
* Add check: Same expression mutiple times in alternative
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
    * Parse string against some rule -> Parse-tree, JSON
    * Match string against some rule
    * Create syntax diagram