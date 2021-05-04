declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%d\00"
@strsd = constant [4 x i8] c"%lf\00"

@globalnyInt = global i32 0
@str1 = constant[47 x i8] c"Operacja na zmiennych lokalnych i globalnych:\0A\00"
@str2 = constant[2 x i8] c"\0A\00"
@str3 = constant[11 x i8] c"double x:\0A\00"
@str4 = constant[8 x i8] c"int y:\0A\00"
@str5 = constant[2 x i8] c"\0A\00"
@str6 = constant[29 x i8] c"Dodawanie double x + int y:\0A\00"
@str7 = constant[48 x i8] c"Kolejnosc wykonywania operacji arytmetycznych:\0A\00"
@str8 = constant[2 x i8] c"\0A\00"
@str9 = constant[9 x i8] c"Arrays:\0A\00"
@str10 = constant[2 x i8] c"\0A\00"
@str11 = constant[12 x i8] c"Podaj int:\0A\00"
@str12 = constant[15 x i8] c"Podaj double:\0A\00"
define i32 @main() nounwind {
  store i32 100, i32* @globalnyInt
  %1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [47 x i8], [47 x i8]* @str1, i32 0, i32 0))
  %lokalnyInt = alloca i32
  store i32 1, i32* %lokalnyInt
  %2 = load i32, i32* @globalnyInt
  %3 = load i32, i32* %lokalnyInt
  %4 = add i32 %2, %3
  %5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %4)
  %6 = load i32, i32* @globalnyInt
  %7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %6)
  %8 = load i32, i32* %lokalnyInt
  %9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %8)
  %10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [2 x i8], [2 x i8]* @str2, i32 0, i32 0))
  %11 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [11 x i8], [11 x i8]* @str3, i32 0, i32 0))
  %12 = sitofp i32 1 to double
  %13 = fadd double 2.0, %12
  %x = alloca double
  store double %13, double* %x
  %14 = load double, double* %x
  %15 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %14)
  %16 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [8 x i8], [8 x i8]* @str4, i32 0, i32 0))
  %y = alloca i32
  store i32 1, i32* %y
  %17 = load i32, i32* %y
  %18 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %17)
  %19 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [2 x i8], [2 x i8]* @str5, i32 0, i32 0))
  %20 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [29 x i8], [29 x i8]* @str6, i32 0, i32 0))
  %21 = load double, double* %x
  %22 = load i32, i32* %y
  %23 = sitofp i32 %22 to double
  %24 = fadd double %21, %23
  %25 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %24)
  %26 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [48 x i8], [48 x i8]* @str7, i32 0, i32 0))
  %27 = mul i32 2, 2
  %28 = add i32 2, %27
  %29 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %28)
  %30 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [2 x i8], [2 x i8]* @str8, i32 0, i32 0))
  %31 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [9 x i8], [9 x i8]* @str9, i32 0, i32 0))
  %mojaTablica = alloca [10 x i32], align 16
  %32 = getelementptr inbounds [10 x i32],[10 x i32]* %mojaTablica, i64 0, i64 0
  store i32 69, i32* %32
  %33 = getelementptr inbounds [10 x i32],[10 x i32]* %mojaTablica, i64 0, i64 9
  store i32 31, i32* %33
  %34 = getelementptr inbounds [10 x i32],[10 x i32 ]* %mojaTablica, i64 0, i64 0
  %35 = load i32, i32* %34, align 4
  %36 = getelementptr inbounds [10 x i32],[10 x i32 ]* %mojaTablica, i64 0, i64 9
  %37 = load i32, i32* %36, align 4
  %38 = add i32 %35, %37
  %39 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %38)
  %40 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [2 x i8], [2 x i8]* @str10, i32 0, i32 0))
  %41 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [12 x i8], [12 x i8]* @str11, i32 0, i32 0))
  %42 = alloca i32
  %43 = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strsi, i32 0, i32 0), i32* %42)
  %44 = load i32, i32* %42
  %a = alloca i32
  store i32 %44, i32* %a
  %45 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ( [15 x i8], [15 x i8]* @str12, i32 0, i32 0))
  %46 = load i32, i32* %a
  %47 = alloca double%48 = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strsd, i32 0, i32 0), double* %47)
  %49 = load double, double* %47
  %50 = sitofp i32 %46 to double
  %51 = fadd double %50, %49
  %52 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %51)
  ret i32 0
}
