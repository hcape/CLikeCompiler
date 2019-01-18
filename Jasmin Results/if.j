.source if.ir
.class public if
.super java/lang/Object
.method public static less(II)V
    .limit locals 5
.var 0 is T0 I from L0 to L4
.var 1 is T1 I from L0 to L4
.var 2 is T2 Z from L0 to L4
.var 3 is T3 Z from L0 to L4
.var 4 is T4 Ljava/lang/String; from L0 to L4
    .limit stack 16
L0:
ldc 0
istore 2
ldc 0
istore 3
aconst_null
astore 4
iload 0
iload 1
if_icmplt L2
ldc 0
goto L3
L2:
ldc 1
L3:
istore 2
iload 2
istore 3
iload 3
ldc 1
ixor
istore 3
iload 3
ifne L1
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/print(I)V
ldc  " is less than "
astore 4
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " is less than "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
L1:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/println(I)V
return
L4:
.end method
.method public static __main()V
    .limit locals 2
.var 0 is T0 I from L0 to L1
.var 1 is T1 I from L0 to L1
    .limit stack 16
L0:
ldc 0
istore 0
ldc 0
istore 1
ldc 2
istore 0
ldc 3
istore 1
iload 0
iload 1
invokestatic if/less(II)V
return
L1:
.end method
.method public static main([Ljava/lang/String;)V
    .limit locals 1
    .limit stack 4
    invokestatic if/__main()V
    return
.end method
.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method
