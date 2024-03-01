package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ads")
public class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!ads", name = "g", descriptor = "[F")
	public static float[] aFloatArray52 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!ads", name = "l", descriptor = "F")
	public static float aFloat128 = 1.0F;

	@OriginalMember(owner = "client!ads", name = "h", descriptor = "I")
	public static int anInt879 = 1;

	@OriginalMember(owner = "client!ads", name = "x", descriptor = "[Lclient!abg;")
	public static Class16_Sub2[] aClass16_Sub2Array1 = new Class16_Sub2[] { null, null, null };

	@OriginalMember(owner = "client!ads", name = "j", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_23;

	@OriginalMember(owner = "client!ads", name = "c", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_24;

	@OriginalMember(owner = "client!ads", name = "z", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_25;

	@OriginalMember(owner = "client!ads", name = "u", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_26;

	@OriginalMember(owner = "client!ads", name = "s", descriptor = "Lclient!fc;")
	Class24 aClass24_5;

	@OriginalMember(owner = "client!ads", name = "n", descriptor = "Z")
	boolean aBoolean181;

	@OriginalMember(owner = "client!ads", name = "y", descriptor = "[Lclient!fk;")
	Class25[] aClass25Array6 = null;

	@OriginalMember(owner = "client!ads", name = "b", descriptor = "[Lclient!alr;")
	Class3_Sub19_Sub1[] aClass3_Sub19_Sub1Array1 = null;

	@OriginalMember(owner = "client!ads", name = "<init>", descriptor = "(Lclient!abv;)V", line = 23)
	public Class38_Sub2(@OriginalArg(0) Class21_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ads", name = "al", descriptor = "()Z", line = 27)
	boolean method8190() {
		return this.aClass21_Sub3_20.aBoolean443 && this.aClass21_Sub3_20.method17433();
	}

	@OriginalMember(owner = "client!ads", name = "ap", descriptor = "()Z", line = 27)
	boolean method8191() {
		return this.aClass21_Sub3_20.aBoolean443 && this.aClass21_Sub3_20.method17433();
	}

	@OriginalMember(owner = "client!ads", name = "ab", descriptor = "()Z", line = 27)
	boolean method8192() {
		return this.aClass21_Sub3_20.aBoolean443 && this.aClass21_Sub3_20.method17433();
	}

	@OriginalMember(owner = "client!ads", name = "ao", descriptor = "()Z", line = 27)
	boolean method8193() {
		return this.aClass21_Sub3_20.aBoolean443 && this.aClass21_Sub3_20.method17433();
	}

	@OriginalMember(owner = "client!ads", name = "au", descriptor = "()Z", line = 27)
	boolean method8194() {
		return this.aClass21_Sub3_20.aBoolean443 && this.aClass21_Sub3_20.method17433();
	}

	@OriginalMember(owner = "client!ads", name = "p", descriptor = "()Z", line = 31)
	@Override
	boolean method8196() {
		return this.aBoolean181;
	}

	@OriginalMember(owner = "client!ads", name = "av", descriptor = "()Z", line = 31)
	@Override
	boolean method8232() {
		return this.aBoolean181;
	}

	@OriginalMember(owner = "client!ads", name = "n", descriptor = "()Z", line = 35)
	@Override
	boolean method8195() {
		if (!this.method8190()) {
			return false;
		}
		this.aClass24_5 = this.aClass21_Sub3_20.method17435("FilterColourRemapping");
		if (this.aClass24_5 == null) {
			return false;
		}
		try {
			this.aClass3_Sub19_Sub1_26 = this.aClass24_5.method6583("sceneTex");
			this.aClass25Array6 = new Class25[3];
			this.aClass3_Sub19_Sub1Array1 = new Class3_Sub19_Sub1[3];
			if (this.aClass21_Sub3_20.aBoolean438) {
				this.aClass25Array6[0] = this.aClass24_5.method6555("techRemap3D_1");
				this.aClass25Array6[1] = this.aClass24_5.method6555("techRemap3D_2");
				this.aClass25Array6[2] = this.aClass24_5.method6555("techRemap3D_3");
				this.aClass3_Sub19_Sub1Array1[0] = this.aClass24_5.method6583("remapTex3D_1");
				this.aClass3_Sub19_Sub1Array1[1] = this.aClass24_5.method6583("remapTex3D_2");
				this.aClass3_Sub19_Sub1Array1[2] = this.aClass24_5.method6583("remapTex3D_3");
			} else {
				this.aClass25Array6[0] = this.aClass24_5.method6555("techRemap2D_1");
				this.aClass25Array6[1] = this.aClass24_5.method6555("techRemap2D_2");
				this.aClass25Array6[2] = this.aClass24_5.method6555("techRemap2D_3");
				this.aClass3_Sub19_Sub1Array1[0] = this.aClass24_5.method6583("remapTex2D_1");
				this.aClass3_Sub19_Sub1Array1[1] = this.aClass24_5.method6583("remapTex2D_2");
				this.aClass3_Sub19_Sub1Array1[2] = this.aClass24_5.method6583("remapTex2D_3");
			}
			this.aClass3_Sub19_Sub1_24 = this.aClass24_5.method6583("paramsWeightings");
			this.aClass3_Sub19_Sub1_25 = this.aClass24_5.method6583("pixelOffset");
			this.aClass3_Sub19_Sub1_23 = this.aClass24_5.method6583("PosAndTexCoords");
		} catch (@Pc(164) Exception_Sub1_Sub1 local164) {
			return false;
		} catch (@Pc(167) Exception_Sub1_Sub2 local167) {
			return false;
		}
		if (this.aClass25Array6[0].method6418() && this.aClass25Array6[1].method6418() && this.aClass25Array6[2].method6418()) {
			this.aBoolean181 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ads", name = "e", descriptor = "()Z", line = 35)
	@Override
	boolean method8210() {
		if (!this.method8190()) {
			return false;
		}
		this.aClass24_5 = this.aClass21_Sub3_20.method17435("FilterColourRemapping");
		if (this.aClass24_5 == null) {
			return false;
		}
		try {
			this.aClass3_Sub19_Sub1_26 = this.aClass24_5.method6583("sceneTex");
			this.aClass25Array6 = new Class25[3];
			this.aClass3_Sub19_Sub1Array1 = new Class3_Sub19_Sub1[3];
			if (this.aClass21_Sub3_20.aBoolean438) {
				this.aClass25Array6[0] = this.aClass24_5.method6555("techRemap3D_1");
				this.aClass25Array6[1] = this.aClass24_5.method6555("techRemap3D_2");
				this.aClass25Array6[2] = this.aClass24_5.method6555("techRemap3D_3");
				this.aClass3_Sub19_Sub1Array1[0] = this.aClass24_5.method6583("remapTex3D_1");
				this.aClass3_Sub19_Sub1Array1[1] = this.aClass24_5.method6583("remapTex3D_2");
				this.aClass3_Sub19_Sub1Array1[2] = this.aClass24_5.method6583("remapTex3D_3");
			} else {
				this.aClass25Array6[0] = this.aClass24_5.method6555("techRemap2D_1");
				this.aClass25Array6[1] = this.aClass24_5.method6555("techRemap2D_2");
				this.aClass25Array6[2] = this.aClass24_5.method6555("techRemap2D_3");
				this.aClass3_Sub19_Sub1Array1[0] = this.aClass24_5.method6583("remapTex2D_1");
				this.aClass3_Sub19_Sub1Array1[1] = this.aClass24_5.method6583("remapTex2D_2");
				this.aClass3_Sub19_Sub1Array1[2] = this.aClass24_5.method6583("remapTex2D_3");
			}
			this.aClass3_Sub19_Sub1_24 = this.aClass24_5.method6583("paramsWeightings");
			this.aClass3_Sub19_Sub1_25 = this.aClass24_5.method6583("pixelOffset");
			this.aClass3_Sub19_Sub1_23 = this.aClass24_5.method6583("PosAndTexCoords");
		} catch (@Pc(164) Exception_Sub1_Sub1 local164) {
			return false;
		} catch (@Pc(167) Exception_Sub1_Sub2 local167) {
			return false;
		}
		if (this.aClass25Array6[0].method6418() && this.aClass25Array6[1].method6418() && this.aClass25Array6[2].method6418()) {
			this.aBoolean181 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ads", name = "a", descriptor = "()Z", line = 35)
	@Override
	boolean method8197() {
		if (!this.method8190()) {
			return false;
		}
		this.aClass24_5 = this.aClass21_Sub3_20.method17435("FilterColourRemapping");
		if (this.aClass24_5 == null) {
			return false;
		}
		try {
			this.aClass3_Sub19_Sub1_26 = this.aClass24_5.method6583("sceneTex");
			this.aClass25Array6 = new Class25[3];
			this.aClass3_Sub19_Sub1Array1 = new Class3_Sub19_Sub1[3];
			if (this.aClass21_Sub3_20.aBoolean438) {
				this.aClass25Array6[0] = this.aClass24_5.method6555("techRemap3D_1");
				this.aClass25Array6[1] = this.aClass24_5.method6555("techRemap3D_2");
				this.aClass25Array6[2] = this.aClass24_5.method6555("techRemap3D_3");
				this.aClass3_Sub19_Sub1Array1[0] = this.aClass24_5.method6583("remapTex3D_1");
				this.aClass3_Sub19_Sub1Array1[1] = this.aClass24_5.method6583("remapTex3D_2");
				this.aClass3_Sub19_Sub1Array1[2] = this.aClass24_5.method6583("remapTex3D_3");
			} else {
				this.aClass25Array6[0] = this.aClass24_5.method6555("techRemap2D_1");
				this.aClass25Array6[1] = this.aClass24_5.method6555("techRemap2D_2");
				this.aClass25Array6[2] = this.aClass24_5.method6555("techRemap2D_3");
				this.aClass3_Sub19_Sub1Array1[0] = this.aClass24_5.method6583("remapTex2D_1");
				this.aClass3_Sub19_Sub1Array1[1] = this.aClass24_5.method6583("remapTex2D_2");
				this.aClass3_Sub19_Sub1Array1[2] = this.aClass24_5.method6583("remapTex2D_3");
			}
			this.aClass3_Sub19_Sub1_24 = this.aClass24_5.method6583("paramsWeightings");
			this.aClass3_Sub19_Sub1_25 = this.aClass24_5.method6583("pixelOffset");
			this.aClass3_Sub19_Sub1_23 = this.aClass24_5.method6583("PosAndTexCoords");
		} catch (@Pc(164) Exception_Sub1_Sub1 local164) {
			return false;
		} catch (@Pc(167) Exception_Sub1_Sub2 local167) {
			return false;
		}
		if (this.aClass25Array6[0].method6418() && this.aClass25Array6[1].method6418() && this.aClass25Array6[2].method6418()) {
			this.aBoolean181 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ads", name = "h", descriptor = "(II)V", line = 79)
	@Override
	void method8200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ads", name = "w", descriptor = "(II)V", line = 79)
	@Override
	void method8217() {
	}

	@OriginalMember(owner = "client!ads", name = "t", descriptor = "(II)V", line = 79)
	@Override
	void method8216() {
	}

	@OriginalMember(owner = "client!ads", name = "o", descriptor = "(II)V", line = 79)
	@Override
	void method8202() {
	}

	@OriginalMember(owner = "client!ads", name = "l", descriptor = "()V", line = 80)
	@Override
	void method8199() {
	}

	@OriginalMember(owner = "client!ads", name = "m", descriptor = "()V", line = 80)
	@Override
	void method8214() {
	}

	@OriginalMember(owner = "client!ads", name = "v", descriptor = "()V", line = 80)
	@Override
	void method8215() {
	}

	@OriginalMember(owner = "client!ads", name = "af", descriptor = "()I", line = 83)
	@Override
	int method8223() {
		return 1;
	}

	@OriginalMember(owner = "client!ads", name = "ak", descriptor = "()I", line = 83)
	@Override
	int method8201() {
		return 1;
	}

	@OriginalMember(owner = "client!ads", name = "aa", descriptor = "()I", line = 83)
	@Override
	int method8225() {
		return 1;
	}

	@OriginalMember(owner = "client!ads", name = "u", descriptor = "()I", line = 83)
	@Override
	int method8203() {
		return 1;
	}

	@OriginalMember(owner = "client!ads", name = "x", descriptor = "(ILclient!abj;Lclient!ic;Lclient!dr;Lclient!ic;Z)V", line = 87)
	@Override
	void method8198(@OriginalArg(0) int arg0, @OriginalArg(1) Class19_Sub1 arg1, @OriginalArg(2) Interface20 arg2, @OriginalArg(3) Interface13 arg3, @OriginalArg(4) Interface20 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass21_Sub3_20.method17577();
		@Pc(7) float local7 = (float) arg1.method21390();
		@Pc(11) float local11 = (float) arg1.method21391();
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass21_Sub3_20.method17038().method21390() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass21_Sub3_20.method17038().method21391() : local95;
		@Pc(122) Class25 local122 = this.aClass25Array6[anInt879 - 1];
		this.aClass24_5.method6560(local122);
		this.aClass24_5.method6550();
		this.aClass24_5.method6567(this.aClass3_Sub19_Sub1_24, aFloat128, aFloatArray52[0], aFloatArray52[1], aFloatArray52[2]);
		for (@Pc(152) int local152 = 0; local152 < anInt879; local152++) {
			if (aClass16_Sub2Array1[local152] != null) {
				@Pc(164) Class3_Sub19_Sub1 local164 = this.aClass3_Sub19_Sub1Array1[local152];
				@Pc(169) Interface28 local169 = aClass16_Sub2Array1[local152].method1680();
				this.aClass24_5.method6622(local164, local152 + 1, local169);
			}
		}
		@Pc(185) float local185 = (float) local92 / local7;
		@Pc(190) float local190 = (float) local95 / local11;
		@Pc(195) float local195 = (float) local105 / local7;
		@Pc(200) float local200 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local185 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local190 + 1.0F;
		local89[10] *= local195;
		local89[7] *= local200;
		this.aClass24_5.method6605(this.aClass3_Sub19_Sub1_23, local89);
		this.aClass24_5.method6622(this.aClass3_Sub19_Sub1_26, 0, arg2);
		this.aClass24_5.method6567(this.aClass3_Sub19_Sub1_25, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass21_Sub3_20.method17054(0, 0, local92, local95);
		this.aClass21_Sub3_20.method17079(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ads", name = "i", descriptor = "(ILclient!abj;Lclient!ic;Lclient!dr;Lclient!ic;Z)V", line = 87)
	@Override
	void method8219(@OriginalArg(0) int arg0, @OriginalArg(1) Class19_Sub1 arg1, @OriginalArg(2) Interface20 arg2, @OriginalArg(3) Interface13 arg3, @OriginalArg(4) Interface20 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass21_Sub3_20.method17577();
		@Pc(7) float local7 = (float) arg1.method21390();
		@Pc(11) float local11 = (float) arg1.method21391();
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass21_Sub3_20.method17038().method21390() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass21_Sub3_20.method17038().method21391() : local95;
		@Pc(122) Class25 local122 = this.aClass25Array6[anInt879 - 1];
		this.aClass24_5.method6560(local122);
		this.aClass24_5.method6550();
		this.aClass24_5.method6567(this.aClass3_Sub19_Sub1_24, aFloat128, aFloatArray52[0], aFloatArray52[1], aFloatArray52[2]);
		for (@Pc(152) int local152 = 0; local152 < anInt879; local152++) {
			if (aClass16_Sub2Array1[local152] != null) {
				@Pc(164) Class3_Sub19_Sub1 local164 = this.aClass3_Sub19_Sub1Array1[local152];
				@Pc(169) Interface28 local169 = aClass16_Sub2Array1[local152].method1680();
				this.aClass24_5.method6622(local164, local152 + 1, local169);
			}
		}
		@Pc(185) float local185 = (float) local92 / local7;
		@Pc(190) float local190 = (float) local95 / local11;
		@Pc(195) float local195 = (float) local105 / local7;
		@Pc(200) float local200 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local185 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local190 + 1.0F;
		local89[10] *= local195;
		local89[7] *= local200;
		this.aClass24_5.method6605(this.aClass3_Sub19_Sub1_23, local89);
		this.aClass24_5.method6622(this.aClass3_Sub19_Sub1_26, 0, arg2);
		this.aClass24_5.method6567(this.aClass3_Sub19_Sub1_25, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass21_Sub3_20.method17054(0, 0, local92, local95);
		this.aClass21_Sub3_20.method17079(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ads", name = "s", descriptor = "(I)V", line = 127)
	@Override
	void method8209(@OriginalArg(0) int arg0) {
		this.aClass24_5.method6551();
	}

	@OriginalMember(owner = "client!ads", name = "f", descriptor = "(I)V", line = 127)
	@Override
	void method8212() {
		this.aClass24_5.method6551();
	}

	@OriginalMember(owner = "client!ads", name = "at", descriptor = "(I)V", line = 127)
	@Override
	void method8222() {
		this.aClass24_5.method6551();
	}

	@OriginalMember(owner = "client!ads", name = "k", descriptor = "(I)V", line = 127)
	@Override
	void method8221() {
		this.aClass24_5.method6551();
	}

	@OriginalMember(owner = "client!ads", name = "ah", descriptor = "()I", line = 131)
	@Override
	int method8226() {
		return 0;
	}

	@OriginalMember(owner = "client!ads", name = "an", descriptor = "()I", line = 131)
	@Override
	int method8227() {
		return 0;
	}

	@OriginalMember(owner = "client!ads", name = "b", descriptor = "()I", line = 131)
	@Override
	int method8205() {
		return 0;
	}

	@OriginalMember(owner = "client!ads", name = "ax", descriptor = "()I", line = 135)
	@Override
	int method8229() {
		return 2;
	}

	@OriginalMember(owner = "client!ads", name = "y", descriptor = "()I", line = 135)
	@Override
	int method8204() {
		return 2;
	}

	@OriginalMember(owner = "client!ads", name = "az", descriptor = "()I", line = 135)
	@Override
	int method8224() {
		return 2;
	}

	@OriginalMember(owner = "client!ads", name = "aq", descriptor = "()Z", line = 139)
	@Override
	boolean method8231() {
		return aFloat128 == 1.0F || aFloatArray52[0] + aFloatArray52[1] + aFloatArray52[2] == 0.0F || aClass16_Sub2Array1[0] == null && aClass16_Sub2Array1[1] == null && aClass16_Sub2Array1[2] == null;
	}

	@OriginalMember(owner = "client!ads", name = "j", descriptor = "()Z", line = 139)
	@Override
	boolean method8208() {
		return aFloat128 == 1.0F || aFloatArray52[0] + aFloatArray52[1] + aFloatArray52[2] == 0.0F || aClass16_Sub2Array1[0] == null && aClass16_Sub2Array1[1] == null && aClass16_Sub2Array1[2] == null;
	}

	@OriginalMember(owner = "client!ads", name = "ai", descriptor = "()Z", line = 139)
	@Override
	boolean method8230() {
		return aFloat128 == 1.0F || aFloatArray52[0] + aFloatArray52[1] + aFloatArray52[2] == 0.0F || aClass16_Sub2Array1[0] == null && aClass16_Sub2Array1[1] == null && aClass16_Sub2Array1[2] == null;
	}
}
