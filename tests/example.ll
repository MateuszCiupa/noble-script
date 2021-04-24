declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"

@myGlobalInt = global i32 0
define i32 @main() nounwind {
  store i32 999, i32* @myGlobalInt
  %myLocalInt = alloca i32
  store i32 3, i32* %myLocalInt
  %1 = load i32, i32* %myLocalInt
  %myLocalIntCopy = alloca i32
  store i32 %1, i32* %myLocalIntCopy
  %2 = load i32, i32* %myLocalIntCopy
  %3 = load i32, i32* %myLocalIntCopy
  %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %3)
  ret i32 0
}
