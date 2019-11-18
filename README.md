# By-example AML Query

This project provides an implementation of the paper "By-example Data Query for AutomationML - An Approach based on Tree Patterns" submitted to IEEE Transaction on Industrial Informatics.

The examples used in this project was provided by the [AutomationML Consortium](https://www.automationml.org/o.red.c/home.html) and can be downloaded at https://www.automationml.org/o.red.c/dateien.html?cat=1.

The project consists of three Java Projects:

1. `aml_models`: the Java representation of the CAEX XML schema using [Eclipse Modeling Framework (EMF)](http://www.eclipse.org/modeling/emf/)
2. `aml_io`: an AML importer using the CAEX modeling in aml_models
3. `aml_query`: the query framework that reads nAQL models and translates them into XPath/XQuery programs.

## Installation

You first need to download the latest version of the Eclipse Modeling Tools from [eclipse.org](http://www.eclipse.org/downloads/eclipse-packages/) to your Eclipse IDE.

Then use Maven to import the projects and compile: `aml_models` -> `aml_io` -> `aml_query`.

The experiments in the paper is implemented in `aml_query/src/test/java/AMLQueryDemo.java`. 

There are several resource files stored at `aml_query/src/test/resource/`: 

* The query examples used in the paper is stored in `query.aml`.

* The original AML data is stored in `RobotCell.aml`.

* The excerpt of the original AML data used in the paper is stored in `data.aml`.

* The (simple) console output of the experiments are stored in `console_output.txt`. Simple means that we are only printing the names of the result XML elements. The results are consistent with the examples in the paper.

* The Automation serialization of the outputs can be found in `output_excerpt.aml` and `output_original.aml`.


## Provided Examples

In the file `aml_query/src/test/resource/query.aml`, there are four CAEX instance hierarchies containing various query examples:

* q1-q8: queries shown in the paper. Can be tested on both the excerpt or the original AML data file.
* q9: query that contain an internal link to an object in the data (A2). Needs to be tested on the original AML data file.
* q10: query that contain an internal link to an anonymous object (A3). Needs to be tested on the original AML data file.


## Generate new nAQL Models 

Since nAQL models proposed in the paper are native AML models, you can use any standard AML editor to generate one. Use the configuration parameters mentioned in the paper to configure your query models. If no parameter is found, default values are used for computation.

## Generate XPath/XQuery Programs

Use the Java class `aml_query/src/test/java/AMLQueryDemo.java` to load and execute your query models. The results are shown in command line of Eclipse and stored as native AML files at `aml_query/src/test/resource/output.aml`.