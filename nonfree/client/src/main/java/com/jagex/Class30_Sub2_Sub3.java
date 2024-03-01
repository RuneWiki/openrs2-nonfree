package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akm")
public class Class30_Sub2_Sub3 extends Class30_Sub2 {

	@OriginalMember(owner = "client!akm", name = "<init>", descriptor = "(Lclient!ha;)V", line = 8)
	public Class30_Sub2_Sub3(@OriginalArg(0) Class23 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!akm", name = "aj", descriptor = "(FFF)F", line = 12)
	@Override
	float method16452(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat181;
		if (this.aClass23_13.method5840().aFloat259 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass23_13.method5843().method25861();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass23_13.method5840().method25861();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass23_13.method5840().method25861() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass23_13.method5843().method25861()) {
				arg1 += this.aClass23_13.method5840().method25861() * arg2;
				if (arg1 > this.aClass23_13.method5843().method25861()) {
					arg1 = this.aClass23_13.method5843().method25861();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!akm", name = "af", descriptor = "(FFFI)F", line = 12)
	@Override
	float method16454(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat181;
		if (this.aClass23_13.method5840().aFloat259 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass23_13.method5843().method25861();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass23_13.method5840().method25861();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass23_13.method5840().method25861() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass23_13.method5843().method25861()) {
				arg1 += this.aClass23_13.method5840().method25861() * arg2;
				if (arg1 > this.aClass23_13.method5843().method25861()) {
					arg1 = this.aClass23_13.method5843().method25861();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!akm", name = "an", descriptor = "(FFF)F", line = 12)
	@Override
	float method16465(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat181;
		if (this.aClass23_13.method5840().aFloat259 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass23_13.method5843().method25861();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass23_13.method5840().method25861();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass23_13.method5840().method25861() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass23_13.method5843().method25861()) {
				arg1 += this.aClass23_13.method5840().method25861() * arg2;
				if (arg1 > this.aClass23_13.method5843().method25861()) {
					arg1 = this.aClass23_13.method5843().method25861();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!akm", name = "ak", descriptor = "(I)V", line = 31)
	@Override
	void method16455() {
	}

	@OriginalMember(owner = "client!akm", name = "as", descriptor = "()V", line = 31)
	@Override
	void method16459() {
	}

	@OriginalMember(owner = "client!akm", name = "ai", descriptor = "()V", line = 31)
	@Override
	void method16460() {
	}

	@OriginalMember(owner = "client!akm", name = "aq", descriptor = "()V", line = 31)
	@Override
	void method16461() {
	}

	@OriginalMember(owner = "client!akm", name = "ah", descriptor = "(Lclient!ahb;II)V", line = 32)
	@Override
	void method16458(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!akm", name = "av", descriptor = "(Lclient!ahb;I)V", line = 32)
	@Override
	void method16456(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!akm", name = "asd", descriptor = "(Lclient!vs;I)V", line = 12218)
	static final void method16476(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub32_1, 0);
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}
}
