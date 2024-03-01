package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aam")
public class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!aam", name = "x", descriptor = "I")
	public int anInt98;

	@OriginalMember(owner = "client!aam", name = "<init>", descriptor = "(Lclient!nw;I)V", line = 12)
	Class11_Sub1(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aam", name = "a", descriptor = "(Lclient!ahb;II)V", line = 16)
	@Override
	void method1198(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class595 local6 = (Class595) Class356.method26649(Class306.method25729(), arg1);
		if (Class595.aClass595_9 == local6) {
			this.anInt98 = arg0.method20271() * -2129266919;
		}
	}

	@OriginalMember(owner = "client!aam", name = "z", descriptor = "(Lclient!ahb;I)V", line = 16)
	@Override
	void method1200(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class595 local6 = (Class595) Class356.method26649(Class306.method25729(), arg1);
		if (Class595.aClass595_9 == local6) {
			this.anInt98 = arg0.method20271() * -2129266919;
		}
	}

	@OriginalMember(owner = "client!aam", name = "j", descriptor = "(Lclient!ahb;I)V", line = 16)
	@Override
	void method1210(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class595 local6 = (Class595) Class356.method26649(Class306.method25729(), arg1);
		if (Class595.aClass595_9 == local6) {
			this.anInt98 = arg0.method20271() * -2129266919;
		}
	}

	@OriginalMember(owner = "client!aam", name = "n", descriptor = "(Lclient!ahb;I)V", line = 16)
	@Override
	void method1205(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class595 local6 = (Class595) Class356.method26649(Class306.method25729(), arg1);
		if (Class595.aClass595_9 == local6) {
			this.anInt98 = arg0.method20271() * -2129266919;
		}
	}

	@OriginalMember(owner = "client!aam", name = "a", descriptor = "(II)I", line = 16)
	static int method819(@OriginalArg(0) int arg0) {
		if (arg0 == 9 || arg0 == 10) {
			return 1;
		} else if (arg0 == 11) {
			return 8;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!aam", name = "h", descriptor = "(IB)V", line = 158)
	static void method816(@OriginalArg(0) int arg0) {
		@Pc(2) Class161 local2 = Class519.aClass161_58;
		synchronized (Class519.aClass161_58) {
			Class519.aClass161_58.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!aam", name = "fg", descriptor = "(Lclient!mq;ZFFFFIII)V", line = 2061)
	static void method818(@OriginalArg(0) Class328 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = client.aClass370_1.method26948();
		@Pc(7) int local7 = client.aClass370_1.method27009();
		arg0.method26059(arg1, arg2, arg3, arg4, (float) local7, (float) local3, (float) arg5, (float) arg6);
	}

	@OriginalMember(owner = "client!aam", name = "hz", descriptor = "(Lclient!vs;I)V", line = 5402)
	static final void method817(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class174.method23395(local11, local14, true, 0, arg0);
	}
}
