.source foo2.ir
.class public foo2
.super java/lang/Object
.method public static foo(II)V
    .limit locals 10
.var 0 is T0 I from L0 to L3
.var 1 is T1 I from L0 to L3
.var 2 is T2 I from L0 to L3
.var 3 is T3 I from L0 to L3
.var 4 is T4 I from L0 to L3
.var 5 is T5 I from L0 to L3
.var 6 is T6 I from L0 to L3
.var 7 is T7 I from L0 to L3
.var 8 is T8 I from L0 to L3
.var 9 is T9 Z from L0 to L3
    .limit stack 16
L0:
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
ldc 7
istore 3
iload 3
iload 1
imul
istore 4
iload 0
iload 4
iadd
istore 5
ldc 2
istore 6
iload 5
iload 6
iadd
istore 7
iload 7
istore 2
iload 0
iload 1
iadd
istore 8
iload 8
istore 2
iload 0
iload 1
if_icmpeq L1
ldc 0
goto L2
L1:
ldc 1
L2:
istore 9
return
L3:
.end method
.method public static foo2(FF)V
    .limit locals 9
.var 0 is T0 F from L0 to L1
.var 1 is T1 F from L0 to L1
.var 2 is T2 F from L0 to L1
.var 3 is T3 F from L0 to L1
.var 4 is T4 F from L0 to L1
.var 5 is T5 F from L0 to L1
.var 6 is T6 F from L0 to L1
.var 7 is T7 F from L0 to L1
.var 8 is T8 F from L0 to L1
    .limit stack 16
L0:
ldc 0.0
fstore 2
ldc 0.0
fstore 3
ldc 0.0
fstore 4
ldc 0.0
fstore 5
ldc 0.0
fstore 6
ldc 0.0
fstore 7
ldc 0.0
fstore 8
ldc 7.0
fstore 3
fload 3
fload 1
fmul
fstore 4
fload 0
fload 4
fadd
fstore 5
ldc 2.0
fstore 6
fload 5
fload 6
fadd
fstore 7
fload 7
fstore 2
fload 0
fload 1
fadd
fstore 8
fload 8
fstore 2
return
L1:
.end method
.method public static __main()V
    .limit locals 4
.var 0 is T0 I from L0 to L1
.var 1 is T1 I from L0 to L1
.var 2 is T2 F from L0 to L1
.var 3 is T3 F from L0 to L1
    .limit stack 16
L0:
ldc 0
istore 0
ldc 0
istore 1
ldc 0.0
fstore 2
ldc 0.0
fstore 3
ldc 2
istore 0
ldc 4
istore 1
iload 0
iload 1
invokestatic foo2/foo(II)V
ldc 2.0
fstore 2
ldc 9.0
fstore 3
fload 2
fload 3
invokestatic foo2/foo2(FF)V
return
L1:
.end method
.method public static main([Ljava/lang/String;)V
    .limit locals 1
    .limit stack 4
    invokestatic foo2/__main()V
    return
.end method
.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method
