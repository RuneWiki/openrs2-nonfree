package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aph")
public class Class122_Sub1_Sub1 extends Class122_Sub1 {

	@OriginalMember(owner = "client!aph", name = "aq", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_56;

	@OriginalMember(owner = "client!aph", name = "ar", descriptor = "Lclient!hr;")
	Class105 aClass105_11;

	@OriginalMember(owner = "client!aph", name = "ax", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_57;

	@OriginalMember(owner = "client!aph", name = "ad", descriptor = "Lclient!hr;")
	Class105 aClass105_12;

	@OriginalMember(owner = "client!aph", name = "ac", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_58;

	@OriginalMember(owner = "client!aph", name = "aa", descriptor = "I")
	public int anInt2586;

	@OriginalMember(owner = "client!aph", name = "at", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_59;

	@OriginalMember(owner = "client!aph", name = "ah", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_60;

	@OriginalMember(owner = "client!aph", name = "ay", descriptor = "F")
	float aFloat169;

	@OriginalMember(owner = "client!aph", name = "af", descriptor = "I")
	public int anInt2587;

	@OriginalMember(owner = "client!aph", name = "an", descriptor = "I")
	public int anInt2588;

	@OriginalMember(owner = "client!aph", name = "ab", descriptor = "I")
	public int anInt2589;

	@OriginalMember(owner = "client!aph", name = "au", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_61;

	@OriginalMember(owner = "client!aph", name = "av", descriptor = "Lclient!oi;")
	public final Class442 aClass442_55 = new Class442();

	@OriginalMember(owner = "client!aph", name = "ae", descriptor = "Lclient!oi;")
	public final Class442 aClass442_56 = new Class442();

	@OriginalMember(owner = "client!aph", name = "as", descriptor = "[F")
	final float[] aFloatArray60 = new float[4];

	@OriginalMember(owner = "client!aph", name = "am", descriptor = "[F")
	final float[] aFloatArray61 = new float[4];

	@OriginalMember(owner = "client!aph", name = "ak", descriptor = "Lclient!kf;")
	final Class361 aClass361_2;

	@OriginalMember(owner = "client!aph", name = "<init>", descriptor = "(Lclient!aed;Lclient!kf;)V", line = 28)
	public Class122_Sub1_Sub1(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class361 arg1) throws Exception_Sub3 {
		super(arg0);
		this.aClass361_2 = arg1;
		if (this.aClass361_2.method28007() && arg0.method20630()) {
			this.method18559("Waterfall");
		}
	}

	@OriginalMember(owner = "client!aph", name = "f", descriptor = "()Z", line = 37)
	@Override
	boolean method18588() throws Exception_Sub3 {
		this.aClass77_Sub12_Sub1_59 = this.aClass112_10.method9524("WorldMatrix");
		this.aClass77_Sub12_Sub1_58 = this.aClass112_10.method9524("WVPMatrix");
		this.aClass77_Sub12_Sub1_60 = this.aClass112_10.method9524("UGenerationPlane");
		this.aClass77_Sub12_Sub1_56 = this.aClass112_10.method9524("VGenerationPlane");
		this.aClass77_Sub12_Sub1_61 = this.aClass112_10.method9524("Time");
		this.aClass77_Sub12_Sub1_57 = this.aClass112_10.method9524("billowSampler3D");
		if (this.aClass361_2.aBoolean722) {
			this.aClass105_11 = this.aClass112_10.method9458("Waterfall3D");
			this.aClass112_10.method9547(this.aClass105_11);
		} else {
			this.aClass105_12 = this.aClass112_10.method9458("Waterfall2D");
			this.aClass112_10.method9547(this.aClass105_12);
		}
		return true;
	}

	@OriginalMember(owner = "client!aph", name = "ak", descriptor = "()Z", line = 37)
	@Override
	boolean method18589() throws Exception_Sub3 {
		this.aClass77_Sub12_Sub1_59 = this.aClass112_10.method9524("WorldMatrix");
		this.aClass77_Sub12_Sub1_58 = this.aClass112_10.method9524("WVPMatrix");
		this.aClass77_Sub12_Sub1_60 = this.aClass112_10.method9524("UGenerationPlane");
		this.aClass77_Sub12_Sub1_56 = this.aClass112_10.method9524("VGenerationPlane");
		this.aClass77_Sub12_Sub1_61 = this.aClass112_10.method9524("Time");
		this.aClass77_Sub12_Sub1_57 = this.aClass112_10.method9524("billowSampler3D");
		if (this.aClass361_2.aBoolean722) {
			this.aClass105_11 = this.aClass112_10.method9458("Waterfall3D");
			this.aClass112_10.method9547(this.aClass105_11);
		} else {
			this.aClass105_12 = this.aClass112_10.method9458("Waterfall2D");
			this.aClass112_10.method9547(this.aClass105_12);
		}
		return true;
	}

	@OriginalMember(owner = "client!aph", name = "az", descriptor = "(IIB)V", line = 55)
	public void method18532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(28) float local28 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(36) boolean local36 = (arg0 & 0x80) != 0;
		if (local36) {
			this.aFloatArray60[0] = local28;
			this.aFloatArray60[1] = 0.0F;
			this.aFloatArray60[2] = 0.0F;
			this.aFloatArray60[3] = 0.0F;
		} else {
			this.aFloatArray60[0] = 0.0F;
			this.aFloatArray60[1] = 0.0F;
			this.aFloatArray60[2] = local28;
			this.aFloatArray60[3] = 0.0F;
		}
		this.aFloatArray61[0] = 0.0F;
		this.aFloatArray61[1] = local28;
		this.aFloatArray61[2] = 0.0F;
		this.aFloatArray61[3] = (float) this.aClass86_Sub1_30.anInt2845 * local8 % 1.0F;
		if (this.aClass361_2.aBoolean722) {
			this.aFloat169 = (float) ((double) local19 * (double) this.aClass86_Sub1_30.anInt2845 % 1.0D);
		} else {
			@Pc(120) int local120 = (int) (local19 * 16.0F * (float) this.aClass86_Sub1_30.anInt2845);
			this.aClass86_Sub1_30.method20542(this.aClass361_2.anInterface37Array2[local120 % 16]);
		}
	}

	@OriginalMember(owner = "client!aph", name = "bj", descriptor = "(II)V", line = 55)
	public void method18533(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(28) float local28 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(36) boolean local36 = (arg0 & 0x80) != 0;
		if (local36) {
			this.aFloatArray60[0] = local28;
			this.aFloatArray60[1] = 0.0F;
			this.aFloatArray60[2] = 0.0F;
			this.aFloatArray60[3] = 0.0F;
		} else {
			this.aFloatArray60[0] = 0.0F;
			this.aFloatArray60[1] = 0.0F;
			this.aFloatArray60[2] = local28;
			this.aFloatArray60[3] = 0.0F;
		}
		this.aFloatArray61[0] = 0.0F;
		this.aFloatArray61[1] = local28;
		this.aFloatArray61[2] = 0.0F;
		this.aFloatArray61[3] = (float) this.aClass86_Sub1_30.anInt2845 * local8 % 1.0F;
		if (this.aClass361_2.aBoolean722) {
			this.aFloat169 = (float) ((double) local19 * (double) this.aClass86_Sub1_30.anInt2845 % 1.0D);
		} else {
			@Pc(120) int local120 = (int) (local19 * 16.0F * (float) this.aClass86_Sub1_30.anInt2845);
			this.aClass86_Sub1_30.method20542(this.aClass361_2.anInterface37Array2[local120 % 16]);
		}
	}

	@OriginalMember(owner = "client!aph", name = "bv", descriptor = "(II)V", line = 55)
	public void method18534(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(28) float local28 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(36) boolean local36 = (arg0 & 0x80) != 0;
		if (local36) {
			this.aFloatArray60[0] = local28;
			this.aFloatArray60[1] = 0.0F;
			this.aFloatArray60[2] = 0.0F;
			this.aFloatArray60[3] = 0.0F;
		} else {
			this.aFloatArray60[0] = 0.0F;
			this.aFloatArray60[1] = 0.0F;
			this.aFloatArray60[2] = local28;
			this.aFloatArray60[3] = 0.0F;
		}
		this.aFloatArray61[0] = 0.0F;
		this.aFloatArray61[1] = local28;
		this.aFloatArray61[2] = 0.0F;
		this.aFloatArray61[3] = (float) this.aClass86_Sub1_30.anInt2845 * local8 % 1.0F;
		if (this.aClass361_2.aBoolean722) {
			this.aFloat169 = (float) ((double) local19 * (double) this.aClass86_Sub1_30.anInt2845 % 1.0D);
		} else {
			@Pc(120) int local120 = (int) (local19 * 16.0F * (float) this.aClass86_Sub1_30.anInt2845);
			this.aClass86_Sub1_30.method20542(this.aClass361_2.anInterface37Array2[local120 % 16]);
		}
	}

	@OriginalMember(owner = "client!aph", name = "ba", descriptor = "()V", line = 85)
	public void method18535() {
		if (this.aClass361_2.aBoolean722) {
			this.aClass112_10.method9547(this.aClass105_11);
		} else {
			this.aClass112_10.method9547(this.aClass105_12);
		}
		this.aClass112_10.method9545();
		if (this.aClass361_2.aBoolean722) {
			this.aClass112_10.method9503(this.aClass77_Sub12_Sub1_57, 0, this.aClass361_2.anInterface34_1);
		}
		this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_59, this.aClass442_56);
		this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_58, this.aClass442_55);
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_60, new Class450(this.aFloatArray60[0], this.aFloatArray60[1], this.aFloatArray60[2], this.aFloatArray60[3]));
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_56, new Class450(this.aFloatArray61[0], this.aFloatArray61[1], this.aFloatArray61[2], this.aFloatArray61[3]));
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_61, new Class450(this.aFloat169, 0.0F, 0.0F, 0.0F));
		this.aClass86_Sub1_30.method20663(Class384.aClass384_4, this.anInt2587 * 990343747, this.anInt2588 * -1475260219, this.anInt2589 * -1838424893, this.anInt2586 * -481580789);
	}

	@OriginalMember(owner = "client!aph", name = "bc", descriptor = "(I)V", line = 85)
	public void method18536() {
		if (this.aClass361_2.aBoolean722) {
			this.aClass112_10.method9547(this.aClass105_11);
		} else {
			this.aClass112_10.method9547(this.aClass105_12);
		}
		this.aClass112_10.method9545();
		if (this.aClass361_2.aBoolean722) {
			this.aClass112_10.method9503(this.aClass77_Sub12_Sub1_57, 0, this.aClass361_2.anInterface34_1);
		}
		this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_59, this.aClass442_56);
		this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_58, this.aClass442_55);
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_60, new Class450(this.aFloatArray60[0], this.aFloatArray60[1], this.aFloatArray60[2], this.aFloatArray60[3]));
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_56, new Class450(this.aFloatArray61[0], this.aFloatArray61[1], this.aFloatArray61[2], this.aFloatArray61[3]));
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_61, new Class450(this.aFloat169, 0.0F, 0.0F, 0.0F));
		this.aClass86_Sub1_30.method20663(Class384.aClass384_4, this.anInt2587 * 990343747, this.anInt2588 * -1475260219, this.anInt2589 * -1838424893, this.anInt2586 * -481580789);
	}

	@OriginalMember(owner = "client!aph", name = "bl", descriptor = "()V", line = 85)
	public void method18537() {
		if (this.aClass361_2.aBoolean722) {
			this.aClass112_10.method9547(this.aClass105_11);
		} else {
			this.aClass112_10.method9547(this.aClass105_12);
		}
		this.aClass112_10.method9545();
		if (this.aClass361_2.aBoolean722) {
			this.aClass112_10.method9503(this.aClass77_Sub12_Sub1_57, 0, this.aClass361_2.anInterface34_1);
		}
		this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_59, this.aClass442_56);
		this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_58, this.aClass442_55);
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_60, new Class450(this.aFloatArray60[0], this.aFloatArray60[1], this.aFloatArray60[2], this.aFloatArray60[3]));
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_56, new Class450(this.aFloatArray61[0], this.aFloatArray61[1], this.aFloatArray61[2], this.aFloatArray61[3]));
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_61, new Class450(this.aFloat169, 0.0F, 0.0F, 0.0F));
		this.aClass86_Sub1_30.method20663(Class384.aClass384_4, this.anInt2587 * 990343747, this.anInt2588 * -1475260219, this.anInt2589 * -1838424893, this.anInt2586 * -481580789);
	}

	@OriginalMember(owner = "client!aph", name = "kv", descriptor = "(Lclient!yf;B)V", line = 6368)
	static final void method18538(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anInt5784 -= -1204971666;
		@Pc(19) byte[] local19 = null;
		@Pc(21) byte[] local21 = null;
		@Pc(23) int local23;
		for (local23 = 0; local23 < 10 && arg0.anIntArray536[arg0.anInt5784 * 2088438307 + local23] >= 0; local23 += 2) {
		}
		if (local23 > 0) {
			local19 = new byte[local23 / 2];
			local21 = new byte[local23 / 2];
			for (local23 -= 2; local23 >= 0; local23 -= 2) {
				local19[local23 / 2] = (byte) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + local23];
				local21[local23 / 2] = (byte) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + local23 + 1];
			}
		}
		Class631.method32637(local11, local19, local21, arg0);
	}
}
