declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"

@i = global i32 0
define i32 @main() nounwind {
  store i32 5, i32* @i
  store i32 10, i32* @i
  %1 = fadd double 2.0, 2.0
  %local = alloca double
  store double %1, double* %local
  %2 = load double, double* %local
  %3 = fadd double %2, 2.0
  %local2 = alloca double
  store double %3, double* %local2
  %4 = load i32, i32* @i
  %5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %4)
  %6 = add i32 2, 2
  %7 = mul i32 2, %6
  store i32 %7, i32* @i
  %8 = load i32, i32* @i
  %9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %8)
  ret i32 0
}
