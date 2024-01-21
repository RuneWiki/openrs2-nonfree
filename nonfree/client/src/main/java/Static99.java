import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
	public static int anInt2655;

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "Lclient!jd;")
	public static Class11 aClass11_107;

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "[I")
	public static int[] anIntArray405;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
	public static int anInt2657 = 0;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1144 = Static63.method1251("purple:");

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1139 = aClass45_1144;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
	public static int anInt2658 = 1;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1140 = Static63.method1251("(U");

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "[I")
	public static int[] anIntArray403 = new int[5];

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1141 = Static63.method1251("You have only just left another world)3");

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1142 = aClass45_1141;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1143 = Static63.method1251("Benutzen");

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "Lclient!sa;")
	public static Class67 aClass67_21 = new Class67(64);

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "B")
	public static byte aByte5 = 0;

	@OriginalMember(owner = "client!sa", name = "y", descriptor = "[I")
	public static int[] anIntArray404 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!sa", name = "z", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1145 = Static63.method1251("@or2@");

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method1816() {
		aClass45_1139 = null;
		anIntArray403 = null;
		aClass45_1142 = null;
		aClass45_1141 = null;
		aClass45_1145 = null;
		aClass45_1144 = null;
		aClass45_1140 = null;
		aClass11_107 = null;
		anIntArray404 = null;
		anIntArray405 = null;
		aClass67_21 = null;
		aClass45_1143 = null;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
	public static void method1817() {
		if (Static1.aClass7_1 != null) {
			Static1.aClass7_1.method73();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
	public static int method1820(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static102.method1888(arg1 + 91923, arg0 + 45365, 4) + (Static102.method1888(arg1 + 37821, arg0 + 10294, 2) - 128 >> 1) + (Static102.method1888(arg1, arg0, 1) - 128 >> 2) - 128;
		local46 = (int) ((double) local46 * 0.3D) + 35;
		if (local46 < 10) {
			local46 = 10;
		} else if (local46 > 60) {
			local46 = 60;
		}
		return local46;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIII)V")
	public static void method1821(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class5_Sub11 local6 = (Class5_Sub11) Static48.aClass10_7.method230(); local6 != null; local6 = (Class5_Sub11) Static48.aClass10_7.method233()) {
			if (local6.anInt1330 != -1 || local6.anIntArray216 != null) {
				@Pc(18) int local18 = 0;
				if (local6.anInt1329 < arg1) {
					local18 = arg1 - local6.anInt1329;
				} else if (arg1 < local6.anInt1336) {
					local18 = local6.anInt1336 - arg1;
				}
				if (local6.anInt1343 < arg0) {
					local18 += arg0 - local6.anInt1343;
				} else if (arg0 < local6.anInt1341) {
					local18 += local6.anInt1341 - arg0;
				}
				if (local18 - 64 > local6.anInt1333 || Static116.anInt3035 == 0 || local6.anInt1332 != arg3) {
					if (local6.aClass5_Sub7_Sub2_3 != null) {
						Static47.aClass5_Sub7_Sub3_2.method2009(local6.aClass5_Sub7_Sub2_3);
						local6.aClass5_Sub7_Sub2_3 = null;
					}
					if (local6.aClass5_Sub7_Sub2_2 != null) {
						Static47.aClass5_Sub7_Sub3_2.method2009(local6.aClass5_Sub7_Sub2_2);
						local6.aClass5_Sub7_Sub2_2 = null;
					}
				} else {
					local18 -= 64;
					if (local18 < 0) {
						local18 = 0;
					}
					@Pc(135) int local135 = (local6.anInt1333 - local18) * Static116.anInt3035 / local6.anInt1333;
					if (local6.aClass5_Sub7_Sub2_3 != null) {
						local6.aClass5_Sub7_Sub2_3.method1019(local135);
					} else if (local6.anInt1330 >= 0) {
						@Pc(147) Class8 local147 = Static125.method84(Static100.aClass29_Sub1_43, local6.anInt1330);
						if (local147 != null) {
							@Pc(154) Class5_Sub5_Sub1 local154 = local147.method85().method541(Static39.aClass71_2);
							@Pc(159) Class5_Sub7_Sub2 local159 = Static128.method1029(local154, local135);
							local159.method1028(-1);
							Static47.aClass5_Sub7_Sub3_2.method2011(local159);
							local6.aClass5_Sub7_Sub2_3 = local159;
						}
					}
					if (local6.aClass5_Sub7_Sub2_2 != null) {
						local6.aClass5_Sub7_Sub2_2.method1019(local135);
						if (!local6.aClass5_Sub7_Sub2_2.method2143()) {
							local6.aClass5_Sub7_Sub2_2 = null;
						}
					} else if (local6.anIntArray216 != null && (local6.anInt1328 -= arg2) <= 0) {
						@Pc(196) int local196 = (int) ((double) local6.anIntArray216.length * Math.random());
						@Pc(204) Class8 local204 = Static125.method84(Static100.aClass29_Sub1_43, local6.anIntArray216[local196]);
						if (local204 != null) {
							@Pc(211) Class5_Sub5_Sub1 local211 = local204.method85().method541(Static39.aClass71_2);
							@Pc(216) Class5_Sub7_Sub2 local216 = Static128.method1029(local211, local135);
							local216.method1028(0);
							Static47.aClass5_Sub7_Sub3_2.method2011(local216);
							local6.aClass5_Sub7_Sub2_2 = local216;
							local6.anInt1328 = local6.anInt1337 + (int) ((double) (local6.anInt1338 - local6.anInt1337) * Math.random());
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)V")
	public static void method1824(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static53.aBooleanArray21[arg0]) {
			return;
		}
		Static57.aClass29_40.method741(arg0);
		if (Static19.aClass5_Sub2_Sub8ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static19.aClass5_Sub2_Sub8ArrayArray1[arg0].length; local28++) {
			if (Static19.aClass5_Sub2_Sub8ArrayArray1[arg0][local28] != null) {
				if (Static19.aClass5_Sub2_Sub8ArrayArray1[arg0][local28].anInt1269 == 2) {
					local26 = false;
				} else {
					Static19.aClass5_Sub2_Sub8ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static19.aClass5_Sub2_Sub8ArrayArray1[arg0] = null;
		}
		Static53.aBooleanArray21[arg0] = false;
	}
}
