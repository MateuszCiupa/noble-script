declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"

@a = global i32 0
define i32 @main() nounwind {
  %1 = mul i32 10, 2
  %2 = add i32 2, %1
  %3 = add i32 %2, 2
  store i32 %3, i32* @a
  %4 = add i32 2, 2
  %5 = add i32 %4, 2
  %6 = add i32 %5, 2
  %7 = add i32 %6, 2
  %8 = add i32 %7, 2
  %9 = add i32 %8, 2
  %10 = add i32 %9, 2
  %11 = add i32 %10, 2
  %12 = add i32 %11, 2
  %13 = add i32 %12, 2
  %14 = add i32 %13, 2
  %15 = add i32 %14, 2
  %16 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %15)
  ret i32 0
}
