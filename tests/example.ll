declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"

@ala = common dso_local global [10 x i32] zeroinitializer, align 16
define i32 @main() nounwind {
  %dupa = alloca [5 x i32], align 16
  %1 = getelementptr inbounds [5 x i32],[5 x i32]* %dupa, i64 0, i64 3
  store i32 5, i32* %1
  ret i32 0
}
