package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ace")
public class Class13_Sub7 extends Class13 {

	@OriginalMember(owner = "client!ace", name = "of", descriptor = "I")
	public static int anInt608;

	@OriginalMember(owner = "client!ace", name = "a", descriptor = "I")
	final int anInt604;

	@OriginalMember(owner = "client!ace", name = "g", descriptor = "I")
	final int anInt606;

	@OriginalMember(owner = "client!ace", name = "l", descriptor = "I")
	final int anInt605;

	@OriginalMember(owner = "client!ace", name = "h", descriptor = "I")
	final int anInt607;

	@OriginalMember(owner = "client!ace", name = "x", descriptor = "Lclient!oh;")
	Class366 aClass366_1;

	@OriginalMember(owner = "client!ace", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 18)
	Class13_Sub7(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt604 = arg0.method20271() * -500541;
		this.anInt606 = arg0.method20269() * 1240633009;
		this.anInt605 = arg0.method20269() * -935055769;
		this.anInt607 = arg0.method20269() * -46662491;
		this.aClass366_1 = Class510.aClass183_1.method23686(Class160.aClass160_9, this, this.anInt604 * 416822251, this.anInt607 * 1394576173, this.anInt606 * -1284965807, Class141.aClass141_3.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, this.anInt605 * -1004597929, false);
		if (this.aClass366_1 != null) {
			this.aClass366_1.method26817();
		}
	}

	@OriginalMember(owner = "client!ace", name = "a", descriptor = "(I)V", line = 30)
	@Override
	public void method16888() {
		if (this.aClass366_1 != null) {
			this.aClass366_1.method26818();
		}
	}

	@OriginalMember(owner = "client!ace", name = "h", descriptor = "()V", line = 30)
	@Override
	public void method16896() {
		if (this.aClass366_1 != null) {
			this.aClass366_1.method26818();
		}
	}

	@OriginalMember(owner = "client!ace", name = "y", descriptor = "()V", line = 36)
	@Override
	void method16895() {
		if (this.aClass366_1 != null) {
			this.aClass366_1.method26819(50);
			Class510.aClass183_1.method23684(this.aClass366_1);
			this.aClass366_1 = null;
		}
	}

	@OriginalMember(owner = "client!ace", name = "g", descriptor = "(I)V", line = 36)
	@Override
	void method16892() {
		if (this.aClass366_1 != null) {
			this.aClass366_1.method26819(50);
			Class510.aClass183_1.method23684(this.aClass366_1);
			this.aClass366_1 = null;
		}
	}

	@OriginalMember(owner = "client!ace", name = "u", descriptor = "()V", line = 36)
	@Override
	void method16894() {
		if (this.aClass366_1 != null) {
			this.aClass366_1.method26819(50);
			Class510.aClass183_1.method23684(this.aClass366_1);
			this.aClass366_1 = null;
		}
	}

	@OriginalMember(owner = "client!ace", name = "b", descriptor = "()V", line = 36)
	@Override
	void method16889() {
		if (this.aClass366_1 != null) {
			this.aClass366_1.method26819(50);
			Class510.aClass183_1.method23684(this.aClass366_1);
			this.aClass366_1 = null;
		}
	}

	@OriginalMember(owner = "client!ace", name = "m", descriptor = "(Lclient!dh;Lclient!wi;Lclient!wi;I)V", line = 162)
	public static final void method6223(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class71 arg2) {
		if (arg1.method20046() && arg2.method20046()) {
			@Pc(10) Class440 local10 = arg1.aClass440_5;
			@Pc(13) Class440 local13 = arg2.aClass440_5;
			arg0.method5342(arg1.aClass560_10.aClass3_Sub1_Sub17_1, arg1.aClass560_10.anInt5359 * -1862388547, arg1.aClass560_10.aClass3_Sub1_Sub17_2, arg1.aClass560_10.anInt5358 * 960599807, arg1.anInt2766 * -867233633, local10.anIntArray440[arg1.anInt2767 * 866427817], arg2.aClass560_10.aClass3_Sub1_Sub17_1, arg2.aClass560_10.anInt5359 * -1862388547, arg2.aClass560_10.aClass3_Sub1_Sub17_2, arg2.aClass560_10.anInt5358 * 960599807, arg2.anInt2766 * -867233633, local13.anIntArray440[arg2.anInt2767 * 866427817], local10.aClass427_1 == null ? null : local10.aClass427_1.aBooleanArray31, local10.aBoolean764 | local13.aBoolean764);
		}
	}

	@OriginalMember(owner = "client!ace", name = "vg", descriptor = "(Lclient!vs;I)V", line = 7874)
	static final void method6224(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2362 * -162520433;
	}

	@OriginalMember(owner = "client!ace", name = "aiz", descriptor = "(Lclient!vs;I)V", line = 10610)
	static final void method6225(@OriginalArg(0) Class536 arg0) {
		Class110.method22012();
	}
}
