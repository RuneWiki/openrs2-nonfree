import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!le", name = "k", descriptor = "I")
	public static int anInt2038;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Lclient!b;")
	public static Class7 aClass7_12 = new Class7(200);

	@OriginalMember(owner = "client!le", name = "g", descriptor = "[I")
	public static int[] anIntArray217 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!le", name = "h", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1158 = Static122.method531("Drop");

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1159 = Static122.method531("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!le", name = "l", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1160 = Static122.method531(" more options");

	@OriginalMember(owner = "client!le", name = "n", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1161 = aClass73_1160;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1162 = aClass73_1158;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1163 = Static122.method531("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!le", name = "r", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1164 = Static122.method531("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!f;BLclient!f;)V")
	public static void method1596(@OriginalArg(0) Class13 arg0, @OriginalArg(2) Class13 arg1) {
		Static141.aClass13_27 = arg1;
		Static160.aClass13_30 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(JZ)V")
	public static void method1597(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static139.aClass3_Sub12_Sub1_3.method1400(197);
			Static139.aClass3_Sub12_Sub1_3.method1382(arg0);
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)Z")
	public static boolean method1601() {
		try {
			if (Static137.anInt3105 == 2) {
				if (Static168.aClass3_Sub14_1 == null) {
					Static168.aClass3_Sub14_1 = Static185.method1210(Static71.aClass13_13, Static130.anInt2969, Static52.anInt1269);
					if (Static168.aClass3_Sub14_1 == null) {
						return false;
					}
				}
				if (Static135.aClass87_1 == null) {
					Static135.aClass87_1 = new Class87(Static163.aClass13_26, Static171.aClass13_31);
				}
				if (Static147.aClass3_Sub9_Sub2_2.method918(Static51.aClass13_10, Static168.aClass3_Sub14_1, Static135.aClass87_1)) {
					Static147.aClass3_Sub9_Sub2_2.method895();
					Static147.aClass3_Sub9_Sub2_2.method923(Static71.anInt1634);
					Static147.aClass3_Sub9_Sub2_2.method920(Static168.aClass3_Sub14_1, Static4.aBoolean7);
					Static71.aClass13_13 = null;
					Static135.aClass87_1 = null;
					Static137.anInt3105 = 0;
					Static168.aClass3_Sub14_1 = null;
					return true;
				}
			}
		} catch (@Pc(65) Exception local65) {
			local65.printStackTrace();
			Static147.aClass3_Sub9_Sub2_2.method898();
			Static71.aClass13_13 = null;
			Static137.anInt3105 = 0;
			Static135.aClass87_1 = null;
			Static168.aClass3_Sub14_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
	public static void method1602() {
		aClass73_1162 = null;
		aClass73_1161 = null;
		aClass73_1160 = null;
		anIntArray217 = null;
		aClass73_1159 = null;
		aClass73_1163 = null;
		aClass7_12 = null;
		aClass73_1158 = null;
		aClass73_1164 = null;
	}
}
