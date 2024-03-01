package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public class Class110_Sub5 extends Class110 {

	@OriginalMember(owner = "client!aga", name = "n", descriptor = "Ljava/lang/String;")
	final String aString25;

	@OriginalMember(owner = "client!aga", name = "m", descriptor = "I")
	final int anInt893;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!alw;)V", line = 12)
	Class110_Sub5(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.aString25 = arg0.method22427();
		this.anInt893 = arg0.method22415() * 1312003631;
	}

	@OriginalMember(owner = "client!aga", name = "n", descriptor = "(I)V", line = 18)
	@Override
	public void method20138() {
		if (client.anInt3462 * 1756332913 != -1) {
			Class359.method27791(client.anInt3462 * 1756332913, this.aString25, this.anInt893 * 377188559);
		}
	}

	@OriginalMember(owner = "client!aga", name = "f", descriptor = "()V", line = 18)
	@Override
	public void method20140() {
		if (client.anInt3462 * 1756332913 != -1) {
			Class359.method27791(client.anInt3462 * 1756332913, this.aString25, this.anInt893 * 377188559);
		}
	}

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "(Lclient!ase;I)V", line = 42)
	static final void method7654(@OriginalArg(0) Class93_Sub41_Sub2 arg0) {
		arg0.method22668();
		@Pc(6) int local6 = client.anInt3513 * -859840571;
		@Pc(19) Class132_Sub1_Sub1_Sub1_Sub2 local19 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local6] = new Class132_Sub1_Sub1_Sub1_Sub2(client.aClass532_1.method30459());
		local19.anInt2768 = local6 * 171759809;
		@Pc(29) int local29 = arg0.method22689(30);
		@Pc(34) byte local34 = (byte) (local29 >> 28);
		@Pc(40) int local40 = local29 >> 14 & 0x3FFF;
		@Pc(44) int local44 = local29 & 0x3FFF;
		@Pc(48) Class611 local48 = client.aClass532_1.method30443();
		local19.anIntArray240[0] = local40 - local48.anInt5623 * 270611681;
		local19.anIntArray239[0] = local44 - local48.anInt5624 * -1994307635;
		local19.method24231((float) ((local19.anIntArray240[0] << 9) + (local19.method19997() << 8)), local19.method24218().aClass472_61.aFloat318, (float) ((local19.anIntArray239[0] << 9) + (local19.method19997() << 8)));
		Class512.anInt5209 = (local19.aByte100 = local19.aByte99 = local34) * -69533369;
		if (client.aClass532_1.method30509().method30330(local19.anIntArray240[0], local19.anIntArray239[0])) {
			local19.aByte99++;
		}
		if (Class174.aClass93_Sub41Array2[local6] != null) {
			local19.method20066(Class174.aClass93_Sub41Array2[local6]);
		}
		if (Class174.aClass93_Sub41Array1[local6] != null) {
			local19.method20048(Class174.aClass93_Sub41Array1[local6]);
		}
		Class174.anInt3293 = 0;
		Class174.anIntArray278[(Class174.anInt3293 += -1190240903) * -1081967415 - 1] = local6;
		Class174.aByteArray63[local6] = 0;
		Class174.anInt3295 = 0;
		for (@Pc(174) int local174 = 1; local174 < 2048; local174++) {
			if (local6 != local174) {
				@Pc(186) int local186 = arg0.method22689(18);
				@Pc(192) int local192 = local186 >> 16 & 0x3;
				@Pc(198) int local198 = local186 >> 8 & 0xFF;
				@Pc(202) int local202 = local186 & 0xFF;
				@Pc(210) Class200 local210 = Class174.aClass200Array1[local174] = new Class200();
				local210.anInt3377 = (local202 + (local192 << 28) + (local198 << 14)) * -1383292861;
				local210.anInt3376 = 0;
				local210.anInt3375 = -1517206021;
				local210.aClass286_2 = Class286.aClass286_5;
				local210.aBoolean578 = false;
				Class174.anIntArray277[(Class174.anInt3295 += -70810673) * 1575920431 - 1] = local174;
				Class174.aByteArray63[local174] = 0;
			}
		}
		arg0.method22670();
		@Pc(260) Class342 local260 = Class65.aClass123_Sub1_2.method9023();
		if (Class342.aClass342_3 == local260) {
			@Pc(268) Class124_Sub1 local268 = (Class124_Sub1) Class65.aClass123_Sub1_2.method8952();
			local268.method9159();
		}
		@Pc(275) Class338 local275 = Class65.aClass123_Sub1_2.method8986();
		if (Class338.aClass338_4 == local275) {
			@Pc(283) Class25_Sub5 local283 = (Class25_Sub5) Class65.aClass123_Sub1_2.method9040();
			local283.method16472();
		}
	}

	@OriginalMember(owner = "client!aga", name = "en", descriptor = "(III)V", line = 958)
	public static void method7657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class159_Sub1.anInt1956 = (arg0 - Class159_Sub1.anInt1915) * 130712985;
		Class159_Sub1.anInt1951 = (arg1 - Class159_Sub1.anInt1921) * 919990023;
	}

	@OriginalMember(owner = "client!aga", name = "ed", descriptor = "(IB)Z", line = 1752)
	static boolean method7655(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 13 || arg0 == 15 || arg0 == 18;
	}

	@OriginalMember(owner = "client!aga", name = "ln", descriptor = "(Lclient!yf;B)V", line = 7107)
	static final void method7656(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class247.method25916(local11, local14, arg0);
	}
}
