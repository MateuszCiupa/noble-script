# NobleScript
ANTLR4/LLVM based compiler

# Planned features
## Milestone 1
- 2 types of variables: int and double,
- read and write operations,
- basic arithmetic operations,
- error messages,
- arrays,
- strings.

## Milestone 2
- compound statements,
- functions,
- variable scopes,
- dynamic types (type coercion).

# NobleScript Language Reference

The reference manual describes the syntax and "core semnatics" of the language.

## Reserved keywords

The following identifiers are used as reserved words of the language.

- Print function: `print`.
- Scan standard output functions: `readInt`, `readDouble`.
- Compound statements keywords: `while`, `if`.
- Exit function call keyword: `return`.
- Language types: `int`, `double`, `string`, `var`.

## Variables

#### Variables must be initialized during declaration.
```c
int a = 5;
double b = 5.5;
```

#### Array size must be specified during declaration.
```c
int a[5];
double b[99];
```

#### Array index must be within declared array size.
```c
int a[5];
a[4] = 1;
int b = a[5];
===
Error: Invalid array index 5 of size 5 - at line: 3 column: 10
```

#### Variables cannot be redeclared in the same scope.
```c
int a = 5;
double a = 5.5;
===
Error: ID {a} already exists in the scope {} - at line: 2 column: 4
```

#### Language supports variable shadowing.
```c
int a = 10;
int funA() {
    print(a);
}
int funB() {
    int a = 999;
    print(a);
}
funA();
funB();
===
Output:
10
999
```

## Types

#### Below is a list of the types that are built into NobleScript.

- Single-point, 32-bit integer: `int`.
- Floating-point, 64-bit value: `double`.
- List of characters: `string`.
- Arrays: `int[x]`, `double[x]`.
- Dynamic type: `var`.


#### You can use `var` to omit specifying variable type and let NobleScript compiler deduce variable types.
```c
var a = 1;
var b = 2.0;
print(a + b);
===
Output:
3
```

#### Language supports coercion between `double` and `int` types.
```c
int a = 1;
double b = 1.5;
print(a + b);
===
Output:
2.500000
```

## Arithmetic operations

#### Supported operators: `+`, `-`, `*` and `/`.
#### All expressions are evaluated in the respect to arithmetical operations order. 

```c
int a = 2 + 2 * 10;
===
Result: a = 12
```

#### You can use parentheses to change the order of arithmetical operations.

```c
int a = (2 + 2) * 10;
===
Result: a = 40
```

## Compound statements

#### Supported delimiters: `<`, `<=`, `>`, `>=`, `==` and `!=`.

#### You can use `if` statement to control the flow of operations.

```c
int a = 5;
int b = 2;
if(2 * b > a){
    print("Inside if statement!");
}
===
Output: "
```

#### You can use `while` loop to implement loops.

```c
int a = 4;
while(a > 0){
    print(a);
    a = a - 1;
}
===
Output:
4
3
2
1
```

## Functions

#### Function definition must specify return type, function name and list of arguments with specified types. 
Note: Function calls are treated as expressions thus they can be used in places where variables and literals are allowed.

```c
int add(int a, int b) {
    return a + b;
}

int wrappedAdd(int a, int b) {
    return add(a, b);
}

print("a + b:");
print(wrappedAdd(2, 5));
===
Output:
a + b:
7
```

#### By default, all functions return value `0`.

```c
int nothing() {}
print(nothing());
===
Output:
0
```

#### Functions can be called even in compound statements.
```c
int add(int a, int b) {
    return a + b;
}

int a = 2;
if(1 + a + add(1, a) == 6) {
    print("Inside if statement");
}
===
Output:
Inside if statement
```

## IO Operations

#### You can use `readInt` and `readDouble` keywords to get user input.

```
int a = readInt();
double b = readDouble();
```

#### You can use `print` keyword to display expressions.
```c
int a = 1;
double b = 2.0;
string hello = "world";
print(a);
print(b);
print(hello);
===
Output:
1
2.000000
world
```
