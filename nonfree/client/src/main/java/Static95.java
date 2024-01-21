import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!pd", name = "J", descriptor = "Lclient!kb;")
	public static Class41 aClass41_20;

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
	public static int anInt2356;

	@OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
	public static int anInt2357;

	@OriginalMember(owner = "client!pd", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
	public static int anInt2358;

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "Z")
	public static boolean aBoolean93;

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "Lclient!bd;")
	public static Class7 aClass7_10 = new Class7(4096);

	@OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
	public static int anInt2351 = 0;

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
	public static int anInt2352 = 0;

	@OriginalMember(owner = "client!pd", name = "E", descriptor = "Lclient!af;")
	public static Class5 aClass5_1128 = Static45.method1937(")3runescape)3com");

	@OriginalMember(owner = "client!pd", name = "F", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2 = new int[4][105][105];

	@OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
	public static int anInt2355 = 0;

	@OriginalMember(owner = "client!pd", name = "N", descriptor = "Lclient!af;")
	public static Class5 aClass5_1129 = Static45.method1937("p12_full");

	@OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
	public static int anInt2359 = 0;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
	public static void method1602() {
		anIntArrayArrayArray2 = null;
		aByteArrayArrayArray5 = null;
		aClass7_10 = null;
		aClass5_1128 = null;
		aClass5_1129 = null;
		aClass41_20 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!kb;Lclient!kb;Lclient!kb;Lclient!kd;)Z")
	public static boolean method1603(@OriginalArg(1) Class41 arg0, @OriginalArg(2) Class41 arg1, @OriginalArg(3) Class41 arg2, @OriginalArg(4) Class1_Sub1_Sub3 arg3) {
		Static58.aClass41_7 = arg2;
		Static131.aClass41_34 = arg1;
		Static45.aClass41_27 = arg0;
		Static2.aClass1_Sub1_Sub3_1 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!af;Lclient!af;Lclient!af;II)V")
	public static void method1604(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static39.anIntArray175[local3] = Static39.anIntArray175[local3 - 1];
			Static93.aClass5Array19[local3] = Static93.aClass5Array19[local3 - 1];
			Static103.aClass5Array21[local3] = Static103.aClass5Array21[local3 - 1];
			Static71.aClass5Array10[local3] = Static71.aClass5Array10[local3 - 1];
		}
		Static39.anIntArray175[0] = arg3;
		Static93.aClass5Array19[0] = arg0;
		Static59.anInt1397 = Static60.anInt1441;
		Static103.aClass5Array21[0] = arg1;
		Static71.aClass5Array10[0] = arg2;
	}
}
