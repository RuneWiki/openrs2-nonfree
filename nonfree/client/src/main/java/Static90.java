import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!pb", name = "B", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_38;

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "Lclient!g;")
	public static Class26 aClass26_23;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Lclient!l;")
	public static Class41 aClass41_1 = new Class41();

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!u;")
	public static Class74 aClass74_1293 = Static72.method1077("M");

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
	public static int anInt1901 = 500;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "Lclient!e;")
	public static Class16 aClass16_67 = new Class16(30);

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "Z")
	public static boolean aBoolean76 = false;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
	public static int anInt1903 = -1;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
	public static volatile int anInt1904 = 0;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "Lclient!u;")
	private static Class74 aClass74_1294 = Static72.method1077("Prepared visibility map");

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
	public static int anInt1905 = -1;

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "Lclient!u;")
	public static Class74 aClass74_1295 = aClass74_1294;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "Lclient!u;")
	public static Class74 aClass74_1296 = Static72.method1077("mapedge");

	@OriginalMember(owner = "client!pb", name = "x", descriptor = "Lclient!e;")
	public static Class16 aClass16_68 = new Class16(64);

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "Lclient!u;")
	public static Class74 aClass74_1297 = Static72.method1077("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!pb", name = "z", descriptor = "Lclient!u;")
	public static Class74 aClass74_1298 = Static72.method1077("backvmid3");

	@OriginalMember(owner = "client!pb", name = "A", descriptor = "Lclient!u;")
	public static Class74 aClass74_1299 = Static72.method1077("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "Lclient!u;")
	private static Class74 aClass74_1301 = Static72.method1077("Members object");

	@OriginalMember(owner = "client!pb", name = "D", descriptor = "Lclient!u;")
	public static Class74 aClass74_1300 = aClass74_1301;

	@OriginalMember(owner = "client!pb", name = "E", descriptor = "[I")
	public static int[] anIntArray264 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Z")
	public static boolean method1330(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
	public static void method1331() {
		aClass2_Sub2_Sub1_Sub1_38 = null;
		aClass16_68 = null;
		aClass74_1297 = null;
		aClass74_1293 = null;
		aClass74_1301 = null;
		aClass74_1295 = null;
		aClass74_1300 = null;
		aClass41_1 = null;
		aClass74_1296 = null;
		aClass74_1294 = null;
		aClass74_1299 = null;
		anIntArray264 = null;
		aClass26_23 = null;
		aClass74_1298 = null;
		aClass16_67 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZII)I")
	public static int method1332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) ((arg0 << 16) + arg1);
		return Static55.aClass2_Sub2_Sub15_2 != null && local10 == Static55.aClass2_Sub2_Sub15_2.aLong96 ? Static35.aClass2_Sub10_61.anInt2187 * 99 / (Static35.aClass2_Sub10_61.aByteArray27.length - Static55.aClass2_Sub2_Sub15_2.aByte4) + 1 : 0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)V")
	public static void method1333(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub2_Sub17 local12 = Static23.method478(arg0, arg1);
		if (local12 != null && local12.anObjectArray7 != null) {
			Static45.method732(local12, local12.anObjectArray7, 0, 0, null, 0);
		}
		Static6.aBoolean7 = true;
		Static65.anInt1451 = arg2;
		Static46.anInt1060 = arg0;
		Static40.anInt956 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
	public static void method1334(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class2_Sub12 local12 = (Class2_Sub12) Static87.aClass58_36.method1307((long) arg1);
		if (local12 == null) {
			local12 = new Class2_Sub12();
			Static87.aClass58_36.method1301((long) arg1, local12);
		}
		if (local12.anIntArray155.length <= arg2) {
			@Pc(39) int[] local39 = new int[arg2 + 1];
			@Pc(44) int[] local44 = new int[arg2 + 1];
			for (@Pc(46) int local46 = 0; local46 < local12.anIntArray155.length; local46++) {
				local44[local46] = local12.anIntArray155[local46];
				local39[local46] = local12.anIntArray157[local46];
			}
			for (@Pc(76) int local76 = local12.anIntArray155.length; local76 < arg2; local76++) {
				local44[local76] = -1;
				local39[local76] = 0;
			}
			local12.anIntArray157 = local39;
			local12.anIntArray155 = local44;
		}
		local12.anIntArray155[arg2] = arg0;
		local12.anIntArray157[arg2] = arg3;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)V")
	public static void method1335(@OriginalArg(0) boolean arg0) {
		if (Static6.aClass62_1 == null) {
			return;
		}
		try {
			@Pc(11) Class2_Sub10 local11 = new Class2_Sub10(4);
			local11.method1486(arg0 ? 2 : 3);
			local11.method1512(0);
			Static6.aClass62_1.method1343(4, local11.aByteArray27);
		} catch (@Pc(32) IOException local32) {
			try {
				Static6.aClass62_1.method1347();
			} catch (@Pc(37) Exception local37) {
			}
			Static6.aClass62_1 = null;
			Static30.anInt724++;
		}
	}
}
