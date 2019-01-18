.source ar.ir
.class public ar
.super java/lang/Object
.method public static __main()V
    .limit locals 18
.var 0 is T0 [I from L0 to L5
.var 1 is T1 I from L0 to L5
.var 2 is T2 I from L0 to L5
.var 3 is T3 I from L0 to L5
.var 4 is T4 I from L0 to L5
.var 5 is T5 I from L0 to L5
.var 6 is T6 I from L0 to L5
.var 7 is T7 I from L0 to L5
.var 8 is T8 I from L0 to L5
.var 9 is T9 I from L0 to L5
.var 10 is T10 I from L0 to L5
.var 11 is T11 I from L0 to L5
.var 12 is T12 I from L0 to L5
.var 13 is T13 Z from L0 to L5
.var 14 is T14 Z from L0 to L5
.var 15 is T15 I from L0 to L5
.var 16 is T16 I from L0 to L5
.var 17 is T17 I from L0 to L5
    .limit stack 16
L0:
aconst_null
astore 0
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
ldc 0
istore 11
ldc 0
istore 12
ldc 0
istore 13
ldc 0
istore 14
ldc 0
istore 15
ldc 0
istore 16
ldc 0
istore 17
ldc 3
newarray int
astore 0
ldc 7
istore 3
ldc 0
istore 4
aload 0
iload 4
iload 3
iastore
ldc 24
istore 5
ldc 1
istore 6
aload 0
iload 6
iload 5
iastore
ldc 1
istore 7
iload 7
istore 1
ldc 2
istore 8
ldc 1
istore 9
iload 1
iload 9
iadd
istore 10
aload 0
iload 10
iload 8
iastore
ldc 0
istore 11
iload 11
istore 2
L1:
ldc 3
istore 12
iload 2
iload 12
if_icmplt L3
ldc 0
goto L4
L3:
ldc 1
L4:
istore 13
iload 13
istore 14
iload 14
ldc 1
ixor
istore 14
iload 14
ifne L2
aload 0
iload 2
iaload
istore 15
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 15
invokevirtual java/io/PrintStream/println(I)V
ldc 1
istore 16
iload 2
iload 16
iadd
istore 17
iload 17
istore 2
goto L1
L2:
return
L5:
.end method
.method public static main([Ljava/lang/String;)V
    .limit locals 1
    .limit stack 4
    invokestatic ar/__main()V
    return
.end method
.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method
