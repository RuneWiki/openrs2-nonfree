package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adt")
public class Class38_Sub3 extends Class38 {

	@OriginalMember(owner = "client!adt", name = "b", descriptor = "F")
	public static float aFloat129 = 1.0F;

	@OriginalMember(owner = "client!adt", name = "c", descriptor = "F")
	public static float aFloat131 = 0.0F;

	@OriginalMember(owner = "client!adt", name = "z", descriptor = "F")
	public static float aFloat132 = 1.0F;

	@OriginalMember(owner = "client!adt", name = "j", descriptor = "F")
	public static float aFloat133 = 0.0F;

	@OriginalMember(owner = "client!adt", name = "n", descriptor = "F")
	public static float aFloat130 = 1.0F;

	@OriginalMember(owner = "client!adt", name = "g", descriptor = "Lclient!fc;")
	Class24 aClass24_6;

	@OriginalMember(owner = "client!adt", name = "x", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_27;

	@OriginalMember(owner = "client!adt", name = "h", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_28;

	@OriginalMember(owner = "client!adt", name = "u", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_29;

	@OriginalMember(owner = "client!adt", name = "l", descriptor = "Lclient!fk;")
	Class25 aClass25_6;

	@OriginalMember(owner = "client!adt", name = "s", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_30;

	@OriginalMember(owner = "client!adt", name = "y", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_31;

	@OriginalMember(owner = "client!adt", name = "e", descriptor = "Z")
	boolean aBoolean183;

	@OriginalMember(owner = "client!adt", name = "<init>", descriptor = "(Lclient!abv;)V", line = 24)
	public Class38_Sub3(@OriginalArg(0) Class21_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!adt", name = "al", descriptor = "()Z", line = 28)
	boolean method8234() {
		return this.aClass21_Sub3_20.aBoolean443 && this.aClass21_Sub3_20.method17433();
	}

	@OriginalMember(owner = "client!adt", name = "ao", descriptor = "()Z", line = 28)
	boolean method8235() {
		return this.aClass21_Sub3_20.aBoolean443 && this.aClass21_Sub3_20.method17433();
	}

	@OriginalMember(owner = "client!adt", name = "ap", descriptor = "()Z", line = 28)
	boolean method8236() {
		return this.aClass21_Sub3_20.aBoolean443 && this.aClass21_Sub3_20.method17433();
	}

	@OriginalMember(owner = "client!adt", name = "ab", descriptor = "()Z", line = 28)
	boolean method8237() {
		return this.aClass21_Sub3_20.aBoolean443 && this.aClass21_Sub3_20.method17433();
	}

	@OriginalMember(owner = "client!adt", name = "av", descriptor = "()Z", line = 32)
	@Override
	boolean method8232() {
		return this.aBoolean183;
	}

	@OriginalMember(owner = "client!adt", name = "p", descriptor = "()Z", line = 32)
	@Override
	boolean method8196() {
		return this.aBoolean183;
	}

	@OriginalMember(owner = "client!adt", name = "a", descriptor = "()Z", line = 36)
	@Override
	boolean method8197() {
		if (!this.method8234()) {
			return false;
		}
		this.aClass24_6 = this.aClass21_Sub3_20.method17435("FilterLevels");
		if (this.aClass24_6 == null) {
			return false;
		}
		try {
			this.aClass3_Sub19_Sub1_28 = this.aClass24_6.method6583("sceneTex");
			this.aClass3_Sub19_Sub1_27 = this.aClass24_6.method6583("paramsGamma");
			this.aClass3_Sub19_Sub1_30 = this.aClass24_6.method6583("paramsRanges");
			this.aClass3_Sub19_Sub1_29 = this.aClass24_6.method6583("pixelOffset");
			this.aClass3_Sub19_Sub1_31 = this.aClass24_6.method6583("PosAndTexCoords");
			this.aClass25_6 = this.aClass24_6.method6555("techAdjust");
		} catch (@Pc(57) Exception_Sub1_Sub1 local57) {
			return false;
		} catch (@Pc(60) Exception_Sub1_Sub2 local60) {
			return false;
		}
		if (this.aClass25_6.method6418()) {
			this.aBoolean183 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!adt", name = "e", descriptor = "()Z", line = 36)
	@Override
	boolean method8210() {
		if (!this.method8234()) {
			return false;
		}
		this.aClass24_6 = this.aClass21_Sub3_20.method17435("FilterLevels");
		if (this.aClass24_6 == null) {
			return false;
		}
		try {
			this.aClass3_Sub19_Sub1_28 = this.aClass24_6.method6583("sceneTex");
			this.aClass3_Sub19_Sub1_27 = this.aClass24_6.method6583("paramsGamma");
			this.aClass3_Sub19_Sub1_30 = this.aClass24_6.method6583("paramsRanges");
			this.aClass3_Sub19_Sub1_29 = this.aClass24_6.method6583("pixelOffset");
			this.aClass3_Sub19_Sub1_31 = this.aClass24_6.method6583("PosAndTexCoords");
			this.aClass25_6 = this.aClass24_6.method6555("techAdjust");
		} catch (@Pc(57) Exception_Sub1_Sub1 local57) {
			return false;
		} catch (@Pc(60) Exception_Sub1_Sub2 local60) {
			return false;
		}
		if (this.aClass25_6.method6418()) {
			this.aBoolean183 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!adt", name = "n", descriptor = "()Z", line = 36)
	@Override
	boolean method8195() {
		if (!this.method8234()) {
			return false;
		}
		this.aClass24_6 = this.aClass21_Sub3_20.method17435("FilterLevels");
		if (this.aClass24_6 == null) {
			return false;
		}
		try {
			this.aClass3_Sub19_Sub1_28 = this.aClass24_6.method6583("sceneTex");
			this.aClass3_Sub19_Sub1_27 = this.aClass24_6.method6583("paramsGamma");
			this.aClass3_Sub19_Sub1_30 = this.aClass24_6.method6583("paramsRanges");
			this.aClass3_Sub19_Sub1_29 = this.aClass24_6.method6583("pixelOffset");
			this.aClass3_Sub19_Sub1_31 = this.aClass24_6.method6583("PosAndTexCoords");
			this.aClass25_6 = this.aClass24_6.method6555("techAdjust");
		} catch (@Pc(57) Exception_Sub1_Sub1 local57) {
			return false;
		} catch (@Pc(60) Exception_Sub1_Sub2 local60) {
			return false;
		}
		if (this.aClass25_6.method6418()) {
			this.aBoolean183 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!adt", name = "h", descriptor = "(II)V", line = 64)
	@Override
	void method8200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!adt", name = "t", descriptor = "(II)V", line = 64)
	@Override
	void method8216() {
	}

	@OriginalMember(owner = "client!adt", name = "w", descriptor = "(II)V", line = 64)
	@Override
	void method8217() {
	}

	@OriginalMember(owner = "client!adt", name = "o", descriptor = "(II)V", line = 64)
	@Override
	void method8202() {
	}

	@OriginalMember(owner = "client!adt", name = "l", descriptor = "()V", line = 65)
	@Override
	void method8199() {
	}

	@OriginalMember(owner = "client!adt", name = "m", descriptor = "()V", line = 65)
	@Override
	void method8214() {
	}

	@OriginalMember(owner = "client!adt", name = "v", descriptor = "()V", line = 65)
	@Override
	void method8215() {
	}

	@OriginalMember(owner = "client!adt", name = "u", descriptor = "()I", line = 68)
	@Override
	int method8203() {
		return 1;
	}

	@OriginalMember(owner = "client!adt", name = "af", descriptor = "()I", line = 68)
	@Override
	int method8223() {
		return 1;
	}

	@OriginalMember(owner = "client!adt", name = "ak", descriptor = "()I", line = 68)
	@Override
	int method8201() {
		return 1;
	}

	@OriginalMember(owner = "client!adt", name = "aa", descriptor = "()I", line = 68)
	@Override
	int method8225() {
		return 1;
	}

	@OriginalMember(owner = "client!adt", name = "x", descriptor = "(ILclient!abj;Lclient!ic;Lclient!dr;Lclient!ic;Z)V", line = 72)
	@Override
	void method8198(@OriginalArg(0) int arg0, @OriginalArg(1) Class19_Sub1 arg1, @OriginalArg(2) Interface20 arg2, @OriginalArg(3) Interface13 arg3, @OriginalArg(4) Interface20 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass21_Sub3_20.method17577();
		@Pc(7) float local7 = (float) arg1.method21390();
		@Pc(11) float local11 = (float) arg1.method21391();
		@Pc(17) float local17 = local3 * 2.0F / local7;
		@Pc(24) float local24 = -local3 * 2.0F / local11;
		@Pc(87) float[] local87 = new float[] { -1.0F + local17, local24 + 1.0F, 0.0F, 0.0F, -1.0F + local17, -3.0F + local24, 0.0F, 2.0F, local17 + 3.0F, local24 + 1.0F, 2.0F, 0.0F };
		@Pc(90) int local90 = (int) local7;
		@Pc(93) int local93 = (int) local11;
		@Pc(103) int local103 = arg5 ? this.aClass21_Sub3_20.method17038().method21390() : local90;
		@Pc(113) int local113 = arg5 ? this.aClass21_Sub3_20.method17038().method21391() : local93;
		this.aClass24_6.method6560(this.aClass25_6);
		this.aClass24_6.method6550();
		@Pc(127) float local127 = (float) local90 / local7;
		@Pc(132) float local132 = (float) local93 / local11;
		@Pc(137) float local137 = (float) local103 / local7;
		@Pc(142) float local142 = (float) local113 / local11;
		local87[8] = (local87[8] + 1.0F) * local127 - 1.0F;
		local87[5] = (local87[5] - 1.0F) * local132 + 1.0F;
		local87[10] *= local137;
		local87[7] *= local142;
		this.aClass24_6.method6605(this.aClass3_Sub19_Sub1_31, local87);
		this.aClass24_6.method6622(this.aClass3_Sub19_Sub1_28, 0, arg2);
		this.aClass24_6.method6564(this.aClass3_Sub19_Sub1_27, aFloat129);
		this.aClass24_6.method6567(this.aClass3_Sub19_Sub1_30, aFloat131, aFloat132, aFloat133, aFloat130);
		this.aClass24_6.method6567(this.aClass3_Sub19_Sub1_29, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass21_Sub3_20.method17054(0, 0, local90, local93);
		this.aClass21_Sub3_20.method17079(0, 0, local90, local93);
	}

	@OriginalMember(owner = "client!adt", name = "i", descriptor = "(ILclient!abj;Lclient!ic;Lclient!dr;Lclient!ic;Z)V", line = 72)
	@Override
	void method8219(@OriginalArg(0) int arg0, @OriginalArg(1) Class19_Sub1 arg1, @OriginalArg(2) Interface20 arg2, @OriginalArg(3) Interface13 arg3, @OriginalArg(4) Interface20 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass21_Sub3_20.method17577();
		@Pc(7) float local7 = (float) arg1.method21390();
		@Pc(11) float local11 = (float) arg1.method21391();
		@Pc(17) float local17 = local3 * 2.0F / local7;
		@Pc(24) float local24 = -local3 * 2.0F / local11;
		@Pc(87) float[] local87 = new float[] { -1.0F + local17, local24 + 1.0F, 0.0F, 0.0F, -1.0F + local17, -3.0F + local24, 0.0F, 2.0F, local17 + 3.0F, local24 + 1.0F, 2.0F, 0.0F };
		@Pc(90) int local90 = (int) local7;
		@Pc(93) int local93 = (int) local11;
		@Pc(103) int local103 = arg5 ? this.aClass21_Sub3_20.method17038().method21390() : local90;
		@Pc(113) int local113 = arg5 ? this.aClass21_Sub3_20.method17038().method21391() : local93;
		this.aClass24_6.method6560(this.aClass25_6);
		this.aClass24_6.method6550();
		@Pc(127) float local127 = (float) local90 / local7;
		@Pc(132) float local132 = (float) local93 / local11;
		@Pc(137) float local137 = (float) local103 / local7;
		@Pc(142) float local142 = (float) local113 / local11;
		local87[8] = (local87[8] + 1.0F) * local127 - 1.0F;
		local87[5] = (local87[5] - 1.0F) * local132 + 1.0F;
		local87[10] *= local137;
		local87[7] *= local142;
		this.aClass24_6.method6605(this.aClass3_Sub19_Sub1_31, local87);
		this.aClass24_6.method6622(this.aClass3_Sub19_Sub1_28, 0, arg2);
		this.aClass24_6.method6564(this.aClass3_Sub19_Sub1_27, aFloat129);
		this.aClass24_6.method6567(this.aClass3_Sub19_Sub1_30, aFloat131, aFloat132, aFloat133, aFloat130);
		this.aClass24_6.method6567(this.aClass3_Sub19_Sub1_29, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass21_Sub3_20.method17054(0, 0, local90, local93);
		this.aClass21_Sub3_20.method17079(0, 0, local90, local93);
	}

	@OriginalMember(owner = "client!adt", name = "s", descriptor = "(I)V", line = 102)
	@Override
	void method8209(@OriginalArg(0) int arg0) {
		this.aClass24_6.method6551();
	}

	@OriginalMember(owner = "client!adt", name = "k", descriptor = "(I)V", line = 102)
	@Override
	void method8221() {
		this.aClass24_6.method6551();
	}

	@OriginalMember(owner = "client!adt", name = "f", descriptor = "(I)V", line = 102)
	@Override
	void method8212() {
		this.aClass24_6.method6551();
	}

	@OriginalMember(owner = "client!adt", name = "at", descriptor = "(I)V", line = 102)
	@Override
	void method8222() {
		this.aClass24_6.method6551();
	}

	@OriginalMember(owner = "client!adt", name = "ah", descriptor = "()I", line = 106)
	@Override
	int method8226() {
		return 0;
	}

	@OriginalMember(owner = "client!adt", name = "b", descriptor = "()I", line = 106)
	@Override
	int method8205() {
		return 0;
	}

	@OriginalMember(owner = "client!adt", name = "an", descriptor = "()I", line = 106)
	@Override
	int method8227() {
		return 0;
	}

	@OriginalMember(owner = "client!adt", name = "y", descriptor = "()I", line = 110)
	@Override
	int method8204() {
		return 1;
	}

	@OriginalMember(owner = "client!adt", name = "ax", descriptor = "()I", line = 110)
	@Override
	int method8229() {
		return 1;
	}

	@OriginalMember(owner = "client!adt", name = "az", descriptor = "()I", line = 110)
	@Override
	int method8224() {
		return 1;
	}

	@OriginalMember(owner = "client!adt", name = "aq", descriptor = "()Z", line = 114)
	@Override
	boolean method8231() {
		return aFloat129 == 1.0F && aFloat131 == 0.0F && aFloat132 == 1.0F && aFloat133 == 0.0F && aFloat130 == 1.0F;
	}

	@OriginalMember(owner = "client!adt", name = "ai", descriptor = "()Z", line = 114)
	@Override
	boolean method8230() {
		return aFloat129 == 1.0F && aFloat131 == 0.0F && aFloat132 == 1.0F && aFloat133 == 0.0F && aFloat130 == 1.0F;
	}

	@OriginalMember(owner = "client!adt", name = "j", descriptor = "()Z", line = 114)
	@Override
	boolean method8208() {
		return aFloat129 == 1.0F && aFloat131 == 0.0F && aFloat132 == 1.0F && aFloat133 == 0.0F && aFloat130 == 1.0F;
	}
}
