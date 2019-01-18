.source fact.ir
.class public fact
.super java/lang/Object
.method public static factorial(I)I
    .limit locals 10
.var 0 is T0 I from L0 to L5
.var 1 is T1 I from L0 to L5
.var 2 is T2 I from L0 to L5
.var 3 is T3 Z from L0 to L5
.var 4 is T4 Z from L0 to L5
.var 5 is T5 I from L0 to L5
.var 6 is T6 I from L0 to L5
.var 7 is T7 I from L0 to L5
.var 8 is T8 I from L0 to L5
.var 9 is T9 I from L0 to L5
    .limit stack 16
L0:
ldc 0
istore 1
ldc 0
istore 2
ldc 0
istore 3
ldc 0
istore 4
ldc 0
istore 5
ldc 0
istore 6
ldc 0
istore 7
ldc 0
istore 8
ldc 0
istore 9
ldc 1
istore 2
iload 0
iload 2
if_icmpeq L2
ldc 0
goto L3
L2:
ldc 1
L3:
istore 3
iload 3
istore 4
iload 4
ldc 1
ixor
istore 4
iload 4
ifne L1
ldc 1
istore 5
iload 5
istore 1
goto L4
L1:
ldc 1
istore 6
iload 0
iload 6
isub
istore 7
iload 7
invokestatic fact/factorial(I)I
istore 8
iload 0
iload 8
imul
istore 9
iload 9
istore 1
L4:
iload 1
ireturn
L5:
.end method
.method public static __main()V
    .limit locals 3
.var 0 is T0 Ljava/lang/String; from L0 to L1
.var 1 is T1 I from L0 to L1
.var 2 is T2 I from L0 to L1
    .limit stack 16
L0:
aconst_null
astore 0
ldc 0
istore 1
ldc 0
istore 2
ldc  "The factorial of 8 is "
astore 0
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "The factorial of 8 is "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
ldc 8
istore 1
iload 1
invokestatic fact/factorial(I)I
istore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
invokevirtual java/io/PrintStream/println(I)V
return
L1:
.end method
.method public static main([Ljava/lang/String;)V
    .limit locals 1
    .limit stack 4
    invokestatic fact/__main()V
    return
.end method
.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method
