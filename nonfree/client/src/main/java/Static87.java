import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "Lclient!rd;")
	public static Class64 aClass64_43;

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
	public static int anInt1450;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "Lclient!ad;")
	public static Class4 aClass4_740 = Static75.method1216("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "Lclient!bb;")
	public static Class8 aClass8_19 = new Class8(128);

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "Lclient!ad;")
	private static Class4 aClass4_743 = Static75.method1216("New User");

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "Lclient!ad;")
	public static Class4 aClass4_741 = aClass4_743;

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
	public static final int anInt1452 = 50;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "[I")
	public static int[] anIntArray201 = new int[anInt1452];

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "[I")
	public static int[] anIntArray202 = new int[anInt1452];

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "Lclient!ad;")
	public static Class4 aClass4_742 = Static75.method1216("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "[Lclient!ad;")
	public static Class4[] aClass4Array11 = new Class4[anInt1452];

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "Lclient!ad;")
	public static Class4 aClass4_744 = Static75.method1216("backhmid2");

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "[I")
	public static int[] anIntArray203 = new int[anInt1452];

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "[I")
	public static int[] anIntArray204 = new int[anInt1452];

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
	public static int anInt1449 = 0;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "[I")
	public static int[] anIntArray205 = new int[128];

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "Lclient!ad;")
	private static Class4 aClass4_748 = Static75.method1216("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!qd", name = "y", descriptor = "Lclient!ad;")
	public static Class4 aClass4_745 = aClass4_748;

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "Lclient!ad;")
	private static Class4 aClass4_746 = Static75.method1216("Offline");

	@OriginalMember(owner = "client!qd", name = "A", descriptor = "[I")
	public static int[] anIntArray206 = new int[anInt1452];

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "Lclient!ad;")
	public static Class4 aClass4_747 = aClass4_746;

	@OriginalMember(owner = "client!qd", name = "C", descriptor = "[I")
	public static int[] anIntArray207 = new int[anInt1452];

	@OriginalMember(owner = "client!qd", name = "D", descriptor = "[I")
	public static int[] anIntArray208 = new int[anInt1452];

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
	public static int anInt1451 = 0;

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "J")
	public static long aLong49 = 0L;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
	public static synchronized void method986() {
		if (Static19.aClass3_Sub3_1 != null) {
			Static19.aClass3_Sub3_1.method1047(256);
		}
		Static69.method1520(256);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!v;I)V")
	public static synchronized void method987(@OriginalArg(0) Class3_Sub3 arg0) {
		Static19.aClass3_Sub3_1 = arg0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!ub;IB)V")
	public static void method988(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub4_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			return;
		}
		@Pc(12) int local12 = Static111.anInt2786 + Static109.anInt2749 & 0x7FF;
		@Pc(21) int local21 = arg2 * arg2 + arg0 * arg0;
		if (local21 > 6400) {
			return;
		}
		@Pc(39) int local39 = Static41.anIntArray149[local12];
		@Pc(47) int local47 = local39 * 256 / (Static89.anInt2041 + 256);
		@Pc(51) int local51 = Static41.anIntArray142[local12];
		@Pc(59) int local59 = local51 * 256 / (Static89.anInt2041 + 256);
		@Pc(69) int local69 = local59 * arg2 + arg0 * local47 >> 16;
		@Pc(80) int local80 = arg0 * local59 - arg2 * local47 >> 16;
		if (local21 <= 2500) {
			arg1.method1733(local69 + 94 + 4 - arg1.anInt2574 / 2, -(arg1.anInt2576 / 2) + 83 + -local80 - 4);
		} else {
			arg1.method1729(Static82.aClass3_Sub1_Sub4_Sub3_30, local69 + 94 + 4 - arg1.anInt2574 / 2, -(arg1.anInt2576 / 2) + 83 + (-local80 - 4));
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	public static void method989() {
		Static92.aByteArrayArrayArray36 = new byte[4][104][104];
		Static52.anIntArrayArray15 = new int[105][105];
		Static21.anIntArray37 = new int[104];
		Static54.anIntArrayArrayArray12 = new int[4][105][105];
		Static66.aByteArrayArrayArray25 = new byte[4][104][104];
		Static30.anIntArray88 = new int[104];
		Static92.aByteArrayArrayArray35 = new byte[4][104][104];
		Static98.aByteArrayArrayArray42 = new byte[4][104][104];
		Static36.anIntArray100 = new int[104];
		Static18.aByteArrayArrayArray7 = new byte[4][105][105];
		Static100.anIntArray305 = new int[104];
		Static51.anIntArray175 = new int[104];
		Static47.anInt1185 = 99;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([II)V")
	public static synchronized void method991(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(2) int local2 = arg1 - 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
		}
		local2 += 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
		}
		if (Static19.aClass3_Sub3_1 != null) {
			Static19.aClass3_Sub3_1.method1049(arg0, 0, local2);
		}
		Static69.method1520(local2);
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
	public static void method993() {
		if (Static8.aClass30_1 == null) {
			return;
		}
		if (Static35.anInt640 < 0) {
			if (Static9.anInt310 > 0) {
				Static9.anInt310--;
				if (Static9.anInt310 == 0) {
					if (Static56.aByteArray16 == null) {
						Static8.aClass30_1.method1873(256);
					} else {
						Static8.aClass30_1.method1873(anInt1450);
						Static35.anInt640 = anInt1450;
						Static8.aClass30_1.method1875(Static56.aByteArray16, anInt1450, Static43.aBoolean81);
						Static56.aByteArray16 = null;
					}
					Static113.anInt2852 = 0;
				}
			}
		} else if (Static9.anInt310 > 0) {
			Static113.anInt2852 += anInt1449;
			Static8.aClass30_1.method1878(Static35.anInt640, Static113.anInt2852);
			Static9.anInt310--;
			if (Static9.anInt310 == 0) {
				Static8.aClass30_1.method1883();
				Static9.anInt310 = 20;
				Static35.anInt640 = -1;
			}
		}
		Static8.aClass30_1.method1882();
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V")
	public static void method994() {
		aClass4_741 = null;
		aClass4_740 = null;
		aClass8_19 = null;
		aClass4_743 = null;
		aClass4_745 = null;
		anIntArray206 = null;
		aClass64_43 = null;
		anIntArray207 = null;
		anIntArray204 = null;
		aClass4Array11 = null;
		aClass4_742 = null;
		anIntArray201 = null;
		aClass4_746 = null;
		aClass4_744 = null;
		anIntArray208 = null;
		aClass4_748 = null;
		aClass4_747 = null;
		anIntArray202 = null;
		anIntArray203 = null;
		anIntArray205 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BJ)V")
	public static void method995(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static28.anInt869 >= 100) {
			Static21.method296(Static70.aClass4_883, Static113.aClass4_1604, 0);
			return;
		}
		@Pc(29) Class4 local29 = Static96.method1165(arg0).method130();
		for (@Pc(31) int local31 = 0; local31 < Static28.anInt869; local31++) {
			if (arg0 == Static13.aLongArray6[local31]) {
				Static21.method296(Static60.method1012(new Class4[] { local29, Static49.aClass4_641 }), Static113.aClass4_1604, 0);
				return;
			}
		}
		for (@Pc(70) int local70 = 0; local70 < anInt1451; local70++) {
			if (Static31.aLongArray9[local70] == arg0) {
				Static21.method296(Static60.method1012(new Class4[] { Static98.aClass4_1305, local29, Static6.aClass4_126 }), Static113.aClass4_1604, 0);
				return;
			}
		}
		if (!local29.method151(Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass4_1302)) {
			Static13.aLongArray6[Static28.anInt869++] = arg0;
			Static39.aBoolean74 = true;
			Static5.aClass3_Sub4_Sub1_1.method464(80);
			Static5.aClass3_Sub4_Sub1_1.method456(arg0);
		}
	}
}
