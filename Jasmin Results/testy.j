.source testy.ir
.class public testy
.super java/lang/Object
.method public static __main()V
    .limit locals 14
.var 0 is T0 Ljava/lang/String; from L0 to L7
.var 1 is T1 Ljava/lang/String; from L0 to L7
.var 2 is T2 Ljava/lang/String; from L0 to L7
.var 3 is T3 Ljava/lang/String; from L0 to L7
.var 4 is T4 Ljava/lang/String; from L0 to L7
.var 5 is T5 Ljava/lang/String; from L0 to L7
.var 6 is T6 Ljava/lang/String; from L0 to L7
.var 7 is T7 Z from L0 to L7
.var 8 is T8 Z from L0 to L7
.var 9 is T9 Ljava/lang/String; from L0 to L7
.var 10 is T10 Ljava/lang/String; from L0 to L7
.var 11 is T11 Z from L0 to L7
.var 12 is T12 Z from L0 to L7
.var 13 is T13 Ljava/lang/String; from L0 to L7
    .limit stack 16
L0:
aconst_null
astore 0
aconst_null
astore 1
aconst_null
astore 2
aconst_null
astore 3
aconst_null
astore 4
aconst_null
astore 5
aconst_null
astore 6
ldc 0
istore 7
ldc 0
istore 8
aconst_null
astore 9
aconst_null
astore 10
ldc 0
istore 11
ldc 0
istore 12
aconst_null
astore 13
ldc  "Hello"
astore 4
aload 4
astore 0
ldc  "Bye"
astore 5
aload 5
astore 1
new java/lang/StringBuffer
dup
invokenonvirtual java/lang/StringBuffer/<init>()V
aload 0
invokevirtual java/lang/StringBuffer/append(Ljava/lang/String;)Ljava/lang/StringBuffer;
aload 1
invokevirtual java/lang/StringBuffer/append(Ljava/lang/String;)Ljava/lang/StringBuffer;
invokevirtual java/lang/StringBuffer/toString()Ljava/lang/String;
astore 6
aload 6
astore 2
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 2
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 1
aload 0
invokevirtual java/lang/String/compareTo(Ljava/lang/String;)I
iflt L2
ldc 0
goto L3
L2:
ldc 1
L3:
istore 7
iload 7
istore 8
iload 8
ldc 1
ixor
istore 8
iload 8
ifne L1
ldc  "yes"
astore 9
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 9
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L1:
ldc  "Bye"
astore 10
aload 10
astore 3
aload 1
aload 3
invokevirtual java/lang/String/compareTo(Ljava/lang/String;)I
ifeq L5
ldc 0
goto L6
L5:
ldc 1
L6:
istore 11
iload 11
istore 12
iload 12
ldc 1
ixor
istore 12
iload 12
ifne L4
ldc  "yesagain"
astore 13
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 13
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L4:
return
L7:
.end method
.method public static main([Ljava/lang/String;)V
    .limit locals 1
    .limit stack 4
    invokestatic testy/__main()V
    return
.end method
.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method
