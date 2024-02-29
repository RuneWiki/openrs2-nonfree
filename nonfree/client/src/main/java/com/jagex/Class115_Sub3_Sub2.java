package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apu")
public class Class115_Sub3_Sub2 extends Class115_Sub3 {

	@OriginalMember(owner = "client!apu", name = "<init>", descriptor = "(Lclient!im;)V", line = 8)
	public Class115_Sub3_Sub2(@OriginalArg(0) Class107 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!apu", name = "ag", descriptor = "(FFFI)F", line = 12)
	@Override
	float method21241(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat216;
		if (this.aClass107_13.method8910().aFloat277 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass107_13.method8918().method29170();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass107_13.method8910().method29170();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass107_13.method8910().method29170() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass107_13.method8918().method29170()) {
				arg1 += this.aClass107_13.method8910().method29170() * arg2;
				if (arg1 > this.aClass107_13.method8918().method29170()) {
					arg1 = this.aClass107_13.method8918().method29170();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!apu", name = "av", descriptor = "(FFF)F", line = 12)
	@Override
	float method21248(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat216;
		if (this.aClass107_13.method8910().aFloat277 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass107_13.method8918().method29170();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass107_13.method8910().method29170();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass107_13.method8910().method29170() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass107_13.method8918().method29170()) {
				arg1 += this.aClass107_13.method8910().method29170() * arg2;
				if (arg1 > this.aClass107_13.method8918().method29170()) {
					arg1 = this.aClass107_13.method8918().method29170();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!apu", name = "at", descriptor = "(FFF)F", line = 12)
	@Override
	float method21249(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat216;
		if (this.aClass107_13.method8910().aFloat277 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass107_13.method8918().method29170();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass107_13.method8910().method29170();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass107_13.method8910().method29170() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass107_13.method8918().method29170()) {
				arg1 += this.aClass107_13.method8910().method29170() * arg2;
				if (arg1 > this.aClass107_13.method8918().method29170()) {
					arg1 = this.aClass107_13.method8918().method29170();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!apu", name = "au", descriptor = "()V", line = 31)
	@Override
	void method21243() {
	}

	@OriginalMember(owner = "client!apu", name = "ax", descriptor = "()V", line = 31)
	@Override
	void method21244() {
	}

	@OriginalMember(owner = "client!apu", name = "al", descriptor = "(B)V", line = 31)
	@Override
	void method21242() {
	}

	@OriginalMember(owner = "client!apu", name = "ac", descriptor = "(Lclient!akv;I)V", line = 32)
	@Override
	void method21246(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!apu", name = "ak", descriptor = "(Lclient!akv;II)V", line = 32)
	@Override
	void method21247(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!apu", name = "ad", descriptor = "(Lclient!akv;I)V", line = 32)
	@Override
	void method21245(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!apu", name = "ar", descriptor = "(Lclient!akv;I)V", line = 32)
	@Override
	void method21250(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
	}
}
