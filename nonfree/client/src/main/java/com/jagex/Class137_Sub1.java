package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public class Class137_Sub1 extends Class137 {

	@OriginalMember(owner = "client!aia", name = "p", descriptor = "F")
	public static float aFloat126 = 1.0F;

	@OriginalMember(owner = "client!aia", name = "d", descriptor = "F")
	public static float aFloat124 = 0.0F;

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "F")
	public static float aFloat125 = 1.0F;

	@OriginalMember(owner = "client!aia", name = "r", descriptor = "F")
	public static float aFloat127 = 0.0F;

	@OriginalMember(owner = "client!aia", name = "v", descriptor = "F")
	public static float aFloat128 = 1.0F;

	@OriginalMember(owner = "client!aia", name = "o", descriptor = "Z")
	boolean aBoolean212;

	@OriginalMember(owner = "client!aia", name = "k", descriptor = "Lclient!hi;")
	Class116 aClass116_5;

	@OriginalMember(owner = "client!aia", name = "l", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_25;

	@OriginalMember(owner = "client!aia", name = "m", descriptor = "Lclient!ho;")
	Class115 aClass115_6;

	@OriginalMember(owner = "client!aia", name = "u", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_26;

	@OriginalMember(owner = "client!aia", name = "z", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_27;

	@OriginalMember(owner = "client!aia", name = "f", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_28;

	@OriginalMember(owner = "client!aia", name = "w", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_29;

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(Lclient!afc;)V", line = 24)
	public Class137_Sub1(@OriginalArg(0) Class104_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aia", name = "e", descriptor = "()Z", line = 28)
	@Override
	boolean method11447() {
		return this.aClass104_Sub2_25.aBoolean475 && this.aClass104_Sub2_25.method20886();
	}

	@OriginalMember(owner = "client!aia", name = "o", descriptor = "()Z", line = 28)
	@Override
	boolean method11446() {
		return this.aClass104_Sub2_25.aBoolean475 && this.aClass104_Sub2_25.method20886();
	}

	@OriginalMember(owner = "client!aia", name = "s", descriptor = "()Z", line = 32)
	@Override
	boolean method11469() {
		return this.aBoolean212;
	}

	@OriginalMember(owner = "client!aia", name = "n", descriptor = "()Z", line = 32)
	@Override
	boolean method11448() {
		return this.aBoolean212;
	}

	@OriginalMember(owner = "client!aia", name = "y", descriptor = "()Z", line = 32)
	@Override
	boolean method11462() {
		return this.aBoolean212;
	}

	@OriginalMember(owner = "client!aia", name = "m", descriptor = "()Z", line = 36)
	@Override
	boolean method11461() {
		if (!this.method11447()) {
			return false;
		}
		this.aClass115_6 = this.aClass104_Sub2_25.method20892("FilterLevels");
		if (this.aClass115_6 == null) {
			return false;
		}
		try {
			this.aClass93_Sub33_Sub1_28 = this.aClass115_6.method8198("sceneTex");
			this.aClass93_Sub33_Sub1_29 = this.aClass115_6.method8198("paramsGamma");
			this.aClass93_Sub33_Sub1_25 = this.aClass115_6.method8198("paramsRanges");
			this.aClass93_Sub33_Sub1_26 = this.aClass115_6.method8198("pixelOffset");
			this.aClass93_Sub33_Sub1_27 = this.aClass115_6.method8198("PosAndTexCoords");
			this.aClass116_5 = this.aClass115_6.method8268("techAdjust");
		} catch (@Pc(57) Exception_Sub2_Sub1 local57) {
			return false;
		} catch (@Pc(60) Exception_Sub2_Sub2 local60) {
			return false;
		}
		if (this.aClass116_5.method8438()) {
			this.aBoolean212 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aia", name = "q", descriptor = "()Z", line = 36)
	@Override
	boolean method11464() {
		if (!this.method11447()) {
			return false;
		}
		this.aClass115_6 = this.aClass104_Sub2_25.method20892("FilterLevels");
		if (this.aClass115_6 == null) {
			return false;
		}
		try {
			this.aClass93_Sub33_Sub1_28 = this.aClass115_6.method8198("sceneTex");
			this.aClass93_Sub33_Sub1_29 = this.aClass115_6.method8198("paramsGamma");
			this.aClass93_Sub33_Sub1_25 = this.aClass115_6.method8198("paramsRanges");
			this.aClass93_Sub33_Sub1_26 = this.aClass115_6.method8198("pixelOffset");
			this.aClass93_Sub33_Sub1_27 = this.aClass115_6.method8198("PosAndTexCoords");
			this.aClass116_5 = this.aClass115_6.method8268("techAdjust");
		} catch (@Pc(57) Exception_Sub2_Sub1 local57) {
			return false;
		} catch (@Pc(60) Exception_Sub2_Sub2 local60) {
			return false;
		}
		if (this.aClass116_5.method8438()) {
			this.aBoolean212 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)V", line = 64)
	@Override
	void method11452() {
	}

	@OriginalMember(owner = "client!aia", name = "g", descriptor = "(II)V", line = 64)
	@Override
	void method11473() {
	}

	@OriginalMember(owner = "client!aia", name = "w", descriptor = "(II)V", line = 64)
	@Override
	void method11463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "()V", line = 65)
	@Override
	void method11466() {
	}

	@OriginalMember(owner = "client!aia", name = "h", descriptor = "()V", line = 65)
	@Override
	void method11467() {
	}

	@OriginalMember(owner = "client!aia", name = "f", descriptor = "()V", line = 65)
	@Override
	void method11451() {
	}

	@OriginalMember(owner = "client!aia", name = "z", descriptor = "()I", line = 68)
	@Override
	int method11455() {
		return 1;
	}

	@OriginalMember(owner = "client!aia", name = "ae", descriptor = "()I", line = 68)
	@Override
	int method11472() {
		return 1;
	}

	@OriginalMember(owner = "client!aia", name = "ag", descriptor = "()I", line = 68)
	@Override
	int method11449() {
		return 1;
	}

	@OriginalMember(owner = "client!aia", name = "ah", descriptor = "()I", line = 68)
	@Override
	int method11474() {
		return 1;
	}

	@OriginalMember(owner = "client!aia", name = "au", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V", line = 72)
	@Override
	void method11458(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20882();
		@Pc(7) float local7 = (float) arg1.method23736();
		@Pc(11) float local11 = (float) arg1.method23737();
		@Pc(17) float local17 = local3 * 2.0F / local7;
		@Pc(24) float local24 = -local3 * 2.0F / local11;
		@Pc(87) float[] local87 = new float[] { -1.0F + local17, local24 + 1.0F, 0.0F, 0.0F, -1.0F + local17, -3.0F + local24, 0.0F, 2.0F, local17 + 3.0F, local24 + 1.0F, 2.0F, 0.0F };
		@Pc(90) int local90 = (int) local7;
		@Pc(93) int local93 = (int) local11;
		@Pc(103) int local103 = arg5 ? this.aClass104_Sub2_25.method20435().method23736() : local90;
		@Pc(113) int local113 = arg5 ? this.aClass104_Sub2_25.method20435().method23737() : local93;
		this.aClass115_6.method8203(this.aClass116_5);
		this.aClass115_6.method8285();
		@Pc(127) float local127 = (float) local90 / local7;
		@Pc(132) float local132 = (float) local93 / local11;
		@Pc(137) float local137 = (float) local103 / local7;
		@Pc(142) float local142 = (float) local113 / local11;
		local87[8] = (local87[8] + 1.0F) * local127 - 1.0F;
		local87[5] = (local87[5] - 1.0F) * local132 + 1.0F;
		local87[10] *= local137;
		local87[7] *= local142;
		this.aClass115_6.method8213(this.aClass93_Sub33_Sub1_27, local87);
		this.aClass115_6.method8293(this.aClass93_Sub33_Sub1_28, 0, arg2);
		this.aClass115_6.method8309(this.aClass93_Sub33_Sub1_29, aFloat126);
		this.aClass115_6.method8210(this.aClass93_Sub33_Sub1_25, aFloat124, aFloat125, aFloat127, aFloat128);
		this.aClass115_6.method8210(this.aClass93_Sub33_Sub1_26, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass104_Sub2_25.method20463(0, 0, local90, local93);
	}

	@OriginalMember(owner = "client!aia", name = "l", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V", line = 72)
	@Override
	void method11453(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20882();
		@Pc(7) float local7 = (float) arg1.method23736();
		@Pc(11) float local11 = (float) arg1.method23737();
		@Pc(17) float local17 = local3 * 2.0F / local7;
		@Pc(24) float local24 = -local3 * 2.0F / local11;
		@Pc(87) float[] local87 = new float[] { -1.0F + local17, local24 + 1.0F, 0.0F, 0.0F, -1.0F + local17, -3.0F + local24, 0.0F, 2.0F, local17 + 3.0F, local24 + 1.0F, 2.0F, 0.0F };
		@Pc(90) int local90 = (int) local7;
		@Pc(93) int local93 = (int) local11;
		@Pc(103) int local103 = arg5 ? this.aClass104_Sub2_25.method20435().method23736() : local90;
		@Pc(113) int local113 = arg5 ? this.aClass104_Sub2_25.method20435().method23737() : local93;
		this.aClass115_6.method8203(this.aClass116_5);
		this.aClass115_6.method8285();
		@Pc(127) float local127 = (float) local90 / local7;
		@Pc(132) float local132 = (float) local93 / local11;
		@Pc(137) float local137 = (float) local103 / local7;
		@Pc(142) float local142 = (float) local113 / local11;
		local87[8] = (local87[8] + 1.0F) * local127 - 1.0F;
		local87[5] = (local87[5] - 1.0F) * local132 + 1.0F;
		local87[10] *= local137;
		local87[7] *= local142;
		this.aClass115_6.method8213(this.aClass93_Sub33_Sub1_27, local87);
		this.aClass115_6.method8293(this.aClass93_Sub33_Sub1_28, 0, arg2);
		this.aClass115_6.method8309(this.aClass93_Sub33_Sub1_29, aFloat126);
		this.aClass115_6.method8210(this.aClass93_Sub33_Sub1_25, aFloat124, aFloat125, aFloat127, aFloat128);
		this.aClass115_6.method8210(this.aClass93_Sub33_Sub1_26, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass104_Sub2_25.method20463(0, 0, local90, local93);
	}

	@OriginalMember(owner = "client!aia", name = "am", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V", line = 72)
	@Override
	void method11483(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20882();
		@Pc(7) float local7 = (float) arg1.method23736();
		@Pc(11) float local11 = (float) arg1.method23737();
		@Pc(17) float local17 = local3 * 2.0F / local7;
		@Pc(24) float local24 = -local3 * 2.0F / local11;
		@Pc(87) float[] local87 = new float[] { -1.0F + local17, local24 + 1.0F, 0.0F, 0.0F, -1.0F + local17, -3.0F + local24, 0.0F, 2.0F, local17 + 3.0F, local24 + 1.0F, 2.0F, 0.0F };
		@Pc(90) int local90 = (int) local7;
		@Pc(93) int local93 = (int) local11;
		@Pc(103) int local103 = arg5 ? this.aClass104_Sub2_25.method20435().method23736() : local90;
		@Pc(113) int local113 = arg5 ? this.aClass104_Sub2_25.method20435().method23737() : local93;
		this.aClass115_6.method8203(this.aClass116_5);
		this.aClass115_6.method8285();
		@Pc(127) float local127 = (float) local90 / local7;
		@Pc(132) float local132 = (float) local93 / local11;
		@Pc(137) float local137 = (float) local103 / local7;
		@Pc(142) float local142 = (float) local113 / local11;
		local87[8] = (local87[8] + 1.0F) * local127 - 1.0F;
		local87[5] = (local87[5] - 1.0F) * local132 + 1.0F;
		local87[10] *= local137;
		local87[7] *= local142;
		this.aClass115_6.method8213(this.aClass93_Sub33_Sub1_27, local87);
		this.aClass115_6.method8293(this.aClass93_Sub33_Sub1_28, 0, arg2);
		this.aClass115_6.method8309(this.aClass93_Sub33_Sub1_29, aFloat126);
		this.aClass115_6.method8210(this.aClass93_Sub33_Sub1_25, aFloat124, aFloat125, aFloat127, aFloat128);
		this.aClass115_6.method8210(this.aClass93_Sub33_Sub1_26, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass104_Sub2_25.method20463(0, 0, local90, local93);
	}

	@OriginalMember(owner = "client!aia", name = "ad", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V", line = 72)
	@Override
	void method11481(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20882();
		@Pc(7) float local7 = (float) arg1.method23736();
		@Pc(11) float local11 = (float) arg1.method23737();
		@Pc(17) float local17 = local3 * 2.0F / local7;
		@Pc(24) float local24 = -local3 * 2.0F / local11;
		@Pc(87) float[] local87 = new float[] { -1.0F + local17, local24 + 1.0F, 0.0F, 0.0F, -1.0F + local17, -3.0F + local24, 0.0F, 2.0F, local17 + 3.0F, local24 + 1.0F, 2.0F, 0.0F };
		@Pc(90) int local90 = (int) local7;
		@Pc(93) int local93 = (int) local11;
		@Pc(103) int local103 = arg5 ? this.aClass104_Sub2_25.method20435().method23736() : local90;
		@Pc(113) int local113 = arg5 ? this.aClass104_Sub2_25.method20435().method23737() : local93;
		this.aClass115_6.method8203(this.aClass116_5);
		this.aClass115_6.method8285();
		@Pc(127) float local127 = (float) local90 / local7;
		@Pc(132) float local132 = (float) local93 / local11;
		@Pc(137) float local137 = (float) local103 / local7;
		@Pc(142) float local142 = (float) local113 / local11;
		local87[8] = (local87[8] + 1.0F) * local127 - 1.0F;
		local87[5] = (local87[5] - 1.0F) * local132 + 1.0F;
		local87[10] *= local137;
		local87[7] *= local142;
		this.aClass115_6.method8213(this.aClass93_Sub33_Sub1_27, local87);
		this.aClass115_6.method8293(this.aClass93_Sub33_Sub1_28, 0, arg2);
		this.aClass115_6.method8309(this.aClass93_Sub33_Sub1_29, aFloat126);
		this.aClass115_6.method8210(this.aClass93_Sub33_Sub1_25, aFloat124, aFloat125, aFloat127, aFloat128);
		this.aClass115_6.method8210(this.aClass93_Sub33_Sub1_26, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass104_Sub2_25.method20463(0, 0, local90, local93);
	}

	@OriginalMember(owner = "client!aia", name = "i", descriptor = "(I)V", line = 101)
	@Override
	void method11470() {
		this.aClass115_6.method8255();
	}

	@OriginalMember(owner = "client!aia", name = "u", descriptor = "(I)V", line = 101)
	@Override
	void method11454(@OriginalArg(0) int arg0) {
		this.aClass115_6.method8255();
	}

	@OriginalMember(owner = "client!aia", name = "j", descriptor = "(I)V", line = 101)
	@Override
	void method11471() {
		this.aClass115_6.method8255();
	}

	@OriginalMember(owner = "client!aia", name = "t", descriptor = "(I)V", line = 101)
	@Override
	void method11468() {
		this.aClass115_6.method8255();
	}

	@OriginalMember(owner = "client!aia", name = "ac", descriptor = "()I", line = 105)
	@Override
	int method11476() {
		return 0;
	}

	@OriginalMember(owner = "client!aia", name = "d", descriptor = "()I", line = 105)
	@Override
	int method11457() {
		return 0;
	}

	@OriginalMember(owner = "client!aia", name = "p", descriptor = "()I", line = 109)
	@Override
	int method11456() {
		return 1;
	}

	@OriginalMember(owner = "client!aia", name = "al", descriptor = "()I", line = 109)
	@Override
	int method11475() {
		return 1;
	}

	@OriginalMember(owner = "client!aia", name = "v", descriptor = "()Z", line = 113)
	@Override
	boolean method11460() {
		return aFloat126 == 1.0F && aFloat124 == 0.0F && aFloat125 == 1.0F && aFloat127 == 0.0F && aFloat128 == 1.0F;
	}

	@OriginalMember(owner = "client!aia", name = "at", descriptor = "()Z", line = 113)
	@Override
	boolean method11480() {
		return aFloat126 == 1.0F && aFloat124 == 0.0F && aFloat125 == 1.0F && aFloat127 == 0.0F && aFloat128 == 1.0F;
	}
}
