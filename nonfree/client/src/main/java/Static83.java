import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "Lclient!ff;")
	public static Class26 aClass26_19;

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "Lclient!jf;")
	public static Class26_Sub1 aClass26_Sub1_16;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "Lclient!r;")
	private static Class61 aClass61_660 = Static129.method2060("Too many connections from your address)3");

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Lclient!r;")
	public static Class61 aClass61_656 = aClass61_660;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "[I")
	public static int[] anIntArray289 = new int[2000];

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!r;")
	public static Class61 aClass61_657 = Static129.method2060("<col=00ff00>");

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Z")
	public static boolean aBoolean78 = false;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "J")
	public static long aLong72 = 0L;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "Lclient!ge;")
	public static Class29 aClass29_21 = new Class29(64);

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "Lclient!r;")
	private static Class61 aClass61_658 = Static129.method2060("Connection timed out)3");

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!r;")
	public static Class61 aClass61_659 = aClass61_658;

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
	public static int anInt2281 = 0;

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "Z")
	public static boolean aBoolean79 = false;

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
	public static int anInt2282 = 2;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBI)V")
	public static void method1500(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) long local15 = (long) (arg0 + (arg1 << 16));
		@Pc(21) Class5_Sub2_Sub4 local21 = (Class5_Sub2_Sub4) Static23.aClass20_2.method656(local15);
		if (local21 != null) {
			Static67.aClass83_2.method2201(local21);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)Z")
	public static boolean method1501(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(16) int local16 = Static38.anIntArray223[arg0];
		if (local16 >= 2000) {
			local16 -= 2000;
		}
		return local16 == 1004;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILclient!vd;III)V")
	public static void method1502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub1_Sub4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			return;
		}
		@Pc(12) int local12 = Static91.anInt2422 + Static129.anInt3240 & 0x7FF;
		@Pc(21) int local21 = arg0 * arg0 + arg1 * arg1;
		if (local21 > 6400) {
			return;
		}
		@Pc(29) int local29 = Class5_Sub2_Sub1_Sub2.anIntArray198[local12];
		@Pc(37) int local37 = local29 * 256 / (Static129.anInt3235 + 256);
		@Pc(41) int local41 = Class5_Sub2_Sub1_Sub2.anIntArray197[local12];
		@Pc(49) int local49 = local41 * 256 / (Static129.anInt3235 + 256);
		@Pc(59) int local59 = arg0 * local49 + local37 * arg1 >> 16;
		@Pc(69) int local69 = arg1 * local49 - arg0 * local37 >> 16;
		if (local21 <= 2500) {
			arg2.method2021(arg3 + local59 + 4 + 94 - arg2.anInt3195 / 2, arg4 + -4 + 83 + (-local69 - arg2.anInt3196 / 2));
		} else {
			arg2.method2016(Static79.aClass5_Sub2_Sub1_Sub3_4, arg3 + local59 + 98 - arg2.anInt3195 / 2, -local69 + (arg4 - (-83 - -(arg2.anInt3196 / 2)) - 4));
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Z")
	public static boolean method1503(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILclient!ff;)Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3 method1504(@OriginalArg(0) int arg0, @OriginalArg(2) Class26 arg1) {
		return Static71.method1183(arg0, arg1) ? Static93.method1600() : null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method1505() {
		aClass26_Sub1_16 = null;
		aClass29_21 = null;
		aClass61_658 = null;
		aClass61_660 = null;
		anIntArray289 = null;
		aClass61_659 = null;
		aClass26_19 = null;
		aClass61_657 = null;
		aClass61_656 = null;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V")
	public static void method1506(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static100.aBooleanArray13[arg0]) {
			return;
		}
		Static103.aClass26_24.method1028(arg0);
		if (Static56.aClass5_Sub11ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < Static56.aClass5_Sub11ArrayArray1[arg0].length; local27++) {
			if (Static56.aClass5_Sub11ArrayArray1[arg0][local27] != null) {
				if (Static56.aClass5_Sub11ArrayArray1[arg0][local27].anInt1669 == 2) {
					local25 = false;
				} else {
					Static56.aClass5_Sub11ArrayArray1[arg0][local27] = null;
				}
			}
		}
		if (local25) {
			Static56.aClass5_Sub11ArrayArray1[arg0] = null;
		}
		Static100.aBooleanArray13[arg0] = false;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!jc;ZLclient!jf;I)V")
	public static void method1507(@OriginalArg(0) Class40 arg0, @OriginalArg(2) Class26_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(3) byte[] local3 = null;
		@Pc(9) Class58 local9 = Static55.aClass58_30;
		synchronized (Static55.aClass58_30) {
			for (@Pc(22) Class5_Sub9 local22 = (Class5_Sub9) Static55.aClass58_30.method1669(); local22 != null; local22 = (Class5_Sub9) Static55.aClass58_30.method1664()) {
				if ((long) arg2 == local22.aLong100 && arg0 == local22.aClass40_1 && local22.anInt946 == 0) {
					local3 = local22.aByteArray18;
					break;
				}
			}
		}
		if (local3 == null) {
			@Pc(76) byte[] local76 = arg0.method1009(arg2);
			arg1.method1051(arg0, local76, arg2, true);
		} else {
			arg1.method1051(arg0, local3, arg2, true);
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public static void method1508() {
		Static30.anInt918 = -1;
		Static10.anInt232 = 0;
		Static2.anInt23 = 0;
		Static96.anInt2502 = 0;
		Static36.anInt1015 = 0;
		Static88.anInt3387 = 0;
		Static73.anInt1747 = -1;
		Static1.aClass5_Sub14_Sub1_1.anInt2199 = 0;
		Static88.anInt3389 = -1;
		Static80.anInt2057 = 0;
		Static117.aBoolean105 = false;
		Static126.anInt3161 = -1;
		Static47.aClass5_Sub14_Sub1_2.anInt2199 = 0;
		for (@Pc(35) int local35 = 0; local35 < Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1.length; local35++) {
			if (Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local35] != null) {
				Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local35].anInt2890 = -1;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1.length; local57++) {
			if (Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local57] != null) {
				Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local57].anInt2890 = -1;
			}
		}
		Static42.method756();
		Static36.method697(30);
		for (@Pc(82) int local82 = 0; local82 < 100; local82++) {
			Static48.aBooleanArray5[local82] = true;
		}
	}
}
