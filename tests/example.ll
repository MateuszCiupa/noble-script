declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"

@a = global i32 0
define void @mojaFunkcja1() nounwind {
  %1 = load i32, i32* @a
  %2 = icmp slt i32 %1, 20
  br i1 %2, label %true1, label %false1
  true1:
  %3 = load i32, i32* @a
  %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %3)
  %5 = load i32, i32* @a
  %6 = add i32 %5, 1
  store i32 %6, i32* @a
  call void @mojaFunkcja1()
  br label %false1
  false1:
  ret void
}

define void @mojaFunkcja2() nounwind {
  %mojaFunkcja2.inthahah = alloca i32
  store i32 420, i32* %mojaFunkcja2.inthahah
  %1 = load i32, i32* %mojaFunkcja2.inthahah
  %2 = add i32 %1, 1
  %3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %2)
  ret void
}

define i32 @main() nounwind {
store i32 1, i32* @a
call void @mojaFunkcja1()
  ret i32 0
}
