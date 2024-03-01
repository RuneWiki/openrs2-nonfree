package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqe")
public class Class128_Sub1_Sub1 extends Class128_Sub1 {

	@OriginalMember(owner = "client!aqe", name = "bc", descriptor = "I")
	public int anInt2746;

	@OriginalMember(owner = "client!aqe", name = "as", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_56;

	@OriginalMember(owner = "client!aqe", name = "at", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_57;

	@OriginalMember(owner = "client!aqe", name = "ad", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_58;

	@OriginalMember(owner = "client!aqe", name = "au", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_59;

	@OriginalMember(owner = "client!aqe", name = "bq", descriptor = "Lclient!hi;")
	Class116 aClass116_11;

	@OriginalMember(owner = "client!aqe", name = "aj", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_60;

	@OriginalMember(owner = "client!aqe", name = "ab", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_61;

	@OriginalMember(owner = "client!aqe", name = "aa", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_62;

	@OriginalMember(owner = "client!aqe", name = "ak", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_63;

	@OriginalMember(owner = "client!aqe", name = "ap", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_64;

	@OriginalMember(owner = "client!aqe", name = "av", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_65;

	@OriginalMember(owner = "client!aqe", name = "bx", descriptor = "I")
	public int anInt2747;

	@OriginalMember(owner = "client!aqe", name = "bd", descriptor = "I")
	public int anInt2748;

	@OriginalMember(owner = "client!aqe", name = "ax", descriptor = "I")
	public int anInt2749;

	@OriginalMember(owner = "client!aqe", name = "bi", descriptor = "I")
	public int anInt2750;

	@OriginalMember(owner = "client!aqe", name = "bk", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_66;

	@OriginalMember(owner = "client!aqe", name = "bf", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_67;

	@OriginalMember(owner = "client!aqe", name = "am", descriptor = "Lclient!pq;")
	public final Class489 aClass489_71 = new Class489();

	@OriginalMember(owner = "client!aqe", name = "ar", descriptor = "Lclient!pq;")
	public final Class489 aClass489_70 = new Class489();

	@OriginalMember(owner = "client!aqe", name = "aq", descriptor = "Lclient!ox;")
	public final Class472 aClass472_56 = new Class472();

	@OriginalMember(owner = "client!aqe", name = "ao", descriptor = "Lclient!og;")
	final Class460 aClass460_13 = new Class460();

	@OriginalMember(owner = "client!aqe", name = "ay", descriptor = "Lclient!og;")
	final Class460 aClass460_14 = new Class460();

	@OriginalMember(owner = "client!aqe", name = "az", descriptor = "Lclient!og;")
	final Class460 aClass460_15 = new Class460();

	@OriginalMember(owner = "client!aqe", name = "af", descriptor = "Lclient!og;")
	public final Class460 aClass460_16 = new Class460();

	@OriginalMember(owner = "client!aqe", name = "an", descriptor = "Lclient!ox;")
	public final Class472 aClass472_57 = new Class472();

	@OriginalMember(owner = "client!aqe", name = "bl", descriptor = "Lclient!og;")
	public final Class460 aClass460_12 = new Class460();

	@OriginalMember(owner = "client!aqe", name = "bh", descriptor = "Lclient!ox;")
	public final Class472 aClass472_58 = new Class472();

	@OriginalMember(owner = "client!aqe", name = "bn", descriptor = "F")
	float aFloat185 = 0.0F;

	@OriginalMember(owner = "client!aqe", name = "aw", descriptor = "Lclient!lp;")
	final Class402 aClass402_3;

	@OriginalMember(owner = "client!aqe", name = "bt", descriptor = "Z")
	boolean aBoolean443;

	@OriginalMember(owner = "client!aqe", name = "ai", descriptor = "Z")
	final boolean aBoolean442;

	@OriginalMember(owner = "client!aqe", name = "<init>", descriptor = "(Lclient!afc;Lclient!lp;Z)V", line = 48)
	public Class128_Sub1_Sub1(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class402 arg1, @OriginalArg(2) boolean arg2) throws Exception_Sub2 {
		super(arg0);
		new Class489();
		this.aClass402_3 = arg1;
		this.aBoolean443 = arg2;
		if (arg0.method20885() && arg0.method20886()) {
			this.aBoolean442 = this.method21362("EnvMappedWater");
		} else {
			this.aBoolean442 = false;
		}
	}

	@OriginalMember(owner = "client!aqe", name = "aw", descriptor = "()Z", line = 58)
	@Override
	boolean method21365() throws Exception_Sub2 {
		if (!this.aClass402_3.method28510()) {
			return false;
		}
		this.aClass93_Sub33_Sub1_56 = this.aClass115_10.method8198("NormalSampler");
		this.aClass93_Sub33_Sub1_57 = this.aClass115_10.method8198("EnvMapSampler");
		this.aClass93_Sub33_Sub1_58 = this.aClass115_10.method8198("WVPMatrix");
		this.aClass93_Sub33_Sub1_59 = this.aClass115_10.method8198("TexCoordMatrix");
		this.aClass93_Sub33_Sub1_64 = this.aClass115_10.method8198("EyePosAndTime");
		this.aClass93_Sub33_Sub1_65 = this.aClass115_10.method8198("SunDirectionAndExponent");
		this.aClass93_Sub33_Sub1_60 = this.aClass115_10.method8198("SunColourAndWaveExponent");
		this.aClass93_Sub33_Sub1_61 = this.aClass115_10.method8198("WaveIntensityAndBreakWaterDepthAndOffset");
		this.aClass93_Sub33_Sub1_62 = this.aClass115_10.method8198("HeightFogPlane");
		this.aClass93_Sub33_Sub1_63 = this.aClass115_10.method8198("HeightFogColour");
		this.aClass93_Sub33_Sub1_67 = this.aClass115_10.method8198("DistanceFogPlane");
		this.aClass93_Sub33_Sub1_66 = this.aClass115_10.method8198("DistanceFogColour");
		this.aClass116_11 = this.aClass115_10.method8268(this.aBoolean443 ? "EnvMappedSea" : "EnvMappedWater");
		this.aClass115_10.method8203(this.aClass116_11);
		return true;
	}

	@OriginalMember(owner = "client!aqe", name = "a", descriptor = "()Z", line = 58)
	@Override
	boolean method21363() throws Exception_Sub2 {
		if (!this.aClass402_3.method28510()) {
			return false;
		}
		this.aClass93_Sub33_Sub1_56 = this.aClass115_10.method8198("NormalSampler");
		this.aClass93_Sub33_Sub1_57 = this.aClass115_10.method8198("EnvMapSampler");
		this.aClass93_Sub33_Sub1_58 = this.aClass115_10.method8198("WVPMatrix");
		this.aClass93_Sub33_Sub1_59 = this.aClass115_10.method8198("TexCoordMatrix");
		this.aClass93_Sub33_Sub1_64 = this.aClass115_10.method8198("EyePosAndTime");
		this.aClass93_Sub33_Sub1_65 = this.aClass115_10.method8198("SunDirectionAndExponent");
		this.aClass93_Sub33_Sub1_60 = this.aClass115_10.method8198("SunColourAndWaveExponent");
		this.aClass93_Sub33_Sub1_61 = this.aClass115_10.method8198("WaveIntensityAndBreakWaterDepthAndOffset");
		this.aClass93_Sub33_Sub1_62 = this.aClass115_10.method8198("HeightFogPlane");
		this.aClass93_Sub33_Sub1_63 = this.aClass115_10.method8198("HeightFogColour");
		this.aClass93_Sub33_Sub1_67 = this.aClass115_10.method8198("DistanceFogPlane");
		this.aClass93_Sub33_Sub1_66 = this.aClass115_10.method8198("DistanceFogColour");
		this.aClass116_11 = this.aClass115_10.method8268(this.aBoolean443 ? "EnvMappedSea" : "EnvMappedWater");
		this.aClass115_10.method8203(this.aClass116_11);
		return true;
	}

	@OriginalMember(owner = "client!aqe", name = "ai", descriptor = "()Z", line = 58)
	@Override
	boolean method21376() throws Exception_Sub2 {
		if (!this.aClass402_3.method28510()) {
			return false;
		}
		this.aClass93_Sub33_Sub1_56 = this.aClass115_10.method8198("NormalSampler");
		this.aClass93_Sub33_Sub1_57 = this.aClass115_10.method8198("EnvMapSampler");
		this.aClass93_Sub33_Sub1_58 = this.aClass115_10.method8198("WVPMatrix");
		this.aClass93_Sub33_Sub1_59 = this.aClass115_10.method8198("TexCoordMatrix");
		this.aClass93_Sub33_Sub1_64 = this.aClass115_10.method8198("EyePosAndTime");
		this.aClass93_Sub33_Sub1_65 = this.aClass115_10.method8198("SunDirectionAndExponent");
		this.aClass93_Sub33_Sub1_60 = this.aClass115_10.method8198("SunColourAndWaveExponent");
		this.aClass93_Sub33_Sub1_61 = this.aClass115_10.method8198("WaveIntensityAndBreakWaterDepthAndOffset");
		this.aClass93_Sub33_Sub1_62 = this.aClass115_10.method8198("HeightFogPlane");
		this.aClass93_Sub33_Sub1_63 = this.aClass115_10.method8198("HeightFogColour");
		this.aClass93_Sub33_Sub1_67 = this.aClass115_10.method8198("DistanceFogPlane");
		this.aClass93_Sub33_Sub1_66 = this.aClass115_10.method8198("DistanceFogColour");
		this.aClass116_11 = this.aClass115_10.method8268(this.aBoolean443 ? "EnvMappedSea" : "EnvMappedWater");
		this.aClass115_10.method8203(this.aClass116_11);
		return true;
	}

	@OriginalMember(owner = "client!aqe", name = "bf", descriptor = "(I)Z", line = 77)
	public boolean method19642() {
		return this.aBoolean442;
	}

	@OriginalMember(owner = "client!aqe", name = "bh", descriptor = "()Z", line = 77)
	public boolean method19645() {
		return this.aBoolean442;
	}

	@OriginalMember(owner = "client!aqe", name = "i", descriptor = "(Lclient!pq;)V", line = 81)
	@Override
	void method21366(@OriginalArg(0) Class489 arg0) {
		@Pc(3) Class489 local3 = new Class489();
		local3.method29845(this.aFloat185, this.aFloat185, 1.0F, 1.0F);
		local3.method29839(arg0, local3);
		super.method21366(local3);
	}

	@OriginalMember(owner = "client!aqe", name = "am", descriptor = "(Lclient!pq;)V", line = 81)
	@Override
	void method21379(@OriginalArg(0) Class489 arg0) {
		@Pc(3) Class489 local3 = new Class489();
		local3.method29845(this.aFloat185, this.aFloat185, 1.0F, 1.0F);
		local3.method29839(arg0, local3);
		super.method21366(local3);
	}

	@OriginalMember(owner = "client!aqe", name = "ad", descriptor = "(Lclient!pq;)V", line = 81)
	@Override
	void method21364(@OriginalArg(0) Class489 arg0) {
		@Pc(3) Class489 local3 = new Class489();
		local3.method29845(this.aFloat185, this.aFloat185, 1.0F, 1.0F);
		local3.method29839(arg0, local3);
		super.method21366(local3);
	}

	@OriginalMember(owner = "client!aqe", name = "aj", descriptor = "(Z)V", line = 88)
	@Override
	void method21387(@OriginalArg(0) boolean arg0) {
		@Pc(12) float local12 = (1.0F - Math.abs(this.aClass104_Sub2_31.aFloatArray63[1])) * 2.0F + 1.0F;
		@Pc(16) float local16 = this.aClass104_Sub2_31.aFloat212;
		this.aClass104_Sub2_31.aFloat212 *= local12;
		super.method21370(arg0);
		this.aClass104_Sub2_31.aFloat212 = local16;
	}

	@OriginalMember(owner = "client!aqe", name = "ao", descriptor = "(Z)V", line = 88)
	@Override
	void method21386(@OriginalArg(0) boolean arg0) {
		@Pc(12) float local12 = (1.0F - Math.abs(this.aClass104_Sub2_31.aFloatArray63[1])) * 2.0F + 1.0F;
		@Pc(16) float local16 = this.aClass104_Sub2_31.aFloat212;
		this.aClass104_Sub2_31.aFloat212 *= local12;
		super.method21370(arg0);
		this.aClass104_Sub2_31.aFloat212 = local16;
	}

	@OriginalMember(owner = "client!aqe", name = "ag", descriptor = "(Z)V", line = 88)
	@Override
	void method21370(@OriginalArg(0) boolean arg0) {
		@Pc(12) float local12 = (1.0F - Math.abs(this.aClass104_Sub2_31.aFloatArray63[1])) * 2.0F + 1.0F;
		@Pc(16) float local16 = this.aClass104_Sub2_31.aFloat212;
		this.aClass104_Sub2_31.aFloat212 *= local12;
		super.method21370(arg0);
		this.aClass104_Sub2_31.aFloat212 = local16;
	}

	@OriginalMember(owner = "client!aqe", name = "bl", descriptor = "(B)V", line = 96)
	public void method19643() {
		this.method19641();
		this.aClass115_10.method8203(this.aClass116_11);
		this.aClass115_10.method8285();
		this.aClass115_10.method8293(this.aClass93_Sub33_Sub1_56, 0, this.aClass402_3.anInterface35_1);
		this.aClass115_10.method8293(this.aClass93_Sub33_Sub1_57, 1, this.aClass104_Sub2_31.method20922());
		this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_58, this.aClass489_71);
		this.aClass115_10.method8242(this.aClass93_Sub33_Sub1_59, this.aClass489_70);
		@Pc(56) int local56 = 0x1 << (this.anInt2749 * -1488069863 & 0x3);
		this.aClass115_10.method8210(this.aClass93_Sub33_Sub1_64, this.aClass472_56.aFloat317, this.aClass472_56.aFloat318, this.aClass472_56.aFloat319, (float) (local56 * this.aClass104_Sub2_31.anInt2952 % 40000) / 40000.0F);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_65, this.aClass460_13);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_60, this.aClass460_14);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_61, this.aClass460_15);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_62, this.aClass460_16);
		this.aClass115_10.method8287(this.aClass93_Sub33_Sub1_63, this.aClass472_57);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_67, this.aClass460_12);
		this.aClass115_10.method8287(this.aClass93_Sub33_Sub1_66, this.aClass472_58);
		this.aClass104_Sub2_31.method21007(Class424.aClass424_3, this.anInt2747 * -1457321687, this.anInt2748 * 1710096453, this.anInt2746 * 530089739, this.anInt2750 * -2008175839);
	}

	@OriginalMember(owner = "client!aqe", name = "bx", descriptor = "()V", line = 96)
	public void method19644() {
		this.method19641();
		this.aClass115_10.method8203(this.aClass116_11);
		this.aClass115_10.method8285();
		this.aClass115_10.method8293(this.aClass93_Sub33_Sub1_56, 0, this.aClass402_3.anInterface35_1);
		this.aClass115_10.method8293(this.aClass93_Sub33_Sub1_57, 1, this.aClass104_Sub2_31.method20922());
		this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_58, this.aClass489_71);
		this.aClass115_10.method8242(this.aClass93_Sub33_Sub1_59, this.aClass489_70);
		@Pc(56) int local56 = 0x1 << (this.anInt2749 * -1488069863 & 0x3);
		this.aClass115_10.method8210(this.aClass93_Sub33_Sub1_64, this.aClass472_56.aFloat317, this.aClass472_56.aFloat318, this.aClass472_56.aFloat319, (float) (local56 * this.aClass104_Sub2_31.anInt2952 % 40000) / 40000.0F);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_65, this.aClass460_13);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_60, this.aClass460_14);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_61, this.aClass460_15);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_62, this.aClass460_16);
		this.aClass115_10.method8287(this.aClass93_Sub33_Sub1_63, this.aClass472_57);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_67, this.aClass460_12);
		this.aClass115_10.method8287(this.aClass93_Sub33_Sub1_66, this.aClass472_58);
		this.aClass104_Sub2_31.method21007(Class424.aClass424_3, this.anInt2747 * -1457321687, this.anInt2748 * 1710096453, this.anInt2746 * 530089739, this.anInt2750 * -2008175839);
	}

	@OriginalMember(owner = "client!aqe", name = "bd", descriptor = "()V", line = 96)
	public void method19646() {
		this.method19641();
		this.aClass115_10.method8203(this.aClass116_11);
		this.aClass115_10.method8285();
		this.aClass115_10.method8293(this.aClass93_Sub33_Sub1_56, 0, this.aClass402_3.anInterface35_1);
		this.aClass115_10.method8293(this.aClass93_Sub33_Sub1_57, 1, this.aClass104_Sub2_31.method20922());
		this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_58, this.aClass489_71);
		this.aClass115_10.method8242(this.aClass93_Sub33_Sub1_59, this.aClass489_70);
		@Pc(56) int local56 = 0x1 << (this.anInt2749 * -1488069863 & 0x3);
		this.aClass115_10.method8210(this.aClass93_Sub33_Sub1_64, this.aClass472_56.aFloat317, this.aClass472_56.aFloat318, this.aClass472_56.aFloat319, (float) (local56 * this.aClass104_Sub2_31.anInt2952 % 40000) / 40000.0F);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_65, this.aClass460_13);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_60, this.aClass460_14);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_61, this.aClass460_15);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_62, this.aClass460_16);
		this.aClass115_10.method8287(this.aClass93_Sub33_Sub1_63, this.aClass472_57);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_67, this.aClass460_12);
		this.aClass115_10.method8287(this.aClass93_Sub33_Sub1_66, this.aClass472_58);
		this.aClass104_Sub2_31.method21007(Class424.aClass424_3, this.anInt2747 * -1457321687, this.anInt2748 * 1710096453, this.anInt2746 * 530089739, this.anInt2750 * -2008175839);
	}

	@OriginalMember(owner = "client!aqe", name = "bc", descriptor = "()V", line = 96)
	public void method19647() {
		this.method19641();
		this.aClass115_10.method8203(this.aClass116_11);
		this.aClass115_10.method8285();
		this.aClass115_10.method8293(this.aClass93_Sub33_Sub1_56, 0, this.aClass402_3.anInterface35_1);
		this.aClass115_10.method8293(this.aClass93_Sub33_Sub1_57, 1, this.aClass104_Sub2_31.method20922());
		this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_58, this.aClass489_71);
		this.aClass115_10.method8242(this.aClass93_Sub33_Sub1_59, this.aClass489_70);
		@Pc(56) int local56 = 0x1 << (this.anInt2749 * -1488069863 & 0x3);
		this.aClass115_10.method8210(this.aClass93_Sub33_Sub1_64, this.aClass472_56.aFloat317, this.aClass472_56.aFloat318, this.aClass472_56.aFloat319, (float) (local56 * this.aClass104_Sub2_31.anInt2952 % 40000) / 40000.0F);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_65, this.aClass460_13);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_60, this.aClass460_14);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_61, this.aClass460_15);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_62, this.aClass460_16);
		this.aClass115_10.method8287(this.aClass93_Sub33_Sub1_63, this.aClass472_57);
		this.aClass115_10.method8212(this.aClass93_Sub33_Sub1_67, this.aClass460_12);
		this.aClass115_10.method8287(this.aClass93_Sub33_Sub1_66, this.aClass472_58);
		this.aClass104_Sub2_31.method21007(Class424.aClass424_3, this.anInt2747 * -1457321687, this.anInt2748 * 1710096453, this.anInt2746 * 530089739, this.anInt2750 * -2008175839);
	}

	@OriginalMember(owner = "client!aqe", name = "bk", descriptor = "(I)V", line = 116)
	void method19641() {
		this.aFloat185 = 2.4414062E-4F;
		@Pc(4) short local4 = 256;
		@Pc(6) float local6 = 0.3F;
		@Pc(8) float local8 = 0.4F;
		@Pc(10) float local10 = 0.1F;
		@Pc(12) byte local12 = 5;
		this.aClass489_70.method29845(this.aFloat185, this.aFloat185, this.aFloat185, this.aFloat185);
		this.aClass460_13.method29194(-this.aClass104_Sub2_31.aFloatArray63[0], -this.aClass104_Sub2_31.aFloatArray63[1], -this.aClass104_Sub2_31.aFloatArray63[2], 32.0F);
		this.aClass460_14.method29194(this.aClass104_Sub2_31.aFloat214, this.aClass104_Sub2_31.aFloat210, this.aClass104_Sub2_31.aFloat217, (float) local12);
		this.aClass460_15.method29194(local10, local8, (float) local4, local6);
	}

	@OriginalMember(owner = "client!aqe", name = "ah", descriptor = "(III)V", line = 182)
	static void method19648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28006(1, (long) arg0);
		local4.method21801();
		local4.anInt3020 = arg1 * 1415359557;
	}
}
