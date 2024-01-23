import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_17;

	@OriginalMember(owner = "client!je", name = "v", descriptor = "Lclient!kh;")
	public static Class60 aClass60_708;

	@OriginalMember(owner = "client!je", name = "y", descriptor = "Lclient!ch;")
	public static Class1_Sub1_Sub6 aClass1_Sub1_Sub6_2;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!kh;")
	public static Class60 aClass60_704 = Static200.method3116("<col=80ff00>");

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!kh;")
	public static Class60 aClass60_705 = Static200.method3116("(U3");

	@OriginalMember(owner = "client!je", name = "f", descriptor = "Lclient!kh;")
	public static Class60 aClass60_706 = Static200.method3116("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!je", name = "g", descriptor = "I")
	public static int anInt2191 = 0;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "I")
	public static int anInt2196 = 0;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Lclient!nc;")
	public static Class1_Sub9 aClass1_Sub9_5 = new Class1_Sub9(8);

	@OriginalMember(owner = "client!je", name = "r", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!je", name = "s", descriptor = "Lclient!kh;")
	public static Class60 aClass60_707 = Static200.method3116("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!je", name = "x", descriptor = "Lclient!kh;")
	public static Class60 aClass60_709 = Static200.method3116("<img=0>");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I[III[I)V")
	public static void method1625(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(3) int local3 = arg2;
		if (arg2 > 25) {
			local3 = 25;
		}
		arg2--;
		@Pc(13) int local13 = arg3[arg2];
		@Pc(21) int local21 = arg1[arg2];
		if (arg0 == 0) {
			Static96.aClass1_Sub9_Sub1_3.method953(200);
			Static96.aClass1_Sub9_Sub1_3.method899(local3 + local3 + 3);
		}
		if (arg0 == 1) {
			Static96.aClass1_Sub9_Sub1_3.method953(199);
			Static96.aClass1_Sub9_Sub1_3.method899(local3 + local3 + 3 + 14);
		}
		if (arg0 == 2) {
			Static96.aClass1_Sub9_Sub1_3.method953(159);
			Static96.aClass1_Sub9_Sub1_3.method899(local3 + local3 + 3);
		}
		Static96.aClass1_Sub9_Sub1_3.method890(local21 + Static163.anInt3587);
		Static96.aClass1_Sub9_Sub1_3.method889(Static49.aBooleanArray5[82] ? 1 : 0);
		Static170.anInt3695 = arg1[0];
		Static56.anInt1484 = arg3[0];
		for (@Pc(110) int local110 = 1; local110 < local3; local110++) {
			arg2--;
			Static96.aClass1_Sub9_Sub1_3.method908(arg3[arg2] - local13);
			Static96.aClass1_Sub9_Sub1_3.method889(arg1[arg2] - local21);
		}
		Static96.aClass1_Sub9_Sub1_3.method943(local13 + Static128.anInt2813);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method1626() {
		Static173.aByteArrayArrayArray8 = null;
		Static148.anIntArray653 = null;
		Static100.aByteArrayArrayArray3 = null;
		Static36.anIntArrayArrayArray22 = null;
		Static66.aByteArrayArrayArray1 = null;
		Static163.anIntArray464 = null;
		Static160.anIntArray459 = null;
		Static80.anIntArray222 = null;
		Static108.aByteArrayArrayArray4 = null;
		Static201.aByteArrayArrayArray12 = null;
		Static125.anIntArray357 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII)V")
	public static void method1627() {
		Static44.aClass1_Sub22ArrayArrayArray1 = new Class1_Sub22[4][104][104];
		Static130.anIntArrayArrayArray16 = new int[4][105][105];
		Static59.method1084();
		Static83.anInt1959 = 104;
		Static150.anInt3350 = 104;
		Static49.anIntArrayArrayArray5 = new int[4][105][105];
		Static26.method432();
		Static39.anInt884 = 25;
		Static86.aBooleanArrayArray1 = new boolean[Static39.anInt884 + Static39.anInt884 + 1][Static39.anInt884 + Static39.anInt884 + 1];
		Static138.aBooleanArrayArray2 = new boolean[Static39.anInt884 + Static39.anInt884 + 2][Static39.anInt884 + Static39.anInt884 + 2];
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Z")
	public static boolean method1629(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)I")
	public static int method1630(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg1 >>> 31;
		return (arg1 + local3) / arg0 - local3;
	}
}
