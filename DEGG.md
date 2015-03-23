# Introduction #

This project provides graphic facilities for inter-DC dependencies detection in SAP NW 7.0 environment.
Requires JRE 1.6.


# Details #

## Startup ##
Copy the executable jar on your local machine. Type on your shell
```
#<path_to_your_jre6>/bin/java -jar <path_to_executable_jar>
```

## Usage ##
  * Select File->New->NW70 dependency graph.
  * A file chooser pops up: select a root directory. The DC definitions (".dcdef" files) will be recursively searched in the corresponding subtree.
  * Graphics will be generated for the DCs found. DCs are represented as vertices, dependencies as edges. Dependencies derived from the .dcdef file are represented as plain edges, labelled with the corresponding public part name. Dependencies derived from the .wdProperties file are represented as dotted edges, with no label.
  * You can now export the generated graph as image from File->Export

# Used Libraries #
  * Jung2 for graph generation and graphics
  * JOX for XML processing
  * Standard Sun DOM implementation for XML processing