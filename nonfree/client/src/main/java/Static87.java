import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
	public static int anInt2440;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "[I")
	public static int[] anIntArray292;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "Lclient!he;")
	private static Class26 aClass26_1264 = Static6.method100("Error connecting to server)3");

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Lclient!he;")
	public static Class26 aClass26_1260 = aClass26_1264;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
	public static int anInt2437 = 0;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
	public static volatile int anInt2438 = 0;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "Lclient!he;")
	private static Class26 aClass26_1266 = Static6.method100("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!he;")
	public static Class26 aClass26_1261 = aClass26_1266;

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "Lclient!he;")
	private static Class26 aClass26_1267 = Static6.method100("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "Lclient!he;")
	public static Class26 aClass26_1262 = aClass26_1267;

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "Lclient!he;")
	public static Class26 aClass26_1263 = Static6.method100("headicons_pk");

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "Lclient!he;")
	private static Class26 aClass26_1268 = Static6.method100("Loaded sprites");

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "Lclient!he;")
	public static Class26 aClass26_1265 = aClass26_1268;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBII)V")
	public static void method1623(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			for (local13 = 0; local13 < 8; local13++) {
				Static117.anIntArrayArrayArray6[arg0][arg2 + local9][local13 + arg1] = 0;
			}
		}
		if (arg2 > 0) {
			for (local13 = 1; local13 < 8; local13++) {
				Static117.anIntArrayArrayArray6[arg0][arg2][local13 + arg1] = Static117.anIntArrayArrayArray6[arg0][arg2 - 1][arg1 + local13];
			}
		}
		if (arg1 > 0) {
			for (local13 = 1; local13 < 8; local13++) {
				Static117.anIntArrayArrayArray6[arg0][local13 + arg2][arg1] = Static117.anIntArrayArrayArray6[arg0][local13 + arg2][arg1 - 1];
			}
		}
		if (arg2 > 0 && Static117.anIntArrayArrayArray6[arg0][arg2 - 1][arg1] != 0) {
			Static117.anIntArrayArrayArray6[arg0][arg2][arg1] = Static117.anIntArrayArrayArray6[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && Static117.anIntArrayArrayArray6[arg0][arg2][arg1 - 1] != 0) {
			Static117.anIntArrayArrayArray6[arg0][arg2][arg1] = Static117.anIntArrayArrayArray6[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && Static117.anIntArrayArrayArray6[arg0][arg2 - 1][arg1 - 1] != 0) {
			Static117.anIntArrayArrayArray6[arg0][arg2][arg1] = Static117.anIntArrayArrayArray6[arg0][arg2 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public static void method1624() {
		if (Static123.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static25.anIntArray382[189] = 26;
			Static25.anIntArray382[220] = 74;
			Static25.anIntArray382[186] = 57;
			Static25.anIntArray382[190] = 72;
			Static25.anIntArray382[222] = 59;
			Static25.anIntArray382[219] = 42;
			Static25.anIntArray382[221] = 43;
			Static25.anIntArray382[188] = 71;
			Static25.anIntArray382[191] = 73;
			Static25.anIntArray382[192] = 58;
			Static25.anIntArray382[223] = 28;
			Static25.anIntArray382[187] = 27;
			return;
		}
		Static25.anIntArray382[46] = 72;
		Static25.anIntArray382[61] = 27;
		Static25.anIntArray382[44] = 71;
		Static25.anIntArray382[47] = 73;
		Static25.anIntArray382[92] = 74;
		Static25.anIntArray382[59] = 57;
		Static25.anIntArray382[45] = 26;
		Static25.anIntArray382[91] = 42;
		Static25.anIntArray382[93] = 43;
		if (Static123.aMethod1 == null) {
			Static25.anIntArray382[192] = 58;
			Static25.anIntArray382[222] = 59;
		} else {
			Static25.anIntArray382[222] = 58;
			Static25.anIntArray382[192] = 28;
			Static25.anIntArray382[520] = 59;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)J")
	public static synchronized long method1625() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static36.aLong34) {
			Static2.aLong1 += Static36.aLong34 - local5;
		}
		Static36.aLong34 = local5;
		return local5 + Static2.aLong1;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
	public static void method1626(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static116.aBooleanArray27[arg0]) {
			return;
		}
		Static14.aClass16_21.method575(arg0);
		if (Static49.aClass3_Sub14ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static49.aClass3_Sub14ArrayArray1[arg0].length; local28++) {
			if (Static49.aClass3_Sub14ArrayArray1[arg0][local28] != null) {
				if (Static49.aClass3_Sub14ArrayArray1[arg0][local28].anInt2204 == 2) {
					local26 = false;
				} else {
					Static49.aClass3_Sub14ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static49.aClass3_Sub14ArrayArray1[arg0] = null;
		}
		Static116.aBooleanArray27[arg0] = false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
	public static void method1627() {
		aClass26_1262 = null;
		aClass26_1261 = null;
		aClass26_1266 = null;
		aClass26_1267 = null;
		aClass26_1260 = null;
		aClass26_1265 = null;
		aClass26_1264 = null;
		anIntArray292 = null;
		aClass26_1268 = null;
		aClass26_1263 = null;
	}
}
