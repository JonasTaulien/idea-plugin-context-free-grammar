# TODO
* Ranges should only accept One-Character-Strings (escaped character counts as one character) or Unicode-Tokens
* Continue Tutorial (http://www.jetbrains.org/intellij/sdk/docs/tutorials/custom_language_support/psi_helper_and_utilities.html)
* Document and describe the 'Context Free Grammar'-Syntax
* Write README with fancy images.
* Use 'recoverWhile' and 'name' attributes
* Own icon
* Formatter
* Add multiline-comments
* Add Commenter
* Highlight
    * Matching brace/parenthesis/bracket
    * Usages of thing under cursor
    * Escaped characters in strings
* Add Jump-To-Definition
    * Inside file
    * Across modules
* Add listing of usages of a rule
* Add semantic checks
    * Referenced rule does not exist
        * Inside file
        * Across modules
    * Referenced module does not exist
    * Duplicate rule
    * Same expression mutiple times in alternative
* Refactorings
    * `{1>A<*}`, `{A<*}` or `{1>A}` to `{A}`
    * `{0>A<x}` to `[{A<(x-1)}]`
    * `{0>A<1}` to `[A]`
    * `A A ... A` to `{x>A<x}`
    * `A [{x>B A<y}]` to `{(x+1)> A $ B <(y+1)}`
    * Crate new rule from expression
    * Rename rule
        * Inside file
        * Across modules
    * Remove unneeded parenthesis
* Structure view
* Mark recursions
* Mark 'empty'-rules
* Autocomplete
    * Rule name
    * Module name
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