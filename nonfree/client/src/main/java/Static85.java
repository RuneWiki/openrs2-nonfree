import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!od", name = "s", descriptor = "[Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2[] aClass2_Sub2_Sub1_Sub2Array9;

	@OriginalMember(owner = "client!od", name = "y", descriptor = "I")
	public static int anInt1838;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "Lclient!u;")
	public static Class74 aClass74_1239 = Static72.method1077("0(U");

	@OriginalMember(owner = "client!od", name = "c", descriptor = "I")
	public static int anInt1830 = 0;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "Lclient!u;")
	public static Class74 aClass74_1240 = Static72.method1077("::");

	@OriginalMember(owner = "client!od", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_1241 = Static72.method1077("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!od", name = "p", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!od", name = "q", descriptor = "Lclient!u;")
	private static Class74 aClass74_1242 = Static72.method1077("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!od", name = "r", descriptor = "Lclient!u;")
	public static Class74 aClass74_1243 = Static72.method1077("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!od", name = "t", descriptor = "[I")
	public static int[] anIntArray257 = new int[1000];

	@OriginalMember(owner = "client!od", name = "u", descriptor = "Lclient!u;")
	public static Class74 aClass74_1244 = Static72.method1077("blaugr-Un:");

	@OriginalMember(owner = "client!od", name = "v", descriptor = "Lclient!u;")
	public static Class74 aClass74_1245 = Static72.method1077("leuchten1:");

	@OriginalMember(owner = "client!od", name = "z", descriptor = "[I")
	public static int[] anIntArray258 = new int[4000];

	@OriginalMember(owner = "client!od", name = "A", descriptor = "Lclient!u;")
	public static Class74 aClass74_1246 = aClass74_1242;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	public static void method1293() {
		aClass74_1244 = null;
		aClass74_1246 = null;
		aClass74_1242 = null;
		aClass74_1241 = null;
		aClass2_Sub2_Sub1_Sub2Array9 = null;
		aClass74_1245 = null;
		aClass74_1239 = null;
		anIntArray258 = null;
		aClass74_1240 = null;
		anIntArray257 = null;
		aClass74_1243 = null;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public static void method1294() {
		if (Static22.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static119.anIntArray367[220] = 74;
			Static119.anIntArray367[186] = 57;
			Static119.anIntArray367[221] = 43;
			Static119.anIntArray367[192] = 58;
			Static119.anIntArray367[189] = 26;
			Static119.anIntArray367[223] = 28;
			Static119.anIntArray367[188] = 71;
			Static119.anIntArray367[190] = 72;
			Static119.anIntArray367[191] = 73;
			Static119.anIntArray367[222] = 59;
			Static119.anIntArray367[187] = 27;
			Static119.anIntArray367[219] = 42;
			return;
		}
		Static119.anIntArray367[44] = 71;
		Static119.anIntArray367[47] = 73;
		Static119.anIntArray367[92] = 74;
		Static119.anIntArray367[91] = 42;
		Static119.anIntArray367[61] = 27;
		Static119.anIntArray367[93] = 43;
		Static119.anIntArray367[45] = 26;
		Static119.anIntArray367[59] = 57;
		Static119.anIntArray367[46] = 72;
		if (Static22.aMethod2 == null) {
			Static119.anIntArray367[222] = 59;
			Static119.anIntArray367[192] = 58;
		} else {
			Static119.anIntArray367[222] = 58;
			Static119.anIntArray367[520] = 59;
			Static119.anIntArray367[192] = 28;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method1295(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		if (!Static77.method1209(arg3)) {
			return false;
		}
		Static53.aClass2_Sub2_Sub17Array1 = null;
		@Pc(25) boolean local25 = Static69.method1048(0, arg1, arg2, -1, arg0, 0, Static89.aClass2_Sub2_Sub17ArrayArray1[arg3], 0, 0);
		if (Static53.aClass2_Sub2_Sub17Array1 != null) {
			Static69.method1048(Static31.anInt795, arg1, arg2, -1412584499, arg0, Static9.anInt294, Static53.aClass2_Sub2_Sub17Array1, 0, 0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([BB)V")
	public static void method1296(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub10 local10 = new Class2_Sub10(arg0);
		local10.anInt2187 = arg0.length - 2;
		Static46.anInt1064 = local10.method1517();
		Static24.aByteArrayArray3 = new byte[Static46.anInt1064][];
		Static91.anIntArray265 = new int[Static46.anInt1064];
		Static17.anIntArray54 = new int[Static46.anInt1064];
		Static71.anIntArray194 = new int[Static46.anInt1064];
		Static51.anIntArray312 = new int[Static46.anInt1064];
		local10.anInt2187 = arg0.length - Static46.anInt1064 * 8 - 7;
		Static41.anInt966 = local10.method1517();
		Static66.anInt1466 = local10.method1517();
		@Pc(66) int local66 = (local10.method1514() & 0xFF) + 1;
		for (@Pc(68) int local68 = 0; local68 < Static46.anInt1064; local68++) {
			Static51.anIntArray312[local68] = local10.method1517();
		}
		for (@Pc(82) int local82 = 0; local82 < Static46.anInt1064; local82++) {
			Static91.anIntArray265[local82] = local10.method1517();
		}
		for (@Pc(100) int local100 = 0; local100 < Static46.anInt1064; local100++) {
			Static71.anIntArray194[local100] = local10.method1517();
		}
		for (@Pc(118) int local118 = 0; local118 < Static46.anInt1064; local118++) {
			Static17.anIntArray54[local118] = local10.method1517();
		}
		local10.anInt2187 = arg0.length - (local66 - 1) * 3 - Static46.anInt1064 * 8 - 7;
		Static57.anIntArray156 = new int[local66];
		for (@Pc(152) int local152 = 1; local152 < local66; local152++) {
			Static57.anIntArray156[local152] = local10.method1489();
			if (Static57.anIntArray156[local152] == 0) {
				Static57.anIntArray156[local152] = 1;
			}
		}
		local10.anInt2187 = 0;
		for (@Pc(184) int local184 = 0; local184 < Static46.anInt1064; local184++) {
			@Pc(190) int local190 = Static71.anIntArray194[local184];
			@Pc(194) int local194 = Static17.anIntArray54[local184];
			@Pc(198) int local198 = local190 * local194;
			@Pc(201) byte[] local201 = new byte[local198];
			Static24.aByteArrayArray3[local184] = local201;
			@Pc(209) int local209 = local10.method1514();
			@Pc(219) int local219;
			if (local209 == 0) {
				for (local219 = 0; local219 < local198; local219++) {
					local201[local219] = local10.method1509();
				}
			} else if (local209 == 1) {
				for (local219 = 0; local219 < local190; local219++) {
					for (@Pc(223) int local223 = 0; local223 < local194; local223++) {
						local201[local223 * local190 + local219] = local10.method1509();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
	public static void method1298() {
		Static65.aClass16_54.method485();
		Static53.aClass16_43.method485();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)Z")
	public static boolean method1299(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}
}
