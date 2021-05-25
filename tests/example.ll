declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"

@a = global i32 0
@b = global double 0.0
define i32 @main() nounwind {
  store i32 2, i32* @a
  store double 3.0, double* @b
  %1 = load i32, i32* @a
  %2 = load double, double* @b
  %3 = sitofp i32 %1 to double
  %4 = fadd double %3, %2
  %5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %4)
  ret i32 0
}
