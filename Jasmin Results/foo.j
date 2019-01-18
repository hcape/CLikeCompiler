.source foo.ir
.class public foo
.super java/lang/Object
.method public static foo(II)I
    .limit locals 11
.var 0 is T0 I from L0 to L1
.var 1 is T1 I from L0 to L1
.var 2 is T2 F from L0 to L1
.var 3 is T3 Ljava/lang/String; from L0 to L1
.var 4 is T4 C from L0 to L1
.var 5 is T5 [I from L0 to L1
.var 6 is T6 C from L0 to L1
.var 7 is T7 I from L0 to L1
.var 8 is T8 Ljava/lang/String; from L0 to L1
.var 9 is T9 F from L0 to L1
.var 10 is T10 I from L0 to L1
    .limit stack 16
L0:
ldc 0.0
fstore 2
aconst_null
astore 3
ldc 0
istore 4
aconst_null
astore 5
ldc 0
istore 6
ldc 0
istore 7
aconst_null
astore 8
ldc 0.0
fstore 9
ldc 0
istore 10
ldc 3
newarray int
astore 5
ldc 65
istore 6
iload 6
istore 4
ldc 7
istore 7
iload 7
istore 0
ldc  "Hi there"
astore 8
aload 8
astore 3
ldc 3.732
fstore 9
fload 9
fstore 2
iload 0
istore 1
ldc 8
istore 10
iload 10
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
ldc 2
istore 1
iload 0
iload 1
invokestatic foo/foo(II)I
istore 2
return
L1:
.end method
.method public static main([Ljava/lang/String;)V
    .limit locals 1
    .limit stack 4
    invokestatic foo/__main()V
    return
.end method
.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method
