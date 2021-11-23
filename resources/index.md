# Detailed schedule

## Class 20

Main topics for today: functional programming and lambda
expressions. We may also begin on the Java Stream API.

Code: [functionAsParam.py](class20/functionAsParam.py),
[FunctionParameterDemo.java](class20/FunctionParameterDemo.java), [streamdemo.zip](class21/streamdemo.zip)

To run Python code without installing anything, I recommend [repl.it](https://repl.it).




## Class 19

Hash tables, session II. We continue with the PowerPoint, Java files,
and handout from last time.

As part of our discussion of a few computer scientists, it's well
worth checking out [Joy
Buolamwini](https://www.media.mit.edu/people/joyab/overview/)'s
[poetofcode.com](https://poetofcode.com/) site, especially her video art "AI,
Ain't I A Woman."


## Class 18

Hash tables, session I.

PowerPoint: [class18-hash-tables.pptx](class18/class18-hash-tables.pptx) <font color="green">UPDATED on 11/18/2021 &ndash; fixed an error on slide 29</font>

Java: [HashCodes.java](class18/HashCodes.java) and
[ComputerScientist.java](class18/ComputerScientist.java)

Handout: [hash-table-handout.pdf](class18/hash-table-handout.pdf) (and the [handout solution](class18/hash-table-handout-solution.pdf) <font color="green">UPDATED on 11/18/2021 &ndash; fixed errors</font>)


## Class 17b

Exam review session. Please bring any questions.

Also, we will go over stable sorting again, using an updated
explanation.

As previously announced, homework assignment 6 will be graded on
completeness only. Solutions are being made available today. Unlike
most other homework assignments, you may consult the solutions when
working on this assignment. To benefit as much as possible from the
assignment, you should make a serious attempt at each question before
consulting the solution.

## Class 17

Note the announcement of midterm exam 2. Also note that homework six
will be graded on completeness only, and can optionally be turned in
before the exam or after the exam.

Topics:
* Heap sort
* Stability of sorting algorithms
* Example of real-world sorting algorithm

PowerPoint: [class17-heap-sort.pptx](class17/class17-heap-sort.pptx) &nbsp;&nbsp;&nbsp;<font color="green">UPDATED on 11/6/2021</font>



## Class 16

Sorting algorithms: Today we study *insertion sort* and *merge
sort*. Next time we study *heap sort*. Note that the textbook also
discusses *selection sort* and mentions *bubble sort* and *quick
sort*. It is good to read about and be aware of selection sort and
bubble sort but we do not study them in detail.

We've seen this before:
* [fun link comparing sorting algorithm running
  times](http://www.sorting-algorithms.com/random-initial-order)

Powerpoint: [class16-insertion-and-merge-sort.pptx](class16/class16-insertion-and-merge-sort.pptx)


## Class 15

Mid-semester feedback results:
  - [mid-semester-feedback-results.pdf](class15/mid-semester-feedback-results.pdf)
  - [mid-semester-feedback-slides.pptx](class15/mid-semester-feedback-slides.pptx)

Topics for today (all optional, not on the exam or homework):
  1. Generic expressions like `CS232PriorityQueue<K extends Comparable<K>, V>`
     - These are called *bounded type parameters*. See [https://docs.oracle.com/javase/tutorial/java/generics/bounded.html](https://docs.oracle.com/javase/tutorial/java/generics/bounded.html)
  1. AVL trees, or balanced trees generally.
     * [description](https://courses.grainger.illinois.edu/cs225/fa2021/resources/avl-trees/)
	 * [demo](https://www.cs.usfca.edu/~galles/visualization/AVLtree.html)
	 * other balanced trees that are used in practice:
	   - [red-black trees](https://en.wikipedia.org/wiki/Red%E2%80%93black_tree)
	   - [B-trees](https://en.wikipedia.org/wiki/B-tree)
  1. Javadoc demo
     * check out the Project \| Generate Javadoc... command in Eclipse.
  1. Proof that height of complete tree is O(log n).
     * follows from the fact that 1 + 2 + 4 + 8 + 16 + ... + 2^d = 2^(d+1) -1
  
Help and discussion of homework 5 (bring your own questions)


## Class 14

* Main topic: **heaps**

* [PowerPoint slides for heaps](class14/class14-heaps-slides.pptx)



## Class 13

* Please complete the [mid-semester survey](https://forms.office.com/Pages/ResponsePage.aspx?id=VbAyYrl2E0ybiLVirn22-3zmolgc6htDs2E7F-Dz3zdURFdaN0NZVFg5TUswQks2NTNOUVEyVFJCMSQlQCN0PWcu)

* Main topic for today: binary search trees (BSTs)
  - **Important note:** In the textbook, equal keys are stored in the
    *left* child. In the CS232 sample code, equal keys are stored in the
    *right* child. For the homework, you must store equal keys in the
    *right* child, not the left child.
  - three BST operations: 
    * find
	* add (also called insert)
	* remove: 3 cases
	  - zero children (easy)
	  - one child (easy)
	  - two children (swap in value from smallest node in right
        subtree, then delete that node)
  - [PowerPoint slides describing the three BST operations](class13/class13-BSTs.pptx)
  - [handout to practice adding and removing BST nodes](class13/bst-handout.png) 
  <!-- - [handout solution](class13/bst-handout-solution.png) -->


## Class 12

Binary trees session 2. Today's topics: 
1. Definitions of full and complete binary trees
1. Statement of two theorems about binary trees
1. Review traversals
   - Examine the code for level order traversal, which uses a queue
     rather than employing recursion.
1. Review binary tree ADT, and compare with the Map ADT
1. Overview of the Visitor design pattern (see sample code
   `tree.PrintVisitor.java` for an example). Additional examples of
   the Visitor pattern (**very** useful for the binary tree homework
   assignment):
   - [SumVisitor.java](class12/SumVisitor.java)
   - [AverageWithoutLowestVisitor.java](class12/AverageWithoutLowestVisitor.java)
1. Homework help for the binary tree homework assignment
   - [Hints for HW4, question 6](class12/hw4-qu6-hints.png)

A useful example of how to add methods that assist in debugging your
code: [BTNode.java](class12/BTNode.java)

Resources:
* [whiteboard notes](class12/whiteboard-class12.png) &ndash; including updated list of nodes traversed for the warm-up example at the start


## Class 11

Binary trees session 1. Today's topics: 
* Basic definitions (root, leaves, internal loads, descendants,
  ancestors, depth, height, path length).
* recursive nature of binary trees
* Four types of traversals: Level order, pre-order, in order, post-order.
* Our ADT for Binary trees

Resources:
* [PowerPoint notes](class11/topic5-binary-trees.pptx)

For next time:
* Make a start on the binary tree homework assignment (HW4). Try to
  look through all the questions and highlight areas where you need a
  hint to get started. In the next class meeting, we will spend some
  time giving hints where necessary.


## Exam review session

* [PowerPoint notes](class10b/class10b-review-session.pptx)
* [Whiteboard notes](class10b/whiteboard.png)


## Class 10

Today's topics:
1. Iterators
   * This is a repeat of class meeting 41 from COMP132. See topic 12e
     of the [COMP132 study
guide](https://users.dickinson.edu/~jmac/courses/previous/spring-2021-comp132/study-guide-4-26-2021.docx).
   * code: [Friends.java](class10/Friends.java), [FriendsIterator.java](class10/FriendsIterator.java),
     [FriendsIteratorUnfinished.java](class10/FriendsIteratorUnfinished.java), [FriendsNested.java](class10/FriendsNested.java).
   * [slide explaining traversal](class10/traversal.pptx)
1. Example of amortized analysis: cost of adding to an ArrayList
   * This is an optional topic that will not appear on exams or homework.
   * [tollbooth-allegory.pptx](class10/tollbooth-allegory.pptx)


## Class 9

Today's topics: 
1. Abstract data type (ADT)
1. List ADT
1. Array-based list implementation
1. linked list implementation
1. running times for list operations (array versus linked)
1. stack ADT
1. queue ADT

Except for stacks and queues, all of the above is review of
COMP132. See Topic 12 of the [COMP132 study
guide](https://users.dickinson.edu/~jmac/courses/previous/spring-2021-comp132/study-guide-4-26-2021.docx).

[Fill-in slide for running times of list
operations](class09/list-operations.pptx) (array versus linked).

## Class 8

Review of how to use generics. Then the new idea for this course: how to create your own generic classes and methods.

* [MyThreeFavoriteThings.java](class08/MyThreeFavoriteThings.java)
* [MyThreeFavoriteThingsGeneric.java](class08/MyThreeFavoriteThingsGeneric.java)

## Class 7

Review of algorithm analysis topic.

* [SayHi.java](class07/SayHi.java)
* [handout](class07/class7-handout.pdf) for practising asymptotic
  analysis from first principles
* [whiteboard notes](class07/whiteboard-class7.png)


## Class 6

Formal definition of big-O, big-omega, big-theta. Solving recurrence
relations via expansion.

* [whiteboard notes](class06/class06-whiteboard.png)



## Class 5

Overview of asymptotic running times, especially big-O.

* [fun link comparing sorting algorithm running times](http://www.sorting-algorithms.com/random-initial-order)
* [whiteboard notes](class05/class5-whiteboard.png)


## Class 4

*Backtracking* and its connection to recursion, via *recursion trees*.

* [PermutationsIncomplete.java](class04/PermutationsIncomplete.java)
* [subsets recursion tree](class04/subsets-recursion-tree.png) &ndash; fill this in for the recursion homework assignment
* [whiteboard notes](class04/whiteboard-notes.pptx)

## Class 3

Some more sophisticated examples of recursion, including `isReverse()`
from the textbook and the following two examples based on COMP232
sample code:
* [SubsetsIncomplete.java](class03/SubsetsIncomplete.java)
* [SplitArrayIncomplete.java](class03/SplitArrayIncomplete.java)


## Class 2

Elementary examples of recursion, using the coding examples in the
textbook.



## Class 1

Overview of the course.

Review: install Eclipse, create and run a Java program.

Homework 0: pulling an assignment from GitHub and pushing your solution for grading.

Please fill out the [GitHub username form](https://forms.office.com/r/Lwq49rwis0).






----
Last modified: Tue Nov 23 04:25:00 UTC 2021 by jmac.
