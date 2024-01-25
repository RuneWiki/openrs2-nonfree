import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "Lclient!lm;")
	public static Class134 aClass134_37;

	@OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
	public static int anInt1665;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)Lclient!ni;")
	public static Class1_Sub29 method1399() {
		if (Static150.aClass14_10 == null || Static276.aClass137_1 == null) {
			return null;
		}
		for (@Pc(16) Class1_Sub29 local16 = (Class1_Sub29) Static276.aClass137_1.method3162(); local16 != null; local16 = (Class1_Sub29) Static276.aClass137_1.method3162()) {
			@Pc(23) Class74 local23 = Static298.method5215(local16.anInt4242);
			if (local23 != null && local23.aBoolean121 && local23.method1448()) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	public static void method1402() {
		@Pc(8) int local8 = Static274.aByteArrayArray20.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static274.aByteArrayArray20[local10] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static282.anInt3514; local25++) {
					if (Static125.anIntArray253[local25] == Static146.anIntArray446[local10]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static125.anIntArray253[Static282.anInt3514] = Static146.anIntArray446[local10];
					local23 = Static282.anInt3514++;
				}
				@Pc(68) Class1_Sub21 local68 = new Class1_Sub21(Static274.aByteArrayArray20[local10]);
				@Pc(70) int local70 = 0;
				while (Static274.aByteArrayArray20[local10].length > local68.anInt6611 && local70 < 511 && Static271.anInt5578 < 1023) {
					@Pc(87) int local87 = local70++ << 6 | local23;
					@Pc(93) int local93 = local68.method5715();
					@Pc(97) int local97 = local93 >> 14;
					@Pc(103) int local103 = local93 >> 7 & 0x3F;
					@Pc(107) int local107 = local93 & 0x3F;
					@Pc(120) int local120 = local103 + (Static146.anIntArray446[local10] >> 8) * 64 - Static92.anInt1755;
					@Pc(134) int local134 = (Static146.anIntArray446[local10] & 0xFF) * 64 + local107 - Static98.anInt1911;
					@Pc(140) Class60 local140 = Static68.method1219(local68.method5715());
					if (Static178.aClass10_Sub1_Sub2_Sub1Array1[local87] == null && (local140.aByte15 & 0x1) > 0 && local97 == Static98.anInt1912 && local120 >= 0 && Static43.anInt1151 > local120 + local140.anInt1504 && local134 >= 0 && local134 + local140.anInt1504 < Static260.anInt5348) {
						Static178.aClass10_Sub1_Sub2_Sub1Array1[local87] = new Class10_Sub1_Sub2_Sub1();
						Static178.aClass10_Sub1_Sub2_Sub1Array1[local87].anInt4036 = local87;
						@Pc(194) Class10_Sub1_Sub2_Sub1 local194 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local87];
						Static79.anIntArray672[Static271.anInt5578++] = local87;
						local194.anInt4071 = Static282.anInt3516;
						local194.method677(local140);
						local194.method3404(local194.aClass60_1.anInt1504);
						local194.anInt4011 = local194.aClass60_1.anInt1531 << 3;
						if (local194.anInt4011 == 0) {
							local194.method3415(0);
						} else {
							local194.method3415(Static125.anIntArray254[local194.aClass60_1.aByte16 - 1]);
						}
						local194.method3401(true, local134, local120, local194.method3402(), local97);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
	public static void method1404() {
		Static223.aClass163Array2 = null;
		Static226.method4889(-1, Static26.anInt476, 0, 0, 0, Static129.anInt2569, 0, Static321.anInt6388);
		if (Static223.aClass163Array2 != null) {
			Static254.method4546(0, Static44.anInt1169, Static177.aClass163_12.anInt4982, Static223.aClass163Array2, Static121.anInt4225, 0, Static26.anInt476, Static321.anInt6388, -1412584499);
			Static223.aClass163Array2 = null;
		}
	}
}
