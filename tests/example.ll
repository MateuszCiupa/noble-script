declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"

@i = global i32 0
define i32 @main() nounwind {
  store i32 2, i32* @i
  %1 = fmul double 2.0, 3.0
  %2 = fdiv double %1, 2.0
  %3 = fadd double 2.0, %2
  %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %3)
  %5 = load i32, i32* @i
  %6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %5)
  %7 = add i32 2, 2
  %8 = mul i32 %7, 2
  store i32 %8, i32* @i
  %9 = mul i32 4, 2
  store i32 %9, i32* @i
  %10 = load i32, i32* @i
  %11 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %10)
  %12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 1)
  ret i32 0
}
