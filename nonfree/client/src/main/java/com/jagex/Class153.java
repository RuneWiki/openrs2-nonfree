package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class153 {

	@OriginalMember(owner = "client!em", name = "ay", descriptor = "I")
	static int anInt3441;

	@OriginalMember(owner = "client!em", name = "p", descriptor = "Lclient!ags;")
	Class3_Sub1 aClass3_Sub1_61 = new Class3_Sub1();

	@OriginalMember(owner = "client!em", name = "h", descriptor = "Lclient!wc;")
	Class546 aClass546_12 = new Class546();

	@OriginalMember(owner = "client!em", name = "a", descriptor = "I")
	int anInt3439;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "I")
	int anInt3440;

	@OriginalMember(owner = "client!em", name = "l", descriptor = "Lclient!xn;")
	Class581 aClass581_24;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(I)V", line = 14)
	public Class153(@OriginalArg(0) int arg0) {
		this.anInt3439 = arg0 * 1345757489;
		this.anInt3440 = arg0 * -690364509;
		@Pc(23) int local23;
		for (local23 = 1; local23 + local23 < arg0; local23 += local23) {
		}
		this.aClass581_24 = new Class581(local23);
	}

	@OriginalMember(owner = "client!em", name = "p", descriptor = "(J)Lclient!ags;", line = 23)
	public Class3_Sub1 method23146(@OriginalArg(0) long arg0) {
		@Pc(5) Class3_Sub1 local5 = (Class3_Sub1) this.aClass581_24.method33217(arg0);
		if (local5 != null) {
			this.aClass546_12.method32621(local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!em", name = "l", descriptor = "(J)Lclient!ags;", line = 23)
	public Class3_Sub1 method23149(@OriginalArg(0) long arg0) {
		@Pc(5) Class3_Sub1 local5 = (Class3_Sub1) this.aClass581_24.method33217(arg0);
		if (local5 != null) {
			this.aClass546_12.method32621(local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!em", name = "h", descriptor = "(J)Lclient!ags;", line = 23)
	public Class3_Sub1 method23150(@OriginalArg(0) long arg0) {
		@Pc(5) Class3_Sub1 local5 = (Class3_Sub1) this.aClass581_24.method33217(arg0);
		if (local5 != null) {
			this.aClass546_12.method32621(local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!em", name = "x", descriptor = "(J)Lclient!ags;", line = 23)
	public Class3_Sub1 method23151(@OriginalArg(0) long arg0) {
		@Pc(5) Class3_Sub1 local5 = (Class3_Sub1) this.aClass581_24.method33217(arg0);
		if (local5 != null) {
			this.aClass546_12.method32621(local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!em", name = "u", descriptor = "(Lclient!ags;J)V", line = 32)
	public void method23145(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt3440 * -1464513525 == 0) {
			@Pc(9) Class3_Sub1 local9 = this.aClass546_12.method32622();
			local9.method33656();
			local9.method33669();
			if (this.aClass3_Sub1_61 == local9) {
				local9 = this.aClass546_12.method32622();
				local9.method33656();
				local9.method33669();
			}
		} else {
			this.anInt3440 -= -690364509;
		}
		this.aClass581_24.method33241(arg0, arg1);
		this.aClass546_12.method32621(arg0);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!ags;J)V", line = 32)
	public void method23147(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt3440 * -1464513525 == 0) {
			@Pc(9) Class3_Sub1 local9 = this.aClass546_12.method32622();
			local9.method33656();
			local9.method33669();
			if (this.aClass3_Sub1_61 == local9) {
				local9 = this.aClass546_12.method32622();
				local9.method33656();
				local9.method33669();
			}
		} else {
			this.anInt3440 -= -690364509;
		}
		this.aClass581_24.method33241(arg0, arg1);
		this.aClass546_12.method32621(arg0);
	}

	@OriginalMember(owner = "client!em", name = "s", descriptor = "(Lclient!ags;J)V", line = 32)
	public void method23152(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt3440 * -1464513525 == 0) {
			@Pc(9) Class3_Sub1 local9 = this.aClass546_12.method32622();
			local9.method33656();
			local9.method33669();
			if (this.aClass3_Sub1_61 == local9) {
				local9 = this.aClass546_12.method32622();
				local9.method33656();
				local9.method33669();
			}
		} else {
			this.anInt3440 -= -690364509;
		}
		this.aClass581_24.method33241(arg0, arg1);
		this.aClass546_12.method32621(arg0);
	}

	@OriginalMember(owner = "client!em", name = "g", descriptor = "(S)V", line = 48)
	public void method23148() {
		this.aClass546_12.method32620();
		this.aClass581_24.method33222();
		this.aClass3_Sub1_61 = new Class3_Sub1();
		this.anInt3440 = this.anInt3439 * -848807661;
	}

	@OriginalMember(owner = "client!em", name = "y", descriptor = "()V", line = 48)
	public void method23153() {
		this.aClass546_12.method32620();
		this.aClass581_24.method33222();
		this.aClass3_Sub1_61 = new Class3_Sub1();
		this.anInt3440 = this.anInt3439 * -848807661;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "()V", line = 48)
	public void method23154() {
		this.aClass546_12.method32620();
		this.aClass581_24.method33222();
		this.aClass3_Sub1_61 = new Class3_Sub1();
		this.anInt3440 = this.anInt3439 * -848807661;
	}

	@OriginalMember(owner = "client!em", name = "v", descriptor = "(Lclient!vs;B)V", line = 3937)
	static final void method23155(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = arg0.anIntArray497[arg0.anInt5318 * -2140198955];
	}

	@OriginalMember(owner = "client!em", name = "dq", descriptor = "(Lclient!vs;B)V", line = 4628)
	static final void method23158(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class381.method27303(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!em", name = "lp", descriptor = "(Lclient!vs;I)V", line = 6176)
	static final void method23156(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class481.method29082(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!em", name = "akt", descriptor = "(Lclient!vs;I)V", line = 10872)
	static final void method23157(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(37) Class194 local37 = Class24.method6669(local13);
		@Pc(40) float local40 = (float) local23;
		if (Class194.aClass194_3 == local37 || Class194.aClass194_7 == local37 || local37 == Class194.aClass194_6) {
			local40 = Class317.method25842(local23);
		}
		@Pc(65) Class3_Sub1_Sub2_Sub1 local65 = new Class3_Sub1_Sub2_Sub1(Class80.aClass23_Sub1_1.method5946(), local37, local40, (float) local33 / 1000.0F);
		Class80.aClass23_Sub1_1.method5821(local65);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local65.anInt2869 * -36949057;
	}
}
