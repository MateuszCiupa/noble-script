declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"

define i32 @main() nounwind {
  %main.a = alloca i32
  store i32 5, i32* %main.a
  br label %whilestart0
  whilestart0:
  %1 = load i32, i32* %main.a
  %2 = icmp slt i32 %1, 20
  br i1 %2, label %whiletrue1, label %whilefalse1
  whiletrue1:
  %3 = load i32, i32* %main.a
  %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %3)
  %5 = load i32, i32* %main.a
  %6 = add i32 %5, 1
  store i32 %6, i32* %main.a
  br label %whilestart0
  br label %whilefalse1
  whilefalse1:
  ret i32 0
}
