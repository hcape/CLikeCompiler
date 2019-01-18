.source expr.ir
.class public expr
.super java/lang/Object
.method public static __main()V
    .limit locals 11
.var 0 is T0 I from L0 to L1
.var 1 is T1 I from L0 to L1
.var 2 is T2 I from L0 to L1
.var 3 is T3 I from L0 to L1
.var 4 is T4 I from L0 to L1
.var 5 is T5 I from L0 to L1
.var 6 is T6 I from L0 to L1
.var 7 is T7 I from L0 to L1
.var 8 is T8 I from L0 to L1
.var 9 is T9 I from L0 to L1
.var 10 is T10 I from L0 to L1
    .limit stack 16
L0:
ldc 0
istore 0
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
ldc 0
istore 10
ldc 1
istore 3
iload 3
istore 0
ldc 2
istore 4
iload 4
istore 1
ldc 3
istore 5
iload 5
istore 2
ldc 1
istore 6
iload 1
iload 6
iadd
istore 7
iload 0
iload 7
imul
istore 8
ldc 7
istore 9
iload 8
iload 9
iadd
istore 10
iload 10
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
    invokestatic expr/__main()V
    return
.end method
.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method
