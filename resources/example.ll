declare i32 @printf(i8*, ...)
@str0 = constant[19 x i8] c"LLVM Hello world!\0A\00"
define i32 @main() nounwind{
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [19 x i8], [19 x i8]* @str0, i32 0, i32 0))
ret i32 0 }
