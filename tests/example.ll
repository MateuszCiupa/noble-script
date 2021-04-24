@a = global i32 0
store i32 1, i32* %a
%0 = load i32, i32* %a
%1 = call i32 (i8, ...) @printf(i8 getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %0)
