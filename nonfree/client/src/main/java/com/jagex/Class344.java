package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public class Class344 implements Interface31 {

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "Lclient!dj;")
	Class94 aClass94_9;

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "Lclient!mj;")
	final Class401 aClass401_1;

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "Lclient!pw;")
	final Class478 aClass478_101;

	@OriginalMember(owner = "client!jj", name = "v", descriptor = "Lclient!pw;")
	final Class478 aClass478_102;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!pw;Lclient!pw;Lclient!mj;)V", line = 15)
	Class344(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class478 arg1, @OriginalArg(2) Class401 arg2) {
		this.aClass401_1 = arg2;
		this.aClass478_101 = arg0;
		this.aClass478_102 = arg1;
	}

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "()V", line = 22)
	@Override
	public void method27919() {
		@Pc(10) Class17 local10 = Class21.method418(this.aClass478_102, this.aClass401_1.anInt4691 * -835082531, Class367.aClass415_1);
		this.aClass94_9 = Class284.aClass86_9.method20111(local10, Class210.method25600(this.aClass478_101, this.aClass401_1.anInt4691 * -835082531), true);
	}

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "(S)V", line = 22)
	@Override
	public void method27917() {
		@Pc(10) Class17 local10 = Class21.method418(this.aClass478_102, this.aClass401_1.anInt4691 * -835082531, Class367.aClass415_1);
		this.aClass94_9 = Class284.aClass86_9.method20111(local10, Class210.method25600(this.aClass478_101, this.aClass401_1.anInt4691 * -835082531), true);
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(ZB)V", line = 27)
	@Override
	public void method27921(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(21) int local21 = this.aClass401_1.aClass410_9.method28569(this.aClass401_1.anInt4689 * -124707271, client.anInt3394 * -321474631) + this.aClass401_1.anInt4686 * 102567979;
			@Pc(41) int local41 = this.aClass401_1.aClass402_9.method28502(this.aClass401_1.anInt4690 * -408316691, client.anInt3464 * 43072843) + this.aClass401_1.anInt4685 * -764465043;
			this.aClass94_9.method7614(this.aClass401_1.aString211, local21, local41, this.aClass401_1.anInt4689 * -124707271, this.aClass401_1.anInt4690 * -408316691, this.aClass401_1.anInt4692 * 462778561, this.aClass401_1.anInt4693 * -213434005, this.aClass401_1.anInt4684 * -331314539, this.aClass401_1.anInt4687 * 524456983, this.aClass401_1.anInt4688 * -905608091, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "(Z)V", line = 27)
	@Override
	public void method27918(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			@Pc(21) int local21 = this.aClass401_1.aClass410_9.method28569(this.aClass401_1.anInt4689 * -124707271, client.anInt3394 * -321474631) + this.aClass401_1.anInt4686 * 102567979;
			@Pc(41) int local41 = this.aClass401_1.aClass402_9.method28502(this.aClass401_1.anInt4690 * -408316691, client.anInt3464 * 43072843) + this.aClass401_1.anInt4685 * -764465043;
			this.aClass94_9.method7614(this.aClass401_1.aString211, local21, local41, this.aClass401_1.anInt4689 * -124707271, this.aClass401_1.anInt4690 * -408316691, this.aClass401_1.anInt4692 * 462778561, this.aClass401_1.anInt4693 * -213434005, this.aClass401_1.anInt4684 * -331314539, this.aClass401_1.anInt4687 * 524456983, this.aClass401_1.anInt4688 * -905608091, null, null, null, 0, 0);
		}
	}

	@OriginalMember(owner = "client!jj", name = "v", descriptor = "(I)Z", line = 35)
	@Override
	public boolean method27915() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_101.method29730(this.aClass401_1.anInt4691 * -835082531)) {
			local1 = false;
		}
		if (!this.aClass478_102.method29730(this.aClass401_1.anInt4691 * -835082531)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jj", name = "x", descriptor = "()Z", line = 35)
	@Override
	public boolean method27923() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_101.method29730(this.aClass401_1.anInt4691 * -835082531)) {
			local1 = false;
		}
		if (!this.aClass478_102.method29730(this.aClass401_1.anInt4691 * -835082531)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "()Z", line = 35)
	@Override
	public boolean method27920() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_101.method29730(this.aClass401_1.anInt4691 * -835082531)) {
			local1 = false;
		}
		if (!this.aClass478_102.method29730(this.aClass401_1.anInt4691 * -835082531)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "()Z", line = 35)
	@Override
	public boolean method27924() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_101.method29730(this.aClass401_1.anInt4691 * -835082531)) {
			local1 = false;
		}
		if (!this.aClass478_102.method29730(this.aClass401_1.anInt4691 * -835082531)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "()Z", line = 35)
	@Override
	public boolean method27916() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_101.method29730(this.aClass401_1.anInt4691 * -835082531)) {
			local1 = false;
		}
		if (!this.aClass478_102.method29730(this.aClass401_1.anInt4691 * -835082531)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "()Z", line = 35)
	@Override
	public boolean method27922() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_101.method29730(this.aClass401_1.anInt4691 * -835082531)) {
			local1 = false;
		}
		if (!this.aClass478_102.method29730(this.aClass401_1.anInt4691 * -835082531)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jj", name = "fo", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5490)
	static final void method27816(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(12) int local12 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307];
		arg0.aBoolean668 = local12 == 1;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!jj", name = "lw", descriptor = "(Lclient!yf;I)V", line = 6577)
	static final void method27817(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class143_Sub2.method14940(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!jj", name = "st", descriptor = "(Lclient!yf;I)V", line = 7882)
	static final void method27818(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3892 * 1033849275;
	}

	@OriginalMember(owner = "client!jj", name = "aop", descriptor = "(Lclient!yf;I)V", line = 12005)
	static final void method27819(@OriginalArg(0) Class665 arg0) {
		client.aBoolean587 = true;
		Class332.method27612();
	}

	@OriginalMember(owner = "client!jj", name = "aun", descriptor = "(Lclient!yf;B)V", line = 13046)
	static final void method27820(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class250.anInt3804 * 1816697759;
	}
}
