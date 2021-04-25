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
  store i32 17, i32* @i
  %1 = load i32, i32* @i
  %a = alloca i32
  store i32 %1, i32* %a
  %2 = load i32, i32* %a
  %3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %2)
  ret i32 0
}
