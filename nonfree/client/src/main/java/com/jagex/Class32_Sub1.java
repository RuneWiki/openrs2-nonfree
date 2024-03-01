package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ade")
public class Class32_Sub1 extends Class32 {

	@OriginalMember(owner = "client!ade", name = "as", descriptor = "I")
	static final int anInt797 = 9;

	@OriginalMember(owner = "client!ade", name = "f", descriptor = "I")
	static final int anInt798 = 0;

	@OriginalMember(owner = "client!ade", name = "k", descriptor = "I")
	static final int anInt799 = 1;

	@OriginalMember(owner = "client!ade", name = "at", descriptor = "I")
	static final int anInt800 = 2;

	@OriginalMember(owner = "client!ade", name = "af", descriptor = "I")
	static final int anInt801 = 3;

	@OriginalMember(owner = "client!ade", name = "au", descriptor = "I")
	static final int anInt802 = 1;

	@OriginalMember(owner = "client!ade", name = "ap", descriptor = "I")
	static final int anInt803 = 17;

	@OriginalMember(owner = "client!ade", name = "aj", descriptor = "I")
	static final int anInt804 = 8;

	@OriginalMember(owner = "client!ade", name = "ai", descriptor = "I")
	static final int anInt805 = 10;

	@OriginalMember(owner = "client!ade", name = "aq", descriptor = "I")
	static final int anInt806 = 11;

	@OriginalMember(owner = "client!ade", name = "av", descriptor = "I")
	static final int anInt807 = 12;

	@OriginalMember(owner = "client!ade", name = "ax", descriptor = "I")
	static final int anInt808 = 13;

	@OriginalMember(owner = "client!ade", name = "az", descriptor = "I")
	static final int anInt809 = 14;

	@OriginalMember(owner = "client!ade", name = "al", descriptor = "I")
	static final int anInt810 = 15;

	@OriginalMember(owner = "client!ade", name = "ao", descriptor = "I")
	static final int anInt811 = 16;

	@OriginalMember(owner = "client!ade", name = "ar", descriptor = "I")
	static final int anInt812 = 17;

	@OriginalMember(owner = "client!ade", name = "ab", descriptor = "I")
	static final int anInt813 = 0;

	@OriginalMember(owner = "client!ade", name = "aa", descriptor = "I")
	static final int anInt814 = 5;

	@OriginalMember(owner = "client!ade", name = "ay", descriptor = "I")
	static final int anInt815 = 2;

	@OriginalMember(owner = "client!ade", name = "ah", descriptor = "I")
	static final int anInt816 = 6;

	@OriginalMember(owner = "client!ade", name = "ak", descriptor = "I")
	static final int anInt817 = 4;

	@OriginalMember(owner = "client!ade", name = "ae", descriptor = "I")
	static final int anInt818 = 18;

	@OriginalMember(owner = "client!ade", name = "ad", descriptor = "I")
	static final int anInt819 = 19;

	@OriginalMember(owner = "client!ade", name = "am", descriptor = "I")
	static final int anInt820 = 12;

	@OriginalMember(owner = "client!ade", name = "ag", descriptor = "I")
	static final int anInt821 = 7;

	@OriginalMember(owner = "client!ade", name = "an", descriptor = "I")
	static final int anInt822 = 7;

	@OriginalMember(owner = "client!ade", name = "i", descriptor = "Lclient!fc;")
	Class24 aClass24_2;

	@OriginalMember(owner = "client!ade", name = "bp", descriptor = "[I")
	int[] anIntArray93;

	@OriginalMember(owner = "client!ade", name = "aw", descriptor = "Lclient!mq;")
	final Class328 aClass328_43 = new Class328();

	@OriginalMember(owner = "client!ade", name = "ac", descriptor = "[Lclient!fk;")
	final Class25[] aClass25Array5 = new Class25[19];

	@OriginalMember(owner = "client!ade", name = "bw", descriptor = "[[I")
	final int[][] anIntArrayArray15 = new int[19][17];

	@OriginalMember(owner = "client!ade", name = "<init>", descriptor = "(Lclient!abv;)V", line = 43)
	public Class32_Sub1(@OriginalArg(0) Class21_Sub3 arg0) throws Exception_Sub1 {
		super(arg0);
		this.method7532();
	}

	@OriginalMember(owner = "client!ade", name = "i", descriptor = "()Z", line = 48)
	boolean method7531() throws Exception_Sub1 {
		this.aClass24_2 = this.aClass21_Sub3_12.method17435("Model");
		@Pc(11) Class3_Sub19_Sub1 local11 = this.aClass24_2.method6583("DiffuseSampler");
		@Pc(17) Class3_Sub19_Sub1 local17 = this.aClass24_2.method6583("EnvironmentSampler");
		@Pc(23) Class3_Sub19_Sub1 local23 = this.aClass24_2.method6583("PointLightsPosAndRadiusInv");
		@Pc(29) Class3_Sub19_Sub1 local29 = this.aClass24_2.method6583("PointLightsDiffuseColour");
		@Pc(35) Class3_Sub19_Sub1 local35 = this.aClass24_2.method6583("WVPMatrix");
		@Pc(41) Class3_Sub19_Sub1 local41 = this.aClass24_2.method6583("TexCoordMatrix");
		@Pc(47) Class3_Sub19_Sub1 local47 = this.aClass24_2.method6583("HeightFogPlane");
		@Pc(53) Class3_Sub19_Sub1 local53 = this.aClass24_2.method6583("HeightFogColour");
		@Pc(59) Class3_Sub19_Sub1 local59 = this.aClass24_2.method6583("DistanceFogPlane");
		@Pc(65) Class3_Sub19_Sub1 local65 = this.aClass24_2.method6583("DistanceFogColour");
		@Pc(71) Class3_Sub19_Sub1 local71 = this.aClass24_2.method6583("SunDir");
		@Pc(77) Class3_Sub19_Sub1 local77 = this.aClass24_2.method6583("SunColour");
		@Pc(83) Class3_Sub19_Sub1 local83 = this.aClass24_2.method6583("AntiSunColour");
		@Pc(89) Class3_Sub19_Sub1 local89 = this.aClass24_2.method6583("AmbientColour");
		@Pc(95) Class3_Sub19_Sub1 local95 = this.aClass24_2.method6583("EyePos");
		@Pc(101) Class3_Sub19_Sub1 local101 = this.aClass24_2.method6583("SpecularExponent");
		@Pc(107) Class3_Sub19_Sub1 local107 = this.aClass24_2.method6583("WorldMatrix");
		this.aClass25Array5[0] = this.aClass24_2.method6555("Unlit");
		this.aClass25Array5[1] = this.aClass24_2.method6555("Unlit_IgnoreAlpha");
		this.aClass25Array5[17] = this.aClass24_2.method6555("UnderwaterGround");
		this.aClass25Array5[18] = this.aClass24_2.method6555("UnderwaterGroundSpecular");
		@Pc(145) int local145;
		for (local145 = 0; local145 <= 4; local145++) {
			this.aClass25Array5[local145 + 2] = this.aClass24_2.method6555("Standard_" + local145 + "PointLights");
			this.aClass25Array5[local145 + 7] = this.aClass24_2.method6555("Specular_" + local145 + "PointLights");
			this.aClass25Array5[local145 + 12] = this.aClass24_2.method6555("EnvironmentalMapping_" + local145 + "PointLights");
		}
		for (local145 = 0; local145 < 19; local145++) {
			@Pc(224) int local224 = this.aClass24_2.method6592(this.aClass25Array5[local145]);
			this.anIntArrayArray15[local145][2] = local11.method20815(local224);
			this.anIntArrayArray15[local145][3] = local17.method20815(local224);
			this.anIntArrayArray15[local145][1] = local23.method20815(local224);
			this.anIntArrayArray15[local145][0] = local29.method20815(local224);
			this.anIntArrayArray15[local145][4] = local35.method20815(local224);
			this.anIntArrayArray15[local145][5] = local41.method20815(local224);
			this.anIntArrayArray15[local145][7] = local47.method20815(local224);
			this.anIntArrayArray15[local145][8] = local53.method20815(local224);
			this.anIntArrayArray15[local145][9] = local59.method20815(local224);
			this.anIntArrayArray15[local145][10] = local65.method20815(local224);
			this.anIntArrayArray15[local145][11] = local71.method20815(local224);
			this.anIntArrayArray15[local145][12] = local77.method20815(local224);
			this.anIntArrayArray15[local145][13] = local83.method20815(local224);
			this.anIntArrayArray15[local145][14] = local89.method20815(local224);
			this.anIntArrayArray15[local145][6] = local95.method20815(local224);
			this.anIntArrayArray15[local145][15] = local107.method20815(local224);
			this.anIntArrayArray15[local145][16] = local101.method20815(local224);
		}
		this.aClass24_2.method6560(this.aClass25Array5[2]);
		return true;
	}

	@OriginalMember(owner = "client!ade", name = "w", descriptor = "(I)Z", line = 48)
	boolean method7532() throws Exception_Sub1 {
		this.aClass24_2 = this.aClass21_Sub3_12.method17435("Model");
		@Pc(11) Class3_Sub19_Sub1 local11 = this.aClass24_2.method6583("DiffuseSampler");
		@Pc(17) Class3_Sub19_Sub1 local17 = this.aClass24_2.method6583("EnvironmentSampler");
		@Pc(23) Class3_Sub19_Sub1 local23 = this.aClass24_2.method6583("PointLightsPosAndRadiusInv");
		@Pc(29) Class3_Sub19_Sub1 local29 = this.aClass24_2.method6583("PointLightsDiffuseColour");
		@Pc(35) Class3_Sub19_Sub1 local35 = this.aClass24_2.method6583("WVPMatrix");
		@Pc(41) Class3_Sub19_Sub1 local41 = this.aClass24_2.method6583("TexCoordMatrix");
		@Pc(47) Class3_Sub19_Sub1 local47 = this.aClass24_2.method6583("HeightFogPlane");
		@Pc(53) Class3_Sub19_Sub1 local53 = this.aClass24_2.method6583("HeightFogColour");
		@Pc(59) Class3_Sub19_Sub1 local59 = this.aClass24_2.method6583("DistanceFogPlane");
		@Pc(65) Class3_Sub19_Sub1 local65 = this.aClass24_2.method6583("DistanceFogColour");
		@Pc(71) Class3_Sub19_Sub1 local71 = this.aClass24_2.method6583("SunDir");
		@Pc(77) Class3_Sub19_Sub1 local77 = this.aClass24_2.method6583("SunColour");
		@Pc(83) Class3_Sub19_Sub1 local83 = this.aClass24_2.method6583("AntiSunColour");
		@Pc(89) Class3_Sub19_Sub1 local89 = this.aClass24_2.method6583("AmbientColour");
		@Pc(95) Class3_Sub19_Sub1 local95 = this.aClass24_2.method6583("EyePos");
		@Pc(101) Class3_Sub19_Sub1 local101 = this.aClass24_2.method6583("SpecularExponent");
		@Pc(107) Class3_Sub19_Sub1 local107 = this.aClass24_2.method6583("WorldMatrix");
		this.aClass25Array5[0] = this.aClass24_2.method6555("Unlit");
		this.aClass25Array5[1] = this.aClass24_2.method6555("Unlit_IgnoreAlpha");
		this.aClass25Array5[17] = this.aClass24_2.method6555("UnderwaterGround");
		this.aClass25Array5[18] = this.aClass24_2.method6555("UnderwaterGroundSpecular");
		@Pc(145) int local145;
		for (local145 = 0; local145 <= 4; local145++) {
			this.aClass25Array5[local145 + 2] = this.aClass24_2.method6555("Standard_" + local145 + "PointLights");
			this.aClass25Array5[local145 + 7] = this.aClass24_2.method6555("Specular_" + local145 + "PointLights");
			this.aClass25Array5[local145 + 12] = this.aClass24_2.method6555("EnvironmentalMapping_" + local145 + "PointLights");
		}
		for (local145 = 0; local145 < 19; local145++) {
			@Pc(224) int local224 = this.aClass24_2.method6592(this.aClass25Array5[local145]);
			this.anIntArrayArray15[local145][2] = local11.method20815(local224);
			this.anIntArrayArray15[local145][3] = local17.method20815(local224);
			this.anIntArrayArray15[local145][1] = local23.method20815(local224);
			this.anIntArrayArray15[local145][0] = local29.method20815(local224);
			this.anIntArrayArray15[local145][4] = local35.method20815(local224);
			this.anIntArrayArray15[local145][5] = local41.method20815(local224);
			this.anIntArrayArray15[local145][7] = local47.method20815(local224);
			this.anIntArrayArray15[local145][8] = local53.method20815(local224);
			this.anIntArrayArray15[local145][9] = local59.method20815(local224);
			this.anIntArrayArray15[local145][10] = local65.method20815(local224);
			this.anIntArrayArray15[local145][11] = local71.method20815(local224);
			this.anIntArrayArray15[local145][12] = local77.method20815(local224);
			this.anIntArrayArray15[local145][13] = local83.method20815(local224);
			this.anIntArrayArray15[local145][14] = local89.method20815(local224);
			this.anIntArrayArray15[local145][6] = local95.method20815(local224);
			this.anIntArrayArray15[local145][15] = local107.method20815(local224);
			this.anIntArrayArray15[local145][16] = local101.method20815(local224);
		}
		this.aClass24_2.method6560(this.aClass25Array5[2]);
		return true;
	}

	@OriginalMember(owner = "client!ade", name = "f", descriptor = "()Z", line = 48)
	boolean method7535() throws Exception_Sub1 {
		this.aClass24_2 = this.aClass21_Sub3_12.method17435("Model");
		@Pc(11) Class3_Sub19_Sub1 local11 = this.aClass24_2.method6583("DiffuseSampler");
		@Pc(17) Class3_Sub19_Sub1 local17 = this.aClass24_2.method6583("EnvironmentSampler");
		@Pc(23) Class3_Sub19_Sub1 local23 = this.aClass24_2.method6583("PointLightsPosAndRadiusInv");
		@Pc(29) Class3_Sub19_Sub1 local29 = this.aClass24_2.method6583("PointLightsDiffuseColour");
		@Pc(35) Class3_Sub19_Sub1 local35 = this.aClass24_2.method6583("WVPMatrix");
		@Pc(41) Class3_Sub19_Sub1 local41 = this.aClass24_2.method6583("TexCoordMatrix");
		@Pc(47) Class3_Sub19_Sub1 local47 = this.aClass24_2.method6583("HeightFogPlane");
		@Pc(53) Class3_Sub19_Sub1 local53 = this.aClass24_2.method6583("HeightFogColour");
		@Pc(59) Class3_Sub19_Sub1 local59 = this.aClass24_2.method6583("DistanceFogPlane");
		@Pc(65) Class3_Sub19_Sub1 local65 = this.aClass24_2.method6583("DistanceFogColour");
		@Pc(71) Class3_Sub19_Sub1 local71 = this.aClass24_2.method6583("SunDir");
		@Pc(77) Class3_Sub19_Sub1 local77 = this.aClass24_2.method6583("SunColour");
		@Pc(83) Class3_Sub19_Sub1 local83 = this.aClass24_2.method6583("AntiSunColour");
		@Pc(89) Class3_Sub19_Sub1 local89 = this.aClass24_2.method6583("AmbientColour");
		@Pc(95) Class3_Sub19_Sub1 local95 = this.aClass24_2.method6583("EyePos");
		@Pc(101) Class3_Sub19_Sub1 local101 = this.aClass24_2.method6583("SpecularExponent");
		@Pc(107) Class3_Sub19_Sub1 local107 = this.aClass24_2.method6583("WorldMatrix");
		this.aClass25Array5[0] = this.aClass24_2.method6555("Unlit");
		this.aClass25Array5[1] = this.aClass24_2.method6555("Unlit_IgnoreAlpha");
		this.aClass25Array5[17] = this.aClass24_2.method6555("UnderwaterGround");
		this.aClass25Array5[18] = this.aClass24_2.method6555("UnderwaterGroundSpecular");
		@Pc(145) int local145;
		for (local145 = 0; local145 <= 4; local145++) {
			this.aClass25Array5[local145 + 2] = this.aClass24_2.method6555("Standard_" + local145 + "PointLights");
			this.aClass25Array5[local145 + 7] = this.aClass24_2.method6555("Specular_" + local145 + "PointLights");
			this.aClass25Array5[local145 + 12] = this.aClass24_2.method6555("EnvironmentalMapping_" + local145 + "PointLights");
		}
		for (local145 = 0; local145 < 19; local145++) {
			@Pc(224) int local224 = this.aClass24_2.method6592(this.aClass25Array5[local145]);
			this.anIntArrayArray15[local145][2] = local11.method20815(local224);
			this.anIntArrayArray15[local145][3] = local17.method20815(local224);
			this.anIntArrayArray15[local145][1] = local23.method20815(local224);
			this.anIntArrayArray15[local145][0] = local29.method20815(local224);
			this.anIntArrayArray15[local145][4] = local35.method20815(local224);
			this.anIntArrayArray15[local145][5] = local41.method20815(local224);
			this.anIntArrayArray15[local145][7] = local47.method20815(local224);
			this.anIntArrayArray15[local145][8] = local53.method20815(local224);
			this.anIntArrayArray15[local145][9] = local59.method20815(local224);
			this.anIntArrayArray15[local145][10] = local65.method20815(local224);
			this.anIntArrayArray15[local145][11] = local71.method20815(local224);
			this.anIntArrayArray15[local145][12] = local77.method20815(local224);
			this.anIntArrayArray15[local145][13] = local83.method20815(local224);
			this.anIntArrayArray15[local145][14] = local89.method20815(local224);
			this.anIntArrayArray15[local145][6] = local95.method20815(local224);
			this.anIntArrayArray15[local145][15] = local107.method20815(local224);
			this.anIntArrayArray15[local145][16] = local101.method20815(local224);
		}
		this.aClass24_2.method6560(this.aClass25Array5[2]);
		return true;
	}

	@OriginalMember(owner = "client!ade", name = "k", descriptor = "()Z", line = 48)
	boolean method7536() throws Exception_Sub1 {
		this.aClass24_2 = this.aClass21_Sub3_12.method17435("Model");
		@Pc(11) Class3_Sub19_Sub1 local11 = this.aClass24_2.method6583("DiffuseSampler");
		@Pc(17) Class3_Sub19_Sub1 local17 = this.aClass24_2.method6583("EnvironmentSampler");
		@Pc(23) Class3_Sub19_Sub1 local23 = this.aClass24_2.method6583("PointLightsPosAndRadiusInv");
		@Pc(29) Class3_Sub19_Sub1 local29 = this.aClass24_2.method6583("PointLightsDiffuseColour");
		@Pc(35) Class3_Sub19_Sub1 local35 = this.aClass24_2.method6583("WVPMatrix");
		@Pc(41) Class3_Sub19_Sub1 local41 = this.aClass24_2.method6583("TexCoordMatrix");
		@Pc(47) Class3_Sub19_Sub1 local47 = this.aClass24_2.method6583("HeightFogPlane");
		@Pc(53) Class3_Sub19_Sub1 local53 = this.aClass24_2.method6583("HeightFogColour");
		@Pc(59) Class3_Sub19_Sub1 local59 = this.aClass24_2.method6583("DistanceFogPlane");
		@Pc(65) Class3_Sub19_Sub1 local65 = this.aClass24_2.method6583("DistanceFogColour");
		@Pc(71) Class3_Sub19_Sub1 local71 = this.aClass24_2.method6583("SunDir");
		@Pc(77) Class3_Sub19_Sub1 local77 = this.aClass24_2.method6583("SunColour");
		@Pc(83) Class3_Sub19_Sub1 local83 = this.aClass24_2.method6583("AntiSunColour");
		@Pc(89) Class3_Sub19_Sub1 local89 = this.aClass24_2.method6583("AmbientColour");
		@Pc(95) Class3_Sub19_Sub1 local95 = this.aClass24_2.method6583("EyePos");
		@Pc(101) Class3_Sub19_Sub1 local101 = this.aClass24_2.method6583("SpecularExponent");
		@Pc(107) Class3_Sub19_Sub1 local107 = this.aClass24_2.method6583("WorldMatrix");
		this.aClass25Array5[0] = this.aClass24_2.method6555("Unlit");
		this.aClass25Array5[1] = this.aClass24_2.method6555("Unlit_IgnoreAlpha");
		this.aClass25Array5[17] = this.aClass24_2.method6555("UnderwaterGround");
		this.aClass25Array5[18] = this.aClass24_2.method6555("UnderwaterGroundSpecular");
		@Pc(145) int local145;
		for (local145 = 0; local145 <= 4; local145++) {
			this.aClass25Array5[local145 + 2] = this.aClass24_2.method6555("Standard_" + local145 + "PointLights");
			this.aClass25Array5[local145 + 7] = this.aClass24_2.method6555("Specular_" + local145 + "PointLights");
			this.aClass25Array5[local145 + 12] = this.aClass24_2.method6555("EnvironmentalMapping_" + local145 + "PointLights");
		}
		for (local145 = 0; local145 < 19; local145++) {
			@Pc(224) int local224 = this.aClass24_2.method6592(this.aClass25Array5[local145]);
			this.anIntArrayArray15[local145][2] = local11.method20815(local224);
			this.anIntArrayArray15[local145][3] = local17.method20815(local224);
			this.anIntArrayArray15[local145][1] = local23.method20815(local224);
			this.anIntArrayArray15[local145][0] = local29.method20815(local224);
			this.anIntArrayArray15[local145][4] = local35.method20815(local224);
			this.anIntArrayArray15[local145][5] = local41.method20815(local224);
			this.anIntArrayArray15[local145][7] = local47.method20815(local224);
			this.anIntArrayArray15[local145][8] = local53.method20815(local224);
			this.anIntArrayArray15[local145][9] = local59.method20815(local224);
			this.anIntArrayArray15[local145][10] = local65.method20815(local224);
			this.anIntArrayArray15[local145][11] = local71.method20815(local224);
			this.anIntArrayArray15[local145][12] = local77.method20815(local224);
			this.anIntArrayArray15[local145][13] = local83.method20815(local224);
			this.anIntArrayArray15[local145][14] = local89.method20815(local224);
			this.anIntArrayArray15[local145][6] = local95.method20815(local224);
			this.anIntArrayArray15[local145][15] = local107.method20815(local224);
			this.anIntArrayArray15[local145][16] = local101.method20815(local224);
		}
		this.aClass24_2.method6560(this.aClass25Array5[2]);
		return true;
	}

	@OriginalMember(owner = "client!ade", name = "a", descriptor = "(Lclient!mq;)V", line = 100)
	@Override
	public void method7774(@OriginalArg(0) Class328 arg0) {
		this.aClass328_43.method26104(arg0);
		this.aClass328_43.method26046(this.aClass21_Sub3_12.aClass328_85);
	}

	@OriginalMember(owner = "client!ade", name = "y", descriptor = "(Lclient!mq;)V", line = 100)
	@Override
	public void method7780(@OriginalArg(0) Class328 arg0) {
		this.aClass328_43.method26104(arg0);
		this.aClass328_43.method26046(this.aClass21_Sub3_12.aClass328_85);
	}

	@OriginalMember(owner = "client!ade", name = "c", descriptor = "(Z)V", line = 105)
	@Override
	public void method7782(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass24_2.method6560(this.aClass25Array5[1]);
		} else {
			this.aClass24_2.method6560(this.aClass25Array5[0]);
		}
		this.anIntArray93 = this.anIntArrayArray15[this.aClass24_2.method6628()];
		this.aClass24_2.method6550();
		this.aClass24_2.method6657(this.anIntArray93[2], 0, this.anInterface20_14);
		this.aClass24_2.method6585(this.anIntArray93[4], this.aClass328_43);
		this.aClass24_2.method6627(this.anIntArray93[5], this.aClass328_44);
		this.aClass24_2.method6576(this.anIntArray93[7], this.aClass333_7.aFloat283, this.aClass333_7.aFloat282, this.aClass333_7.aFloat284, this.aClass333_7.aFloat281);
		this.aClass24_2.method6575(this.anIntArray93[8], this.aClass320_33.aFloat259, this.aClass320_33.aFloat260, this.aClass320_33.aFloat261);
		this.aClass24_2.method6576(this.anIntArray93[9], this.aClass333_8.aFloat283, this.aClass333_8.aFloat282, this.aClass333_8.aFloat284, this.aClass333_8.aFloat281);
		this.aClass24_2.method6575(this.anIntArray93[10], this.aClass320_31.aFloat259, this.aClass320_31.aFloat260, this.aClass320_31.aFloat261);
		this.aClass21_Sub3_12.method17555(Class263.aClass263_4, this.anInt842, this.anInt841, this.anInt843, this.anInt844);
	}

	@OriginalMember(owner = "client!ade", name = "g", descriptor = "(Z)V", line = 105)
	@Override
	public void method7775(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass24_2.method6560(this.aClass25Array5[1]);
		} else {
			this.aClass24_2.method6560(this.aClass25Array5[0]);
		}
		this.anIntArray93 = this.anIntArrayArray15[this.aClass24_2.method6628()];
		this.aClass24_2.method6550();
		this.aClass24_2.method6657(this.anIntArray93[2], 0, this.anInterface20_14);
		this.aClass24_2.method6585(this.anIntArray93[4], this.aClass328_43);
		this.aClass24_2.method6627(this.anIntArray93[5], this.aClass328_44);
		this.aClass24_2.method6576(this.anIntArray93[7], this.aClass333_7.aFloat283, this.aClass333_7.aFloat282, this.aClass333_7.aFloat284, this.aClass333_7.aFloat281);
		this.aClass24_2.method6575(this.anIntArray93[8], this.aClass320_33.aFloat259, this.aClass320_33.aFloat260, this.aClass320_33.aFloat261);
		this.aClass24_2.method6576(this.anIntArray93[9], this.aClass333_8.aFloat283, this.aClass333_8.aFloat282, this.aClass333_8.aFloat284, this.aClass333_8.aFloat281);
		this.aClass24_2.method6575(this.anIntArray93[10], this.aClass320_31.aFloat259, this.aClass320_31.aFloat260, this.aClass320_31.aFloat261);
		this.aClass21_Sub3_12.method17555(Class263.aClass263_4, this.anInt842, this.anInt841, this.anInt843, this.anInt844);
	}

	@OriginalMember(owner = "client!ade", name = "b", descriptor = "(Z)V", line = 105)
	@Override
	public void method7781(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass24_2.method6560(this.aClass25Array5[1]);
		} else {
			this.aClass24_2.method6560(this.aClass25Array5[0]);
		}
		this.anIntArray93 = this.anIntArrayArray15[this.aClass24_2.method6628()];
		this.aClass24_2.method6550();
		this.aClass24_2.method6657(this.anIntArray93[2], 0, this.anInterface20_14);
		this.aClass24_2.method6585(this.anIntArray93[4], this.aClass328_43);
		this.aClass24_2.method6627(this.anIntArray93[5], this.aClass328_44);
		this.aClass24_2.method6576(this.anIntArray93[7], this.aClass333_7.aFloat283, this.aClass333_7.aFloat282, this.aClass333_7.aFloat284, this.aClass333_7.aFloat281);
		this.aClass24_2.method6575(this.anIntArray93[8], this.aClass320_33.aFloat259, this.aClass320_33.aFloat260, this.aClass320_33.aFloat261);
		this.aClass24_2.method6576(this.anIntArray93[9], this.aClass333_8.aFloat283, this.aClass333_8.aFloat282, this.aClass333_8.aFloat284, this.aClass333_8.aFloat281);
		this.aClass24_2.method6575(this.anIntArray93[10], this.aClass320_31.aFloat259, this.aClass320_31.aFloat260, this.aClass320_31.aFloat261);
		this.aClass21_Sub3_12.method17555(Class263.aClass263_4, this.anInt842, this.anInt841, this.anInt843, this.anInt844);
	}

	@OriginalMember(owner = "client!ade", name = "z", descriptor = "(Z)V", line = 105)
	@Override
	public void method7776(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass24_2.method6560(this.aClass25Array5[1]);
		} else {
			this.aClass24_2.method6560(this.aClass25Array5[0]);
		}
		this.anIntArray93 = this.anIntArrayArray15[this.aClass24_2.method6628()];
		this.aClass24_2.method6550();
		this.aClass24_2.method6657(this.anIntArray93[2], 0, this.anInterface20_14);
		this.aClass24_2.method6585(this.anIntArray93[4], this.aClass328_43);
		this.aClass24_2.method6627(this.anIntArray93[5], this.aClass328_44);
		this.aClass24_2.method6576(this.anIntArray93[7], this.aClass333_7.aFloat283, this.aClass333_7.aFloat282, this.aClass333_7.aFloat284, this.aClass333_7.aFloat281);
		this.aClass24_2.method6575(this.anIntArray93[8], this.aClass320_33.aFloat259, this.aClass320_33.aFloat260, this.aClass320_33.aFloat261);
		this.aClass24_2.method6576(this.anIntArray93[9], this.aClass333_8.aFloat283, this.aClass333_8.aFloat282, this.aClass333_8.aFloat284, this.aClass333_8.aFloat281);
		this.aClass24_2.method6575(this.anIntArray93[10], this.aClass320_31.aFloat259, this.aClass320_31.aFloat260, this.aClass320_31.aFloat261);
		this.aClass21_Sub3_12.method17555(Class263.aClass263_4, this.anInt842, this.anInt841, this.anInt843, this.anInt844);
	}

	@OriginalMember(owner = "client!ade", name = "s", descriptor = "()V", line = 124)
	@Override
	public void method7778() {
		this.aClass24_2.method6560(this.aClass25Array5[17]);
		this.anIntArray93 = this.anIntArrayArray15[this.aClass24_2.method6628()];
		this.aClass24_2.method6550();
		this.method7534(0);
	}

	@OriginalMember(owner = "client!ade", name = "m", descriptor = "()V", line = 124)
	@Override
	public void method7790() {
		this.aClass24_2.method6560(this.aClass25Array5[17]);
		this.anIntArray93 = this.anIntArrayArray15[this.aClass24_2.method6628()];
		this.aClass24_2.method6550();
		this.method7534(0);
	}

	@OriginalMember(owner = "client!ade", name = "u", descriptor = "()V", line = 131)
	@Override
	public void method7779() {
		this.aClass24_2.method6560(this.aClass25Array5[18]);
		this.anIntArray93 = this.anIntArrayArray15[this.aClass24_2.method6628()];
		this.aClass24_2.method6550();
		this.aClass24_2.method6575(this.anIntArray93[6], this.aClass320_32.aFloat259, this.aClass320_32.aFloat260, this.aClass320_32.aFloat261);
		this.aClass24_2.method6576(this.anIntArray93[16], this.aFloat120, this.aFloat121, 0.0F, 0.0F);
		this.method7534(0);
	}

	@OriginalMember(owner = "client!ade", name = "v", descriptor = "()V", line = 131)
	@Override
	public void method7783() {
		this.aClass24_2.method6560(this.aClass25Array5[18]);
		this.anIntArray93 = this.anIntArrayArray15[this.aClass24_2.method6628()];
		this.aClass24_2.method6550();
		this.aClass24_2.method6575(this.anIntArray93[6], this.aClass320_32.aFloat259, this.aClass320_32.aFloat260, this.aClass320_32.aFloat261);
		this.aClass24_2.method6576(this.anIntArray93[16], this.aFloat120, this.aFloat121, 0.0F, 0.0F);
		this.method7534(0);
	}

	@OriginalMember(owner = "client!ade", name = "at", descriptor = "(I)V", line = 140)
	void method7533(@OriginalArg(0) int arg0) {
		this.aClass24_2.method6657(this.anIntArray93[2], 0, this.anInterface20_14);
		this.aClass24_2.method6585(this.anIntArray93[4], this.aClass328_43);
		this.aClass24_2.method6627(this.anIntArray93[5], this.aClass328_44);
		this.aClass24_2.method6576(this.anIntArray93[7], this.aClass333_7.aFloat283, this.aClass333_7.aFloat282, this.aClass333_7.aFloat284, this.aClass333_7.aFloat281);
		this.aClass24_2.method6575(this.anIntArray93[8], this.aClass320_33.aFloat259, this.aClass320_33.aFloat260, this.aClass320_33.aFloat261);
		this.aClass24_2.method6576(this.anIntArray93[9], this.aClass333_8.aFloat283, this.aClass333_8.aFloat282, this.aClass333_8.aFloat284, this.aClass333_8.aFloat281);
		this.aClass24_2.method6575(this.anIntArray93[10], this.aClass320_31.aFloat259, this.aClass320_31.aFloat260, this.aClass320_31.aFloat261);
		this.aClass24_2.method6573(this.anIntArray93[11], this.aClass320_34);
		this.aClass24_2.method6573(this.anIntArray93[12], this.aClass320_35);
		this.aClass24_2.method6573(this.anIntArray93[13], this.aClass320_36);
		this.aClass24_2.method6573(this.anIntArray93[14], this.aClass320_37);
		if (arg0 > 0) {
			this.aClass24_2.method6650(this.anIntArray93[1], this.aFloatArray50, arg0 * 4);
			this.aClass24_2.method6650(this.anIntArray93[0], this.aFloatArray49, arg0 * 4);
		}
		this.aClass21_Sub3_12.method17555(Class263.aClass263_4, this.anInt842, this.anInt841, this.anInt843, this.anInt844);
	}

	@OriginalMember(owner = "client!ade", name = "o", descriptor = "(IB)V", line = 140)
	void method7534(@OriginalArg(0) int arg0) {
		this.aClass24_2.method6657(this.anIntArray93[2], 0, this.anInterface20_14);
		this.aClass24_2.method6585(this.anIntArray93[4], this.aClass328_43);
		this.aClass24_2.method6627(this.anIntArray93[5], this.aClass328_44);
		this.aClass24_2.method6576(this.anIntArray93[7], this.aClass333_7.aFloat283, this.aClass333_7.aFloat282, this.aClass333_7.aFloat284, this.aClass333_7.aFloat281);
		this.aClass24_2.method6575(this.anIntArray93[8], this.aClass320_33.aFloat259, this.aClass320_33.aFloat260, this.aClass320_33.aFloat261);
		this.aClass24_2.method6576(this.anIntArray93[9], this.aClass333_8.aFloat283, this.aClass333_8.aFloat282, this.aClass333_8.aFloat284, this.aClass333_8.aFloat281);
		this.aClass24_2.method6575(this.anIntArray93[10], this.aClass320_31.aFloat259, this.aClass320_31.aFloat260, this.aClass320_31.aFloat261);
		this.aClass24_2.method6573(this.anIntArray93[11], this.aClass320_34);
		this.aClass24_2.method6573(this.anIntArray93[12], this.aClass320_35);
		this.aClass24_2.method6573(this.anIntArray93[13], this.aClass320_36);
		this.aClass24_2.method6573(this.anIntArray93[14], this.aClass320_37);
		if (arg0 > 0) {
			this.aClass24_2.method6650(this.anIntArray93[1], this.aFloatArray50, arg0 * 4);
			this.aClass24_2.method6650(this.anIntArray93[0], this.aFloatArray49, arg0 * 4);
		}
		this.aClass21_Sub3_12.method17555(Class263.aClass263_4, this.anInt842, this.anInt841, this.anInt843, this.anInt844);
	}

	@OriginalMember(owner = "client!ade", name = "l", descriptor = "(I)V", line = 159)
	@Override
	public void method7784(@OriginalArg(0) int arg0) {
		this.aClass24_2.method6560(this.aClass25Array5[arg0 + 2]);
		this.anIntArray93 = this.anIntArrayArray15[this.aClass24_2.method6628()];
		this.aClass24_2.method6550();
		this.method7534(arg0);
	}

	@OriginalMember(owner = "client!ade", name = "j", descriptor = "(I)V", line = 159)
	@Override
	public void method7792(@OriginalArg(0) int arg0) {
		this.aClass24_2.method6560(this.aClass25Array5[arg0 + 2]);
		this.anIntArray93 = this.anIntArrayArray15[this.aClass24_2.method6628()];
		this.aClass24_2.method6550();
		this.method7534(arg0);
	}

	@OriginalMember(owner = "client!ade", name = "e", descriptor = "(I)V", line = 159)
	@Override
	public void method7791(@OriginalArg(0) int arg0) {
		this.aClass24_2.method6560(this.aClass25Array5[arg0 + 2]);
		this.anIntArray93 = this.anIntArrayArray15[this.aClass24_2.method6628()];
		this.aClass24_2.method6550();
		this.method7534(arg0);
	}

	@OriginalMember(owner = "client!ade", name = "n", descriptor = "(I)V", line = 159)
	@Override
	public void method7785(@OriginalArg(0) int arg0) {
		this.aClass24_2.method6560(this.aClass25Array5[arg0 + 2]);
		this.anIntArray93 = this.anIntArrayArray15[this.aClass24_2.method6628()];
		this.aClass24_2.method6550();
		this.method7534(arg0);
	}

	@OriginalMember(owner = "client!ade", name = "h", descriptor = "(I)V", line = 166)
	@Override
	public void method7786(@OriginalArg(0) int arg0) {
		this.aClass24_2.method6560(this.aClass25Array5[arg0 + 7]);
		this.anIntArray93 = this.anIntArrayArray15[this.aClass24_2.method6628()];
		this.aClass24_2.method6550();
		this.aClass24_2.method6575(this.anIntArray93[6], this.aClass320_32.aFloat259, this.aClass320_32.aFloat260, this.aClass320_32.aFloat261);
		this.aClass24_2.method6576(this.anIntArray93[16], this.aFloat120, this.aFloat121, 0.0F, 0.0F);
		this.method7534(arg0);
	}

	@OriginalMember(owner = "client!ade", name = "r", descriptor = "(I)V", line = 166)
	@Override
	public void method7787(@OriginalArg(0) int arg0) {
		this.aClass24_2.method6560(this.aClass25Array5[arg0 + 7]);
		this.anIntArray93 = this.anIntArrayArray15[this.aClass24_2.method6628()];
		this.aClass24_2.method6550();
		this.aClass24_2.method6575(this.anIntArray93[6], this.aClass320_32.aFloat259, this.aClass320_32.aFloat260, this.aClass320_32.aFloat261);
		this.aClass24_2.method6576(this.anIntArray93[16], this.aFloat120, this.aFloat121, 0.0F, 0.0F);
		this.method7534(arg0);
	}

	@OriginalMember(owner = "client!ade", name = "d", descriptor = "(I)V", line = 166)
	@Override
	public void method7788(@OriginalArg(0) int arg0) {
		this.aClass24_2.method6560(this.aClass25Array5[arg0 + 7]);
		this.anIntArray93 = this.anIntArrayArray15[this.aClass24_2.method6628()];
		this.aClass24_2.method6550();
		this.aClass24_2.method6575(this.anIntArray93[6], this.aClass320_32.aFloat259, this.aClass320_32.aFloat260, this.aClass320_32.aFloat261);
		this.aClass24_2.method6576(this.anIntArray93[16], this.aFloat120, this.aFloat121, 0.0F, 0.0F);
		this.method7534(arg0);
	}

	@OriginalMember(owner = "client!ade", name = "x", descriptor = "(I)V", line = 175)
	@Override
	public void method7772(@OriginalArg(0) int arg0) {
		this.aClass24_2.method6560(this.aClass25Array5[arg0 + 12]);
		this.anIntArray93 = this.anIntArrayArray15[this.aClass24_2.method6628()];
		this.aClass24_2.method6550();
		this.aClass24_2.method6621(this.anIntArray93[15], this.aClass328_45);
		this.aClass24_2.method6575(this.anIntArray93[6], this.aClass320_32.aFloat259, this.aClass320_32.aFloat260, this.aClass320_32.aFloat261);
		this.aClass24_2.method6657(this.anIntArray93[3], 1, this.anInterface27_3);
		this.method7534(arg0);
	}

	@OriginalMember(owner = "client!ade", name = "q", descriptor = "(I)V", line = 175)
	@Override
	public void method7789(@OriginalArg(0) int arg0) {
		this.aClass24_2.method6560(this.aClass25Array5[arg0 + 12]);
		this.anIntArray93 = this.anIntArrayArray15[this.aClass24_2.method6628()];
		this.aClass24_2.method6550();
		this.aClass24_2.method6621(this.anIntArray93[15], this.aClass328_45);
		this.aClass24_2.method6575(this.anIntArray93[6], this.aClass320_32.aFloat259, this.aClass320_32.aFloat260, this.aClass320_32.aFloat261);
		this.aClass24_2.method6657(this.anIntArray93[3], 1, this.anInterface27_3);
		this.method7534(arg0);
	}
}
