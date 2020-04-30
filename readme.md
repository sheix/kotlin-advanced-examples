# What is in this repo 

This is collection of examples of Kotlin interesting techniques, patterns and libraries.

## Interface Delegation

[Interface delegation example](src/main/kotlin/interfaces/DelegationExample.kt) shows the technique of usign the implementation similar to inheritance.

## Nullability in Kotlin

[Nullability example](src/main/kotlin/nullables/NullableDemo.kt) show usage of null coalescence, Elvis operator and forced null.

## Operators overloading

Concept of overloading operators is controversial. It's implemented in kotlin by using extension functions. Simple unary and binary overloading [examples](src/test/kotlin/OperatorsOverloading.kt). [Additional example](src/main/kotlin/operators/Vector.kt) shows that concepts like indexing and destructuring are implemented with as operator overloading too.

## Generating of static HTML

Kotlin provides some libraries in package `kotlinx`, where `x` stands for "eXtensions". One of them is html, which brings a domain-specific language (DSL), which generates web pages from kotlin code. Example of usage is found [here](src/main/kotlin/html/Html.kt)

