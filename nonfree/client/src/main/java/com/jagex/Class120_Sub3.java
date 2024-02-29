package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahu")
public class Class120_Sub3 extends Class120 {

	@OriginalMember(owner = "client!ahu", name = "v", descriptor = "[F")
	public static float[] aFloatArray52 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!ahu", name = "l", descriptor = "F")
	public static float aFloat143 = 1.0F;

	@OriginalMember(owner = "client!ahu", name = "y", descriptor = "I")
	public static int anInt1240 = 1;

	@OriginalMember(owner = "client!ahu", name = "w", descriptor = "[Lclient!aec;")
	public static Class85_Sub1[] aClass85_Sub1Array1 = new Class85_Sub1[] { null, null, null };

	@OriginalMember(owner = "client!ahu", name = "r", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_36;

	@OriginalMember(owner = "client!ahu", name = "q", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_37;

	@OriginalMember(owner = "client!ahu", name = "t", descriptor = "Lclient!hi;")
	Class112 aClass112_8;

	@OriginalMember(owner = "client!ahu", name = "s", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_38;

	@OriginalMember(owner = "client!ahu", name = "g", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_39;

	@OriginalMember(owner = "client!ahu", name = "z", descriptor = "Z")
	boolean aBoolean219;

	@OriginalMember(owner = "client!ahu", name = "x", descriptor = "[Lclient!hr;")
	Class105[] aClass105Array6 = null;

	@OriginalMember(owner = "client!ahu", name = "d", descriptor = "[Lclient!aqz;")
	Class77_Sub12_Sub1[] aClass77_Sub12_Sub1Array1 = null;

	@OriginalMember(owner = "client!ahu", name = "<init>", descriptor = "(Lclient!aed;)V", line = 23)
	public Class120_Sub3(@OriginalArg(0) Class86_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahu", name = "p", descriptor = "()Z", line = 27)
	@Override
	boolean method10798() {
		return this.aClass86_Sub1_23.aBoolean454 && this.aClass86_Sub1_23.method20681();
	}

	@OriginalMember(owner = "client!ahu", name = "j", descriptor = "()Z", line = 27)
	@Override
	boolean method10815() {
		return this.aClass86_Sub1_23.aBoolean454 && this.aClass86_Sub1_23.method20681();
	}

	@OriginalMember(owner = "client!ahu", name = "ae", descriptor = "()Z", line = 31)
	@Override
	boolean method10814() {
		return this.aBoolean219;
	}

	@OriginalMember(owner = "client!ahu", name = "c", descriptor = "()Z", line = 31)
	@Override
	boolean method10805() {
		return this.aBoolean219;
	}

	@OriginalMember(owner = "client!ahu", name = "at", descriptor = "()Z", line = 31)
	@Override
	boolean method10791() {
		return this.aBoolean219;
	}

	@OriginalMember(owner = "client!ahu", name = "v", descriptor = "()Z", line = 35)
	@Override
	boolean method10790() {
		if (!this.method10798()) {
			return false;
		}
		this.aClass112_8 = this.aClass86_Sub1_23.method20613("FilterColourRemapping");
		if (this.aClass112_8 == null) {
			return false;
		}
		try {
			this.aClass77_Sub12_Sub1_37 = this.aClass112_8.method9524("sceneTex");
			this.aClass105Array6 = new Class105[3];
			this.aClass77_Sub12_Sub1Array1 = new Class77_Sub12_Sub1[3];
			if (this.aClass86_Sub1_23.aBoolean458) {
				this.aClass105Array6[0] = this.aClass112_8.method9458("techRemap3D_1");
				this.aClass105Array6[1] = this.aClass112_8.method9458("techRemap3D_2");
				this.aClass105Array6[2] = this.aClass112_8.method9458("techRemap3D_3");
				this.aClass77_Sub12_Sub1Array1[0] = this.aClass112_8.method9524("remapTex3D_1");
				this.aClass77_Sub12_Sub1Array1[1] = this.aClass112_8.method9524("remapTex3D_2");
				this.aClass77_Sub12_Sub1Array1[2] = this.aClass112_8.method9524("remapTex3D_3");
			} else {
				this.aClass105Array6[0] = this.aClass112_8.method9458("techRemap2D_1");
				this.aClass105Array6[1] = this.aClass112_8.method9458("techRemap2D_2");
				this.aClass105Array6[2] = this.aClass112_8.method9458("techRemap2D_3");
				this.aClass77_Sub12_Sub1Array1[0] = this.aClass112_8.method9524("remapTex2D_1");
				this.aClass77_Sub12_Sub1Array1[1] = this.aClass112_8.method9524("remapTex2D_2");
				this.aClass77_Sub12_Sub1Array1[2] = this.aClass112_8.method9524("remapTex2D_3");
			}
			this.aClass77_Sub12_Sub1_38 = this.aClass112_8.method9524("paramsWeightings");
			this.aClass77_Sub12_Sub1_36 = this.aClass112_8.method9524("pixelOffset");
			this.aClass77_Sub12_Sub1_39 = this.aClass112_8.method9524("PosAndTexCoords");
		} catch (@Pc(164) Exception_Sub3_Sub1 local164) {
			return false;
		} catch (@Pc(167) Exception_Sub3_Sub2 local167) {
			return false;
		}
		if (this.aClass105Array6[0].method9595() && this.aClass105Array6[1].method9595() && this.aClass105Array6[2].method9595()) {
			this.aBoolean219 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahu", name = "i", descriptor = "()Z", line = 35)
	@Override
	boolean method10813() {
		if (!this.method10798()) {
			return false;
		}
		this.aClass112_8 = this.aClass86_Sub1_23.method20613("FilterColourRemapping");
		if (this.aClass112_8 == null) {
			return false;
		}
		try {
			this.aClass77_Sub12_Sub1_37 = this.aClass112_8.method9524("sceneTex");
			this.aClass105Array6 = new Class105[3];
			this.aClass77_Sub12_Sub1Array1 = new Class77_Sub12_Sub1[3];
			if (this.aClass86_Sub1_23.aBoolean458) {
				this.aClass105Array6[0] = this.aClass112_8.method9458("techRemap3D_1");
				this.aClass105Array6[1] = this.aClass112_8.method9458("techRemap3D_2");
				this.aClass105Array6[2] = this.aClass112_8.method9458("techRemap3D_3");
				this.aClass77_Sub12_Sub1Array1[0] = this.aClass112_8.method9524("remapTex3D_1");
				this.aClass77_Sub12_Sub1Array1[1] = this.aClass112_8.method9524("remapTex3D_2");
				this.aClass77_Sub12_Sub1Array1[2] = this.aClass112_8.method9524("remapTex3D_3");
			} else {
				this.aClass105Array6[0] = this.aClass112_8.method9458("techRemap2D_1");
				this.aClass105Array6[1] = this.aClass112_8.method9458("techRemap2D_2");
				this.aClass105Array6[2] = this.aClass112_8.method9458("techRemap2D_3");
				this.aClass77_Sub12_Sub1Array1[0] = this.aClass112_8.method9524("remapTex2D_1");
				this.aClass77_Sub12_Sub1Array1[1] = this.aClass112_8.method9524("remapTex2D_2");
				this.aClass77_Sub12_Sub1Array1[2] = this.aClass112_8.method9524("remapTex2D_3");
			}
			this.aClass77_Sub12_Sub1_38 = this.aClass112_8.method9524("paramsWeightings");
			this.aClass77_Sub12_Sub1_36 = this.aClass112_8.method9524("pixelOffset");
			this.aClass77_Sub12_Sub1_39 = this.aClass112_8.method9524("PosAndTexCoords");
		} catch (@Pc(164) Exception_Sub3_Sub1 local164) {
			return false;
		} catch (@Pc(167) Exception_Sub3_Sub2 local167) {
			return false;
		}
		if (this.aClass105Array6[0].method9595() && this.aClass105Array6[1].method9595() && this.aClass105Array6[2].method9595()) {
			this.aBoolean219 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahu", name = "k", descriptor = "()Z", line = 35)
	@Override
	boolean method10809() {
		if (!this.method10798()) {
			return false;
		}
		this.aClass112_8 = this.aClass86_Sub1_23.method20613("FilterColourRemapping");
		if (this.aClass112_8 == null) {
			return false;
		}
		try {
			this.aClass77_Sub12_Sub1_37 = this.aClass112_8.method9524("sceneTex");
			this.aClass105Array6 = new Class105[3];
			this.aClass77_Sub12_Sub1Array1 = new Class77_Sub12_Sub1[3];
			if (this.aClass86_Sub1_23.aBoolean458) {
				this.aClass105Array6[0] = this.aClass112_8.method9458("techRemap3D_1");
				this.aClass105Array6[1] = this.aClass112_8.method9458("techRemap3D_2");
				this.aClass105Array6[2] = this.aClass112_8.method9458("techRemap3D_3");
				this.aClass77_Sub12_Sub1Array1[0] = this.aClass112_8.method9524("remapTex3D_1");
				this.aClass77_Sub12_Sub1Array1[1] = this.aClass112_8.method9524("remapTex3D_2");
				this.aClass77_Sub12_Sub1Array1[2] = this.aClass112_8.method9524("remapTex3D_3");
			} else {
				this.aClass105Array6[0] = this.aClass112_8.method9458("techRemap2D_1");
				this.aClass105Array6[1] = this.aClass112_8.method9458("techRemap2D_2");
				this.aClass105Array6[2] = this.aClass112_8.method9458("techRemap2D_3");
				this.aClass77_Sub12_Sub1Array1[0] = this.aClass112_8.method9524("remapTex2D_1");
				this.aClass77_Sub12_Sub1Array1[1] = this.aClass112_8.method9524("remapTex2D_2");
				this.aClass77_Sub12_Sub1Array1[2] = this.aClass112_8.method9524("remapTex2D_3");
			}
			this.aClass77_Sub12_Sub1_38 = this.aClass112_8.method9524("paramsWeightings");
			this.aClass77_Sub12_Sub1_36 = this.aClass112_8.method9524("pixelOffset");
			this.aClass77_Sub12_Sub1_39 = this.aClass112_8.method9524("PosAndTexCoords");
		} catch (@Pc(164) Exception_Sub3_Sub1 local164) {
			return false;
		} catch (@Pc(167) Exception_Sub3_Sub2 local167) {
			return false;
		}
		if (this.aClass105Array6[0].method9595() && this.aClass105Array6[1].method9595() && this.aClass105Array6[2].method9595()) {
			this.aBoolean219 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahu", name = "u", descriptor = "()Z", line = 35)
	@Override
	boolean method10800() {
		if (!this.method10798()) {
			return false;
		}
		this.aClass112_8 = this.aClass86_Sub1_23.method20613("FilterColourRemapping");
		if (this.aClass112_8 == null) {
			return false;
		}
		try {
			this.aClass77_Sub12_Sub1_37 = this.aClass112_8.method9524("sceneTex");
			this.aClass105Array6 = new Class105[3];
			this.aClass77_Sub12_Sub1Array1 = new Class77_Sub12_Sub1[3];
			if (this.aClass86_Sub1_23.aBoolean458) {
				this.aClass105Array6[0] = this.aClass112_8.method9458("techRemap3D_1");
				this.aClass105Array6[1] = this.aClass112_8.method9458("techRemap3D_2");
				this.aClass105Array6[2] = this.aClass112_8.method9458("techRemap3D_3");
				this.aClass77_Sub12_Sub1Array1[0] = this.aClass112_8.method9524("remapTex3D_1");
				this.aClass77_Sub12_Sub1Array1[1] = this.aClass112_8.method9524("remapTex3D_2");
				this.aClass77_Sub12_Sub1Array1[2] = this.aClass112_8.method9524("remapTex3D_3");
			} else {
				this.aClass105Array6[0] = this.aClass112_8.method9458("techRemap2D_1");
				this.aClass105Array6[1] = this.aClass112_8.method9458("techRemap2D_2");
				this.aClass105Array6[2] = this.aClass112_8.method9458("techRemap2D_3");
				this.aClass77_Sub12_Sub1Array1[0] = this.aClass112_8.method9524("remapTex2D_1");
				this.aClass77_Sub12_Sub1Array1[1] = this.aClass112_8.method9524("remapTex2D_2");
				this.aClass77_Sub12_Sub1Array1[2] = this.aClass112_8.method9524("remapTex2D_3");
			}
			this.aClass77_Sub12_Sub1_38 = this.aClass112_8.method9524("paramsWeightings");
			this.aClass77_Sub12_Sub1_36 = this.aClass112_8.method9524("pixelOffset");
			this.aClass77_Sub12_Sub1_39 = this.aClass112_8.method9524("PosAndTexCoords");
		} catch (@Pc(164) Exception_Sub3_Sub1 local164) {
			return false;
		} catch (@Pc(167) Exception_Sub3_Sub2 local167) {
			return false;
		}
		if (this.aClass105Array6[0].method9595() && this.aClass105Array6[1].method9595() && this.aClass105Array6[2].method9595()) {
			this.aBoolean219 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahu", name = "e", descriptor = "()Z", line = 35)
	@Override
	boolean method10801() {
		if (!this.method10798()) {
			return false;
		}
		this.aClass112_8 = this.aClass86_Sub1_23.method20613("FilterColourRemapping");
		if (this.aClass112_8 == null) {
			return false;
		}
		try {
			this.aClass77_Sub12_Sub1_37 = this.aClass112_8.method9524("sceneTex");
			this.aClass105Array6 = new Class105[3];
			this.aClass77_Sub12_Sub1Array1 = new Class77_Sub12_Sub1[3];
			if (this.aClass86_Sub1_23.aBoolean458) {
				this.aClass105Array6[0] = this.aClass112_8.method9458("techRemap3D_1");
				this.aClass105Array6[1] = this.aClass112_8.method9458("techRemap3D_2");
				this.aClass105Array6[2] = this.aClass112_8.method9458("techRemap3D_3");
				this.aClass77_Sub12_Sub1Array1[0] = this.aClass112_8.method9524("remapTex3D_1");
				this.aClass77_Sub12_Sub1Array1[1] = this.aClass112_8.method9524("remapTex3D_2");
				this.aClass77_Sub12_Sub1Array1[2] = this.aClass112_8.method9524("remapTex3D_3");
			} else {
				this.aClass105Array6[0] = this.aClass112_8.method9458("techRemap2D_1");
				this.aClass105Array6[1] = this.aClass112_8.method9458("techRemap2D_2");
				this.aClass105Array6[2] = this.aClass112_8.method9458("techRemap2D_3");
				this.aClass77_Sub12_Sub1Array1[0] = this.aClass112_8.method9524("remapTex2D_1");
				this.aClass77_Sub12_Sub1Array1[1] = this.aClass112_8.method9524("remapTex2D_2");
				this.aClass77_Sub12_Sub1Array1[2] = this.aClass112_8.method9524("remapTex2D_3");
			}
			this.aClass77_Sub12_Sub1_38 = this.aClass112_8.method9524("paramsWeightings");
			this.aClass77_Sub12_Sub1_36 = this.aClass112_8.method9524("pixelOffset");
			this.aClass77_Sub12_Sub1_39 = this.aClass112_8.method9524("PosAndTexCoords");
		} catch (@Pc(164) Exception_Sub3_Sub1 local164) {
			return false;
		} catch (@Pc(167) Exception_Sub3_Sub2 local167) {
			return false;
		}
		if (this.aClass105Array6[0].method9595() && this.aClass105Array6[1].method9595() && this.aClass105Array6[2].method9595()) {
			this.aBoolean219 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahu", name = "w", descriptor = "(II)V", line = 79)
	@Override
	void method10792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ahu", name = "aq", descriptor = "(II)V", line = 79)
	@Override
	void method10799() {
	}

	@OriginalMember(owner = "client!ahu", name = "am", descriptor = "(II)V", line = 79)
	@Override
	void method10817() {
	}

	@OriginalMember(owner = "client!ahu", name = "ah", descriptor = "(II)V", line = 79)
	@Override
	void method10795() {
	}

	@OriginalMember(owner = "client!ahu", name = "as", descriptor = "(II)V", line = 79)
	@Override
	void method10816() {
	}

	@OriginalMember(owner = "client!ahu", name = "y", descriptor = "()V", line = 80)
	@Override
	void method10821() {
	}

	@OriginalMember(owner = "client!ahu", name = "af", descriptor = "()V", line = 80)
	@Override
	void method10819() {
	}

	@OriginalMember(owner = "client!ahu", name = "ay", descriptor = "()V", line = 80)
	@Override
	void method10818() {
	}

	@OriginalMember(owner = "client!ahu", name = "an", descriptor = "()V", line = 80)
	@Override
	void method10820() {
	}

	@OriginalMember(owner = "client!ahu", name = "x", descriptor = "()I", line = 83)
	@Override
	int method10777() {
		return 1;
	}

	@OriginalMember(owner = "client!ahu", name = "a", descriptor = "()I", line = 83)
	@Override
	int method10776() {
		return 1;
	}

	@OriginalMember(owner = "client!ahu", name = "m", descriptor = "()I", line = 83)
	@Override
	int method10778() {
		return 1;
	}

	@OriginalMember(owner = "client!ahu", name = "h", descriptor = "()I", line = 83)
	@Override
	int method10775() {
		return 1;
	}

	@OriginalMember(owner = "client!ahu", name = "aj", descriptor = "()I", line = 83)
	@Override
	int method10779() {
		return 1;
	}

	@OriginalMember(owner = "client!ahu", name = "t", descriptor = "(ILclient!aeo;Lclient!ks;Lclient!de;Lclient!ks;Z)V", line = 87)
	@Override
	void method10793(@OriginalArg(0) int arg0, @OriginalArg(1) Class92_Sub1 arg1, @OriginalArg(2) Interface37 arg2, @OriginalArg(3) Interface20 arg3, @OriginalArg(4) Interface37 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass86_Sub1_23.method20664();
		@Pc(7) float local7 = (float) arg1.method23491();
		@Pc(11) float local11 = (float) arg1.method23493();
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass86_Sub1_23.method19943().method23491() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass86_Sub1_23.method19943().method23493() : local95;
		@Pc(122) Class105 local122 = this.aClass105Array6[anInt1240 - 1];
		this.aClass112_8.method9547(local122);
		this.aClass112_8.method9545();
		this.aClass112_8.method9483(this.aClass77_Sub12_Sub1_38, aFloat143, aFloatArray52[0], aFloatArray52[1], aFloatArray52[2]);
		@Pc(148) Interface42 local148 = null;
		@Pc(150) Class77_Sub12_Sub1 local150 = null;
		for (@Pc(152) int local152 = 0; local152 < anInt1240; local152++) {
			if (aClass85_Sub1Array1[local152] != null) {
				local150 = this.aClass77_Sub12_Sub1Array1[local152];
				local148 = aClass85_Sub1Array1[local152].method2738();
				this.aClass112_8.method9503(local150, local152 + 1, local148);
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
		this.aClass112_8.method9490(this.aClass77_Sub12_Sub1_39, local89);
		this.aClass112_8.method9503(this.aClass77_Sub12_Sub1_37, 0, arg2);
		this.aClass112_8.method9483(this.aClass77_Sub12_Sub1_36, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass86_Sub1_23.method20104(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ahu", name = "o", descriptor = "(ILclient!aeo;Lclient!ks;Lclient!de;Lclient!ks;Z)V", line = 87)
	@Override
	void method10802(@OriginalArg(0) int arg0, @OriginalArg(1) Class92_Sub1 arg1, @OriginalArg(2) Interface37 arg2, @OriginalArg(3) Interface20 arg3, @OriginalArg(4) Interface37 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass86_Sub1_23.method20664();
		@Pc(7) float local7 = (float) arg1.method23491();
		@Pc(11) float local11 = (float) arg1.method23493();
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass86_Sub1_23.method19943().method23491() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass86_Sub1_23.method19943().method23493() : local95;
		@Pc(122) Class105 local122 = this.aClass105Array6[anInt1240 - 1];
		this.aClass112_8.method9547(local122);
		this.aClass112_8.method9545();
		this.aClass112_8.method9483(this.aClass77_Sub12_Sub1_38, aFloat143, aFloatArray52[0], aFloatArray52[1], aFloatArray52[2]);
		@Pc(148) Interface42 local148 = null;
		@Pc(150) Class77_Sub12_Sub1 local150 = null;
		for (@Pc(152) int local152 = 0; local152 < anInt1240; local152++) {
			if (aClass85_Sub1Array1[local152] != null) {
				local150 = this.aClass77_Sub12_Sub1Array1[local152];
				local148 = aClass85_Sub1Array1[local152].method2738();
				this.aClass112_8.method9503(local150, local152 + 1, local148);
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
		this.aClass112_8.method9490(this.aClass77_Sub12_Sub1_39, local89);
		this.aClass112_8.method9503(this.aClass77_Sub12_Sub1_37, 0, arg2);
		this.aClass112_8.method9483(this.aClass77_Sub12_Sub1_36, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass86_Sub1_23.method20104(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ahu", name = "b", descriptor = "(ILclient!aeo;Lclient!ks;Lclient!de;Lclient!ks;Z)V", line = 87)
	@Override
	void method10803(@OriginalArg(0) int arg0, @OriginalArg(1) Class92_Sub1 arg1, @OriginalArg(2) Interface37 arg2, @OriginalArg(3) Interface20 arg3, @OriginalArg(4) Interface37 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass86_Sub1_23.method20664();
		@Pc(7) float local7 = (float) arg1.method23491();
		@Pc(11) float local11 = (float) arg1.method23493();
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass86_Sub1_23.method19943().method23491() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass86_Sub1_23.method19943().method23493() : local95;
		@Pc(122) Class105 local122 = this.aClass105Array6[anInt1240 - 1];
		this.aClass112_8.method9547(local122);
		this.aClass112_8.method9545();
		this.aClass112_8.method9483(this.aClass77_Sub12_Sub1_38, aFloat143, aFloatArray52[0], aFloatArray52[1], aFloatArray52[2]);
		@Pc(148) Interface42 local148 = null;
		@Pc(150) Class77_Sub12_Sub1 local150 = null;
		for (@Pc(152) int local152 = 0; local152 < anInt1240; local152++) {
			if (aClass85_Sub1Array1[local152] != null) {
				local150 = this.aClass77_Sub12_Sub1Array1[local152];
				local148 = aClass85_Sub1Array1[local152].method2738();
				this.aClass112_8.method9503(local150, local152 + 1, local148);
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
		this.aClass112_8.method9490(this.aClass77_Sub12_Sub1_39, local89);
		this.aClass112_8.method9503(this.aClass77_Sub12_Sub1_37, 0, arg2);
		this.aClass112_8.method9483(this.aClass77_Sub12_Sub1_36, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass86_Sub1_23.method20104(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ahu", name = "n", descriptor = "(ILclient!aeo;Lclient!ks;Lclient!de;Lclient!ks;Z)V", line = 87)
	@Override
	void method10804(@OriginalArg(0) int arg0, @OriginalArg(1) Class92_Sub1 arg1, @OriginalArg(2) Interface37 arg2, @OriginalArg(3) Interface20 arg3, @OriginalArg(4) Interface37 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass86_Sub1_23.method20664();
		@Pc(7) float local7 = (float) arg1.method23491();
		@Pc(11) float local11 = (float) arg1.method23493();
		@Pc(19) float local19 = local3 * 2.0F / local7;
		@Pc(26) float local26 = -local3 * 2.0F / local11;
		@Pc(89) float[] local89 = new float[] { -1.0F + local19, local26 + 1.0F, 0.0F, 0.0F, -1.0F + local19, -3.0F + local26, 0.0F, 2.0F, local19 + 3.0F, local26 + 1.0F, 2.0F, 0.0F };
		@Pc(92) int local92 = (int) local7;
		@Pc(95) int local95 = (int) local11;
		@Pc(105) int local105 = arg5 ? this.aClass86_Sub1_23.method19943().method23491() : local92;
		@Pc(115) int local115 = arg5 ? this.aClass86_Sub1_23.method19943().method23493() : local95;
		@Pc(122) Class105 local122 = this.aClass105Array6[anInt1240 - 1];
		this.aClass112_8.method9547(local122);
		this.aClass112_8.method9545();
		this.aClass112_8.method9483(this.aClass77_Sub12_Sub1_38, aFloat143, aFloatArray52[0], aFloatArray52[1], aFloatArray52[2]);
		@Pc(148) Interface42 local148 = null;
		@Pc(150) Class77_Sub12_Sub1 local150 = null;
		for (@Pc(152) int local152 = 0; local152 < anInt1240; local152++) {
			if (aClass85_Sub1Array1[local152] != null) {
				local150 = this.aClass77_Sub12_Sub1Array1[local152];
				local148 = aClass85_Sub1Array1[local152].method2738();
				this.aClass112_8.method9503(local150, local152 + 1, local148);
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
		this.aClass112_8.method9490(this.aClass77_Sub12_Sub1_39, local89);
		this.aClass112_8.method9503(this.aClass77_Sub12_Sub1_37, 0, arg2);
		this.aClass112_8.method9483(this.aClass77_Sub12_Sub1_36, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass86_Sub1_23.method20104(0, 0, local92, local95);
	}

	@OriginalMember(owner = "client!ahu", name = "q", descriptor = "(I)V", line = 126)
	@Override
	void method10794(@OriginalArg(0) int arg0) {
		this.aClass112_8.method9543();
	}

	@OriginalMember(owner = "client!ahu", name = "ab", descriptor = "(I)V", line = 126)
	@Override
	void method10808() {
		this.aClass112_8.method9543();
	}

	@OriginalMember(owner = "client!ahu", name = "aa", descriptor = "(I)V", line = 126)
	@Override
	void method10807() {
		this.aClass112_8.method9543();
	}

	@OriginalMember(owner = "client!ahu", name = "ap", descriptor = "(I)V", line = 126)
	@Override
	void method10822() {
		this.aClass112_8.method9543();
	}

	@OriginalMember(owner = "client!ahu", name = "aw", descriptor = "(I)V", line = 126)
	@Override
	void method10823() {
		this.aClass112_8.method9543();
	}

	@OriginalMember(owner = "client!ahu", name = "s", descriptor = "()I", line = 130)
	@Override
	int method10781() {
		return 0;
	}

	@OriginalMember(owner = "client!ahu", name = "ag", descriptor = "()I", line = 130)
	@Override
	int method10780() {
		return 0;
	}

	@OriginalMember(owner = "client!ahu", name = "d", descriptor = "()I", line = 134)
	@Override
	int method10796() {
		return 2;
	}

	@OriginalMember(owner = "client!ahu", name = "ai", descriptor = "()I", line = 134)
	@Override
	int method10806() {
		return 2;
	}

	@OriginalMember(owner = "client!ahu", name = "z", descriptor = "()Z", line = 138)
	@Override
	boolean method10797() {
		return anInt1240 == 0 || aFloat143 == 1.0F || aFloatArray52[0] + aFloatArray52[1] + aFloatArray52[2] == 0.0F || aClass85_Sub1Array1[0] == null && aClass85_Sub1Array1[1] == null && aClass85_Sub1Array1[2] == null;
	}

	@OriginalMember(owner = "client!ahu", name = "av", descriptor = "()Z", line = 138)
	@Override
	boolean method10812() {
		return anInt1240 == 0 || aFloat143 == 1.0F || aFloatArray52[0] + aFloatArray52[1] + aFloatArray52[2] == 0.0F || aClass85_Sub1Array1[0] == null && aClass85_Sub1Array1[1] == null && aClass85_Sub1Array1[2] == null;
	}

	@OriginalMember(owner = "client!ahu", name = "ac", descriptor = "()Z", line = 138)
	@Override
	boolean method10811() {
		return anInt1240 == 0 || aFloat143 == 1.0F || aFloatArray52[0] + aFloatArray52[1] + aFloatArray52[2] == 0.0F || aClass85_Sub1Array1[0] == null && aClass85_Sub1Array1[1] == null && aClass85_Sub1Array1[2] == null;
	}

	@OriginalMember(owner = "client!ahu", name = "ar", descriptor = "()Z", line = 138)
	@Override
	boolean method10789() {
		return anInt1240 == 0 || aFloat143 == 1.0F || aFloatArray52[0] + aFloatArray52[1] + aFloatArray52[2] == 0.0F || aClass85_Sub1Array1[0] == null && aClass85_Sub1Array1[1] == null && aClass85_Sub1Array1[2] == null;
	}

	@OriginalMember(owner = "client!ahu", name = "ad", descriptor = "()Z", line = 138)
	@Override
	boolean method10810() {
		return anInt1240 == 0 || aFloat143 == 1.0F || aFloatArray52[0] + aFloatArray52[1] + aFloatArray52[2] == 0.0F || aClass85_Sub1Array1[0] == null && aClass85_Sub1Array1[1] == null && aClass85_Sub1Array1[2] == null;
	}
}
