package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ang")
public class Class69_Sub1_Sub2 extends Class69_Sub1 {

	@OriginalMember(owner = "client!ang", name = "<init>", descriptor = "(Lclient!ha;)V", line = 8)
	public Class69_Sub1_Sub2(@OriginalArg(0) Class23 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ang", name = "q", descriptor = "(FFFI)F", line = 12)
	@Override
	float method20219(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat217;
		if (this.aClass23_16.method5839().aFloat259 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass23_16.method5842().method25861();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass23_16.method5839().method25861();
			@Pc(33) float local33 = local27 * (arg1 / 2.0F);
			if (local33 > local4) {
				arg1 -= this.aClass23_16.method5839().method25861() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass23_16.method5842().method25861()) {
				arg1 += this.aClass23_16.method5839().method25861() * arg2;
				if (arg1 > this.aClass23_16.method5842().method25861()) {
					arg1 = this.aClass23_16.method5842().method25861();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ang", name = "w", descriptor = "(FFF)F", line = 12)
	@Override
	float method20226(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat217;
		if (this.aClass23_16.method5839().aFloat259 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass23_16.method5842().method25861();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass23_16.method5839().method25861();
			@Pc(33) float local33 = local27 * (arg1 / 2.0F);
			if (local33 > local4) {
				arg1 -= this.aClass23_16.method5839().method25861() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass23_16.method5842().method25861()) {
				arg1 += this.aClass23_16.method5839().method25861() * arg2;
				if (arg1 > this.aClass23_16.method5842().method25861()) {
					arg1 = this.aClass23_16.method5842().method25861();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ang", name = "o", descriptor = "(FFF)F", line = 12)
	@Override
	float method20222(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat217;
		if (this.aClass23_16.method5839().aFloat259 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass23_16.method5842().method25861();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass23_16.method5839().method25861();
			@Pc(33) float local33 = local27 * (arg1 / 2.0F);
			if (local33 > local4) {
				arg1 -= this.aClass23_16.method5839().method25861() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass23_16.method5842().method25861()) {
				arg1 += this.aClass23_16.method5839().method25861() * arg2;
				if (arg1 > this.aClass23_16.method5842().method25861()) {
					arg1 = this.aClass23_16.method5842().method25861();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ang", name = "i", descriptor = "()V", line = 31)
	@Override
	void method20231() {
	}

	@OriginalMember(owner = "client!ang", name = "m", descriptor = "(I)V", line = 31)
	@Override
	void method20221() {
	}

	@OriginalMember(owner = "client!ang", name = "f", descriptor = "(Lclient!ahb;I)V", line = 32)
	@Override
	void method20217(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ang", name = "t", descriptor = "(Lclient!ahb;II)V", line = 32)
	@Override
	void method20228(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ang", name = "k", descriptor = "(Lclient!ahb;I)V", line = 32)
	@Override
	void method20223(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ang", name = "at", descriptor = "(Lclient!ahb;I)V", line = 32)
	@Override
	void method20225(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
	}
}
