.source foo3.ir
.class public foo3
.super java/lang/Object
.method public static __main()V
    .limit locals 10
.var 0 is T0 I from L0 to L5
.var 1 is T1 I from L0 to L5
.var 2 is T2 I from L0 to L5
.var 3 is T3 I from L0 to L5
.var 4 is T4 Z from L0 to L5
.var 5 is T5 Z from L0 to L5
.var 6 is T6 I from L0 to L5
.var 7 is T7 I from L0 to L5
.var 8 is T8 I from L0 to L5
.var 9 is T9 I from L0 to L5
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
ldc 10
istore 2
iload 2
istore 0
ldc 1
istore 3
iload 3
istore 1
L1:
iload 1
iload 0
if_icmplt L3
ldc 0
goto L4
L3:
ldc 1
L4:
istore 4
iload 4
istore 5
iload 5
ldc 1
ixor
istore 5
iload 5
ifne L2
ldc 1
istore 6
iload 1
iload 6
iadd
istore 7
iload 7
istore 1
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/println(I)V
goto L1
L2:
ldc 10
istore 8
iload 0
iload 8
iadd
istore 9
iload 9
istore 0
return
L5:
.end method
.method public static main([Ljava/lang/String;)V
    .limit locals 1
    .limit stack 4
    invokestatic foo3/__main()V
    return
.end method
.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method
