import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "J")
	public static long aLong62;

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray16 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_28 = new Class11(57, 2);

	@OriginalMember(owner = "client!eu", name = "j", descriptor = "Lclient!eo;")
	public static final Class62 aClass62_2 = new Class62(12, 17);

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "[I")
	public static final int[] anIntArray360 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IB)I")
	public static int method1518(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "([I[JI)V")
	public static void method1520(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static54.method3540(arg1, 0, arg0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!nl;ILclient!vg;Lclient!nl;Lclient!nl;)Z")
	public static boolean method1521(@OriginalArg(0) Class171 arg0, @OriginalArg(2) Class2_Sub2_Sub4 arg1, @OriginalArg(3) Class171 arg2, @OriginalArg(4) Class171 arg3) {
		Static349.aClass171_71 = arg2;
		Static249.aClass2_Sub2_Sub4_42 = arg1;
		Static234.aClass171_56 = arg3;
		Static345.aClass171_99 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1522(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			local8 = Static222.method3652(arg0.charAt(local10)) + (local8 << 5) - local8;
		}
		return local8;
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V")
	public static void method1523() {
		Static284.method4322(Static111.aClass63_3, (long) Static253.anInt4469);
		if (Static234.anInt4158 != -1) {
			Static319.method4719(Static234.anInt4158);
		}
		for (@Pc(18) int local18 = 0; local18 < Static86.anInt1651; local18++) {
			if (Static331.aBooleanArray30[local18]) {
				Static51.aBooleanArray7[local18] = true;
			}
			Static135.aBooleanArray19[local18] = Static331.aBooleanArray30[local18];
			Static331.aBooleanArray30[local18] = false;
		}
		Static207.anInt4908 = Static253.anInt4469;
		if (Static111.aClass63_3.method2032()) {
			Static140.aBoolean211 = true;
		}
		if (Static234.anInt4158 != -1) {
			Static86.anInt1651 = 0;
			Static140.method2660();
		}
		Static111.aClass63_3.method1967();
		Static68.method1081(Static143.anInt2866);
		Static64.anInt1278 = 0;
	}
}
