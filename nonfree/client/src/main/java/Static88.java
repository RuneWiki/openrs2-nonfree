import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "Lclient!hh;")
	public static Class50 aClass50_587 = Static186.method3527("not yet implemented");

	@OriginalMember(owner = "client!ia", name = "J", descriptor = "Lclient!hh;")
	public static Class50 aClass50_588 = Static186.method3527("scrollbar");

	@OriginalMember(owner = "client!ia", name = "K", descriptor = "Lclient!hh;")
	public static Class50 aClass50_589 = Static186.method3527("hint_headicons");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!pg;Z)V")
	public static void method1383(@OriginalArg(0) Class1_Sub17 arg0) {
		while (arg0.aByteArray40.length > arg0.anInt2656) {
			@Pc(14) boolean local14 = false;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			if (arg0.method2142() == 1) {
				local14 = true;
				local16 = arg0.method2142();
				local18 = arg0.method2142();
			}
			@Pc(37) int local37 = arg0.method2142();
			@Pc(41) int local41 = arg0.method2142();
			@Pc(48) int local48 = local37 * 64 - Static121.anInt2393;
			@Pc(58) int local58 = Static195.anInt3969 + Static12.anInt239 - local41 * 64 - 1;
			@Pc(90) byte local90;
			@Pc(84) int local84;
			if (local48 >= 0 && local58 - 63 >= 0 && Static164.anInt3383 > local48 + 63 && Static12.anInt239 > local58) {
				local84 = local48 >> 6;
				@Pc(116) int local116 = local58 >> 6;
				for (@Pc(118) int local118 = 0; local118 < 64; local118++) {
					for (@Pc(122) int local122 = 0; local122 < 64; local122++) {
						if (!local14 || local16 * 8 <= local118 && local118 < local16 * 8 + 8 && local122 >= local18 * 8 && local122 < local18 * 8 + 8) {
							local90 = arg0.method2155();
							if (local90 != 0) {
								if (Static60.aByteArrayArrayArray4[local84][local116] == null) {
									Static60.aByteArrayArrayArray4[local84][local116] = new byte[4096];
								}
								Static60.aByteArrayArrayArray4[local84][local116][local118 + (63 - local122 << 6)] = local90;
								@Pc(202) byte local202 = arg0.method2155();
								if (Static128.aByteArrayArrayArray8[local84][local116] == null) {
									Static128.aByteArrayArrayArray8[local84][local116] = new byte[4096];
								}
								Static128.aByteArrayArrayArray8[local84][local116][(63 - local122 << 6) + local118] = local202;
							}
						}
					}
				}
			} else {
				for (local84 = 0; (local14 ? 64 : 4096) > local84; local84++) {
					local90 = arg0.method2155();
					if (local90 != 0) {
						arg0.anInt2656++;
					}
				}
			}
		}
	}
}
