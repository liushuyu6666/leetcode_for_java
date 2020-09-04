# Note

## statistic
Title | Time | memory
-----------------|----------|-----------
1 | 50ms 36 | 39mb 78
2 | 1ms 100 | 39mb 94
3 | 6ms 80  | 39mb 60
5 | 24ms 79 | 38mb 73
17 | 6ms 26 | 40mb 66
18 | 76ms 10 | 41mb 28
19 | 0ms 100 | 38mb 42
20 | 2ms 52  | 38mb 42
21 | 0ms 100 | 39mb 52


## 15. 3Sum
### algorithm
Fix i and move j, k to find nums[i] + nums[j] + nums[k] = 0
## 16. 3Sum Closest
### mistakes
Shouldn't initialize result as MAX_INT or MIN_INT or it will jump out of border when calculate abs(result - target)  
## 17. Letter Combinations of a Phone Number
### data structure
List:
1. 
```java
List<String> res = new ArrayList<>()
```
2. 
```java
List.size()
```
3.
```java
List.get()
```

## 20. Valid Parentheses
### data structure
Stack:
1. 
```java
Stack goodOne = new Stack()
```
2. 
```java
goodOne.empty() // check if goodOne is empty, return boolean.
```
3.
```java
goodOne.pop() // return Object
```
4.
```java
goodOne.push(newObject) // return Object
```

### methods
1.  
convert Object to String and to char
```java
Object.toString().toCharArray()
```
