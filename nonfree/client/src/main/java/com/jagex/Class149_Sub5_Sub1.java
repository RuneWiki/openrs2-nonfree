package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asd")
public class Class149_Sub5_Sub1 extends Class149_Sub5 {

	@OriginalMember(owner = "client!asd", name = "<init>", descriptor = "(Lclient!im;)V", line = 8)
	public Class149_Sub5_Sub1(@OriginalArg(0) Class107 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!asd", name = "f", descriptor = "(FFFI)F", line = 12)
	@Override
	float method23181(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat229;
		if (this.aClass107_16.method8906().aFloat277 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass107_16.method8917().method29170();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass107_16.method8906().method29170();
			@Pc(33) float local33 = local27 * (arg1 / 2.0F);
			if (local33 > local4) {
				arg1 -= this.aClass107_16.method8906().method29170() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass107_16.method8917().method29170()) {
				arg1 += this.aClass107_16.method8906().method29170() * arg2;
				if (arg1 > this.aClass107_16.method8917().method29170()) {
					arg1 = this.aClass107_16.method8917().method29170();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!asd", name = "a", descriptor = "(FFF)F", line = 12)
	@Override
	float method23182(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat229;
		if (this.aClass107_16.method8906().aFloat277 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass107_16.method8917().method29170();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass107_16.method8906().method29170();
			@Pc(33) float local33 = local27 * (arg1 / 2.0F);
			if (local33 > local4) {
				arg1 -= this.aClass107_16.method8906().method29170() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass107_16.method8917().method29170()) {
				arg1 += this.aClass107_16.method8906().method29170() * arg2;
				if (arg1 > this.aClass107_16.method8917().method29170()) {
					arg1 = this.aClass107_16.method8917().method29170();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!asd", name = "m", descriptor = "(FFF)F", line = 12)
	@Override
	float method23183(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat229;
		if (this.aClass107_16.method8906().aFloat277 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass107_16.method8917().method29170();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass107_16.method8906().method29170();
			@Pc(33) float local33 = local27 * (arg1 / 2.0F);
			if (local33 > local4) {
				arg1 -= this.aClass107_16.method8906().method29170() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass107_16.method8917().method29170()) {
				arg1 += this.aClass107_16.method8906().method29170() * arg2;
				if (arg1 > this.aClass107_16.method8917().method29170()) {
					arg1 = this.aClass107_16.method8917().method29170();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!asd", name = "h", descriptor = "(FFF)F", line = 12)
	@Override
	float method23184(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat229;
		if (this.aClass107_16.method8906().aFloat277 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass107_16.method8917().method29170();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass107_16.method8906().method29170();
			@Pc(33) float local33 = local27 * (arg1 / 2.0F);
			if (local33 > local4) {
				arg1 -= this.aClass107_16.method8906().method29170() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass107_16.method8917().method29170()) {
				arg1 += this.aClass107_16.method8906().method29170() * arg2;
				if (arg1 > this.aClass107_16.method8917().method29170()) {
					arg1 = this.aClass107_16.method8917().method29170();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!asd", name = "o", descriptor = "(I)V", line = 31)
	@Override
	void method23190() {
	}

	@OriginalMember(owner = "client!asd", name = "aj", descriptor = "()V", line = 31)
	@Override
	void method23185() {
	}

	@OriginalMember(owner = "client!asd", name = "ag", descriptor = "(Lclient!akv;I)V", line = 32)
	@Override
	void method23186(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!asd", name = "n", descriptor = "(Lclient!akv;IB)V", line = 32)
	@Override
	void method23189(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!asd", name = "ai", descriptor = "(Lclient!akv;I)V", line = 32)
	@Override
	void method23188(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!asd", name = "al", descriptor = "(Lclient!akv;I)V", line = 32)
	@Override
	void method23187(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
	}
}
