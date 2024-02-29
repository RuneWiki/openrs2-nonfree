package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arq")
public final class Class77_Sub42_Sub2 extends Class77_Sub42 {

	@OriginalMember(owner = "client!arq", name = "bz", descriptor = "Ljava/lang/String;")
	static String aString113;

	@OriginalMember(owner = "client!arq", name = "r", descriptor = "[Lclient!arq;")
	static Class77_Sub42_Sub2[] aClass77_Sub42_Sub2Array1 = new Class77_Sub42_Sub2[0];

	@OriginalMember(owner = "client!arq", name = "j", descriptor = "I")
	int anInt3100;

	@OriginalMember(owner = "client!arq", name = "i", descriptor = "I")
	int anInt3101;

	@OriginalMember(owner = "client!arq", name = "k", descriptor = "I")
	int anInt3102;

	@OriginalMember(owner = "client!arq", name = "u", descriptor = "J")
	long aLong192;

	@OriginalMember(owner = "client!arq", name = "e", descriptor = "I")
	int anInt3103;

	@OriginalMember(owner = "client!arq", name = "p", descriptor = "(Lclient!aks;B)V", line = 29)
	static void method22733(@OriginalArg(0) Class77_Sub36 arg0) {
		Class434.aClass107_Sub1_1 = new Class107_Sub1(client.aClass482_1);
		Class434.aClass107_Sub1_1.method8784(Class334.aClass334_4);
		try {
			@Pc(15) Class115_Sub2 local15 = (Class115_Sub2) Class434.aClass107_Sub1_1.method8788(Class331.aClass331_5, false);
			@Pc(22) Class149_Sub3 local22 = (Class149_Sub3) Class434.aClass107_Sub1_1.method8787(Class321.aClass321_3, false);
			local15.method10238(arg0);
			local22.method16715(new Class452(0.0F, 0.0F, 0.0F));
			Class434.aClass107_Sub1_1.method8827(Class447.method29120(99999.0F, 99999.0F, 99999.0F));
			Class434.aClass107_Sub1_1.method8814(Class447.method29120(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
			Class434.aClass107_Sub1_1.method8824(Class447.method29120(99999.0F, 99999.0F, 99999.0F));
			Class434.aClass107_Sub1_1.method8810(Class447.method29120(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
		} catch (@Pc(65) Exception_Sub2 local65) {
		}
		Class434.anInt4909 = Class60.aClass138_1.method14234() * 742277525;
		RuntimeException_Sub4.anInt3175 = Class60.aClass138_1.method14225() * -1144821879;
		Class434.aBoolean749 = true;
	}

	@OriginalMember(owner = "client!arq", name = "ak", descriptor = "(I)V", line = 182)
	static void method22734(@OriginalArg(0) int arg0) {
		Class93.anInt731 = arg0 * 1517932627;
		aClass77_Sub42_Sub2Array1 = new Class77_Sub42_Sub2[arg0];
		Class77_Sub1_Sub3.anInt285 = 0;
	}

	@OriginalMember(owner = "client!arq", name = "au", descriptor = "(I)V", line = 182)
	static void method22735(@OriginalArg(0) int arg0) {
		Class93.anInt731 = arg0 * 1517932627;
		aClass77_Sub42_Sub2Array1 = new Class77_Sub42_Sub2[arg0];
		Class77_Sub1_Sub3.anInt285 = 0;
	}

	@OriginalMember(owner = "client!arq", name = "ax", descriptor = "(IIIJI)Lclient!arq;", line = 188)
	static Class77_Sub42_Sub2 method22736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class77_Sub42_Sub2[] local2 = aClass77_Sub42_Sub2Array1;
		synchronized (aClass77_Sub42_Sub2Array1) {
			@Pc(11) Class77_Sub42_Sub2 local11;
			if (Class77_Sub1_Sub3.anInt285 * -1194496119 == 0) {
				local11 = new Class77_Sub42_Sub2();
			} else {
				local11 = aClass77_Sub42_Sub2Array1[(Class77_Sub1_Sub3.anInt285 -= -1383614791) * -1194496119];
			}
			local11.anInt3100 = arg0 * -1091003251;
			local11.anInt3101 = arg1 * -397312265;
			local11.anInt3102 = arg2 * -374658177;
			local11.aLong192 = arg3 * 2565003256494833653L;
			local11.anInt3103 = arg4 * 674620361;
			return local11;
		}
	}

	@OriginalMember(owner = "client!arq", name = "<init>", descriptor = "()V", line = 201)
	Class77_Sub42_Sub2() {
	}

	@OriginalMember(owner = "client!arq", name = "p", descriptor = "(B)I", line = 204)
	@Override
	public int method22715() {
		return this.anInt3100 * -2076408251;
	}

	@OriginalMember(owner = "client!arq", name = "q", descriptor = "()I", line = 204)
	@Override
	public int method22721() {
		return this.anInt3100 * -2076408251;
	}

	@OriginalMember(owner = "client!arq", name = "x", descriptor = "()I", line = 204)
	@Override
	public int method22722() {
		return this.anInt3100 * -2076408251;
	}

	@OriginalMember(owner = "client!arq", name = "c", descriptor = "(B)I", line = 208)
	@Override
	public int method22716() {
		return this.anInt3101 * -224222521;
	}

	@OriginalMember(owner = "client!arq", name = "ag", descriptor = "()I", line = 208)
	@Override
	public int method22725() {
		return this.anInt3101 * -224222521;
	}

	@OriginalMember(owner = "client!arq", name = "v", descriptor = "(I)I", line = 212)
	@Override
	public int method22717() {
		return this.anInt3102 * 420516991;
	}

	@OriginalMember(owner = "client!arq", name = "r", descriptor = "()I", line = 212)
	@Override
	public int method22726() {
		return this.anInt3102 * 420516991;
	}

	@OriginalMember(owner = "client!arq", name = "s", descriptor = "()I", line = 212)
	@Override
	public int method22724() {
		return this.anInt3102 * 420516991;
	}

	@OriginalMember(owner = "client!arq", name = "d", descriptor = "()I", line = 212)
	@Override
	public int method22723() {
		return this.anInt3102 * 420516991;
	}

	@OriginalMember(owner = "client!arq", name = "y", descriptor = "(I)J", line = 216)
	@Override
	public long method22719() {
		return this.aLong192 * -2484580550736137123L;
	}

	@OriginalMember(owner = "client!arq", name = "g", descriptor = "()J", line = 216)
	@Override
	public long method22730() {
		return this.aLong192 * -2484580550736137123L;
	}

	@OriginalMember(owner = "client!arq", name = "l", descriptor = "(I)I", line = 220)
	@Override
	public int method22731() {
		return this.anInt3103 * -507795847;
	}

	@OriginalMember(owner = "client!arq", name = "z", descriptor = "()I", line = 220)
	@Override
	public int method22732() {
		return this.anInt3103 * -507795847;
	}

	@OriginalMember(owner = "client!arq", name = "t", descriptor = "(B)V", line = 224)
	@Override
	public void method22720() {
		@Pc(2) Class77_Sub42_Sub2[] local2 = aClass77_Sub42_Sub2Array1;
		synchronized (aClass77_Sub42_Sub2Array1) {
			if (Class77_Sub1_Sub3.anInt285 * -1194496119 < Class93.anInt731 * 1900344283 - 1) {
				aClass77_Sub42_Sub2Array1[(Class77_Sub1_Sub3.anInt285 += -1383614791) * -1194496119 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!arq", name = "j", descriptor = "()V", line = 224)
	@Override
	public void method22728() {
		@Pc(2) Class77_Sub42_Sub2[] local2 = aClass77_Sub42_Sub2Array1;
		synchronized (aClass77_Sub42_Sub2Array1) {
			if (Class77_Sub1_Sub3.anInt285 * -1194496119 < Class93.anInt731 * 1900344283 - 1) {
				aClass77_Sub42_Sub2Array1[(Class77_Sub1_Sub3.anInt285 += -1383614791) * -1194496119 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!arq", name = "b", descriptor = "()V", line = 224)
	@Override
	public void method22729() {
		@Pc(2) Class77_Sub42_Sub2[] local2 = aClass77_Sub42_Sub2Array1;
		synchronized (aClass77_Sub42_Sub2Array1) {
			if (Class77_Sub1_Sub3.anInt285 * -1194496119 < Class93.anInt731 * 1900344283 - 1) {
				aClass77_Sub42_Sub2Array1[(Class77_Sub1_Sub3.anInt285 += -1383614791) * -1194496119 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!arq", name = "n", descriptor = "()V", line = 224)
	@Override
	public void method22727() {
		@Pc(2) Class77_Sub42_Sub2[] local2 = aClass77_Sub42_Sub2Array1;
		synchronized (aClass77_Sub42_Sub2Array1) {
			if (Class77_Sub1_Sub3.anInt285 * -1194496119 < Class93.anInt731 * 1900344283 - 1) {
				aClass77_Sub42_Sub2Array1[(Class77_Sub1_Sub3.anInt285 += -1383614791) * -1194496119 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!arq", name = "a", descriptor = "()V", line = 224)
	@Override
	public void method22718() {
		@Pc(2) Class77_Sub42_Sub2[] local2 = aClass77_Sub42_Sub2Array1;
		synchronized (aClass77_Sub42_Sub2Array1) {
			if (Class77_Sub1_Sub3.anInt285 * -1194496119 < Class93.anInt731 * 1900344283 - 1) {
				aClass77_Sub42_Sub2Array1[(Class77_Sub1_Sub3.anInt285 += -1383614791) * -1194496119 - 1] = this;
			}
		}
	}
}
