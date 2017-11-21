# Change Log
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/)
and this project adheres to [Semantic Versioning](http://semver.org/).

## [Unreleased] - YYYY-MM-DD
### Added
(new features)

### Changed
(changes in existing functionality)

### Deprecated
(changes that will be removed in an upcoming release)

### Removed
(removed features)

### Fixed
(fixed bugs)

### Security
(security fixes)

### Maintenance
(other changes, that are only interesting for developers of this project)



## [0.3.1] - 2017-11-21
### Fixed
* Unchanged the id in the plugin.xml because JetBrains does not allow this



## [0.3.0] - 2017-11-21
### Changed
* Changed file extension from `.cfg` to `.cfgr` because of [Issue #1](https://github.com/JonasRudolph/idea-plugin-context-free-grammar/issues/1)

### Maintenance
* Removed `Cfg`-Prefix from most classes



## [0.2.0] - 2017-11-13
### Changed
* There is now a distinction between characters like `'A'`, `"."` or `'\''` and strings like `''`, `""`, `'ab'` or `"\"b"`
* Ranges now only allow characters or unicode-symbols

### Fixed
* Names of Group-parenthesis in ColorSettingsPage
* Added entry in dependency list of plugin.xml so this plugin is not marked as legacy anymore.

### Maintenance
* Wrote README.md
* Minor class renaming
* Removed generated files from git
* Changed `CFG`-Prefix to `Cfg`



## [0.1.1] - 2017-11-07
### Added
* Syntax Highlighting of Context Free Grammars



## [0.1.0] - 2017-11-07
State before keeping a changelog.



# Release entry template
## [Unreleased] - YYYY-MM-DD
### Added
(new features)

### Changed
(changes in existing functionality)

### Deprecated
(changes that will be removed in an upcoming release)

### Removed
(removed features)

### Fixed
(fixed bugs)

### Security
(security fixes)

### Maintenance
(other changes, that are only interesting for developers of this project)