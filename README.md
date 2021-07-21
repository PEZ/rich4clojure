# Rich 4Clojure

Welcome to the [Rich Comment Form](https://calva.io/rich-comments/) (RCF) copy of 4Clojure! ❤️

## What it is

1. A repository that lets you learn and practice [Clojure](https://clojure.org), directly from the comfort of Clojure REPL enhanced editor.
2. A ”copy” of the now closed **`4clojure.com`** site. It served us so wonderfully well!

_Anyway, if you have come here to practice Clojure, you are at the right place!_

## How it works

First thing first. If you are totally unfamiliar with Clojure, this might be better used as your second step in Getting Started. A super quick first step might be to use [Calva's Getting Started REPL](https://calva.io/getting-started/). You'll need to at least know how to:

* Start a project REPL (starting _this_ project's REPL, that is. Which is very easy if you are using [Calva](https://calva.io))
* Load a Clojure file
* Evaluate forms

### Get started

To get to where you can start solving problems:

0. Fork and clone.
    I suggest you also make a branch for your practicing. This because you will be modifying the files, and might still want to be able to push clean pull requests.
1. Open the project in your Clojure-enabled editor.
1. Start the **Rich 4Clojure** project REPL and connect it to your editor session. If you are using Calva, this is as easy as issuing the **Start a Project REPL (aks Jack-in)** command and select **Rich 4Clojure** in the **Project types** menu that pops up.
1. Load the file `dev/repl.cljc`.
    * This will enable the test runner to run the problem tests that you find in each problem file.

### Find problems

The problems are contained in subfolders of the general difficulty level:

1. `src/rich4clojure/elementary`
1. `src/rich4clojure/easy`
1. `src/rich4clojure/medium`
1. `src/rich4clojure/hard`

Find suitable/fun problems and hack away. Right now the original site's guidance on which order to take on the problems are not translated to this repo, but generally just in numerical order at the difficulty level of your choice should work.

### Solve problems

Each problem has at least:

1. A title
1. A description
1. A definition of the symbol `__`
    ```clojure
    (def __ :tests-will-fail)
    ```
    * This symbol is used by the tests.
1. An ”open” `(comment ...)` form (a Rich Comment Form, RFC)
1. A `(tests ...)` form

Some problems also have restrictions, e.g:

```clojure
(def restricted [map mapcat])
```

Restrictions list ”things” shipped with **Clojure** that your solutions are not allowed to use. Your editor's *lookup* features can give you documentation and defintions for the restricted symbols. Sometimes using the restricted ”things” in your solution, or just peeking at their documentation can help you find solutions that don't use them.

#### Running the tests

The process of taking on a problem is:

0. Open the file
1. Load the file
    * This will run the tests and they will fail. A failing test looks something like so:
    ```
    clj:rich4clojure.easy.problem-39=>
    ; Evaluating file: problem_39.clj
    ❌ rich4clojure.easy.problem-39:21 
    in (__ [30 20] [25 15])

    [25 15]
    :≠
    [30 25 20 15]

    ...
    ```
1. Make the tests pass.
    * A successful test run looks something like so:
    ```
    clj:rich4clojure.easy.problem-39=>
    ; Evaluating file: problem_39.clj
    ✅✅✅✅
    ```

To rerun the tests, either reload the file or evaluate the `(tests ...)` form. This depends a bit on the problem and on your workflow. Here's a suggestion for problems which wants you to define a function:

1. Start with moving the `(def __ :tests-will-fail)` form inside the `(comment ...)` form.
1. Redefine `__` to a function make the tests pass, e.g.
    ```clojure
    (defn __ [x y z] ...)
    ```
For some problems you rather need to edit the tests and replace each instance of `__` with different (or the same) answers.

Basically, treat both the `(comment ...)` and the `(tests ...)` forms as your RFCs. Fiddle, evaluate, fiddle, evaluate. Until you have found the solution.

### Solved it?

_Each problem has a **gist** linked at the bottom._ Please consider sharing your solution as a comment on the gist. Other Clojurians will benefit from seeing how you solved it.

Also: Congratulations! Now take on the next problem!

#### Stuck?

The `#4clojure`, `#beginners` and `#clojure` channels at the [Clojurian's Slack](http://clojurians.net/) might be places to ask for hints. You might try the [Discussions](https://github.com/PEZ/rich4clojure/discussions) feature. Also: _Each problem has a **gist** linked at the bottom._ The gist's comment section might contain solutions from other users. Sometimes a peek is enough to give some guidance. But, yeah, major **spoiler alert**.

## What about the name?

The name, **Rich 4Clojure**, comes from the fact that it relies on [Rich Comments](https://calva.io/rich-comments/) and also uses a test utillity called [RCF](https://github.com/hyperfiddle/rcf) which is building on the same philosophy. (Also reading it like ”rich forclosure” builds on the joke that the original site was pulling. 😄)

## Work in progress

This is the first version from a quite automated translation of the orginal problems. There'll be dragons. Please consider filing issues, starting [discussions](https://github.com/PEZ/rich4clojure/discussions), or chat me up on the [Clojurian's Slack](http://clojurians.net/) (I'm **@pez**, there).

PR:s are also welcome. If it is the content of a particular problem you want to suggest changes for, edit the `problems.edn` file.

## Support the project

Please consider contributing. Issues and pull requests are welcome. Though I have to figure out a good process for Prs. It is quite a mess in my translation script right now. So I might not always be super quick to pull

The [Discussions](https://github.com/PEZ/rich4clojure/discussions) tab is also there for us to discuss both the project and solutions.

If you want to contrubute with problems, that is also super welcome. I suggest you start that with adding it as a suggestion in [Discussions](https://github.com/PEZ/rich4clojure/discussions). Then, if we agree the problem should be added, add it as a PR to the `problems.edn` file, and I will generate the files and gists from it. (Until I've set up a CI/CD pipeline for this.)

If you want to encourage my work with this project you are welcome to sponsor me:

* [Sponsor Peter Strömberg a.k.a. PEZ](https://github.com/sponsors/PEZ) ❤️

## See also

* [4ever-clojure](https://4clojure.oxal.org) – A web based ”always up” copy of the original 4Clojure. It has listings of all working solutions that that were submitted to the original site.