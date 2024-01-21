import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!of", name = "ob", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!of", name = "Cb", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!of", name = "ab", descriptor = "Lclient!qc;")
	public static Class60 aClass60_831 = Static121.method2047("blinken1:");

	@OriginalMember(owner = "client!of", name = "db", descriptor = "Lclient!qc;")
	private static Class60 aClass60_832 = Static121.method2047("Loading )2 please wait)3");

	@OriginalMember(owner = "client!of", name = "nb", descriptor = "Lclient!mf;")
	public static Class48 aClass48_47 = new Class48(64);

	@OriginalMember(owner = "client!of", name = "sb", descriptor = "Lclient!qc;")
	public static Class60 aClass60_833 = aClass60_832;

	@OriginalMember(owner = "client!of", name = "ub", descriptor = "I")
	public static int anInt2019 = 0;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	public static void method1485() {
		aClass48_47 = null;
		aClass60_833 = null;
		anIntArray203 = null;
		aClass60_831 = null;
		aByteArrayArrayArray4 = null;
		aClass60_832 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)Z")
	public static boolean method1486(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)[Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1[] method1490() {
		@Pc(8) Class4_Sub4_Sub3_Sub1[] local8 = new Class4_Sub4_Sub3_Sub1[Static37.anInt929];
		for (@Pc(10) int local10 = 0; local10 < Static37.anInt929; local10++) {
			@Pc(20) Class4_Sub4_Sub3_Sub1 local20 = local8[local10] = new Class4_Sub4_Sub3_Sub1();
			local20.anInt636 = Static46.anInt1202;
			local20.anInt638 = Static31.anInt850;
			local20.anInt637 = Static61.anIntArray166[local10];
			local20.anInt634 = Static113.anIntArray299[local10];
			local20.anInt635 = Static102.anIntArray279[local10];
			local20.anInt633 = Static76.anIntArray193[local10];
			local20.anIntArray35 = Static56.anIntArray146;
			local20.aByteArray24 = Static105.aByteArrayArray8[local10];
		}
		Static131.method2144();
		return local8;
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(B)V")
	public static void method1492() {
		for (@Pc(8) Class4_Sub21 local8 = (Class4_Sub21) Static8.aClass70_2.method1939(); local8 != null; local8 = (Class4_Sub21) Static8.aClass70_2.method1936()) {
			if (local8.aClass4_Sub4_Sub5_1 != null) {
				local8.method1948();
			}
		}
	}
}
