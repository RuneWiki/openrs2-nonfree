package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
final class Class505 implements Interface9 {

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "(Lclient!alw;)Ljava/lang/Object;", line = 15)
	@Override
	public Object method30271(@OriginalArg(0) Class93_Sub41 arg0) {
		return arg0.method22419();
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(Lclient!alw;I)Ljava/lang/Object;", line = 15)
	@Override
	public Object method30272(@OriginalArg(0) Class93_Sub41 arg0) {
		return arg0.method22419();
	}

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "(Lclient!alw;)Ljava/lang/Object;", line = 15)
	@Override
	public Object method30270(@OriginalArg(0) Class93_Sub41 arg0) {
		return arg0.method22419();
	}

	@OriginalMember(owner = "client!qh", name = "oc", descriptor = "(Lclient!yf;I)V", line = 7672)
	static final void method30206(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class144.method11180(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!qh", name = "va", descriptor = "(Lclient!yf;I)V", line = 8806)
	static final void method30207(@OriginalArg(0) Class681 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(19) Class93_Sub22 local19 = Class102.method2592(Class446.aClass446_5, client.aClass175_2.aClass24_2);
		local19.aClass93_Sub41_Sub2_1.method22510(local13.length() + 1);
		local19.aClass93_Sub41_Sub2_1.method22402(local13);
		client.aClass175_2.method24351(local19);
	}

	@OriginalMember(owner = "client!qh", name = "ys", descriptor = "(Lclient!yf;B)V", line = 9258)
	static final void method30209(@OriginalArg(0) Class681 arg0) {
		if (client.anInt3515 * 1563202683 >= 5 && client.anInt3515 * 1563202683 <= 9) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!qh", name = "aim", descriptor = "(Lclient!yf;B)V", line = 11309)
	static final void method30205(@OriginalArg(0) Class681 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(16) Class175 local16 = Class330.method27372();
		@Pc(22) Class93_Sub22 local22 = Class102.method2592(Class446.aClass446_43, local16.aClass24_2);
		local22.aClass93_Sub41_Sub2_1.method22510(0);
		@Pc(33) int local33 = local22.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		local22.aClass93_Sub41_Sub2_1.method22402(local13);
		local22.aClass93_Sub41_Sub2_1.method22454(arg0.aClass434_1.anInt4807 * 526894191);
		arg0.aClass434_1.aClass93_Sub1_Sub18_1.method22921(local22.aClass93_Sub41_Sub2_1, arg0.aClass434_1.anIntArray445);
		local22.aClass93_Sub41_Sub2_1.method22537(local22.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local33);
		local16.method24351(local22);
	}

	@OriginalMember(owner = "client!qh", name = "bbr", descriptor = "(Lclient!yf;I)V", line = 14368)
	static final void method30208(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!qh", name = "bfb", descriptor = "(Lclient!yf;I)V", line = 15188)
	static final void method30210(@OriginalArg(0) Class681 arg0) {
	}
}
