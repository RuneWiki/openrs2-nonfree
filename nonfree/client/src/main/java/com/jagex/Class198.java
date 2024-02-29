package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public class Class198 {

	@OriginalMember(owner = "client!cw", name = "v", descriptor = "Lclient!er;")
	final Class232 aClass232_67 = new Class232(10485760, 256);

	@OriginalMember(owner = "client!cw", name = "p", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_47;

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "Lclient!eo;")
	final Interface24 anInterface24_118;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!aeq;Lclient!eo;)V", line = 15)
	Class198(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Interface24 arg1) {
		this.aClass86_Sub3_47 = arg0;
		this.anInterface24_118 = arg1;
	}

	@OriginalMember(owner = "client!cw", name = "p", descriptor = "(Lclient!dy;)Lclient!adi;", line = 21)
	Class78_Sub2 method25476(@OriginalArg(0) Class215 arg0) {
		return this.method25479(arg0, arg0.anInt3714 * 1264459495);
	}

	@OriginalMember(owner = "client!cw", name = "w", descriptor = "(Lclient!dy;)Lclient!adi;", line = 21)
	Class78_Sub2 method25477(@OriginalArg(0) Class215 arg0) {
		return this.method25479(arg0, arg0.anInt3714 * 1264459495);
	}

	@OriginalMember(owner = "client!cw", name = "t", descriptor = "(Lclient!dy;)Lclient!adi;", line = 21)
	Class78_Sub2 method25478(@OriginalArg(0) Class215 arg0) {
		return this.method25479(arg0, arg0.anInt3714 * 1264459495);
	}

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "(Lclient!dy;I)Lclient!adi;", line = 25)
	Class78_Sub2 method25479(@OriginalArg(0) Class215 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class78_Sub2 local9 = (Class78_Sub2) this.aClass232_67.method25835((long) (arg0.anInt3713 * 1604666399));
		if (local9 != null) {
			return local9;
		} else if (this.method25481(Class596.aClass596_2, arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3714 * 1264459495;
			}
			@Pc(93) Class78_Sub2 local93;
			if (arg0.aBoolean636 && this.aClass86_Sub3_47.method20183()) {
				@Pc(108) float[] local108 = this.anInterface24_118.method4226(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				local93 = new Class78_Sub2(this.aClass86_Sub3_47, 3553, Class212.aClass212_18, Class206.aClass206_25, arg1, arg1, arg0.aByte120 != 0, local108, Class212.aClass212_18);
			} else {
				@Pc(59) int[] local59;
				if (arg0.aClass597_2 == Class597.aClass597_4 && Class683.method36096(arg0.aByte118)) {
					local59 = this.anInterface24_118.method4224(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				} else {
					local59 = this.anInterface24_118.method4225(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				}
				local93 = new Class78_Sub2(this.aClass86_Sub3_47, 3553, arg1, arg1, arg0.aByte120 != 0, local59, 0, 0, false);
			}
			local93.method17493(arg0.aByte121 == 1, arg0.aByte116 == 1);
			this.aClass232_67.method25845(local93, (long) (arg0.anInt3713 * 1604666399), arg1 * arg1);
			return local93;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cw", name = "x", descriptor = "(Lclient!vi;Lclient!dy;I)Z", line = 50)
	boolean method25480(@OriginalArg(0) Class596 arg0, @OriginalArg(1) Class215 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			arg2 = arg1.anInt3714 * 1264459495;
		}
		if (arg1.aBoolean636 && this.aClass86_Sub3_47.method20183()) {
			return this.anInterface24_118.method4231(arg0, arg1.anInt3713 * 1604666399, Class609.aClass609_3, 0.7F, arg2, arg2);
		} else if (arg1.aClass597_2 == Class597.aClass597_4 && Class683.method36096(arg1.aByte118)) {
			return this.anInterface24_118.method4231(arg0, arg1.anInt3713 * 1604666399, Class609.aClass609_1, 0.7F, arg2, arg2);
		} else {
			return this.anInterface24_118.method4231(arg0, arg1.anInt3713 * 1604666399, Class609.aClass609_2, 0.7F, arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!cw", name = "v", descriptor = "(Lclient!vi;Lclient!dy;I)Z", line = 50)
	boolean method25481(@OriginalArg(0) Class596 arg0, @OriginalArg(1) Class215 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			arg2 = arg1.anInt3714 * 1264459495;
		}
		if (arg1.aBoolean636 && this.aClass86_Sub3_47.method20183()) {
			return this.anInterface24_118.method4231(arg0, arg1.anInt3713 * 1604666399, Class609.aClass609_3, 0.7F, arg2, arg2);
		} else if (arg1.aClass597_2 == Class597.aClass597_4 && Class683.method36096(arg1.aByte118)) {
			return this.anInterface24_118.method4231(arg0, arg1.anInt3713 * 1604666399, Class609.aClass609_1, 0.7F, arg2, arg2);
		} else {
			return this.anInterface24_118.method4231(arg0, arg1.anInt3713 * 1604666399, Class609.aClass609_2, 0.7F, arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!cw", name = "q", descriptor = "(Lclient!vi;Lclient!dy;I)Z", line = 50)
	boolean method25482(@OriginalArg(0) Class596 arg0, @OriginalArg(1) Class215 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			arg2 = arg1.anInt3714 * 1264459495;
		}
		if (arg1.aBoolean636 && this.aClass86_Sub3_47.method20183()) {
			return this.anInterface24_118.method4231(arg0, arg1.anInt3713 * 1604666399, Class609.aClass609_3, 0.7F, arg2, arg2);
		} else if (arg1.aClass597_2 == Class597.aClass597_4 && Class683.method36096(arg1.aByte118)) {
			return this.anInterface24_118.method4231(arg0, arg1.anInt3713 * 1604666399, Class609.aClass609_1, 0.7F, arg2, arg2);
		} else {
			return this.anInterface24_118.method4231(arg0, arg1.anInt3713 * 1604666399, Class609.aClass609_2, 0.7F, arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!cw", name = "s", descriptor = "(Lclient!vi;Lclient!dy;I)Z", line = 50)
	boolean method25483(@OriginalArg(0) Class596 arg0, @OriginalArg(1) Class215 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			arg2 = arg1.anInt3714 * 1264459495;
		}
		if (arg1.aBoolean636 && this.aClass86_Sub3_47.method20183()) {
			return this.anInterface24_118.method4231(arg0, arg1.anInt3713 * 1604666399, Class609.aClass609_3, 0.7F, arg2, arg2);
		} else if (arg1.aClass597_2 == Class597.aClass597_4 && Class683.method36096(arg1.aByte118)) {
			return this.anInterface24_118.method4231(arg0, arg1.anInt3713 * 1604666399, Class609.aClass609_1, 0.7F, arg2, arg2);
		} else {
			return this.anInterface24_118.method4231(arg0, arg1.anInt3713 * 1604666399, Class609.aClass609_2, 0.7F, arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "(Lclient!vi;Lclient!dy;I)Z", line = 50)
	boolean method25484(@OriginalArg(0) Class596 arg0, @OriginalArg(1) Class215 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			arg2 = arg1.anInt3714 * 1264459495;
		}
		if (arg1.aBoolean636 && this.aClass86_Sub3_47.method20183()) {
			return this.anInterface24_118.method4231(arg0, arg1.anInt3713 * 1604666399, Class609.aClass609_3, 0.7F, arg2, arg2);
		} else if (arg1.aClass597_2 == Class597.aClass597_4 && Class683.method36096(arg1.aByte118)) {
			return this.anInterface24_118.method4231(arg0, arg1.anInt3713 * 1604666399, Class609.aClass609_1, 0.7F, arg2, arg2);
		} else {
			return this.anInterface24_118.method4231(arg0, arg1.anInt3713 * 1604666399, Class609.aClass609_2, 0.7F, arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "()V", line = 61)
	void method25485() {
		this.aClass232_67.method25847(5);
	}

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "()V", line = 61)
	void method25486() {
		this.aClass232_67.method25847(5);
	}

	@OriginalMember(owner = "client!cw", name = "r", descriptor = "()V", line = 61)
	void method25487() {
		this.aClass232_67.method25847(5);
	}

	@OriginalMember(owner = "client!cw", name = "z", descriptor = "()V", line = 61)
	void method25488() {
		this.aClass232_67.method25847(5);
	}

	@OriginalMember(owner = "client!cw", name = "y", descriptor = "()V", line = 65)
	void method25489() {
		this.aClass232_67.method25850();
	}

	@OriginalMember(owner = "client!cw", name = "j", descriptor = "()V", line = 65)
	void method25490() {
		this.aClass232_67.method25850();
	}
}
