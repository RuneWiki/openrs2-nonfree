package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akb")
public class Class13_Sub12_Sub1 extends Class13_Sub12 {

	@OriginalMember(owner = "client!akb", name = "h", descriptor = "I")
	final int anInt2149;

	@OriginalMember(owner = "client!akb", name = "x", descriptor = "I")
	final int anInt2148;

	@OriginalMember(owner = "client!akb", name = "s", descriptor = "I")
	final int anInt2150;

	@OriginalMember(owner = "client!akb", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 14)
	Class13_Sub12_Sub1(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		@Pc(6) int local6 = arg0.method20275();
		this.anInt2149 = (local6 >>> 16) * 2059272431;
		this.anInt2148 = (local6 & 0xFFFF) * 175090143;
		this.anInt2150 = arg0.method20269() * -471980015;
	}

	@OriginalMember(owner = "client!akb", name = "h", descriptor = "()V", line = 22)
	@Override
	public void method16896() {
		@Pc(6) int local6 = this.anInt2149 * -94626304 + 256;
		@Pc(13) int local13 = this.anInt2148 * 514080256 + 256;
		@Pc(18) int local18 = this.anInt2150 * 1788856561;
		if (local18 < 3 && client.aClass370_1.method27075().method26504(this.anInt2149 * 712846863, this.anInt2148 * 2081378847)) {
			local18++;
		}
		@Pc(90) Class26_Sub1_Sub1_Sub4 local90 = new Class26_Sub1_Sub1_Sub4(client.aClass370_1.method26950(), this.anInt2439 * -1230764753, 0, this.anInt2150 * 1788856561, local18, local6, Class186.method23926(local6, local13, this.anInt2150 * 1788856561) - this.anInt2441 * -1040875649, local13, this.anInt2149 * 712846863, this.anInt2149 * 712846863, this.anInt2148 * 2081378847, this.anInt2148 * 2081378847, this.anInt2440 * -1130842579, false, 0);
		client.aClass581_18.method33241(new Class3_Sub1_Sub16(local90), (long) (this.anInt2149 * 712846863 << 16 | this.anInt2148 * 2081378847));
	}

	@OriginalMember(owner = "client!akb", name = "a", descriptor = "(I)V", line = 22)
	@Override
	public void method16888() {
		@Pc(6) int local6 = this.anInt2149 * -94626304 + 256;
		@Pc(13) int local13 = this.anInt2148 * 514080256 + 256;
		@Pc(18) int local18 = this.anInt2150 * 1788856561;
		if (local18 < 3 && client.aClass370_1.method27075().method26504(this.anInt2149 * 712846863, this.anInt2148 * 2081378847)) {
			local18++;
		}
		@Pc(90) Class26_Sub1_Sub1_Sub4 local90 = new Class26_Sub1_Sub1_Sub4(client.aClass370_1.method26950(), this.anInt2439 * -1230764753, 0, this.anInt2150 * 1788856561, local18, local6, Class186.method23926(local6, local13, this.anInt2150 * 1788856561) - this.anInt2441 * -1040875649, local13, this.anInt2149 * 712846863, this.anInt2149 * 712846863, this.anInt2148 * 2081378847, this.anInt2148 * 2081378847, this.anInt2440 * -1130842579, false, 0);
		client.aClass581_18.method33241(new Class3_Sub1_Sub16(local90), (long) (this.anInt2149 * 712846863 << 16 | this.anInt2148 * 2081378847));
	}
}
