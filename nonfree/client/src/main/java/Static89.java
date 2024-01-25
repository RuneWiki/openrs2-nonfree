import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "Lclient!tf;")
	public static Class240 aClass240_7;

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "Lclient!ci;")
	public static Class38 aClass38_19;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_26 = new Class212(13, 3);

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_27 = new Class212(67, 1);

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_73 = new Class214(63, -1);

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "[I")
	public static final int[] anIntArray174 = new int[1000];

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBC)C")
	public static char method1783(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 == 'Ñ' && arg0 != 0) {
				return 'N';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 == 'ñ' && arg0 != 0) {
				return 'n';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)Z")
	public static boolean method1784(@OriginalArg(1) int arg0) {
		Static424.anInt7324 = arg0 + 1 & 0xFFFF;
		Static225.aBoolean293 = true;
		return true;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public static void method1785() {
		@Pc(8) int local8 = Static125.aByteArrayArray9.length;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			if (Static125.aByteArrayArray9[local17] != null) {
				@Pc(25) int local25 = -1;
				for (@Pc(27) int local27 = 0; local27 < Static377.anInt6116; local27++) {
					if (Static109.anIntArray203[local17] == Static395.anIntArray561[local27]) {
						local25 = local27;
						break;
					}
				}
				if (local25 == -1) {
					Static395.anIntArray561[Static377.anInt6116] = Static109.anIntArray203[local17];
					local25 = Static377.anInt6116++;
				}
				@Pc(71) Class4_Sub20 local71 = new Class4_Sub20(Static125.aByteArrayArray9[local17]);
				@Pc(73) int local73 = 0;
				while (Static125.aByteArrayArray9[local17].length > local71.anInt5526 && local73 < 511 && Static77.anInt1870 < 1023) {
					@Pc(92) int local92 = local25 | local73++ << 6;
					@Pc(96) int local96 = local71.method4560();
					@Pc(100) int local100 = local96 >> 14;
					@Pc(106) int local106 = local96 >> 7 & 0x3F;
					@Pc(110) int local110 = local96 & 0x3F;
					@Pc(124) int local124 = (Static109.anIntArray203[local17] >> 8) * 64 + local106 - Static426.anInt7325;
					@Pc(137) int local137 = (Static109.anIntArray203[local17] & 0xFF) * 64 + local110 - Static72.anInt1776;
					@Pc(144) Class241 local144 = Static220.aClass247_1.method5660(local71.method4560());
					@Pc(151) Class4_Sub44 local151 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local92);
					if (local151 == null && (local144.aByte91 & 0x1) > 0 && Static238.anInt4697 == local100 && local124 >= 0 && local144.anInt7007 + local124 < Static193.anInt3853 && local137 >= 0 && Static301.anInt5585 > local137 + local144.anInt7007) {
						@Pc(198) Class11_Sub5_Sub2_Sub2 local198 = new Class11_Sub5_Sub2_Sub2();
						local198.anInt6518 = local92;
						@Pc(206) Class4_Sub44 local206 = new Class4_Sub44(local198);
						Static80.aClass96_8.method2805((long) local92, local206);
						Static154.aClass4_Sub44Array1[Static328.anInt5871++] = local206;
						Static2.anIntArray1[Static77.anInt1870++] = local92;
						local198.anInt6475 = Static277.anInt2834;
						local198.method5311(local144);
						local198.method5304(local198.aClass241_1.anInt7007);
						local198.anInt6530 = local198.aClass241_1.anInt6998 << 3;
						local198.method5297(local198.aClass241_1.aByte88 + 4 << 11 & 0x3D1D, true);
						local198.method5313(local198.method5302(), true, local124, local100, local137);
					}
				}
			}
		}
	}
}
