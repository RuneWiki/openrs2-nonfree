package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zq")
public class Class627 {

	@OriginalMember(owner = "client!zq", name = "p", descriptor = "[Lclient!kk;")
	public Interface31[] anInterface31Array1;

	@OriginalMember(owner = "client!zq", name = "<init>", descriptor = "()V", line = 21)
	Class627() {
	}

	@OriginalMember(owner = "client!zq", name = "g", descriptor = "(Lclient!ahb;)V", line = 24)
	void method33802(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInterface31Array1 = new Interface31[arg0.method20269()];
		@Pc(8) Class274[] local8 = Class60_Sub27.method13866();
		for (@Pc(10) int local10 = 0; local10 < this.anInterface31Array1.length; local10++) {
			this.anInterface31Array1[local10] = this.method33801(arg0, local8[arg0.method20269()]);
		}
	}

	@OriginalMember(owner = "client!zq", name = "h", descriptor = "(Lclient!ahb;)V", line = 24)
	void method33803(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInterface31Array1 = new Interface31[arg0.method20269()];
		@Pc(8) Class274[] local8 = Class60_Sub27.method13866();
		for (@Pc(10) int local10 = 0; local10 < this.anInterface31Array1.length; local10++) {
			this.anInterface31Array1[local10] = this.method33801(arg0, local8[arg0.method20269()]);
		}
	}

	@OriginalMember(owner = "client!zq", name = "l", descriptor = "(Lclient!ahb;)V", line = 24)
	void method33804(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInterface31Array1 = new Interface31[arg0.method20269()];
		@Pc(8) Class274[] local8 = Class60_Sub27.method13866();
		for (@Pc(10) int local10 = 0; local10 < this.anInterface31Array1.length; local10++) {
			this.anInterface31Array1[local10] = this.method33801(arg0, local8[arg0.method20269()]);
		}
	}

	@OriginalMember(owner = "client!zq", name = "p", descriptor = "(Lclient!ahb;B)V", line = 24)
	void method33805(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInterface31Array1 = new Interface31[arg0.method20269()];
		@Pc(8) Class274[] local8 = Class60_Sub27.method13866();
		for (@Pc(10) int local10 = 0; local10 < this.anInterface31Array1.length; local10++) {
			this.anInterface31Array1[local10] = this.method33801(arg0, local8[arg0.method20269()]);
		}
	}

	@OriginalMember(owner = "client!zq", name = "x", descriptor = "(Lclient!ahb;Lclient!ke;)Lclient!kk;", line = 32)
	Interface31 method33799(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class274 arg1) {
		if (arg1 == Class274.aClass274_4) {
			return Class481.method29079(arg0);
		} else if (Class274.aClass274_1 == arg1) {
			return Class286.method25480(arg0);
		} else if (Class274.aClass274_8 == arg1) {
			return Class77.method21573(arg0);
		} else if (arg1 == Class274.aClass274_6) {
			return Class116.method22812(arg0);
		} else if (arg1 == Class274.aClass274_5) {
			return Class561.method32865(arg0);
		} else if (Class274.aClass274_2 == arg1) {
			return Class13_Sub14.method6535(arg0);
		} else if (Class274.aClass274_3 == arg1) {
			return Class14_Sub1.method1411(arg0);
		} else if (Class274.aClass274_7 == arg1) {
			return Class389.method27402(arg0);
		} else if (arg1 == Class274.aClass274_11) {
			return Class16.method1676(arg0);
		} else if (Class274.aClass274_9 == arg1) {
			return Class484.method29111(arg0);
		} else if (arg1 == Class274.aClass274_10) {
			return Class3_Sub1_Sub16.method19425(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!zq", name = "s", descriptor = "(Lclient!ahb;Lclient!ke;)Lclient!kk;", line = 32)
	Interface31 method33800(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class274 arg1) {
		if (arg1 == Class274.aClass274_4) {
			return Class481.method29079(arg0);
		} else if (Class274.aClass274_1 == arg1) {
			return Class286.method25480(arg0);
		} else if (Class274.aClass274_8 == arg1) {
			return Class77.method21573(arg0);
		} else if (arg1 == Class274.aClass274_6) {
			return Class116.method22812(arg0);
		} else if (arg1 == Class274.aClass274_5) {
			return Class561.method32865(arg0);
		} else if (Class274.aClass274_2 == arg1) {
			return Class13_Sub14.method6535(arg0);
		} else if (Class274.aClass274_3 == arg1) {
			return Class14_Sub1.method1411(arg0);
		} else if (Class274.aClass274_7 == arg1) {
			return Class389.method27402(arg0);
		} else if (arg1 == Class274.aClass274_11) {
			return Class16.method1676(arg0);
		} else if (Class274.aClass274_9 == arg1) {
			return Class484.method29111(arg0);
		} else if (arg1 == Class274.aClass274_10) {
			return Class3_Sub1_Sub16.method19425(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!zq", name = "a", descriptor = "(Lclient!ahb;Lclient!ke;B)Lclient!kk;", line = 32)
	Interface31 method33801(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class274 arg1) {
		if (arg1 == Class274.aClass274_4) {
			return Class481.method29079(arg0);
		} else if (Class274.aClass274_1 == arg1) {
			return Class286.method25480(arg0);
		} else if (Class274.aClass274_8 == arg1) {
			return Class77.method21573(arg0);
		} else if (arg1 == Class274.aClass274_6) {
			return Class116.method22812(arg0);
		} else if (arg1 == Class274.aClass274_5) {
			return Class561.method32865(arg0);
		} else if (Class274.aClass274_2 == arg1) {
			return Class13_Sub14.method6535(arg0);
		} else if (Class274.aClass274_3 == arg1) {
			return Class14_Sub1.method1411(arg0);
		} else if (Class274.aClass274_7 == arg1) {
			return Class389.method27402(arg0);
		} else if (arg1 == Class274.aClass274_11) {
			return Class16.method1676(arg0);
		} else if (Class274.aClass274_9 == arg1) {
			return Class484.method29111(arg0);
		} else if (arg1 == Class274.aClass274_10) {
			return Class3_Sub1_Sub16.method19425(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!zq", name = "u", descriptor = "(Lclient!ahb;Lclient!ke;)Lclient!kk;", line = 32)
	Interface31 method33806(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) Class274 arg1) {
		if (arg1 == Class274.aClass274_4) {
			return Class481.method29079(arg0);
		} else if (Class274.aClass274_1 == arg1) {
			return Class286.method25480(arg0);
		} else if (Class274.aClass274_8 == arg1) {
			return Class77.method21573(arg0);
		} else if (arg1 == Class274.aClass274_6) {
			return Class116.method22812(arg0);
		} else if (arg1 == Class274.aClass274_5) {
			return Class561.method32865(arg0);
		} else if (Class274.aClass274_2 == arg1) {
			return Class13_Sub14.method6535(arg0);
		} else if (Class274.aClass274_3 == arg1) {
			return Class14_Sub1.method1411(arg0);
		} else if (Class274.aClass274_7 == arg1) {
			return Class389.method27402(arg0);
		} else if (arg1 == Class274.aClass274_11) {
			return Class16.method1676(arg0);
		} else if (Class274.aClass274_9 == arg1) {
			return Class484.method29111(arg0);
		} else if (arg1 == Class274.aClass274_10) {
			return Class3_Sub1_Sub16.method19425(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!zq", name = "ada", descriptor = "(Lclient!vs;B)V", line = 9613)
	static final void method33807(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 312124549;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class269.method25285(local13);
	}
}
