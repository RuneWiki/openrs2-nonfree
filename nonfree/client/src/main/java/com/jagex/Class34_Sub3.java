package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adx")
public class Class34_Sub3 extends Class34 {

	@OriginalMember(owner = "client!adx", name = "n", descriptor = "Ljava/lang/String;")
	static String aString41;

	@OriginalMember(owner = "client!adx", name = "s", descriptor = "Lclient!co;")
	Class6 aClass6_12;

	@OriginalMember(owner = "client!adx", name = "<init>", descriptor = "(Lclient!ny;Lclient!ny;Lclient!aeb;)V", line = 14)
	Class34_Sub3(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class359 arg1, @OriginalArg(2) Class44_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!adx", name = "x", descriptor = "()V", line = 18)
	@Override
	public void method24608() {
		super.method24604();
		this.aClass6_12 = Class308.method25753(this.aClass359_28, ((Class44_Sub1) this.aClass44_5).anInt909 * -654873173);
	}

	@OriginalMember(owner = "client!adx", name = "h", descriptor = "()V", line = 18)
	@Override
	public void method24603() {
		super.method24604();
		this.aClass6_12 = Class308.method25753(this.aClass359_28, ((Class44_Sub1) this.aClass44_5).anInt909 * -654873173);
	}

	@OriginalMember(owner = "client!adx", name = "s", descriptor = "()V", line = 18)
	@Override
	public void method24607() {
		super.method24604();
		this.aClass6_12 = Class308.method25753(this.aClass359_28, ((Class44_Sub1) this.aClass44_5).anInt909 * -654873173);
	}

	@OriginalMember(owner = "client!adx", name = "p", descriptor = "(I)V", line = 18)
	@Override
	public void method24604() {
		super.method24604();
		this.aClass6_12 = Class308.method25753(this.aClass359_28, ((Class44_Sub1) this.aClass44_5).anInt909 * -654873173);
	}

	@OriginalMember(owner = "client!adx", name = "u", descriptor = "()V", line = 18)
	@Override
	public void method24609() {
		super.method24604();
		this.aClass6_12 = Class308.method25753(this.aClass359_28, ((Class44_Sub1) this.aClass44_5).anInt909 * -654873173);
	}

	@OriginalMember(owner = "client!adx", name = "c", descriptor = "(ZIIS)V", line = 23)
	@Override
	void method16488(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = this.method16489() * this.aClass44_5.anInt2198 * 338285097 / 10000;
		@Pc(14) int[] local14 = new int[4];
		Class613.aClass21_13.method17060(local14);
		Class613.aClass21_13.method17079(arg1, arg2 + 2, arg1 + local11, this.aClass44_5.anInt2199 * -1628722519 + arg2);
		this.aClass6_12.method16789(arg1, arg2 + 2, this.aClass44_5.anInt2198 * 338285097, this.aClass44_5.anInt2199 * -1628722519);
		Class613.aClass21_13.method17079(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!adx", name = "e", descriptor = "(ZII)V", line = 23)
	@Override
	void method16491(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = this.method16489() * this.aClass44_5.anInt2198 * 338285097 / 10000;
		@Pc(14) int[] local14 = new int[4];
		Class613.aClass21_13.method17060(local14);
		Class613.aClass21_13.method17079(arg0, arg1 + 2, arg0 + local11, this.aClass44_5.anInt2199 * -1628722519 + arg1);
		this.aClass6_12.method16789(arg0, arg1 + 2, this.aClass44_5.anInt2198 * 338285097, this.aClass44_5.anInt2199 * -1628722519);
		Class613.aClass21_13.method17079(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!adx", name = "n", descriptor = "(ZII)V", line = 23)
	@Override
	void method16486(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = this.method16489() * this.aClass44_5.anInt2198 * 338285097 / 10000;
		@Pc(14) int[] local14 = new int[4];
		Class613.aClass21_13.method17060(local14);
		Class613.aClass21_13.method17079(arg0, arg1 + 2, arg0 + local11, this.aClass44_5.anInt2199 * -1628722519 + arg1);
		this.aClass6_12.method16789(arg0, arg1 + 2, this.aClass44_5.anInt2198 * 338285097, this.aClass44_5.anInt2199 * -1628722519);
		Class613.aClass21_13.method17079(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!adx", name = "j", descriptor = "(ZII)V", line = 23)
	@Override
	void method16490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = this.method16489() * this.aClass44_5.anInt2198 * 338285097 / 10000;
		@Pc(14) int[] local14 = new int[4];
		Class613.aClass21_13.method17060(local14);
		Class613.aClass21_13.method17079(arg0, arg1 + 2, arg0 + local11, this.aClass44_5.anInt2199 * -1628722519 + arg1);
		this.aClass6_12.method16789(arg0, arg1 + 2, this.aClass44_5.anInt2198 * 338285097, this.aClass44_5.anInt2199 * -1628722519);
		Class613.aClass21_13.method17079(local14[0], local14[1], local14[2], local14[3]);
	}

	@OriginalMember(owner = "client!adx", name = "b", descriptor = "(ZIII)V", line = 32)
	@Override
	void method16487(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class613.aClass21_13.method17068(arg1 - 2, arg2, this.aClass44_5.anInt2198 * 338285097 + 4, this.aClass44_5.anInt2199 * -1628722519 + 2, ((Class44_Sub1) this.aClass44_5).anInt910 * -2050451755, 0);
		Class613.aClass21_13.method17068(arg1 - 1, arg2 + 1, this.aClass44_5.anInt2198 * 338285097 + 2, this.aClass44_5.anInt2199 * -1628722519, 0, 0);
	}

	@OriginalMember(owner = "client!adx", name = "r", descriptor = "(ZII)V", line = 32)
	@Override
	void method16492(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class613.aClass21_13.method17068(arg1 - 2, arg2, this.aClass44_5.anInt2198 * 338285097 + 4, this.aClass44_5.anInt2199 * -1628722519 + 2, ((Class44_Sub1) this.aClass44_5).anInt910 * -2050451755, 0);
		Class613.aClass21_13.method17068(arg1 - 1, arg2 + 1, this.aClass44_5.anInt2198 * 338285097 + 2, this.aClass44_5.anInt2199 * -1628722519, 0, 0);
	}

	@OriginalMember(owner = "client!adx", name = "g", descriptor = "(I)Z", line = 37)
	@Override
	public boolean method24602() {
		return super.method24602() ? this.aClass359_28.method26674(((Class44_Sub1) this.aClass44_5).anInt909 * -654873173) : false;
	}

	@OriginalMember(owner = "client!adx", name = "y", descriptor = "()Z", line = 37)
	@Override
	public boolean method24610() {
		return super.method24602() ? this.aClass359_28.method26674(((Class44_Sub1) this.aClass44_5).anInt909 * -654873173) : false;
	}

	@OriginalMember(owner = "client!adx", name = "ke", descriptor = "(Lclient!fw;Lclient!fo;B)V", line = 10215)
	public static void method8311(@OriginalArg(0) Class186 arg0, @OriginalArg(1) Class178 arg1) {
		@Pc(4) Class178 local4 = Class356.method26654(arg0, arg1);
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (local4 == null) {
			local10 = Class128.anInt3317 * 2037417253;
			local14 = Class575.anInt5428 * 1261116487;
		} else {
			local10 = local4.anInt3498 * -1494060731;
			local14 = local4.anInt3499 * -751005789;
		}
		Class342.method26475(arg1, local10, local14, false);
		Class465.method28644(arg1, local10, local14);
	}

	@OriginalMember(owner = "client!adx", name = "lw", descriptor = "(Ljava/lang/String;S)V", line = 11375)
	public static final void method8312(@OriginalArg(0) String arg0) {
		if (Class43_Sub2.aClass79Array1 == null) {
			return;
		}
		@Pc(6) Class82 local6 = Class406.method27657();
		@Pc(12) Class3_Sub23 local12 = Class269.method25284(Class311.aClass311_45, local6.aClass577_2);
		local12.aClass3_Sub41_Sub1_1.method20250(Class43_Sub2.method8763(arg0));
		local12.aClass3_Sub41_Sub1_1.method20260(arg0);
		local6.method21601(local12);
	}
}
