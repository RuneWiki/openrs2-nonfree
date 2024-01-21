import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "Lclient!ed;")
	public static Class2_Sub1_Sub6 aClass2_Sub1_Sub6_5;

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "Lclient!kc;")
	private static Class36 aClass36_985 = Static14.method2017("Connection timed out)3");

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Lclient!kc;")
	public static Class36 aClass36_982 = aClass36_985;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Lclient!kc;")
	public static Class36 aClass36_983 = Static14.method2017("*6n");

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Lclient!kc;")
	public static Class36 aClass36_984 = Static14.method2017("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "Lclient!kc;")
	private static Class36 aClass36_986 = Static14.method2017("Take");

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "Lclient!kc;")
	private static Class36 aClass36_987 = Static14.method2017("Loading wordpack )2 ");

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "J")
	public static long aLong66 = 0L;

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
	public static int anInt2095 = 0;

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "Lclient!kc;")
	public static Class36 aClass36_988 = aClass36_987;

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "Lclient!kc;")
	public static Class36 aClass36_989 = aClass36_986;

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "Lclient!kc;")
	public static Class36 aClass36_990 = Static14.method2017(":  ");

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Lclient!ba;")
	public static Class2_Sub1_Sub2 method1504(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub2 local10 = (Class2_Sub1_Sub2) Static59.aClass22_23.method711((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static22.method484(Static90.aClass3_21, Static67.aClass3_16, arg0);
		if (local10 != null) {
			Static59.aClass22_23.method712(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)V")
	public static void method1505(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static100.aBooleanArray14[arg0]) {
			return;
		}
		Static91.aClass3_22.method937(arg0);
		if (Static42.aClass2_Sub1_Sub6ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(27) boolean local27 = true;
		for (@Pc(29) int local29 = 0; local29 < Static42.aClass2_Sub1_Sub6ArrayArray1[arg0].length; local29++) {
			if (Static42.aClass2_Sub1_Sub6ArrayArray1[arg0][local29] != null) {
				if (Static42.aClass2_Sub1_Sub6ArrayArray1[arg0][local29].anInt676 == 2) {
					local27 = false;
				} else {
					Static42.aClass2_Sub1_Sub6ArrayArray1[arg0][local29] = null;
				}
			}
		}
		if (local27) {
			Static42.aClass2_Sub1_Sub6ArrayArray1[arg0] = null;
		}
		Static100.aBooleanArray14[arg0] = false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public static void method1506() {
		Static67.aClass27_1.method1923();
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			Static64.aLongArray5[local18] = 0L;
		}
		for (@Pc(32) int local32 = 0; local32 < 32; local32++) {
			Static24.aLongArray3[local32] = 0L;
		}
		Static66.anInt1693 = 0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public static void method1507() {
		Static45.anInt1227 = 0;
		Static43.anInt1141 = 0;
		Static22.anInt576 = 0;
		Static15.anInt318 = -1;
		Static112.anInt2926 = -1;
		Static10.anInt253 = -1;
		Static10.anInt243 = 0;
		Static1.anInt2 = 0;
		Static73.aBoolean82 = false;
		Static111.anInt2876 = 0;
		Static42.aClass2_Sub12_Sub1_1.anInt1939 = 0;
		Static33.anInt426 = -1;
		Static92.aClass2_Sub12_Sub1_3.anInt1939 = 0;
		for (@Pc(35) int local35 = 0; local35 < Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1.length; local35++) {
			if (Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local35] != null) {
				Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local35].anInt2157 = -1;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1.length; local57++) {
			if (Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local57] != null) {
				Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local57].anInt2157 = -1;
			}
		}
		Static14.method2021();
		Static104.method1914(30);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)I")
	public static int method1508() {
		return Static86.anInt2232++;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)I")
	public static int method1509(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static16.aByteArrayArrayArray3[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static16.aByteArrayArrayArray3[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public static void method1510() {
		aClass36_984 = null;
		anIntArrayArray25 = null;
		aClass36_982 = null;
		aClass2_Sub1_Sub6_5 = null;
		aClass36_987 = null;
		aClass36_983 = null;
		aClass36_988 = null;
		aClass36_990 = null;
		aClass36_985 = null;
		aClass36_986 = null;
		aClass36_989 = null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BII)I")
	public static int method1511(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) ((arg1 << 16) + arg0);
		return Static82.aClass2_Sub1_Sub3_1 != null && Static82.aClass2_Sub1_Sub3_1.aLong89 == local10 ? Static15.aClass2_Sub12_1.anInt1939 * 99 / (Static15.aClass2_Sub12_1.aByteArray20.length - Static82.aClass2_Sub1_Sub3_1.aByte1) + 1 : 0;
	}
}
