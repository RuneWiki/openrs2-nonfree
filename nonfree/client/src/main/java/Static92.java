import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!daa", name = "g", descriptor = "Z")
	public static boolean aBoolean180 = true;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1872(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static102.method2010(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static173.anInt3293; local25++) {
			@Pc(37) String local37 = Static564.aStringArray72[local25];
			if (local37.startsWith("*")) {
				local37 = local37.substring(1);
			}
			local37 = Static102.method2010(local37);
			if (local37 != null && local37.equals(local20)) {
				Static173.anInt3293--;
				for (@Pc(61) int local61 = local25; local61 < Static173.anInt3293; local61++) {
					Static564.aStringArray72[local61] = Static564.aStringArray72[local61 + 1];
					Static614.aStringArray68[local61] = Static614.aStringArray68[local61 + 1];
					Static196.aStringArray26[local61] = Static196.aStringArray26[local61 + 1];
					Static93.aStringArray17[local61] = Static93.aStringArray17[local61 + 1];
					Static173.aBooleanArray14[local61] = Static173.aBooleanArray14[local61 + 1];
				}
				Static221.anInt4055 = Static373.anInt6615;
				@Pc(118) Class3_Sub44 local118 = Static275.method5689(Static300.aClass376_75, Static540.aClass282_4);
				local118.aClass3_Sub17_Sub2_3.method4849(Static153.method2617(arg0));
				local118.aClass3_Sub17_Sub2_3.method4878(arg0);
				Static616.method8089(local118);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)V")
	public static void method1873() {
		@Pc(9) int local9 = Static67.aClass3_Sub17_Sub2_4.method4872();
		Static176.anInt3321 = Static67.aClass3_Sub17_Sub2_4.method4874();
		@Pc(17) int local17 = Static67.aClass3_Sub17_Sub2_4.method4888();
		@Pc(21) int local21 = Static67.aClass3_Sub17_Sub2_4.method4872();
		@Pc(30) boolean local30 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
		Static390.method5662();
		Static139.method2419(local17);
		Static67.aClass3_Sub17_Sub2_4.method4906();
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(60) int local60;
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			for (local49 = 0; local49 < Static251.anInt4680 >> 3; local49++) {
				for (local53 = 0; local53 < Static406.anInt6924 >> 3; local53++) {
					local60 = Static67.aClass3_Sub17_Sub2_4.method4905(1);
					if (local60 == 1) {
						Static104.anIntArrayArrayArray3[local40][local49][local53] = Static67.aClass3_Sub17_Sub2_4.method4905(26);
					} else {
						Static104.anIntArrayArrayArray3[local40][local49][local53] = -1;
					}
				}
			}
		}
		Static67.aClass3_Sub17_Sub2_4.method4908();
		local49 = (Static548.anInt8905 - Static67.aClass3_Sub17_Sub2_4.lb) / 16;
		Static192.anIntArrayArray39 = new int[local49][4];
		for (local53 = 0; local53 < local49; local53++) {
			for (local60 = 0; local60 < 4; local60++) {
				Static192.anIntArrayArray39[local53][local60] = Static67.aClass3_Sub17_Sub2_4.method4868();
			}
		}
		Static169.aByteArrayArray6 = new byte[local49][];
		Static287.aByteArrayArray11 = new byte[local49][];
		Static442.anIntArray464 = new int[local49];
		Static63.anIntArray539 = new int[local49];
		Static663.anIntArray662 = new int[local49];
		Static143.aByteArrayArray4 = new byte[local49][];
		Static316.aByteArrayArray16 = null;
		Static489.anIntArray535 = new int[local49];
		Static384.anIntArray27 = new int[local49];
		Static284.anIntArray343 = null;
		Static618.aByteArrayArray24 = new byte[local49][];
		local49 = 0;
		for (local60 = 0; local60 < 4; local60++) {
			for (@Pc(190) int local190 = 0; local190 < Static251.anInt4680 >> 3; local190++) {
				for (@Pc(194) int local194 = 0; local194 < Static406.anInt6924 >> 3; local194++) {
					@Pc(204) int local204 = Static104.anIntArrayArrayArray3[local60][local190][local194];
					if (local204 != -1) {
						@Pc(214) int local214 = local204 >> 14 & 0x3FF;
						@Pc(220) int local220 = local204 >> 3 & 0x7FF;
						@Pc(231) int local231 = (local214 / 8 << 8) + (local220 / 8);
						for (@Pc(233) int local233 = 0; local233 < local49; local233++) {
							if (local231 == Static442.anIntArray464[local233]) {
								local231 = -1;
								break;
							}
						}
						if (local231 != -1) {
							Static442.anIntArray464[local49] = local231;
							@Pc(266) int local266 = local231 >> 8 & 0xFF;
							@Pc(270) int local270 = local231 & 0xFF;
							Static384.anIntArray27[local49] = Static673.aClass143_110.method3131("m" + local266 + "_" + local270);
							Static63.anIntArray539[local49] = Static673.aClass143_110.method3131("l" + local266 + "_" + local270);
							Static663.anIntArray662[local49] = Static673.aClass143_110.method3131("um" + local266 + "_" + local270);
							Static489.anIntArray535[local49] = Static673.aClass143_110.method3131("ul" + local266 + "_" + local270);
							local49++;
						}
					}
				}
			}
		}
		Static271.method4330(11, local21, local30, local9);
	}
}
