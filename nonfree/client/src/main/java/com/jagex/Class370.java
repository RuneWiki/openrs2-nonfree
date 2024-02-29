package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ky")
public class Class370 {

	@OriginalMember(owner = "client!ky", name = "v", descriptor = "Lclient!er;")
	Class232 aClass232_77 = new Class232(10485760, 256);

	@OriginalMember(owner = "client!ky", name = "p", descriptor = "Lclient!aed;")
	final Class86_Sub1 aClass86_Sub1_38;

	@OriginalMember(owner = "client!ky", name = "c", descriptor = "Lclient!eo;")
	final Interface24 anInterface24_119;

	@OriginalMember(owner = "client!ky", name = "<init>", descriptor = "(Lclient!aed;Lclient!eo;)V", line = 13)
	Class370(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Interface24 arg1) {
		this.aClass86_Sub1_38 = arg0;
		this.anInterface24_119 = arg1;
	}

	@OriginalMember(owner = "client!ky", name = "p", descriptor = "(Lclient!dy;)Lclient!ks;", line = 19)
	Interface37 method28225(@OriginalArg(0) Class215 arg0) {
		return this.method28226(arg0, arg0.anInt3714 * 1264459495);
	}

	@OriginalMember(owner = "client!ky", name = "c", descriptor = "(Lclient!dy;I)Lclient!ks;", line = 23)
	Interface37 method28226(@OriginalArg(0) Class215 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9 = (long) (arg1 << 16 | arg0.anInt3713 * 1604666399);
		@Pc(15) Interface37 local15 = (Interface37) this.aClass232_77.method25835(local9);
		if (local15 != null) {
			return local15;
		} else if (this.method28232(arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3714 * 1264459495;
			}
			@Pc(91) Interface37 local91;
			if (arg0.aBoolean636 && this.aClass86_Sub1_38.method20183()) {
				@Pc(106) float[] local106 = this.anInterface24_119.method4226(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				local91 = this.aClass86_Sub1_38.method20536(Class212.aClass212_18, arg1, arg1, true, local106);
			} else {
				@Pc(64) int[] local64;
				if (arg0.aClass597_2 == Class597.aClass597_4 && Class683.method36096(arg0.aByte118)) {
					local64 = this.anInterface24_119.method4224(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				} else {
					local64 = this.anInterface24_119.method4225(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				}
				if (local64 == null) {
					return null;
				}
				local91 = this.aClass86_Sub1_38.method20530(arg1, arg1, true, local64);
			}
			local91.method10618(arg0.aByte121 == 1, arg0.aByte116 == 1);
			this.aClass232_77.method25845(local91, local9, arg1 * arg1);
			return local91;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ky", name = "w", descriptor = "(Lclient!dy;I)Lclient!ks;", line = 23)
	Interface37 method28227(@OriginalArg(0) Class215 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9 = (long) (arg1 << 16 | arg0.anInt3713 * 1604666399);
		@Pc(15) Interface37 local15 = (Interface37) this.aClass232_77.method25835(local9);
		if (local15 != null) {
			return local15;
		} else if (this.method28232(arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3714 * 1264459495;
			}
			@Pc(91) Interface37 local91;
			if (arg0.aBoolean636 && this.aClass86_Sub1_38.method20183()) {
				@Pc(106) float[] local106 = this.anInterface24_119.method4226(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				local91 = this.aClass86_Sub1_38.method20536(Class212.aClass212_18, arg1, arg1, true, local106);
			} else {
				@Pc(64) int[] local64;
				if (arg0.aClass597_2 == Class597.aClass597_4 && Class683.method36096(arg0.aByte118)) {
					local64 = this.anInterface24_119.method4224(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				} else {
					local64 = this.anInterface24_119.method4225(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				}
				if (local64 == null) {
					return null;
				}
				local91 = this.aClass86_Sub1_38.method20530(arg1, arg1, true, local64);
			}
			local91.method10618(arg0.aByte121 == 1, arg0.aByte116 == 1);
			this.aClass232_77.method25845(local91, local9, arg1 * arg1);
			return local91;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ky", name = "t", descriptor = "(Lclient!dy;I)Lclient!ks;", line = 23)
	Interface37 method28228(@OriginalArg(0) Class215 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9 = (long) (arg1 << 16 | arg0.anInt3713 * 1604666399);
		@Pc(15) Interface37 local15 = (Interface37) this.aClass232_77.method25835(local9);
		if (local15 != null) {
			return local15;
		} else if (this.method28232(arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3714 * 1264459495;
			}
			@Pc(91) Interface37 local91;
			if (arg0.aBoolean636 && this.aClass86_Sub1_38.method20183()) {
				@Pc(106) float[] local106 = this.anInterface24_119.method4226(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				local91 = this.aClass86_Sub1_38.method20536(Class212.aClass212_18, arg1, arg1, true, local106);
			} else {
				@Pc(64) int[] local64;
				if (arg0.aClass597_2 == Class597.aClass597_4 && Class683.method36096(arg0.aByte118)) {
					local64 = this.anInterface24_119.method4224(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				} else {
					local64 = this.anInterface24_119.method4225(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				}
				if (local64 == null) {
					return null;
				}
				local91 = this.aClass86_Sub1_38.method20530(arg1, arg1, true, local64);
			}
			local91.method10618(arg0.aByte121 == 1, arg0.aByte116 == 1);
			this.aClass232_77.method25845(local91, local9, arg1 * arg1);
			return local91;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ky", name = "q", descriptor = "(Lclient!dy;I)Lclient!ks;", line = 23)
	Interface37 method28229(@OriginalArg(0) Class215 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9 = (long) (arg1 << 16 | arg0.anInt3713 * 1604666399);
		@Pc(15) Interface37 local15 = (Interface37) this.aClass232_77.method25835(local9);
		if (local15 != null) {
			return local15;
		} else if (this.method28232(arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3714 * 1264459495;
			}
			@Pc(91) Interface37 local91;
			if (arg0.aBoolean636 && this.aClass86_Sub1_38.method20183()) {
				@Pc(106) float[] local106 = this.anInterface24_119.method4226(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				local91 = this.aClass86_Sub1_38.method20536(Class212.aClass212_18, arg1, arg1, true, local106);
			} else {
				@Pc(64) int[] local64;
				if (arg0.aClass597_2 == Class597.aClass597_4 && Class683.method36096(arg0.aByte118)) {
					local64 = this.anInterface24_119.method4224(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				} else {
					local64 = this.anInterface24_119.method4225(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				}
				if (local64 == null) {
					return null;
				}
				local91 = this.aClass86_Sub1_38.method20530(arg1, arg1, true, local64);
			}
			local91.method10618(arg0.aByte121 == 1, arg0.aByte116 == 1);
			this.aClass232_77.method25845(local91, local9, arg1 * arg1);
			return local91;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ky", name = "x", descriptor = "(Lclient!dy;I)Lclient!ks;", line = 23)
	Interface37 method28230(@OriginalArg(0) Class215 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9 = (long) (arg1 << 16 | arg0.anInt3713 * 1604666399);
		@Pc(15) Interface37 local15 = (Interface37) this.aClass232_77.method25835(local9);
		if (local15 != null) {
			return local15;
		} else if (this.method28232(arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3714 * 1264459495;
			}
			@Pc(91) Interface37 local91;
			if (arg0.aBoolean636 && this.aClass86_Sub1_38.method20183()) {
				@Pc(106) float[] local106 = this.anInterface24_119.method4226(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				local91 = this.aClass86_Sub1_38.method20536(Class212.aClass212_18, arg1, arg1, true, local106);
			} else {
				@Pc(64) int[] local64;
				if (arg0.aClass597_2 == Class597.aClass597_4 && Class683.method36096(arg0.aByte118)) {
					local64 = this.anInterface24_119.method4224(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				} else {
					local64 = this.anInterface24_119.method4225(Class596.aClass596_2, arg0.anInt3713 * 1604666399, 0.7F, arg1, arg1);
				}
				if (local64 == null) {
					return null;
				}
				local91 = this.aClass86_Sub1_38.method20530(arg1, arg1, true, local64);
			}
			local91.method10618(arg0.aByte121 == 1, arg0.aByte116 == 1);
			this.aClass232_77.method25845(local91, local9, arg1 * arg1);
			return local91;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ky", name = "d", descriptor = "(Lclient!dy;I)Z", line = 50)
	boolean method28231(@OriginalArg(0) Class215 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3714 * 1264459495;
		}
		if (arg0.aBoolean636 && this.aClass86_Sub1_38.method20183()) {
			return this.anInterface24_119.method4231(Class596.aClass596_2, arg0.anInt3713 * 1604666399, Class609.aClass609_3, 0.7F, arg1, arg1);
		} else if (arg0.aClass597_2 == Class597.aClass597_4 && Class683.method36096(arg0.aByte118)) {
			return this.anInterface24_119.method4231(Class596.aClass596_2, arg0.anInt3713 * 1604666399, Class609.aClass609_1, 0.7F, arg1, arg1);
		} else {
			return this.anInterface24_119.method4231(Class596.aClass596_2, arg0.anInt3713 * 1604666399, Class609.aClass609_2, 0.7F, arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!ky", name = "v", descriptor = "(Lclient!dy;I)Z", line = 50)
	boolean method28232(@OriginalArg(0) Class215 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3714 * 1264459495;
		}
		if (arg0.aBoolean636 && this.aClass86_Sub1_38.method20183()) {
			return this.anInterface24_119.method4231(Class596.aClass596_2, arg0.anInt3713 * 1604666399, Class609.aClass609_3, 0.7F, arg1, arg1);
		} else if (arg0.aClass597_2 == Class597.aClass597_4 && Class683.method36096(arg0.aByte118)) {
			return this.anInterface24_119.method4231(Class596.aClass596_2, arg0.anInt3713 * 1604666399, Class609.aClass609_1, 0.7F, arg1, arg1);
		} else {
			return this.anInterface24_119.method4231(Class596.aClass596_2, arg0.anInt3713 * 1604666399, Class609.aClass609_2, 0.7F, arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!ky", name = "s", descriptor = "(Lclient!dy;I)Z", line = 50)
	boolean method28233(@OriginalArg(0) Class215 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3714 * 1264459495;
		}
		if (arg0.aBoolean636 && this.aClass86_Sub1_38.method20183()) {
			return this.anInterface24_119.method4231(Class596.aClass596_2, arg0.anInt3713 * 1604666399, Class609.aClass609_3, 0.7F, arg1, arg1);
		} else if (arg0.aClass597_2 == Class597.aClass597_4 && Class683.method36096(arg0.aByte118)) {
			return this.anInterface24_119.method4231(Class596.aClass596_2, arg0.anInt3713 * 1604666399, Class609.aClass609_1, 0.7F, arg1, arg1);
		} else {
			return this.anInterface24_119.method4231(Class596.aClass596_2, arg0.anInt3713 * 1604666399, Class609.aClass609_2, 0.7F, arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!ky", name = "r", descriptor = "(Lclient!dy;I)Z", line = 50)
	boolean method28234(@OriginalArg(0) Class215 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			arg1 = arg0.anInt3714 * 1264459495;
		}
		if (arg0.aBoolean636 && this.aClass86_Sub1_38.method20183()) {
			return this.anInterface24_119.method4231(Class596.aClass596_2, arg0.anInt3713 * 1604666399, Class609.aClass609_3, 0.7F, arg1, arg1);
		} else if (arg0.aClass597_2 == Class597.aClass597_4 && Class683.method36096(arg0.aByte118)) {
			return this.anInterface24_119.method4231(Class596.aClass596_2, arg0.anInt3713 * 1604666399, Class609.aClass609_1, 0.7F, arg1, arg1);
		} else {
			return this.anInterface24_119.method4231(Class596.aClass596_2, arg0.anInt3713 * 1604666399, Class609.aClass609_2, 0.7F, arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!ky", name = "g", descriptor = "()V", line = 61)
	void method28235() {
		this.aClass232_77.method25847(5);
	}

	@OriginalMember(owner = "client!ky", name = "l", descriptor = "()V", line = 61)
	void method28236() {
		this.aClass232_77.method25847(5);
	}

	@OriginalMember(owner = "client!ky", name = "y", descriptor = "()V", line = 65)
	void method28237() {
		this.aClass232_77.method25850();
	}

	@OriginalMember(owner = "client!ky", name = "z", descriptor = "()V", line = 65)
	void method28238() {
		this.aClass232_77.method25850();
	}

	@OriginalMember(owner = "client!ky", name = "j", descriptor = "()V", line = 65)
	void method28239() {
		this.aClass232_77.method25850();
	}
}
