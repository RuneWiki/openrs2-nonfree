import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!cm", name = "wd", descriptor = "I")
	public static int anInt1807 = 2;

	@OriginalMember(owner = "client!cm", name = "Od", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[200];

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!gl;Z[II)Lclient!bw;")
	public static Class44 method1483(@OriginalArg(0) Class134 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int[] local7 = null;
		@Pc(14) int[] local14 = null;
		@Pc(16) int[] local16 = null;
		@Pc(18) float[][] local18 = null;
		if (arg0.aByteArray28 != null) {
			@Pc(24) int local24 = arg0.anInt3587;
			@Pc(27) int[] local27 = new int[local24];
			@Pc(30) int[] local30 = new int[local24];
			@Pc(33) int[] local33 = new int[local24];
			@Pc(36) int[] local36 = new int[local24];
			@Pc(39) int[] local39 = new int[local24];
			@Pc(42) int[] local42 = new int[local24];
			for (@Pc(44) int local44 = 0; local44 < local24; local44++) {
				local27[local44] = Integer.MAX_VALUE;
				local30[local44] = -2147483647;
				local33[local44] = Integer.MAX_VALUE;
				local36[local44] = -2147483647;
				local39[local44] = Integer.MAX_VALUE;
				local42[local44] = -2147483647;
			}
			local18 = new float[local24][];
			@Pc(89) int local89;
			@Pc(145) int local145;
			for (@Pc(83) int local83 = 0; local83 < arg2; local83++) {
				local89 = arg1[local83];
				if (arg0.aByteArray28[local89] != -1) {
					@Pc(102) int local102 = arg0.aByteArray28[local89] & 0xFF;
					for (@Pc(104) int local104 = 0; local104 < 3; local104++) {
						@Pc(121) short local121;
						if (local104 == 0) {
							local121 = arg0.aShortArray42[local89];
						} else if (local104 == 1) {
							local121 = arg0.aShortArray35[local89];
						} else {
							local121 = arg0.aShortArray37[local89];
						}
						@Pc(140) int local140 = arg0.anIntArray197[local121];
						local145 = arg0.anIntArray192[local121];
						@Pc(150) int local150 = arg0.anIntArray196[local121];
						if (local27[local102] > local140) {
							local27[local102] = local140;
						}
						if (local140 > local30[local102]) {
							local30[local102] = local140;
						}
						if (local33[local102] > local145) {
							local33[local102] = local145;
						}
						if (local145 > local36[local102]) {
							local36[local102] = local145;
						}
						if (local150 < local39[local102]) {
							local39[local102] = local150;
						}
						if (local42[local102] < local150) {
							local42[local102] = local150;
						}
					}
				}
			}
			local7 = new int[local24];
			local14 = new int[local24];
			local16 = new int[local24];
			for (local89 = 0; local89 < local24; local89++) {
				@Pc(240) byte local240 = arg0.aByteArray25[local89];
				if (local240 > 0) {
					local7[local89] = (local30[local89] + local27[local89]) / 2;
					local14[local89] = (local33[local89] + local36[local89]) / 2;
					local16[local89] = (local39[local89] + local42[local89]) / 2;
					@Pc(293) float local293;
					@Pc(309) float local309;
					@Pc(301) float local301;
					if (local240 == 1) {
						local145 = arg0.anIntArray190[local89];
						if (local145 == 0) {
							local309 = 1.0F;
							local293 = 1.0F;
						} else if (local145 <= 0) {
							local309 = 1.0F;
							local293 = (float) -local145 / 1024.0F;
						} else {
							local309 = (float) local145 / 1024.0F;
							local293 = 1.0F;
						}
						local301 = 64.0F / (float) arg0.anIntArray193[local89];
					} else if (local240 == 2) {
						local293 = 64.0F / (float) arg0.anIntArray190[local89];
						local301 = 64.0F / (float) arg0.anIntArray193[local89];
						local309 = 64.0F / (float) arg0.anIntArray189[local89];
					} else {
						local293 = (float) arg0.anIntArray190[local89] / 1024.0F;
						local301 = (float) arg0.anIntArray193[local89] / 1024.0F;
						local309 = (float) arg0.anIntArray189[local89] / 1024.0F;
					}
					local18[local89] = Static524.method6825(arg0.aShortArray40[local89], local309, arg0.aShortArray36[local89], local293, local301, arg0.aByteArray27[local89] & 0xFF, arg0.aShortArray39[local89]);
				}
			}
		}
		return new Class44(local7, local14, local16, local18);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!fq;[Lclient!uaa;)V")
	public static void method1490(@OriginalArg(0) Class34_Sub1 arg0, @OriginalArg(1) Class3_Sub13[] arg1) {
		@Pc(6) int local6;
		if (Static331.aBoolean356) {
			local6 = arg0.method7851(arg1);
			Static50.aClass95_1.method8018(local6, arg1);
		}
		if (Static368.aClass35Array1 == Static582.aClass35Array3) {
			@Pc(28) int local28;
			if (arg0 instanceof Class34_Sub1_Sub1) {
				local6 = ((Class34_Sub1_Sub1) arg0).aShort98;
				local28 = ((Class34_Sub1_Sub1) arg0).aShort99;
			} else {
				local6 = arg0.anInt9614 >> Static571.anInt9216;
				local28 = arg0.anInt9619 >> Static571.anInt9216;
			}
			Static50.aClass95_1.EA(Static556.aClass35Array2[0].method7452(arg0.anInt9614, arg0.anInt9619), Static660.method8810(local6, local28), Static153.method2450(local6, local28), Static226.method3388(local6, local28));
		}
		@Pc(64) Class34_Sub8 local64 = arg0.method7835(Static50.aClass95_1);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean671) {
			@Pc(72) Class34_Sub6[] local72 = local64.aClass34_Sub6Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class34_Sub6 local79 = local72[local74];
				if (local79.aBoolean332) {
					Static63.method1147(local79.anInt4988 - local79.anInt4992, local79.anInt4990 + local79.anInt4992, local79.anInt4989 - local79.anInt4992, local79.anInt4991 + local79.anInt4992);
				}
			}
		}
		if (local64.aBoolean527) {
			local64.aClass34_Sub1_20 = arg0;
			if (Static626.aBoolean718) {
				@Pc(119) Class255 local119 = Static305.aClass255_2;
				synchronized (Static305.aClass255_2) {
					Static305.aClass255_2.method5615(local64);
					return;
				}
			}
			Static305.aClass255_2.method5615(local64);
			return;
		}
		Static363.method8905(local64);
	}
}
