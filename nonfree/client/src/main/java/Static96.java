import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "Lclient!tk;")
	public static final Class239 aClass239_5 = new Class239();

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_34 = new Class15("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_32 = new Class146(29, 2);

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "Z")
	public static boolean aBoolean121 = true;

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "[S")
	public static final short[] aShortArray16 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_71 = new Class56(101, 12);

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public static void method1454() {
		@Pc(13) int local13 = Static372.aByteArrayArray13.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			if (Static372.aByteArrayArray13[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static320.anInt5204; local25++) {
					if (Static367.anIntArray478[local25] == Static91.anIntArray131[local15]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static367.anIntArray478[Static320.anInt5204] = Static91.anIntArray131[local15];
					local23 = Static320.anInt5204++;
				}
				@Pc(64) Class4_Sub9 local64 = new Class4_Sub9(Static372.aByteArrayArray13[local15]);
				@Pc(66) int local66 = 0;
				while (Static372.aByteArrayArray13[local15].length > local64.anInt6207 && local66 < 511 && Static148.anInt2692 < 1023) {
					@Pc(83) int local83 = local66++ << 6 | local23;
					@Pc(87) int local87 = local64.method5028();
					@Pc(91) int local91 = local87 >> 14;
					@Pc(97) int local97 = local87 >> 7 & 0x3F;
					@Pc(101) int local101 = local87 & 0x3F;
					@Pc(115) int local115 = (Static91.anIntArray131[local15] >> 8) * 64 + local97 - Static365.anInt6047;
					@Pc(128) int local128 = local101 + (Static91.anIntArray131[local15] & 0xFF) * 64 - Static366.anInt6052;
					@Pc(135) Class78 local135 = Static120.aClass115_2.method2201(local64.method5028());
					if (Static367.aClass8_Sub3_Sub1_Sub2Array1[local83] == null && (local135.aByte34 & 0x1) > 0 && Static163.anInt3008 == local91 && local115 >= 0 && local115 + local135.anInt1885 < Static337.anInt5497 && local128 >= 0 && Static282.anInt4644 > local128 + local135.anInt1885) {
						Static367.aClass8_Sub3_Sub1_Sub2Array1[local83] = new Class8_Sub3_Sub1_Sub2();
						Static367.aClass8_Sub3_Sub1_Sub2Array1[local83].anInt7391 = local83;
						@Pc(189) Class8_Sub3_Sub1_Sub2 local189 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local83];
						Static106.anIntArray150[Static148.anInt2692++] = local83;
						local189.anInt7354 = Static265.anInt4371;
						local189.method5907(local135);
						local189.method5901(local189.aClass78_1.anInt1885);
						local189.anInt7406 = local189.aClass78_1.anInt1884 << 3;
						if (local189.anInt7406 == 0) {
							local189.method5889(0);
						} else {
							local189.method5889((local189.aClass78_1.aByte38 + 4 & 0xFF600007) << 11);
						}
						local189.method5905(true, local189.method5894(), local91, local128, local115);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
	public static void method1456() {
		if (Static365.anIntArray475 != null) {
			return;
		}
		Static365.anIntArray475 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(39) double local39 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(79) double local79;
				if (local57 < 0.5D) {
					local79 = (local50 + 1.0D) * local57;
				} else {
					local79 = local57 + local50 - local50 * local57;
				}
				@Pc(94) double local94 = local57 * 2.0D - local79;
				@Pc(98) double local98 = local39 + 0.3333333333333333D;
				if (local98 > 1.0D) {
					local98--;
				}
				@Pc(112) double local112 = local39 - 0.3333333333333333D;
				if (local39 * 6.0D < 1.0D) {
					local61 = (local79 - local94) * 6.0D * local39 + local94;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local79;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = local94 + (0.6666666666666666D - local39) * 6.0D * (local79 - local94);
				} else {
					local61 = local94;
				}
				if (local112 < 0.0D) {
					local112++;
				}
				if (local98 * 6.0D < 1.0D) {
					local59 = local94 + local98 * 6.0D * (local79 - local94);
				} else if (local98 * 2.0D < 1.0D) {
					local59 = local79;
				} else if (local98 * 3.0D < 2.0D) {
					local59 = (0.6666666666666666D - local98) * (-local94 + local79) * 6.0D + local94;
				} else {
					local59 = local94;
				}
				if (local112 * 6.0D < 1.0D) {
					local63 = (local79 - local94) * 6.0D * local112 + local94;
				} else if (local112 * 2.0D < 1.0D) {
					local63 = local79;
				} else if (local112 * 3.0D < 2.0D) {
					local63 = local94 + (0.6666666666666666D - local112) * 6.0D * (local79 - local94);
				} else {
					local63 = local94;
				}
			}
			local59 = Math.pow(local59, local24);
			local61 = Math.pow(local61, local24);
			local63 = Math.pow(local63, local24);
			@Pc(290) int local290 = (int) (local59 * 256.0D);
			@Pc(295) int local295 = (int) (local61 * 256.0D);
			@Pc(300) int local300 = (int) (local63 * 256.0D);
			@Pc(310) int local310 = local300 + (local295 << 8) + (local290 << 16);
			Static365.anIntArray475[local26] = local310;
		}
	}
}
