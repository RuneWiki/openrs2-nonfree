import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ib", name = "O", descriptor = "Lclient!hg;")
	public static Class1_Sub2_Sub7_Sub1 aClass1_Sub2_Sub7_Sub1_2;

	@OriginalMember(owner = "client!ib", name = "U", descriptor = "I")
	public static int anInt2702;

	@OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
	public static int anInt2704;

	@OriginalMember(owner = "client!ib", name = "bb", descriptor = "[Lclient!q;")
	public static Class1_Sub2_Sub4_Sub1[] aClass1_Sub2_Sub4_Sub1Array1;

	@OriginalMember(owner = "client!ib", name = "cb", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ib", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString173 = "Loaded title screen";

	@OriginalMember(owner = "client!ib", name = "Z", descriptor = "[I")
	public static int[] anIntArray199 = new int[14];

	@OriginalMember(owner = "client!ib", name = "db", descriptor = "I")
	public static volatile int anInt2707 = -1;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B[B)Lclient!gf;")
	public static Class1_Sub2_Sub7 method2082(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(22) Class1_Sub2_Sub7_Sub1 local22 = new Class1_Sub2_Sub7_Sub1(arg0, Static202.anIntArray345, Static79.anIntArray165, Static218.anIntArray382, Static233.anIntArray438, Static11.aByteArrayArray1);
			Static259.method4155();
			return local22;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static3.method36(Static202.anInt4469, arg1, Static94.anInt4237);
		@Pc(22) int local22 = Static3.method36(Static202.anInt4469, arg0, Static94.anInt4237);
		@Pc(28) int local28 = Static3.method36(Static167.anInt3907, arg4, Static150.anInt3860);
		@Pc(34) int local34 = Static3.method36(Static167.anInt3907, arg3, Static150.anInt3860);
		@Pc(42) int local42 = Static3.method36(Static202.anInt4469, arg1 + arg6, Static94.anInt4237);
		@Pc(51) int local51 = Static3.method36(Static202.anInt4469, arg0 - arg6, Static94.anInt4237);
		for (@Pc(53) int local53 = local11; local53 < local42; local53++) {
			Static147.method2681(Static29.anIntArrayArray10[local53], arg5, local28, local34);
		}
		for (@Pc(73) int local73 = local22; local73 > local51; local73--) {
			Static147.method2681(Static29.anIntArrayArray10[local73], arg5, local28, local34);
		}
		@Pc(95) int local95 = Static3.method36(Static167.anInt3907, arg6 + arg4, Static150.anInt3860);
		@Pc(104) int local104 = Static3.method36(Static167.anInt3907, arg3 - arg6, Static150.anInt3860);
		for (@Pc(106) int local106 = local42; local106 <= local51; local106++) {
			@Pc(112) int[] local112 = Static29.anIntArrayArray10[local106];
			Static147.method2681(local112, arg5, local28, local95);
			Static147.method2681(local112, arg2, local95, local104);
			Static147.method2681(local112, arg5, local104, local34);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method2084(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Static171.aClass1_Sub13_Sub1_3.method1825(250);
		Static171.aClass1_Sub13_Sub1_3.method1795(Static93.method2008(arg1));
		Static171.aClass1_Sub13_Sub1_3.method1767(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "(I)V")
	public static void method2085() {
		Static253.anInt3818 = 0;
		Static186.anInt4188 = 0;
		Static233.method3887();
		Static13.method231();
		Static205.method3437();
		@Pc(30) int local30;
		for (@Pc(24) int local24 = 0; local24 < Static186.anInt4188; local24++) {
			local30 = Static223.anIntArray429[local24];
			if (Static36.aClass9_Sub1_Sub2Array2[local30].anInt484 != Static156.anInt3722) {
				if (Static36.aClass9_Sub1_Sub2Array2[local30].aClass45_1.method1459()) {
					Static9.method183(Static36.aClass9_Sub1_Sub2Array2[local30]);
				}
				Static36.aClass9_Sub1_Sub2Array2[local30].method223(null);
				Static36.aClass9_Sub1_Sub2Array2[local30] = null;
			}
		}
		if (Static149.anInt3579 != Static58.aClass1_Sub13_Sub1_1.anInt2395) {
			throw new RuntimeException("gnp1 pos:" + Static58.aClass1_Sub13_Sub1_1.anInt2395 + " psize:" + Static149.anInt3579);
		}
		for (local30 = 0; local30 < Static16.anInt4955; local30++) {
			if (Static36.aClass9_Sub1_Sub2Array2[Static142.anIntArray260[local30]] == null) {
				throw new RuntimeException("gnp2 pos:" + local30 + " size:" + Static16.anInt4955);
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	public static void method2086() {
		if (Static239.aClass55_2 != null) {
			Static239.aClass55_2.method3205();
		}
		if (Static90.aClass55_1 != null) {
			Static90.aClass55_1.method3205();
		}
	}
}
