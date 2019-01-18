.source foo4.ir
.class public foo4
.super java/lang/Object
.method public static foo(II)I
    .limit locals 3
.var 0 is T0 I from L0 to L1
.var 1 is T1 I from L0 to L1
.var 2 is T2 I from L0 to L1
    .limit stack 16
L0:
ldc 0
istore 2
iload 0
iload 1
iadd
istore 2
iload 2
ireturn
L1:
.end method
.method public static __main()V
    .limit locals 3
.var 0 is T0 I from L0 to L1
.var 1 is T1 I from L0 to L1
.var 2 is T2 I from L0 to L1
    .limit stack 16
L0:
ldc 0
istore 0
ldc 0
istore 1
ldc 0
istore 2
ldc 2
istore 0
ldc 3
istore 1
iload 0
iload 1
invokestatic foo4/foo(II)I
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
    invokestatic foo4/__main()V
    return
.end method
.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method
