package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!api")
public class Class122_Sub1_Sub2 extends Class122_Sub1 {

	@OriginalMember(owner = "client!api", name = "as", descriptor = "I")
	public int anInt2599;

	@OriginalMember(owner = "client!api", name = "ar", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_78;

	@OriginalMember(owner = "client!api", name = "aq", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_79;

	@OriginalMember(owner = "client!api", name = "ax", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_80;

	@OriginalMember(owner = "client!api", name = "ay", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_81;

	@OriginalMember(owner = "client!api", name = "bd", descriptor = "I")
	public int anInt2600;

	@OriginalMember(owner = "client!api", name = "bc", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_82;

	@OriginalMember(owner = "client!api", name = "ad", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_83;

	@OriginalMember(owner = "client!api", name = "aw", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_84;

	@OriginalMember(owner = "client!api", name = "aa", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_85;

	@OriginalMember(owner = "client!api", name = "bv", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_86;

	@OriginalMember(owner = "client!api", name = "bb", descriptor = "I")
	public int anInt2601;

	@OriginalMember(owner = "client!api", name = "bl", descriptor = "I")
	public int anInt2602;

	@OriginalMember(owner = "client!api", name = "an", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_87;

	@OriginalMember(owner = "client!api", name = "ae", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_88;

	@OriginalMember(owner = "client!api", name = "by", descriptor = "I")
	public int anInt2603;

	@OriginalMember(owner = "client!api", name = "av", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_89;

	@OriginalMember(owner = "client!api", name = "bi", descriptor = "Lclient!hr;")
	Class105 aClass105_13;

	@OriginalMember(owner = "client!api", name = "ac", descriptor = "Lclient!oi;")
	public final Class442 aClass442_58 = new Class442();

	@OriginalMember(owner = "client!api", name = "at", descriptor = "Lclient!oi;")
	public final Class442 aClass442_59 = new Class442();

	@OriginalMember(owner = "client!api", name = "ah", descriptor = "Lclient!oo;")
	public final Class447 aClass447_57 = new Class447();

	@OriginalMember(owner = "client!api", name = "am", descriptor = "Lclient!or;")
	final Class450 aClass450_13 = new Class450();

	@OriginalMember(owner = "client!api", name = "af", descriptor = "Lclient!or;")
	final Class450 aClass450_12 = new Class450();

	@OriginalMember(owner = "client!api", name = "ab", descriptor = "Lclient!or;")
	final Class450 aClass450_14 = new Class450();

	@OriginalMember(owner = "client!api", name = "ap", descriptor = "Lclient!or;")
	public final Class450 aClass450_15 = new Class450();

	@OriginalMember(owner = "client!api", name = "az", descriptor = "Lclient!oo;")
	public final Class447 aClass447_55 = new Class447();

	@OriginalMember(owner = "client!api", name = "bj", descriptor = "Lclient!or;")
	public final Class450 aClass450_16 = new Class450();

	@OriginalMember(owner = "client!api", name = "ba", descriptor = "Lclient!oo;")
	public final Class447 aClass447_56 = new Class447();

	@OriginalMember(owner = "client!api", name = "bx", descriptor = "F")
	float aFloat170 = 0.0F;

	@OriginalMember(owner = "client!api", name = "au", descriptor = "Lclient!kf;")
	final Class361 aClass361_3;

	@OriginalMember(owner = "client!api", name = "bw", descriptor = "Z")
	boolean aBoolean381;

	@OriginalMember(owner = "client!api", name = "ak", descriptor = "Z")
	final boolean aBoolean380;

	@OriginalMember(owner = "client!api", name = "p", descriptor = "(I)Lclient!rf;", line = 11)
	public static Class125 method18590() {
		try {
			return new Class125_Sub1();
		} catch (@Pc(4) Throwable local4) {
			return new Class125_Sub2();
		}
	}

	@OriginalMember(owner = "client!api", name = "<init>", descriptor = "(Lclient!aed;Lclient!kf;Z)V", line = 48)
	public Class122_Sub1_Sub2(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class361 arg1, @OriginalArg(2) boolean arg2) throws Exception_Sub3 {
		super(arg0);
		new Class442();
		this.aClass361_3 = arg1;
		this.aBoolean381 = arg2;
		if (arg0.method20630() && arg0.method20681()) {
			this.aBoolean380 = this.method18559("EnvMappedWater");
		} else {
			this.aBoolean380 = false;
		}
	}

	@OriginalMember(owner = "client!api", name = "f", descriptor = "()Z", line = 58)
	@Override
	boolean method18588() throws Exception_Sub3 {
		if (!this.aClass361_3.method28008()) {
			return false;
		}
		this.aClass77_Sub12_Sub1_80 = this.aClass112_10.method9524("NormalSampler");
		this.aClass77_Sub12_Sub1_78 = this.aClass112_10.method9524("EnvMapSampler");
		this.aClass77_Sub12_Sub1_83 = this.aClass112_10.method9524("WVPMatrix");
		this.aClass77_Sub12_Sub1_89 = this.aClass112_10.method9524("TexCoordMatrix");
		this.aClass77_Sub12_Sub1_88 = this.aClass112_10.method9524("EyePosAndTime");
		this.aClass77_Sub12_Sub1_79 = this.aClass112_10.method9524("SunDirectionAndExponent");
		this.aClass77_Sub12_Sub1_81 = this.aClass112_10.method9524("SunColourAndWaveExponent");
		this.aClass77_Sub12_Sub1_87 = this.aClass112_10.method9524("WaveIntensityAndBreakWaterDepthAndOffset");
		this.aClass77_Sub12_Sub1_85 = this.aClass112_10.method9524("HeightFogPlane");
		this.aClass77_Sub12_Sub1_84 = this.aClass112_10.method9524("HeightFogColour");
		this.aClass77_Sub12_Sub1_82 = this.aClass112_10.method9524("DistanceFogPlane");
		this.aClass77_Sub12_Sub1_86 = this.aClass112_10.method9524("DistanceFogColour");
		this.aClass105_13 = this.aClass112_10.method9458(this.aBoolean381 ? "EnvMappedSea" : "EnvMappedWater");
		this.aClass112_10.method9547(this.aClass105_13);
		return true;
	}

	@OriginalMember(owner = "client!api", name = "ak", descriptor = "()Z", line = 58)
	@Override
	boolean method18589() throws Exception_Sub3 {
		if (!this.aClass361_3.method28008()) {
			return false;
		}
		this.aClass77_Sub12_Sub1_80 = this.aClass112_10.method9524("NormalSampler");
		this.aClass77_Sub12_Sub1_78 = this.aClass112_10.method9524("EnvMapSampler");
		this.aClass77_Sub12_Sub1_83 = this.aClass112_10.method9524("WVPMatrix");
		this.aClass77_Sub12_Sub1_89 = this.aClass112_10.method9524("TexCoordMatrix");
		this.aClass77_Sub12_Sub1_88 = this.aClass112_10.method9524("EyePosAndTime");
		this.aClass77_Sub12_Sub1_79 = this.aClass112_10.method9524("SunDirectionAndExponent");
		this.aClass77_Sub12_Sub1_81 = this.aClass112_10.method9524("SunColourAndWaveExponent");
		this.aClass77_Sub12_Sub1_87 = this.aClass112_10.method9524("WaveIntensityAndBreakWaterDepthAndOffset");
		this.aClass77_Sub12_Sub1_85 = this.aClass112_10.method9524("HeightFogPlane");
		this.aClass77_Sub12_Sub1_84 = this.aClass112_10.method9524("HeightFogColour");
		this.aClass77_Sub12_Sub1_82 = this.aClass112_10.method9524("DistanceFogPlane");
		this.aClass77_Sub12_Sub1_86 = this.aClass112_10.method9524("DistanceFogColour");
		this.aClass105_13 = this.aClass112_10.method9458(this.aBoolean381 ? "EnvMappedSea" : "EnvMappedWater");
		this.aClass112_10.method9547(this.aClass105_13);
		return true;
	}

	@OriginalMember(owner = "client!api", name = "az", descriptor = "(B)Z", line = 77)
	public boolean method18591() {
		return this.aBoolean380;
	}

	@OriginalMember(owner = "client!api", name = "bv", descriptor = "()Z", line = 77)
	public boolean method18592() {
		return this.aBoolean380;
	}

	@OriginalMember(owner = "client!api", name = "ba", descriptor = "()Z", line = 77)
	public boolean method18593() {
		return this.aBoolean380;
	}

	@OriginalMember(owner = "client!api", name = "bl", descriptor = "()Z", line = 77)
	public boolean method18594() {
		return this.aBoolean380;
	}

	@OriginalMember(owner = "client!api", name = "b", descriptor = "(Lclient!oi;)V", line = 81)
	@Override
	void method18563(@OriginalArg(0) Class442 arg0) {
		@Pc(3) Class442 local3 = new Class442();
		local3.method28979(this.aFloat170, this.aFloat170, 1.0F, 1.0F);
		local3.method28960(arg0, local3);
		super.method18563(local3);
	}

	@OriginalMember(owner = "client!api", name = "ar", descriptor = "(Lclient!oi;)V", line = 81)
	@Override
	void method18564(@OriginalArg(0) Class442 arg0) {
		@Pc(3) Class442 local3 = new Class442();
		local3.method28979(this.aFloat170, this.aFloat170, 1.0F, 1.0F);
		local3.method28960(arg0, local3);
		super.method18563(local3);
	}

	@OriginalMember(owner = "client!api", name = "ac", descriptor = "(Lclient!oi;)V", line = 81)
	@Override
	void method18565(@OriginalArg(0) Class442 arg0) {
		@Pc(3) Class442 local3 = new Class442();
		local3.method28979(this.aFloat170, this.aFloat170, 1.0F, 1.0F);
		local3.method28960(arg0, local3);
		super.method18563(local3);
	}

	@OriginalMember(owner = "client!api", name = "ad", descriptor = "(Lclient!oi;)V", line = 81)
	@Override
	void method18566(@OriginalArg(0) Class442 arg0) {
		@Pc(3) Class442 local3 = new Class442();
		local3.method28979(this.aFloat170, this.aFloat170, 1.0F, 1.0F);
		local3.method28960(arg0, local3);
		super.method18563(local3);
	}

	@OriginalMember(owner = "client!api", name = "h", descriptor = "(Z)V", line = 88)
	@Override
	void method18579(@OriginalArg(0) boolean arg0) {
		@Pc(12) float local12 = (1.0F - Math.abs(this.aClass86_Sub1_30.aFloatArray71[1])) * 2.0F + 1.0F;
		@Pc(16) float local16 = this.aClass86_Sub1_30.aFloat204;
		this.aClass86_Sub1_30.aFloat204 *= local12;
		super.method18579(arg0);
		this.aClass86_Sub1_30.aFloat204 = local16;
	}

	@OriginalMember(owner = "client!api", name = "an", descriptor = "(Z)V", line = 88)
	@Override
	void method18580(@OriginalArg(0) boolean arg0) {
		@Pc(12) float local12 = (1.0F - Math.abs(this.aClass86_Sub1_30.aFloatArray71[1])) * 2.0F + 1.0F;
		@Pc(16) float local16 = this.aClass86_Sub1_30.aFloat204;
		this.aClass86_Sub1_30.aFloat204 *= local12;
		super.method18579(arg0);
		this.aClass86_Sub1_30.aFloat204 = local16;
	}

	@OriginalMember(owner = "client!api", name = "bc", descriptor = "(I)V", line = 96)
	public void method18595() {
		this.method18601();
		this.aClass112_10.method9547(this.aClass105_13);
		this.aClass112_10.method9545();
		this.aClass112_10.method9503(this.aClass77_Sub12_Sub1_80, 0, this.aClass361_3.anInterface34_2);
		this.aClass112_10.method9503(this.aClass77_Sub12_Sub1_78, 1, this.aClass86_Sub1_30.method20458());
		this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_83, this.aClass442_58);
		this.aClass112_10.method9497(this.aClass77_Sub12_Sub1_89, this.aClass442_59);
		@Pc(56) int local56 = 0x1 << (this.anInt2599 * -1710853321 & 0x3);
		this.aClass112_10.method9483(this.aClass77_Sub12_Sub1_88, this.aClass447_57.aFloat277, this.aClass447_57.aFloat276, this.aClass447_57.aFloat278, (float) (local56 * this.aClass86_Sub1_30.anInt2845 % 40000) / 40000.0F);
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_79, this.aClass450_13);
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_81, this.aClass450_12);
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_87, this.aClass450_14);
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_85, this.aClass450_15);
		this.aClass112_10.method9485(this.aClass77_Sub12_Sub1_84, this.aClass447_55);
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_82, this.aClass450_16);
		this.aClass112_10.method9485(this.aClass77_Sub12_Sub1_86, this.aClass447_56);
		this.aClass86_Sub1_30.method20663(Class384.aClass384_4, this.anInt2602 * 214398075, this.anInt2601 * -1784638669, this.anInt2600 * -1562947369, this.anInt2603 * 660205177);
	}

	@OriginalMember(owner = "client!api", name = "bb", descriptor = "()V", line = 96)
	public void method18596() {
		this.method18601();
		this.aClass112_10.method9547(this.aClass105_13);
		this.aClass112_10.method9545();
		this.aClass112_10.method9503(this.aClass77_Sub12_Sub1_80, 0, this.aClass361_3.anInterface34_2);
		this.aClass112_10.method9503(this.aClass77_Sub12_Sub1_78, 1, this.aClass86_Sub1_30.method20458());
		this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_83, this.aClass442_58);
		this.aClass112_10.method9497(this.aClass77_Sub12_Sub1_89, this.aClass442_59);
		@Pc(56) int local56 = 0x1 << (this.anInt2599 * -1710853321 & 0x3);
		this.aClass112_10.method9483(this.aClass77_Sub12_Sub1_88, this.aClass447_57.aFloat277, this.aClass447_57.aFloat276, this.aClass447_57.aFloat278, (float) (local56 * this.aClass86_Sub1_30.anInt2845 % 40000) / 40000.0F);
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_79, this.aClass450_13);
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_81, this.aClass450_12);
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_87, this.aClass450_14);
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_85, this.aClass450_15);
		this.aClass112_10.method9485(this.aClass77_Sub12_Sub1_84, this.aClass447_55);
		this.aClass112_10.method9487(this.aClass77_Sub12_Sub1_82, this.aClass450_16);
		this.aClass112_10.method9485(this.aClass77_Sub12_Sub1_86, this.aClass447_56);
		this.aClass86_Sub1_30.method20663(Class384.aClass384_4, this.anInt2602 * 214398075, this.anInt2601 * -1784638669, this.anInt2600 * -1562947369, this.anInt2603 * 660205177);
	}

	@OriginalMember(owner = "client!api", name = "by", descriptor = "()V", line = 116)
	void method18597() {
		this.aFloat170 = 2.4414062E-4F;
		@Pc(4) short local4 = 256;
		@Pc(6) float local6 = 0.3F;
		@Pc(8) float local8 = 0.4F;
		@Pc(10) float local10 = 0.1F;
		@Pc(12) byte local12 = 5;
		this.aClass442_59.method28979(this.aFloat170, this.aFloat170, this.aFloat170, this.aFloat170);
		this.aClass450_13.method29234(-this.aClass86_Sub1_30.aFloatArray71[0], -this.aClass86_Sub1_30.aFloatArray71[1], -this.aClass86_Sub1_30.aFloatArray71[2], 32.0F);
		this.aClass450_12.method29234(this.aClass86_Sub1_30.aFloat195, this.aClass86_Sub1_30.aFloat209, this.aClass86_Sub1_30.aFloat196, (float) local12);
		this.aClass450_14.method29234(local10, local8, (float) local4, local6);
	}

	@OriginalMember(owner = "client!api", name = "bx", descriptor = "()V", line = 116)
	void method18598() {
		this.aFloat170 = 2.4414062E-4F;
		@Pc(4) short local4 = 256;
		@Pc(6) float local6 = 0.3F;
		@Pc(8) float local8 = 0.4F;
		@Pc(10) float local10 = 0.1F;
		@Pc(12) byte local12 = 5;
		this.aClass442_59.method28979(this.aFloat170, this.aFloat170, this.aFloat170, this.aFloat170);
		this.aClass450_13.method29234(-this.aClass86_Sub1_30.aFloatArray71[0], -this.aClass86_Sub1_30.aFloatArray71[1], -this.aClass86_Sub1_30.aFloatArray71[2], 32.0F);
		this.aClass450_12.method29234(this.aClass86_Sub1_30.aFloat195, this.aClass86_Sub1_30.aFloat209, this.aClass86_Sub1_30.aFloat196, (float) local12);
		this.aClass450_14.method29234(local10, local8, (float) local4, local6);
	}

	@OriginalMember(owner = "client!api", name = "bd", descriptor = "()V", line = 116)
	void method18599() {
		this.aFloat170 = 2.4414062E-4F;
		@Pc(4) short local4 = 256;
		@Pc(6) float local6 = 0.3F;
		@Pc(8) float local8 = 0.4F;
		@Pc(10) float local10 = 0.1F;
		@Pc(12) byte local12 = 5;
		this.aClass442_59.method28979(this.aFloat170, this.aFloat170, this.aFloat170, this.aFloat170);
		this.aClass450_13.method29234(-this.aClass86_Sub1_30.aFloatArray71[0], -this.aClass86_Sub1_30.aFloatArray71[1], -this.aClass86_Sub1_30.aFloatArray71[2], 32.0F);
		this.aClass450_12.method29234(this.aClass86_Sub1_30.aFloat195, this.aClass86_Sub1_30.aFloat209, this.aClass86_Sub1_30.aFloat196, (float) local12);
		this.aClass450_14.method29234(local10, local8, (float) local4, local6);
	}

	@OriginalMember(owner = "client!api", name = "bw", descriptor = "()V", line = 116)
	void method18600() {
		this.aFloat170 = 2.4414062E-4F;
		@Pc(4) short local4 = 256;
		@Pc(6) float local6 = 0.3F;
		@Pc(8) float local8 = 0.4F;
		@Pc(10) float local10 = 0.1F;
		@Pc(12) byte local12 = 5;
		this.aClass442_59.method28979(this.aFloat170, this.aFloat170, this.aFloat170, this.aFloat170);
		this.aClass450_13.method29234(-this.aClass86_Sub1_30.aFloatArray71[0], -this.aClass86_Sub1_30.aFloatArray71[1], -this.aClass86_Sub1_30.aFloatArray71[2], 32.0F);
		this.aClass450_12.method29234(this.aClass86_Sub1_30.aFloat195, this.aClass86_Sub1_30.aFloat209, this.aClass86_Sub1_30.aFloat196, (float) local12);
		this.aClass450_14.method29234(local10, local8, (float) local4, local6);
	}

	@OriginalMember(owner = "client!api", name = "bj", descriptor = "(I)V", line = 116)
	void method18601() {
		this.aFloat170 = 2.4414062E-4F;
		@Pc(4) short local4 = 256;
		@Pc(6) float local6 = 0.3F;
		@Pc(8) float local8 = 0.4F;
		@Pc(10) float local10 = 0.1F;
		@Pc(12) byte local12 = 5;
		this.aClass442_59.method28979(this.aFloat170, this.aFloat170, this.aFloat170, this.aFloat170);
		this.aClass450_13.method29234(-this.aClass86_Sub1_30.aFloatArray71[0], -this.aClass86_Sub1_30.aFloatArray71[1], -this.aClass86_Sub1_30.aFloatArray71[2], 32.0F);
		this.aClass450_12.method29234(this.aClass86_Sub1_30.aFloat195, this.aClass86_Sub1_30.aFloat209, this.aClass86_Sub1_30.aFloat196, (float) local12);
		this.aClass450_14.method29234(local10, local8, (float) local4, local6);
	}

	@OriginalMember(owner = "client!api", name = "bi", descriptor = "()V", line = 116)
	void method18602() {
		this.aFloat170 = 2.4414062E-4F;
		@Pc(4) short local4 = 256;
		@Pc(6) float local6 = 0.3F;
		@Pc(8) float local8 = 0.4F;
		@Pc(10) float local10 = 0.1F;
		@Pc(12) byte local12 = 5;
		this.aClass442_59.method28979(this.aFloat170, this.aFloat170, this.aFloat170, this.aFloat170);
		this.aClass450_13.method29234(-this.aClass86_Sub1_30.aFloatArray71[0], -this.aClass86_Sub1_30.aFloatArray71[1], -this.aClass86_Sub1_30.aFloatArray71[2], 32.0F);
		this.aClass450_12.method29234(this.aClass86_Sub1_30.aFloat195, this.aClass86_Sub1_30.aFloat209, this.aClass86_Sub1_30.aFloat196, (float) local12);
		this.aClass450_14.method29234(local10, local8, (float) local4, local6);
	}
}
