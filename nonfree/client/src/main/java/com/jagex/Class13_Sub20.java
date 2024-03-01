package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acw")
public class Class13_Sub20 extends Class13 {

	@OriginalMember(owner = "client!acw", name = "a", descriptor = "I")
	final int anInt745;

	@OriginalMember(owner = "client!acw", name = "g", descriptor = "I")
	final int anInt746;

	@OriginalMember(owner = "client!acw", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 12)
	Class13_Sub20(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt745 = arg0.method20271() * -897716509;
		this.anInt746 = arg0.method20375() * 1949855415;
	}

	@OriginalMember(owner = "client!acw", name = "h", descriptor = "()V", line = 18)
	@Override
	public void method16896() {
		@Pc(6) Class142 local6 = Class131.aClass142Array1[this.anInt745 * 421578443];
		Class195.method24091(local6.anInt3432 * 716629679, local6.anInt3430 * -773284219, local6.anInt3431 * 1297244333, local6.aClass456_1.anInt5062 * 82326105, local6.aClass456_1.anInt5061 * 821735799, local6.anInt3428 * -261921535, this.anInt746 * -1752576249, 0);
	}

	@OriginalMember(owner = "client!acw", name = "a", descriptor = "(I)V", line = 18)
	@Override
	public void method16888() {
		@Pc(6) Class142 local6 = Class131.aClass142Array1[this.anInt745 * 421578443];
		Class195.method24091(local6.anInt3432 * 716629679, local6.anInt3430 * -773284219, local6.anInt3431 * 1297244333, local6.aClass456_1.anInt5062 * 82326105, local6.aClass456_1.anInt5061 * 821735799, local6.anInt3428 * -261921535, this.anInt746 * -1752576249, 0);
	}

	@OriginalMember(owner = "client!acw", name = "x", descriptor = "()Z", line = 23)
	@Override
	boolean method16891() {
		@Pc(7) Class440 local7 = Class110.aClass436_1.method27999(this.anInt746 * -1752576249);
		return local7.method28236();
	}

	@OriginalMember(owner = "client!acw", name = "l", descriptor = "(I)Z", line = 23)
	@Override
	boolean method16890() {
		@Pc(7) Class440 local7 = Class110.aClass436_1.method27999(this.anInt746 * -1752576249);
		return local7.method28236();
	}

	@OriginalMember(owner = "client!acw", name = "s", descriptor = "()Z", line = 23)
	@Override
	boolean method16893() {
		@Pc(7) Class440 local7 = Class110.aClass436_1.method27999(this.anInt746 * -1752576249);
		return local7.method28236();
	}

	@OriginalMember(owner = "client!acw", name = "w", descriptor = "(B)V", line = 265)
	static void method7228() {
		client.aClass82_1.method21604();
		if (Class338.anInt4598 * -254105187 < 2) {
			Class570.aClass585_5.method33273();
			Class338.anInt4597 = 0;
			Class338.anInt4598 += 1274815669;
			Class338.aClass448_1 = Class448.aClass448_2;
		} else {
			Class338.aClass448_1 = null;
			Class338.aClass563_1 = Class563.aClass563_3;
			Class166.method23342(2);
		}
	}

	@OriginalMember(owner = "client!acw", name = "c", descriptor = "(Lclient!amn;II)V", line = 439)
	static void method7227(@OriginalArg(0) Class3_Sub1_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (!Class250.aBoolean688) {
			return;
		}
		@Pc(5) Class611 local5 = Class49_Sub1.method9259();
		@Pc(7) int local7 = 0;
		@Pc(20) int local20;
		for (@Pc(13) Class3_Sub1_Sub7 local13 = (Class3_Sub1_Sub7) arg0.aClass546_9.method32623(); local13 != null; local13 = (Class3_Sub1_Sub7) arg0.aClass546_9.method32645()) {
			local20 = Class44.method15135(local13, local5);
			if (local20 > local7) {
				local7 = local20;
			}
		}
		local7 += 8;
		@Pc(44) int local44 = Class250.anInt3804 * 192470685 * arg0.anInt2669 * 2127103997 + 21;
		Class598.anInt5520 = (arg0.anInt2669 * 2127103997 * 192470685 * Class250.anInt3804 + (Class250.aBoolean689 ? 26 : 22)) * -179592619;
		local20 = Class284.anInt4355 * 989672103 + Class13_Sub14.anInt663 * -1045688681;
		if (local7 + local20 > Class128.anInt3317 * 2037417253) {
			local20 = Class284.anInt4355 * 989672103 - local7;
		}
		if (local20 < 0) {
			local20 = 0;
		}
		@Pc(99) int local99 = Class250.aBoolean689 ? local5.anInt5537 * -1760037867 + 20 + 1 : 31;
		@Pc(110) int local110 = arg1 + 1 - local99 + local5.anInt5537 * -1760037867;
		if (local110 + local44 > Class575.anInt5428 * 1261116487) {
			local110 = Class575.anInt5428 * 1261116487 - local44;
		}
		if (local110 < 0) {
			local110 = 0;
		}
		Class356.anInt4637 = local20 * -954872279;
		Class151.anInt3438 = local110 * -1236599859;
		Class381.anInt4707 = local7 * 1546819815;
		Class250.aClass3_Sub1_Sub9_1 = arg0;
	}
}
