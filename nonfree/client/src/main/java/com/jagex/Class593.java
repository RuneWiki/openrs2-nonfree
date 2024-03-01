package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!y")
final class Class593 implements Interface48 {

	@OriginalMember(owner = "client!y", name = "h", descriptor = "([Lclient!fo;I)V", line = 206)
	public static void method33355(@OriginalArg(0) Class178[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class178 local9 = arg0[local1];
			if (local9.anObjectArray16 != null) {
				@Pc(16) Class3_Sub17 local16 = new Class3_Sub17();
				local16.aClass178_2 = local9;
				local16.anObjectArray1 = local9.anObjectArray16;
				Class392.method27429(local16, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!y", name = "a", descriptor = "(Lclient!ano;)Z", line = 979)
	@Override
	public boolean method33352(@OriginalArg(0) Class26_Sub1_Sub1 arg0) {
		return arg0 instanceof Interface43 && ((Interface43) arg0).method11150();
	}

	@OriginalMember(owner = "client!y", name = "p", descriptor = "(Lclient!ano;S)Z", line = 979)
	@Override
	public boolean method33353(@OriginalArg(0) Class26_Sub1_Sub1 arg0) {
		return arg0 instanceof Interface43 && ((Interface43) arg0).method11150();
	}

	@OriginalMember(owner = "client!y", name = "dk", descriptor = "(Lclient!vs;I)V", line = 4607)
	static final void method33354(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class163.method23292(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!y", name = "oc", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6700)
	static final void method33356(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		@Pc(18) int[] local18 = Class201.method24159(local13, arg2);
		if (local18 != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray7 = Class484.method29109(local13, arg2);
		arg0.anIntArray368 = local18;
		arg0.aBoolean644 = true;
	}
}
