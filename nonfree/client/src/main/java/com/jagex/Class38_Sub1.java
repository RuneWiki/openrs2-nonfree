package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adn")
public class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!adn", name = "g", descriptor = "I")
	static final int anInt849 = 256;

	@OriginalMember(owner = "client!adn", name = "l", descriptor = "F")
	public static float aFloat122 = 0.25F;

	@OriginalMember(owner = "client!adn", name = "h", descriptor = "F")
	public static float aFloat125 = 1.0F;

	@OriginalMember(owner = "client!adn", name = "x", descriptor = "F")
	public static float aFloat123 = 1.0F;

	@OriginalMember(owner = "client!adn", name = "s", descriptor = "F")
	public static float aFloat124 = 1.0F;

	@OriginalMember(owner = "client!adn", name = "c", descriptor = "Lclient!fk;")
	Class25 aClass25_1;

	@OriginalMember(owner = "client!adn", name = "v", descriptor = "Z")
	boolean aBoolean177;

	@OriginalMember(owner = "client!adn", name = "u", descriptor = "Lclient!fc;")
	Class24 aClass24_3;

	@OriginalMember(owner = "client!adn", name = "q", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_1;

	@OriginalMember(owner = "client!adn", name = "b", descriptor = "Lclient!fk;")
	Class25 aClass25_2;

	@OriginalMember(owner = "client!adn", name = "z", descriptor = "Lclient!fk;")
	Class25 aClass25_3;

	@OriginalMember(owner = "client!adn", name = "m", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_2;

	@OriginalMember(owner = "client!adn", name = "n", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_3;

	@OriginalMember(owner = "client!adn", name = "e", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_4;

	@OriginalMember(owner = "client!adn", name = "r", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_5;

	@OriginalMember(owner = "client!adn", name = "d", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_6;

	@OriginalMember(owner = "client!adn", name = "j", descriptor = "Lclient!fk;")
	Class25 aClass25_4;

	@OriginalMember(owner = "client!adn", name = "y", descriptor = "Lclient!fk;")
	Class25 aClass25_5;

	@OriginalMember(owner = "client!adn", name = "<init>", descriptor = "(Lclient!abv;)V", line = 29)
	public Class38_Sub1(@OriginalArg(0) Class21_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!adn", name = "al", descriptor = "()Z", line = 33)
	boolean method7946() {
		return this.aClass21_Sub3_20.aBoolean443 && this.aClass21_Sub3_20.method17433();
	}

	@OriginalMember(owner = "client!adn", name = "ao", descriptor = "()Z", line = 33)
	boolean method7947() {
		return this.aClass21_Sub3_20.aBoolean443 && this.aClass21_Sub3_20.method17433();
	}

	@OriginalMember(owner = "client!adn", name = "ap", descriptor = "()Z", line = 33)
	boolean method7948() {
		return this.aClass21_Sub3_20.aBoolean443 && this.aClass21_Sub3_20.method17433();
	}

	@OriginalMember(owner = "client!adn", name = "ab", descriptor = "()Z", line = 33)
	boolean method7949() {
		return this.aClass21_Sub3_20.aBoolean443 && this.aClass21_Sub3_20.method17433();
	}

	@OriginalMember(owner = "client!adn", name = "p", descriptor = "()Z", line = 37)
	@Override
	boolean method8196() {
		return this.aBoolean177;
	}

	@OriginalMember(owner = "client!adn", name = "av", descriptor = "()Z", line = 37)
	@Override
	boolean method8232() {
		return this.aBoolean177;
	}

	@OriginalMember(owner = "client!adn", name = "n", descriptor = "()Z", line = 41)
	@Override
	boolean method8195() {
		if (!this.method7946()) {
			return false;
		}
		this.aClass24_3 = this.aClass21_Sub3_20.method17435("FilterBloom");
		if (this.aClass24_3 == null) {
			return false;
		}
		try {
			this.aClass3_Sub19_Sub1_3 = this.aClass24_3.method6583("sceneTex");
			this.aClass3_Sub19_Sub1_4 = this.aClass24_3.method6583("bloomTex1");
			this.aClass3_Sub19_Sub1_5 = this.aClass24_3.method6583("params");
			this.aClass3_Sub19_Sub1_6 = this.aClass24_3.method6583("sampleSize");
			this.aClass3_Sub19_Sub1_1 = this.aClass24_3.method6583("pixelOffsetAndBloomScale");
			this.aClass3_Sub19_Sub1_2 = this.aClass24_3.method6583("PosAndTexCoords");
			this.aClass24_3.method6555("test");
			this.aClass25_5 = this.aClass24_3.method6555("techFullscreenTri");
			this.aClass25_2 = this.aClass24_3.method6555("brightpass");
			this.aClass25_1 = this.aClass24_3.method6555("blur");
			this.aClass25_3 = this.aClass24_3.method6555("composite");
			this.aClass25_4 = this.aClass24_3.method6555("techDefault");
		} catch (@Pc(98) Exception_Sub1_Sub1 local98) {
			return false;
		} catch (@Pc(101) Exception_Sub1_Sub2 local101) {
			return false;
		}
		if (!this.aClass25_5.method6418()) {
			return false;
		} else if (!this.aClass25_2.method6418()) {
			return false;
		} else if (!this.aClass25_1.method6418()) {
			return false;
		} else if (!this.aClass25_3.method6418()) {
			return false;
		} else if (this.aClass25_4.method6418()) {
			this.aBoolean177 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!adn", name = "e", descriptor = "()Z", line = 41)
	@Override
	boolean method8210() {
		if (!this.method7946()) {
			return false;
		}
		this.aClass24_3 = this.aClass21_Sub3_20.method17435("FilterBloom");
		if (this.aClass24_3 == null) {
			return false;
		}
		try {
			this.aClass3_Sub19_Sub1_3 = this.aClass24_3.method6583("sceneTex");
			this.aClass3_Sub19_Sub1_4 = this.aClass24_3.method6583("bloomTex1");
			this.aClass3_Sub19_Sub1_5 = this.aClass24_3.method6583("params");
			this.aClass3_Sub19_Sub1_6 = this.aClass24_3.method6583("sampleSize");
			this.aClass3_Sub19_Sub1_1 = this.aClass24_3.method6583("pixelOffsetAndBloomScale");
			this.aClass3_Sub19_Sub1_2 = this.aClass24_3.method6583("PosAndTexCoords");
			this.aClass24_3.method6555("test");
			this.aClass25_5 = this.aClass24_3.method6555("techFullscreenTri");
			this.aClass25_2 = this.aClass24_3.method6555("brightpass");
			this.aClass25_1 = this.aClass24_3.method6555("blur");
			this.aClass25_3 = this.aClass24_3.method6555("composite");
			this.aClass25_4 = this.aClass24_3.method6555("techDefault");
		} catch (@Pc(98) Exception_Sub1_Sub1 local98) {
			return false;
		} catch (@Pc(101) Exception_Sub1_Sub2 local101) {
			return false;
		}
		if (!this.aClass25_5.method6418()) {
			return false;
		} else if (!this.aClass25_2.method6418()) {
			return false;
		} else if (!this.aClass25_1.method6418()) {
			return false;
		} else if (!this.aClass25_3.method6418()) {
			return false;
		} else if (this.aClass25_4.method6418()) {
			this.aBoolean177 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!adn", name = "a", descriptor = "()Z", line = 41)
	@Override
	boolean method8197() {
		if (!this.method7946()) {
			return false;
		}
		this.aClass24_3 = this.aClass21_Sub3_20.method17435("FilterBloom");
		if (this.aClass24_3 == null) {
			return false;
		}
		try {
			this.aClass3_Sub19_Sub1_3 = this.aClass24_3.method6583("sceneTex");
			this.aClass3_Sub19_Sub1_4 = this.aClass24_3.method6583("bloomTex1");
			this.aClass3_Sub19_Sub1_5 = this.aClass24_3.method6583("params");
			this.aClass3_Sub19_Sub1_6 = this.aClass24_3.method6583("sampleSize");
			this.aClass3_Sub19_Sub1_1 = this.aClass24_3.method6583("pixelOffsetAndBloomScale");
			this.aClass3_Sub19_Sub1_2 = this.aClass24_3.method6583("PosAndTexCoords");
			this.aClass24_3.method6555("test");
			this.aClass25_5 = this.aClass24_3.method6555("techFullscreenTri");
			this.aClass25_2 = this.aClass24_3.method6555("brightpass");
			this.aClass25_1 = this.aClass24_3.method6555("blur");
			this.aClass25_3 = this.aClass24_3.method6555("composite");
			this.aClass25_4 = this.aClass24_3.method6555("techDefault");
		} catch (@Pc(98) Exception_Sub1_Sub1 local98) {
			return false;
		} catch (@Pc(101) Exception_Sub1_Sub2 local101) {
			return false;
		}
		if (!this.aClass25_5.method6418()) {
			return false;
		} else if (!this.aClass25_2.method6418()) {
			return false;
		} else if (!this.aClass25_1.method6418()) {
			return false;
		} else if (!this.aClass25_3.method6418()) {
			return false;
		} else if (this.aClass25_4.method6418()) {
			this.aBoolean177 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!adn", name = "h", descriptor = "(II)V", line = 77)
	@Override
	void method8200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!adn", name = "t", descriptor = "(II)V", line = 77)
	@Override
	void method8216() {
	}

	@OriginalMember(owner = "client!adn", name = "w", descriptor = "(II)V", line = 77)
	@Override
	void method8217() {
	}

	@OriginalMember(owner = "client!adn", name = "o", descriptor = "(II)V", line = 77)
	@Override
	void method8202() {
	}

	@OriginalMember(owner = "client!adn", name = "l", descriptor = "()V", line = 78)
	@Override
	void method8199() {
	}

	@OriginalMember(owner = "client!adn", name = "m", descriptor = "()V", line = 78)
	@Override
	void method8214() {
	}

	@OriginalMember(owner = "client!adn", name = "v", descriptor = "()V", line = 78)
	@Override
	void method8215() {
	}

	@OriginalMember(owner = "client!adn", name = "aa", descriptor = "()I", line = 81)
	@Override
	int method8225() {
		return 4;
	}

	@OriginalMember(owner = "client!adn", name = "u", descriptor = "()I", line = 81)
	@Override
	int method8203() {
		return 4;
	}

	@OriginalMember(owner = "client!adn", name = "af", descriptor = "()I", line = 81)
	@Override
	int method8223() {
		return 4;
	}

	@OriginalMember(owner = "client!adn", name = "ak", descriptor = "()I", line = 81)
	@Override
	int method8201() {
		return 4;
	}

	@OriginalMember(owner = "client!adn", name = "x", descriptor = "(ILclient!abj;Lclient!ic;Lclient!dr;Lclient!ic;Z)V", line = 85)
	@Override
	void method8198(@OriginalArg(0) int arg0, @OriginalArg(1) Class19_Sub1 arg1, @OriginalArg(2) Interface20 arg2, @OriginalArg(3) Interface13 arg3, @OriginalArg(4) Interface20 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass21_Sub3_20.method17577();
		@Pc(7) float local7 = (float) arg1.method21390();
		@Pc(11) float local11 = (float) arg1.method21391();
		@Pc(13) Interface20 local13 = arg2;
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass21_Sub3_20.method17038().method21390() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass21_Sub3_20.method17038().method21391() : local95;
		if (arg0 == 0) {
			local92 = 256;
			local95 = 256;
			this.aClass24_3.method6560(this.aClass25_2);
			this.aClass24_3.method6550();
		} else if (arg0 == 1) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass24_3.method6560(this.aClass25_1);
			this.aClass24_3.method6550();
			this.aClass24_3.method6588(this.aClass3_Sub19_Sub1_6, aFloat124 / local7, 0.0F);
		} else if (arg0 == 2) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass24_3.method6560(this.aClass25_1);
			this.aClass24_3.method6550();
			this.aClass24_3.method6588(this.aClass3_Sub19_Sub1_6, 0.0F, aFloat124 / local11);
		} else if (arg0 == 3) {
			this.aClass24_3.method6560(this.aClass25_3);
			local13 = arg4;
			this.aClass24_3.method6622(this.aClass3_Sub19_Sub1_4, 1, arg2);
			this.aClass24_3.method6550();
		}
		@Pc(220) float local220 = (float) local92 / local7;
		@Pc(225) float local225 = (float) local95 / local11;
		@Pc(230) float local230 = (float) local105 / local7;
		@Pc(235) float local235 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local220 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local225 + 1.0F;
		local89[10] *= local230;
		local89[7] *= local235;
		this.aClass24_3.method6605(this.aClass3_Sub19_Sub1_2, local89);
		this.aClass24_3.method6622(this.aClass3_Sub19_Sub1_3, 0, local13);
		this.aClass24_3.method6567(this.aClass3_Sub19_Sub1_5, aFloat123, aFloat122, aFloat125, 0.0F);
		this.aClass24_3.method6567(this.aClass3_Sub19_Sub1_1, 0.0F, 0.0F, 256.0F / local7, 256.0F / local11);
		this.aClass21_Sub3_20.method17054(0, 0, local92, local95);
		this.aClass21_Sub3_20.method17079(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!adn", name = "i", descriptor = "(ILclient!abj;Lclient!ic;Lclient!dr;Lclient!ic;Z)V", line = 85)
	@Override
	void method8219(@OriginalArg(0) int arg0, @OriginalArg(1) Class19_Sub1 arg1, @OriginalArg(2) Interface20 arg2, @OriginalArg(3) Interface13 arg3, @OriginalArg(4) Interface20 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass21_Sub3_20.method17577();
		@Pc(7) float local7 = (float) arg1.method21390();
		@Pc(11) float local11 = (float) arg1.method21391();
		@Pc(13) Interface20 local13 = arg2;
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass21_Sub3_20.method17038().method21390() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass21_Sub3_20.method17038().method21391() : local95;
		if (arg0 == 0) {
			local92 = 256;
			local95 = 256;
			this.aClass24_3.method6560(this.aClass25_2);
			this.aClass24_3.method6550();
		} else if (arg0 == 1) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass24_3.method6560(this.aClass25_1);
			this.aClass24_3.method6550();
			this.aClass24_3.method6588(this.aClass3_Sub19_Sub1_6, aFloat124 / local7, 0.0F);
		} else if (arg0 == 2) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass24_3.method6560(this.aClass25_1);
			this.aClass24_3.method6550();
			this.aClass24_3.method6588(this.aClass3_Sub19_Sub1_6, 0.0F, aFloat124 / local11);
		} else if (arg0 == 3) {
			this.aClass24_3.method6560(this.aClass25_3);
			local13 = arg4;
			this.aClass24_3.method6622(this.aClass3_Sub19_Sub1_4, 1, arg2);
			this.aClass24_3.method6550();
		}
		@Pc(220) float local220 = (float) local92 / local7;
		@Pc(225) float local225 = (float) local95 / local11;
		@Pc(230) float local230 = (float) local105 / local7;
		@Pc(235) float local235 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local220 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local225 + 1.0F;
		local89[10] *= local230;
		local89[7] *= local235;
		this.aClass24_3.method6605(this.aClass3_Sub19_Sub1_2, local89);
		this.aClass24_3.method6622(this.aClass3_Sub19_Sub1_3, 0, local13);
		this.aClass24_3.method6567(this.aClass3_Sub19_Sub1_5, aFloat123, aFloat122, aFloat125, 0.0F);
		this.aClass24_3.method6567(this.aClass3_Sub19_Sub1_1, 0.0F, 0.0F, 256.0F / local7, 256.0F / local11);
		this.aClass21_Sub3_20.method17054(0, 0, local92, local95);
		this.aClass21_Sub3_20.method17079(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!adn", name = "s", descriptor = "(I)V", line = 143)
	@Override
	void method8209(@OriginalArg(0) int arg0) {
		this.aClass24_3.method6551();
	}

	@OriginalMember(owner = "client!adn", name = "at", descriptor = "(I)V", line = 143)
	@Override
	void method8222() {
		this.aClass24_3.method6551();
	}

	@OriginalMember(owner = "client!adn", name = "k", descriptor = "(I)V", line = 143)
	@Override
	void method8221() {
		this.aClass24_3.method6551();
	}

	@OriginalMember(owner = "client!adn", name = "f", descriptor = "(I)V", line = 143)
	@Override
	void method8212() {
		this.aClass24_3.method6551();
	}

	@OriginalMember(owner = "client!adn", name = "ah", descriptor = "()I", line = 147)
	@Override
	int method8226() {
		return 1;
	}

	@OriginalMember(owner = "client!adn", name = "an", descriptor = "()I", line = 147)
	@Override
	int method8227() {
		return 1;
	}

	@OriginalMember(owner = "client!adn", name = "b", descriptor = "()I", line = 147)
	@Override
	int method8205() {
		return 1;
	}

	@OriginalMember(owner = "client!adn", name = "az", descriptor = "()I", line = 151)
	@Override
	int method8224() {
		return 0;
	}

	@OriginalMember(owner = "client!adn", name = "y", descriptor = "()I", line = 151)
	@Override
	int method8204() {
		return 0;
	}

	@OriginalMember(owner = "client!adn", name = "ax", descriptor = "()I", line = 151)
	@Override
	int method8229() {
		return 0;
	}

	@OriginalMember(owner = "client!adn", name = "j", descriptor = "()Z", line = 155)
	@Override
	boolean method8208() {
		return false;
	}

	@OriginalMember(owner = "client!adn", name = "ai", descriptor = "()Z", line = 155)
	@Override
	boolean method8230() {
		return false;
	}

	@OriginalMember(owner = "client!adn", name = "aq", descriptor = "()Z", line = 155)
	@Override
	boolean method8231() {
		return false;
	}
}
