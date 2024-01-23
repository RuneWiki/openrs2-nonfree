import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "Lclient!kb;")
	public static Class83 aClass83_62;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
	public static void method1644(@OriginalArg(1) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (Static296.aBoolean335 && arg0) {
			local13 = Static209.aByteArrayArray104;
			local11 = 1;
		} else {
			local11 = 4;
			local13 = Static231.aByteArrayArray125;
		}
		@Pc(21) int[] local21 = null;
		for (@Pc(29) int local29 = 0; local29 < local11; local29++) {
			method1648();
			for (@Pc(40) int local40 = 0; local40 < 13; local40++) {
				for (@Pc(45) int local45 = 0; local45 < 13; local45++) {
					@Pc(50) boolean local50 = false;
					@Pc(58) int local58 = Static130.anIntArrayArrayArray13[local29][local40][local45];
					if (local58 != -1) {
						@Pc(70) int local70 = local58 >> 24 & 0x3;
						if (!arg0 || local70 == 0) {
							@Pc(83) int local83 = local58 >> 1 & 0x3;
							@Pc(89) int local89 = local58 >> 14 & 0x3FF;
							@Pc(95) int local95 = local58 >> 3 & 0x7FF;
							@Pc(105) int local105 = local95 / 8 + (local89 / 8 << 8);
							for (@Pc(107) int local107 = 0; local107 < Static8.anIntArray449.length; local107++) {
								if (Static8.anIntArray449[local107] == local105 && local13[local107] != null) {
									local50 = true;
									@Pc(143) int[] local143 = Static153.method2859(local13[local107], local29, local89, local95, local70, local45 * 8, local40 * 8, arg0, Static213.aClass36Array1, local83);
									if (local21 == null && local143 != null) {
										local21 = local143;
									}
									break;
								}
							}
						}
					}
					if (!local50) {
						Static183.method3313(local45 * 8, local40 * 8, 8, local29, 8);
					}
				}
			}
		}
		if (local21 == null) {
			Static6.anInt2268 = -1;
			return;
		}
		Static6.anInt2268 = local21[0];
		Static254.anInt5397 = local21[1];
		Static3.anInt107 = local21[3];
		Static62.anInt1583 = local21[2];
		Static271.anInt5843 = local21[4];
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)[Lclient!ug;")
	public static Class1_Sub2_Sub14[] method1646() {
		@Pc(8) Class1_Sub2_Sub14[] local8 = new Class1_Sub2_Sub14[Static153.anInt3542];
		for (@Pc(15) int local15 = 0; local15 < Static153.anInt3542; local15++) {
			@Pc(30) int local30 = Static166.anIntArray343[local15] * Static81.anIntArray204[local15];
			@Pc(34) byte[] local34 = Static200.aByteArrayArray83[local15];
			if (Static82.aBooleanArray9[local15]) {
				@Pc(42) byte[] local42 = Static10.aByteArrayArray5[local15];
				@Pc(45) int[] local45 = new int[local30];
				for (@Pc(47) int local47 = 0; local47 < local30; local47++) {
					local45[local47] = Static167.anIntArray346[local34[local47] & 0xFF] | (local42[local47] & 0xFF) << 24;
				}
				if (Static296.aBoolean335) {
					local8[local15] = new Class1_Sub2_Sub14_Sub2_Sub1(Static298.anInt6232, Static158.anInt3659, Static298.anIntArray623[local15], Static121.anIntArray257[local15], Static166.anIntArray343[local15], Static81.anIntArray204[local15], local45);
				} else {
					local8[local15] = new Class1_Sub2_Sub14_Sub1_Sub1(Static298.anInt6232, Static158.anInt3659, Static298.anIntArray623[local15], Static121.anIntArray257[local15], Static166.anIntArray343[local15], Static81.anIntArray204[local15], local45);
				}
			} else {
				@Pc(122) int[] local122 = new int[local30];
				for (@Pc(124) int local124 = 0; local124 < local30; local124++) {
					local122[local124] = Static167.anIntArray346[local34[local124] & 0xFF];
				}
				if (Static296.aBoolean335) {
					local8[local15] = new Class1_Sub2_Sub14_Sub2(Static298.anInt6232, Static158.anInt3659, Static298.anIntArray623[local15], Static121.anIntArray257[local15], Static166.anIntArray343[local15], Static81.anIntArray204[local15], local122);
				} else {
					local8[local15] = new Class1_Sub2_Sub14_Sub1(Static298.anInt6232, Static158.anInt3659, Static298.anIntArray623[local15], Static121.anIntArray257[local15], Static166.anIntArray343[local15], Static81.anIntArray204[local15], local122);
				}
			}
		}
		Static265.method4490();
		return local8;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	public static void method1647() {
		for (@Pc(15) Class1_Sub12 local15 = (Class1_Sub12) Static147.aClass117_12.method3441(); local15 != null; local15 = (Class1_Sub12) Static147.aClass117_12.method3444()) {
			@Pc(21) int local21 = local15.anInt2230;
			if (Static91.method1593(local21)) {
				@Pc(27) boolean local27 = true;
				@Pc(31) Class116[] local31 = Static81.aClass116ArrayArray1[local21];
				@Pc(33) int local33;
				for (local33 = 0; local33 < local31.length; local33++) {
					if (local31[local33] != null) {
						local27 = local31[local33].aBoolean224;
						break;
					}
				}
				if (!local27) {
					local33 = (int) local15.aLong201;
					@Pc(62) Class116 local62 = Static115.method1897(local33);
					if (local62 != null) {
						Static189.method3378(local62);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	public static void method1648() {
		if (Static264.aClass9_1 != null) {
			Static264.aClass9_1.method4340();
		}
		if (Static273.aClass9_2 != null) {
			Static273.aClass9_2.method4340();
		}
	}
}
