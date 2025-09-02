# Politecnico Grancolombiano Scenario 2 problem 5

This is a Java program that solves the problem #5 from second scenario 

```
ax² + bx + c = 0
```

## 📌 Description

- The program receives **4 integer values** as input:  
  - The first three integers represent the coefficients `a`, `b`, and `c` of the polynomial.  
  - The fourth integer represents the value `x` to be tested.  

- It evaluates the polynomial `ax² + bx + c` at `x`.  
- If the result is equal to **0**, it prints `root!`.  
- Otherwise, it prints `not root!`.  

⚠️ Restrictions:
- No `if` statements, no loops, and no custom functions were used.  
- The **ternary operator (`?:`)** was used for the condition.

---

## 📖 Examples

### Example 1
**Input:**
```
1 -5 6 3
```
**Output:**
```
root!
```

### Example 2
**Input:**
```
1 -5 6 2
```
**Output:**
```
root!
```

### Example 3
**Input:**
```
1 -5 6 7
```
**Output:**
```
not root!
```