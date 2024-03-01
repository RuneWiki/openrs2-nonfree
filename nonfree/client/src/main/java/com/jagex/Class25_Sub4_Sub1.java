package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asi")
public class Class25_Sub4_Sub1 extends Class25_Sub4 {

	@OriginalMember(owner = "client!asi", name = "<init>", descriptor = "(Lclient!je;)V", line = 8)
	public Class25_Sub4_Sub1(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!asi", name = "b", descriptor = "(FFFI)F", line = 12)
	@Override
	float method23141(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat229;
		if (this.aClass123_16.method9037().aFloat317 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass123_16.method8971().method29565();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass123_16.method9037().method29565();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass123_16.method9037().method29565() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass123_16.method8971().method29565()) {
				arg1 += this.aClass123_16.method9037().method29565() * arg2;
				if (arg1 > this.aClass123_16.method8971().method29565()) {
					arg1 = this.aClass123_16.method8971().method29565();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!asi", name = "i", descriptor = "(FFF)F", line = 12)
	@Override
	float method23146(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = arg0 - this.aFloat229;
		if (this.aClass123_16.method9037().aFloat317 == Float.POSITIVE_INFINITY) {
			arg1 = this.aClass123_16.method8971().method29565();
		} else {
			@Pc(27) float local27 = arg1 / this.aClass123_16.method9037().method29565();
			@Pc(33) float local33 = arg1 / 2.0F * local27;
			if (local33 > local4) {
				arg1 -= this.aClass123_16.method9037().method29565() * arg2;
				if (arg1 < 0.0F) {
					arg1 = 0.0F;
				}
			} else if (arg1 < this.aClass123_16.method8971().method29565()) {
				arg1 += this.aClass123_16.method9037().method29565() * arg2;
				if (arg1 > this.aClass123_16.method8971().method29565()) {
					arg1 = this.aClass123_16.method8971().method29565();
				}
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!asi", name = "h", descriptor = "(I)V", line = 31)
	@Override
	void method23142() {
	}

	@OriginalMember(owner = "client!asi", name = "al", descriptor = "()V", line = 31)
	@Override
	void method23144() {
	}

	@OriginalMember(owner = "client!asi", name = "ac", descriptor = "()V", line = 31)
	@Override
	void method23139() {
	}

	@OriginalMember(owner = "client!asi", name = "j", descriptor = "(Lclient!alw;I)V", line = 32)
	@Override
	void method23149(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!asi", name = "g", descriptor = "(Lclient!alw;IB)V", line = 32)
	@Override
	void method23145(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!asi", name = "t", descriptor = "(Lclient!alw;I)V", line = 32)
	@Override
	void method23147(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
	}
}
