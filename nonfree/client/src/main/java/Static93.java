import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!qc", name = "X", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!qc", name = "Y", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1375 = Static80.method1463("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!qc", name = "ab", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1376 = Static80.method1463("@yel@*V");

	@OriginalMember(owner = "client!qc", name = "bb", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1377 = Static80.method1463("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!qc", name = "db", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1378 = Static80.method1463("Public chat");

	@OriginalMember(owner = "client!qc", name = "eb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1379 = aClass63_1378;

	@OriginalMember(owner = "client!qc", name = "fb", descriptor = "Z")
	public static boolean aBoolean138 = false;

	@OriginalMember(owner = "client!qc", name = "gb", descriptor = "Z")
	public static boolean aBoolean139 = false;

	@OriginalMember(owner = "client!qc", name = "hb", descriptor = "I")
	public static int anInt2619 = 0;

	@OriginalMember(owner = "client!qc", name = "ib", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1380 = aClass63_1377;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V")
	public static void method1698() {
		aBigInteger2 = null;
		aClass63_1380 = null;
		aClass63_1375 = null;
		aClass63_1376 = null;
		aClass63_1378 = null;
		aClass63_1377 = null;
		aClass63_1379 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ge;BI)Lclient!jf;")
	public static Class6_Sub10 method1701(@OriginalArg(0) Class7 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method117(arg1);
		return local13 == null ? null : new Class6_Sub10(local13);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIB)I")
	public static int method1702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(38) int local38 = Static89.method1601(arg0 - 1, arg1 + -1) + Static89.method1601(arg0 + 1, arg1 + -1) + Static89.method1601(arg0 - 1, arg1 + 1) + Static89.method1601(arg0 + 1, arg1 + 1);
		@Pc(66) int local66 = Static89.method1601(arg0 - 1, arg1) + Static89.method1601(arg0 + 1, arg1) + Static89.method1601(arg0, arg1 + -1) + Static89.method1601(arg0, arg1 + 1);
		@Pc(71) int local71 = Static89.method1601(arg0, arg1);
		return local38 / 16 + local66 / 8 + local71 / 4;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!rd;ILclient!rd;)V")
	public static void method1703(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(3) Class63 arg2) {
		@Pc(1) short local1 = 151;
		if (Static92.aBoolean135) {
			Static44.method959();
			Static92.aBoolean135 = false;
			Static119.method2120();
			Static123.method2166();
			Static72.method1382();
			Static43.method95();
			Static123.method2164(Static68.anInt1974, Static38.anInt1233, Static15.anInt494, Static48.aClass6_Sub3_Sub3_Sub1_2);
			Static64.method1204(Static111.anIntArray352, -1, Static25.anInt847 == -1, Static86.anInt2366);
			Static35.aBoolean58 = true;
			Static51.aBoolean77 = true;
			Static52.aBoolean79 = true;
		}
		Static61.method1188();
		@Pc(45) int local45 = local1 - 3;
		Static48.aClass6_Sub3_Sub3_Sub1_2.method457(arg2, 257, 148, 0);
		Static48.aClass6_Sub3_Sub3_Sub1_2.method457(arg2, 256, 147, 16777215);
		if (arg1 != null) {
			local45 += 15;
			if (arg0) {
				@Pc(78) int local78 = Static48.aClass6_Sub3_Sub3_Sub1_2.method450(arg1) + 4;
				Static121.method1976(257 - local78 / 2, 152, local78, 11, 0);
			}
			Static48.aClass6_Sub3_Sub3_Sub1_2.method457(arg1, 257, 163, 0);
			Static48.aClass6_Sub3_Sub3_Sub1_2.method457(arg1, 256, 162, 16777215);
		}
		Static42.method925();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIII)V")
	public static void method1704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static2.anInt35 == arg4 && arg1 == Static5.anInt49 && (Static47.anInt1479 == arg2 || !Static61.aBoolean98)) {
			return;
		}
		Static2.anInt35 = arg4;
		Static5.anInt49 = arg1;
		Static47.anInt1479 = arg2;
		if (!Static61.aBoolean98) {
			Static47.anInt1479 = 0;
		}
		Static73.method1392(25);
		method1703(false, null, Static110.aClass63_1649);
		@Pc(37) int local37 = Static80.anInt2169;
		Static80.anInt2169 = arg4 * 8 - 48;
		@Pc(48) int local48 = Static80.anInt2169 - local37;
		@Pc(52) int local52 = Static91.anInt2560;
		Static91.anInt2560 = (arg1 - 6) * 8;
		@Pc(63) int local63 = Static91.anInt2560 - local52;
		for (@Pc(67) int local67 = 0; local67 < 32768; local67++) {
			@Pc(73) Class6_Sub3_Sub1_Sub2_Sub1 local73 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[local67];
			if (local73 != null) {
				for (@Pc(77) int local77 = 0; local77 < 10; local77++) {
					local73.anIntArray273[local77] -= local48;
					local73.anIntArray271[local77] -= local63;
				}
				local73.anInt2319 -= local48 * 128;
				local73.anInt2347 -= local63 * 128;
			}
		}
		for (@Pc(125) int local125 = 0; local125 < 2048; local125++) {
			@Pc(131) Class6_Sub3_Sub1_Sub2_Sub2 local131 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local125];
			if (local131 != null) {
				for (@Pc(135) int local135 = 0; local135 < 10; local135++) {
					local131.anIntArray273[local135] -= local48;
					local131.anIntArray271[local135] -= local63;
				}
				local131.anInt2347 -= local63 * 128;
				local131.anInt2319 -= local48 * 128;
			}
		}
		Static101.anInt2810 = arg2;
		@Pc(183) byte local183 = 0;
		@Pc(185) byte local185 = 1;
		Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.method1547(arg0, arg3, false);
		@Pc(193) byte local193 = 0;
		@Pc(195) byte local195 = 104;
		@Pc(197) byte local197 = 104;
		@Pc(199) byte local199 = 1;
		if (local48 < 0) {
			local195 = -1;
			local185 = -1;
			local183 = 103;
		}
		if (local63 < 0) {
			local197 = -1;
			local199 = -1;
			local193 = 103;
		}
		for (@Pc(217) int local217 = local183; local217 != local195; local217 += local185) {
			for (@Pc(221) int local221 = local193; local221 != local197; local221 += local199) {
				@Pc(227) int local227 = local217 + local48;
				@Pc(231) int local231 = local63 + local221;
				for (@Pc(233) int local233 = 0; local233 < 4; local233++) {
					if (local227 >= 0 && local231 >= 0 && local227 < 104 && local231 < 104) {
						Static89.aClass1ArrayArrayArray1[local233][local217][local221] = Static89.aClass1ArrayArrayArray1[local233][local227][local231];
					} else {
						Static89.aClass1ArrayArrayArray1[local233][local217][local221] = null;
					}
				}
			}
		}
		for (@Pc(301) Class6_Sub18 local301 = (Class6_Sub18) Static39.aClass1_3.method3(); local301 != null; local301 = (Class6_Sub18) Static39.aClass1_3.method14()) {
			local301.anInt3020 -= local48;
			local301.anInt3018 -= local63;
			if (local301.anInt3020 < 0 || local301.anInt3018 < 0 || local301.anInt3020 >= 104 || local301.anInt3018 >= 104) {
				local301.method2123();
			}
		}
		Static25.anInt845 = 0;
		Static17.aBoolean142 = false;
		if (Static36.anInt1217 != 0) {
			Static36.anInt1217 -= local48;
			Static52.anInt1599 -= local63;
		}
		Static87.anInt2414 = -1;
		Static20.aClass1_1.method17();
		Static88.aClass1_5.method17();
	}
}
