# Unexpected Behavior of removeIf with Mutable Collections in Kotlin

This repository demonstrates a subtle but important difference in the behavior of the `removeIf` function when used with mutable lists, sets, and maps in Kotlin.  While seemingly straightforward, understanding the implications of concurrent modification during iteration is crucial for avoiding unexpected results.

The `bug.kt` file shows the original code, which highlights the issue. The `bugSolution.kt` file provides a more robust approach to handling removals from these mutable collections.

This example is useful for illustrating the importance of choosing the right data structure and correctly handling concurrent modifications when working with Kotlin collections.
