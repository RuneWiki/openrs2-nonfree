package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akg")
public class Class40_Sub1_Sub1 extends Class40_Sub1 {

	@OriginalMember(owner = "client!akg", name = "as", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_56;

	@OriginalMember(owner = "client!akg", name = "aq", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_57;

	@OriginalMember(owner = "client!akg", name = "ax", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_58;

	@OriginalMember(owner = "client!akg", name = "ab", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_59;

	@OriginalMember(owner = "client!akg", name = "al", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_60;

	@OriginalMember(owner = "client!akg", name = "ap", descriptor = "I")
	public int anInt2219;

	@OriginalMember(owner = "client!akg", name = "ay", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_61;

	@OriginalMember(owner = "client!akg", name = "am", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_62;

	@OriginalMember(owner = "client!akg", name = "ai", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_63;

	@OriginalMember(owner = "client!akg", name = "ae", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_64;

	@OriginalMember(owner = "client!akg", name = "bt", descriptor = "I")
	public int anInt2220;

	@OriginalMember(owner = "client!akg", name = "aw", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_65;

	@OriginalMember(owner = "client!akg", name = "bw", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_66;

	@OriginalMember(owner = "client!akg", name = "bf", descriptor = "I")
	public int anInt2221;

	@OriginalMember(owner = "client!akg", name = "bd", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_67;

	@OriginalMember(owner = "client!akg", name = "bm", descriptor = "I")
	public int anInt2222;

	@OriginalMember(owner = "client!akg", name = "bk", descriptor = "I")
	public int anInt2223;

	@OriginalMember(owner = "client!akg", name = "bb", descriptor = "Lclient!fk;")
	Class25 aClass25_11;

	@OriginalMember(owner = "client!akg", name = "av", descriptor = "Lclient!mq;")
	public final Class328 aClass328_55 = new Class328();

	@OriginalMember(owner = "client!akg", name = "az", descriptor = "Lclient!mq;")
	public final Class328 aClass328_56 = new Class328();

	@OriginalMember(owner = "client!akg", name = "ao", descriptor = "Lclient!mh;")
	public final Class320 aClass320_55 = new Class320();

	@OriginalMember(owner = "client!akg", name = "au", descriptor = "Lclient!mv;")
	final Class333 aClass333_15 = new Class333();

	@OriginalMember(owner = "client!akg", name = "ag", descriptor = "Lclient!mv;")
	final Class333 aClass333_16 = new Class333();

	@OriginalMember(owner = "client!akg", name = "ar", descriptor = "Lclient!mv;")
	final Class333 aClass333_12 = new Class333();

	@OriginalMember(owner = "client!akg", name = "ad", descriptor = "Lclient!mv;")
	public final Class333 aClass333_14 = new Class333();

	@OriginalMember(owner = "client!akg", name = "ac", descriptor = "Lclient!mh;")
	public final Class320 aClass320_56 = new Class320();

	@OriginalMember(owner = "client!akg", name = "bp", descriptor = "Lclient!mv;")
	public final Class333 aClass333_13 = new Class333();

	@OriginalMember(owner = "client!akg", name = "bs", descriptor = "Lclient!mh;")
	public final Class320 aClass320_57 = new Class320();

	@OriginalMember(owner = "client!akg", name = "bg", descriptor = "F")
	float aFloat155 = 0.0F;

	@OriginalMember(owner = "client!akg", name = "aj", descriptor = "Lclient!ir;")
	final Class243 aClass243_2;

	@OriginalMember(owner = "client!akg", name = "br", descriptor = "Z")
	boolean aBoolean361;

	@OriginalMember(owner = "client!akg", name = "an", descriptor = "Z")
	final boolean aBoolean360;

	@OriginalMember(owner = "client!akg", name = "<init>", descriptor = "(Lclient!abv;Lclient!ir;Z)V", line = 48)
	public Class40_Sub1_Sub1(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class243 arg1, @OriginalArg(2) boolean arg2) throws Exception_Sub1 {
		super(arg0);
		new Class328();
		this.aClass243_2 = arg1;
		this.aBoolean361 = arg2;
		if (arg0.method17432() && arg0.method17433()) {
			this.aBoolean360 = this.method16967("EnvMappedWater");
		} else {
			this.aBoolean360 = false;
		}
	}

	@OriginalMember(owner = "client!akg", name = "as", descriptor = "()Z", line = 58)
	@Override
	boolean method16982() throws Exception_Sub1 {
		if (!this.aClass243_2.method24755()) {
			return false;
		}
		this.aClass3_Sub19_Sub1_56 = this.aClass24_10.method6583("NormalSampler");
		this.aClass3_Sub19_Sub1_63 = this.aClass24_10.method6583("EnvMapSampler");
		this.aClass3_Sub19_Sub1_57 = this.aClass24_10.method6583("WVPMatrix");
		this.aClass3_Sub19_Sub1_58 = this.aClass24_10.method6583("TexCoordMatrix");
		this.aClass3_Sub19_Sub1_60 = this.aClass24_10.method6583("EyePosAndTime");
		this.aClass3_Sub19_Sub1_59 = this.aClass24_10.method6583("SunDirectionAndExponent");
		this.aClass3_Sub19_Sub1_61 = this.aClass24_10.method6583("SunColourAndWaveExponent");
		this.aClass3_Sub19_Sub1_62 = this.aClass24_10.method6583("WaveIntensityAndBreakWaterDepthAndOffset");
		this.aClass3_Sub19_Sub1_64 = this.aClass24_10.method6583("HeightFogPlane");
		this.aClass3_Sub19_Sub1_65 = this.aClass24_10.method6583("HeightFogColour");
		this.aClass3_Sub19_Sub1_66 = this.aClass24_10.method6583("DistanceFogPlane");
		this.aClass3_Sub19_Sub1_67 = this.aClass24_10.method6583("DistanceFogColour");
		this.aClass25_11 = this.aClass24_10.method6555(this.aBoolean361 ? "EnvMappedSea" : "EnvMappedWater");
		this.aClass24_10.method6560(this.aClass25_11);
		return true;
	}

	@OriginalMember(owner = "client!akg", name = "o", descriptor = "()Z", line = 58)
	@Override
	boolean method16988() throws Exception_Sub1 {
		if (!this.aClass243_2.method24755()) {
			return false;
		}
		this.aClass3_Sub19_Sub1_56 = this.aClass24_10.method6583("NormalSampler");
		this.aClass3_Sub19_Sub1_63 = this.aClass24_10.method6583("EnvMapSampler");
		this.aClass3_Sub19_Sub1_57 = this.aClass24_10.method6583("WVPMatrix");
		this.aClass3_Sub19_Sub1_58 = this.aClass24_10.method6583("TexCoordMatrix");
		this.aClass3_Sub19_Sub1_60 = this.aClass24_10.method6583("EyePosAndTime");
		this.aClass3_Sub19_Sub1_59 = this.aClass24_10.method6583("SunDirectionAndExponent");
		this.aClass3_Sub19_Sub1_61 = this.aClass24_10.method6583("SunColourAndWaveExponent");
		this.aClass3_Sub19_Sub1_62 = this.aClass24_10.method6583("WaveIntensityAndBreakWaterDepthAndOffset");
		this.aClass3_Sub19_Sub1_64 = this.aClass24_10.method6583("HeightFogPlane");
		this.aClass3_Sub19_Sub1_65 = this.aClass24_10.method6583("HeightFogColour");
		this.aClass3_Sub19_Sub1_66 = this.aClass24_10.method6583("DistanceFogPlane");
		this.aClass3_Sub19_Sub1_67 = this.aClass24_10.method6583("DistanceFogColour");
		this.aClass25_11 = this.aClass24_10.method6555(this.aBoolean361 ? "EnvMappedSea" : "EnvMappedWater");
		this.aClass24_10.method6560(this.aClass25_11);
		return true;
	}

	@OriginalMember(owner = "client!akg", name = "bf", descriptor = "(B)Z", line = 77)
	public boolean method15206() {
		return this.aBoolean360;
	}

	@OriginalMember(owner = "client!akg", name = "f", descriptor = "(Lclient!mq;)V", line = 81)
	@Override
	void method16968(@OriginalArg(0) Class328 arg0) {
		@Pc(3) Class328 local3 = new Class328();
		local3.method26050(this.aFloat155, this.aFloat155, 1.0F, 1.0F);
		local3.method26045(arg0, local3);
		super.method16968(local3);
	}

	@OriginalMember(owner = "client!akg", name = "aq", descriptor = "(Lclient!mq;)V", line = 81)
	@Override
	void method16980(@OriginalArg(0) Class328 arg0) {
		@Pc(3) Class328 local3 = new Class328();
		local3.method26050(this.aFloat155, this.aFloat155, 1.0F, 1.0F);
		local3.method26045(arg0, local3);
		super.method16968(local3);
	}

	@OriginalMember(owner = "client!akg", name = "av", descriptor = "(Lclient!mq;)V", line = 81)
	@Override
	void method16981(@OriginalArg(0) Class328 arg0) {
		@Pc(3) Class328 local3 = new Class328();
		local3.method26050(this.aFloat155, this.aFloat155, 1.0F, 1.0F);
		local3.method26045(arg0, local3);
		super.method16968(local3);
	}

	@OriginalMember(owner = "client!akg", name = "ax", descriptor = "(Lclient!mq;)V", line = 81)
	@Override
	void method16971(@OriginalArg(0) Class328 arg0) {
		@Pc(3) Class328 local3 = new Class328();
		local3.method26050(this.aFloat155, this.aFloat155, 1.0F, 1.0F);
		local3.method26045(arg0, local3);
		super.method16968(local3);
	}

	@OriginalMember(owner = "client!akg", name = "ak", descriptor = "(Z)V", line = 88)
	@Override
	void method16970(@OriginalArg(0) boolean arg0) {
		@Pc(12) float local12 = (1.0F - Math.abs(this.aClass21_Sub3_30.aFloatArray76[1])) * 2.0F + 1.0F;
		@Pc(16) float local16 = this.aClass21_Sub3_30.aFloat195;
		this.aClass21_Sub3_30.aFloat195 *= local12;
		super.method16970(arg0);
		this.aClass21_Sub3_30.aFloat195 = local16;
	}

	@OriginalMember(owner = "client!akg", name = "ag", descriptor = "(Z)V", line = 88)
	@Override
	void method16990(@OriginalArg(0) boolean arg0) {
		@Pc(12) float local12 = (1.0F - Math.abs(this.aClass21_Sub3_30.aFloatArray76[1])) * 2.0F + 1.0F;
		@Pc(16) float local16 = this.aClass21_Sub3_30.aFloat195;
		this.aClass21_Sub3_30.aFloat195 *= local12;
		super.method16970(arg0);
		this.aClass21_Sub3_30.aFloat195 = local16;
	}

	@OriginalMember(owner = "client!akg", name = "au", descriptor = "(Z)V", line = 88)
	@Override
	void method16996(@OriginalArg(0) boolean arg0) {
		@Pc(12) float local12 = (1.0F - Math.abs(this.aClass21_Sub3_30.aFloatArray76[1])) * 2.0F + 1.0F;
		@Pc(16) float local16 = this.aClass21_Sub3_30.aFloat195;
		this.aClass21_Sub3_30.aFloat195 *= local12;
		super.method16970(arg0);
		this.aClass21_Sub3_30.aFloat195 = local16;
	}

	@OriginalMember(owner = "client!akg", name = "ay", descriptor = "(Z)V", line = 88)
	@Override
	void method16989(@OriginalArg(0) boolean arg0) {
		@Pc(12) float local12 = (1.0F - Math.abs(this.aClass21_Sub3_30.aFloatArray76[1])) * 2.0F + 1.0F;
		@Pc(16) float local16 = this.aClass21_Sub3_30.aFloat195;
		this.aClass21_Sub3_30.aFloat195 *= local12;
		super.method16970(arg0);
		this.aClass21_Sub3_30.aFloat195 = local16;
	}

	@OriginalMember(owner = "client!akg", name = "am", descriptor = "(Z)V", line = 88)
	@Override
	void method16991(@OriginalArg(0) boolean arg0) {
		@Pc(12) float local12 = (1.0F - Math.abs(this.aClass21_Sub3_30.aFloatArray76[1])) * 2.0F + 1.0F;
		@Pc(16) float local16 = this.aClass21_Sub3_30.aFloat195;
		this.aClass21_Sub3_30.aFloat195 *= local12;
		super.method16970(arg0);
		this.aClass21_Sub3_30.aFloat195 = local16;
	}

	@OriginalMember(owner = "client!akg", name = "bt", descriptor = "(B)V", line = 96)
	public void method15207() {
		this.method15208();
		this.aClass24_10.method6560(this.aClass25_11);
		this.aClass24_10.method6550();
		this.aClass24_10.method6622(this.aClass3_Sub19_Sub1_56, 0, this.aClass243_2.anInterface23_3);
		this.aClass24_10.method6622(this.aClass3_Sub19_Sub1_63, 1, this.aClass21_Sub3_30.method17764());
		this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_57, this.aClass328_55);
		this.aClass24_10.method6572(this.aClass3_Sub19_Sub1_58, this.aClass328_56);
		@Pc(56) int local56 = 0x1 << (this.anInt2219 * 1277945389 & 0x3);
		this.aClass24_10.method6567(this.aClass3_Sub19_Sub1_60, this.aClass320_55.aFloat259, this.aClass320_55.aFloat260, this.aClass320_55.aFloat261, (float) (local56 * this.aClass21_Sub3_30.anInt2487 % 40000) / 40000.0F);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_59, this.aClass333_15);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_61, this.aClass333_16);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_62, this.aClass333_12);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_64, this.aClass333_14);
		this.aClass24_10.method6570(this.aClass3_Sub19_Sub1_65, this.aClass320_56);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_66, this.aClass333_13);
		this.aClass24_10.method6570(this.aClass3_Sub19_Sub1_67, this.aClass320_57);
		this.aClass21_Sub3_30.method17555(Class263.aClass263_4, this.anInt2222 * 1230704295, this.anInt2221 * 1044809981, this.anInt2220 * 95448263, this.anInt2223 * -880775245);
	}

	@OriginalMember(owner = "client!akg", name = "bg", descriptor = "()V", line = 96)
	public void method15209() {
		this.method15208();
		this.aClass24_10.method6560(this.aClass25_11);
		this.aClass24_10.method6550();
		this.aClass24_10.method6622(this.aClass3_Sub19_Sub1_56, 0, this.aClass243_2.anInterface23_3);
		this.aClass24_10.method6622(this.aClass3_Sub19_Sub1_63, 1, this.aClass21_Sub3_30.method17764());
		this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_57, this.aClass328_55);
		this.aClass24_10.method6572(this.aClass3_Sub19_Sub1_58, this.aClass328_56);
		@Pc(56) int local56 = 0x1 << (this.anInt2219 * 1277945389 & 0x3);
		this.aClass24_10.method6567(this.aClass3_Sub19_Sub1_60, this.aClass320_55.aFloat259, this.aClass320_55.aFloat260, this.aClass320_55.aFloat261, (float) (local56 * this.aClass21_Sub3_30.anInt2487 % 40000) / 40000.0F);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_59, this.aClass333_15);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_61, this.aClass333_16);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_62, this.aClass333_12);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_64, this.aClass333_14);
		this.aClass24_10.method6570(this.aClass3_Sub19_Sub1_65, this.aClass320_56);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_66, this.aClass333_13);
		this.aClass24_10.method6570(this.aClass3_Sub19_Sub1_67, this.aClass320_57);
		this.aClass21_Sub3_30.method17555(Class263.aClass263_4, this.anInt2222 * 1230704295, this.anInt2221 * 1044809981, this.anInt2220 * 95448263, this.anInt2223 * -880775245);
	}

	@OriginalMember(owner = "client!akg", name = "br", descriptor = "()V", line = 96)
	public void method15211() {
		this.method15208();
		this.aClass24_10.method6560(this.aClass25_11);
		this.aClass24_10.method6550();
		this.aClass24_10.method6622(this.aClass3_Sub19_Sub1_56, 0, this.aClass243_2.anInterface23_3);
		this.aClass24_10.method6622(this.aClass3_Sub19_Sub1_63, 1, this.aClass21_Sub3_30.method17764());
		this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_57, this.aClass328_55);
		this.aClass24_10.method6572(this.aClass3_Sub19_Sub1_58, this.aClass328_56);
		@Pc(56) int local56 = 0x1 << (this.anInt2219 * 1277945389 & 0x3);
		this.aClass24_10.method6567(this.aClass3_Sub19_Sub1_60, this.aClass320_55.aFloat259, this.aClass320_55.aFloat260, this.aClass320_55.aFloat261, (float) (local56 * this.aClass21_Sub3_30.anInt2487 % 40000) / 40000.0F);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_59, this.aClass333_15);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_61, this.aClass333_16);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_62, this.aClass333_12);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_64, this.aClass333_14);
		this.aClass24_10.method6570(this.aClass3_Sub19_Sub1_65, this.aClass320_56);
		this.aClass24_10.method6659(this.aClass3_Sub19_Sub1_66, this.aClass333_13);
		this.aClass24_10.method6570(this.aClass3_Sub19_Sub1_67, this.aClass320_57);
		this.aClass21_Sub3_30.method17555(Class263.aClass263_4, this.anInt2222 * 1230704295, this.anInt2221 * 1044809981, this.anInt2220 * 95448263, this.anInt2223 * -880775245);
	}

	@OriginalMember(owner = "client!akg", name = "bk", descriptor = "(B)V", line = 116)
	void method15208() {
		this.aFloat155 = 2.4414062E-4F;
		@Pc(4) short local4 = 256;
		@Pc(6) float local6 = 0.3F;
		@Pc(8) float local8 = 0.4F;
		@Pc(10) float local10 = 0.1F;
		@Pc(12) byte local12 = 5;
		this.aClass328_56.method26050(this.aFloat155, this.aFloat155, this.aFloat155, this.aFloat155);
		this.aClass333_15.method26251(-this.aClass21_Sub3_30.aFloatArray76[0], -this.aClass21_Sub3_30.aFloatArray76[1], -this.aClass21_Sub3_30.aFloatArray76[2], 32.0F);
		this.aClass333_16.method26251(this.aClass21_Sub3_30.aFloat193, this.aClass21_Sub3_30.aFloat194, this.aClass21_Sub3_30.aFloat185, (float) local12);
		this.aClass333_12.method26251(local10, local8, (float) local4, local6);
	}

	@OriginalMember(owner = "client!akg", name = "by", descriptor = "()V", line = 116)
	void method15210() {
		this.aFloat155 = 2.4414062E-4F;
		@Pc(4) short local4 = 256;
		@Pc(6) float local6 = 0.3F;
		@Pc(8) float local8 = 0.4F;
		@Pc(10) float local10 = 0.1F;
		@Pc(12) byte local12 = 5;
		this.aClass328_56.method26050(this.aFloat155, this.aFloat155, this.aFloat155, this.aFloat155);
		this.aClass333_15.method26251(-this.aClass21_Sub3_30.aFloatArray76[0], -this.aClass21_Sub3_30.aFloatArray76[1], -this.aClass21_Sub3_30.aFloatArray76[2], 32.0F);
		this.aClass333_16.method26251(this.aClass21_Sub3_30.aFloat193, this.aClass21_Sub3_30.aFloat194, this.aClass21_Sub3_30.aFloat185, (float) local12);
		this.aClass333_12.method26251(local10, local8, (float) local4, local6);
	}

	@OriginalMember(owner = "client!akg", name = "bb", descriptor = "()V", line = 116)
	void method15212() {
		this.aFloat155 = 2.4414062E-4F;
		@Pc(4) short local4 = 256;
		@Pc(6) float local6 = 0.3F;
		@Pc(8) float local8 = 0.4F;
		@Pc(10) float local10 = 0.1F;
		@Pc(12) byte local12 = 5;
		this.aClass328_56.method26050(this.aFloat155, this.aFloat155, this.aFloat155, this.aFloat155);
		this.aClass333_15.method26251(-this.aClass21_Sub3_30.aFloatArray76[0], -this.aClass21_Sub3_30.aFloatArray76[1], -this.aClass21_Sub3_30.aFloatArray76[2], 32.0F);
		this.aClass333_16.method26251(this.aClass21_Sub3_30.aFloat193, this.aClass21_Sub3_30.aFloat194, this.aClass21_Sub3_30.aFloat185, (float) local12);
		this.aClass333_12.method26251(local10, local8, (float) local4, local6);
	}

	@OriginalMember(owner = "client!akg", name = "we", descriptor = "(Lclient!vs;I)V", line = 8023)
	static final void method15213(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aBoolean566 ? 1 : 0;
	}
}
