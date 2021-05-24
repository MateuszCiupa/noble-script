declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"

@str1 = constant[4 x i8] c"a:\0A\00"
@str2 = constant[4 x i8] c"b:\0A\00"
define void @mojaFunkcja1(i32 %0, i32 %1) nounwind {
  %3 = alloca i32
  store i32 %0, i32* %3
  %4 = alloca i32
  store i32 %1, i32* %4
  %5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [4 x i8], [4 x i8]* @str1, i32 0, i32 0))
  %6 = load i32, i32* %3
  %7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %6)
  %8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [4 x i8], [4 x i8]* @str2, i32 0, i32 0))
  %9 = load i32, i32* %4
  %10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %9)
  ret void
}

@a = global i32 0
@b = global i32 0
define i32 @main() nounwind {
  store i32 69, i32* @a
  store i32 12, i32* @b
  %1 = load i32, i32* @a
  call void @mojaFunkcja1(i32 %1)
  ret i32 0
}
