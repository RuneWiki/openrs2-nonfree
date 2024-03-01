package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqx")
public class Class124_Sub3_Sub3 extends Class124_Sub3 {

	@OriginalMember(owner = "client!aqx", name = "<init>", descriptor = "(Lclient!je;)V", line = 8)
	public Class124_Sub3_Sub3(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aqx", name = "aw", descriptor = "(FFF)F", line = 12)
	@Override
	float method21438(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat219;
		if (this.aClass123_13.method9021().aFloat317 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass123_13.method8936().method29565();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass123_13.method9021().method29565();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass123_13.method9021().method29565() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass123_13.method8936().method29565()) {
				arg1 += this.aClass123_13.method9021().method29565() * arg2;
				if (arg1 > this.aClass123_13.method8936().method29565()) {
					arg1 = this.aClass123_13.method8936().method29565();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!aqx", name = "ag", descriptor = "(FFFB)F", line = 12)
	@Override
	float method21434(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat219;
		if (this.aClass123_13.method9021().aFloat317 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass123_13.method8936().method29565();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass123_13.method9021().method29565();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass123_13.method9021().method29565() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass123_13.method8936().method29565()) {
				arg1 += this.aClass123_13.method9021().method29565() * arg2;
				if (arg1 > this.aClass123_13.method8936().method29565()) {
					arg1 = this.aClass123_13.method8936().method29565();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!aqx", name = "ai", descriptor = "(FFF)F", line = 12)
	@Override
	float method21437(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat219;
		if (this.aClass123_13.method9021().aFloat317 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass123_13.method8936().method29565();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass123_13.method9021().method29565();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass123_13.method9021().method29565() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass123_13.method8936().method29565()) {
				arg1 += this.aClass123_13.method9021().method29565() * arg2;
				if (arg1 > this.aClass123_13.method8936().method29565()) {
					arg1 = this.aClass123_13.method8936().method29565();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!aqx", name = "as", descriptor = "(FFF)F", line = 12)
	@Override
	float method21439(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat219;
		if (this.aClass123_13.method9021().aFloat317 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass123_13.method8936().method29565();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass123_13.method9021().method29565();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass123_13.method9021().method29565() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass123_13.method8936().method29565()) {
				arg1 += this.aClass123_13.method9021().method29565() * arg2;
				if (arg1 > this.aClass123_13.method8936().method29565()) {
					arg1 = this.aClass123_13.method8936().method29565();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!aqx", name = "au", descriptor = "()V", line = 31)
	@Override
	void method21442() {
	}

	@OriginalMember(owner = "client!aqx", name = "ah", descriptor = "(I)V", line = 31)
	@Override
	void method21435() {
	}

	@OriginalMember(owner = "client!aqx", name = "at", descriptor = "()V", line = 31)
	@Override
	void method21440() {
	}

	@OriginalMember(owner = "client!aqx", name = "ad", descriptor = "()V", line = 31)
	@Override
	void method21443() {
	}

	@OriginalMember(owner = "client!aqx", name = "am", descriptor = "()V", line = 31)
	@Override
	void method21441() {
	}

	@OriginalMember(owner = "client!aqx", name = "ac", descriptor = "(Lclient!alw;IS)V", line = 32)
	@Override
	void method21436(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqx", name = "ar", descriptor = "(Lclient!alw;I)V", line = 32)
	@Override
	void method21446(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqx", name = "ap", descriptor = "(Lclient!alw;I)V", line = 32)
	@Override
	void method21447(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
	}
}
