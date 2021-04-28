declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"

define i32 @main() nounwind {
  %zzz = alloca [2 x double], align 16
  %1 = getelementptr inbounds [2 x double],[2 x double]* %zzz, i64 0, i64 1
  store double 2.0, double* %1
  %2 = getelementptr inbounds [2 x double],[2 x double ]* %zzz, i64 0, i64 1
  %3 = load double, double* %2, align 4
  %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %3)
  ret i32 0
}
