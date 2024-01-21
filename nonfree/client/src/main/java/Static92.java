import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!rc", name = "pb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray35;

	@OriginalMember(owner = "client!rc", name = "Db", descriptor = "Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_34;

	@OriginalMember(owner = "client!rc", name = "Kb", descriptor = "I")
	public static int anInt2091;

	@OriginalMember(owner = "client!rc", name = "mc", descriptor = "I")
	public static int anInt2106;

	@OriginalMember(owner = "client!rc", name = "Zc", descriptor = "I")
	public static int anInt2129;

	@OriginalMember(owner = "client!rc", name = "dd", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray36;

	@OriginalMember(owner = "client!rc", name = "db", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1181 = Static75.method1216("Report abuse");

	@OriginalMember(owner = "client!rc", name = "fb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1182 = aClass4_1181;

	@OriginalMember(owner = "client!rc", name = "Ub", descriptor = "[I")
	public static int[] anIntArray270 = new int[2048];

	@OriginalMember(owner = "client!rc", name = "cc", descriptor = "Lclient!hd;")
	public static Class34 aClass34_6 = new Class34(4096);

	@OriginalMember(owner = "client!rc", name = "Uc", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1187 = Static75.method1216(": ");

	@OriginalMember(owner = "client!rc", name = "Wc", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1188 = null;

	@OriginalMember(owner = "client!rc", name = "Yc", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1189 = Static75.method1216("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!rc", name = "ed", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1191 = aClass4_1189;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)I")
	public static int method1426() {
		@Pc(9) int local9 = Static82.method1293(Static113.anInt2853, Static49.anInt1203, Static9.anInt314);
		return local9 - Static61.anInt1536 >= 800 || (Static11.aByteArrayArrayArray55[Static49.anInt1203][Static113.anInt2853 >> 7][Static9.anInt314 >> 7] & 0x4) == 0 ? 3 : Static49.anInt1203;
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
	public static void method1429() {
		aClass4_1182 = null;
		anIntArray270 = null;
		aClass4_1181 = null;
		aClass4_1188 = null;
		aByteArrayArrayArray35 = null;
		aClass4_1191 = null;
		aByteArrayArrayArray36 = null;
		aClass4_1189 = null;
		aClass3_Sub1_Sub4_Sub3_34 = null;
		aClass34_6 = null;
		aClass4_1187 = null;
	}
}
