package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
class Class159 implements Interface25 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!eu", name = "this$0", descriptor = "Lclient!ft;")
	final Class183 this$0;

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "(Lclient!de;IIIIII)Lclient!dh;", line = 27)
	public static Class20 method23204(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) long local2 = (long) arg5;
		@Pc(7) Class20 local7 = (Class20) Class68.aClass161_10.method23219(local2);
		@Pc(9) short local9 = 2055;
		if (local7 == null) {
			@Pc(16) Class138 local16 = Class138.method22955(Class55.aClass359_17, arg5, 0);
			if (local16 == null) {
				return null;
			}
			if (local16.anInt3415 < 13) {
				local16.method22968(2);
			}
			local7 = arg0.method17100(local16, local9, Class212.anInt3704 * -1018743043, 64, 768);
			Class68.aClass161_10.method23222(local7, local2);
		}
		local7 = local7.method5430((byte) 6, local9, true);
		if (arg1 != 0) {
			local7.method5329(arg1);
		}
		if (arg2 != 0) {
			local7.method5331(arg2);
		}
		if (arg3 != 0) {
			local7.method5482(arg3);
		}
		if (arg4 != 0) {
			local7.method5333(0, arg4, 0);
		}
		return local7;
	}

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!ft;)V", line = 480)
	Class159(@OriginalArg(0) Class183 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "(S)F", line = 482)
	@Override
	public float method23202() {
		return (float) Class510.aClass3_Sub45_37.aClass60_Sub33_5.method14179() / 255.0F;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "()F", line = 482)
	@Override
	public float method23203() {
		return (float) Class510.aClass3_Sub45_37.aClass60_Sub33_5.method14179() / 255.0F;
	}

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "(Lclient!amn;I)V", line = 524)
	static void method23207(@OriginalArg(0) Class3_Sub1_Sub9 arg0) {
		@Pc(1) boolean local1 = false;
		arg0.method33669();
		for (@Pc(9) Class3_Sub1_Sub9 local9 = (Class3_Sub1_Sub9) Class250.aClass546_15.method32623(); local9 != null; local9 = (Class3_Sub1_Sub9) Class250.aClass546_15.method32645()) {
			if (Class472.method28776(arg0.method19051(), local9.method19051())) {
				Class533.method32507(arg0, local9);
				local1 = true;
				break;
			}
		}
		if (!local1) {
			Class250.aClass546_15.method32621(arg0);
		}
	}

	@OriginalMember(owner = "client!eu", name = "fh", descriptor = "(ILjava/lang/String;ZI)V", line = 1934)
	static void method23206(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 == 1 && !arg2) {
			method23206(5, arg1, true);
			@Pc(19) int local19 = Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 5 ? 2 : 0;
			if (local19 == 2 && Class613.aClass21_13.method17016().aBoolean611) {
				local19 = 1;
			}
			Class42.method8326(local19);
		}
		Class13_Sub5.method5647();
		Class47_Sub1.method8801();
		Class157.method23195();
		Class315.method25834(arg0, arg1, arg2);
		Class379.aClass312_1.method25803();
		Class379.aClass312_1.method25797(client.anInterface34_1);
		Class134.method22909(Class613.aClass21_13);
		Class551.method32694(Class613.aClass21_13, Class294.aClass359_54);
		Class578.method33182();
		Class618.method33710(Class19_Sub1.aClass6Array10);
		Class401.method27608();
		Class457.method28515();
		if (client.anInt3039 * 1115111877 == 2) {
			Class166.method23342(6);
		} else if (client.anInt3039 * 1115111877 == 18) {
			Class166.method23342(11);
		} else if (client.anInt3039 * 1115111877 == 3) {
			Class166.method23342(12);
		} else if (client.anInt3039 * 1115111877 == 5) {
			Class166.method23342(7);
		} else if (client.anInt3039 * 1115111877 == 13 || client.anInt3039 * 1115111877 == 8) {
			Class155.method23173();
		} else if (client.anInt3039 * 1115111877 == 16) {
			Class166.method23342(1);
		} else if (client.anInt3039 * 1115111877 == 7) {
			Class606.method33538(false);
		}
	}

	@OriginalMember(owner = "client!eu", name = "zn", descriptor = "(Lclient!vs;I)V", line = 8641)
	static final void method23205(@OriginalArg(0) Class536 arg0) {
		if (Class14_Sub5.aClass3_Sub30_1 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 1;
			arg0.aClass3_Sub30_3 = Class14_Sub5.aClass3_Sub30_1;
		}
	}

	@OriginalMember(owner = "client!eu", name = "apn", descriptor = "(Lclient!vs;B)V", line = 11679)
	static final void method23208(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
	}
}
