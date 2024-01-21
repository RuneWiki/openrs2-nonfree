import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!kd", name = "U", descriptor = "I")
	public static int anInt3071;

	@OriginalMember(owner = "client!kd", name = "eb", descriptor = "Lclient!dg;")
	public static Class20 aClass20_2;

	@OriginalMember(owner = "client!kd", name = "jb", descriptor = "[[I")
	public static int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "Lclient!af;")
	public static final Class5 aClass5_41 = new Class5(30);

	@OriginalMember(owner = "client!kd", name = "W", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1188 = Static120.method1824("Loading title screen )2 ");

	@OriginalMember(owner = "client!kd", name = "V", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1187 = aClass80_1188;

	@OriginalMember(owner = "client!kd", name = "X", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1189 = Static120.method1824("World");

	@OriginalMember(owner = "client!kd", name = "Z", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1190 = Static120.method1824("Versteckt");

	@OriginalMember(owner = "client!kd", name = "bb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1191 = aClass80_1189;

	@OriginalMember(owner = "client!kd", name = "fb", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1192 = Static120.method1824("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!kd", name = "hb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1193 = aClass80_1192;

	@OriginalMember(owner = "client!kd", name = "ib", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1194 = aClass80_1189;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZIII)V")
	public static void method2207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == Static147.anInt3300 && arg4 == Static134.anInt3310 && (arg2 == Static181.anInt4055 || !Static96.aBoolean83)) {
			return;
		}
		Static134.anInt3310 = arg4;
		Static147.anInt3300 = arg1;
		Static181.anInt4055 = arg2;
		if (!Static96.aBoolean83) {
			Static181.anInt4055 = 0;
		}
		Static132.method2019(25);
		Static126.method1869(Static196.aClass80_1517, true);
		@Pc(40) int local40 = Static39.anInt875;
		Static39.anInt875 = arg4 * 8 - 48;
		@Pc(48) int local48 = Static97.anInt2062;
		Static97.anInt2062 = (arg1 - 6) * 8;
		@Pc(59) int local59 = Static97.anInt2062 - local48;
		@Pc(66) int local66 = Static39.anInt875 - local40;
		for (@Pc(70) int local70 = 0; local70 < 32768; local70++) {
			@Pc(76) Class3_Sub1_Sub5_Sub4_Sub1 local76 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local70];
			if (local76 != null) {
				for (@Pc(80) int local80 = 0; local80 < 10; local80++) {
					local76.anIntArray509[local80] -= local59;
					local76.anIntArray513[local80] -= local66;
				}
				local76.anInt4329 -= local59 * 128;
				local76.anInt4315 -= local66 * 128;
			}
		}
		for (@Pc(126) int local126 = 0; local126 < 2048; local126++) {
			@Pc(132) Class3_Sub1_Sub5_Sub4_Sub2 local132 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local126];
			if (local132 != null) {
				for (@Pc(136) int local136 = 0; local136 < 10; local136++) {
					local132.anIntArray509[local136] -= local59;
					local132.anIntArray513[local136] -= local66;
				}
				local132.anInt4315 -= local66 * 128;
				local132.anInt4329 -= local59 * 128;
			}
		}
		Static153.anInt673 = arg2;
		Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.method3061(false, arg0, arg3);
		@Pc(192) byte local192 = 0;
		@Pc(194) byte local194 = 104;
		@Pc(196) byte local196 = 0;
		@Pc(198) byte local198 = 1;
		@Pc(200) byte local200 = 104;
		@Pc(202) byte local202 = 1;
		if (local66 < 0) {
			local200 = -1;
			local196 = 103;
			local202 = -1;
		}
		if (local59 < 0) {
			local192 = 103;
			local194 = -1;
			local198 = -1;
		}
		for (@Pc(223) int local223 = local192; local223 != local194; local223 += local198) {
			for (@Pc(227) int local227 = local196; local227 != local200; local227 += local202) {
				@Pc(234) int local234 = local223 + local59;
				@Pc(238) int local238 = local66 + local227;
				for (@Pc(240) int local240 = 0; local240 < 4; local240++) {
					if (local234 >= 0 && local238 >= 0 && local234 < 104 && local238 < 104) {
						Static142.aClass70ArrayArrayArray1[local240][local223][local227] = Static142.aClass70ArrayArrayArray1[local240][local234][local238];
					} else {
						Static142.aClass70ArrayArrayArray1[local240][local223][local227] = null;
					}
				}
			}
		}
		for (@Pc(302) Class3_Sub22 local302 = (Class3_Sub22) Static97.aClass70_9.method1953(); local302 != null; local302 = (Class3_Sub22) Static97.aClass70_9.method1948()) {
			local302.anInt3780 -= local59;
			local302.anInt3764 -= local66;
			if (local302.anInt3780 < 0 || local302.anInt3764 < 0 || local302.anInt3780 >= 104 || local302.anInt3764 >= 104) {
				local302.method3159();
			}
		}
		Static100.aBoolean86 = false;
		Static31.anInt751 = -1;
		if (Static49.anInt1087 != 0) {
			Static171.anInt3847 -= local66;
			Static49.anInt1087 -= local59;
		}
		Static66.anInt1437 = 0;
		Static151.aClass70_21.method1954();
		Static164.aClass70_22.method1954();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)Lclient!qf;")
	public static Class77 method2208(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 & 0xFFFF;
		@Pc(18) int local18 = arg0 >> 16;
		if (Static57.aClass77ArrayArray1[local18] == null || Static57.aClass77ArrayArray1[local18][local14] == null) {
			@Pc(32) boolean local32 = Static188.method3068(local18);
			if (!local32) {
				return null;
			}
		}
		return Static57.aClass77ArrayArray1[local18][local14];
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLclient!bc;ZIII)V")
	public static void method2211(@OriginalArg(1) Class1 arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		Static10.aClass1_1 = arg0;
		Static49.anInt1089 = 1;
		Static52.anInt1143 = 10000;
		Static171.aBoolean153 = false;
		Static121.anInt2648 = 0;
		Static25.anInt573 = arg1;
		Static172.anInt3855 = arg2;
	}
}
