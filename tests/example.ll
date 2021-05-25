declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"

define dso_local i32 @a(i32 %0) nounwind {
  %2 = alloca i32
  store i32 %0, i32* %2
  %3 = add i32 5, 10
  %4 = load i32, i32* %2
  %5 = add i32 %3, %4
  %a.c = alloca i32
  store i32 %5, i32* %a.c
  %6 = icmp sgt i32 0, 1
  br i1 %6, label %true1, label %false1
  true1:
  %7 = load i32, i32* %a.c
  ret i32 %7
  br label %false1
  false1:
  ret i32 0
}

@b = global i32 0
define i32 @main() nounwind {
  %1 = add i32 10, 2
  %2 = call i32 @a(i32 %1)
  store i32 %2, i32* @b
  %3 = load i32, i32* @b
  %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %3)
  ret i32 0
}
