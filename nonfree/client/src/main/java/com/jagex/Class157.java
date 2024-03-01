package com.jagex;

import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
class Class157 implements Interface25 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!es", name = "this$0", descriptor = "Lclient!ft;")
	final Class183 this$0;

	@OriginalMember(owner = "client!es", name = "g", descriptor = "(B)V", line = 75)
	public static void method23191() {
		Class602.aClass6_37 = null;
		Class2.anInt1 = -510043045;
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!ft;)V", line = 485)
	Class157(@OriginalArg(0) Class183 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!es", name = "p", descriptor = "(S)F", line = 487)
	@Override
	public float method23202() {
		return (float) Class510.aClass3_Sub45_37.aClass60_Sub33_4.method14179() / 255.0F;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "()F", line = 487)
	@Override
	public float method23203() {
		return (float) Class510.aClass3_Sub45_37.aClass60_Sub33_4.method14179() / 255.0F;
	}

	@OriginalMember(owner = "client!es", name = "w", descriptor = "(Lclient!pp;IIS)J", line = 827)
	static long method23194(@OriginalArg(0) Interface43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) long local1 = 4194304L;
		@Pc(3) long local3 = Long.MIN_VALUE;
		@Pc(12) Class467 local12 = client.aClass370_1.method26954().method28510(arg0.method11163());
		@Pc(33) long local33 = (long) (arg1 | arg2 << 7 | arg0.method11146() << 14 | arg0.method11147() << 20 | 0x40000000);
		if (local12.anInt5082 * 1242646151 == 0) {
			local33 |= local3;
		}
		if (local12.anInt5087 * 2055542599 == 1) {
			local33 |= local1;
		}
		return local33 | (long) arg0.method11163() << 32;
	}

	@OriginalMember(owner = "client!es", name = "fd", descriptor = "(B)V", line = 2101)
	static void method23195() {
		Class217.aClass65_1.method13146();
		Class3_Sub10.aClass61_1.method12743();
		Class314.aClient1.method22243();
		Class106.aCanvas6.setBackground(Color.black);
		client.anInt3121 = -2040917719;
		Class217.aClass65_1 = Class60_Sub32.method14023(Class106.aCanvas6);
		Class3_Sub10.aClass61_1 = Class316.method25838(Class106.aCanvas6, true);
	}

	@OriginalMember(owner = "client!es", name = "fe", descriptor = "(IIIZI)V", line = 2171)
	public static void method23193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		client.aLong234 = 0L;
		@Pc(4) int local4 = Class492.method29292();
		if (arg0 == 3 || local4 == 3) {
			arg3 = true;
		}
		if (!Class613.aClass21_13.method17218()) {
			arg3 = true;
		}
		Class566.method32920(local4, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!es", name = "pn", descriptor = "(Lclient!vs;I)V", line = 6940)
	static final void method23188(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3561 * -1625983971;
	}

	@OriginalMember(owner = "client!es", name = "xd", descriptor = "(Lclient!vs;B)V", line = 8405)
	static final void method23189(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class515.aByte169;
	}

	@OriginalMember(owner = "client!es", name = "amw", descriptor = "(Lclient!vs;B)V", line = 11228)
	static final void method23190(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class146.method23084() ? 1 : 0;
	}

	@OriginalMember(owner = "client!es", name = "aol", descriptor = "(Lclient!vs;I)V", line = 11611)
	static final void method23192(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub10_1.method13373();
	}
}
