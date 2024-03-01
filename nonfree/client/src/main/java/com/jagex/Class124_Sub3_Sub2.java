package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqt")
public class Class124_Sub3_Sub2 extends Class124_Sub3 {

	@OriginalMember(owner = "client!aqt", name = "z", descriptor = "[F")
	float[] aFloatArray58;

	@OriginalMember(owner = "client!aqt", name = "u", descriptor = "[F")
	float[] aFloatArray59;

	@OriginalMember(owner = "client!aqt", name = "p", descriptor = "I")
	int anInt2871 = 0;

	@OriginalMember(owner = "client!aqt", name = "<init>", descriptor = "(Lclient!je;)V", line = 13)
	public Class124_Sub3_Sub2(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aqt", name = "ah", descriptor = "(I)V", line = 17)
	@Override
	void method21435() {
		this.anInt2871 += 1443423479;
	}

	@OriginalMember(owner = "client!aqt", name = "at", descriptor = "()V", line = 17)
	@Override
	void method21440() {
		this.anInt2871 += 1443423479;
	}

	@OriginalMember(owner = "client!aqt", name = "am", descriptor = "()V", line = 17)
	@Override
	void method21441() {
		this.anInt2871 += 1443423479;
	}

	@OriginalMember(owner = "client!aqt", name = "au", descriptor = "()V", line = 17)
	@Override
	void method21442() {
		this.anInt2871 += 1443423479;
	}

	@OriginalMember(owner = "client!aqt", name = "ad", descriptor = "()V", line = 17)
	@Override
	void method21443() {
		this.anInt2871 += 1443423479;
	}

	@OriginalMember(owner = "client!aqt", name = "ag", descriptor = "(FFFB)F", line = 21)
	@Override
	float method21434(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat219 / (float) this.aClass479Array5[this.anInt2871 * -963830585].method29712();
		return this.aFloatArray59[this.anInt2871 * -963830585] + (this.aFloatArray58[this.anInt2871 * -963830585] - this.aFloatArray59[this.anInt2871 * -963830585]) * local12;
	}

	@OriginalMember(owner = "client!aqt", name = "ai", descriptor = "(FFF)F", line = 21)
	@Override
	float method21437(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat219 / (float) this.aClass479Array5[this.anInt2871 * -963830585].method29712();
		return this.aFloatArray59[this.anInt2871 * -963830585] + (this.aFloatArray58[this.anInt2871 * -963830585] - this.aFloatArray59[this.anInt2871 * -963830585]) * local12;
	}

	@OriginalMember(owner = "client!aqt", name = "as", descriptor = "(FFF)F", line = 21)
	@Override
	float method21439(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat219 / (float) this.aClass479Array5[this.anInt2871 * -963830585].method29712();
		return this.aFloatArray59[this.anInt2871 * -963830585] + (this.aFloatArray58[this.anInt2871 * -963830585] - this.aFloatArray59[this.anInt2871 * -963830585]) * local12;
	}

	@OriginalMember(owner = "client!aqt", name = "aw", descriptor = "(FFF)F", line = 21)
	@Override
	float method21438(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat219 / (float) this.aClass479Array5[this.anInt2871 * -963830585].method29712();
		return this.aFloatArray59[this.anInt2871 * -963830585] + (this.aFloatArray58[this.anInt2871 * -963830585] - this.aFloatArray59[this.anInt2871 * -963830585]) * local12;
	}

	@OriginalMember(owner = "client!aqt", name = "ae", descriptor = "(FFI)V", line = 27)
	@Override
	void method21433(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat219 += arg0;
		if (this.aFloat219 > (float) this.aClass479Array5[this.anInt2871 * -963830585].method29712()) {
			this.aFloat219 = this.aClass479Array5[this.anInt2871 * -963830585].method29712();
		}
	}

	@OriginalMember(owner = "client!aqt", name = "aq", descriptor = "(FF)V", line = 27)
	@Override
	void method21448(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat219 += arg0;
		if (this.aFloat219 > (float) this.aClass479Array5[this.anInt2871 * -963830585].method29712()) {
			this.aFloat219 = this.aClass479Array5[this.anInt2871 * -963830585].method29712();
		}
	}

	@OriginalMember(owner = "client!aqt", name = "ax", descriptor = "(FF)V", line = 27)
	@Override
	void method21449(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat219 += arg0;
		if (this.aFloat219 > (float) this.aClass479Array5[this.anInt2871 * -963830585].method29712()) {
			this.aFloat219 = this.aClass479Array5[this.anInt2871 * -963830585].method29712();
		}
	}

	@OriginalMember(owner = "client!aqt", name = "m", descriptor = "(B)Lclient!ox;", line = 32)
	@Override
	public Class472 method21402() {
		@Pc(1) Class472 local1 = Class472.method29528();
		@Pc(12) double[] local12 = this.aClass479Array5[this.anInt2871 * -963830585].method29716(this.aFloat219);
		local1.aFloat317 = (float) local12[0];
		local1.aFloat318 = (float) local12[1];
		local1.aFloat319 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!aqt", name = "g", descriptor = "()Lclient!ox;", line = 32)
	@Override
	public Class472 method21423() {
		@Pc(1) Class472 local1 = Class472.method29528();
		@Pc(12) double[] local12 = this.aClass479Array5[this.anInt2871 * -963830585].method29716(this.aFloat219);
		local1.aFloat317 = (float) local12[0];
		local1.aFloat318 = (float) local12[1];
		local1.aFloat319 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!aqt", name = "k", descriptor = "(I)[D", line = 41)
	@Override
	public double[] method21413() {
		return this.aClass479Array5[this.anInt2871 * -963830585].method29716(this.aFloat219);
	}

	@OriginalMember(owner = "client!aqt", name = "d", descriptor = "()[D", line = 41)
	@Override
	public double[] method21403() {
		return this.aClass479Array5[this.anInt2871 * -963830585].method29716(this.aFloat219);
	}

	@OriginalMember(owner = "client!aqt", name = "al", descriptor = "(I)F", line = 45)
	@Override
	public float method21445() {
		return this.aFloat219;
	}

	@OriginalMember(owner = "client!aqt", name = "ay", descriptor = "()F", line = 45)
	@Override
	public float method21452() {
		return this.aFloat219;
	}

	@OriginalMember(owner = "client!aqt", name = "av", descriptor = "()F", line = 45)
	@Override
	public float method21450() {
		return this.aFloat219;
	}

	@OriginalMember(owner = "client!aqt", name = "ao", descriptor = "()F", line = 45)
	@Override
	public float method21444() {
		return this.aFloat219;
	}

	@OriginalMember(owner = "client!aqt", name = "aj", descriptor = "()F", line = 45)
	@Override
	public float method21451() {
		return this.aFloat219;
	}

	@OriginalMember(owner = "client!aqt", name = "w", descriptor = "(I)F", line = 49)
	@Override
	public float method21405() {
		return this.aClass479Array5[this.anInt2871 * -963830585].method29718(this.aFloat219);
	}

	@OriginalMember(owner = "client!aqt", name = "s", descriptor = "()F", line = 49)
	@Override
	public float method21415() {
		return this.aClass479Array5[this.anInt2871 * -963830585].method29718(this.aFloat219);
	}

	@OriginalMember(owner = "client!aqt", name = "y", descriptor = "()F", line = 49)
	@Override
	public float method21416() {
		return this.aClass479Array5[this.anInt2871 * -963830585].method29718(this.aFloat219);
	}

	@OriginalMember(owner = "client!aqt", name = "ac", descriptor = "(Lclient!alw;IS)V", line = 53)
	@Override
	void method21436(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray59 = new float[arg1];
		this.aFloatArray58 = new float[arg1];
		this.anInt2871 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray59[local12] = arg0.method22425();
			this.aFloatArray58[local12] = arg0.method22425();
		}
	}

	@OriginalMember(owner = "client!aqt", name = "ar", descriptor = "(Lclient!alw;I)V", line = 53)
	@Override
	void method21446(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray59 = new float[arg1];
		this.aFloatArray58 = new float[arg1];
		this.anInt2871 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray59[local12] = arg0.method22425();
			this.aFloatArray58[local12] = arg0.method22425();
		}
	}

	@OriginalMember(owner = "client!aqt", name = "ap", descriptor = "(Lclient!alw;I)V", line = 53)
	@Override
	void method21447(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray59 = new float[arg1];
		this.aFloatArray58 = new float[arg1];
		this.anInt2871 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray59[local12] = arg0.method22425();
			this.aFloatArray58[local12] = arg0.method22425();
		}
	}
}
