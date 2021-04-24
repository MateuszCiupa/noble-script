declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@strpd = constant [4 x i8] c"%f\0A\00"
@strpi = constant [4 x i8] c"%d\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsd = constant [4 x i8] c"%lf\00"
@strsi = constant [3 x i8] c"%d\00"

@globals = global i32 0
@b = global i32 0
define i32 @main() nounwind {
  store i32 2, i32* @globals
  %a2 = alloca i32
  store i32 6, i32* %a2
  %dasda = alloca i32
  store i32 34534, i32* %dasda
  %asdsa = alloca i32
  store i32 342, i32* %asdsa
  %1 = load i32, i32* %a2
  %2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %1)
  %3 = load i32, i32* %asdsa
  %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %3)
  %b5 = alloca i32
  store i32 3, i32* %b5
  %b1 = alloca i32
  store i32 2, i32* %b1
  %5 = load i32, i32* %a2
  %6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %5)
  %7 = load i32, i32* %a2
  %8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %7)
  store i32 3, i32* @b
  ret i32 0
}
