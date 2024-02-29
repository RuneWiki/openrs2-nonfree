package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agr")
public class Class109_Sub1 extends Class109 {

	@OriginalMember(owner = "client!agr", name = "aa", descriptor = "I")
	static final int anInt1061 = 18;

	@OriginalMember(owner = "client!agr", name = "ai", descriptor = "I")
	static final int anInt1062 = 3;

	@OriginalMember(owner = "client!agr", name = "h", descriptor = "I")
	static final int anInt1063 = 1;

	@OriginalMember(owner = "client!agr", name = "at", descriptor = "I")
	static final int anInt1064 = 14;

	@OriginalMember(owner = "client!agr", name = "ab", descriptor = "I")
	static final int anInt1065 = 17;

	@OriginalMember(owner = "client!agr", name = "av", descriptor = "I")
	static final int anInt1066 = 13;

	@OriginalMember(owner = "client!agr", name = "al", descriptor = "I")
	static final int anInt1067 = 5;

	@OriginalMember(owner = "client!agr", name = "ao", descriptor = "I")
	static final int anInt1068 = 6;

	@OriginalMember(owner = "client!agr", name = "au", descriptor = "I")
	static final int anInt1069 = 8;

	@OriginalMember(owner = "client!agr", name = "ax", descriptor = "I")
	static final int anInt1070 = 9;

	@OriginalMember(owner = "client!agr", name = "ar", descriptor = "I")
	static final int anInt1071 = 10;

	@OriginalMember(owner = "client!agr", name = "ad", descriptor = "I")
	static final int anInt1072 = 11;

	@OriginalMember(owner = "client!agr", name = "ac", descriptor = "I")
	static final int anInt1073 = 12;

	@OriginalMember(owner = "client!agr", name = "ak", descriptor = "I")
	static final int anInt1074 = 7;

	@OriginalMember(owner = "client!agr", name = "m", descriptor = "I")
	static final int anInt1075 = 0;

	@OriginalMember(owner = "client!agr", name = "ae", descriptor = "I")
	static final int anInt1076 = 15;

	@OriginalMember(owner = "client!agr", name = "ah", descriptor = "I")
	static final int anInt1077 = 16;

	@OriginalMember(owner = "client!agr", name = "as", descriptor = "I")
	static final int anInt1078 = 17;

	@OriginalMember(owner = "client!agr", name = "aq", descriptor = "I")
	static final int anInt1079 = 0;

	@OriginalMember(owner = "client!agr", name = "ag", descriptor = "I")
	static final int anInt1080 = 4;

	@OriginalMember(owner = "client!agr", name = "ay", descriptor = "I")
	static final int anInt1081 = 2;

	@OriginalMember(owner = "client!agr", name = "af", descriptor = "I")
	static final int anInt1082 = 7;

	@OriginalMember(owner = "client!agr", name = "am", descriptor = "I")
	static final int anInt1083 = 1;

	@OriginalMember(owner = "client!agr", name = "an", descriptor = "I")
	static final int anInt1084 = 12;

	@OriginalMember(owner = "client!agr", name = "ap", descriptor = "I")
	static final int anInt1085 = 19;

	@OriginalMember(owner = "client!agr", name = "aj", descriptor = "I")
	static final int anInt1086 = 2;

	@OriginalMember(owner = "client!agr", name = "a", descriptor = "Lclient!hi;")
	Class112 aClass112_4;

	@OriginalMember(owner = "client!agr", name = "bj", descriptor = "[I")
	int[] anIntArray119;

	@OriginalMember(owner = "client!agr", name = "aw", descriptor = "Lclient!oi;")
	final Class442 aClass442_47 = new Class442();

	@OriginalMember(owner = "client!agr", name = "az", descriptor = "[Lclient!hr;")
	final Class105[] aClass105Array2 = new Class105[19];

	@OriginalMember(owner = "client!agr", name = "bc", descriptor = "[[I")
	final int[][] anIntArrayArray15 = new int[19][17];

	@OriginalMember(owner = "client!agr", name = "c", descriptor = "(I)I", line = 26)
	public static int method9090() {
		return Class304.anInt4056 * 304107793 - 1;
	}

	@OriginalMember(owner = "client!agr", name = "<init>", descriptor = "(Lclient!aed;)V", line = 43)
	public Class109_Sub1(@OriginalArg(0) Class86_Sub1 arg0) throws Exception_Sub3 {
		super(arg0);
		this.method9091();
	}

	@OriginalMember(owner = "client!agr", name = "m", descriptor = "(B)Z", line = 48)
	boolean method9091() throws Exception_Sub3 {
		this.aClass112_4 = this.aClass86_Sub1_16.method20613("Model");
		@Pc(11) Class77_Sub12_Sub1 local11 = this.aClass112_4.method9524("DiffuseSampler");
		@Pc(17) Class77_Sub12_Sub1 local17 = this.aClass112_4.method9524("EnvironmentSampler");
		@Pc(23) Class77_Sub12_Sub1 local23 = this.aClass112_4.method9524("PointLightsPosAndRadiusInv");
		@Pc(29) Class77_Sub12_Sub1 local29 = this.aClass112_4.method9524("PointLightsDiffuseColour");
		@Pc(35) Class77_Sub12_Sub1 local35 = this.aClass112_4.method9524("WVPMatrix");
		@Pc(41) Class77_Sub12_Sub1 local41 = this.aClass112_4.method9524("TexCoordMatrix");
		@Pc(47) Class77_Sub12_Sub1 local47 = this.aClass112_4.method9524("HeightFogPlane");
		@Pc(53) Class77_Sub12_Sub1 local53 = this.aClass112_4.method9524("HeightFogColour");
		@Pc(59) Class77_Sub12_Sub1 local59 = this.aClass112_4.method9524("DistanceFogPlane");
		@Pc(65) Class77_Sub12_Sub1 local65 = this.aClass112_4.method9524("DistanceFogColour");
		@Pc(71) Class77_Sub12_Sub1 local71 = this.aClass112_4.method9524("SunDir");
		@Pc(77) Class77_Sub12_Sub1 local77 = this.aClass112_4.method9524("SunColour");
		@Pc(83) Class77_Sub12_Sub1 local83 = this.aClass112_4.method9524("AntiSunColour");
		@Pc(89) Class77_Sub12_Sub1 local89 = this.aClass112_4.method9524("AmbientColour");
		@Pc(95) Class77_Sub12_Sub1 local95 = this.aClass112_4.method9524("EyePos");
		@Pc(101) Class77_Sub12_Sub1 local101 = this.aClass112_4.method9524("SpecularExponent");
		@Pc(107) Class77_Sub12_Sub1 local107 = this.aClass112_4.method9524("WorldMatrix");
		this.aClass105Array2[0] = this.aClass112_4.method9458("Unlit");
		this.aClass105Array2[1] = this.aClass112_4.method9458("Unlit_IgnoreAlpha");
		this.aClass105Array2[17] = this.aClass112_4.method9458("UnderwaterGround");
		this.aClass105Array2[18] = this.aClass112_4.method9458("UnderwaterGroundSpecular");
		@Pc(145) int local145;
		for (local145 = 0; local145 <= 4; local145++) {
			this.aClass105Array2[local145 + 2] = this.aClass112_4.method9458("Standard_" + local145 + "PointLights");
			this.aClass105Array2[local145 + 7] = this.aClass112_4.method9458("Specular_" + local145 + "PointLights");
			this.aClass105Array2[local145 + 12] = this.aClass112_4.method9458("EnvironmentalMapping_" + local145 + "PointLights");
		}
		for (local145 = 0; local145 < 19; local145++) {
			@Pc(224) int local224 = this.aClass112_4.method9463(this.aClass105Array2[local145]);
			this.anIntArrayArray15[local145][2] = local11.method23565(local224);
			this.anIntArrayArray15[local145][3] = local17.method23565(local224);
			this.anIntArrayArray15[local145][1] = local23.method23565(local224);
			this.anIntArrayArray15[local145][0] = local29.method23565(local224);
			this.anIntArrayArray15[local145][4] = local35.method23565(local224);
			this.anIntArrayArray15[local145][5] = local41.method23565(local224);
			this.anIntArrayArray15[local145][7] = local47.method23565(local224);
			this.anIntArrayArray15[local145][8] = local53.method23565(local224);
			this.anIntArrayArray15[local145][9] = local59.method23565(local224);
			this.anIntArrayArray15[local145][10] = local65.method23565(local224);
			this.anIntArrayArray15[local145][11] = local71.method23565(local224);
			this.anIntArrayArray15[local145][12] = local77.method23565(local224);
			this.anIntArrayArray15[local145][13] = local83.method23565(local224);
			this.anIntArrayArray15[local145][14] = local89.method23565(local224);
			this.anIntArrayArray15[local145][6] = local95.method23565(local224);
			this.anIntArrayArray15[local145][15] = local107.method23565(local224);
			this.anIntArrayArray15[local145][16] = local101.method23565(local224);
		}
		this.aClass112_4.method9547(this.aClass105Array2[2]);
		return true;
	}

	@OriginalMember(owner = "client!agr", name = "aj", descriptor = "()Z", line = 48)
	boolean method9092() throws Exception_Sub3 {
		this.aClass112_4 = this.aClass86_Sub1_16.method20613("Model");
		@Pc(11) Class77_Sub12_Sub1 local11 = this.aClass112_4.method9524("DiffuseSampler");
		@Pc(17) Class77_Sub12_Sub1 local17 = this.aClass112_4.method9524("EnvironmentSampler");
		@Pc(23) Class77_Sub12_Sub1 local23 = this.aClass112_4.method9524("PointLightsPosAndRadiusInv");
		@Pc(29) Class77_Sub12_Sub1 local29 = this.aClass112_4.method9524("PointLightsDiffuseColour");
		@Pc(35) Class77_Sub12_Sub1 local35 = this.aClass112_4.method9524("WVPMatrix");
		@Pc(41) Class77_Sub12_Sub1 local41 = this.aClass112_4.method9524("TexCoordMatrix");
		@Pc(47) Class77_Sub12_Sub1 local47 = this.aClass112_4.method9524("HeightFogPlane");
		@Pc(53) Class77_Sub12_Sub1 local53 = this.aClass112_4.method9524("HeightFogColour");
		@Pc(59) Class77_Sub12_Sub1 local59 = this.aClass112_4.method9524("DistanceFogPlane");
		@Pc(65) Class77_Sub12_Sub1 local65 = this.aClass112_4.method9524("DistanceFogColour");
		@Pc(71) Class77_Sub12_Sub1 local71 = this.aClass112_4.method9524("SunDir");
		@Pc(77) Class77_Sub12_Sub1 local77 = this.aClass112_4.method9524("SunColour");
		@Pc(83) Class77_Sub12_Sub1 local83 = this.aClass112_4.method9524("AntiSunColour");
		@Pc(89) Class77_Sub12_Sub1 local89 = this.aClass112_4.method9524("AmbientColour");
		@Pc(95) Class77_Sub12_Sub1 local95 = this.aClass112_4.method9524("EyePos");
		@Pc(101) Class77_Sub12_Sub1 local101 = this.aClass112_4.method9524("SpecularExponent");
		@Pc(107) Class77_Sub12_Sub1 local107 = this.aClass112_4.method9524("WorldMatrix");
		this.aClass105Array2[0] = this.aClass112_4.method9458("Unlit");
		this.aClass105Array2[1] = this.aClass112_4.method9458("Unlit_IgnoreAlpha");
		this.aClass105Array2[17] = this.aClass112_4.method9458("UnderwaterGround");
		this.aClass105Array2[18] = this.aClass112_4.method9458("UnderwaterGroundSpecular");
		@Pc(145) int local145;
		for (local145 = 0; local145 <= 4; local145++) {
			this.aClass105Array2[local145 + 2] = this.aClass112_4.method9458("Standard_" + local145 + "PointLights");
			this.aClass105Array2[local145 + 7] = this.aClass112_4.method9458("Specular_" + local145 + "PointLights");
			this.aClass105Array2[local145 + 12] = this.aClass112_4.method9458("EnvironmentalMapping_" + local145 + "PointLights");
		}
		for (local145 = 0; local145 < 19; local145++) {
			@Pc(224) int local224 = this.aClass112_4.method9463(this.aClass105Array2[local145]);
			this.anIntArrayArray15[local145][2] = local11.method23565(local224);
			this.anIntArrayArray15[local145][3] = local17.method23565(local224);
			this.anIntArrayArray15[local145][1] = local23.method23565(local224);
			this.anIntArrayArray15[local145][0] = local29.method23565(local224);
			this.anIntArrayArray15[local145][4] = local35.method23565(local224);
			this.anIntArrayArray15[local145][5] = local41.method23565(local224);
			this.anIntArrayArray15[local145][7] = local47.method23565(local224);
			this.anIntArrayArray15[local145][8] = local53.method23565(local224);
			this.anIntArrayArray15[local145][9] = local59.method23565(local224);
			this.anIntArrayArray15[local145][10] = local65.method23565(local224);
			this.anIntArrayArray15[local145][11] = local71.method23565(local224);
			this.anIntArrayArray15[local145][12] = local77.method23565(local224);
			this.anIntArrayArray15[local145][13] = local83.method23565(local224);
			this.anIntArrayArray15[local145][14] = local89.method23565(local224);
			this.anIntArrayArray15[local145][6] = local95.method23565(local224);
			this.anIntArrayArray15[local145][15] = local107.method23565(local224);
			this.anIntArrayArray15[local145][16] = local101.method23565(local224);
		}
		this.aClass112_4.method9547(this.aClass105Array2[2]);
		return true;
	}

	@OriginalMember(owner = "client!agr", name = "ai", descriptor = "()Z", line = 48)
	boolean method9093() throws Exception_Sub3 {
		this.aClass112_4 = this.aClass86_Sub1_16.method20613("Model");
		@Pc(11) Class77_Sub12_Sub1 local11 = this.aClass112_4.method9524("DiffuseSampler");
		@Pc(17) Class77_Sub12_Sub1 local17 = this.aClass112_4.method9524("EnvironmentSampler");
		@Pc(23) Class77_Sub12_Sub1 local23 = this.aClass112_4.method9524("PointLightsPosAndRadiusInv");
		@Pc(29) Class77_Sub12_Sub1 local29 = this.aClass112_4.method9524("PointLightsDiffuseColour");
		@Pc(35) Class77_Sub12_Sub1 local35 = this.aClass112_4.method9524("WVPMatrix");
		@Pc(41) Class77_Sub12_Sub1 local41 = this.aClass112_4.method9524("TexCoordMatrix");
		@Pc(47) Class77_Sub12_Sub1 local47 = this.aClass112_4.method9524("HeightFogPlane");
		@Pc(53) Class77_Sub12_Sub1 local53 = this.aClass112_4.method9524("HeightFogColour");
		@Pc(59) Class77_Sub12_Sub1 local59 = this.aClass112_4.method9524("DistanceFogPlane");
		@Pc(65) Class77_Sub12_Sub1 local65 = this.aClass112_4.method9524("DistanceFogColour");
		@Pc(71) Class77_Sub12_Sub1 local71 = this.aClass112_4.method9524("SunDir");
		@Pc(77) Class77_Sub12_Sub1 local77 = this.aClass112_4.method9524("SunColour");
		@Pc(83) Class77_Sub12_Sub1 local83 = this.aClass112_4.method9524("AntiSunColour");
		@Pc(89) Class77_Sub12_Sub1 local89 = this.aClass112_4.method9524("AmbientColour");
		@Pc(95) Class77_Sub12_Sub1 local95 = this.aClass112_4.method9524("EyePos");
		@Pc(101) Class77_Sub12_Sub1 local101 = this.aClass112_4.method9524("SpecularExponent");
		@Pc(107) Class77_Sub12_Sub1 local107 = this.aClass112_4.method9524("WorldMatrix");
		this.aClass105Array2[0] = this.aClass112_4.method9458("Unlit");
		this.aClass105Array2[1] = this.aClass112_4.method9458("Unlit_IgnoreAlpha");
		this.aClass105Array2[17] = this.aClass112_4.method9458("UnderwaterGround");
		this.aClass105Array2[18] = this.aClass112_4.method9458("UnderwaterGroundSpecular");
		@Pc(145) int local145;
		for (local145 = 0; local145 <= 4; local145++) {
			this.aClass105Array2[local145 + 2] = this.aClass112_4.method9458("Standard_" + local145 + "PointLights");
			this.aClass105Array2[local145 + 7] = this.aClass112_4.method9458("Specular_" + local145 + "PointLights");
			this.aClass105Array2[local145 + 12] = this.aClass112_4.method9458("EnvironmentalMapping_" + local145 + "PointLights");
		}
		for (local145 = 0; local145 < 19; local145++) {
			@Pc(224) int local224 = this.aClass112_4.method9463(this.aClass105Array2[local145]);
			this.anIntArrayArray15[local145][2] = local11.method23565(local224);
			this.anIntArrayArray15[local145][3] = local17.method23565(local224);
			this.anIntArrayArray15[local145][1] = local23.method23565(local224);
			this.anIntArrayArray15[local145][0] = local29.method23565(local224);
			this.anIntArrayArray15[local145][4] = local35.method23565(local224);
			this.anIntArrayArray15[local145][5] = local41.method23565(local224);
			this.anIntArrayArray15[local145][7] = local47.method23565(local224);
			this.anIntArrayArray15[local145][8] = local53.method23565(local224);
			this.anIntArrayArray15[local145][9] = local59.method23565(local224);
			this.anIntArrayArray15[local145][10] = local65.method23565(local224);
			this.anIntArrayArray15[local145][11] = local71.method23565(local224);
			this.anIntArrayArray15[local145][12] = local77.method23565(local224);
			this.anIntArrayArray15[local145][13] = local83.method23565(local224);
			this.anIntArrayArray15[local145][14] = local89.method23565(local224);
			this.anIntArrayArray15[local145][6] = local95.method23565(local224);
			this.anIntArrayArray15[local145][15] = local107.method23565(local224);
			this.anIntArrayArray15[local145][16] = local101.method23565(local224);
		}
		this.aClass112_4.method9547(this.aClass105Array2[2]);
		return true;
	}

	@OriginalMember(owner = "client!agr", name = "c", descriptor = "(Lclient!oi;)V", line = 100)
	@Override
	public void method9101(@OriginalArg(0) Class442 arg0) {
		this.aClass442_47.method28954(arg0);
		this.aClass442_47.method28965(this.aClass86_Sub1_16.aClass442_84);
	}

	@OriginalMember(owner = "client!agr", name = "d", descriptor = "(Lclient!oi;)V", line = 100)
	@Override
	public void method9108(@OriginalArg(0) Class442 arg0) {
		this.aClass442_47.method28954(arg0);
		this.aClass442_47.method28965(this.aClass86_Sub1_16.aClass442_84);
	}

	@OriginalMember(owner = "client!agr", name = "x", descriptor = "(Lclient!oi;)V", line = 100)
	@Override
	public void method9107(@OriginalArg(0) Class442 arg0) {
		this.aClass442_47.method28954(arg0);
		this.aClass442_47.method28965(this.aClass86_Sub1_16.aClass442_84);
	}

	@OriginalMember(owner = "client!agr", name = "v", descriptor = "(Z)V", line = 105)
	@Override
	public void method9117(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass112_4.method9547(this.aClass105Array2[1]);
		} else {
			this.aClass112_4.method9547(this.aClass105Array2[0]);
		}
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.aClass112_4.method9522(this.anIntArray119[2], 0, this.anInterface37_18);
		this.aClass112_4.method9517(this.anIntArray119[4], this.aClass442_47);
		this.aClass112_4.method9514(this.anIntArray119[5], this.aClass442_48);
		this.aClass112_4.method9507(this.anIntArray119[7], this.aClass450_10.aFloat279, this.aClass450_10.aFloat280, this.aClass450_10.aFloat282, this.aClass450_10.aFloat281);
		this.aClass112_4.method9504(this.anIntArray119[8], this.aClass447_31.aFloat277, this.aClass447_31.aFloat276, this.aClass447_31.aFloat278);
		this.aClass112_4.method9507(this.anIntArray119[9], this.aClass450_11.aFloat279, this.aClass450_11.aFloat280, this.aClass450_11.aFloat282, this.aClass450_11.aFloat281);
		this.aClass112_4.method9504(this.anIntArray119[10], this.aClass447_33.aFloat277, this.aClass447_33.aFloat276, this.aClass447_33.aFloat278);
		this.aClass86_Sub1_16.method20663(Class384.aClass384_4, this.anInt1089, this.anInt1087, this.anInt1090, this.anInt1091);
	}

	@OriginalMember(owner = "client!agr", name = "s", descriptor = "(Z)V", line = 105)
	@Override
	public void method9109(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass112_4.method9547(this.aClass105Array2[1]);
		} else {
			this.aClass112_4.method9547(this.aClass105Array2[0]);
		}
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.aClass112_4.method9522(this.anIntArray119[2], 0, this.anInterface37_18);
		this.aClass112_4.method9517(this.anIntArray119[4], this.aClass442_47);
		this.aClass112_4.method9514(this.anIntArray119[5], this.aClass442_48);
		this.aClass112_4.method9507(this.anIntArray119[7], this.aClass450_10.aFloat279, this.aClass450_10.aFloat280, this.aClass450_10.aFloat282, this.aClass450_10.aFloat281);
		this.aClass112_4.method9504(this.anIntArray119[8], this.aClass447_31.aFloat277, this.aClass447_31.aFloat276, this.aClass447_31.aFloat278);
		this.aClass112_4.method9507(this.anIntArray119[9], this.aClass450_11.aFloat279, this.aClass450_11.aFloat280, this.aClass450_11.aFloat282, this.aClass450_11.aFloat281);
		this.aClass112_4.method9504(this.anIntArray119[10], this.aClass447_33.aFloat277, this.aClass447_33.aFloat276, this.aClass447_33.aFloat278);
		this.aClass86_Sub1_16.method20663(Class384.aClass384_4, this.anInt1089, this.anInt1087, this.anInt1090, this.anInt1091);
	}

	@OriginalMember(owner = "client!agr", name = "r", descriptor = "(Z)V", line = 105)
	@Override
	public void method9110(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aClass112_4.method9547(this.aClass105Array2[1]);
		} else {
			this.aClass112_4.method9547(this.aClass105Array2[0]);
		}
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.aClass112_4.method9522(this.anIntArray119[2], 0, this.anInterface37_18);
		this.aClass112_4.method9517(this.anIntArray119[4], this.aClass442_47);
		this.aClass112_4.method9514(this.anIntArray119[5], this.aClass442_48);
		this.aClass112_4.method9507(this.anIntArray119[7], this.aClass450_10.aFloat279, this.aClass450_10.aFloat280, this.aClass450_10.aFloat282, this.aClass450_10.aFloat281);
		this.aClass112_4.method9504(this.anIntArray119[8], this.aClass447_31.aFloat277, this.aClass447_31.aFloat276, this.aClass447_31.aFloat278);
		this.aClass112_4.method9507(this.anIntArray119[9], this.aClass450_11.aFloat279, this.aClass450_11.aFloat280, this.aClass450_11.aFloat282, this.aClass450_11.aFloat281);
		this.aClass112_4.method9504(this.anIntArray119[10], this.aClass447_33.aFloat277, this.aClass447_33.aFloat276, this.aClass447_33.aFloat278);
		this.aClass86_Sub1_16.method20663(Class384.aClass384_4, this.anInt1089, this.anInt1087, this.anInt1090, this.anInt1091);
	}

	@OriginalMember(owner = "client!agr", name = "t", descriptor = "()V", line = 124)
	@Override
	public void method9105() {
		this.aClass112_4.method9547(this.aClass105Array2[17]);
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.method9094(0);
	}

	@OriginalMember(owner = "client!agr", name = "k", descriptor = "()V", line = 124)
	@Override
	public void method9115() {
		this.aClass112_4.method9547(this.aClass105Array2[17]);
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.method9094(0);
	}

	@OriginalMember(owner = "client!agr", name = "u", descriptor = "()V", line = 124)
	@Override
	public void method9102() {
		this.aClass112_4.method9547(this.aClass105Array2[17]);
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.method9094(0);
	}

	@OriginalMember(owner = "client!agr", name = "q", descriptor = "()V", line = 131)
	@Override
	public void method9106() {
		this.aClass112_4.method9547(this.aClass105Array2[18]);
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.aClass112_4.method9504(this.anIntArray119[6], this.aClass447_32.aFloat277, this.aClass447_32.aFloat276, this.aClass447_32.aFloat278);
		this.aClass112_4.method9507(this.anIntArray119[16], this.aFloat123, this.aFloat124, 0.0F, 0.0F);
		this.method9094(0);
	}

	@OriginalMember(owner = "client!agr", name = "e", descriptor = "()V", line = 131)
	@Override
	public void method9100() {
		this.aClass112_4.method9547(this.aClass105Array2[18]);
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.aClass112_4.method9504(this.anIntArray119[6], this.aClass447_32.aFloat277, this.aClass447_32.aFloat276, this.aClass447_32.aFloat278);
		this.aClass112_4.method9507(this.anIntArray119[16], this.aFloat123, this.aFloat124, 0.0F, 0.0F);
		this.method9094(0);
	}

	@OriginalMember(owner = "client!agr", name = "h", descriptor = "(II)V", line = 140)
	void method9094(@OriginalArg(0) int arg0) {
		this.aClass112_4.method9522(this.anIntArray119[2], 0, this.anInterface37_18);
		this.aClass112_4.method9517(this.anIntArray119[4], this.aClass442_47);
		this.aClass112_4.method9514(this.anIntArray119[5], this.aClass442_48);
		this.aClass112_4.method9507(this.anIntArray119[7], this.aClass450_10.aFloat279, this.aClass450_10.aFloat280, this.aClass450_10.aFloat282, this.aClass450_10.aFloat281);
		this.aClass112_4.method9504(this.anIntArray119[8], this.aClass447_31.aFloat277, this.aClass447_31.aFloat276, this.aClass447_31.aFloat278);
		this.aClass112_4.method9507(this.anIntArray119[9], this.aClass450_11.aFloat279, this.aClass450_11.aFloat280, this.aClass450_11.aFloat282, this.aClass450_11.aFloat281);
		this.aClass112_4.method9504(this.anIntArray119[10], this.aClass447_33.aFloat277, this.aClass447_33.aFloat276, this.aClass447_33.aFloat278);
		this.aClass112_4.method9508(this.anIntArray119[11], this.aClass447_34);
		this.aClass112_4.method9508(this.anIntArray119[12], this.aClass447_35);
		this.aClass112_4.method9508(this.anIntArray119[13], this.aClass447_36);
		this.aClass112_4.method9508(this.anIntArray119[14], this.aClass447_37);
		if (arg0 > 0) {
			this.aClass112_4.method9510(this.anIntArray119[1], this.aFloatArray48, arg0 * 4);
			this.aClass112_4.method9510(this.anIntArray119[0], this.aFloatArray47, arg0 * 4);
		}
		this.aClass86_Sub1_16.method20663(Class384.aClass384_4, this.anInt1089, this.anInt1087, this.anInt1090, this.anInt1091);
	}

	@OriginalMember(owner = "client!agr", name = "l", descriptor = "(I)V", line = 159)
	@Override
	public void method9103(@OriginalArg(0) int arg0) {
		this.aClass112_4.method9547(this.aClass105Array2[arg0 + 2]);
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.method9094(arg0);
	}

	@OriginalMember(owner = "client!agr", name = "b", descriptor = "(I)V", line = 159)
	@Override
	public void method9118(@OriginalArg(0) int arg0) {
		this.aClass112_4.method9547(this.aClass105Array2[arg0 + 2]);
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.method9094(arg0);
	}

	@OriginalMember(owner = "client!agr", name = "a", descriptor = "(I)V", line = 159)
	@Override
	public void method9120(@OriginalArg(0) int arg0) {
		this.aClass112_4.method9547(this.aClass105Array2[arg0 + 2]);
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.method9094(arg0);
	}

	@OriginalMember(owner = "client!agr", name = "n", descriptor = "(I)V", line = 159)
	@Override
	public void method9119(@OriginalArg(0) int arg0) {
		this.aClass112_4.method9547(this.aClass105Array2[arg0 + 2]);
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.method9094(arg0);
	}

	@OriginalMember(owner = "client!agr", name = "z", descriptor = "(I)V", line = 166)
	@Override
	public void method9112(@OriginalArg(0) int arg0) {
		this.aClass112_4.method9547(this.aClass105Array2[arg0 + 7]);
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.aClass112_4.method9504(this.anIntArray119[6], this.aClass447_32.aFloat277, this.aClass447_32.aFloat276, this.aClass447_32.aFloat278);
		this.aClass112_4.method9507(this.anIntArray119[16], this.aFloat123, this.aFloat124, 0.0F, 0.0F);
		this.method9094(arg0);
	}

	@OriginalMember(owner = "client!agr", name = "y", descriptor = "(I)V", line = 166)
	@Override
	public void method9116(@OriginalArg(0) int arg0) {
		this.aClass112_4.method9547(this.aClass105Array2[arg0 + 7]);
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.aClass112_4.method9504(this.anIntArray119[6], this.aClass447_32.aFloat277, this.aClass447_32.aFloat276, this.aClass447_32.aFloat278);
		this.aClass112_4.method9507(this.anIntArray119[16], this.aFloat123, this.aFloat124, 0.0F, 0.0F);
		this.method9094(arg0);
	}

	@OriginalMember(owner = "client!agr", name = "g", descriptor = "(I)V", line = 166)
	@Override
	public void method9104(@OriginalArg(0) int arg0) {
		this.aClass112_4.method9547(this.aClass105Array2[arg0 + 7]);
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.aClass112_4.method9504(this.anIntArray119[6], this.aClass447_32.aFloat277, this.aClass447_32.aFloat276, this.aClass447_32.aFloat278);
		this.aClass112_4.method9507(this.anIntArray119[16], this.aFloat123, this.aFloat124, 0.0F, 0.0F);
		this.method9094(arg0);
	}

	@OriginalMember(owner = "client!agr", name = "w", descriptor = "(I)V", line = 175)
	@Override
	public void method9111(@OriginalArg(0) int arg0) {
		this.aClass112_4.method9547(this.aClass105Array2[arg0 + 12]);
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.aClass112_4.method9511(this.anIntArray119[15], this.aClass442_49);
		this.aClass112_4.method9504(this.anIntArray119[6], this.aClass447_32.aFloat277, this.aClass447_32.aFloat276, this.aClass447_32.aFloat278);
		this.aClass112_4.method9522(this.anIntArray119[3], 1, this.anInterface40_3);
		this.method9094(arg0);
	}

	@OriginalMember(owner = "client!agr", name = "j", descriptor = "(I)V", line = 175)
	@Override
	public void method9113(@OriginalArg(0) int arg0) {
		this.aClass112_4.method9547(this.aClass105Array2[arg0 + 12]);
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.aClass112_4.method9511(this.anIntArray119[15], this.aClass442_49);
		this.aClass112_4.method9504(this.anIntArray119[6], this.aClass447_32.aFloat277, this.aClass447_32.aFloat276, this.aClass447_32.aFloat278);
		this.aClass112_4.method9522(this.anIntArray119[3], 1, this.anInterface40_3);
		this.method9094(arg0);
	}

	@OriginalMember(owner = "client!agr", name = "i", descriptor = "(I)V", line = 175)
	@Override
	public void method9114(@OriginalArg(0) int arg0) {
		this.aClass112_4.method9547(this.aClass105Array2[arg0 + 12]);
		this.anIntArray119 = this.anIntArrayArray15[this.aClass112_4.method9470()];
		this.aClass112_4.method9545();
		this.aClass112_4.method9511(this.anIntArray119[15], this.aClass442_49);
		this.aClass112_4.method9504(this.anIntArray119[6], this.aClass447_32.aFloat277, this.aClass447_32.aFloat276, this.aClass447_32.aFloat278);
		this.aClass112_4.method9522(this.anIntArray119[3], 1, this.anInterface40_3);
		this.method9094(arg0);
	}

	@OriginalMember(owner = "client!agr", name = "b", descriptor = "(B)Lclient!akv;", line = 885)
	static Class77_Sub39 method9095() {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(518);
		Class589.anIntArray506 = new int[4];
		Class589.anIntArray506[0] = (int) (Math.random() * 9.9999999E7D);
		Class589.anIntArray506[1] = (int) (Math.random() * 9.9999999E7D);
		Class589.anIntArray506[2] = (int) (Class446.aLong274 * -3197788566897510349L >> 32);
		Class589.anIntArray506[3] = (int) (Class446.aLong274 * -3197788566897510349L & 0xFFFFFFFFFFFFFFFFL);
		local4.method22403(10);
		local4.method22417(Class589.anIntArray506[0]);
		local4.method22417(Class589.anIntArray506[1]);
		local4.method22417(Class589.anIntArray506[2]);
		local4.method22417(Class589.anIntArray506[3]);
		return local4;
	}

	@OriginalMember(owner = "client!agr", name = "er", descriptor = "(I)Lclient!akg;", line = 947)
	public static Class77_Sub30 method9096() {
		if (Class136_Sub1.aClass695_23 == null || Class136_Sub1.aClass704_1 == null) {
			return null;
		}
		for (@Pc(10) Class77_Sub30 local10 = (Class77_Sub30) Class136_Sub1.aClass704_1.next(); local10 != null; local10 = (Class77_Sub30) Class136_Sub1.aClass704_1.next()) {
			@Pc(21) Class302 local21 = (Class302) Class136_Sub1.aClass35_Sub10_2.method18319(local10.anInt1635 * 1592054281);
			if (local21 != null && local21.aBoolean692 && local21.method27136(Class136_Sub1.anInterface17_2, Class136_Sub1.anInterface19_2)) {
				return local10;
			}
		}
		return null;
	}
}
