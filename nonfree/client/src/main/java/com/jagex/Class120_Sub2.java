package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahp")
public class Class120_Sub2 extends Class120 {

	@OriginalMember(owner = "client!ahp", name = "d", descriptor = "F")
	public static float aFloat137 = 1.0F;

	@OriginalMember(owner = "client!ahp", name = "s", descriptor = "F")
	public static float aFloat138 = 0.0F;

	@OriginalMember(owner = "client!ahp", name = "r", descriptor = "F")
	public static float aFloat136 = 1.0F;

	@OriginalMember(owner = "client!ahp", name = "g", descriptor = "F")
	public static float aFloat139 = 0.0F;

	@OriginalMember(owner = "client!ahp", name = "z", descriptor = "F")
	public static float aFloat140 = 1.0F;

	@OriginalMember(owner = "client!ahp", name = "y", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_31;

	@OriginalMember(owner = "client!ahp", name = "l", descriptor = "Lclient!hr;")
	Class105 aClass105_10;

	@OriginalMember(owner = "client!ahp", name = "w", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_32;

	@OriginalMember(owner = "client!ahp", name = "q", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_33;

	@OriginalMember(owner = "client!ahp", name = "j", descriptor = "Z")
	boolean aBoolean216;

	@OriginalMember(owner = "client!ahp", name = "x", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_34;

	@OriginalMember(owner = "client!ahp", name = "v", descriptor = "Lclient!hi;")
	Class112 aClass112_7;

	@OriginalMember(owner = "client!ahp", name = "t", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_35;

	@OriginalMember(owner = "client!ahp", name = "<init>", descriptor = "(Lclient!aed;)V", line = 24)
	public Class120_Sub2(@OriginalArg(0) Class86_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahp", name = "p", descriptor = "()Z", line = 28)
	@Override
	boolean method10798() {
		return this.aClass86_Sub1_23.aBoolean454 && this.aClass86_Sub1_23.method20681();
	}

	@OriginalMember(owner = "client!ahp", name = "j", descriptor = "()Z", line = 28)
	@Override
	boolean method10815() {
		return this.aClass86_Sub1_23.aBoolean454 && this.aClass86_Sub1_23.method20681();
	}

	@OriginalMember(owner = "client!ahp", name = "ae", descriptor = "()Z", line = 32)
	@Override
	boolean method10814() {
		return this.aBoolean216;
	}

	@OriginalMember(owner = "client!ahp", name = "at", descriptor = "()Z", line = 32)
	@Override
	boolean method10791() {
		return this.aBoolean216;
	}

	@OriginalMember(owner = "client!ahp", name = "c", descriptor = "()Z", line = 32)
	@Override
	boolean method10805() {
		return this.aBoolean216;
	}

	@OriginalMember(owner = "client!ahp", name = "v", descriptor = "()Z", line = 36)
	@Override
	boolean method10790() {
		if (!this.method10798()) {
			return false;
		}
		this.aClass112_7 = this.aClass86_Sub1_23.method20613("FilterLevels");
		if (this.aClass112_7 == null) {
			return false;
		}
		try {
			this.aClass77_Sub12_Sub1_31 = this.aClass112_7.method9524("sceneTex");
			this.aClass77_Sub12_Sub1_32 = this.aClass112_7.method9524("paramsGamma");
			this.aClass77_Sub12_Sub1_35 = this.aClass112_7.method9524("paramsRanges");
			this.aClass77_Sub12_Sub1_33 = this.aClass112_7.method9524("pixelOffset");
			this.aClass77_Sub12_Sub1_34 = this.aClass112_7.method9524("PosAndTexCoords");
			this.aClass105_10 = this.aClass112_7.method9458("techAdjust");
		} catch (@Pc(57) Exception_Sub3_Sub1 local57) {
			return false;
		} catch (@Pc(60) Exception_Sub3_Sub2 local60) {
			return false;
		}
		if (this.aClass105_10.method9595()) {
			this.aBoolean216 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahp", name = "k", descriptor = "()Z", line = 36)
	@Override
	boolean method10809() {
		if (!this.method10798()) {
			return false;
		}
		this.aClass112_7 = this.aClass86_Sub1_23.method20613("FilterLevels");
		if (this.aClass112_7 == null) {
			return false;
		}
		try {
			this.aClass77_Sub12_Sub1_31 = this.aClass112_7.method9524("sceneTex");
			this.aClass77_Sub12_Sub1_32 = this.aClass112_7.method9524("paramsGamma");
			this.aClass77_Sub12_Sub1_35 = this.aClass112_7.method9524("paramsRanges");
			this.aClass77_Sub12_Sub1_33 = this.aClass112_7.method9524("pixelOffset");
			this.aClass77_Sub12_Sub1_34 = this.aClass112_7.method9524("PosAndTexCoords");
			this.aClass105_10 = this.aClass112_7.method9458("techAdjust");
		} catch (@Pc(57) Exception_Sub3_Sub1 local57) {
			return false;
		} catch (@Pc(60) Exception_Sub3_Sub2 local60) {
			return false;
		}
		if (this.aClass105_10.method9595()) {
			this.aBoolean216 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahp", name = "u", descriptor = "()Z", line = 36)
	@Override
	boolean method10800() {
		if (!this.method10798()) {
			return false;
		}
		this.aClass112_7 = this.aClass86_Sub1_23.method20613("FilterLevels");
		if (this.aClass112_7 == null) {
			return false;
		}
		try {
			this.aClass77_Sub12_Sub1_31 = this.aClass112_7.method9524("sceneTex");
			this.aClass77_Sub12_Sub1_32 = this.aClass112_7.method9524("paramsGamma");
			this.aClass77_Sub12_Sub1_35 = this.aClass112_7.method9524("paramsRanges");
			this.aClass77_Sub12_Sub1_33 = this.aClass112_7.method9524("pixelOffset");
			this.aClass77_Sub12_Sub1_34 = this.aClass112_7.method9524("PosAndTexCoords");
			this.aClass105_10 = this.aClass112_7.method9458("techAdjust");
		} catch (@Pc(57) Exception_Sub3_Sub1 local57) {
			return false;
		} catch (@Pc(60) Exception_Sub3_Sub2 local60) {
			return false;
		}
		if (this.aClass105_10.method9595()) {
			this.aBoolean216 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahp", name = "e", descriptor = "()Z", line = 36)
	@Override
	boolean method10801() {
		if (!this.method10798()) {
			return false;
		}
		this.aClass112_7 = this.aClass86_Sub1_23.method20613("FilterLevels");
		if (this.aClass112_7 == null) {
			return false;
		}
		try {
			this.aClass77_Sub12_Sub1_31 = this.aClass112_7.method9524("sceneTex");
			this.aClass77_Sub12_Sub1_32 = this.aClass112_7.method9524("paramsGamma");
			this.aClass77_Sub12_Sub1_35 = this.aClass112_7.method9524("paramsRanges");
			this.aClass77_Sub12_Sub1_33 = this.aClass112_7.method9524("pixelOffset");
			this.aClass77_Sub12_Sub1_34 = this.aClass112_7.method9524("PosAndTexCoords");
			this.aClass105_10 = this.aClass112_7.method9458("techAdjust");
		} catch (@Pc(57) Exception_Sub3_Sub1 local57) {
			return false;
		} catch (@Pc(60) Exception_Sub3_Sub2 local60) {
			return false;
		}
		if (this.aClass105_10.method9595()) {
			this.aBoolean216 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahp", name = "i", descriptor = "()Z", line = 36)
	@Override
	boolean method10813() {
		if (!this.method10798()) {
			return false;
		}
		this.aClass112_7 = this.aClass86_Sub1_23.method20613("FilterLevels");
		if (this.aClass112_7 == null) {
			return false;
		}
		try {
			this.aClass77_Sub12_Sub1_31 = this.aClass112_7.method9524("sceneTex");
			this.aClass77_Sub12_Sub1_32 = this.aClass112_7.method9524("paramsGamma");
			this.aClass77_Sub12_Sub1_35 = this.aClass112_7.method9524("paramsRanges");
			this.aClass77_Sub12_Sub1_33 = this.aClass112_7.method9524("pixelOffset");
			this.aClass77_Sub12_Sub1_34 = this.aClass112_7.method9524("PosAndTexCoords");
			this.aClass105_10 = this.aClass112_7.method9458("techAdjust");
		} catch (@Pc(57) Exception_Sub3_Sub1 local57) {
			return false;
		} catch (@Pc(60) Exception_Sub3_Sub2 local60) {
			return false;
		}
		if (this.aClass105_10.method9595()) {
			this.aBoolean216 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ahp", name = "w", descriptor = "(II)V", line = 64)
	@Override
	void method10792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ahp", name = "ah", descriptor = "(II)V", line = 64)
	@Override
	void method10795() {
	}

	@OriginalMember(owner = "client!ahp", name = "as", descriptor = "(II)V", line = 64)
	@Override
	void method10816() {
	}

	@OriginalMember(owner = "client!ahp", name = "am", descriptor = "(II)V", line = 64)
	@Override
	void method10817() {
	}

	@OriginalMember(owner = "client!ahp", name = "aq", descriptor = "(II)V", line = 64)
	@Override
	void method10799() {
	}

	@OriginalMember(owner = "client!ahp", name = "y", descriptor = "()V", line = 65)
	@Override
	void method10821() {
	}

	@OriginalMember(owner = "client!ahp", name = "ay", descriptor = "()V", line = 65)
	@Override
	void method10818() {
	}

	@OriginalMember(owner = "client!ahp", name = "af", descriptor = "()V", line = 65)
	@Override
	void method10819() {
	}

	@OriginalMember(owner = "client!ahp", name = "an", descriptor = "()V", line = 65)
	@Override
	void method10820() {
	}

	@OriginalMember(owner = "client!ahp", name = "h", descriptor = "()I", line = 68)
	@Override
	int method10775() {
		return 1;
	}

	@OriginalMember(owner = "client!ahp", name = "x", descriptor = "()I", line = 68)
	@Override
	int method10777() {
		return 1;
	}

	@OriginalMember(owner = "client!ahp", name = "m", descriptor = "()I", line = 68)
	@Override
	int method10778() {
		return 1;
	}

	@OriginalMember(owner = "client!ahp", name = "aj", descriptor = "()I", line = 68)
	@Override
	int method10779() {
		return 1;
	}

	@OriginalMember(owner = "client!ahp", name = "a", descriptor = "()I", line = 68)
	@Override
	int method10776() {
		return 1;
	}

	@OriginalMember(owner = "client!ahp", name = "b", descriptor = "(ILclient!aeo;Lclient!ks;Lclient!de;Lclient!ks;Z)V", line = 72)
	@Override
	void method10803(@OriginalArg(0) int arg0, @OriginalArg(1) Class92_Sub1 arg1, @OriginalArg(2) Interface37 arg2, @OriginalArg(3) Interface20 arg3, @OriginalArg(4) Interface37 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass86_Sub1_23.method20664();
		@Pc(7) float local7 = (float) arg1.method23491();
		@Pc(11) float local11 = (float) arg1.method23493();
		@Pc(17) float local17 = local3 * 2.0F / local7;
		@Pc(24) float local24 = -local3 * 2.0F / local11;
		@Pc(87) float[] local87 = new float[] { -1.0F + local17, local24 + 1.0F, 0.0F, 0.0F, -1.0F + local17, -3.0F + local24, 0.0F, 2.0F, local17 + 3.0F, local24 + 1.0F, 2.0F, 0.0F };
		@Pc(90) int local90 = (int) local7;
		@Pc(93) int local93 = (int) local11;
		@Pc(103) int local103 = arg5 ? this.aClass86_Sub1_23.method19943().method23491() : local90;
		@Pc(113) int local113 = arg5 ? this.aClass86_Sub1_23.method19943().method23493() : local93;
		this.aClass112_7.method9547(this.aClass105_10);
		this.aClass112_7.method9545();
		@Pc(127) float local127 = (float) local90 / local7;
		@Pc(132) float local132 = (float) local93 / local11;
		@Pc(137) float local137 = (float) local103 / local7;
		@Pc(142) float local142 = (float) local113 / local11;
		local87[8] = (local87[8] + 1.0F) * local127 - 1.0F;
		local87[5] = (local87[5] - 1.0F) * local132 + 1.0F;
		local87[10] *= local137;
		local87[7] *= local142;
		this.aClass112_7.method9490(this.aClass77_Sub12_Sub1_34, local87);
		this.aClass112_7.method9503(this.aClass77_Sub12_Sub1_31, 0, arg2);
		this.aClass112_7.method9474(this.aClass77_Sub12_Sub1_32, aFloat137);
		this.aClass112_7.method9483(this.aClass77_Sub12_Sub1_35, aFloat138, aFloat136, aFloat139, aFloat140);
		this.aClass112_7.method9483(this.aClass77_Sub12_Sub1_33, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass86_Sub1_23.method20104(0, 0, local90, local93);
	}

	@OriginalMember(owner = "client!ahp", name = "n", descriptor = "(ILclient!aeo;Lclient!ks;Lclient!de;Lclient!ks;Z)V", line = 72)
	@Override
	void method10804(@OriginalArg(0) int arg0, @OriginalArg(1) Class92_Sub1 arg1, @OriginalArg(2) Interface37 arg2, @OriginalArg(3) Interface20 arg3, @OriginalArg(4) Interface37 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass86_Sub1_23.method20664();
		@Pc(7) float local7 = (float) arg1.method23491();
		@Pc(11) float local11 = (float) arg1.method23493();
		@Pc(17) float local17 = local3 * 2.0F / local7;
		@Pc(24) float local24 = -local3 * 2.0F / local11;
		@Pc(87) float[] local87 = new float[] { -1.0F + local17, local24 + 1.0F, 0.0F, 0.0F, -1.0F + local17, -3.0F + local24, 0.0F, 2.0F, local17 + 3.0F, local24 + 1.0F, 2.0F, 0.0F };
		@Pc(90) int local90 = (int) local7;
		@Pc(93) int local93 = (int) local11;
		@Pc(103) int local103 = arg5 ? this.aClass86_Sub1_23.method19943().method23491() : local90;
		@Pc(113) int local113 = arg5 ? this.aClass86_Sub1_23.method19943().method23493() : local93;
		this.aClass112_7.method9547(this.aClass105_10);
		this.aClass112_7.method9545();
		@Pc(127) float local127 = (float) local90 / local7;
		@Pc(132) float local132 = (float) local93 / local11;
		@Pc(137) float local137 = (float) local103 / local7;
		@Pc(142) float local142 = (float) local113 / local11;
		local87[8] = (local87[8] + 1.0F) * local127 - 1.0F;
		local87[5] = (local87[5] - 1.0F) * local132 + 1.0F;
		local87[10] *= local137;
		local87[7] *= local142;
		this.aClass112_7.method9490(this.aClass77_Sub12_Sub1_34, local87);
		this.aClass112_7.method9503(this.aClass77_Sub12_Sub1_31, 0, arg2);
		this.aClass112_7.method9474(this.aClass77_Sub12_Sub1_32, aFloat137);
		this.aClass112_7.method9483(this.aClass77_Sub12_Sub1_35, aFloat138, aFloat136, aFloat139, aFloat140);
		this.aClass112_7.method9483(this.aClass77_Sub12_Sub1_33, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass86_Sub1_23.method20104(0, 0, local90, local93);
	}

	@OriginalMember(owner = "client!ahp", name = "t", descriptor = "(ILclient!aeo;Lclient!ks;Lclient!de;Lclient!ks;Z)V", line = 72)
	@Override
	void method10793(@OriginalArg(0) int arg0, @OriginalArg(1) Class92_Sub1 arg1, @OriginalArg(2) Interface37 arg2, @OriginalArg(3) Interface20 arg3, @OriginalArg(4) Interface37 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass86_Sub1_23.method20664();
		@Pc(7) float local7 = (float) arg1.method23491();
		@Pc(11) float local11 = (float) arg1.method23493();
		@Pc(17) float local17 = local3 * 2.0F / local7;
		@Pc(24) float local24 = -local3 * 2.0F / local11;
		@Pc(87) float[] local87 = new float[] { -1.0F + local17, local24 + 1.0F, 0.0F, 0.0F, -1.0F + local17, -3.0F + local24, 0.0F, 2.0F, local17 + 3.0F, local24 + 1.0F, 2.0F, 0.0F };
		@Pc(90) int local90 = (int) local7;
		@Pc(93) int local93 = (int) local11;
		@Pc(103) int local103 = arg5 ? this.aClass86_Sub1_23.method19943().method23491() : local90;
		@Pc(113) int local113 = arg5 ? this.aClass86_Sub1_23.method19943().method23493() : local93;
		this.aClass112_7.method9547(this.aClass105_10);
		this.aClass112_7.method9545();
		@Pc(127) float local127 = (float) local90 / local7;
		@Pc(132) float local132 = (float) local93 / local11;
		@Pc(137) float local137 = (float) local103 / local7;
		@Pc(142) float local142 = (float) local113 / local11;
		local87[8] = (local87[8] + 1.0F) * local127 - 1.0F;
		local87[5] = (local87[5] - 1.0F) * local132 + 1.0F;
		local87[10] *= local137;
		local87[7] *= local142;
		this.aClass112_7.method9490(this.aClass77_Sub12_Sub1_34, local87);
		this.aClass112_7.method9503(this.aClass77_Sub12_Sub1_31, 0, arg2);
		this.aClass112_7.method9474(this.aClass77_Sub12_Sub1_32, aFloat137);
		this.aClass112_7.method9483(this.aClass77_Sub12_Sub1_35, aFloat138, aFloat136, aFloat139, aFloat140);
		this.aClass112_7.method9483(this.aClass77_Sub12_Sub1_33, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass86_Sub1_23.method20104(0, 0, local90, local93);
	}

	@OriginalMember(owner = "client!ahp", name = "o", descriptor = "(ILclient!aeo;Lclient!ks;Lclient!de;Lclient!ks;Z)V", line = 72)
	@Override
	void method10802(@OriginalArg(0) int arg0, @OriginalArg(1) Class92_Sub1 arg1, @OriginalArg(2) Interface37 arg2, @OriginalArg(3) Interface20 arg3, @OriginalArg(4) Interface37 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) float local3 = this.aClass86_Sub1_23.method20664();
		@Pc(7) float local7 = (float) arg1.method23491();
		@Pc(11) float local11 = (float) arg1.method23493();
		@Pc(17) float local17 = local3 * 2.0F / local7;
		@Pc(24) float local24 = -local3 * 2.0F / local11;
		@Pc(87) float[] local87 = new float[] { -1.0F + local17, local24 + 1.0F, 0.0F, 0.0F, -1.0F + local17, -3.0F + local24, 0.0F, 2.0F, local17 + 3.0F, local24 + 1.0F, 2.0F, 0.0F };
		@Pc(90) int local90 = (int) local7;
		@Pc(93) int local93 = (int) local11;
		@Pc(103) int local103 = arg5 ? this.aClass86_Sub1_23.method19943().method23491() : local90;
		@Pc(113) int local113 = arg5 ? this.aClass86_Sub1_23.method19943().method23493() : local93;
		this.aClass112_7.method9547(this.aClass105_10);
		this.aClass112_7.method9545();
		@Pc(127) float local127 = (float) local90 / local7;
		@Pc(132) float local132 = (float) local93 / local11;
		@Pc(137) float local137 = (float) local103 / local7;
		@Pc(142) float local142 = (float) local113 / local11;
		local87[8] = (local87[8] + 1.0F) * local127 - 1.0F;
		local87[5] = (local87[5] - 1.0F) * local132 + 1.0F;
		local87[10] *= local137;
		local87[7] *= local142;
		this.aClass112_7.method9490(this.aClass77_Sub12_Sub1_34, local87);
		this.aClass112_7.method9503(this.aClass77_Sub12_Sub1_31, 0, arg2);
		this.aClass112_7.method9474(this.aClass77_Sub12_Sub1_32, aFloat137);
		this.aClass112_7.method9483(this.aClass77_Sub12_Sub1_35, aFloat138, aFloat136, aFloat139, aFloat140);
		this.aClass112_7.method9483(this.aClass77_Sub12_Sub1_33, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass86_Sub1_23.method20104(0, 0, local90, local93);
	}

	@OriginalMember(owner = "client!ahp", name = "ap", descriptor = "(I)V", line = 101)
	@Override
	void method10822() {
		this.aClass112_7.method9543();
	}

	@OriginalMember(owner = "client!ahp", name = "q", descriptor = "(I)V", line = 101)
	@Override
	void method10794(@OriginalArg(0) int arg0) {
		this.aClass112_7.method9543();
	}

	@OriginalMember(owner = "client!ahp", name = "ab", descriptor = "(I)V", line = 101)
	@Override
	void method10808() {
		this.aClass112_7.method9543();
	}

	@OriginalMember(owner = "client!ahp", name = "aa", descriptor = "(I)V", line = 101)
	@Override
	void method10807() {
		this.aClass112_7.method9543();
	}

	@OriginalMember(owner = "client!ahp", name = "aw", descriptor = "(I)V", line = 101)
	@Override
	void method10823() {
		this.aClass112_7.method9543();
	}

	@OriginalMember(owner = "client!ahp", name = "s", descriptor = "()I", line = 105)
	@Override
	int method10781() {
		return 0;
	}

	@OriginalMember(owner = "client!ahp", name = "ag", descriptor = "()I", line = 105)
	@Override
	int method10780() {
		return 0;
	}

	@OriginalMember(owner = "client!ahp", name = "d", descriptor = "()I", line = 109)
	@Override
	int method10796() {
		return 1;
	}

	@OriginalMember(owner = "client!ahp", name = "ai", descriptor = "()I", line = 109)
	@Override
	int method10806() {
		return 1;
	}

	@OriginalMember(owner = "client!ahp", name = "ac", descriptor = "()Z", line = 113)
	@Override
	boolean method10811() {
		return aFloat137 == 1.0F && aFloat138 == 0.0F && aFloat136 == 1.0F && aFloat139 == 0.0F && aFloat140 == 1.0F;
	}

	@OriginalMember(owner = "client!ahp", name = "z", descriptor = "()Z", line = 113)
	@Override
	boolean method10797() {
		return aFloat137 == 1.0F && aFloat138 == 0.0F && aFloat136 == 1.0F && aFloat139 == 0.0F && aFloat140 == 1.0F;
	}

	@OriginalMember(owner = "client!ahp", name = "ar", descriptor = "()Z", line = 113)
	@Override
	boolean method10789() {
		return aFloat137 == 1.0F && aFloat138 == 0.0F && aFloat136 == 1.0F && aFloat139 == 0.0F && aFloat140 == 1.0F;
	}

	@OriginalMember(owner = "client!ahp", name = "ad", descriptor = "()Z", line = 113)
	@Override
	boolean method10810() {
		return aFloat137 == 1.0F && aFloat138 == 0.0F && aFloat136 == 1.0F && aFloat139 == 0.0F && aFloat140 == 1.0F;
	}

	@OriginalMember(owner = "client!ahp", name = "av", descriptor = "()Z", line = 113)
	@Override
	boolean method10812() {
		return aFloat137 == 1.0F && aFloat138 == 0.0F && aFloat136 == 1.0F && aFloat139 == 0.0F && aFloat140 == 1.0F;
	}
}
