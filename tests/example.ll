declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"

@a = constant[22 x i8] c"12ds gdfgfd yg gf fd3\00"
@main.a = constant[33 x i8] c"zzzzzzzzzzz12ds gdfgfd yg gf fd3\00"
@str1 = constant[7 x i8] c"aaaaa\0A\00"
define i32 @main() nounwind {
  %1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [7 x i8], [7 x i8]* @str1, i32 0, i32 0))
  %2 = getelementptr inbounds [22 x i8], [22 x i8]* @a, i32 0, i32 0
  %3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %2)
  ret i32 0
}
