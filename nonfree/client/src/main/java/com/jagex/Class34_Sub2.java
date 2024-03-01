package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adr")
public class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!adr", name = "m", descriptor = "Ljava/lang/String;")
	static String aString40;

	@OriginalMember(owner = "client!adr", name = "<init>", descriptor = "(Lclient!ny;Lclient!ny;Lclient!aep;)V", line = 10)
	Class34_Sub2(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class359 arg1, @OriginalArg(2) Class44_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!adr", name = "j", descriptor = "(ZII)V", line = 14)
	@Override
	void method16490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = this.method16489() * this.aClass44_5.anInt2198 * 338285097 / 10000;
		Class613.aClass21_13.method17050(arg0, arg1 + 2, local11, this.aClass44_5.anInt2199 * -1628722519 - 2, ((Class44_Sub3) this.aClass44_5).anInt1009 * -805804141, 0);
		Class613.aClass21_13.method17050(arg0 + local11, arg1 + 2, this.aClass44_5.anInt2198 * 338285097 - local11, this.aClass44_5.anInt2199 * -1628722519 - 2, 0, 0);
	}

	@OriginalMember(owner = "client!adr", name = "c", descriptor = "(ZIIS)V", line = 14)
	@Override
	void method16488(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = this.method16489() * this.aClass44_5.anInt2198 * 338285097 / 10000;
		Class613.aClass21_13.method17050(arg1, arg2 + 2, local11, this.aClass44_5.anInt2199 * -1628722519 - 2, ((Class44_Sub3) this.aClass44_5).anInt1009 * -805804141, 0);
		Class613.aClass21_13.method17050(arg1 + local11, arg2 + 2, this.aClass44_5.anInt2198 * 338285097 - local11, this.aClass44_5.anInt2199 * -1628722519 - 2, 0, 0);
	}

	@OriginalMember(owner = "client!adr", name = "n", descriptor = "(ZII)V", line = 14)
	@Override
	void method16486(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = this.method16489() * this.aClass44_5.anInt2198 * 338285097 / 10000;
		Class613.aClass21_13.method17050(arg0, arg1 + 2, local11, this.aClass44_5.anInt2199 * -1628722519 - 2, ((Class44_Sub3) this.aClass44_5).anInt1009 * -805804141, 0);
		Class613.aClass21_13.method17050(arg0 + local11, arg1 + 2, this.aClass44_5.anInt2198 * 338285097 - local11, this.aClass44_5.anInt2199 * -1628722519 - 2, 0, 0);
	}

	@OriginalMember(owner = "client!adr", name = "e", descriptor = "(ZII)V", line = 14)
	@Override
	void method16491(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = this.method16489() * this.aClass44_5.anInt2198 * 338285097 / 10000;
		Class613.aClass21_13.method17050(arg0, arg1 + 2, local11, this.aClass44_5.anInt2199 * -1628722519 - 2, ((Class44_Sub3) this.aClass44_5).anInt1009 * -805804141, 0);
		Class613.aClass21_13.method17050(arg0 + local11, arg1 + 2, this.aClass44_5.anInt2198 * 338285097 - local11, this.aClass44_5.anInt2199 * -1628722519 - 2, 0, 0);
	}

	@OriginalMember(owner = "client!adr", name = "b", descriptor = "(ZIII)V", line = 20)
	@Override
	void method16487(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class613.aClass21_13.method17068(arg1 - 2, arg2, this.aClass44_5.anInt2198 * 338285097 + 4, this.aClass44_5.anInt2199 * -1628722519 + 2, ((Class44_Sub3) this.aClass44_5).anInt1010 * 1213632855, 0);
		Class613.aClass21_13.method17068(arg1 - 1, arg2 + 1, this.aClass44_5.anInt2198 * 338285097 + 2, this.aClass44_5.anInt2199 * -1628722519, 0, 0);
	}

	@OriginalMember(owner = "client!adr", name = "r", descriptor = "(ZII)V", line = 20)
	@Override
	void method16492(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class613.aClass21_13.method17068(arg1 - 2, arg2, this.aClass44_5.anInt2198 * 338285097 + 4, this.aClass44_5.anInt2199 * -1628722519 + 2, ((Class44_Sub3) this.aClass44_5).anInt1010 * 1213632855, 0);
		Class613.aClass21_13.method17068(arg1 - 1, arg2 + 1, this.aClass44_5.anInt2198 * 338285097 + 2, this.aClass44_5.anInt2199 * -1628722519, 0, 0);
	}

	@OriginalMember(owner = "client!adr", name = "gm", descriptor = "(Lclient!vs;I)V", line = 5178)
	static final void method8150(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class326.method26009(local11, local14, arg0);
	}
}
