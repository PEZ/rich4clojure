# Rich 4Clojure

Welcome to the Rich Comment Form (RCF) version of 4Clojure.

## What it is

1. A repository that lets you practice [Clojure](https://clojure.org), and hone your skills in the language, directly from the comfort of Clojure REPL enhanced editor.
2. A ”copy” of the now closed **4clojure.com** site. It served us so wonderfully well!

Anyway, if you have come here to practice Clojure, you are at the right place!

## How it works

First thing first. If you are totally unfamiliar with Clojure, this might be better used as your second step in Getting Started. A super quick first step might be to use [Calva's Getting Started REPL](https://calva.io/getting-started/). You'll need to at least know how to:

* Start a project REPL
* Load a Clojure file
* Evaluate forms

### Get started

From there you follow these general steps:

0. Fork and clone.
    * I suggest you also make a branch for your use of the project, since you will be modifying the files, but might still want to be able to push clean pull requests.
1. Open the project in your Clojure-enabled editor.
1. Start the **Rich 4Clojure** project REPL and connect it to your editor session. If you are using [Calva](https://calva.io), this is as easy as issuing the **Start a Project REPL (aks Jack-in)** command and select `Rich 4Clojure` in the *Project types* menu that pops up.
1. Load the file `dev/repl.cljc`.
   * This will enable the test runner to run the problem tests that you find in each problem file.

### Solving the problems

The problems are contained in subfolders of the general difficulty level:

1. `src/rich4clojure/elementary`
1. `src/rich4clojure/easy`
1. `src/rich4clojure/medium`
1. `src/rich4clojure/hard`

Find suitable/fun problems and hack away. Right now the original site's guidance on which order to take the problems on are not transated to this repo, but generally just in numerical order at the difficulty level of your choice should work.

#### Running the tests

The process of taking on a problem is:

0. Open the file
1. Load the file
    * This will run the tests and they will fail.
1. ... WIP

## What about the name?

The name, **Rich 4Clojure**, comes from the fact that it relies on [Rich Comments](https://calva.io/rich-comments/) and also uses a test utillity called [RCF](https://github.com/hyperfiddle/rcf) which is building on the same philosophy. (Also reading it like ”rich forclosure” builds on the joke that the original site was pulling. 😄)

## Work in progress

This is the first version from a quite automated translation of the orginal problems. There'll be dragons. Please consider filing issues, starting discussions, or chat me up on the Clojurian's Slack.

PR:s are also welcome, though I have to figure out a good process for it. It is quite a mess in my translation script right now. So I might not always be super quick to pull.

## See also

* [4ever-clojure](https://4clojure.oxal.org) – An web based ”always up” copy of the original 4Clojure. It has listings of all working solutions that that were submitted to the original site.