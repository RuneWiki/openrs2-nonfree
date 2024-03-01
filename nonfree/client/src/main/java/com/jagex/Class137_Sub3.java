package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ais")
public class Class137_Sub3 extends Class137 {

	@OriginalMember(owner = "client!ais", name = "m", descriptor = "[F")
	public static float[] aFloatArray41 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!ais", name = "k", descriptor = "F")
	public static float aFloat139 = 1.0F;

	@OriginalMember(owner = "client!ais", name = "f", descriptor = "I")
	public static int anInt1379 = 1;

	@OriginalMember(owner = "client!ais", name = "w", descriptor = "[Lclient!aeq;")
	public static Class102_Sub2[] aClass102_Sub2Array1 = new Class102_Sub2[] { null, null, null };

	@OriginalMember(owner = "client!ais", name = "l", descriptor = "Lclient!ho;")
	Class115 aClass115_8;

	@OriginalMember(owner = "client!ais", name = "r", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_36;

	@OriginalMember(owner = "client!ais", name = "u", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_37;

	@OriginalMember(owner = "client!ais", name = "d", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_38;

	@OriginalMember(owner = "client!ais", name = "c", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_39;

	@OriginalMember(owner = "client!ais", name = "v", descriptor = "Z")
	boolean aBoolean257;

	@OriginalMember(owner = "client!ais", name = "z", descriptor = "[Lclient!hi;")
	Class116[] aClass116Array6 = null;

	@OriginalMember(owner = "client!ais", name = "p", descriptor = "[Lclient!aql;")
	Class93_Sub33_Sub1[] aClass93_Sub33_Sub1Array1 = null;

	@OriginalMember(owner = "client!ais", name = "<init>", descriptor = "(Lclient!afc;)V", line = 23)
	public Class137_Sub3(@OriginalArg(0) Class104_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ais", name = "o", descriptor = "()Z", line = 27)
	@Override
	boolean method11446() {
		return this.aClass104_Sub2_25.aBoolean475 && this.aClass104_Sub2_25.method20886();
	}

	@OriginalMember(owner = "client!ais", name = "e", descriptor = "()Z", line = 27)
	@Override
	boolean method11447() {
		return this.aClass104_Sub2_25.aBoolean475 && this.aClass104_Sub2_25.method20886();
	}

	@OriginalMember(owner = "client!ais", name = "n", descriptor = "()Z", line = 31)
	@Override
	boolean method11448() {
		return this.aBoolean257;
	}

	@OriginalMember(owner = "client!ais", name = "s", descriptor = "()Z", line = 31)
	@Override
	boolean method11469() {
		return this.aBoolean257;
	}

	@OriginalMember(owner = "client!ais", name = "y", descriptor = "()Z", line = 31)
	@Override
	boolean method11462() {
		return this.aBoolean257;
	}

	@OriginalMember(owner = "client!ais", name = "m", descriptor = "()Z", line = 35)
	@Override
	boolean method11461() {
		if (!this.method11447()) {
			return false;
		}
		this.aClass115_8 = this.aClass104_Sub2_25.method20892("FilterColourRemapping");
		if (this.aClass115_8 == null) {
			return false;
		}
		try {
			this.aClass93_Sub33_Sub1_37 = this.aClass115_8.method8198("sceneTex");
			this.aClass116Array6 = new Class116[3];
			this.aClass93_Sub33_Sub1Array1 = new Class93_Sub33_Sub1[3];
			if (this.aClass104_Sub2_25.aBoolean471) {
				this.aClass116Array6[0] = this.aClass115_8.method8268("techRemap3D_1");
				this.aClass116Array6[1] = this.aClass115_8.method8268("techRemap3D_2");
				this.aClass116Array6[2] = this.aClass115_8.method8268("techRemap3D_3");
				this.aClass93_Sub33_Sub1Array1[0] = this.aClass115_8.method8198("remapTex3D_1");
				this.aClass93_Sub33_Sub1Array1[1] = this.aClass115_8.method8198("remapTex3D_2");
				this.aClass93_Sub33_Sub1Array1[2] = this.aClass115_8.method8198("remapTex3D_3");
			} else {
				this.aClass116Array6[0] = this.aClass115_8.method8268("techRemap2D_1");
				this.aClass116Array6[1] = this.aClass115_8.method8268("techRemap2D_2");
				this.aClass116Array6[2] = this.aClass115_8.method8268("techRemap2D_3");
				this.aClass93_Sub33_Sub1Array1[0] = this.aClass115_8.method8198("remapTex2D_1");
				this.aClass93_Sub33_Sub1Array1[1] = this.aClass115_8.method8198("remapTex2D_2");
				this.aClass93_Sub33_Sub1Array1[2] = this.aClass115_8.method8198("remapTex2D_3");
			}
			this.aClass93_Sub33_Sub1_38 = this.aClass115_8.method8198("paramsWeightings");
			this.aClass93_Sub33_Sub1_39 = this.aClass115_8.method8198("pixelOffset");
			this.aClass93_Sub33_Sub1_36 = this.aClass115_8.method8198("PosAndTexCoords");
		} catch (@Pc(164) Exception_Sub2_Sub1 local164) {
			return false;
		} catch (@Pc(167) Exception_Sub2_Sub2 local167) {
			return false;
		}
		if (this.aClass116Array6[0].method8438() && this.aClass116Array6[1].method8438() && this.aClass116Array6[2].method8438()) {
			this.aBoolean257 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ais", name = "q", descriptor = "()Z", line = 35)
	@Override
	boolean method11464() {
		if (!this.method11447()) {
			return false;
		}
		this.aClass115_8 = this.aClass104_Sub2_25.method20892("FilterColourRemapping");
		if (this.aClass115_8 == null) {
			return false;
		}
		try {
			this.aClass93_Sub33_Sub1_37 = this.aClass115_8.method8198("sceneTex");
			this.aClass116Array6 = new Class116[3];
			this.aClass93_Sub33_Sub1Array1 = new Class93_Sub33_Sub1[3];
			if (this.aClass104_Sub2_25.aBoolean471) {
				this.aClass116Array6[0] = this.aClass115_8.method8268("techRemap3D_1");
				this.aClass116Array6[1] = this.aClass115_8.method8268("techRemap3D_2");
				this.aClass116Array6[2] = this.aClass115_8.method8268("techRemap3D_3");
				this.aClass93_Sub33_Sub1Array1[0] = this.aClass115_8.method8198("remapTex3D_1");
				this.aClass93_Sub33_Sub1Array1[1] = this.aClass115_8.method8198("remapTex3D_2");
				this.aClass93_Sub33_Sub1Array1[2] = this.aClass115_8.method8198("remapTex3D_3");
			} else {
				this.aClass116Array6[0] = this.aClass115_8.method8268("techRemap2D_1");
				this.aClass116Array6[1] = this.aClass115_8.method8268("techRemap2D_2");
				this.aClass116Array6[2] = this.aClass115_8.method8268("techRemap2D_3");
				this.aClass93_Sub33_Sub1Array1[0] = this.aClass115_8.method8198("remapTex2D_1");
				this.aClass93_Sub33_Sub1Array1[1] = this.aClass115_8.method8198("remapTex2D_2");
				this.aClass93_Sub33_Sub1Array1[2] = this.aClass115_8.method8198("remapTex2D_3");
			}
			this.aClass93_Sub33_Sub1_38 = this.aClass115_8.method8198("paramsWeightings");
			this.aClass93_Sub33_Sub1_39 = this.aClass115_8.method8198("pixelOffset");
			this.aClass93_Sub33_Sub1_36 = this.aClass115_8.method8198("PosAndTexCoords");
		} catch (@Pc(164) Exception_Sub2_Sub1 local164) {
			return false;
		} catch (@Pc(167) Exception_Sub2_Sub2 local167) {
			return false;
		}
		if (this.aClass116Array6[0].method8438() && this.aClass116Array6[1].method8438() && this.aClass116Array6[2].method8438()) {
			this.aBoolean257 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ais", name = "w", descriptor = "(II)V", line = 79)
	@Override
	void method11463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ais", name = "a", descriptor = "(II)V", line = 79)
	@Override
	void method11452() {
	}

	@OriginalMember(owner = "client!ais", name = "g", descriptor = "(II)V", line = 79)
	@Override
	void method11473() {
	}

	@OriginalMember(owner = "client!ais", name = "f", descriptor = "()V", line = 80)
	@Override
	void method11451() {
	}

	@OriginalMember(owner = "client!ais", name = "b", descriptor = "()V", line = 80)
	@Override
	void method11466() {
	}

	@OriginalMember(owner = "client!ais", name = "h", descriptor = "()V", line = 80)
	@Override
	void method11467() {
	}

	@OriginalMember(owner = "client!ais", name = "z", descriptor = "()I", line = 83)
	@Override
	int method11455() {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "ag", descriptor = "()I", line = 83)
	@Override
	int method11449() {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "ae", descriptor = "()I", line = 83)
	@Override
	int method11472() {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "ah", descriptor = "()I", line = 83)
	@Override
	int method11474() {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "au", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V", line = 87)
	@Override
	void method11458(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20882();
		@Pc(7) float local7 = (float) arg1.method23736();
		@Pc(11) float local11 = (float) arg1.method23737();
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass104_Sub2_25.method20435().method23736() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass104_Sub2_25.method20435().method23737() : local95;
		@Pc(122) Class116 local122 = this.aClass116Array6[anInt1379 - 1];
		this.aClass115_8.method8203(local122);
		this.aClass115_8.method8285();
		this.aClass115_8.method8210(this.aClass93_Sub33_Sub1_38, aFloat139, aFloatArray41[0], aFloatArray41[1], aFloatArray41[2]);
		for (@Pc(152) int local152 = 0; local152 < anInt1379; local152++) {
			if (aClass102_Sub2Array1[local152] != null) {
				@Pc(164) Class93_Sub33_Sub1 local164 = this.aClass93_Sub33_Sub1Array1[local152];
				@Pc(169) Interface43 local169 = aClass102_Sub2Array1[local152].method2593();
				this.aClass115_8.method8293(local164, local152 + 1, local169);
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
		this.aClass115_8.method8213(this.aClass93_Sub33_Sub1_36, local89);
		this.aClass115_8.method8293(this.aClass93_Sub33_Sub1_37, 0, arg2);
		this.aClass115_8.method8210(this.aClass93_Sub33_Sub1_39, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass104_Sub2_25.method20463(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ais", name = "l", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V", line = 87)
	@Override
	void method11453(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20882();
		@Pc(7) float local7 = (float) arg1.method23736();
		@Pc(11) float local11 = (float) arg1.method23737();
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass104_Sub2_25.method20435().method23736() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass104_Sub2_25.method20435().method23737() : local95;
		@Pc(122) Class116 local122 = this.aClass116Array6[anInt1379 - 1];
		this.aClass115_8.method8203(local122);
		this.aClass115_8.method8285();
		this.aClass115_8.method8210(this.aClass93_Sub33_Sub1_38, aFloat139, aFloatArray41[0], aFloatArray41[1], aFloatArray41[2]);
		for (@Pc(152) int local152 = 0; local152 < anInt1379; local152++) {
			if (aClass102_Sub2Array1[local152] != null) {
				@Pc(164) Class93_Sub33_Sub1 local164 = this.aClass93_Sub33_Sub1Array1[local152];
				@Pc(169) Interface43 local169 = aClass102_Sub2Array1[local152].method2593();
				this.aClass115_8.method8293(local164, local152 + 1, local169);
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
		this.aClass115_8.method8213(this.aClass93_Sub33_Sub1_36, local89);
		this.aClass115_8.method8293(this.aClass93_Sub33_Sub1_37, 0, arg2);
		this.aClass115_8.method8210(this.aClass93_Sub33_Sub1_39, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass104_Sub2_25.method20463(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ais", name = "ad", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V", line = 87)
	@Override
	void method11481(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20882();
		@Pc(7) float local7 = (float) arg1.method23736();
		@Pc(11) float local11 = (float) arg1.method23737();
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass104_Sub2_25.method20435().method23736() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass104_Sub2_25.method20435().method23737() : local95;
		@Pc(122) Class116 local122 = this.aClass116Array6[anInt1379 - 1];
		this.aClass115_8.method8203(local122);
		this.aClass115_8.method8285();
		this.aClass115_8.method8210(this.aClass93_Sub33_Sub1_38, aFloat139, aFloatArray41[0], aFloatArray41[1], aFloatArray41[2]);
		for (@Pc(152) int local152 = 0; local152 < anInt1379; local152++) {
			if (aClass102_Sub2Array1[local152] != null) {
				@Pc(164) Class93_Sub33_Sub1 local164 = this.aClass93_Sub33_Sub1Array1[local152];
				@Pc(169) Interface43 local169 = aClass102_Sub2Array1[local152].method2593();
				this.aClass115_8.method8293(local164, local152 + 1, local169);
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
		this.aClass115_8.method8213(this.aClass93_Sub33_Sub1_36, local89);
		this.aClass115_8.method8293(this.aClass93_Sub33_Sub1_37, 0, arg2);
		this.aClass115_8.method8210(this.aClass93_Sub33_Sub1_39, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass104_Sub2_25.method20463(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ais", name = "am", descriptor = "(ILclient!afq;Lclient!lz;Lclient!dw;Lclient!lz;Z)V", line = 87)
	@Override
	void method11483(@OriginalArg(0) int arg0, @OriginalArg(1) Class112_Sub1 arg1, @OriginalArg(2) Interface38 arg2, @OriginalArg(3) Interface19 arg3, @OriginalArg(4) Interface38 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass104_Sub2_25.method20882();
		@Pc(7) float local7 = (float) arg1.method23736();
		@Pc(11) float local11 = (float) arg1.method23737();
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass104_Sub2_25.method20435().method23736() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass104_Sub2_25.method20435().method23737() : local95;
		@Pc(122) Class116 local122 = this.aClass116Array6[anInt1379 - 1];
		this.aClass115_8.method8203(local122);
		this.aClass115_8.method8285();
		this.aClass115_8.method8210(this.aClass93_Sub33_Sub1_38, aFloat139, aFloatArray41[0], aFloatArray41[1], aFloatArray41[2]);
		for (@Pc(152) int local152 = 0; local152 < anInt1379; local152++) {
			if (aClass102_Sub2Array1[local152] != null) {
				@Pc(164) Class93_Sub33_Sub1 local164 = this.aClass93_Sub33_Sub1Array1[local152];
				@Pc(169) Interface43 local169 = aClass102_Sub2Array1[local152].method2593();
				this.aClass115_8.method8293(local164, local152 + 1, local169);
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
		this.aClass115_8.method8213(this.aClass93_Sub33_Sub1_36, local89);
		this.aClass115_8.method8293(this.aClass93_Sub33_Sub1_37, 0, arg2);
		this.aClass115_8.method8210(this.aClass93_Sub33_Sub1_39, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass104_Sub2_25.method20463(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ais", name = "i", descriptor = "(I)V", line = 126)
	@Override
	void method11470() {
		this.aClass115_8.method8255();
	}

	@OriginalMember(owner = "client!ais", name = "u", descriptor = "(I)V", line = 126)
	@Override
	void method11454(@OriginalArg(0) int arg0) {
		this.aClass115_8.method8255();
	}

	@OriginalMember(owner = "client!ais", name = "j", descriptor = "(I)V", line = 126)
	@Override
	void method11471() {
		this.aClass115_8.method8255();
	}

	@OriginalMember(owner = "client!ais", name = "t", descriptor = "(I)V", line = 126)
	@Override
	void method11468() {
		this.aClass115_8.method8255();
	}

	@OriginalMember(owner = "client!ais", name = "d", descriptor = "()I", line = 130)
	@Override
	int method11457() {
		return 0;
	}

	@OriginalMember(owner = "client!ais", name = "ac", descriptor = "()I", line = 130)
	@Override
	int method11476() {
		return 0;
	}

	@OriginalMember(owner = "client!ais", name = "p", descriptor = "()I", line = 134)
	@Override
	int method11456() {
		return 2;
	}

	@OriginalMember(owner = "client!ais", name = "al", descriptor = "()I", line = 134)
	@Override
	int method11475() {
		return 2;
	}

	@OriginalMember(owner = "client!ais", name = "at", descriptor = "()Z", line = 138)
	@Override
	boolean method11480() {
		return anInt1379 == 0 || aFloat139 == 1.0F || aFloatArray41[0] + aFloatArray41[1] + aFloatArray41[2] == 0.0F || aClass102_Sub2Array1[0] == null && aClass102_Sub2Array1[1] == null && aClass102_Sub2Array1[2] == null;
	}

	@OriginalMember(owner = "client!ais", name = "v", descriptor = "()Z", line = 138)
	@Override
	boolean method11460() {
		return anInt1379 == 0 || aFloat139 == 1.0F || aFloatArray41[0] + aFloatArray41[1] + aFloatArray41[2] == 0.0F || aClass102_Sub2Array1[0] == null && aClass102_Sub2Array1[1] == null && aClass102_Sub2Array1[2] == null;
	}
}
