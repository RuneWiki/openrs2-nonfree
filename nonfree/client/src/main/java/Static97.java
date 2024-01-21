import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
	public static int anInt2572;

	@OriginalMember(owner = "client!qf", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "Lclient!ec;")
	private static Class22 aClass22_745 = Static60.method1113("Loaded sprites");

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "Lclient!ec;")
	public static Class22 aClass22_743 = aClass22_745;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "Lclient!ec;")
	private static Class22 aClass22_744 = Static60.method1113(" more options");

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "Z")
	public static boolean aBoolean228 = false;

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
	public static int anInt2562 = 0;

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "Lclient!ec;")
	public static Class22 aClass22_746 = aClass22_744;

	@OriginalMember(owner = "client!qf", name = "D", descriptor = "Lclient!ec;")
	public static Class22 aClass22_747 = Static60.method1113("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!qf", name = "E", descriptor = "Lclient!f;")
	public static Class4_Sub7 aClass4_Sub7_13 = null;

	@OriginalMember(owner = "client!qf", name = "F", descriptor = "Lclient!ec;")
	public static Class22 aClass22_748 = Static60.method1113("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!qf", name = "G", descriptor = "Lclient!ec;")
	public static Class22 aClass22_749 = Static60.method1113("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!qf", name = "H", descriptor = "Lclient!ec;")
	private static Class22 aClass22_750 = Static60.method1113("skill)2");

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "Lclient!ec;")
	public static Class22 aClass22_751 = aClass22_750;

	@OriginalMember(owner = "client!qf", name = "N", descriptor = "Lclient!ec;")
	public static Class22 aClass22_752 = Static60.method1113("sl_button");

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public static void method1653() {
		aByteArrayArrayArray5 = null;
		aClass22_750 = null;
		aClass22_749 = null;
		aClass22_746 = null;
		aClass22_745 = null;
		Class60.anIntArray282 = null;
		aClass22_748 = null;
		aClass22_743 = null;
		aClass22_752 = null;
		aClass22_751 = null;
		aClass22_744 = null;
		aClass4_Sub7_13 = null;
		aClass22_747 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!ec;)Z")
	public static boolean method1657(@OriginalArg(1) Class22 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static2.anInt9; local11++) {
			if (arg0.method480(Static12.aClass22Array1[local11])) {
				return true;
			}
		}
		return arg0.method480(Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.aClass22_444);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Z")
	public static boolean method1659(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)V")
	public static void method1661(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static76.aBooleanArray14[arg0]) {
			return;
		}
		Static71.aClass20_35.method612(arg0);
		if (Static65.aClass4_Sub7ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(31) boolean local31 = true;
		for (@Pc(33) int local33 = 0; local33 < Static65.aClass4_Sub7ArrayArray1[arg0].length; local33++) {
			if (Static65.aClass4_Sub7ArrayArray1[arg0][local33] != null) {
				if (Static65.aClass4_Sub7ArrayArray1[arg0][local33].anInt743 == 2) {
					local31 = false;
				} else {
					Static65.aClass4_Sub7ArrayArray1[arg0][local33] = null;
				}
			}
		}
		if (local31) {
			Static65.aClass4_Sub7ArrayArray1[arg0] = null;
		}
		Static76.aBooleanArray14[arg0] = false;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
	public static void method1662() {
		Static112.aByteArrayArrayArray7 = null;
		Static112.aByteArrayArrayArray6 = null;
		Static71.aByteArrayArrayArray3 = null;
		Static56.anIntArray157 = null;
		Static32.anIntArray92 = null;
		Static92.aByteArrayArrayArray4 = null;
		Static88.anIntArray270 = null;
		Static85.anIntArrayArrayArray5 = null;
		Static120.anIntArray314 = null;
		aByteArrayArrayArray5 = null;
		Static29.anIntArray76 = null;
		Static27.anIntArrayArray3 = null;
	}
}
