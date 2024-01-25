import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "Lclient!dv;")
	public static final Class96 aClass96_5 = new Class96(13, 0, 1, 0);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
	public static int anInt1455 = 0;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
	public static int anInt1456 = -1;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!rt;Z)I")
	public static int method1315(@OriginalArg(0) Class312 arg0) {
		if (Static57.aClass312_1 == arg0) {
			return 5890;
		} else if (Static625.aClass312_4 == arg0) {
			return 34167;
		} else if (arg0 == Static79.aClass312_2) {
			return 34168;
		} else if (arg0 == Static291.aClass312_3) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!ub;I)V")
	public static void method1317(@OriginalArg(0) Class5_Sub23_Sub2 arg0) {
		arg0.method8549();
		@Pc(20) int local20 = Static279.anInt4838;
		@Pc(30) Class8_Sub1_Sub3_Sub2_Sub1 local30 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local20] = new Class8_Sub1_Sub3_Sub2_Sub1();
		local30.anInt6994 = local20;
		@Pc(38) int local38 = arg0.method8550(30);
		@Pc(43) byte local43 = (byte) (local38 >> 28);
		@Pc(49) int local49 = local38 >> 14 & 0x3FFF;
		@Pc(53) int local53 = local38 & 0x3FFF;
		local30.anIntArray414[0] = local49 - Static622.anInt10188;
		local30.anInt10355 = (local30.anIntArray414[0] << 9) + (local30.method5993() << 8);
		local30.anIntArray415[0] = local53 - Static668.anInt10683;
		local30.anInt10363 = (local30.anIntArray415[0] << 9) + (local30.method5993() << 8);
		Static240.anInt3974 = local30.aByte145 = local30.aByte146 = local43;
		if (Static90.method1353(1, local30.anIntArray415[0], local30.anIntArray414[0])) {
			local30.aByte146++;
		}
		if (Static526.aClass5_Sub23Array1[local20] != null) {
			local30.method3604(Static526.aClass5_Sub23Array1[local20]);
		}
		Static116.anInt3318 = 0;
		Static88.anIntArray464[Static116.anInt3318++] = local20;
		Static98.aByteArray8[local20] = 0;
		Static106.anInt1728 = 0;
		for (@Pc(160) int local160 = 1; local160 < 2048; local160++) {
			if (local160 != local20) {
				@Pc(172) int local172 = arg0.method8550(18);
				@Pc(176) int local176 = local172 >> 16;
				@Pc(182) int local182 = local172 >> 8 & 0xFF;
				@Pc(186) int local186 = local172 & 0xFF;
				@Pc(194) Class136 local194 = Static601.aClass136Array1[local160] = new Class136();
				local194.aBoolean251 = false;
				local194.anInt2998 = -1;
				local194.anInt2999 = local186 + (local176 << 28) + (local182 << 14);
				local194.aBoolean252 = false;
				local194.anInt2997 = 0;
				Static377.anIntArray372[Static106.anInt1728++] = local160;
				Static98.aByteArray8[local160] = 0;
			}
		}
		arg0.method8548();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)Lclient!qa;")
	public static Class8_Sub1_Sub4 method1318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class174 local7 = Static260.aClass174ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass8_Sub1_Sub4_2;
	}
}
