# FamilyTreeChallenge

[![CircleCI](https://circleci.com/gh/carlso70/FamilyTreeChallenge.svg?style=shield&circle-token=1ef8009b58e654742383ca0de12783f85ee84c6d)](https://circleci.com/gh/carlso70/FamilyTreeChallenge)

### Build

```
./gradlew build
```

### Run

```
./gradlew -q run
 ```


Problem Description
-----

Given a rooted tree of N nodes, where each node is uniquely numbered in between [1..N]. The node 1 is the root of the tree. Each node has an integer value which is initially 0.You need to perform the following two kinds of queries on the tree:

* add t value: Add value to all nodes in subtree rooted at t

* max a b: Report maximum value on the path from a to b

## Input Format

First line contains N, number of nodes in the tree. Next N-1 lines contain two space separated 
integers x and y which denote that there is an edge between node x and node y. 
Next line contains Q, the number of queries to process. Next Q lines follow with either add or max query per line.

## Constraints 

```
1 ≤ N ≤ 100,000
1 ≤ Q ≤ 100,000
1 ≤ t,a,b,x,y ≤ N 
x ≠ y
−10,000 ≤ value ≤ 10,000
```

The tree is _NOT_ a binary tree. Each node may have an arbitrary number of children. Repeat: 
This is _NOT_ a _BINARY TREE_.

## Output Format

For each max query output the answer in a separate line.

### Sample Input
```
5 
1 2 
2 3 
2 4 
5 1 
6 
add 4 30 
add 5 20 
max 4 5 
add 2 -20 
max 4 5 
max 3 4
```

### Sample Output
```
30 
20 
10
```
