package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aii")
public class Class137_Sub2 extends Class137 {

	@OriginalMember(owner = "client!aii", name = "m", descriptor = "I")
	static final int anInt1308 = 256;

	@OriginalMember(owner = "client!aii", name = "k", descriptor = "F")
	public static float aFloat131 = 0.25F;

	@OriginalMember(owner = "client!aii", name = "f", descriptor = "F")
	public static float aFloat132 = 1.0F;

	@OriginalMember(owner = "client!aii", name = "w", descriptor = "F")
	public static float aFloat133 = 1.0F;

	@OriginalMember(owner = "client!aii", name = "l", descriptor = "F")
	public static float aFloat134 = 1.0F;

	@OriginalMember(owner = "client!aii", name = "d", descriptor = "Lclient!hi;")
	Class116 aClass116_6;

	@OriginalMember(owner = "client!aii", name = "u", descriptor = "Lclient!ho;")
	Class115 aClass115_7;

	@OriginalMember(owner = "client!aii", name = "z", descriptor = "Lclient!hi;")
	Class116 aClass116_7;

	@OriginalMember(owner = "client!aii", name = "q", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_30;

	@OriginalMember(owner = "client!aii", name = "s", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_31;

	@OriginalMember(owner = "client!aii", name = "c", descriptor = "Lclient!hi;")
	Class116 aClass116_8;

	@OriginalMember(owner = "client!aii", name = "p", descriptor = "Lclient!hi;")
	Class116 aClass116_9;

	@OriginalMember(owner = "client!aii", name = "v", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_32;

	@OriginalMember(owner = "client!aii", name = "o", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_33;

	@OriginalMember(owner = "client!aii", name = "x", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_34;

	@OriginalMember(owner = "client!aii", name = "y", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_35;

	@OriginalMember(owner = "client!aii", name = "r", descriptor = "Lclient!hi;")
	Class116 aClass116_10;

	@OriginalMember(owner = "client!aii", name = "b", descriptor = "Z")
	boolean aBoolean243;

	@OriginalMember(owner = "client!aii", name = "<init>", descriptor = "(Lclient!afc;)V", line = 29)
	public Class137_Sub2(@OriginalArg(0) Class104_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aii", name = "e", descriptor = "()Z", line = 33)
	@Override
	boolean method11447() {
		return this.aClass104_Sub2_25.aBoolean475 && this.aClass104_Sub2_25.method20886() && this.aClass104_Sub2_25.method20887(true);
	}

	@OriginalMember(owner = "client!aii", name = "o", descriptor = "()Z", line = 33)
	@Override
	boolean method11446() {
		return this.aClass104_Sub2_25.aBoolean475 && this.aClass104_Sub2_25.method20886() && this.aClass104_Sub2_25.method20887(true);
	}

	@OriginalMember(owner = "client!aii", name = "n", descriptor = "()Z", line = 37)
	@Override
	boolean method11448() {
		return this.aBoolean243;
	}

	@OriginalMember(owner = "client!aii", name = "y", descriptor = "()Z", line = 37)
	@Override
	boolean method11462() {
		return this.aBoolean243;
	}

	@OriginalMember(owner = "client!aii", name = "s", descriptor = "()Z", line = 37)
	@Override
	boolean method11469() {
		return this.aBoolean243;
	}

	@OriginalMember(owner = "client!aii", name = "q", descriptor = "()Z", line = 41)
	@Override
	boolean method11464() {
		if (!this.method11447()) {
			return false;
		}
		this.aClass115_7 = this.aClass104_Sub2_25.method20892("FilterBloom");
		if (this.aClass115_7 == null) {
			return false;
		}
		try {
			this.aClass93_Sub33_Sub1_32 = this.aClass115_7.method8198("sceneTex");
			this.aClass93_Sub33_Sub1_33 = this.aClass115_7.method8198("bloomTex1");
			this.aClass93_Sub33_Sub1_31 = this.aClass115_7.method8198("params");
			this.aClass93_Sub33_Sub1_35 = this.aClass115_7.method8198("sampleSize");
			this.aClass93_Sub33_Sub1_30 = this.aClass115_7.method8198("pixelOffsetAndBloomScale");
			this.aClass93_Sub33_Sub1_34 = this.aClass115_7.method8198("PosAndTexCoords");
			this.aClass115_7.method8268("test");
			this.aClass116_7 = this.aClass115_7.method8268("techFullscreenTri");
			this.aClass116_9 = this.aClass115_7.method8268("brightpass");
			this.aClass116_6 = this.aClass115_7.method8268("blur");
			this.aClass116_8 = this.aClass115_7.method8268("composite");
			this.aClass116_10 = this.aClass115_7.method8268("techDefault");
		} catch (@Pc(98) Exception_Sub2_Sub1 local98) {
			return false;
		} catch (@Pc(101) Exception_Sub2_Sub2 local101) {
			return false;
		}
		if (!this.aClass116_7.method8438()) {
			return false;
		} else if (!this.aClass116_9.method8438()) {
			return false;
		} else if (!this.aClass116_6.method8438()) {
			return false;
		} else if (!this.aClass116_8.method8438()) {
			return false;
		} else if (this.aClass116_10.method8438()) {
			this.aBoolean243 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aii", name = "m", descriptor = "()Z", line = 41)
	@Override
	boolean method11461() {
		if (!this.method11447()) {
			return false;
		}
		this.aClass115_7 = this.aClass104_Sub2_25.method20892("FilterBloom");
		if (this.aClass115_7 == null) {
			return false;
		}
		try {
			this.aClass93_Sub33_Sub1_32 = this.aClass115_7.method8198("sceneTex");
			this.aClass93_Sub33_Sub1_33 = this.aClass115_7.method8198("bloomTex1");
			this.aClass93_Sub33_Sub1_31 = this.aClass115_7.method8198("params");
			this.aClass93_Sub33_Sub1_35 = this.aClass115_7.method8198("sampleSize");
			this.aClass93_Sub33_Sub1_30 = this.aClass115_7.method8198("pixelOffsetAndBloomScale");
			this.aClass93_Sub33_Sub1_34 = this.aClass115_7.method8198("PosAndTexCoords");
			this.aClass115_7.method8268("test");
			this.aClass116_7 = this.aClass115_7.method8268("techFullscreenTri");
			this.aClass116_9 = this.aClass115_7.method8268("brightpass");
			this.aClass116_6 = this.aClass115_7.method8268("blur");
			this.aClass116_8 = this.aClass115_7.method8268("composite");
			this.aClass116_10 = this.aClass115_7.method8268("techDefault");
		} catch (@Pc(98) Exception_Sub2_Sub1 local98) {
			return false;
		} catch (@Pc(101) Exception_Sub2_Sub2 local101) {
			return false;
		}
		if (!this.aClass116_7.method8438()) {
			return false;
		} else if (!this.aClass116_9.method8438()) {
			return false;
		} else if (!this.aClass116_6.method8438()) {
			return false;
		} else if (!this.aClass116_8.method8438()) {
			return false;
		} else if (this.aClass116_10.method8438()) {
			this.aBoolean243 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aii", name = "w", descriptor = "(II)V", line = 77)
	@Override
	void method11463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aii", name = "a", descriptor = "(II)V", line = 77)
	@Override
	void method11452() {
	}

	@OriginalMember(owner = "client!aii", name = "g", descriptor = "(II)V", line = 77)
	@Override
	void method11473() {
	}

	@OriginalMember(owner = "client!aii", name = "f", descriptor = "()V", line = 78)
	@Override
	void method11451() {
	}

	@OriginalMember(owner = "client!aii", name = "h", descriptor = "()V", line = 78)
	@Override
	void method11467() {
	}

	@OriginalMember(owner = "client!aii", name = "b", descriptor = "()V", line = 78)
	@Override
	void method11466() {
	}

	@OriginalMember(owner = "client!aii", name = "z", descriptor = "()I", line = 81)
	@Override
	int method11455() {
		return 4;
	}

	@OriginalMember(owner = "client!aii", name = "ae", descriptor = "()I", line = 81)
	@Override
	int method11472() {
		return 4;
	}

	@OriginalMember(owner = "client!aii", name = "ag", descriptor = "()I", line = 81)
	@Override
	int method11449() {
		return 4;
	}

	@OriginalMember(owner = "client!aii", name = "ah", descriptor = "()I", line = 81)
	@Override
	int method11474() {
		return 4;
	}

	@OriginalMember(owner = "client!aii", name = "ad", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V", line = 85)
	@Override
	void method11481(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20882();
		@Pc(7) float local7 = (float) arg1.method23736();
		@Pc(11) float local11 = (float) arg1.method23737();
		@Pc(13) Interface38 local13 = arg2;
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass104_Sub2_25.method20435().method23736() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass104_Sub2_25.method20435().method23737() : local95;
		if (arg0 == 0) {
			local92 = 256;
			local95 = 256;
			this.aClass115_7.method8203(this.aClass116_9);
			this.aClass115_7.method8285();
		} else if (arg0 == 1) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass115_7.method8203(this.aClass116_6);
			this.aClass115_7.method8285();
			this.aClass115_7.method8208(this.aClass93_Sub33_Sub1_35, aFloat134 / local7, 0.0F);
		} else if (arg0 == 2) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass115_7.method8203(this.aClass116_6);
			this.aClass115_7.method8285();
			this.aClass115_7.method8208(this.aClass93_Sub33_Sub1_35, 0.0F, aFloat134 / local11);
		} else if (arg0 == 3) {
			this.aClass115_7.method8203(this.aClass116_8);
			local13 = arg4;
			this.aClass115_7.method8293(this.aClass93_Sub33_Sub1_33, 1, arg2);
			this.aClass115_7.method8285();
		}
		@Pc(220) float local220 = (float) local92 / local7;
		@Pc(225) float local225 = (float) local95 / local11;
		@Pc(230) float local230 = (float) local105 / local7;
		@Pc(235) float local235 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local220 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local225 + 1.0F;
		local89[10] *= local230;
		local89[7] *= local235;
		this.aClass115_7.method8213(this.aClass93_Sub33_Sub1_34, local89);
		this.aClass115_7.method8293(this.aClass93_Sub33_Sub1_32, 0, local13);
		this.aClass115_7.method8210(this.aClass93_Sub33_Sub1_31, aFloat133, aFloat131, aFloat132, 0.0F);
		this.aClass115_7.method8210(this.aClass93_Sub33_Sub1_30, 0.0F, 0.0F, 256.0F / local7, 256.0F / local11);
		this.aClass104_Sub2_25.method20463(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!aii", name = "l", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V", line = 85)
	@Override
	void method11453(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20882();
		@Pc(7) float local7 = (float) arg1.method23736();
		@Pc(11) float local11 = (float) arg1.method23737();
		@Pc(13) Interface38 local13 = arg2;
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass104_Sub2_25.method20435().method23736() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass104_Sub2_25.method20435().method23737() : local95;
		if (arg0 == 0) {
			local92 = 256;
			local95 = 256;
			this.aClass115_7.method8203(this.aClass116_9);
			this.aClass115_7.method8285();
		} else if (arg0 == 1) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass115_7.method8203(this.aClass116_6);
			this.aClass115_7.method8285();
			this.aClass115_7.method8208(this.aClass93_Sub33_Sub1_35, aFloat134 / local7, 0.0F);
		} else if (arg0 == 2) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass115_7.method8203(this.aClass116_6);
			this.aClass115_7.method8285();
			this.aClass115_7.method8208(this.aClass93_Sub33_Sub1_35, 0.0F, aFloat134 / local11);
		} else if (arg0 == 3) {
			this.aClass115_7.method8203(this.aClass116_8);
			local13 = arg4;
			this.aClass115_7.method8293(this.aClass93_Sub33_Sub1_33, 1, arg2);
			this.aClass115_7.method8285();
		}
		@Pc(220) float local220 = (float) local92 / local7;
		@Pc(225) float local225 = (float) local95 / local11;
		@Pc(230) float local230 = (float) local105 / local7;
		@Pc(235) float local235 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local220 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local225 + 1.0F;
		local89[10] *= local230;
		local89[7] *= local235;
		this.aClass115_7.method8213(this.aClass93_Sub33_Sub1_34, local89);
		this.aClass115_7.method8293(this.aClass93_Sub33_Sub1_32, 0, local13);
		this.aClass115_7.method8210(this.aClass93_Sub33_Sub1_31, aFloat133, aFloat131, aFloat132, 0.0F);
		this.aClass115_7.method8210(this.aClass93_Sub33_Sub1_30, 0.0F, 0.0F, 256.0F / local7, 256.0F / local11);
		this.aClass104_Sub2_25.method20463(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!aii", name = "am", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V", line = 85)
	@Override
	void method11483(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20882();
		@Pc(7) float local7 = (float) arg1.method23736();
		@Pc(11) float local11 = (float) arg1.method23737();
		@Pc(13) Interface38 local13 = arg2;
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass104_Sub2_25.method20435().method23736() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass104_Sub2_25.method20435().method23737() : local95;
		if (arg0 == 0) {
			local92 = 256;
			local95 = 256;
			this.aClass115_7.method8203(this.aClass116_9);
			this.aClass115_7.method8285();
		} else if (arg0 == 1) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass115_7.method8203(this.aClass116_6);
			this.aClass115_7.method8285();
			this.aClass115_7.method8208(this.aClass93_Sub33_Sub1_35, aFloat134 / local7, 0.0F);
		} else if (arg0 == 2) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass115_7.method8203(this.aClass116_6);
			this.aClass115_7.method8285();
			this.aClass115_7.method8208(this.aClass93_Sub33_Sub1_35, 0.0F, aFloat134 / local11);
		} else if (arg0 == 3) {
			this.aClass115_7.method8203(this.aClass116_8);
			local13 = arg4;
			this.aClass115_7.method8293(this.aClass93_Sub33_Sub1_33, 1, arg2);
			this.aClass115_7.method8285();
		}
		@Pc(220) float local220 = (float) local92 / local7;
		@Pc(225) float local225 = (float) local95 / local11;
		@Pc(230) float local230 = (float) local105 / local7;
		@Pc(235) float local235 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local220 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local225 + 1.0F;
		local89[10] *= local230;
		local89[7] *= local235;
		this.aClass115_7.method8213(this.aClass93_Sub33_Sub1_34, local89);
		this.aClass115_7.method8293(this.aClass93_Sub33_Sub1_32, 0, local13);
		this.aClass115_7.method8210(this.aClass93_Sub33_Sub1_31, aFloat133, aFloat131, aFloat132, 0.0F);
		this.aClass115_7.method8210(this.aClass93_Sub33_Sub1_30, 0.0F, 0.0F, 256.0F / local7, 256.0F / local11);
		this.aClass104_Sub2_25.method20463(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!aii", name = "au", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V", line = 85)
	@Override
	void method11458(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20882();
		@Pc(7) float local7 = (float) arg1.method23736();
		@Pc(11) float local11 = (float) arg1.method23737();
		@Pc(13) Interface38 local13 = arg2;
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass104_Sub2_25.method20435().method23736() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass104_Sub2_25.method20435().method23737() : local95;
		if (arg0 == 0) {
			local92 = 256;
			local95 = 256;
			this.aClass115_7.method8203(this.aClass116_9);
			this.aClass115_7.method8285();
		} else if (arg0 == 1) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass115_7.method8203(this.aClass116_6);
			this.aClass115_7.method8285();
			this.aClass115_7.method8208(this.aClass93_Sub33_Sub1_35, aFloat134 / local7, 0.0F);
		} else if (arg0 == 2) {
			local92 = 256;
			local95 = 256;
			local105 = local92;
			local115 = local95;
			this.aClass115_7.method8203(this.aClass116_6);
			this.aClass115_7.method8285();
			this.aClass115_7.method8208(this.aClass93_Sub33_Sub1_35, 0.0F, aFloat134 / local11);
		} else if (arg0 == 3) {
			this.aClass115_7.method8203(this.aClass116_8);
			local13 = arg4;
			this.aClass115_7.method8293(this.aClass93_Sub33_Sub1_33, 1, arg2);
			this.aClass115_7.method8285();
		}
		@Pc(220) float local220 = (float) local92 / local7;
		@Pc(225) float local225 = (float) local95 / local11;
		@Pc(230) float local230 = (float) local105 / local7;
		@Pc(235) float local235 = (float) local115 / local11;
		local89[8] = (local89[8] + 1.0F) * local220 - 1.0F;
		local89[5] = (local89[5] - 1.0F) * local225 + 1.0F;
		local89[10] *= local230;
		local89[7] *= local235;
		this.aClass115_7.method8213(this.aClass93_Sub33_Sub1_34, local89);
		this.aClass115_7.method8293(this.aClass93_Sub33_Sub1_32, 0, local13);
		this.aClass115_7.method8210(this.aClass93_Sub33_Sub1_31, aFloat133, aFloat131, aFloat132, 0.0F);
		this.aClass115_7.method8210(this.aClass93_Sub33_Sub1_30, 0.0F, 0.0F, 256.0F / local7, 256.0F / local11);
		this.aClass104_Sub2_25.method20463(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!aii", name = "u", descriptor = "(I)V", line = 142)
	@Override
	void method11454(@OriginalArg(0) int arg0) {
		this.aClass115_7.method8255();
	}

	@OriginalMember(owner = "client!aii", name = "j", descriptor = "(I)V", line = 142)
	@Override
	void method11471() {
		this.aClass115_7.method8255();
	}

	@OriginalMember(owner = "client!aii", name = "i", descriptor = "(I)V", line = 142)
	@Override
	void method11470() {
		this.aClass115_7.method8255();
	}

	@OriginalMember(owner = "client!aii", name = "t", descriptor = "(I)V", line = 142)
	@Override
	void method11468() {
		this.aClass115_7.method8255();
	}

	@OriginalMember(owner = "client!aii", name = "d", descriptor = "()I", line = 146)
	@Override
	int method11457() {
		return 1;
	}

	@OriginalMember(owner = "client!aii", name = "ac", descriptor = "()I", line = 146)
	@Override
	int method11476() {
		return 1;
	}

	@OriginalMember(owner = "client!aii", name = "p", descriptor = "()I", line = 150)
	@Override
	int method11456() {
		return 0;
	}

	@OriginalMember(owner = "client!aii", name = "al", descriptor = "()I", line = 150)
	@Override
	int method11475() {
		return 0;
	}

	@OriginalMember(owner = "client!aii", name = "v", descriptor = "()Z", line = 154)
	@Override
	boolean method11460() {
		return false;
	}

	@OriginalMember(owner = "client!aii", name = "at", descriptor = "()Z", line = 154)
	@Override
	boolean method11480() {
		return false;
	}
}
