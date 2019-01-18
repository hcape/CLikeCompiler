.source towersOfHanoi.ir
.class public towersOfHanoi
.super java/lang/Object
.method public static towersOfHanoi(ICCC)V
    .limit locals 16
.var 0 is T0 I from L0 to L5
.var 1 is T1 C from L0 to L5
.var 2 is T2 C from L0 to L5
.var 3 is T3 C from L0 to L5
.var 4 is T4 I from L0 to L5
.var 5 is T5 Z from L0 to L5
.var 6 is T6 Z from L0 to L5
.var 7 is T7 Ljava/lang/String; from L0 to L5
.var 8 is T8 Ljava/lang/String; from L0 to L5
.var 9 is T9 I from L0 to L5
.var 10 is T10 I from L0 to L5
.var 11 is T11 Ljava/lang/String; from L0 to L5
.var 12 is T12 Ljava/lang/String; from L0 to L5
.var 13 is T13 Ljava/lang/String; from L0 to L5
.var 14 is T14 I from L0 to L5
.var 15 is T15 I from L0 to L5
    .limit stack 16
L0:
ldc 0
istore 4
ldc 0
istore 5
ldc 0
istore 6
aconst_null
astore 7
aconst_null
astore 8
ldc 0
istore 9
ldc 0
istore 10
aconst_null
astore 11
aconst_null
astore 12
aconst_null
astore 13
ldc 0
istore 14
ldc 0
istore 15
ldc 1
istore 4
iload 0
iload 4
if_icmpeq L2
ldc 0
goto L3
L2:
ldc 1
L3:
istore 5
iload 5
istore 6
iload 6
ldc 1
ixor
istore 6
iload 6
ifne L1
ldc  "Move disk 1 from rod "
astore 7
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Move disk 1 from rod "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/print(C)V
ldc  " to rod "
astore 8
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " to rod "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
i2c
invokevirtual java/io/PrintStream/println(C)V
goto L4
L1:
ldc 1
istore 9
iload 0
iload 9
isub
istore 10
iload 10
iload 1
iload 3
iload 2
invokestatic towersOfHanoi/towersOfHanoi(ICCC)V
ldc  "Move disk "
astore 11
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Move disk "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/print(I)V
ldc  " from rod "
astore 12
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " from rod "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/print(C)V
ldc  " to rod "
astore 13
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " to rod "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
i2c
invokevirtual java/io/PrintStream/println(C)V
ldc 1
istore 14
iload 0
iload 14
isub
istore 15
iload 15
iload 3
iload 2
iload 1
invokestatic towersOfHanoi/towersOfHanoi(ICCC)V
L4:
return
L5:
.end method
.method public static __main()V
    .limit locals 5
.var 0 is T0 I from L0 to L1
.var 1 is T1 I from L0 to L1
.var 2 is T2 C from L0 to L1
.var 3 is T3 C from L0 to L1
.var 4 is T4 C from L0 to L1
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
ldc 4
istore 1
iload 1
istore 0
ldc 65
istore 2
ldc 67
istore 3
ldc 66
istore 4
iload 0
iload 2
iload 3
iload 4
invokestatic towersOfHanoi/towersOfHanoi(ICCC)V
return
L1:
.end method
.method public static main([Ljava/lang/String;)V
    .limit locals 1
    .limit stack 4
    invokestatic towersOfHanoi/__main()V
    return
.end method
.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method
