# JetBrains IDEA support for context free grammars
This plugin brings in support for working with context free grammars in the form of `.cfgr`-files.  

## Contect Free Grammar-Syntax
You can view the exact Grammar as BNF in the [ContextFreeGrammar.bnf](src/codes/rudolph/idea/cfgr/ContextFreeGrammar.bnf)-file.  

A `.cfgr`-file contains definitions and comments. There are three types of definitions:
* Module definitions
* Import definition
* Rule definitions

Definitions must always end with a semicolon (`;`).

### Module definition
Each Grammar must be placed in a file which is named `<ModuleName>.cfgr`.  
The first definition in such a Grammar file must be the Module definition. If you named the file `A.cfgr`, the Grammar must start with:
```cfgr
module A;
```

### Rule definition
In a Module you define Rules, which are essentially names for Expressions.
```cfgr
module A;

B: <expression goes here>;
```

#### Expression
##### Terminal Expressions
Binding hierarchy (from most to least binding):
1. String, Character, Unicode, Rule Reference, Optional, Repetition, Group
2. Range
3. Sequence
4. Alternative
5. Exclusion

That means:
* `A / B C`       <=> `A / (B C)`
* `A B / C`       <=> `(A B) / C`
* `A | B / C`     <=> `(A | B) / C`
* `A / B | C`     <=> `A / (B | C)`
* `A B | C`       <=> `(A B) | C`
* `A | B C`       <=> `A | (B C)`
* `'a' - 'b' C`   <=> `('a' - 'b') C`
* `A 'b' - 'c'`   <=> `A ('b' - 'c')`
* `'a' - 'b' | C` <=> `('a' - 'b') | C`
* `A | 'b' - 'c'` <=> `A | ('b' - 'c')`
* `'a' - 'b' / C` <=> `('a' - 'b') / C`
* `A / 'b' - 'c'` <=> `A / ('b' - 'c')`

###### String
A string consists of none or at least two characters surrounded by `'` or `"`.  
Examples for valid strings:
* `''`
* `""`
* `'Hello'`
* `"\".\""`

Examples for invalid strings:
* `"A"`
* `'a'`
* `"\""`

Escapes:
* In a double-quote string you must escape double quotes: `"\"Str\""`
* In a single-quote string you must escape single quotes: `'\'Str\''`
* You must escape backslashes: `'\\'`
* You are free to escape any other string: `'\a'` equals `'a'`

###### Character
A character is a string which only contains one character:
* `"A"`
* `'a'`
* `"\""`

Mostly you don't have to think about if you are currently specifying a Character or a String. This differentiation is only important for Ranges. 

###### Unicode
Some characters are hard to write as a string. Because of this you can also write down unicode characters:
```cfgr
module A;

NewLine: \u000A;
```

Unicode Expressions are case-insensitive. So you can also write `\u000a` in the above Rule.

##### None Terminal Expressions
###### Rule Reference
You can reference a Rule by using its name:
```cfgr
module A;

A: 'a';
B: A;
```

The rule you reference must be defined in this module or in a module you import.

###### Sequence
You can define a sequence by writing at least two expressions right after another:
```cfgr
module A;

HW: 'Hello' 'World';
```

###### Alternative
You can define an alternative by using the `|` operator.
```cfgr
module A;

Language: 'PHP' | 'Java'
        | 'Swift';
```

###### Optional
You can specify an expression to be optional by wrapping it with brackets.
```cfgr
module A;

Title: ['Prof.' | 'Dr.'] Name;
```

###### Range
You can specify a Range with the `-` operator:
```cfgr
module A;

Unicode: \u0000-\uFFFF;
```
Ranges only allow Character- or Unicode-Expression on each side.

###### Exclusion
You can exclude with the `/` operator:
```cfgr
module GraphQl;

FragmentName: Name / 'on';
```

###### Repetition
You can define a Repetition (1-to-n) by wrapping an Expression with braces:
```cfgr
module A;

Name: {'a'-'z' | 'A'-'Z'};
```

You can also specify the minimal repetitions (default = `1`):
```cfgr
module A;

Name: {2> 'a'-'z' | 'A'-'Z'};
```

And the maximal repetitions (default = `*`):
```cfgr
module A;

Name: {2> 'a'-'z' | 'A'-'Z' <255};
Word: {'a'-'z' | 'A'-'Z' | '_' | '0'-'9' <*};
```

There also exists a special list-syntax (`{ <Expression> $ <Expression> })`:
```cfgr
module MyLanguage;

Array: '[' {0> Expression $ ',' <512} ']';
```
The above Expression is the shorthand for `'[' [Expression {0> ',' Expression <511}] ']'`

###### Group
You can trick the default binding hierarchy by wrapping an Expression with parenthesis:
```cfgr
module A;

R: B (C / D);
```

##### Comment
A comment begins with a `#` and ends with a line breaking character.

### Import definition
Every Grammar can import Rules from other Grammars. Import definitions must be written below the Module definition and above the first Rule:
```cfgr
module A;

import B;
```
By doing this, you can also use Rules that you or others have defined in `B.cfgr`. You can now reference these Rules as `B.RuleName`. You can also rename Modules to something else in your current Grammar:
```cfgr
module A;

import B.C as D;
```
In this case, there must exist a file `./B/C.cfgr` (relative to `A.cfgr`). You can now use the Rules from this file by prefixing them with `D.`.

Summary:
* `import A;` Brings into scope: `A.RuleA`, `A.RuleB`, `A.RuleC` ...
* `import A.B;` Brings into scope: `A.B.RuleA`, `A.B.RuleB`, `A.B.RuleC` ...
* `import A as B;` Brings into scope: `B.RuleA`, `B.RuleB`, `B.RuleC` ...
* `import A as B.C;` Brings into scope: `B.C.RuleA`, `B.C.RuleB`, `B.C.RuleC` ...
* `import A.B.C.D as A;` Brings into scope: `A.RuleA`, `A.RuleB`, `A.RuleC` ...