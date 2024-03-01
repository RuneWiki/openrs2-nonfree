package com.jagex;

import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abl")
public class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!abl", name = "sh", descriptor = "I")
	public static int anInt288;

	@OriginalMember(owner = "client!abl", name = "vq", descriptor = "I")
	public static int anInt289;

	@OriginalMember(owner = "client!abl", name = "bd", descriptor = "F")
	float aFloat17;

	@OriginalMember(owner = "client!abl", name = "ak", descriptor = "[I")
	int[] anIntArray39;

	@OriginalMember(owner = "client!abl", name = "ah", descriptor = "I")
	int anInt271;

	@OriginalMember(owner = "client!abl", name = "an", descriptor = "[F")
	float[] aFloatArray21;

	@OriginalMember(owner = "client!abl", name = "av", descriptor = "I")
	int anInt275;

	@OriginalMember(owner = "client!abl", name = "bf", descriptor = "I")
	int anInt276;

	@OriginalMember(owner = "client!abl", name = "ar", descriptor = "I")
	int anInt279;

	@OriginalMember(owner = "client!abl", name = "ad", descriptor = "I")
	int anInt280;

	@OriginalMember(owner = "client!abl", name = "ae", descriptor = "I")
	int anInt281;

	@OriginalMember(owner = "client!abl", name = "bw", descriptor = "F")
	float aFloat19;

	@OriginalMember(owner = "client!abl", name = "aw", descriptor = "I")
	int anInt282;

	@OriginalMember(owner = "client!abl", name = "ax", descriptor = "I")
	int anInt283;

	@OriginalMember(owner = "client!abl", name = "az", descriptor = "I")
	int anInt284;

	@OriginalMember(owner = "client!abl", name = "bp", descriptor = "F")
	float aFloat20;

	@OriginalMember(owner = "client!abl", name = "bt", descriptor = "[Lclient!ab;")
	Class12[] aClass12Array1;

	@OriginalMember(owner = "client!abl", name = "aa", descriptor = "I")
	int anInt287;

	@OriginalMember(owner = "client!abl", name = "br", descriptor = "Lclient!co;")
	Class6 aClass6_2;

	@OriginalMember(owner = "client!abl", name = "ac", descriptor = "F")
	float aFloat22;

	@OriginalMember(owner = "client!abl", name = "k", descriptor = "Z")
	boolean aBoolean53;

	@OriginalMember(owner = "client!abl", name = "af", descriptor = "Z")
	boolean aBoolean52;

	@OriginalMember(owner = "client!abl", name = "aj", descriptor = "I")
	int anInt272;

	@OriginalMember(owner = "client!abl", name = "as", descriptor = "I")
	int anInt278;

	@OriginalMember(owner = "client!abl", name = "ai", descriptor = "I")
	int anInt273;

	@OriginalMember(owner = "client!abl", name = "aq", descriptor = "I")
	int anInt274;

	@OriginalMember(owner = "client!abl", name = "al", descriptor = "I")
	int anInt277;

	@OriginalMember(owner = "client!abl", name = "ao", descriptor = "I")
	int anInt270;

	@OriginalMember(owner = "client!abl", name = "ap", descriptor = "I")
	int anInt286;

	@OriginalMember(owner = "client!abl", name = "am", descriptor = "[[F")
	float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!abl", name = "bs", descriptor = "F")
	float aFloat21;

	@OriginalMember(owner = "client!abl", name = "bm", descriptor = "F")
	float aFloat18;

	@OriginalMember(owner = "client!abl", name = "bg", descriptor = "Lclient!ew;")
	Class161 aClass161_1;

	@OriginalMember(owner = "client!abl", name = "bb", descriptor = "I")
	int anInt285;

	@OriginalMember(owner = "client!abl", name = "bk", descriptor = "Lclient!ew;")
	Class161 aClass161_2;

	@OriginalMember(owner = "client!abl", name = "ab", descriptor = "Lclient!mu;")
	Class332 aClass332_3;

	@OriginalMember(owner = "client!abl", name = "au", descriptor = "Lclient!mq;")
	Class328 aClass328_6;

	@OriginalMember(owner = "client!abl", name = "ay", descriptor = "Lclient!mq;")
	Class328 aClass328_4;

	@OriginalMember(owner = "client!abl", name = "ag", descriptor = "Lclient!mq;")
	Class328 aClass328_5;

	@OriginalMember(owner = "client!abl", name = "at", descriptor = "I")
	int anInt269;

	@OriginalMember(owner = "client!abl", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!ds;Lclient!di;II)V", line = 54)
	Class21_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg1, arg2);
		try {
			this.method17039(arg0, arg3, arg4);
			this.method17042(arg0);
		} catch (@Pc(15) Throwable local15) {
			local15.printStackTrace();
			this.method17020();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!abl", name = "<init>", descriptor = "(Lclient!ds;Lclient!di;)V", line = 67)
	Class21_Sub1(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Interface11 arg1) {
		super(arg0, arg1);
		this.aBoolean53 = false;
		this.aBoolean52 = false;
		this.anInt272 = 0;
		this.anInt278 = 0;
		this.anInt273 = 0;
		this.anInt274 = 0;
		this.anInt277 = 1140824535;
		this.anInt270 = 1508854366;
		this.anInt286 = 403971418;
		this.aFloatArrayArray4 = new float[6][4];
		this.aFloat21 = 1.0F;
		this.aFloat18 = 0.0F;
		this.aClass161_1 = new Class161(16);
		this.anInt285 = -1936305279;
		try {
			this.aClass161_2 = new Class161(6291456, 256);
			this.aClass332_3 = new Class332();
			this.aClass328_6 = new Class328();
			this.aClass328_4 = new Class328();
			this.aClass328_5 = new Class328();
			this.method3191(1);
			this.method3164(0);
			Class5.method743(true, true);
			this.aBoolean52 = true;
			this.anInt269 = (int) Class176.method23413() * -769464341;
		} catch (@Pc(99) Throwable local99) {
			local99.printStackTrace();
			this.method17020();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!abl", name = "ex", descriptor = "()Lclient!cr;", line = 88)
	@Override
	public Class117 method17143() {
		return new Class117(0, "Pure Java", 1, "CPU", 0L, false);
	}

	@OriginalMember(owner = "client!abl", name = "h", descriptor = "()Lclient!cr;", line = 88)
	@Override
	public Class117 method17016() {
		return new Class117(0, "Pure Java", 1, "CPU", 0L, false);
	}

	@OriginalMember(owner = "client!abl", name = "eb", descriptor = "(II)V", line = 92)
	@Override
	void method17265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		this.aClass19_Sub2_6.method21413(arg0, arg1);
		if (this.anInterface11_6 != null) {
			this.anInterface11_6.method21972();
		}
	}

	@OriginalMember(owner = "client!abl", name = "s", descriptor = "(II)V", line = 92)
	@Override
	void method17018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub2 {
		this.aClass19_Sub2_6.method21413(arg0, arg1);
		if (this.anInterface11_6 != null) {
			this.anInterface11_6.method21972();
		}
	}

	@OriginalMember(owner = "client!abl", name = "u", descriptor = "()V", line = 96)
	@Override
	public void method17019() {
	}

	@OriginalMember(owner = "client!abl", name = "ef", descriptor = "()V", line = 96)
	@Override
	public void method17372() {
	}

	@OriginalMember(owner = "client!abl", name = "ey", descriptor = "()V", line = 96)
	@Override
	public void method17026() {
	}

	@OriginalMember(owner = "client!abl", name = "ej", descriptor = "()V", line = 96)
	@Override
	public void method17148() {
	}

	@OriginalMember(owner = "client!abl", name = "er", descriptor = "()V", line = 96)
	@Override
	public void method17147() {
	}

	@OriginalMember(owner = "client!abl", name = "b", descriptor = "()V", line = 99)
	@Override
	void method17021() {
		if (this.aBoolean52) {
			Class79.method21589(true, false);
			this.aBoolean52 = false;
		}
		this.aBoolean53 = true;
	}

	@OriginalMember(owner = "client!abl", name = "en", descriptor = "()V", line = 99)
	@Override
	void method17149() {
		if (this.aBoolean52) {
			Class79.method21589(true, false);
			this.aBoolean52 = false;
		}
		this.aBoolean53 = true;
	}

	@OriginalMember(owner = "client!abl", name = "em", descriptor = "()V", line = 99)
	@Override
	void method17151() {
		if (this.aBoolean52) {
			Class79.method21589(true, false);
			this.aBoolean52 = false;
		}
		this.aBoolean53 = true;
	}

	@OriginalMember(owner = "client!abl", name = "ea", descriptor = "()V", line = 99)
	@Override
	void method17153() {
		if (this.aBoolean52) {
			Class79.method21589(true, false);
			this.aBoolean52 = false;
		}
		this.aBoolean53 = true;
	}

	@OriginalMember(owner = "client!abl", name = "ec", descriptor = "()V", line = 99)
	@Override
	void method17152() {
		if (this.aBoolean52) {
			Class79.method21589(true, false);
			this.aBoolean52 = false;
		}
		this.aBoolean53 = true;
	}

	@OriginalMember(owner = "client!abl", name = "ew", descriptor = "()V", line = 99)
	@Override
	void method17150() {
		if (this.aBoolean52) {
			Class79.method21589(true, false);
			this.aBoolean52 = false;
		}
		this.aBoolean53 = true;
	}

	@OriginalMember(owner = "client!abl", name = "ez", descriptor = "(I)V", line = 107)
	@Override
	public void method17154(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - this.anInt269 * -134346557;
		for (@Pc(12) Class3_Sub5 local12 = (Class3_Sub5) this.aClass161_2.method23229(); local12 != null; local12 = (Class3_Sub5) this.aClass161_2.method23248()) {
			if (local12.aBoolean254) {
				local12.anInt1170 += local6;
				@Pc(29) int local29 = local12.anInt1170 / 50;
				if (local29 > 0) {
					@Pc(38) Class133 local38 = this.aClass134_7.method22906(local12.anInt1171);
					@Pc(44) float local44 = (float) (local38.anInt3355 * -1912965795);
					local12.method10273((int) ((float) local38.aByte113 * ((float) local6 / 1000.0F) / 64.0F * local44), (int) ((float) local6 / 1000.0F * (float) local38.aByte117 / 64.0F * local44));
					local12.anInt1170 -= local29 * 50;
				}
				local12.aBoolean254 = false;
			}
		}
		this.anInt269 = arg0 * -769464341;
		this.aClass161_1.method23240(5);
		this.aClass161_2.method23240(5);
	}

	@OriginalMember(owner = "client!abl", name = "ep", descriptor = "(I)V", line = 107)
	@Override
	public void method17155(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - this.anInt269 * -134346557;
		for (@Pc(12) Class3_Sub5 local12 = (Class3_Sub5) this.aClass161_2.method23229(); local12 != null; local12 = (Class3_Sub5) this.aClass161_2.method23248()) {
			if (local12.aBoolean254) {
				local12.anInt1170 += local6;
				@Pc(29) int local29 = local12.anInt1170 / 50;
				if (local29 > 0) {
					@Pc(38) Class133 local38 = this.aClass134_7.method22906(local12.anInt1171);
					@Pc(44) float local44 = (float) (local38.anInt3355 * -1912965795);
					local12.method10273((int) ((float) local38.aByte113 * ((float) local6 / 1000.0F) / 64.0F * local44), (int) ((float) local6 / 1000.0F * (float) local38.aByte117 / 64.0F * local44));
					local12.anInt1170 -= local29 * 50;
				}
				local12.aBoolean254 = false;
			}
		}
		this.anInt269 = arg0 * -769464341;
		this.aClass161_1.method23240(5);
		this.aClass161_2.method23240(5);
	}

	@OriginalMember(owner = "client!abl", name = "c", descriptor = "(I)V", line = 107)
	@Override
	public void method17022(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - this.anInt269 * -134346557;
		for (@Pc(12) Class3_Sub5 local12 = (Class3_Sub5) this.aClass161_2.method23229(); local12 != null; local12 = (Class3_Sub5) this.aClass161_2.method23248()) {
			if (local12.aBoolean254) {
				local12.anInt1170 += local6;
				@Pc(29) int local29 = local12.anInt1170 / 50;
				if (local29 > 0) {
					@Pc(38) Class133 local38 = this.aClass134_7.method22906(local12.anInt1171);
					@Pc(44) float local44 = (float) (local38.anInt3355 * -1912965795);
					local12.method10273((int) ((float) local38.aByte113 * ((float) local6 / 1000.0F) / 64.0F * local44), (int) ((float) local6 / 1000.0F * (float) local38.aByte117 / 64.0F * local44));
					local12.anInt1170 -= local29 * 50;
				}
				local12.aBoolean254 = false;
			}
		}
		this.anInt269 = arg0 * -769464341;
		this.aClass161_1.method23240(5);
		this.aClass161_2.method23240(5);
	}

	@OriginalMember(owner = "client!abl", name = "me", descriptor = "()I", line = 127)
	@Override
	public int method17351() {
		return 0;
	}

	@OriginalMember(owner = "client!abl", name = "z", descriptor = "()I", line = 127)
	@Override
	public int method17157() {
		return 0;
	}

	@OriginalMember(owner = "client!abl", name = "mk", descriptor = "()I", line = 127)
	@Override
	public int method17350() {
		return 0;
	}

	@OriginalMember(owner = "client!abl", name = "mz", descriptor = "()I", line = 127)
	@Override
	public int method17352() {
		return 0;
	}

	@OriginalMember(owner = "client!abl", name = "po", descriptor = "()Z", line = 131)
	boolean method3151() {
		return this.aBoolean53;
	}

	@OriginalMember(owner = "client!abl", name = "pn", descriptor = "()Z", line = 131)
	boolean method3174() {
		return this.aBoolean53;
	}

	@OriginalMember(owner = "client!abl", name = "pd", descriptor = "(II)[I", line = 136)
	int[] method3194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class161 local3 = this.aClass161_2;
		@Pc(21) Class3_Sub5 local21;
		synchronized (this.aClass161_2) {
			local21 = (Class3_Sub5) this.aClass161_2.method23219((long) (arg1 & 0xFFFF | (arg0 & 0xFFFF) << 16) | Long.MIN_VALUE);
			if (local21 == null) {
				@Pc(30) Class133 local30 = this.aClass134_7.method22906(arg0);
				@Pc(35) int local35 = local30.anInt3355 * -1912965795;
				if (!this.anInterface11_6.method21977(arg1, Class459.aClass459_1, 0.7F, local35, local35)) {
					return null;
				}
				@Pc(64) int[] local64;
				if (local30.aClass458_2 == Class458.aClass458_4) {
					local64 = this.anInterface11_6.method21969(arg1, 0.7F, local35, local35);
				} else {
					local64 = this.anInterface11_6.method21974(arg1, 0.7F, local35, local35);
				}
				local21 = new Class3_Sub5(arg0, arg1, local35, local64, Class458.aClass458_3 != local30.aClass458_2);
				this.aClass161_2.method23239(local21, (long) (arg1 & 0xFFFF | (arg0 & 0xFFFF) << 16) | Long.MIN_VALUE, local35 * local35);
			}
		}
		local21.aBoolean254 = true;
		return local21.method10272();
	}

	@OriginalMember(owner = "client!abl", name = "pr", descriptor = "(II)Z", line = 158)
	boolean method3150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInterface11_6.method21977(arg0, Class459.aClass459_1, 0.7F, arg1, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "pc", descriptor = "(II)Z", line = 158)
	boolean method3152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInterface11_6.method21977(arg0, Class459.aClass459_1, 0.7F, arg1, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "l", descriptor = "(Lclient!sw;I)Z", line = 160)
	static boolean method3215(@OriginalArg(0) Class468 arg0) {
		return Class596.method33464(arg0, null);
	}

	@OriginalMember(owner = "client!abl", name = "pj", descriptor = "(I)Z", line = 162)
	boolean method3153(@OriginalArg(0) int arg0) {
		@Pc(5) Class133 local5 = this.aClass134_7.method22906(arg0);
		return this.method3152(local5.anInt3351 * -1410868471, local5.anInt3355 * -1912965795);
	}

	@OriginalMember(owner = "client!abl", name = "pu", descriptor = "(I)Z", line = 162)
	boolean method3163(@OriginalArg(0) int arg0) {
		@Pc(5) Class133 local5 = this.aClass134_7.method22906(arg0);
		return this.method3152(local5.anInt3351 * -1410868471, local5.anInt3355 * -1912965795);
	}

	@OriginalMember(owner = "client!abl", name = "qc", descriptor = "(I)Z", line = 162)
	boolean method3175(@OriginalArg(0) int arg0) {
		@Pc(5) Class133 local5 = this.aClass134_7.method22906(arg0);
		return this.method3152(local5.anInt3351 * -1410868471, local5.anInt3355 * -1912965795);
	}

	@OriginalMember(owner = "client!abl", name = "qi", descriptor = "(I)Z", line = 162)
	boolean method3176(@OriginalArg(0) int arg0) {
		@Pc(5) Class133 local5 = this.aClass134_7.method22906(arg0);
		return this.method3152(local5.anInt3351 * -1410868471, local5.anInt3355 * -1912965795);
	}

	@OriginalMember(owner = "client!abl", name = "qj", descriptor = "(I)I", line = 167)
	int method3178(@OriginalArg(0) int arg0) {
		return this.aClass134_7.method22906(arg0).anInt3355 * -1912965795;
	}

	@OriginalMember(owner = "client!abl", name = "qk", descriptor = "(I)I", line = 167)
	int method3179(@OriginalArg(0) int arg0) {
		return this.aClass134_7.method22906(arg0).anInt3355 * -1912965795;
	}

	@OriginalMember(owner = "client!abl", name = "ph", descriptor = "(I)I", line = 167)
	int method3186(@OriginalArg(0) int arg0) {
		return this.aClass134_7.method22906(arg0).anInt3355 * -1912965795;
	}

	@OriginalMember(owner = "client!abl", name = "qy", descriptor = "(I)I", line = 167)
	int method3193(@OriginalArg(0) int arg0) {
		return this.aClass134_7.method22906(arg0).anInt3355 * -1912965795;
	}

	@OriginalMember(owner = "client!abl", name = "qs", descriptor = "(I)I", line = 167)
	int method3197(@OriginalArg(0) int arg0) {
		return this.aClass134_7.method22906(arg0).anInt3355 * -1912965795;
	}

	@OriginalMember(owner = "client!abl", name = "pi", descriptor = "(I)Lclient!sl;", line = 171)
	Class458 method3154(@OriginalArg(0) int arg0) {
		return this.aClass134_7.method22906(arg0).aClass458_2;
	}

	@OriginalMember(owner = "client!abl", name = "qw", descriptor = "(I)Lclient!sl;", line = 171)
	Class458 method3168(@OriginalArg(0) int arg0) {
		return this.aClass134_7.method22906(arg0).aClass458_2;
	}

	@OriginalMember(owner = "client!abl", name = "qh", descriptor = "(I)Lclient!sl;", line = 171)
	Class458 method3180(@OriginalArg(0) int arg0) {
		return this.aClass134_7.method22906(arg0).aClass458_2;
	}

	@OriginalMember(owner = "client!abl", name = "qe", descriptor = "(I)Lclient!sl;", line = 171)
	Class458 method3185(@OriginalArg(0) int arg0) {
		return this.aClass134_7.method22906(arg0).aClass458_2;
	}

	@OriginalMember(owner = "client!abl", name = "qf", descriptor = "(I)Lclient!sl;", line = 171)
	Class458 method3210(@OriginalArg(0) int arg0) {
		return this.aClass134_7.method22906(arg0).aClass458_2;
	}

	@OriginalMember(owner = "client!abl", name = "pl", descriptor = "(I)B", line = 175)
	byte method3155(@OriginalArg(0) int arg0) {
		return this.aClass134_7.method22906(arg0).aByte115;
	}

	@OriginalMember(owner = "client!abl", name = "qz", descriptor = "(I)B", line = 175)
	byte method3181(@OriginalArg(0) int arg0) {
		return this.aClass134_7.method22906(arg0).aByte115;
	}

	@OriginalMember(owner = "client!abl", name = "qx", descriptor = "(I)B", line = 175)
	byte method3192(@OriginalArg(0) int arg0) {
		return this.aClass134_7.method22906(arg0).aByte115;
	}

	@OriginalMember(owner = "client!abl", name = "pz", descriptor = "(I)I", line = 179)
	int method3156(@OriginalArg(0) int arg0) {
		return this.aClass134_7.method22906(arg0).aShort160 & 0xFFFF;
	}

	@OriginalMember(owner = "client!abl", name = "qb", descriptor = "(I)I", line = 179)
	int method3182(@OriginalArg(0) int arg0) {
		return this.aClass134_7.method22906(arg0).aShort160 & 0xFFFF;
	}

	@OriginalMember(owner = "client!abl", name = "pk", descriptor = "(I)Z", line = 183)
	boolean method3157(@OriginalArg(0) int arg0) {
		@Pc(5) Class133 local5 = this.aClass134_7.method22906(arg0);
		return local5.aByte112 != 0 || local5.aByte116 != 0;
	}

	@OriginalMember(owner = "client!abl", name = "qm", descriptor = "(I)Z", line = 183)
	boolean method3183(@OriginalArg(0) int arg0) {
		@Pc(5) Class133 local5 = this.aClass134_7.method22906(arg0);
		return local5.aByte112 != 0 || local5.aByte116 != 0;
	}

	@OriginalMember(owner = "client!abl", name = "j", descriptor = "()Z", line = 188)
	@Override
	public boolean method17231() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "eq", descriptor = "()Z", line = 188)
	@Override
	public boolean method17353() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "ed", descriptor = "()Z", line = 188)
	@Override
	public boolean method17156() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "n", descriptor = "()Z", line = 192)
	@Override
	public boolean method17088() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "et", descriptor = "()Z", line = 192)
	@Override
	public boolean method17159() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "ev", descriptor = "()Z", line = 192)
	@Override
	public boolean method17158() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "eo", descriptor = "()Z", line = 196)
	@Override
	public boolean method17313() {
		return true;
	}

	@OriginalMember(owner = "client!abl", name = "e", descriptor = "()Z", line = 196)
	@Override
	public boolean method17218() {
		return true;
	}

	@OriginalMember(owner = "client!abl", name = "ek", descriptor = "()Z", line = 200)
	@Override
	public boolean method17161() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "d", descriptor = "()Z", line = 200)
	@Override
	public boolean method17166() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "ei", descriptor = "()Z", line = 200)
	@Override
	public boolean method17262() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "q", descriptor = "()Z", line = 204)
	@Override
	public boolean method17164() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "el", descriptor = "()Z", line = 204)
	@Override
	public boolean method17163() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "eu", descriptor = "()Z", line = 204)
	@Override
	public boolean method17376() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "es", descriptor = "()Z", line = 208)
	@Override
	public boolean method17190() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "eg", descriptor = "()Z", line = 208)
	@Override
	public boolean method17165() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "r", descriptor = "()Z", line = 208)
	@Override
	public boolean method17409() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "eh", descriptor = "()Z", line = 208)
	@Override
	public boolean method17167() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "ft", descriptor = "()Z", line = 208)
	@Override
	public boolean method17168() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "m", descriptor = "()Z", line = 212)
	@Override
	public boolean method17031() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "fn", descriptor = "()Z", line = 212)
	@Override
	public boolean method17091() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "fp", descriptor = "()Z", line = 212)
	@Override
	public boolean method17221() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "fm", descriptor = "()Z", line = 212)
	@Override
	public boolean method17339() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "fs", descriptor = "()Z", line = 212)
	@Override
	public boolean method17134() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "v", descriptor = "()Z", line = 216)
	@Override
	public boolean method17032() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "fx", descriptor = "()Z", line = 216)
	@Override
	public boolean method17081() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "fh", descriptor = "()Z", line = 216)
	@Override
	public boolean method17174() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "fu", descriptor = "()Z", line = 216)
	@Override
	public boolean method17175() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "t", descriptor = "()Z", line = 220)
	@Override
	public boolean method17033() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "fg", descriptor = "()Z", line = 220)
	@Override
	public boolean method17176() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "fb", descriptor = "()Z", line = 220)
	@Override
	public boolean method17177() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "fd", descriptor = "()Z", line = 224)
	@Override
	public boolean method17252() {
		return true;
	}

	@OriginalMember(owner = "client!abl", name = "w", descriptor = "()Z", line = 224)
	@Override
	public boolean method17256() {
		return true;
	}

	@OriginalMember(owner = "client!abl", name = "o", descriptor = "()Ljava/lang/String;", line = 228)
	@Override
	public String method17035() {
		return "";
	}

	@OriginalMember(owner = "client!abl", name = "fy", descriptor = "()Ljava/lang/String;", line = 228)
	@Override
	public String method17181() {
		return "";
	}

	@OriginalMember(owner = "client!abl", name = "fv", descriptor = "()Ljava/lang/String;", line = 228)
	@Override
	public String method17180() {
		return "";
	}

	@OriginalMember(owner = "client!abl", name = "fz", descriptor = "()Ljava/lang/String;", line = 228)
	@Override
	public String method17179() {
		return "";
	}

	@OriginalMember(owner = "client!abl", name = "fo", descriptor = "(Z)V", line = 231)
	@Override
	public void method17184() {
	}

	@OriginalMember(owner = "client!abl", name = "fe", descriptor = "(Z)V", line = 231)
	@Override
	public void method17182() {
	}

	@OriginalMember(owner = "client!abl", name = "fw", descriptor = "(Z)V", line = 231)
	@Override
	public void method17183() {
	}

	@OriginalMember(owner = "client!abl", name = "fl", descriptor = "(Z)V", line = 231)
	@Override
	public void method17241() {
	}

	@OriginalMember(owner = "client!abl", name = "ee", descriptor = "(Z)V", line = 231)
	@Override
	public void method17142(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!abl", name = "ai", descriptor = "(Ljava/awt/Canvas;II)Lclient!abq;", line = 234)
	@Override
	Class19_Sub2 method17046(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class70_Sub2.method33900(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abl", name = "ff", descriptor = "(Ljava/awt/Canvas;II)Lclient!abq;", line = 234)
	@Override
	Class19_Sub2 method17186(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class70_Sub2.method33900(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abl", name = "fk", descriptor = "(Ljava/awt/Canvas;II)Lclient!abq;", line = 234)
	@Override
	Class19_Sub2 method17187(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class70_Sub2.method33900(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!abl", name = "qa", descriptor = "(II[I[F)V", line = 238)
	void method3184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[] arg3) {
		this.anInt287 = arg0 * 1868260445;
		this.anInt271 = arg1 * -430203497;
		this.anIntArray39 = arg2;
		this.aFloatArray21 = arg3;
		for (@Pc(17) int local17 = 0; local17 < this.anInt276 * -570787021; local17++) {
			this.aClass12Array1[local17].method1242();
		}
		this.method17056();
		this.method17053();
	}

	@OriginalMember(owner = "client!abl", name = "pg", descriptor = "(II[I[F)V", line = 238)
	void method3212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[] arg3) {
		this.anInt287 = arg0 * 1868260445;
		this.anInt271 = arg1 * -430203497;
		this.anIntArray39 = arg2;
		this.aFloatArray21 = arg3;
		for (@Pc(17) int local17 = 0; local17 < this.anInt276 * -570787021; local17++) {
			this.aClass12Array1[local17].method1242();
		}
		this.method17056();
		this.method17053();
	}

	@OriginalMember(owner = "client!abl", name = "al", descriptor = "(IIII)[I", line = 248)
	@Override
	public int[] method17051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray39 == null) {
			throw new IllegalStateException("");
		}
		@Pc(12) int[] local12 = new int[arg2 * arg3];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg3; local16++) {
			@Pc(30) int local30 = arg0 + (arg1 + local16) * -355627019 * this.anInt287;
			for (@Pc(32) int local32 = 0; local32 < arg2; local32++) {
				local12[local14++] = this.anIntArray39[local30 + local32];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!abl", name = "fj", descriptor = "(IIII)[I", line = 248)
	@Override
	public int[] method17188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray39 == null) {
			throw new IllegalStateException("");
		}
		@Pc(12) int[] local12 = new int[arg2 * arg3];
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg3; local16++) {
			@Pc(30) int local30 = arg0 + (arg1 + local16) * -355627019 * this.anInt287;
			for (@Pc(32) int local32 = 0; local32 < arg2; local32++) {
				local12[local14++] = this.anIntArray39[local30 + local32];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!abl", name = "ao", descriptor = "()V", line = 260)
	@Override
	public void method17302() {
	}

	@OriginalMember(owner = "client!abl", name = "fc", descriptor = "()V", line = 260)
	@Override
	public void method17301() {
	}

	@OriginalMember(owner = "client!abl", name = "fq", descriptor = "()V", line = 260)
	@Override
	public void method17377() {
	}

	@OriginalMember(owner = "client!abl", name = "fa", descriptor = "()V", line = 260)
	@Override
	public void method17189() {
	}

	@OriginalMember(owner = "client!abl", name = "fr", descriptor = "([I)V", line = 263)
	@Override
	public void method17303(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt287 * -355627019;
		arg0[1] = this.anInt271 * 1850257959;
	}

	@OriginalMember(owner = "client!abl", name = "f", descriptor = "([I)V", line = 263)
	@Override
	public void method17036(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt287 * -355627019;
		arg0[1] = this.anInt271 * 1850257959;
	}

	@OriginalMember(owner = "client!abl", name = "fi", descriptor = "([I)V", line = 263)
	@Override
	public void method17103(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt287 * -355627019;
		arg0[1] = this.anInt271 * 1850257959;
	}

	@OriginalMember(owner = "client!abl", name = "pm", descriptor = "()V", line = 268)
	void method3159() {
		if (this.aFloatArray21 == null) {
			return;
		}
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(44) int local44;
		if (this.anInt272 * 45613833 == 0 && this.anInt278 * -886740031 == this.anInt287 * -355627019 && this.anInt273 * 1850088287 == 0 && this.anInt271 * 1850257959 == this.anInt274 * 2066290591) {
			local36 = this.aFloatArray21.length;
			local42 = local36 - (local36 & 0x7);
			local44 = 0;
			while (local44 < local42) {
				this.aFloatArray21[local44++] = 2.14748365E9F;
				this.aFloatArray21[local44++] = 2.14748365E9F;
				this.aFloatArray21[local44++] = 2.14748365E9F;
				this.aFloatArray21[local44++] = 2.14748365E9F;
				this.aFloatArray21[local44++] = 2.14748365E9F;
				this.aFloatArray21[local44++] = 2.14748365E9F;
				this.aFloatArray21[local44++] = 2.14748365E9F;
				this.aFloatArray21[local44++] = 2.14748365E9F;
			}
			while (local44 < local36) {
				this.aFloatArray21[local44++] = 2.14748365E9F;
			}
			return;
		}
		local36 = this.anInt278 * -886740031 - this.anInt272 * 45613833;
		local42 = this.anInt274 * 2066290591 - this.anInt273 * 1850088287;
		local44 = this.anInt287 * -355627019 - local36;
		@Pc(149) int local149 = this.anInt272 * 45613833 + this.anInt287 * -355627019 * 1850088287 * this.anInt273;
		@Pc(153) int local153 = local36 >> 3;
		@Pc(157) int local157 = local36 & 0x7;
		local36 = local149 - 1;
		for (@Pc(164) int local164 = -local42; local164 < 0; local164++) {
			@Pc(170) int local170;
			if (local153 > 0) {
				local170 = local153;
				do {
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local170--;
				} while (local170 > 0);
			}
			if (local157 > 0) {
				local170 = local157;
				do {
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local170--;
				} while (local170 > 0);
			}
			local36 += local44;
		}
	}

	@OriginalMember(owner = "client!abl", name = "qg", descriptor = "()V", line = 268)
	void method3205() {
		if (this.aFloatArray21 == null) {
			return;
		}
		@Pc(36) int local36;
		@Pc(42) int local42;
		@Pc(44) int local44;
		if (this.anInt272 * 45613833 == 0 && this.anInt278 * -886740031 == this.anInt287 * -355627019 && this.anInt273 * 1850088287 == 0 && this.anInt271 * 1850257959 == this.anInt274 * 2066290591) {
			local36 = this.aFloatArray21.length;
			local42 = local36 - (local36 & 0x7);
			local44 = 0;
			while (local44 < local42) {
				this.aFloatArray21[local44++] = 2.14748365E9F;
				this.aFloatArray21[local44++] = 2.14748365E9F;
				this.aFloatArray21[local44++] = 2.14748365E9F;
				this.aFloatArray21[local44++] = 2.14748365E9F;
				this.aFloatArray21[local44++] = 2.14748365E9F;
				this.aFloatArray21[local44++] = 2.14748365E9F;
				this.aFloatArray21[local44++] = 2.14748365E9F;
				this.aFloatArray21[local44++] = 2.14748365E9F;
			}
			while (local44 < local36) {
				this.aFloatArray21[local44++] = 2.14748365E9F;
			}
			return;
		}
		local36 = this.anInt278 * -886740031 - this.anInt272 * 45613833;
		local42 = this.anInt274 * 2066290591 - this.anInt273 * 1850088287;
		local44 = this.anInt287 * -355627019 - local36;
		@Pc(149) int local149 = this.anInt272 * 45613833 + this.anInt287 * -355627019 * 1850088287 * this.anInt273;
		@Pc(153) int local153 = local36 >> 3;
		@Pc(157) int local157 = local36 & 0x7;
		local36 = local149 - 1;
		for (@Pc(164) int local164 = -local42; local164 < 0; local164++) {
			@Pc(170) int local170;
			if (local153 > 0) {
				local170 = local153;
				do {
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local170--;
				} while (local170 > 0);
			}
			if (local157 > 0) {
				local170 = local157;
				do {
					local36++;
					this.aFloatArray21[local36] = 2.14748365E9F;
					local170--;
				} while (local170 > 0);
			}
			local36 += local44;
		}
	}

	@OriginalMember(owner = "client!abl", name = "cd", descriptor = "(Z)V", line = 320)
	@Override
	public void method17108(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class12 local3 = this.method3165(Thread.currentThread());
		local3.aBoolean42 = arg0;
	}

	@OriginalMember(owner = "client!abl", name = "gy", descriptor = "(Z)V", line = 320)
	@Override
	public void method17119(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class12 local3 = this.method3165(Thread.currentThread());
		local3.aBoolean42 = arg0;
	}

	@OriginalMember(owner = "client!abl", name = "gf", descriptor = "(Z)V", line = 320)
	@Override
	public void method17194(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class12 local3 = this.method3165(Thread.currentThread());
		local3.aBoolean42 = arg0;
	}

	@OriginalMember(owner = "client!abl", name = "gp", descriptor = "()V", line = 325)
	@Override
	public void method17196() {
		this.anInt279 = 0;
		this.anInt281 = 0;
		this.anInt280 = this.anInt287 * 1698143099;
		this.anInt282 = this.anInt271 * -418514117;
		this.method3160();
	}

	@OriginalMember(owner = "client!abl", name = "ap", descriptor = "()V", line = 325)
	@Override
	public void method17053() {
		this.anInt279 = 0;
		this.anInt281 = 0;
		this.anInt280 = this.anInt287 * 1698143099;
		this.anInt282 = this.anInt271 * -418514117;
		this.method3160();
	}

	@OriginalMember(owner = "client!abl", name = "ge", descriptor = "()V", line = 325)
	@Override
	public void method17197() {
		this.anInt279 = 0;
		this.anInt281 = 0;
		this.anInt280 = this.anInt287 * 1698143099;
		this.anInt282 = this.anInt271 * -418514117;
		this.method3160();
	}

	@OriginalMember(owner = "client!abl", name = "gj", descriptor = "()V", line = 325)
	@Override
	public void method17390() {
		this.anInt279 = 0;
		this.anInt281 = 0;
		this.anInt280 = this.anInt287 * 1698143099;
		this.anInt282 = this.anInt271 * -418514117;
		this.method3160();
	}

	@OriginalMember(owner = "client!abl", name = "ab", descriptor = "(IIII)V", line = 333)
	@Override
	public void method17054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt279 = arg0 * 1891849483;
		this.anInt281 = arg1 * -609692023;
		this.anInt280 = arg2 * 396920751;
		this.anInt282 = arg3 * 743136973;
		this.method3160();
	}

	@OriginalMember(owner = "client!abl", name = "gd", descriptor = "(IIII)V", line = 333)
	@Override
	public void method17199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt279 = arg0 * 1891849483;
		this.anInt281 = arg1 * -609692023;
		this.anInt280 = arg2 * 396920751;
		this.anInt282 = arg3 * 743136973;
		this.method3160();
	}

	@OriginalMember(owner = "client!abl", name = "gm", descriptor = "(FF)V", line = 341)
	@Override
	public void method17200(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat21 = arg1 - arg0;
		this.aFloat18 = arg1 + arg0 - 1.0F;
		for (@Pc(13) int local13 = 0; local13 < this.anInt276 * -570787021; local13++) {
			@Pc(24) Class12 local24 = this.aClass12Array1[local13];
			@Pc(27) Class103 local27 = local24.aClass103_1;
			local27.aFloat234 = this.aFloat21;
			local27.aFloat233 = this.aFloat18;
		}
	}

	@OriginalMember(owner = "client!abl", name = "au", descriptor = "(FF)V", line = 341)
	@Override
	public void method17055(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat21 = arg1 - arg0;
		this.aFloat18 = arg1 + arg0 - 1.0F;
		for (@Pc(13) int local13 = 0; local13 < this.anInt276 * -570787021; local13++) {
			@Pc(24) Class12 local24 = this.aClass12Array1[local13];
			@Pc(27) Class103 local27 = local24.aClass103_1;
			local27.aFloat234 = this.aFloat21;
			local27.aFloat233 = this.aFloat18;
		}
	}

	@OriginalMember(owner = "client!abl", name = "pq", descriptor = "()V", line = 352)
	void method3160() {
		@Pc(9) int local9 = this.anInt278 * -886740031 - this.anInt272 * 45613833;
		@Pc(19) int local19 = this.anInt274 * 2066290591 - this.anInt273 * 1850088287;
		@Pc(30) float local30 = this.aFloat22 = (float) (this.anInt280 * -1082446001) / 2.0F;
		@Pc(41) float local41 = this.aFloat20 = (float) (this.anInt282 * -455623163) / 2.0F;
		this.aFloat19 = (float) (this.anInt279 * -1965633885) + local30;
		this.aFloat17 = local41 + (float) (this.anInt281 * -665354311);
		@Pc(61) int local61;
		for (local61 = 0; local61 < this.anInt276 * -570787021; local61++) {
			@Pc(72) Class12 local72 = this.aClass12Array1[local61];
			@Pc(75) Class103 local75 = local72.aClass103_1;
			local75.aFloat230 = local30;
			local75.aFloat232 = local41;
			local75.aFloat229 = this.aFloat19 - (float) (this.anInt272 * 45613833);
			local75.aFloat231 = this.aFloat17 - (float) (this.anInt273 * 1850088287);
			local75.anInt2978 = local9;
			local75.anInt2974 = local19;
		}
		local61 = this.anInt287 * -355627019 * 1850088287 * this.anInt273 + this.anInt272 * 45613833;
		for (@Pc(129) int local129 = this.anInt273 * 1850088287; local129 < this.anInt274 * 2066290591; local129++) {
			for (@Pc(137) int local137 = 0; local137 < this.anInt276 * -570787021; local137++) {
				this.aClass12Array1[local137].aClass103_1.anIntArray286[local129 - this.anInt273 * 1850088287] = local61;
			}
			local61 += this.anInt287 * -355627019;
		}
	}

	@OriginalMember(owner = "client!abl", name = "ay", descriptor = "()V", line = 376)
	@Override
	public void method17056() {
		this.anInt272 = 0;
		this.anInt273 = 0;
		this.anInt278 = this.anInt287 * 2034401589;
		this.anInt274 = this.anInt271 * 2130081913;
		this.method3160();
	}

	@OriginalMember(owner = "client!abl", name = "gn", descriptor = "()V", line = 376)
	@Override
	public void method17201() {
		this.anInt272 = 0;
		this.anInt273 = 0;
		this.anInt278 = this.anInt287 * 2034401589;
		this.anInt274 = this.anInt271 * 2130081913;
		this.method3160();
	}

	@OriginalMember(owner = "client!abl", name = "gv", descriptor = "()V", line = 376)
	@Override
	public void method17202() {
		this.anInt272 = 0;
		this.anInt273 = 0;
		this.anInt278 = this.anInt287 * 2034401589;
		this.anInt274 = this.anInt271 * 2130081913;
		this.method3160();
	}

	@OriginalMember(owner = "client!abl", name = "gh", descriptor = "(IIII)V", line = 384)
	@Override
	public void method17203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt287 * -355627019) {
			arg2 = this.anInt287 * -355627019;
		}
		if (arg3 > this.anInt271 * 1850257959) {
			arg3 = this.anInt271 * 1850257959;
		}
		this.anInt272 = arg0 * 696417081;
		this.anInt278 = arg2 * -260529087;
		this.anInt273 = arg1 * 111870111;
		this.anInt274 = arg3 * -1807334305;
		this.method3160();
	}

	@OriginalMember(owner = "client!abl", name = "ag", descriptor = "(IIII)V", line = 384)
	@Override
	public void method17079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt287 * -355627019) {
			arg2 = this.anInt287 * -355627019;
		}
		if (arg3 > this.anInt271 * 1850257959) {
			arg3 = this.anInt271 * 1850257959;
		}
		this.anInt272 = arg0 * 696417081;
		this.anInt278 = arg2 * -260529087;
		this.anInt273 = arg1 * 111870111;
		this.anInt274 = arg3 * -1807334305;
		this.method3160();
	}

	@OriginalMember(owner = "client!abl", name = "am", descriptor = "(IIII)V", line = 396)
	@Override
	public void method17209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt272 * 45613833 < arg0) {
			this.anInt272 = arg0 * 696417081;
		}
		if (this.anInt273 * 1850088287 < arg1) {
			this.anInt273 = arg1 * 111870111;
		}
		if (this.anInt278 * -886740031 > arg2) {
			this.anInt278 = arg2 * -260529087;
		}
		if (this.anInt274 * 2066290591 > arg3) {
			this.anInt274 = arg3 * -1807334305;
		}
		this.method3160();
	}

	@OriginalMember(owner = "client!abl", name = "gz", descriptor = "(IIII)V", line = 396)
	@Override
	public void method17085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt272 * 45613833 < arg0) {
			this.anInt272 = arg0 * 696417081;
		}
		if (this.anInt273 * 1850088287 < arg1) {
			this.anInt273 = arg1 * 111870111;
		}
		if (this.anInt278 * -886740031 > arg2) {
			this.anInt278 = arg2 * -260529087;
		}
		if (this.anInt274 * 2066290591 > arg3) {
			this.anInt274 = arg3 * -1807334305;
		}
		this.method3160();
	}

	@OriginalMember(owner = "client!abl", name = "gq", descriptor = "([I)V", line = 404)
	@Override
	public void method17332(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt272 * 45613833;
		arg0[1] = this.anInt273 * 1850088287;
		arg0[2] = this.anInt278 * -886740031;
		arg0[3] = this.anInt274 * 2066290591;
	}

	@OriginalMember(owner = "client!abl", name = "ae", descriptor = "([I)V", line = 404)
	@Override
	public void method17060(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt272 * 45613833;
		arg0[1] = this.anInt273 * 1850088287;
		arg0[2] = this.anInt278 * -886740031;
		arg0[3] = this.anInt274 * 2066290591;
	}

	@OriginalMember(owner = "client!abl", name = "gt", descriptor = "([I)V", line = 404)
	@Override
	public void method17206(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt272 * 45613833;
		arg0[1] = this.anInt273 * 1850088287;
		arg0[2] = this.anInt278 * -886740031;
		arg0[3] = this.anInt274 * 2066290591;
	}

	@OriginalMember(owner = "client!abl", name = "ga", descriptor = "([I)V", line = 404)
	@Override
	public void method17207(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt272 * 45613833;
		arg0[1] = this.anInt273 * 1850088287;
		arg0[2] = this.anInt278 * -886740031;
		arg0[3] = this.anInt274 * 2066290591;
	}

	@OriginalMember(owner = "client!abl", name = "gr", descriptor = "([I)V", line = 404)
	@Override
	public void method17208(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt272 * 45613833;
		arg0[1] = this.anInt273 * 1850088287;
		arg0[2] = this.anInt278 * -886740031;
		arg0[3] = this.anInt274 * 2066290591;
	}

	@OriginalMember(owner = "client!abl", name = "ad", descriptor = "(II)V", line = 411)
	@Override
	public void method17061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) != 0) {
			this.method17050(0, 0, this.anInt287 * -355627019, this.anInt271 * 1850257959, arg1, 0);
		}
		if ((arg0 & 0x2) != 0) {
			this.method3159();
		}
	}

	@OriginalMember(owner = "client!abl", name = "gx", descriptor = "(II)V", line = 411)
	@Override
	public void method17270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) != 0) {
			this.method17050(0, 0, this.anInt287 * -355627019, this.anInt271 * 1850257959, arg1, 0);
		}
		if ((arg0 & 0x2) != 0) {
			this.method3159();
		}
	}

	@OriginalMember(owner = "client!abl", name = "gk", descriptor = "(IIIIII)V", line = 416)
	@Override
	public void method17210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method17072(arg0, arg1, arg2, arg4, arg5);
		this.method17072(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method17073(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method17073(arg2 + arg0 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!abl", name = "gs", descriptor = "(IIIIII)V", line = 416)
	@Override
	public void method17211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method17072(arg0, arg1, arg2, arg4, arg5);
		this.method17072(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method17073(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method17073(arg2 + arg0 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!abl", name = "bm", descriptor = "(IIIIII)V", line = 416)
	@Override
	public void method17068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method17072(arg0, arg1, arg2, arg4, arg5);
		this.method17072(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method17073(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method17073(arg2 + arg0 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!abl", name = "lj", descriptor = "(IIIIII)V", line = 423)
	@Override
	public void method17115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg0 < this.anInt272 * 45613833) {
			arg2 -= this.anInt272 * 45613833 - arg0;
			arg0 = this.anInt272 * 45613833;
		}
		if (arg1 < this.anInt273 * 1850088287) {
			arg3 -= this.anInt273 * 1850088287 - arg1;
			arg1 = this.anInt273 * 1850088287;
		}
		if (arg2 + arg0 > this.anInt278 * -886740031) {
			arg2 = this.anInt278 * -886740031 - arg0;
		}
		if (arg1 + arg3 > this.anInt274 * 2066290591) {
			arg3 = this.anInt274 * 2066290591 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt278 * -886740031 || arg1 > this.anInt274 * 2066290591) {
			return;
		}
		@Pc(98) int local98 = this.anInt287 * -355627019 - arg2;
		@Pc(107) int local107 = arg0 + this.anInt287 * -355627019 * arg1;
		@Pc(111) int local111 = arg4 >>> 24;
		@Pc(123) int local123;
		@Pc(127) int local127;
		@Pc(134) int local134;
		if (arg5 != 0 && (arg5 != 1 || local111 != 255)) {
			@Pc(253) int local253;
			if (arg5 == 1) {
				@Pc(234) int local234 = (local111 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + (local111 * ((arg4 & 0xFF00FF00) >>> 8) & 0xFF00FF00);
				local123 = 256 - local111;
				for (local127 = 0; local127 < arg3; local127++) {
					for (local134 = -arg2; local134 < 0; local134++) {
						local253 = this.anIntArray39[local107];
						@Pc(273) int local273 = ((local253 >>> 8 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local253 & 0xFF00FF) * local123 >> 8 & 0xFF00FF);
						this.anIntArray39[local107++] = local273 + local234;
					}
					local107 += local98;
				}
			} else if (arg5 == 2) {
				for (local123 = 0; local123 < arg3; local123++) {
					for (local127 = -arg2; local127 < 0; local127++) {
						local134 = this.anIntArray39[local107];
						local253 = arg4 + local134;
						@Pc(320) int local320 = (arg4 & 0xFF00FF) + (local134 & 0xFF00FF);
						local134 = (local253 - local320 & 0x10000) + (local320 & 0x1000100);
						this.anIntArray39[local107++] = local253 - local134 | local134 - (local134 >>> 8);
					}
					local107 += local98;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local123 = arg2 >> 3;
		local127 = arg2 & 0x7;
		arg2 = local107 - 1;
		for (local134 = -arg3; local134 < 0; local134++) {
			if (local123 > 0) {
				arg0 = local123;
				do {
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local127 > 0) {
				arg0 = local127;
				do {
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local98;
		}
	}

	@OriginalMember(owner = "client!abl", name = "bf", descriptor = "(IIIIII)V", line = 423)
	@Override
	public void method17050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg0 < this.anInt272 * 45613833) {
			arg2 -= this.anInt272 * 45613833 - arg0;
			arg0 = this.anInt272 * 45613833;
		}
		if (arg1 < this.anInt273 * 1850088287) {
			arg3 -= this.anInt273 * 1850088287 - arg1;
			arg1 = this.anInt273 * 1850088287;
		}
		if (arg2 + arg0 > this.anInt278 * -886740031) {
			arg2 = this.anInt278 * -886740031 - arg0;
		}
		if (arg1 + arg3 > this.anInt274 * 2066290591) {
			arg3 = this.anInt274 * 2066290591 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt278 * -886740031 || arg1 > this.anInt274 * 2066290591) {
			return;
		}
		@Pc(98) int local98 = this.anInt287 * -355627019 - arg2;
		@Pc(107) int local107 = arg0 + this.anInt287 * -355627019 * arg1;
		@Pc(111) int local111 = arg4 >>> 24;
		@Pc(123) int local123;
		@Pc(127) int local127;
		@Pc(134) int local134;
		if (arg5 != 0 && (arg5 != 1 || local111 != 255)) {
			@Pc(253) int local253;
			if (arg5 == 1) {
				@Pc(234) int local234 = (local111 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + (local111 * ((arg4 & 0xFF00FF00) >>> 8) & 0xFF00FF00);
				local123 = 256 - local111;
				for (local127 = 0; local127 < arg3; local127++) {
					for (local134 = -arg2; local134 < 0; local134++) {
						local253 = this.anIntArray39[local107];
						@Pc(273) int local273 = ((local253 >>> 8 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local253 & 0xFF00FF) * local123 >> 8 & 0xFF00FF);
						this.anIntArray39[local107++] = local273 + local234;
					}
					local107 += local98;
				}
			} else if (arg5 == 2) {
				for (local123 = 0; local123 < arg3; local123++) {
					for (local127 = -arg2; local127 < 0; local127++) {
						local134 = this.anIntArray39[local107];
						local253 = arg4 + local134;
						@Pc(320) int local320 = (arg4 & 0xFF00FF) + (local134 & 0xFF00FF);
						local134 = (local253 - local320 & 0x10000) + (local320 & 0x1000100);
						this.anIntArray39[local107++] = local253 - local134 | local134 - (local134 >>> 8);
					}
					local107 += local98;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local123 = arg2 >> 3;
		local127 = arg2 & 0x7;
		arg2 = local107 - 1;
		for (local134 = -arg3; local134 < 0; local134++) {
			if (local123 > 0) {
				arg0 = local123;
				do {
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local127 > 0) {
				arg0 = local127;
				do {
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local98;
		}
	}

	@OriginalMember(owner = "client!abl", name = "ly", descriptor = "(IIIIII)V", line = 423)
	@Override
	public void method17135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg0 < this.anInt272 * 45613833) {
			arg2 -= this.anInt272 * 45613833 - arg0;
			arg0 = this.anInt272 * 45613833;
		}
		if (arg1 < this.anInt273 * 1850088287) {
			arg3 -= this.anInt273 * 1850088287 - arg1;
			arg1 = this.anInt273 * 1850088287;
		}
		if (arg2 + arg0 > this.anInt278 * -886740031) {
			arg2 = this.anInt278 * -886740031 - arg0;
		}
		if (arg1 + arg3 > this.anInt274 * 2066290591) {
			arg3 = this.anInt274 * 2066290591 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt278 * -886740031 || arg1 > this.anInt274 * 2066290591) {
			return;
		}
		@Pc(98) int local98 = this.anInt287 * -355627019 - arg2;
		@Pc(107) int local107 = arg0 + this.anInt287 * -355627019 * arg1;
		@Pc(111) int local111 = arg4 >>> 24;
		@Pc(123) int local123;
		@Pc(127) int local127;
		@Pc(134) int local134;
		if (arg5 != 0 && (arg5 != 1 || local111 != 255)) {
			@Pc(253) int local253;
			if (arg5 == 1) {
				@Pc(234) int local234 = (local111 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + (local111 * ((arg4 & 0xFF00FF00) >>> 8) & 0xFF00FF00);
				local123 = 256 - local111;
				for (local127 = 0; local127 < arg3; local127++) {
					for (local134 = -arg2; local134 < 0; local134++) {
						local253 = this.anIntArray39[local107];
						@Pc(273) int local273 = ((local253 >>> 8 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local253 & 0xFF00FF) * local123 >> 8 & 0xFF00FF);
						this.anIntArray39[local107++] = local273 + local234;
					}
					local107 += local98;
				}
			} else if (arg5 == 2) {
				for (local123 = 0; local123 < arg3; local123++) {
					for (local127 = -arg2; local127 < 0; local127++) {
						local134 = this.anIntArray39[local107];
						local253 = arg4 + local134;
						@Pc(320) int local320 = (arg4 & 0xFF00FF) + (local134 & 0xFF00FF);
						local134 = (local253 - local320 & 0x10000) + (local320 & 0x1000100);
						this.anIntArray39[local107++] = local253 - local134 | local134 - (local134 >>> 8);
					}
					local107 += local98;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local123 = arg2 >> 3;
		local127 = arg2 & 0x7;
		arg2 = local107 - 1;
		for (local134 = -arg3; local134 < 0; local134++) {
			if (local123 > 0) {
				arg0 = local123;
				do {
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local127 > 0) {
				arg0 = local127;
				do {
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local98;
		}
	}

	@OriginalMember(owner = "client!abl", name = "lh", descriptor = "(IIIIII)V", line = 423)
	@Override
	public void method17198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg0 < this.anInt272 * 45613833) {
			arg2 -= this.anInt272 * 45613833 - arg0;
			arg0 = this.anInt272 * 45613833;
		}
		if (arg1 < this.anInt273 * 1850088287) {
			arg3 -= this.anInt273 * 1850088287 - arg1;
			arg1 = this.anInt273 * 1850088287;
		}
		if (arg2 + arg0 > this.anInt278 * -886740031) {
			arg2 = this.anInt278 * -886740031 - arg0;
		}
		if (arg1 + arg3 > this.anInt274 * 2066290591) {
			arg3 = this.anInt274 * 2066290591 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt278 * -886740031 || arg1 > this.anInt274 * 2066290591) {
			return;
		}
		@Pc(98) int local98 = this.anInt287 * -355627019 - arg2;
		@Pc(107) int local107 = arg0 + this.anInt287 * -355627019 * arg1;
		@Pc(111) int local111 = arg4 >>> 24;
		@Pc(123) int local123;
		@Pc(127) int local127;
		@Pc(134) int local134;
		if (arg5 != 0 && (arg5 != 1 || local111 != 255)) {
			@Pc(253) int local253;
			if (arg5 == 1) {
				@Pc(234) int local234 = (local111 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + (local111 * ((arg4 & 0xFF00FF00) >>> 8) & 0xFF00FF00);
				local123 = 256 - local111;
				for (local127 = 0; local127 < arg3; local127++) {
					for (local134 = -arg2; local134 < 0; local134++) {
						local253 = this.anIntArray39[local107];
						@Pc(273) int local273 = ((local253 >>> 8 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local253 & 0xFF00FF) * local123 >> 8 & 0xFF00FF);
						this.anIntArray39[local107++] = local273 + local234;
					}
					local107 += local98;
				}
			} else if (arg5 == 2) {
				for (local123 = 0; local123 < arg3; local123++) {
					for (local127 = -arg2; local127 < 0; local127++) {
						local134 = this.anIntArray39[local107];
						local253 = arg4 + local134;
						@Pc(320) int local320 = (arg4 & 0xFF00FF) + (local134 & 0xFF00FF);
						local134 = (local253 - local320 & 0x10000) + (local320 & 0x1000100);
						this.anIntArray39[local107++] = local253 - local134 | local134 - (local134 >>> 8);
					}
					local107 += local98;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local123 = arg2 >> 3;
		local127 = arg2 & 0x7;
		arg2 = local107 - 1;
		for (local134 = -arg3; local134 < 0; local134++) {
			if (local123 > 0) {
				arg0 = local123;
				do {
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local127 > 0) {
				arg0 = local127;
				do {
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local98;
		}
	}

	@OriginalMember(owner = "client!abl", name = "lp", descriptor = "(IIIIII)V", line = 423)
	@Override
	public void method17334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg0 < this.anInt272 * 45613833) {
			arg2 -= this.anInt272 * 45613833 - arg0;
			arg0 = this.anInt272 * 45613833;
		}
		if (arg1 < this.anInt273 * 1850088287) {
			arg3 -= this.anInt273 * 1850088287 - arg1;
			arg1 = this.anInt273 * 1850088287;
		}
		if (arg2 + arg0 > this.anInt278 * -886740031) {
			arg2 = this.anInt278 * -886740031 - arg0;
		}
		if (arg1 + arg3 > this.anInt274 * 2066290591) {
			arg3 = this.anInt274 * 2066290591 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt278 * -886740031 || arg1 > this.anInt274 * 2066290591) {
			return;
		}
		@Pc(98) int local98 = this.anInt287 * -355627019 - arg2;
		@Pc(107) int local107 = arg0 + this.anInt287 * -355627019 * arg1;
		@Pc(111) int local111 = arg4 >>> 24;
		@Pc(123) int local123;
		@Pc(127) int local127;
		@Pc(134) int local134;
		if (arg5 != 0 && (arg5 != 1 || local111 != 255)) {
			@Pc(253) int local253;
			if (arg5 == 1) {
				@Pc(234) int local234 = (local111 * (arg4 & 0xFF00FF) >> 8 & 0xFF00FF) + (local111 * ((arg4 & 0xFF00FF00) >>> 8) & 0xFF00FF00);
				local123 = 256 - local111;
				for (local127 = 0; local127 < arg3; local127++) {
					for (local134 = -arg2; local134 < 0; local134++) {
						local253 = this.anIntArray39[local107];
						@Pc(273) int local273 = ((local253 >>> 8 & 0xFF00FF) * local123 & 0xFF00FF00) + ((local253 & 0xFF00FF) * local123 >> 8 & 0xFF00FF);
						this.anIntArray39[local107++] = local273 + local234;
					}
					local107 += local98;
				}
			} else if (arg5 == 2) {
				for (local123 = 0; local123 < arg3; local123++) {
					for (local127 = -arg2; local127 < 0; local127++) {
						local134 = this.anIntArray39[local107];
						local253 = arg4 + local134;
						@Pc(320) int local320 = (arg4 & 0xFF00FF) + (local134 & 0xFF00FF);
						local134 = (local253 - local320 & 0x10000) + (local320 & 0x1000100);
						this.anIntArray39[local107++] = local253 - local134 | local134 - (local134 >>> 8);
					}
					local107 += local98;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local123 = arg2 >> 3;
		local127 = arg2 & 0x7;
		arg2 = local107 - 1;
		for (local134 = -arg3; local134 < 0; local134++) {
			if (local123 > 0) {
				arg0 = local123;
				do {
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local127 > 0) {
				arg0 = local127;
				do {
					arg2++;
					this.anIntArray39[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local98;
		}
	}

	@OriginalMember(owner = "client!abl", name = "bk", descriptor = "(IIIII)V", line = 493)
	@Override
	void method17420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(13) int local13 = arg1 - arg2;
		if (local13 < this.anInt273 * 1850088287) {
			local13 = this.anInt273 * 1850088287;
		}
		@Pc(30) int local30 = arg1 + arg2 + 1;
		if (local30 > this.anInt274 * 2066290591) {
			local30 = this.anInt274 * 2066290591;
		}
		@Pc(43) int local43 = local13;
		@Pc(47) int local47 = arg2 * arg2;
		@Pc(49) int local49 = 0;
		@Pc(53) int local53 = arg1 - local13;
		@Pc(57) int local57 = local53 * local53;
		@Pc(61) int local61 = local57 - local53;
		if (arg1 > local30) {
			arg1 = local30;
		}
		@Pc(70) int local70 = arg3 >>> 24;
		@Pc(108) int local108;
		@Pc(123) int local123;
		@Pc(143) int local143;
		@Pc(145) int local145;
		if (arg4 == 0 || arg4 == 1 && local70 == 255) {
			while (local43 < arg1) {
				while (local61 <= local47 || local57 <= local47) {
					local57 += local49 + local49;
					local61 += local49++ + local49;
				}
				local108 = arg0 - local49 + 1;
				if (local108 < this.anInt272 * 45613833) {
					local108 = this.anInt272 * 45613833;
				}
				local123 = arg0 + local49;
				if (local123 > this.anInt278 * -886740031) {
					local123 = this.anInt278 * -886740031;
				}
				local143 = local108 + this.anInt287 * -355627019 * local43;
				for (local145 = local108; local145 < local123; local145++) {
					this.anIntArray39[local143++] = arg3;
				}
				local43++;
				local57 -= local53-- + local53;
				local61 -= local53 + local53;
			}
			local49 = arg2;
			local53 = local43 - arg1;
			local61 = local53 * local53 + local47;
			local57 = local61 - arg2;
			local61 -= local53;
			while (local43 < local30) {
				while (local61 > local47 && local57 > local47) {
					local61 -= local49-- + local49;
					local57 -= local49 + local49;
				}
				local108 = arg0 - local49;
				if (local108 < this.anInt272 * 45613833) {
					local108 = this.anInt272 * 45613833;
				}
				local123 = arg0 + local49;
				if (local123 > this.anInt278 * -886740031 - 1) {
					local123 = this.anInt278 * -886740031 - 1;
				}
				local143 = local108 + this.anInt287 * -355627019 * local43;
				for (local145 = local108; local145 <= local123; local145++) {
					this.anIntArray39[local143++] = arg3;
				}
				local43++;
				local61 += local53 + local53;
				local57 += local53++ + local53;
			}
			return;
		}
		@Pc(382) int local382;
		@Pc(390) int local390;
		if (arg4 == 1) {
			@Pc(312) int local312 = (local70 << 24) + ((arg3 & 0xFF00) * local70 >> 8 & 0xFF00) + (local70 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF);
			local108 = 256 - local70;
			while (local43 < arg1) {
				while (local61 <= local47 || local57 <= local47) {
					local57 += local49 + local49;
					local61 += local49++ + local49;
				}
				local123 = arg0 - local49 + 1;
				if (local123 < this.anInt272 * 45613833) {
					local123 = this.anInt272 * 45613833;
				}
				local143 = local49 + arg0;
				if (local143 > this.anInt278 * -886740031) {
					local143 = this.anInt278 * -886740031;
				}
				local145 = this.anInt287 * -355627019 * local43 + local123;
				for (local382 = local123; local382 < local143; local382++) {
					local390 = this.anIntArray39[local145];
					@Pc(410) int local410 = (local108 * (local390 & 0xFF00FF) >> 8 & 0xFF00FF) + (local108 * (local390 & 0xFF00) >> 8 & 0xFF00);
					this.anIntArray39[local145++] = local410 + local312;
				}
				local43++;
				local57 -= local53-- + local53;
				local61 -= local53 + local53;
			}
			local49 = arg2;
			local53 = -local53;
			local61 = local47 + local53 * local53;
			local57 = local61 - arg2;
			local61 -= local53;
			while (local43 < local30) {
				while (local61 > local47 && local57 > local47) {
					local61 -= local49-- + local49;
					local57 -= local49 + local49;
				}
				local123 = arg0 - local49;
				if (local123 < this.anInt272 * 45613833) {
					local123 = this.anInt272 * 45613833;
				}
				local143 = local49 + arg0;
				if (local143 > this.anInt278 * -886740031 - 1) {
					local143 = this.anInt278 * -886740031 - 1;
				}
				local145 = local43 * this.anInt287 * -355627019 + local123;
				for (local382 = local123; local382 <= local143; local382++) {
					local390 = this.anIntArray39[local145];
					local390 = ((local390 & 0xFF00) * local108 >> 8 & 0xFF00) + (local108 * (local390 & 0xFF00FF) >> 8 & 0xFF00FF);
					this.anIntArray39[local145++] = local390 + local312;
				}
				local43++;
				local61 += local53 + local53;
				local57 += local53++ + local53;
			}
		} else if (arg4 == 2) {
			@Pc(665) int local665;
			while (local43 < arg1) {
				while (local61 <= local47 || local57 <= local47) {
					local57 += local49 + local49;
					local61 += local49++ + local49;
				}
				local108 = arg0 - local49 + 1;
				if (local108 < this.anInt272 * 45613833) {
					local108 = this.anInt272 * 45613833;
				}
				local123 = arg0 + local49;
				if (local123 > this.anInt278 * -886740031) {
					local123 = this.anInt278 * -886740031;
				}
				local143 = this.anInt287 * -355627019 * local43 + local108;
				for (local145 = local108; local145 < local123; local145++) {
					local382 = this.anIntArray39[local143];
					local390 = local382 + arg3;
					local665 = (local382 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local382 = (local665 & 0x1000100) + (local390 - local665 & 0x10000);
					this.anIntArray39[local143++] = local390 - local382 | local382 - (local382 >>> 8);
				}
				local43++;
				local57 -= local53-- + local53;
				local61 -= local53 + local53;
			}
			local49 = arg2;
			local53 = -local53;
			local61 = local47 + local53 * local53;
			local57 = local61 - arg2;
			local61 -= local53;
			while (local43 < local30) {
				while (local61 > local47 && local57 > local47) {
					local61 -= local49-- + local49;
					local57 -= local49 + local49;
				}
				local108 = arg0 - local49;
				if (local108 < this.anInt272 * 45613833) {
					local108 = this.anInt272 * 45613833;
				}
				local123 = local49 + arg0;
				if (local123 > this.anInt278 * -886740031 - 1) {
					local123 = this.anInt278 * -886740031 - 1;
				}
				local143 = local108 + local43 * this.anInt287 * -355627019;
				for (local145 = local108; local145 <= local123; local145++) {
					local382 = this.anIntArray39[local143];
					local390 = arg3 + local382;
					local665 = (arg3 & 0xFF00FF) + (local382 & 0xFF00FF);
					local382 = (local665 & 0x1000100) + (local390 - local665 & 0x10000);
					this.anIntArray39[local143++] = local390 - local382 | local382 - (local382 >>> 8);
				}
				local43++;
				local61 += local53 + local53;
				local57 += local53++ + local53;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "gc", descriptor = "(IIIII)V", line = 493)
	@Override
	void method17290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(13) int local13 = arg1 - arg2;
		if (local13 < this.anInt273 * 1850088287) {
			local13 = this.anInt273 * 1850088287;
		}
		@Pc(30) int local30 = arg1 + arg2 + 1;
		if (local30 > this.anInt274 * 2066290591) {
			local30 = this.anInt274 * 2066290591;
		}
		@Pc(43) int local43 = local13;
		@Pc(47) int local47 = arg2 * arg2;
		@Pc(49) int local49 = 0;
		@Pc(53) int local53 = arg1 - local13;
		@Pc(57) int local57 = local53 * local53;
		@Pc(61) int local61 = local57 - local53;
		if (arg1 > local30) {
			arg1 = local30;
		}
		@Pc(70) int local70 = arg3 >>> 24;
		@Pc(108) int local108;
		@Pc(123) int local123;
		@Pc(143) int local143;
		@Pc(145) int local145;
		if (arg4 == 0 || arg4 == 1 && local70 == 255) {
			while (local43 < arg1) {
				while (local61 <= local47 || local57 <= local47) {
					local57 += local49 + local49;
					local61 += local49++ + local49;
				}
				local108 = arg0 - local49 + 1;
				if (local108 < this.anInt272 * 45613833) {
					local108 = this.anInt272 * 45613833;
				}
				local123 = arg0 + local49;
				if (local123 > this.anInt278 * -886740031) {
					local123 = this.anInt278 * -886740031;
				}
				local143 = local108 + this.anInt287 * -355627019 * local43;
				for (local145 = local108; local145 < local123; local145++) {
					this.anIntArray39[local143++] = arg3;
				}
				local43++;
				local57 -= local53-- + local53;
				local61 -= local53 + local53;
			}
			local49 = arg2;
			local53 = local43 - arg1;
			local61 = local53 * local53 + local47;
			local57 = local61 - arg2;
			local61 -= local53;
			while (local43 < local30) {
				while (local61 > local47 && local57 > local47) {
					local61 -= local49-- + local49;
					local57 -= local49 + local49;
				}
				local108 = arg0 - local49;
				if (local108 < this.anInt272 * 45613833) {
					local108 = this.anInt272 * 45613833;
				}
				local123 = arg0 + local49;
				if (local123 > this.anInt278 * -886740031 - 1) {
					local123 = this.anInt278 * -886740031 - 1;
				}
				local143 = local108 + this.anInt287 * -355627019 * local43;
				for (local145 = local108; local145 <= local123; local145++) {
					this.anIntArray39[local143++] = arg3;
				}
				local43++;
				local61 += local53 + local53;
				local57 += local53++ + local53;
			}
			return;
		}
		@Pc(382) int local382;
		@Pc(390) int local390;
		if (arg4 == 1) {
			@Pc(312) int local312 = (local70 << 24) + ((arg3 & 0xFF00) * local70 >> 8 & 0xFF00) + (local70 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF);
			local108 = 256 - local70;
			while (local43 < arg1) {
				while (local61 <= local47 || local57 <= local47) {
					local57 += local49 + local49;
					local61 += local49++ + local49;
				}
				local123 = arg0 - local49 + 1;
				if (local123 < this.anInt272 * 45613833) {
					local123 = this.anInt272 * 45613833;
				}
				local143 = local49 + arg0;
				if (local143 > this.anInt278 * -886740031) {
					local143 = this.anInt278 * -886740031;
				}
				local145 = this.anInt287 * -355627019 * local43 + local123;
				for (local382 = local123; local382 < local143; local382++) {
					local390 = this.anIntArray39[local145];
					@Pc(410) int local410 = (local108 * (local390 & 0xFF00FF) >> 8 & 0xFF00FF) + (local108 * (local390 & 0xFF00) >> 8 & 0xFF00);
					this.anIntArray39[local145++] = local410 + local312;
				}
				local43++;
				local57 -= local53-- + local53;
				local61 -= local53 + local53;
			}
			local49 = arg2;
			local53 = -local53;
			local61 = local47 + local53 * local53;
			local57 = local61 - arg2;
			local61 -= local53;
			while (local43 < local30) {
				while (local61 > local47 && local57 > local47) {
					local61 -= local49-- + local49;
					local57 -= local49 + local49;
				}
				local123 = arg0 - local49;
				if (local123 < this.anInt272 * 45613833) {
					local123 = this.anInt272 * 45613833;
				}
				local143 = local49 + arg0;
				if (local143 > this.anInt278 * -886740031 - 1) {
					local143 = this.anInt278 * -886740031 - 1;
				}
				local145 = local43 * this.anInt287 * -355627019 + local123;
				for (local382 = local123; local382 <= local143; local382++) {
					local390 = this.anIntArray39[local145];
					local390 = ((local390 & 0xFF00) * local108 >> 8 & 0xFF00) + (local108 * (local390 & 0xFF00FF) >> 8 & 0xFF00FF);
					this.anIntArray39[local145++] = local390 + local312;
				}
				local43++;
				local61 += local53 + local53;
				local57 += local53++ + local53;
			}
		} else if (arg4 == 2) {
			@Pc(665) int local665;
			while (local43 < arg1) {
				while (local61 <= local47 || local57 <= local47) {
					local57 += local49 + local49;
					local61 += local49++ + local49;
				}
				local108 = arg0 - local49 + 1;
				if (local108 < this.anInt272 * 45613833) {
					local108 = this.anInt272 * 45613833;
				}
				local123 = arg0 + local49;
				if (local123 > this.anInt278 * -886740031) {
					local123 = this.anInt278 * -886740031;
				}
				local143 = this.anInt287 * -355627019 * local43 + local108;
				for (local145 = local108; local145 < local123; local145++) {
					local382 = this.anIntArray39[local143];
					local390 = local382 + arg3;
					local665 = (local382 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local382 = (local665 & 0x1000100) + (local390 - local665 & 0x10000);
					this.anIntArray39[local143++] = local390 - local382 | local382 - (local382 >>> 8);
				}
				local43++;
				local57 -= local53-- + local53;
				local61 -= local53 + local53;
			}
			local49 = arg2;
			local53 = -local53;
			local61 = local47 + local53 * local53;
			local57 = local61 - arg2;
			local61 -= local53;
			while (local43 < local30) {
				while (local61 > local47 && local57 > local47) {
					local61 -= local49-- + local49;
					local57 -= local49 + local49;
				}
				local108 = arg0 - local49;
				if (local108 < this.anInt272 * 45613833) {
					local108 = this.anInt272 * 45613833;
				}
				local123 = local49 + arg0;
				if (local123 > this.anInt278 * -886740031 - 1) {
					local123 = this.anInt278 * -886740031 - 1;
				}
				local143 = local108 + local43 * this.anInt287 * -355627019;
				for (local145 = local108; local145 <= local123; local145++) {
					local382 = this.anIntArray39[local143];
					local390 = arg3 + local382;
					local665 = (arg3 & 0xFF00FF) + (local382 & 0xFF00FF);
					local382 = (local665 & 0x1000100) + (local390 - local665 & 0x10000);
					this.anIntArray39[local143++] = local390 - local382 | local382 - (local382 >>> 8);
				}
				local43++;
				local61 += local53 + local53;
				local57 += local53++ + local53;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "gw", descriptor = "(IIIII)V", line = 644)
	@Override
	void method17213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anIntArray39 == null || (arg1 < this.anInt273 * 1850088287 || arg1 >= this.anInt274 * 2066290591)) {
			return;
		}
		if (arg0 < this.anInt272 * 45613833) {
			arg2 -= this.anInt272 * 45613833 - arg0;
			arg0 = this.anInt272 * 45613833;
		}
		if (arg0 + arg2 > this.anInt278 * -886740031) {
			arg2 = this.anInt278 * -886740031 - arg0;
		}
		@Pc(60) int local60 = this.anInt287 * -355627019 * arg1 + arg0;
		@Pc(64) int local64 = arg3 >>> 24;
		@Pc(75) int local75;
		if (arg4 == 0 || arg4 == 1 && local64 == 255) {
			for (local75 = 0; local75 < arg2; local75++) {
				this.anIntArray39[local75 + local60] = arg3;
			}
			return;
		}
		@Pc(121) int local121;
		@Pc(131) int local131;
		if (arg4 == 1) {
			@Pc(115) int local115 = (local64 << 24) + ((arg3 & 0xFF00) * local64 >> 8 & 0xFF00) + (local64 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF);
			local75 = 256 - local64;
			for (local121 = 0; local121 < arg2; local121++) {
				local131 = this.anIntArray39[local121 + local60];
				@Pc(151) int local151 = (local75 * (local131 & 0xFF00FF) >> 8 & 0xFF00FF) + ((local131 & 0xFF00) * local75 >> 8 & 0xFF00);
				this.anIntArray39[local121 + local60] = local151 + local115;
			}
		} else if (arg4 == 2) {
			for (local75 = 0; local75 < arg2; local75++) {
				local121 = this.anIntArray39[local75 + local60];
				local131 = arg3 + local121;
				@Pc(190) int local190 = (arg3 & 0xFF00FF) + (local121 & 0xFF00FF);
				local121 = (local131 - local190 & 0x10000) + (local190 & 0x1000100);
				this.anIntArray39[local75 + local60] = local131 - local121 | local121 - (local121 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "bg", descriptor = "(IIIII)V", line = 644)
	@Override
	void method17072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anIntArray39 == null || (arg1 < this.anInt273 * 1850088287 || arg1 >= this.anInt274 * 2066290591)) {
			return;
		}
		if (arg0 < this.anInt272 * 45613833) {
			arg2 -= this.anInt272 * 45613833 - arg0;
			arg0 = this.anInt272 * 45613833;
		}
		if (arg0 + arg2 > this.anInt278 * -886740031) {
			arg2 = this.anInt278 * -886740031 - arg0;
		}
		@Pc(60) int local60 = this.anInt287 * -355627019 * arg1 + arg0;
		@Pc(64) int local64 = arg3 >>> 24;
		@Pc(75) int local75;
		if (arg4 == 0 || arg4 == 1 && local64 == 255) {
			for (local75 = 0; local75 < arg2; local75++) {
				this.anIntArray39[local75 + local60] = arg3;
			}
			return;
		}
		@Pc(121) int local121;
		@Pc(131) int local131;
		if (arg4 == 1) {
			@Pc(115) int local115 = (local64 << 24) + ((arg3 & 0xFF00) * local64 >> 8 & 0xFF00) + (local64 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF);
			local75 = 256 - local64;
			for (local121 = 0; local121 < arg2; local121++) {
				local131 = this.anIntArray39[local121 + local60];
				@Pc(151) int local151 = (local75 * (local131 & 0xFF00FF) >> 8 & 0xFF00FF) + ((local131 & 0xFF00) * local75 >> 8 & 0xFF00);
				this.anIntArray39[local121 + local60] = local151 + local115;
			}
		} else if (arg4 == 2) {
			for (local75 = 0; local75 < arg2; local75++) {
				local121 = this.anIntArray39[local75 + local60];
				local131 = arg3 + local121;
				@Pc(190) int local190 = (arg3 & 0xFF00FF) + (local121 & 0xFF00FF);
				local121 = (local131 - local190 & 0x10000) + (local190 & 0x1000100);
				this.anIntArray39[local75 + local60] = local131 - local121 | local121 - (local121 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "pp", descriptor = "(IIIIIIII)V", line = 678)
	void method3161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.anIntArray39 == null || (arg1 < this.anInt273 * 1850088287 || arg1 >= this.anInt274 * 2066290591)) {
			return;
		}
		@Pc(25) int local25 = arg1 * -355627019 * this.anInt287 + arg0;
		@Pc(29) int local29 = arg3 >>> 24;
		@Pc(33) int local33 = arg5 + arg6;
		@Pc(37) int local37 = arg7 % local33;
		@Pc(48) int local48;
		if (arg4 == 0 || arg4 == 1 && local29 == 255) {
			local48 = 0;
			while (local48 < arg2) {
				if (arg0 + local48 >= this.anInt272 * 45613833 && local48 + arg0 < this.anInt278 * -886740031 && local37 < arg5) {
					this.anIntArray39[local25 + local48] = arg3;
				}
				local48++;
				local37++;
				local37 %= local33;
			}
			return;
		}
		@Pc(118) int local118;
		@Pc(147) int local147;
		if (arg4 == 1) {
			@Pc(112) int local112 = (local29 << 24) + (local29 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF) + (local29 * (arg3 & 0xFF00) >> 8 & 0xFF00);
			local48 = 256 - local29;
			local118 = 0;
			while (local118 < arg2) {
				if (local118 + arg0 >= this.anInt272 * 45613833 && arg0 + local118 < this.anInt278 * -886740031 && local37 < arg5) {
					local147 = this.anIntArray39[local25 + local118];
					@Pc(167) int local167 = ((local147 & 0xFF00) * local48 >> 8 & 0xFF00) + (local48 * (local147 & 0xFF00FF) >> 8 & 0xFF00FF);
					this.anIntArray39[local118 + local25] = local112 + local167;
				}
				local118++;
				local37++;
				local37 %= local33;
			}
		} else if (arg4 == 2) {
			local48 = 0;
			while (local48 < arg2) {
				if (arg0 + local48 >= this.anInt272 * 45613833 && local48 + arg0 < this.anInt278 * -886740031 && local37 < arg5) {
					local118 = this.anIntArray39[local25 + local48];
					local147 = local118 + arg3;
					@Pc(230) int local230 = (local118 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local118 = (local147 - local230 & 0x10000) + (local230 & 0x1000100);
					this.anIntArray39[local25 + local48] = local147 - local118 | local118 - (local118 >>> 8);
				}
				local48++;
				local37++;
				local37 %= local33;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "qr", descriptor = "(IIIIIIII)V", line = 678)
	void method3187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.anIntArray39 == null || (arg1 < this.anInt273 * 1850088287 || arg1 >= this.anInt274 * 2066290591)) {
			return;
		}
		@Pc(25) int local25 = arg1 * -355627019 * this.anInt287 + arg0;
		@Pc(29) int local29 = arg3 >>> 24;
		@Pc(33) int local33 = arg5 + arg6;
		@Pc(37) int local37 = arg7 % local33;
		@Pc(48) int local48;
		if (arg4 == 0 || arg4 == 1 && local29 == 255) {
			local48 = 0;
			while (local48 < arg2) {
				if (arg0 + local48 >= this.anInt272 * 45613833 && local48 + arg0 < this.anInt278 * -886740031 && local37 < arg5) {
					this.anIntArray39[local25 + local48] = arg3;
				}
				local48++;
				local37++;
				local37 %= local33;
			}
			return;
		}
		@Pc(118) int local118;
		@Pc(147) int local147;
		if (arg4 == 1) {
			@Pc(112) int local112 = (local29 << 24) + (local29 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF) + (local29 * (arg3 & 0xFF00) >> 8 & 0xFF00);
			local48 = 256 - local29;
			local118 = 0;
			while (local118 < arg2) {
				if (local118 + arg0 >= this.anInt272 * 45613833 && arg0 + local118 < this.anInt278 * -886740031 && local37 < arg5) {
					local147 = this.anIntArray39[local25 + local118];
					@Pc(167) int local167 = ((local147 & 0xFF00) * local48 >> 8 & 0xFF00) + (local48 * (local147 & 0xFF00FF) >> 8 & 0xFF00FF);
					this.anIntArray39[local118 + local25] = local112 + local167;
				}
				local118++;
				local37++;
				local37 %= local33;
			}
		} else if (arg4 == 2) {
			local48 = 0;
			while (local48 < arg2) {
				if (arg0 + local48 >= this.anInt272 * 45613833 && local48 + arg0 < this.anInt278 * -886740031 && local37 < arg5) {
					local118 = this.anIntArray39[local25 + local48];
					local147 = local118 + arg3;
					@Pc(230) int local230 = (local118 & 0xFF00FF) + (arg3 & 0xFF00FF);
					local118 = (local147 - local230 & 0x10000) + (local230 & 0x1000100);
					this.anIntArray39[local25 + local48] = local147 - local118 | local118 - (local118 >>> 8);
				}
				local48++;
				local37++;
				local37 %= local33;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "br", descriptor = "(IIIII)V", line = 715)
	@Override
	void method17073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anIntArray39 == null || (arg0 < this.anInt272 * 45613833 || arg0 >= this.anInt278 * -886740031)) {
			return;
		}
		if (arg1 < this.anInt273 * 1850088287) {
			arg2 -= this.anInt273 * 1850088287 - arg1;
			arg1 = this.anInt273 * 1850088287;
		}
		if (arg2 + arg1 > this.anInt274 * 2066290591) {
			arg2 = this.anInt274 * 2066290591 - arg1;
		}
		@Pc(61) int local61 = this.anInt287 * -355627019 * arg1 + arg0;
		@Pc(65) int local65 = arg3 >>> 24;
		@Pc(75) int local75;
		if (arg4 == 0 || arg4 == 1 && local65 == 255) {
			for (local75 = 0; local75 < arg2; local75++) {
				this.anIntArray39[this.anInt287 * -355627019 * local75 + local61] = arg3;
			}
			return;
		}
		@Pc(126) int local126;
		@Pc(138) int local138;
		@Pc(143) int local143;
		if (arg4 == 1) {
			@Pc(120) int local120 = ((arg3 & 0xFF00FF) * local65 >> 8 & 0xFF00FF) + (local65 * (arg3 & 0xFF00) >> 8 & 0xFF00) + (local65 << 24);
			local75 = 256 - local65;
			for (local126 = 0; local126 < arg2; local126++) {
				local138 = local61 + this.anInt287 * -355627019 * local126;
				local143 = this.anIntArray39[local138];
				@Pc(163) int local163 = ((local143 & 0xFF00FF) * local75 >> 8 & 0xFF00FF) + (local75 * (local143 & 0xFF00) >> 8 & 0xFF00);
				this.anIntArray39[local138] = local120 + local163;
			}
		} else if (arg4 == 2) {
			for (local75 = 0; local75 < arg2; local75++) {
				local126 = local61 + local75 * this.anInt287 * -355627019;
				local138 = this.anIntArray39[local126];
				local143 = arg3 + local138;
				@Pc(207) int local207 = (local138 & 0xFF00FF) + (arg3 & 0xFF00FF);
				local138 = (local207 & 0x1000100) + (local143 - local207 & 0x10000);
				this.anIntArray39[local126] = local143 - local138 | local138 - (local138 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "go", descriptor = "(IIIII)V", line = 715)
	@Override
	void method17214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anIntArray39 == null || (arg0 < this.anInt272 * 45613833 || arg0 >= this.anInt278 * -886740031)) {
			return;
		}
		if (arg1 < this.anInt273 * 1850088287) {
			arg2 -= this.anInt273 * 1850088287 - arg1;
			arg1 = this.anInt273 * 1850088287;
		}
		if (arg2 + arg1 > this.anInt274 * 2066290591) {
			arg2 = this.anInt274 * 2066290591 - arg1;
		}
		@Pc(61) int local61 = this.anInt287 * -355627019 * arg1 + arg0;
		@Pc(65) int local65 = arg3 >>> 24;
		@Pc(75) int local75;
		if (arg4 == 0 || arg4 == 1 && local65 == 255) {
			for (local75 = 0; local75 < arg2; local75++) {
				this.anIntArray39[this.anInt287 * -355627019 * local75 + local61] = arg3;
			}
			return;
		}
		@Pc(126) int local126;
		@Pc(138) int local138;
		@Pc(143) int local143;
		if (arg4 == 1) {
			@Pc(120) int local120 = ((arg3 & 0xFF00FF) * local65 >> 8 & 0xFF00FF) + (local65 * (arg3 & 0xFF00) >> 8 & 0xFF00) + (local65 << 24);
			local75 = 256 - local65;
			for (local126 = 0; local126 < arg2; local126++) {
				local138 = local61 + this.anInt287 * -355627019 * local126;
				local143 = this.anIntArray39[local138];
				@Pc(163) int local163 = ((local143 & 0xFF00FF) * local75 >> 8 & 0xFF00FF) + (local75 * (local143 & 0xFF00) >> 8 & 0xFF00);
				this.anIntArray39[local138] = local120 + local163;
			}
		} else if (arg4 == 2) {
			for (local75 = 0; local75 < arg2; local75++) {
				local126 = local61 + local75 * this.anInt287 * -355627019;
				local138 = this.anIntArray39[local126];
				local143 = arg3 + local138;
				@Pc(207) int local207 = (local138 & 0xFF00FF) + (arg3 & 0xFF00FF);
				local138 = (local207 & 0x1000100) + (local143 - local207 & 0x10000);
				this.anIntArray39[local126] = local143 - local138 | local138 - (local138 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "gi", descriptor = "(IIIII)V", line = 715)
	@Override
	void method17215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anIntArray39 == null || (arg0 < this.anInt272 * 45613833 || arg0 >= this.anInt278 * -886740031)) {
			return;
		}
		if (arg1 < this.anInt273 * 1850088287) {
			arg2 -= this.anInt273 * 1850088287 - arg1;
			arg1 = this.anInt273 * 1850088287;
		}
		if (arg2 + arg1 > this.anInt274 * 2066290591) {
			arg2 = this.anInt274 * 2066290591 - arg1;
		}
		@Pc(61) int local61 = this.anInt287 * -355627019 * arg1 + arg0;
		@Pc(65) int local65 = arg3 >>> 24;
		@Pc(75) int local75;
		if (arg4 == 0 || arg4 == 1 && local65 == 255) {
			for (local75 = 0; local75 < arg2; local75++) {
				this.anIntArray39[this.anInt287 * -355627019 * local75 + local61] = arg3;
			}
			return;
		}
		@Pc(126) int local126;
		@Pc(138) int local138;
		@Pc(143) int local143;
		if (arg4 == 1) {
			@Pc(120) int local120 = ((arg3 & 0xFF00FF) * local65 >> 8 & 0xFF00FF) + (local65 * (arg3 & 0xFF00) >> 8 & 0xFF00) + (local65 << 24);
			local75 = 256 - local65;
			for (local126 = 0; local126 < arg2; local126++) {
				local138 = local61 + this.anInt287 * -355627019 * local126;
				local143 = this.anIntArray39[local138];
				@Pc(163) int local163 = ((local143 & 0xFF00FF) * local75 >> 8 & 0xFF00FF) + (local75 * (local143 & 0xFF00) >> 8 & 0xFF00);
				this.anIntArray39[local138] = local120 + local163;
			}
		} else if (arg4 == 2) {
			for (local75 = 0; local75 < arg2; local75++) {
				local126 = local61 + local75 * this.anInt287 * -355627019;
				local138 = this.anIntArray39[local126];
				local143 = arg3 + local138;
				@Pc(207) int local207 = (local138 & 0xFF00FF) + (arg3 & 0xFF00FF);
				local138 = (local207 & 0x1000100) + (local143 - local207 & 0x10000);
				this.anIntArray39[local126] = local143 - local138 | local138 - (local138 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "pb", descriptor = "(IIIIIIII)V", line = 751)
	void method3162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.anIntArray39 == null || (arg0 < this.anInt272 * 45613833 || arg0 >= this.anInt278 * -886740031)) {
			return;
		}
		@Pc(26) int local26 = arg0 + this.anInt287 * -355627019 * arg1;
		@Pc(30) int local30 = arg3 >>> 24;
		@Pc(34) int local34 = arg5 + arg6;
		@Pc(38) int local38 = arg7 % local34;
		@Pc(49) int local49;
		if (arg4 == 0 || arg4 == 1 && local30 == 255) {
			local49 = 0;
			while (local49 < arg2) {
				if (local49 + arg1 >= this.anInt273 * 1850088287 && local49 + arg1 < this.anInt274 * 2066290591 && local38 < arg5) {
					this.anIntArray39[this.anInt287 * -355627019 * local49 + local26] = arg3;
				}
				local49++;
				local38++;
				local38 %= local34;
			}
			return;
		}
		@Pc(124) int local124;
		@Pc(155) int local155;
		@Pc(160) int local160;
		if (arg4 == 1) {
			@Pc(118) int local118 = (local30 << 24) + (local30 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF) + (local30 * (arg3 & 0xFF00) >> 8 & 0xFF00);
			local49 = 256 - local30;
			local124 = 0;
			while (local124 < arg2) {
				if (local124 + arg1 >= this.anInt273 * 1850088287 && arg1 + local124 < this.anInt274 * 2066290591 && local38 < arg5) {
					local155 = local26 + local124 * this.anInt287 * -355627019;
					local160 = this.anIntArray39[local155];
					@Pc(180) int local180 = ((local160 & 0xFF00) * local49 >> 8 & 0xFF00) + (local49 * (local160 & 0xFF00FF) >> 8 & 0xFF00FF);
					this.anIntArray39[local155] = local118 + local180;
				}
				local124++;
				local38++;
				local38 %= local34;
			}
		} else if (arg4 == 2) {
			local49 = 0;
			while (local49 < arg2) {
				if (local49 + arg1 >= this.anInt273 * 1850088287 && local49 + arg1 < this.anInt274 * 2066290591 && local38 < arg5) {
					local124 = this.anInt287 * -355627019 * local49 + local26;
					local155 = this.anIntArray39[local124];
					local160 = local155 + arg3;
					@Pc(248) int local248 = (arg3 & 0xFF00FF) + (local155 & 0xFF00FF);
					local155 = (local160 - local248 & 0x10000) + (local248 & 0x1000100);
					this.anIntArray39[local124] = local160 - local155 | local155 - (local155 >>> 8);
				}
				local49++;
				local38++;
				local38 %= local34;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "qt", descriptor = "(IIIIIIII)V", line = 751)
	void method3189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.anIntArray39 == null || (arg0 < this.anInt272 * 45613833 || arg0 >= this.anInt278 * -886740031)) {
			return;
		}
		@Pc(26) int local26 = arg0 + this.anInt287 * -355627019 * arg1;
		@Pc(30) int local30 = arg3 >>> 24;
		@Pc(34) int local34 = arg5 + arg6;
		@Pc(38) int local38 = arg7 % local34;
		@Pc(49) int local49;
		if (arg4 == 0 || arg4 == 1 && local30 == 255) {
			local49 = 0;
			while (local49 < arg2) {
				if (local49 + arg1 >= this.anInt273 * 1850088287 && local49 + arg1 < this.anInt274 * 2066290591 && local38 < arg5) {
					this.anIntArray39[this.anInt287 * -355627019 * local49 + local26] = arg3;
				}
				local49++;
				local38++;
				local38 %= local34;
			}
			return;
		}
		@Pc(124) int local124;
		@Pc(155) int local155;
		@Pc(160) int local160;
		if (arg4 == 1) {
			@Pc(118) int local118 = (local30 << 24) + (local30 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF) + (local30 * (arg3 & 0xFF00) >> 8 & 0xFF00);
			local49 = 256 - local30;
			local124 = 0;
			while (local124 < arg2) {
				if (local124 + arg1 >= this.anInt273 * 1850088287 && arg1 + local124 < this.anInt274 * 2066290591 && local38 < arg5) {
					local155 = local26 + local124 * this.anInt287 * -355627019;
					local160 = this.anIntArray39[local155];
					@Pc(180) int local180 = ((local160 & 0xFF00) * local49 >> 8 & 0xFF00) + (local49 * (local160 & 0xFF00FF) >> 8 & 0xFF00FF);
					this.anIntArray39[local155] = local118 + local180;
				}
				local124++;
				local38++;
				local38 %= local34;
			}
		} else if (arg4 == 2) {
			local49 = 0;
			while (local49 < arg2) {
				if (local49 + arg1 >= this.anInt273 * 1850088287 && local49 + arg1 < this.anInt274 * 2066290591 && local38 < arg5) {
					local124 = this.anInt287 * -355627019 * local49 + local26;
					local155 = this.anIntArray39[local124];
					local160 = local155 + arg3;
					@Pc(248) int local248 = (arg3 & 0xFF00FF) + (local155 & 0xFF00FF);
					local155 = (local160 - local248 & 0x10000) + (local248 & 0x1000100);
					this.anIntArray39[local124] = local160 - local155 | local155 - (local155 >>> 8);
				}
				local49++;
				local38++;
				local38 %= local34;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "qu", descriptor = "(IIIIIIII)V", line = 751)
	void method3190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.anIntArray39 == null || (arg0 < this.anInt272 * 45613833 || arg0 >= this.anInt278 * -886740031)) {
			return;
		}
		@Pc(26) int local26 = arg0 + this.anInt287 * -355627019 * arg1;
		@Pc(30) int local30 = arg3 >>> 24;
		@Pc(34) int local34 = arg5 + arg6;
		@Pc(38) int local38 = arg7 % local34;
		@Pc(49) int local49;
		if (arg4 == 0 || arg4 == 1 && local30 == 255) {
			local49 = 0;
			while (local49 < arg2) {
				if (local49 + arg1 >= this.anInt273 * 1850088287 && local49 + arg1 < this.anInt274 * 2066290591 && local38 < arg5) {
					this.anIntArray39[this.anInt287 * -355627019 * local49 + local26] = arg3;
				}
				local49++;
				local38++;
				local38 %= local34;
			}
			return;
		}
		@Pc(124) int local124;
		@Pc(155) int local155;
		@Pc(160) int local160;
		if (arg4 == 1) {
			@Pc(118) int local118 = (local30 << 24) + (local30 * (arg3 & 0xFF00FF) >> 8 & 0xFF00FF) + (local30 * (arg3 & 0xFF00) >> 8 & 0xFF00);
			local49 = 256 - local30;
			local124 = 0;
			while (local124 < arg2) {
				if (local124 + arg1 >= this.anInt273 * 1850088287 && arg1 + local124 < this.anInt274 * 2066290591 && local38 < arg5) {
					local155 = local26 + local124 * this.anInt287 * -355627019;
					local160 = this.anIntArray39[local155];
					@Pc(180) int local180 = ((local160 & 0xFF00) * local49 >> 8 & 0xFF00) + (local49 * (local160 & 0xFF00FF) >> 8 & 0xFF00FF);
					this.anIntArray39[local155] = local118 + local180;
				}
				local124++;
				local38++;
				local38 %= local34;
			}
		} else if (arg4 == 2) {
			local49 = 0;
			while (local49 < arg2) {
				if (local49 + arg1 >= this.anInt273 * 1850088287 && local49 + arg1 < this.anInt274 * 2066290591 && local38 < arg5) {
					local124 = this.anInt287 * -355627019 * local49 + local26;
					local155 = this.anIntArray39[local124];
					local160 = local155 + arg3;
					@Pc(248) int local248 = (arg3 & 0xFF00FF) + (local155 & 0xFF00FF);
					local155 = (local160 - local248 & 0x10000) + (local248 & 0x1000100);
					this.anIntArray39[local124] = local160 - local155 | local155 - (local155 >>> 8);
				}
				local49++;
				local38++;
				local38 %= local34;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "bb", descriptor = "(IIIIII)V", line = 792)
	@Override
	public void method17024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.anIntArray39 == null) {
			return;
		}
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method17072(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.method17072(arg2 + arg0, arg1, -arg2 + 1, arg4, arg5);
			}
		} else if (arg2 != 0) {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(109) int local109;
			@Pc(152) int local152;
			@Pc(167) int local167;
			@Pc(235) int local235;
			@Pc(256) int local256;
			@Pc(261) int local261;
			@Pc(343) int local343;
			@Pc(224) int local224;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(99) int local99 = arg3 << 16;
				local109 = (int) Math.floor((double) local99 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt272 * 45613833) {
					arg1 += (this.anInt272 * 45613833 - arg0) * local109;
					arg0 = this.anInt272 * 45613833;
				}
				if (arg2 >= this.anInt278 * -886740031) {
					arg2 = this.anInt278 * -886740031 - 1;
				}
				local152 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local152 == 255) {
					while (arg0 <= arg2) {
						local167 = arg1 >> 16;
						if (local167 >= this.anInt273 * 1850088287 && local167 < this.anInt274 * 2066290591) {
							this.anIntArray39[this.anInt287 * -355627019 * local167 + arg0] = arg4;
						}
						arg1 += local109;
						arg0++;
					}
				} else if (arg5 == 1) {
					local224 = (local152 << 24) + ((arg4 & 0xFF00FF) * local152 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local152 >> 8 & 0xFF00);
					local167 = 256 - local152;
					while (arg0 <= arg2) {
						local235 = arg1 >> 16;
						if (local235 >= this.anInt273 * 1850088287 && local235 < this.anInt274 * 2066290591) {
							local256 = this.anInt287 * -355627019 * local235 + arg0;
							local261 = this.anIntArray39[local256];
							@Pc(281) int local281 = (local167 * (local261 & 0xFF00) >> 8 & 0xFF00) + ((local261 & 0xFF00FF) * local167 >> 8 & 0xFF00FF);
							this.anIntArray39[local256] = local224 + local281;
						}
						arg1 += local109;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local167 = arg1 >> 16;
						if (local167 >= this.anInt273 * 1850088287 && local167 < this.anInt274 * 2066290591) {
							local235 = this.anInt287 * -355627019 * local167 + arg0;
							local256 = this.anIntArray39[local235];
							local261 = local256 + arg4;
							local343 = (arg4 & 0xFF00FF) + (local256 & 0xFF00FF);
							local256 = (local261 - local343 & 0x10000) + (local343 & 0x1000100);
							this.anIntArray39[local235] = local261 - local256 | local256 - (local256 >>> 8);
						}
						arg1 += local109;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(389) int local389 = arg2 << 16;
				local109 = (int) Math.floor((double) local389 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt273 * 1850088287) {
					arg0 += (this.anInt273 * 1850088287 - arg1) * local109;
					arg1 = this.anInt273 * 1850088287;
				}
				if (arg3 >= this.anInt274 * 2066290591) {
					arg3 = this.anInt274 * 2066290591 - 1;
				}
				local152 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local152 == 255) {
					while (arg1 <= arg3) {
						local167 = arg0 >> 16;
						if (local167 >= this.anInt272 * 45613833 && local167 < this.anInt278 * -886740031) {
							this.anIntArray39[arg1 * -355627019 * this.anInt287 + local167] = arg4;
						}
						arg0 += local109;
						arg1++;
					}
				} else if (arg5 == 1) {
					local224 = (local152 << 24) + ((arg4 & 0xFF00FF) * local152 >> 8 & 0xFF00FF) + (local152 * (arg4 & 0xFF00) >> 8 & 0xFF00);
					local167 = 256 - local152;
					while (arg1 <= arg3) {
						local235 = arg0 >> 16;
						if (local235 >= this.anInt272 * 45613833 && local235 < this.anInt278 * -886740031) {
							local256 = this.anInt287 * -355627019 * arg1 + local235;
							local261 = this.anIntArray39[local256];
							local261 = ((local261 & 0xFF00FF) * local167 >> 8 & 0xFF00FF) + ((local261 & 0xFF00) * local167 >> 8 & 0xFF00);
							this.anIntArray39[local235 + arg1 * this.anInt287 * -355627019] = local261 + local224;
						}
						arg0 += local109;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local167 = arg0 >> 16;
						if (local167 >= this.anInt272 * 45613833 && local167 < this.anInt278 * -886740031) {
							local235 = arg1 * this.anInt287 * -355627019 + local167;
							local256 = this.anIntArray39[local235];
							local261 = local256 + arg4;
							local343 = (arg4 & 0xFF00FF) + (local256 & 0xFF00FF);
							local256 = (local343 & 0x1000100) + (local261 - local343 & 0x10000);
							this.anIntArray39[local235] = local261 - local256 | local256 - (local256 >>> 8);
						}
						arg0 += local109;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method17073(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.method17073(arg0, arg3 + arg1, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!abl", name = "gb", descriptor = "(IIIIII)V", line = 792)
	@Override
	public void method17216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.anIntArray39 == null) {
			return;
		}
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method17072(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.method17072(arg2 + arg0, arg1, -arg2 + 1, arg4, arg5);
			}
		} else if (arg2 != 0) {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(109) int local109;
			@Pc(152) int local152;
			@Pc(167) int local167;
			@Pc(235) int local235;
			@Pc(256) int local256;
			@Pc(261) int local261;
			@Pc(343) int local343;
			@Pc(224) int local224;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(99) int local99 = arg3 << 16;
				local109 = (int) Math.floor((double) local99 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt272 * 45613833) {
					arg1 += (this.anInt272 * 45613833 - arg0) * local109;
					arg0 = this.anInt272 * 45613833;
				}
				if (arg2 >= this.anInt278 * -886740031) {
					arg2 = this.anInt278 * -886740031 - 1;
				}
				local152 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local152 == 255) {
					while (arg0 <= arg2) {
						local167 = arg1 >> 16;
						if (local167 >= this.anInt273 * 1850088287 && local167 < this.anInt274 * 2066290591) {
							this.anIntArray39[this.anInt287 * -355627019 * local167 + arg0] = arg4;
						}
						arg1 += local109;
						arg0++;
					}
				} else if (arg5 == 1) {
					local224 = (local152 << 24) + ((arg4 & 0xFF00FF) * local152 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local152 >> 8 & 0xFF00);
					local167 = 256 - local152;
					while (arg0 <= arg2) {
						local235 = arg1 >> 16;
						if (local235 >= this.anInt273 * 1850088287 && local235 < this.anInt274 * 2066290591) {
							local256 = this.anInt287 * -355627019 * local235 + arg0;
							local261 = this.anIntArray39[local256];
							@Pc(281) int local281 = (local167 * (local261 & 0xFF00) >> 8 & 0xFF00) + ((local261 & 0xFF00FF) * local167 >> 8 & 0xFF00FF);
							this.anIntArray39[local256] = local224 + local281;
						}
						arg1 += local109;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local167 = arg1 >> 16;
						if (local167 >= this.anInt273 * 1850088287 && local167 < this.anInt274 * 2066290591) {
							local235 = this.anInt287 * -355627019 * local167 + arg0;
							local256 = this.anIntArray39[local235];
							local261 = local256 + arg4;
							local343 = (arg4 & 0xFF00FF) + (local256 & 0xFF00FF);
							local256 = (local261 - local343 & 0x10000) + (local343 & 0x1000100);
							this.anIntArray39[local235] = local261 - local256 | local256 - (local256 >>> 8);
						}
						arg1 += local109;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(389) int local389 = arg2 << 16;
				local109 = (int) Math.floor((double) local389 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt273 * 1850088287) {
					arg0 += (this.anInt273 * 1850088287 - arg1) * local109;
					arg1 = this.anInt273 * 1850088287;
				}
				if (arg3 >= this.anInt274 * 2066290591) {
					arg3 = this.anInt274 * 2066290591 - 1;
				}
				local152 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local152 == 255) {
					while (arg1 <= arg3) {
						local167 = arg0 >> 16;
						if (local167 >= this.anInt272 * 45613833 && local167 < this.anInt278 * -886740031) {
							this.anIntArray39[arg1 * -355627019 * this.anInt287 + local167] = arg4;
						}
						arg0 += local109;
						arg1++;
					}
				} else if (arg5 == 1) {
					local224 = (local152 << 24) + ((arg4 & 0xFF00FF) * local152 >> 8 & 0xFF00FF) + (local152 * (arg4 & 0xFF00) >> 8 & 0xFF00);
					local167 = 256 - local152;
					while (arg1 <= arg3) {
						local235 = arg0 >> 16;
						if (local235 >= this.anInt272 * 45613833 && local235 < this.anInt278 * -886740031) {
							local256 = this.anInt287 * -355627019 * arg1 + local235;
							local261 = this.anIntArray39[local256];
							local261 = ((local261 & 0xFF00FF) * local167 >> 8 & 0xFF00FF) + ((local261 & 0xFF00) * local167 >> 8 & 0xFF00);
							this.anIntArray39[local235 + arg1 * this.anInt287 * -355627019] = local261 + local224;
						}
						arg0 += local109;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local167 = arg0 >> 16;
						if (local167 >= this.anInt272 * 45613833 && local167 < this.anInt278 * -886740031) {
							local235 = arg1 * this.anInt287 * -355627019 + local167;
							local256 = this.anIntArray39[local235];
							local261 = local256 + arg4;
							local343 = (arg4 & 0xFF00FF) + (local256 & 0xFF00FF);
							local256 = (local343 & 0x1000100) + (local261 - local343 & 0x10000);
							this.anIntArray39[local235] = local261 - local256 | local256 - (local256 >>> 8);
						}
						arg0 += local109;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method17073(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.method17073(arg0, arg3 + arg1, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!abl", name = "bl", descriptor = "(IIIIIIIII)V", line = 918)
	@Override
	public void method17076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anIntArray39 == null) {
			return;
		}
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(34) int local34;
		@Pc(38) int local38;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method3161(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7, arg8);
			} else {
				local34 = arg6 + arg7;
				local38 = arg8 % local34;
				local38 = local34 + arg6 - local38 - (-arg2 + 1) % local34;
				arg8 = local38 % local34;
				if (arg8 < 0) {
					arg8 += local34;
				}
				this.method3161(arg2 + arg0, arg1, -arg2 + 1, arg4, arg5, arg6, arg7, arg8);
			}
		} else if (arg2 != 0) {
			local38 = arg8 << 8;
			@Pc(149) int local149 = arg6 << 8;
			@Pc(153) int local153 = arg7 << 8;
			local34 = local149 + local153;
			arg8 = local38 % local34;
			@Pc(178) int local178;
			@Pc(182) int local182;
			if (arg2 + arg3 < 0) {
				local178 = (int) (Math.sqrt((double) (arg3 * arg3 + arg2 * arg2)) * 256.0D);
				local182 = local178 % local34;
				local38 = local149 + local34 - arg8 - local182;
				arg8 = local38 % local34;
				if (arg8 < 0) {
					arg8 += local34;
				}
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(260) int local260;
			@Pc(275) int local275;
			@Pc(366) int local366;
			@Pc(402) int local402;
			@Pc(407) int local407;
			@Pc(512) int local512;
			@Pc(243) int local243;
			@Pc(229) int local229;
			@Pc(355) int local355;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				local229 = arg3 << 16;
				local178 = (int) Math.floor((double) local229 / (double) arg2 + 0.5D);
				local243 = arg2 + arg0;
				local182 = arg4 >>> 24;
				local260 = (int) Math.sqrt((double) ((local178 >> 8) * (local178 >> 8) + 65536));
				if (arg5 == 0 || arg5 == 1 && local182 == 255) {
					while (arg0 <= local243) {
						local275 = arg1 >> 16;
						if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local275 >= this.anInt273 * 1850088287 && local275 < this.anInt274 * 2066290591 && arg8 < local149) {
							this.anIntArray39[arg0 + local275 * this.anInt287 * -355627019] = arg4;
						}
						arg1 += local178;
						arg0++;
						local38 = arg8 + local260;
						arg8 = local38 % local34;
					}
				} else if (arg5 == 1) {
					local355 = (local182 << 24) + ((arg4 & 0xFF00FF) * local182 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local182 >> 8 & 0xFF00);
					local275 = 256 - local182;
					while (arg0 <= local243) {
						local366 = arg1 >> 16;
						if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local366 >= this.anInt273 * 1850088287 && local366 < this.anInt274 * 2066290591 && arg8 < local149) {
							local402 = arg0 + this.anInt287 * -355627019 * local366;
							local407 = this.anIntArray39[local402];
							@Pc(427) int local427 = (local275 * (local407 & 0xFF00) >> 8 & 0xFF00) + ((local407 & 0xFF00FF) * local275 >> 8 & 0xFF00FF);
							this.anIntArray39[local402] = local427 + local355;
						}
						arg1 += local178;
						arg0++;
						local38 = arg8 + local260;
						arg8 = local38 % local34;
					}
				} else if (arg5 == 2) {
					while (arg0 <= local243) {
						local275 = arg1 >> 16;
						if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local275 >= this.anInt273 * 1850088287 && local275 < this.anInt274 * 2066290591 && arg8 < local149) {
							local366 = arg0 + this.anInt287 * -355627019 * local275;
							local402 = this.anIntArray39[local366];
							local407 = local402 + arg4;
							local512 = (arg4 & 0xFF00FF) + (local402 & 0xFF00FF);
							local402 = (local407 - local512 & 0x10000) + (local512 & 0x1000100);
							this.anIntArray39[local366] = local407 - local402 | local402 - (local402 >>> 8);
						}
						arg1 += local178;
						arg0++;
						local38 = arg8 + local260;
						arg8 = local38 % local34;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				local243 = arg2 << 16;
				local178 = (int) Math.floor((double) local243 / (double) arg3 + 0.5D);
				local229 = arg3 + arg1;
				local182 = arg4 >>> 24;
				local260 = (int) Math.sqrt((double) ((local178 >> 8) * (local178 >> 8) + 65536));
				if (arg5 == 0 || arg5 == 1 && local182 == 255) {
					while (arg1 <= local229) {
						local275 = arg0 >> 16;
						if (arg1 >= this.anInt273 * 1850088287 && arg1 < this.anInt274 * 2066290591 && local275 >= this.anInt272 * 45613833 && local275 < this.anInt278 * -886740031 && arg8 < local149) {
							this.anIntArray39[this.anInt287 * -355627019 * arg1 + local275] = arg4;
						}
						arg0 += local178;
						arg1++;
						local38 = arg8 + local260;
						arg8 = local38 % local34;
					}
				} else if (arg5 == 1) {
					local355 = ((arg4 & 0xFF00) * local182 >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * local182 >> 8 & 0xFF00FF) + (local182 << 24);
					local275 = 256 - local182;
					while (arg1 <= local229) {
						local366 = arg0 >> 16;
						if (arg1 >= this.anInt273 * 1850088287 && arg1 < this.anInt274 * 2066290591 && local366 >= this.anInt272 * 45613833 && local366 < this.anInt278 * -886740031 && arg8 < local149) {
							local402 = this.anInt287 * -355627019 * arg1 + local366;
							local407 = this.anIntArray39[local402];
							local407 = ((local407 & 0xFF00) * local275 >> 8 & 0xFF00) + (local275 * (local407 & 0xFF00FF) >> 8 & 0xFF00FF);
							this.anIntArray39[this.anInt287 * -355627019 * arg1 + local366] = local355 + local407;
						}
						arg0 += local178;
						arg1++;
						local38 = arg8 + local260;
						arg8 = local38 % local34;
					}
				} else if (arg5 == 2) {
					while (arg1 <= local229) {
						local275 = arg0 >> 16;
						if (arg1 >= this.anInt273 * 1850088287 && arg1 < this.anInt274 * 2066290591 && local275 >= this.anInt272 * 45613833 && local275 < this.anInt278 * -886740031 && arg8 < local149) {
							local366 = arg1 * -355627019 * this.anInt287 + local275;
							local402 = this.anIntArray39[local366];
							local407 = local402 + arg4;
							local512 = (local402 & 0xFF00FF) + (arg4 & 0xFF00FF);
							local402 = (local512 & 0x1000100) + (local407 - local512 & 0x10000);
							this.anIntArray39[local366] = local407 - local402 | local402 - (local402 >>> 8);
						}
						arg0 += local178;
						arg1++;
						local38 = arg8 + local260;
						arg8 = local38 % local34;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method3162(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7, arg8);
		} else {
			local34 = arg7 + arg6;
			local38 = arg8 % local34;
			local38 = local34 + arg6 - local38 - (-arg3 + 1) % local34;
			arg8 = local38 % local34;
			if (arg8 < 0) {
				arg8 += local34;
			}
			this.method3162(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!abl", name = "gl", descriptor = "(IIIIIIIII)V", line = 918)
	@Override
	public void method17304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anIntArray39 == null) {
			return;
		}
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(34) int local34;
		@Pc(38) int local38;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method3161(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7, arg8);
			} else {
				local34 = arg6 + arg7;
				local38 = arg8 % local34;
				local38 = local34 + arg6 - local38 - (-arg2 + 1) % local34;
				arg8 = local38 % local34;
				if (arg8 < 0) {
					arg8 += local34;
				}
				this.method3161(arg2 + arg0, arg1, -arg2 + 1, arg4, arg5, arg6, arg7, arg8);
			}
		} else if (arg2 != 0) {
			local38 = arg8 << 8;
			@Pc(149) int local149 = arg6 << 8;
			@Pc(153) int local153 = arg7 << 8;
			local34 = local149 + local153;
			arg8 = local38 % local34;
			@Pc(178) int local178;
			@Pc(182) int local182;
			if (arg2 + arg3 < 0) {
				local178 = (int) (Math.sqrt((double) (arg3 * arg3 + arg2 * arg2)) * 256.0D);
				local182 = local178 % local34;
				local38 = local149 + local34 - arg8 - local182;
				arg8 = local38 % local34;
				if (arg8 < 0) {
					arg8 += local34;
				}
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(260) int local260;
			@Pc(275) int local275;
			@Pc(366) int local366;
			@Pc(402) int local402;
			@Pc(407) int local407;
			@Pc(512) int local512;
			@Pc(243) int local243;
			@Pc(229) int local229;
			@Pc(355) int local355;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				local229 = arg3 << 16;
				local178 = (int) Math.floor((double) local229 / (double) arg2 + 0.5D);
				local243 = arg2 + arg0;
				local182 = arg4 >>> 24;
				local260 = (int) Math.sqrt((double) ((local178 >> 8) * (local178 >> 8) + 65536));
				if (arg5 == 0 || arg5 == 1 && local182 == 255) {
					while (arg0 <= local243) {
						local275 = arg1 >> 16;
						if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local275 >= this.anInt273 * 1850088287 && local275 < this.anInt274 * 2066290591 && arg8 < local149) {
							this.anIntArray39[arg0 + local275 * this.anInt287 * -355627019] = arg4;
						}
						arg1 += local178;
						arg0++;
						local38 = arg8 + local260;
						arg8 = local38 % local34;
					}
				} else if (arg5 == 1) {
					local355 = (local182 << 24) + ((arg4 & 0xFF00FF) * local182 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local182 >> 8 & 0xFF00);
					local275 = 256 - local182;
					while (arg0 <= local243) {
						local366 = arg1 >> 16;
						if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local366 >= this.anInt273 * 1850088287 && local366 < this.anInt274 * 2066290591 && arg8 < local149) {
							local402 = arg0 + this.anInt287 * -355627019 * local366;
							local407 = this.anIntArray39[local402];
							@Pc(427) int local427 = (local275 * (local407 & 0xFF00) >> 8 & 0xFF00) + ((local407 & 0xFF00FF) * local275 >> 8 & 0xFF00FF);
							this.anIntArray39[local402] = local427 + local355;
						}
						arg1 += local178;
						arg0++;
						local38 = arg8 + local260;
						arg8 = local38 % local34;
					}
				} else if (arg5 == 2) {
					while (arg0 <= local243) {
						local275 = arg1 >> 16;
						if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local275 >= this.anInt273 * 1850088287 && local275 < this.anInt274 * 2066290591 && arg8 < local149) {
							local366 = arg0 + this.anInt287 * -355627019 * local275;
							local402 = this.anIntArray39[local366];
							local407 = local402 + arg4;
							local512 = (arg4 & 0xFF00FF) + (local402 & 0xFF00FF);
							local402 = (local407 - local512 & 0x10000) + (local512 & 0x1000100);
							this.anIntArray39[local366] = local407 - local402 | local402 - (local402 >>> 8);
						}
						arg1 += local178;
						arg0++;
						local38 = arg8 + local260;
						arg8 = local38 % local34;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				local243 = arg2 << 16;
				local178 = (int) Math.floor((double) local243 / (double) arg3 + 0.5D);
				local229 = arg3 + arg1;
				local182 = arg4 >>> 24;
				local260 = (int) Math.sqrt((double) ((local178 >> 8) * (local178 >> 8) + 65536));
				if (arg5 == 0 || arg5 == 1 && local182 == 255) {
					while (arg1 <= local229) {
						local275 = arg0 >> 16;
						if (arg1 >= this.anInt273 * 1850088287 && arg1 < this.anInt274 * 2066290591 && local275 >= this.anInt272 * 45613833 && local275 < this.anInt278 * -886740031 && arg8 < local149) {
							this.anIntArray39[this.anInt287 * -355627019 * arg1 + local275] = arg4;
						}
						arg0 += local178;
						arg1++;
						local38 = arg8 + local260;
						arg8 = local38 % local34;
					}
				} else if (arg5 == 1) {
					local355 = ((arg4 & 0xFF00) * local182 >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * local182 >> 8 & 0xFF00FF) + (local182 << 24);
					local275 = 256 - local182;
					while (arg1 <= local229) {
						local366 = arg0 >> 16;
						if (arg1 >= this.anInt273 * 1850088287 && arg1 < this.anInt274 * 2066290591 && local366 >= this.anInt272 * 45613833 && local366 < this.anInt278 * -886740031 && arg8 < local149) {
							local402 = this.anInt287 * -355627019 * arg1 + local366;
							local407 = this.anIntArray39[local402];
							local407 = ((local407 & 0xFF00) * local275 >> 8 & 0xFF00) + (local275 * (local407 & 0xFF00FF) >> 8 & 0xFF00FF);
							this.anIntArray39[this.anInt287 * -355627019 * arg1 + local366] = local355 + local407;
						}
						arg0 += local178;
						arg1++;
						local38 = arg8 + local260;
						arg8 = local38 % local34;
					}
				} else if (arg5 == 2) {
					while (arg1 <= local229) {
						local275 = arg0 >> 16;
						if (arg1 >= this.anInt273 * 1850088287 && arg1 < this.anInt274 * 2066290591 && local275 >= this.anInt272 * 45613833 && local275 < this.anInt278 * -886740031 && arg8 < local149) {
							local366 = arg1 * -355627019 * this.anInt287 + local275;
							local402 = this.anIntArray39[local366];
							local407 = local402 + arg4;
							local512 = (local402 & 0xFF00FF) + (arg4 & 0xFF00FF);
							local402 = (local512 & 0x1000100) + (local407 - local512 & 0x10000);
							this.anIntArray39[local366] = local407 - local402 | local402 - (local402 >>> 8);
						}
						arg0 += local178;
						arg1++;
						local38 = arg8 + local260;
						arg8 = local38 % local34;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method3162(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7, arg8);
		} else {
			local34 = arg7 + arg6;
			local38 = arg8 % local34;
			local38 = local34 + arg6 - local38 - (-arg3 + 1) % local34;
			arg8 = local38 % local34;
			if (arg8 < 0) {
				arg8 += local34;
			}
			this.method3162(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!abl", name = "by", descriptor = "(IIIIIILclient!ch;II)V", line = 1072)
	@Override
	public void method17283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(6) Class5_Sub3 local6 = (Class5_Sub3) arg6;
		@Pc(9) int[] local9 = local6.anIntArray11;
		@Pc(12) int[] local12 = local6.anIntArray12;
		@Pc(25) int local25 = this.anInt273 * 1850088287 > arg8 ? this.anInt273 * 1850088287 : arg8;
		@Pc(44) int local44 = this.anInt274 * 2066290591 < local9.length + arg8 ? this.anInt274 * 2066290591 : arg8 + local9.length;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 + arg2 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(95) int local95;
		@Pc(138) int local138;
		@Pc(153) int local153;
		@Pc(157) int local157;
		@Pc(169) int local169;
		@Pc(251) int local251;
		@Pc(270) int local270;
		@Pc(275) int local275;
		@Pc(371) int local371;
		@Pc(224) int local224;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			@Pc(417) int local417 = arg2 << 16;
			local95 = (int) Math.floor((double) local417 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < local25) {
				arg0 += local95 * (local25 - arg1);
				arg1 = local25;
			}
			if (arg3 >= local44) {
				arg3 = local44 - 1;
			}
			local138 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && local138 == 255) {
				while (arg1 <= arg3) {
					local153 = arg0 >> 16;
					local157 = arg1 - arg8;
					local169 = arg7 + local9[local157];
					if (local153 >= this.anInt272 * 45613833 && local153 < this.anInt278 * -886740031 && local153 >= local169 && local153 < local169 + local12[local157]) {
						this.anIntArray39[arg1 * this.anInt287 * -355627019 + local153] = arg4;
					}
					arg0 += local95;
					arg1++;
				}
			} else if (arg5 == 1) {
				local224 = (local138 << 24) + ((arg4 & 0xFF00FF) * local138 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local138 >> 8 & 0xFF00);
				local153 = 256 - local138;
				while (arg1 <= arg3) {
					local157 = arg0 >> 16;
					local169 = arg1 - arg8;
					local251 = arg7 + local9[local169];
					if (local157 >= this.anInt272 * 45613833 && local157 < this.anInt278 * -886740031 && local157 >= local251 && local157 < local12[local169] + local251) {
						local270 = this.anInt287 * -355627019 * arg1 + local157;
						local275 = this.anIntArray39[local270];
						local275 = ((local275 & 0xFF00) * local153 >> 8 & 0xFF00) + (local153 * (local275 & 0xFF00FF) >> 8 & 0xFF00FF);
						this.anIntArray39[local157 + arg1 * -355627019 * this.anInt287] = local224 + local275;
					}
					arg0 += local95;
					arg1++;
				}
			} else if (arg5 == 2) {
				while (arg1 <= arg3) {
					local153 = arg0 >> 16;
					local157 = arg1 - arg8;
					local169 = local9[local157] + arg7;
					if (local153 >= this.anInt272 * 45613833 && local153 < this.anInt278 * -886740031 && local153 >= local169 && local153 < local12[local157] + local169) {
						local251 = local153 + this.anInt287 * -355627019 * arg1;
						local270 = this.anIntArray39[local251];
						local275 = arg4 + local270;
						local371 = (local270 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local270 = (local275 - local371 & 0x10000) + (local371 & 0x1000100);
						this.anIntArray39[local251] = local275 - local270 | local270 - (local270 >>> 8);
					}
					arg0 += local95;
					arg1++;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		@Pc(85) int local85 = arg3 << 16;
		local95 = (int) Math.floor((double) local85 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt272 * 45613833) {
			arg1 += local95 * (this.anInt272 * 45613833 - arg0);
			arg0 = this.anInt272 * 45613833;
		}
		if (arg2 >= this.anInt278 * -886740031) {
			arg2 = this.anInt278 * -886740031 - 1;
		}
		local138 = arg4 >>> 24;
		if (arg5 == 0 || arg5 == 1 && local138 == 255) {
			while (arg0 <= arg2) {
				local153 = arg1 >> 16;
				local157 = local153 - arg8;
				if (local153 >= local25 && local153 < local44) {
					local169 = arg7 + local9[local157];
					if (arg0 >= local169 && arg0 < local12[local157] + local169) {
						this.anIntArray39[this.anInt287 * -355627019 * local153 + arg0] = arg4;
					}
				}
				arg1 += local95;
				arg0++;
			}
		} else if (arg5 == 1) {
			local224 = (local138 << 24) + (local138 * (arg4 & 0xFF00) >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * local138 >> 8 & 0xFF00FF);
			local153 = 256 - local138;
			while (arg0 <= arg2) {
				local157 = arg1 >> 16;
				local169 = local157 - arg8;
				if (local157 >= local25 && local157 < local44) {
					local251 = arg7 + local9[local169];
					if (arg0 >= local251 && arg0 < local12[local169] + local251) {
						local270 = arg0 + this.anInt287 * -355627019 * local157;
						local275 = this.anIntArray39[local270];
						@Pc(295) int local295 = ((local275 & 0xFF00) * local153 >> 8 & 0xFF00) + (local153 * (local275 & 0xFF00FF) >> 8 & 0xFF00FF);
						this.anIntArray39[local270] = local295 + local224;
					}
				}
				arg1 += local95;
				arg0++;
			}
		} else if (arg5 == 2) {
			while (arg0 <= arg2) {
				local153 = arg1 >> 16;
				local157 = local153 - arg8;
				if (local153 >= local25 && local153 < local44) {
					local169 = arg7 + local9[local157];
					if (arg0 >= local169 && arg0 < local169 + local12[local157]) {
						local251 = local153 * -355627019 * this.anInt287 + arg0;
						local270 = this.anIntArray39[local251];
						local275 = arg4 + local270;
						local371 = (local270 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local270 = (local371 & 0x1000100) + (local275 - local371 & 0x10000);
						this.anIntArray39[local251] = local275 - local270 | local270 - (local270 >>> 8);
					}
				}
				arg1 += local95;
				arg0++;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "gu", descriptor = "(IIIIIILclient!ch;II)V", line = 1072)
	@Override
	public void method17337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(6) Class5_Sub3 local6 = (Class5_Sub3) arg6;
		@Pc(9) int[] local9 = local6.anIntArray11;
		@Pc(12) int[] local12 = local6.anIntArray12;
		@Pc(25) int local25 = this.anInt273 * 1850088287 > arg8 ? this.anInt273 * 1850088287 : arg8;
		@Pc(44) int local44 = this.anInt274 * 2066290591 < local9.length + arg8 ? this.anInt274 * 2066290591 : arg8 + local9.length;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 + arg2 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(95) int local95;
		@Pc(138) int local138;
		@Pc(153) int local153;
		@Pc(157) int local157;
		@Pc(169) int local169;
		@Pc(251) int local251;
		@Pc(270) int local270;
		@Pc(275) int local275;
		@Pc(371) int local371;
		@Pc(224) int local224;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			@Pc(417) int local417 = arg2 << 16;
			local95 = (int) Math.floor((double) local417 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < local25) {
				arg0 += local95 * (local25 - arg1);
				arg1 = local25;
			}
			if (arg3 >= local44) {
				arg3 = local44 - 1;
			}
			local138 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && local138 == 255) {
				while (arg1 <= arg3) {
					local153 = arg0 >> 16;
					local157 = arg1 - arg8;
					local169 = arg7 + local9[local157];
					if (local153 >= this.anInt272 * 45613833 && local153 < this.anInt278 * -886740031 && local153 >= local169 && local153 < local169 + local12[local157]) {
						this.anIntArray39[arg1 * this.anInt287 * -355627019 + local153] = arg4;
					}
					arg0 += local95;
					arg1++;
				}
			} else if (arg5 == 1) {
				local224 = (local138 << 24) + ((arg4 & 0xFF00FF) * local138 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local138 >> 8 & 0xFF00);
				local153 = 256 - local138;
				while (arg1 <= arg3) {
					local157 = arg0 >> 16;
					local169 = arg1 - arg8;
					local251 = arg7 + local9[local169];
					if (local157 >= this.anInt272 * 45613833 && local157 < this.anInt278 * -886740031 && local157 >= local251 && local157 < local12[local169] + local251) {
						local270 = this.anInt287 * -355627019 * arg1 + local157;
						local275 = this.anIntArray39[local270];
						local275 = ((local275 & 0xFF00) * local153 >> 8 & 0xFF00) + (local153 * (local275 & 0xFF00FF) >> 8 & 0xFF00FF);
						this.anIntArray39[local157 + arg1 * -355627019 * this.anInt287] = local224 + local275;
					}
					arg0 += local95;
					arg1++;
				}
			} else if (arg5 == 2) {
				while (arg1 <= arg3) {
					local153 = arg0 >> 16;
					local157 = arg1 - arg8;
					local169 = local9[local157] + arg7;
					if (local153 >= this.anInt272 * 45613833 && local153 < this.anInt278 * -886740031 && local153 >= local169 && local153 < local12[local157] + local169) {
						local251 = local153 + this.anInt287 * -355627019 * arg1;
						local270 = this.anIntArray39[local251];
						local275 = arg4 + local270;
						local371 = (local270 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local270 = (local275 - local371 & 0x10000) + (local371 & 0x1000100);
						this.anIntArray39[local251] = local275 - local270 | local270 - (local270 >>> 8);
					}
					arg0 += local95;
					arg1++;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		@Pc(85) int local85 = arg3 << 16;
		local95 = (int) Math.floor((double) local85 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt272 * 45613833) {
			arg1 += local95 * (this.anInt272 * 45613833 - arg0);
			arg0 = this.anInt272 * 45613833;
		}
		if (arg2 >= this.anInt278 * -886740031) {
			arg2 = this.anInt278 * -886740031 - 1;
		}
		local138 = arg4 >>> 24;
		if (arg5 == 0 || arg5 == 1 && local138 == 255) {
			while (arg0 <= arg2) {
				local153 = arg1 >> 16;
				local157 = local153 - arg8;
				if (local153 >= local25 && local153 < local44) {
					local169 = arg7 + local9[local157];
					if (arg0 >= local169 && arg0 < local12[local157] + local169) {
						this.anIntArray39[this.anInt287 * -355627019 * local153 + arg0] = arg4;
					}
				}
				arg1 += local95;
				arg0++;
			}
		} else if (arg5 == 1) {
			local224 = (local138 << 24) + (local138 * (arg4 & 0xFF00) >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * local138 >> 8 & 0xFF00FF);
			local153 = 256 - local138;
			while (arg0 <= arg2) {
				local157 = arg1 >> 16;
				local169 = local157 - arg8;
				if (local157 >= local25 && local157 < local44) {
					local251 = arg7 + local9[local169];
					if (arg0 >= local251 && arg0 < local12[local169] + local251) {
						local270 = arg0 + this.anInt287 * -355627019 * local157;
						local275 = this.anIntArray39[local270];
						@Pc(295) int local295 = ((local275 & 0xFF00) * local153 >> 8 & 0xFF00) + (local153 * (local275 & 0xFF00FF) >> 8 & 0xFF00FF);
						this.anIntArray39[local270] = local295 + local224;
					}
				}
				arg1 += local95;
				arg0++;
			}
		} else if (arg5 == 2) {
			while (arg0 <= arg2) {
				local153 = arg1 >> 16;
				local157 = local153 - arg8;
				if (local153 >= local25 && local153 < local44) {
					local169 = arg7 + local9[local157];
					if (arg0 >= local169 && arg0 < local169 + local12[local157]) {
						local251 = local153 * -355627019 * this.anInt287 + arg0;
						local270 = this.anIntArray39[local251];
						local275 = arg4 + local270;
						local371 = (local270 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local270 = (local371 & 0x1000100) + (local275 - local371 & 0x10000);
						this.anIntArray39[local251] = local275 - local270 | local270 - (local270 >>> 8);
					}
				}
				arg1 += local95;
				arg0++;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "gg", descriptor = "(IIIIIILclient!ch;II)V", line = 1072)
	@Override
	public void method17058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(6) Class5_Sub3 local6 = (Class5_Sub3) arg6;
		@Pc(9) int[] local9 = local6.anIntArray11;
		@Pc(12) int[] local12 = local6.anIntArray12;
		@Pc(25) int local25 = this.anInt273 * 1850088287 > arg8 ? this.anInt273 * 1850088287 : arg8;
		@Pc(44) int local44 = this.anInt274 * 2066290591 < local9.length + arg8 ? this.anInt274 * 2066290591 : arg8 + local9.length;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 + arg2 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(95) int local95;
		@Pc(138) int local138;
		@Pc(153) int local153;
		@Pc(157) int local157;
		@Pc(169) int local169;
		@Pc(251) int local251;
		@Pc(270) int local270;
		@Pc(275) int local275;
		@Pc(371) int local371;
		@Pc(224) int local224;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			@Pc(417) int local417 = arg2 << 16;
			local95 = (int) Math.floor((double) local417 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < local25) {
				arg0 += local95 * (local25 - arg1);
				arg1 = local25;
			}
			if (arg3 >= local44) {
				arg3 = local44 - 1;
			}
			local138 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && local138 == 255) {
				while (arg1 <= arg3) {
					local153 = arg0 >> 16;
					local157 = arg1 - arg8;
					local169 = arg7 + local9[local157];
					if (local153 >= this.anInt272 * 45613833 && local153 < this.anInt278 * -886740031 && local153 >= local169 && local153 < local169 + local12[local157]) {
						this.anIntArray39[arg1 * this.anInt287 * -355627019 + local153] = arg4;
					}
					arg0 += local95;
					arg1++;
				}
			} else if (arg5 == 1) {
				local224 = (local138 << 24) + ((arg4 & 0xFF00FF) * local138 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local138 >> 8 & 0xFF00);
				local153 = 256 - local138;
				while (arg1 <= arg3) {
					local157 = arg0 >> 16;
					local169 = arg1 - arg8;
					local251 = arg7 + local9[local169];
					if (local157 >= this.anInt272 * 45613833 && local157 < this.anInt278 * -886740031 && local157 >= local251 && local157 < local12[local169] + local251) {
						local270 = this.anInt287 * -355627019 * arg1 + local157;
						local275 = this.anIntArray39[local270];
						local275 = ((local275 & 0xFF00) * local153 >> 8 & 0xFF00) + (local153 * (local275 & 0xFF00FF) >> 8 & 0xFF00FF);
						this.anIntArray39[local157 + arg1 * -355627019 * this.anInt287] = local224 + local275;
					}
					arg0 += local95;
					arg1++;
				}
			} else if (arg5 == 2) {
				while (arg1 <= arg3) {
					local153 = arg0 >> 16;
					local157 = arg1 - arg8;
					local169 = local9[local157] + arg7;
					if (local153 >= this.anInt272 * 45613833 && local153 < this.anInt278 * -886740031 && local153 >= local169 && local153 < local12[local157] + local169) {
						local251 = local153 + this.anInt287 * -355627019 * arg1;
						local270 = this.anIntArray39[local251];
						local275 = arg4 + local270;
						local371 = (local270 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local270 = (local275 - local371 & 0x10000) + (local371 & 0x1000100);
						this.anIntArray39[local251] = local275 - local270 | local270 - (local270 >>> 8);
					}
					arg0 += local95;
					arg1++;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		@Pc(85) int local85 = arg3 << 16;
		local95 = (int) Math.floor((double) local85 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt272 * 45613833) {
			arg1 += local95 * (this.anInt272 * 45613833 - arg0);
			arg0 = this.anInt272 * 45613833;
		}
		if (arg2 >= this.anInt278 * -886740031) {
			arg2 = this.anInt278 * -886740031 - 1;
		}
		local138 = arg4 >>> 24;
		if (arg5 == 0 || arg5 == 1 && local138 == 255) {
			while (arg0 <= arg2) {
				local153 = arg1 >> 16;
				local157 = local153 - arg8;
				if (local153 >= local25 && local153 < local44) {
					local169 = arg7 + local9[local157];
					if (arg0 >= local169 && arg0 < local12[local157] + local169) {
						this.anIntArray39[this.anInt287 * -355627019 * local153 + arg0] = arg4;
					}
				}
				arg1 += local95;
				arg0++;
			}
		} else if (arg5 == 1) {
			local224 = (local138 << 24) + (local138 * (arg4 & 0xFF00) >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * local138 >> 8 & 0xFF00FF);
			local153 = 256 - local138;
			while (arg0 <= arg2) {
				local157 = arg1 >> 16;
				local169 = local157 - arg8;
				if (local157 >= local25 && local157 < local44) {
					local251 = arg7 + local9[local169];
					if (arg0 >= local251 && arg0 < local12[local169] + local251) {
						local270 = arg0 + this.anInt287 * -355627019 * local157;
						local275 = this.anIntArray39[local270];
						@Pc(295) int local295 = ((local275 & 0xFF00) * local153 >> 8 & 0xFF00) + (local153 * (local275 & 0xFF00FF) >> 8 & 0xFF00FF);
						this.anIntArray39[local270] = local295 + local224;
					}
				}
				arg1 += local95;
				arg0++;
			}
		} else if (arg5 == 2) {
			while (arg0 <= arg2) {
				local153 = arg1 >> 16;
				local157 = local153 - arg8;
				if (local153 >= local25 && local153 < local44) {
					local169 = arg7 + local9[local157];
					if (arg0 >= local169 && arg0 < local169 + local12[local157]) {
						local251 = local153 * -355627019 * this.anInt287 + arg0;
						local270 = this.anIntArray39[local251];
						local275 = arg4 + local270;
						local371 = (local270 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local270 = (local371 & 0x1000100) + (local275 - local371 & 0x10000);
						this.anIntArray39[local251] = local275 - local270 | local270 - (local270 >>> 8);
					}
				}
				arg1 += local95;
				arg0++;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "bi", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 1211)
	@Override
	public void method17077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(6) Class5_Sub3 local6 = (Class5_Sub3) arg6;
		@Pc(9) int[] local9 = local6.anIntArray11;
		@Pc(12) int[] local12 = local6.anIntArray12;
		@Pc(25) int local25 = this.anInt273 * 1850088287 > arg8 ? this.anInt273 * 1850088287 : arg8;
		@Pc(44) int local44 = this.anInt274 * 2066290591 < local9.length + arg8 ? this.anInt274 * 2066290591 : arg8 + local9.length;
		@Pc(48) int local48 = arg11 << 8;
		@Pc(52) int local52 = arg9 << 8;
		@Pc(56) int local56 = arg10 << 8;
		@Pc(60) int local60 = local52 + local56;
		arg11 = local48 % local60;
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(89) int local89;
		@Pc(93) int local93;
		if (arg3 + arg2 < 0) {
			local89 = (int) (Math.sqrt((double) (arg3 * arg3 + arg2 * arg2)) * 256.0D);
			local93 = local89 % local60;
			local48 = local60 + local52 - arg11 - local93;
			arg11 = local48 % local60;
			if (arg11 < 0) {
				arg11 += local60;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(171) int local171;
		@Pc(186) int local186;
		@Pc(190) int local190;
		@Pc(217) int local217;
		@Pc(322) int local322;
		@Pc(341) int local341;
		@Pc(346) int local346;
		@Pc(154) int local154;
		@Pc(140) int local140;
		@Pc(280) int local280;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			local154 = arg2 << 16;
			local89 = (int) Math.floor((double) local154 / (double) arg3 + 0.5D);
			local93 = (int) Math.sqrt((double) ((local89 >> 8) * (local89 >> 8) + 65536));
			local140 = arg3 + arg1;
			local171 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && local171 == 255) {
				while (arg1 <= local140) {
					local186 = arg0 >> 16;
					local190 = arg1 - arg8;
					if (arg1 >= local25 && arg1 < local44 && local186 >= this.anInt272 * 45613833 && local186 < this.anInt278 * -886740031 && arg11 < local52 && local186 >= arg7 + local9[local190] && local186 < arg7 + local9[local190] + local12[local190]) {
						this.anIntArray39[arg1 * this.anInt287 * -355627019 + local186] = arg4;
					}
					arg0 += local89;
					arg1++;
					local48 = arg11 + local93;
					arg11 = local48 % local60;
				}
			} else if (arg5 == 1) {
				local280 = ((arg4 & 0xFF00FF) * local171 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local171 >> 8 & 0xFF00) + (local171 << 24);
				local186 = 256 - local171;
				while (arg1 <= local140) {
					local190 = arg0 >> 16;
					local217 = arg1 - arg8;
					if (arg1 >= local25 && arg1 < local44 && local190 >= this.anInt272 * 45613833 && local190 < this.anInt278 * -886740031 && arg11 < local52 && local190 >= arg7 + local9[local217] && local190 < local9[local217] + arg7 + local12[local217]) {
						local322 = this.anInt287 * -355627019 * arg1 + local190;
						local341 = this.anIntArray39[local322];
						local341 = (local186 * (local341 & 0xFF00FF) >> 8 & 0xFF00FF) + ((local341 & 0xFF00) * local186 >> 8 & 0xFF00);
						this.anIntArray39[this.anInt287 * -355627019 * arg1 + local190] = local341 + local280;
					}
					arg0 += local89;
					arg1++;
					local48 = arg11 + local93;
					arg11 = local48 % local60;
				}
			} else if (arg5 == 2) {
				while (arg1 <= local140) {
					local186 = arg0 >> 16;
					local190 = arg1 - arg8;
					if (arg1 >= local25 && arg1 < local44 && local186 >= this.anInt272 * 45613833 && local186 < this.anInt278 * -886740031 && arg11 < local52 && local186 >= arg7 + local9[local190] && local186 < arg7 + local9[local190] + local12[local190]) {
						local217 = this.anInt287 * -355627019 * arg1 + local186;
						local322 = this.anIntArray39[local217];
						local341 = arg4 + local322;
						local346 = (local322 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local322 = (local346 & 0x1000100) + (local341 - local346 & 0x10000);
						this.anIntArray39[local217] = local341 - local322 | local322 - (local322 >>> 8);
					}
					arg0 += local89;
					arg1++;
					local48 = arg11 + local93;
					arg11 = local48 % local60;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		local140 = arg3 << 16;
		local89 = (int) Math.floor((double) local140 / (double) arg2 + 0.5D);
		local154 = arg2 + arg0;
		local93 = arg4 >>> 24;
		local171 = (int) Math.sqrt((double) ((local89 >> 8) * (local89 >> 8) + 65536));
		if (arg5 == 0 || arg5 == 1 && local93 == 255) {
			while (arg0 <= local154) {
				local186 = arg1 >> 16;
				local190 = local186 - arg8;
				if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local186 >= local25 && local186 < local44 && arg11 < local52) {
					local217 = local9[local190] + arg7;
					if (arg0 >= local217 && arg0 < local12[local190] + local217) {
						this.anIntArray39[arg0 + this.anInt287 * -355627019 * local186] = arg4;
					}
				}
				arg1 += local89;
				arg0++;
				local48 = arg11 + local171;
				arg11 = local48 % local60;
			}
		} else if (arg5 == 1) {
			local280 = (local93 << 24) + (local93 * (arg4 & 0xFF00) >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * local93 >> 8 & 0xFF00FF);
			local186 = 256 - local93;
			while (arg0 <= local154) {
				local190 = arg1 >> 16;
				local217 = local190 - arg8;
				if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local190 >= local25 && local190 < local44 && arg11 < local52) {
					local322 = local9[local217] + arg7;
					if (arg0 >= local322 && arg0 < local322 + local12[local217]) {
						local341 = local190 * this.anInt287 * -355627019 + arg0;
						local346 = this.anIntArray39[local341];
						@Pc(366) int local366 = ((local346 & 0xFF00) * local186 >> 8 & 0xFF00) + ((local346 & 0xFF00FF) * local186 >> 8 & 0xFF00FF);
						this.anIntArray39[local341] = local366 + local280;
					}
				}
				arg1 += local89;
				arg0++;
				local48 = arg11 + local171;
				arg11 = local48 % local60;
			}
		} else if (arg5 == 2) {
			while (arg0 <= local154) {
				local186 = arg1 >> 16;
				local190 = local186 - arg8;
				if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local186 >= local25 && local186 < local44 && arg11 < local52) {
					local217 = arg7 + local9[local190];
					if (arg0 >= local217 && arg0 < local12[local190] + local217) {
						local322 = this.anInt287 * -355627019 * local186 + arg0;
						local341 = this.anIntArray39[local322];
						local346 = arg4 + local341;
						@Pc(465) int local465 = (local341 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local341 = (local465 & 0x1000100) + (local346 - local465 & 0x10000);
						this.anIntArray39[local322] = local346 - local341 | local341 - (local341 >>> 8);
					}
				}
				arg1 += local89;
				arg0++;
				local48 = arg11 + local171;
				arg11 = local48 % local60;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "hk", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 1211)
	@Override
	public void method17116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(6) Class5_Sub3 local6 = (Class5_Sub3) arg6;
		@Pc(9) int[] local9 = local6.anIntArray11;
		@Pc(12) int[] local12 = local6.anIntArray12;
		@Pc(25) int local25 = this.anInt273 * 1850088287 > arg8 ? this.anInt273 * 1850088287 : arg8;
		@Pc(44) int local44 = this.anInt274 * 2066290591 < local9.length + arg8 ? this.anInt274 * 2066290591 : arg8 + local9.length;
		@Pc(48) int local48 = arg11 << 8;
		@Pc(52) int local52 = arg9 << 8;
		@Pc(56) int local56 = arg10 << 8;
		@Pc(60) int local60 = local52 + local56;
		arg11 = local48 % local60;
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(89) int local89;
		@Pc(93) int local93;
		if (arg3 + arg2 < 0) {
			local89 = (int) (Math.sqrt((double) (arg3 * arg3 + arg2 * arg2)) * 256.0D);
			local93 = local89 % local60;
			local48 = local60 + local52 - arg11 - local93;
			arg11 = local48 % local60;
			if (arg11 < 0) {
				arg11 += local60;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(171) int local171;
		@Pc(186) int local186;
		@Pc(190) int local190;
		@Pc(217) int local217;
		@Pc(322) int local322;
		@Pc(341) int local341;
		@Pc(346) int local346;
		@Pc(154) int local154;
		@Pc(140) int local140;
		@Pc(280) int local280;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			local154 = arg2 << 16;
			local89 = (int) Math.floor((double) local154 / (double) arg3 + 0.5D);
			local93 = (int) Math.sqrt((double) ((local89 >> 8) * (local89 >> 8) + 65536));
			local140 = arg3 + arg1;
			local171 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && local171 == 255) {
				while (arg1 <= local140) {
					local186 = arg0 >> 16;
					local190 = arg1 - arg8;
					if (arg1 >= local25 && arg1 < local44 && local186 >= this.anInt272 * 45613833 && local186 < this.anInt278 * -886740031 && arg11 < local52 && local186 >= arg7 + local9[local190] && local186 < arg7 + local9[local190] + local12[local190]) {
						this.anIntArray39[arg1 * this.anInt287 * -355627019 + local186] = arg4;
					}
					arg0 += local89;
					arg1++;
					local48 = arg11 + local93;
					arg11 = local48 % local60;
				}
			} else if (arg5 == 1) {
				local280 = ((arg4 & 0xFF00FF) * local171 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local171 >> 8 & 0xFF00) + (local171 << 24);
				local186 = 256 - local171;
				while (arg1 <= local140) {
					local190 = arg0 >> 16;
					local217 = arg1 - arg8;
					if (arg1 >= local25 && arg1 < local44 && local190 >= this.anInt272 * 45613833 && local190 < this.anInt278 * -886740031 && arg11 < local52 && local190 >= arg7 + local9[local217] && local190 < local9[local217] + arg7 + local12[local217]) {
						local322 = this.anInt287 * -355627019 * arg1 + local190;
						local341 = this.anIntArray39[local322];
						local341 = (local186 * (local341 & 0xFF00FF) >> 8 & 0xFF00FF) + ((local341 & 0xFF00) * local186 >> 8 & 0xFF00);
						this.anIntArray39[this.anInt287 * -355627019 * arg1 + local190] = local341 + local280;
					}
					arg0 += local89;
					arg1++;
					local48 = arg11 + local93;
					arg11 = local48 % local60;
				}
			} else if (arg5 == 2) {
				while (arg1 <= local140) {
					local186 = arg0 >> 16;
					local190 = arg1 - arg8;
					if (arg1 >= local25 && arg1 < local44 && local186 >= this.anInt272 * 45613833 && local186 < this.anInt278 * -886740031 && arg11 < local52 && local186 >= arg7 + local9[local190] && local186 < arg7 + local9[local190] + local12[local190]) {
						local217 = this.anInt287 * -355627019 * arg1 + local186;
						local322 = this.anIntArray39[local217];
						local341 = arg4 + local322;
						local346 = (local322 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local322 = (local346 & 0x1000100) + (local341 - local346 & 0x10000);
						this.anIntArray39[local217] = local341 - local322 | local322 - (local322 >>> 8);
					}
					arg0 += local89;
					arg1++;
					local48 = arg11 + local93;
					arg11 = local48 % local60;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		local140 = arg3 << 16;
		local89 = (int) Math.floor((double) local140 / (double) arg2 + 0.5D);
		local154 = arg2 + arg0;
		local93 = arg4 >>> 24;
		local171 = (int) Math.sqrt((double) ((local89 >> 8) * (local89 >> 8) + 65536));
		if (arg5 == 0 || arg5 == 1 && local93 == 255) {
			while (arg0 <= local154) {
				local186 = arg1 >> 16;
				local190 = local186 - arg8;
				if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local186 >= local25 && local186 < local44 && arg11 < local52) {
					local217 = local9[local190] + arg7;
					if (arg0 >= local217 && arg0 < local12[local190] + local217) {
						this.anIntArray39[arg0 + this.anInt287 * -355627019 * local186] = arg4;
					}
				}
				arg1 += local89;
				arg0++;
				local48 = arg11 + local171;
				arg11 = local48 % local60;
			}
		} else if (arg5 == 1) {
			local280 = (local93 << 24) + (local93 * (arg4 & 0xFF00) >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * local93 >> 8 & 0xFF00FF);
			local186 = 256 - local93;
			while (arg0 <= local154) {
				local190 = arg1 >> 16;
				local217 = local190 - arg8;
				if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local190 >= local25 && local190 < local44 && arg11 < local52) {
					local322 = local9[local217] + arg7;
					if (arg0 >= local322 && arg0 < local322 + local12[local217]) {
						local341 = local190 * this.anInt287 * -355627019 + arg0;
						local346 = this.anIntArray39[local341];
						@Pc(366) int local366 = ((local346 & 0xFF00) * local186 >> 8 & 0xFF00) + ((local346 & 0xFF00FF) * local186 >> 8 & 0xFF00FF);
						this.anIntArray39[local341] = local366 + local280;
					}
				}
				arg1 += local89;
				arg0++;
				local48 = arg11 + local171;
				arg11 = local48 % local60;
			}
		} else if (arg5 == 2) {
			while (arg0 <= local154) {
				local186 = arg1 >> 16;
				local190 = local186 - arg8;
				if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local186 >= local25 && local186 < local44 && arg11 < local52) {
					local217 = arg7 + local9[local190];
					if (arg0 >= local217 && arg0 < local12[local190] + local217) {
						local322 = this.anInt287 * -355627019 * local186 + arg0;
						local341 = this.anIntArray39[local322];
						local346 = arg4 + local341;
						@Pc(465) int local465 = (local341 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local341 = (local465 & 0x1000100) + (local346 - local465 & 0x10000);
						this.anIntArray39[local322] = local346 - local341 | local341 - (local341 >>> 8);
					}
				}
				arg1 += local89;
				arg0++;
				local48 = arg11 + local171;
				arg11 = local48 % local60;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "hi", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 1211)
	@Override
	public void method17220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(6) Class5_Sub3 local6 = (Class5_Sub3) arg6;
		@Pc(9) int[] local9 = local6.anIntArray11;
		@Pc(12) int[] local12 = local6.anIntArray12;
		@Pc(25) int local25 = this.anInt273 * 1850088287 > arg8 ? this.anInt273 * 1850088287 : arg8;
		@Pc(44) int local44 = this.anInt274 * 2066290591 < local9.length + arg8 ? this.anInt274 * 2066290591 : arg8 + local9.length;
		@Pc(48) int local48 = arg11 << 8;
		@Pc(52) int local52 = arg9 << 8;
		@Pc(56) int local56 = arg10 << 8;
		@Pc(60) int local60 = local52 + local56;
		arg11 = local48 % local60;
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(89) int local89;
		@Pc(93) int local93;
		if (arg3 + arg2 < 0) {
			local89 = (int) (Math.sqrt((double) (arg3 * arg3 + arg2 * arg2)) * 256.0D);
			local93 = local89 % local60;
			local48 = local60 + local52 - arg11 - local93;
			arg11 = local48 % local60;
			if (arg11 < 0) {
				arg11 += local60;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(171) int local171;
		@Pc(186) int local186;
		@Pc(190) int local190;
		@Pc(217) int local217;
		@Pc(322) int local322;
		@Pc(341) int local341;
		@Pc(346) int local346;
		@Pc(154) int local154;
		@Pc(140) int local140;
		@Pc(280) int local280;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			local154 = arg2 << 16;
			local89 = (int) Math.floor((double) local154 / (double) arg3 + 0.5D);
			local93 = (int) Math.sqrt((double) ((local89 >> 8) * (local89 >> 8) + 65536));
			local140 = arg3 + arg1;
			local171 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && local171 == 255) {
				while (arg1 <= local140) {
					local186 = arg0 >> 16;
					local190 = arg1 - arg8;
					if (arg1 >= local25 && arg1 < local44 && local186 >= this.anInt272 * 45613833 && local186 < this.anInt278 * -886740031 && arg11 < local52 && local186 >= arg7 + local9[local190] && local186 < arg7 + local9[local190] + local12[local190]) {
						this.anIntArray39[arg1 * this.anInt287 * -355627019 + local186] = arg4;
					}
					arg0 += local89;
					arg1++;
					local48 = arg11 + local93;
					arg11 = local48 % local60;
				}
			} else if (arg5 == 1) {
				local280 = ((arg4 & 0xFF00FF) * local171 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local171 >> 8 & 0xFF00) + (local171 << 24);
				local186 = 256 - local171;
				while (arg1 <= local140) {
					local190 = arg0 >> 16;
					local217 = arg1 - arg8;
					if (arg1 >= local25 && arg1 < local44 && local190 >= this.anInt272 * 45613833 && local190 < this.anInt278 * -886740031 && arg11 < local52 && local190 >= arg7 + local9[local217] && local190 < local9[local217] + arg7 + local12[local217]) {
						local322 = this.anInt287 * -355627019 * arg1 + local190;
						local341 = this.anIntArray39[local322];
						local341 = (local186 * (local341 & 0xFF00FF) >> 8 & 0xFF00FF) + ((local341 & 0xFF00) * local186 >> 8 & 0xFF00);
						this.anIntArray39[this.anInt287 * -355627019 * arg1 + local190] = local341 + local280;
					}
					arg0 += local89;
					arg1++;
					local48 = arg11 + local93;
					arg11 = local48 % local60;
				}
			} else if (arg5 == 2) {
				while (arg1 <= local140) {
					local186 = arg0 >> 16;
					local190 = arg1 - arg8;
					if (arg1 >= local25 && arg1 < local44 && local186 >= this.anInt272 * 45613833 && local186 < this.anInt278 * -886740031 && arg11 < local52 && local186 >= arg7 + local9[local190] && local186 < arg7 + local9[local190] + local12[local190]) {
						local217 = this.anInt287 * -355627019 * arg1 + local186;
						local322 = this.anIntArray39[local217];
						local341 = arg4 + local322;
						local346 = (local322 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local322 = (local346 & 0x1000100) + (local341 - local346 & 0x10000);
						this.anIntArray39[local217] = local341 - local322 | local322 - (local322 >>> 8);
					}
					arg0 += local89;
					arg1++;
					local48 = arg11 + local93;
					arg11 = local48 % local60;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		local140 = arg3 << 16;
		local89 = (int) Math.floor((double) local140 / (double) arg2 + 0.5D);
		local154 = arg2 + arg0;
		local93 = arg4 >>> 24;
		local171 = (int) Math.sqrt((double) ((local89 >> 8) * (local89 >> 8) + 65536));
		if (arg5 == 0 || arg5 == 1 && local93 == 255) {
			while (arg0 <= local154) {
				local186 = arg1 >> 16;
				local190 = local186 - arg8;
				if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local186 >= local25 && local186 < local44 && arg11 < local52) {
					local217 = local9[local190] + arg7;
					if (arg0 >= local217 && arg0 < local12[local190] + local217) {
						this.anIntArray39[arg0 + this.anInt287 * -355627019 * local186] = arg4;
					}
				}
				arg1 += local89;
				arg0++;
				local48 = arg11 + local171;
				arg11 = local48 % local60;
			}
		} else if (arg5 == 1) {
			local280 = (local93 << 24) + (local93 * (arg4 & 0xFF00) >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * local93 >> 8 & 0xFF00FF);
			local186 = 256 - local93;
			while (arg0 <= local154) {
				local190 = arg1 >> 16;
				local217 = local190 - arg8;
				if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local190 >= local25 && local190 < local44 && arg11 < local52) {
					local322 = local9[local217] + arg7;
					if (arg0 >= local322 && arg0 < local322 + local12[local217]) {
						local341 = local190 * this.anInt287 * -355627019 + arg0;
						local346 = this.anIntArray39[local341];
						@Pc(366) int local366 = ((local346 & 0xFF00) * local186 >> 8 & 0xFF00) + ((local346 & 0xFF00FF) * local186 >> 8 & 0xFF00FF);
						this.anIntArray39[local341] = local366 + local280;
					}
				}
				arg1 += local89;
				arg0++;
				local48 = arg11 + local171;
				arg11 = local48 % local60;
			}
		} else if (arg5 == 2) {
			while (arg0 <= local154) {
				local186 = arg1 >> 16;
				local190 = local186 - arg8;
				if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local186 >= local25 && local186 < local44 && arg11 < local52) {
					local217 = arg7 + local9[local190];
					if (arg0 >= local217 && arg0 < local12[local190] + local217) {
						local322 = this.anInt287 * -355627019 * local186 + arg0;
						local341 = this.anIntArray39[local322];
						local346 = arg4 + local341;
						@Pc(465) int local465 = (local341 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local341 = (local465 & 0x1000100) + (local346 - local465 & 0x10000);
						this.anIntArray39[local322] = local346 - local341 | local341 - (local341 >>> 8);
					}
				}
				arg1 += local89;
				arg0++;
				local48 = arg11 + local171;
				arg11 = local48 % local60;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "ha", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 1211)
	@Override
	public void method17222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(6) Class5_Sub3 local6 = (Class5_Sub3) arg6;
		@Pc(9) int[] local9 = local6.anIntArray11;
		@Pc(12) int[] local12 = local6.anIntArray12;
		@Pc(25) int local25 = this.anInt273 * 1850088287 > arg8 ? this.anInt273 * 1850088287 : arg8;
		@Pc(44) int local44 = this.anInt274 * 2066290591 < local9.length + arg8 ? this.anInt274 * 2066290591 : arg8 + local9.length;
		@Pc(48) int local48 = arg11 << 8;
		@Pc(52) int local52 = arg9 << 8;
		@Pc(56) int local56 = arg10 << 8;
		@Pc(60) int local60 = local52 + local56;
		arg11 = local48 % local60;
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(89) int local89;
		@Pc(93) int local93;
		if (arg3 + arg2 < 0) {
			local89 = (int) (Math.sqrt((double) (arg3 * arg3 + arg2 * arg2)) * 256.0D);
			local93 = local89 % local60;
			local48 = local60 + local52 - arg11 - local93;
			arg11 = local48 % local60;
			if (arg11 < 0) {
				arg11 += local60;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(171) int local171;
		@Pc(186) int local186;
		@Pc(190) int local190;
		@Pc(217) int local217;
		@Pc(322) int local322;
		@Pc(341) int local341;
		@Pc(346) int local346;
		@Pc(154) int local154;
		@Pc(140) int local140;
		@Pc(280) int local280;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			local154 = arg2 << 16;
			local89 = (int) Math.floor((double) local154 / (double) arg3 + 0.5D);
			local93 = (int) Math.sqrt((double) ((local89 >> 8) * (local89 >> 8) + 65536));
			local140 = arg3 + arg1;
			local171 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && local171 == 255) {
				while (arg1 <= local140) {
					local186 = arg0 >> 16;
					local190 = arg1 - arg8;
					if (arg1 >= local25 && arg1 < local44 && local186 >= this.anInt272 * 45613833 && local186 < this.anInt278 * -886740031 && arg11 < local52 && local186 >= arg7 + local9[local190] && local186 < arg7 + local9[local190] + local12[local190]) {
						this.anIntArray39[arg1 * this.anInt287 * -355627019 + local186] = arg4;
					}
					arg0 += local89;
					arg1++;
					local48 = arg11 + local93;
					arg11 = local48 % local60;
				}
			} else if (arg5 == 1) {
				local280 = ((arg4 & 0xFF00FF) * local171 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local171 >> 8 & 0xFF00) + (local171 << 24);
				local186 = 256 - local171;
				while (arg1 <= local140) {
					local190 = arg0 >> 16;
					local217 = arg1 - arg8;
					if (arg1 >= local25 && arg1 < local44 && local190 >= this.anInt272 * 45613833 && local190 < this.anInt278 * -886740031 && arg11 < local52 && local190 >= arg7 + local9[local217] && local190 < local9[local217] + arg7 + local12[local217]) {
						local322 = this.anInt287 * -355627019 * arg1 + local190;
						local341 = this.anIntArray39[local322];
						local341 = (local186 * (local341 & 0xFF00FF) >> 8 & 0xFF00FF) + ((local341 & 0xFF00) * local186 >> 8 & 0xFF00);
						this.anIntArray39[this.anInt287 * -355627019 * arg1 + local190] = local341 + local280;
					}
					arg0 += local89;
					arg1++;
					local48 = arg11 + local93;
					arg11 = local48 % local60;
				}
			} else if (arg5 == 2) {
				while (arg1 <= local140) {
					local186 = arg0 >> 16;
					local190 = arg1 - arg8;
					if (arg1 >= local25 && arg1 < local44 && local186 >= this.anInt272 * 45613833 && local186 < this.anInt278 * -886740031 && arg11 < local52 && local186 >= arg7 + local9[local190] && local186 < arg7 + local9[local190] + local12[local190]) {
						local217 = this.anInt287 * -355627019 * arg1 + local186;
						local322 = this.anIntArray39[local217];
						local341 = arg4 + local322;
						local346 = (local322 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local322 = (local346 & 0x1000100) + (local341 - local346 & 0x10000);
						this.anIntArray39[local217] = local341 - local322 | local322 - (local322 >>> 8);
					}
					arg0 += local89;
					arg1++;
					local48 = arg11 + local93;
					arg11 = local48 % local60;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		local140 = arg3 << 16;
		local89 = (int) Math.floor((double) local140 / (double) arg2 + 0.5D);
		local154 = arg2 + arg0;
		local93 = arg4 >>> 24;
		local171 = (int) Math.sqrt((double) ((local89 >> 8) * (local89 >> 8) + 65536));
		if (arg5 == 0 || arg5 == 1 && local93 == 255) {
			while (arg0 <= local154) {
				local186 = arg1 >> 16;
				local190 = local186 - arg8;
				if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local186 >= local25 && local186 < local44 && arg11 < local52) {
					local217 = local9[local190] + arg7;
					if (arg0 >= local217 && arg0 < local12[local190] + local217) {
						this.anIntArray39[arg0 + this.anInt287 * -355627019 * local186] = arg4;
					}
				}
				arg1 += local89;
				arg0++;
				local48 = arg11 + local171;
				arg11 = local48 % local60;
			}
		} else if (arg5 == 1) {
			local280 = (local93 << 24) + (local93 * (arg4 & 0xFF00) >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * local93 >> 8 & 0xFF00FF);
			local186 = 256 - local93;
			while (arg0 <= local154) {
				local190 = arg1 >> 16;
				local217 = local190 - arg8;
				if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local190 >= local25 && local190 < local44 && arg11 < local52) {
					local322 = local9[local217] + arg7;
					if (arg0 >= local322 && arg0 < local322 + local12[local217]) {
						local341 = local190 * this.anInt287 * -355627019 + arg0;
						local346 = this.anIntArray39[local341];
						@Pc(366) int local366 = ((local346 & 0xFF00) * local186 >> 8 & 0xFF00) + ((local346 & 0xFF00FF) * local186 >> 8 & 0xFF00FF);
						this.anIntArray39[local341] = local366 + local280;
					}
				}
				arg1 += local89;
				arg0++;
				local48 = arg11 + local171;
				arg11 = local48 % local60;
			}
		} else if (arg5 == 2) {
			while (arg0 <= local154) {
				local186 = arg1 >> 16;
				local190 = local186 - arg8;
				if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local186 >= local25 && local186 < local44 && arg11 < local52) {
					local217 = arg7 + local9[local190];
					if (arg0 >= local217 && arg0 < local12[local190] + local217) {
						local322 = this.anInt287 * -355627019 * local186 + arg0;
						local341 = this.anIntArray39[local322];
						local346 = arg4 + local341;
						@Pc(465) int local465 = (local341 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local341 = (local465 & 0x1000100) + (local346 - local465 & 0x10000);
						this.anIntArray39[local322] = local346 - local341 | local341 - (local341 >>> 8);
					}
				}
				arg1 += local89;
				arg0++;
				local48 = arg11 + local171;
				arg11 = local48 % local60;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "hg", descriptor = "(IIIIIILclient!ch;IIIII)V", line = 1211)
	@Override
	public void method17223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(6) Class5_Sub3 local6 = (Class5_Sub3) arg6;
		@Pc(9) int[] local9 = local6.anIntArray11;
		@Pc(12) int[] local12 = local6.anIntArray12;
		@Pc(25) int local25 = this.anInt273 * 1850088287 > arg8 ? this.anInt273 * 1850088287 : arg8;
		@Pc(44) int local44 = this.anInt274 * 2066290591 < local9.length + arg8 ? this.anInt274 * 2066290591 : arg8 + local9.length;
		@Pc(48) int local48 = arg11 << 8;
		@Pc(52) int local52 = arg9 << 8;
		@Pc(56) int local56 = arg10 << 8;
		@Pc(60) int local60 = local52 + local56;
		arg11 = local48 % local60;
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(89) int local89;
		@Pc(93) int local93;
		if (arg3 + arg2 < 0) {
			local89 = (int) (Math.sqrt((double) (arg3 * arg3 + arg2 * arg2)) * 256.0D);
			local93 = local89 % local60;
			local48 = local60 + local52 - arg11 - local93;
			arg11 = local48 % local60;
			if (arg11 < 0) {
				arg11 += local60;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(171) int local171;
		@Pc(186) int local186;
		@Pc(190) int local190;
		@Pc(217) int local217;
		@Pc(322) int local322;
		@Pc(341) int local341;
		@Pc(346) int local346;
		@Pc(154) int local154;
		@Pc(140) int local140;
		@Pc(280) int local280;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			local154 = arg2 << 16;
			local89 = (int) Math.floor((double) local154 / (double) arg3 + 0.5D);
			local93 = (int) Math.sqrt((double) ((local89 >> 8) * (local89 >> 8) + 65536));
			local140 = arg3 + arg1;
			local171 = arg4 >>> 24;
			if (arg5 == 0 || arg5 == 1 && local171 == 255) {
				while (arg1 <= local140) {
					local186 = arg0 >> 16;
					local190 = arg1 - arg8;
					if (arg1 >= local25 && arg1 < local44 && local186 >= this.anInt272 * 45613833 && local186 < this.anInt278 * -886740031 && arg11 < local52 && local186 >= arg7 + local9[local190] && local186 < arg7 + local9[local190] + local12[local190]) {
						this.anIntArray39[arg1 * this.anInt287 * -355627019 + local186] = arg4;
					}
					arg0 += local89;
					arg1++;
					local48 = arg11 + local93;
					arg11 = local48 % local60;
				}
			} else if (arg5 == 1) {
				local280 = ((arg4 & 0xFF00FF) * local171 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local171 >> 8 & 0xFF00) + (local171 << 24);
				local186 = 256 - local171;
				while (arg1 <= local140) {
					local190 = arg0 >> 16;
					local217 = arg1 - arg8;
					if (arg1 >= local25 && arg1 < local44 && local190 >= this.anInt272 * 45613833 && local190 < this.anInt278 * -886740031 && arg11 < local52 && local190 >= arg7 + local9[local217] && local190 < local9[local217] + arg7 + local12[local217]) {
						local322 = this.anInt287 * -355627019 * arg1 + local190;
						local341 = this.anIntArray39[local322];
						local341 = (local186 * (local341 & 0xFF00FF) >> 8 & 0xFF00FF) + ((local341 & 0xFF00) * local186 >> 8 & 0xFF00);
						this.anIntArray39[this.anInt287 * -355627019 * arg1 + local190] = local341 + local280;
					}
					arg0 += local89;
					arg1++;
					local48 = arg11 + local93;
					arg11 = local48 % local60;
				}
			} else if (arg5 == 2) {
				while (arg1 <= local140) {
					local186 = arg0 >> 16;
					local190 = arg1 - arg8;
					if (arg1 >= local25 && arg1 < local44 && local186 >= this.anInt272 * 45613833 && local186 < this.anInt278 * -886740031 && arg11 < local52 && local186 >= arg7 + local9[local190] && local186 < arg7 + local9[local190] + local12[local190]) {
						local217 = this.anInt287 * -355627019 * arg1 + local186;
						local322 = this.anIntArray39[local217];
						local341 = arg4 + local322;
						local346 = (local322 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local322 = (local346 & 0x1000100) + (local341 - local346 & 0x10000);
						this.anIntArray39[local217] = local341 - local322 | local322 - (local322 >>> 8);
					}
					arg0 += local89;
					arg1++;
					local48 = arg11 + local93;
					arg11 = local48 % local60;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		local140 = arg3 << 16;
		local89 = (int) Math.floor((double) local140 / (double) arg2 + 0.5D);
		local154 = arg2 + arg0;
		local93 = arg4 >>> 24;
		local171 = (int) Math.sqrt((double) ((local89 >> 8) * (local89 >> 8) + 65536));
		if (arg5 == 0 || arg5 == 1 && local93 == 255) {
			while (arg0 <= local154) {
				local186 = arg1 >> 16;
				local190 = local186 - arg8;
				if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local186 >= local25 && local186 < local44 && arg11 < local52) {
					local217 = local9[local190] + arg7;
					if (arg0 >= local217 && arg0 < local12[local190] + local217) {
						this.anIntArray39[arg0 + this.anInt287 * -355627019 * local186] = arg4;
					}
				}
				arg1 += local89;
				arg0++;
				local48 = arg11 + local171;
				arg11 = local48 % local60;
			}
		} else if (arg5 == 1) {
			local280 = (local93 << 24) + (local93 * (arg4 & 0xFF00) >> 8 & 0xFF00) + ((arg4 & 0xFF00FF) * local93 >> 8 & 0xFF00FF);
			local186 = 256 - local93;
			while (arg0 <= local154) {
				local190 = arg1 >> 16;
				local217 = local190 - arg8;
				if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local190 >= local25 && local190 < local44 && arg11 < local52) {
					local322 = local9[local217] + arg7;
					if (arg0 >= local322 && arg0 < local322 + local12[local217]) {
						local341 = local190 * this.anInt287 * -355627019 + arg0;
						local346 = this.anIntArray39[local341];
						@Pc(366) int local366 = ((local346 & 0xFF00) * local186 >> 8 & 0xFF00) + ((local346 & 0xFF00FF) * local186 >> 8 & 0xFF00FF);
						this.anIntArray39[local341] = local366 + local280;
					}
				}
				arg1 += local89;
				arg0++;
				local48 = arg11 + local171;
				arg11 = local48 % local60;
			}
		} else if (arg5 == 2) {
			while (arg0 <= local154) {
				local186 = arg1 >> 16;
				local190 = local186 - arg8;
				if (arg0 >= this.anInt272 * 45613833 && arg0 < this.anInt278 * -886740031 && local186 >= local25 && local186 < local44 && arg11 < local52) {
					local217 = arg7 + local9[local190];
					if (arg0 >= local217 && arg0 < local12[local190] + local217) {
						local322 = this.anInt287 * -355627019 * local186 + arg0;
						local341 = this.anIntArray39[local322];
						local346 = arg4 + local341;
						@Pc(465) int local465 = (local341 & 0xFF00FF) + (arg4 & 0xFF00FF);
						local341 = (local465 & 0x1000100) + (local346 - local465 & 0x10000);
						this.anIntArray39[local322] = local346 - local341 | local341 - (local341 >>> 8);
					}
				}
				arg1 += local89;
				arg0++;
				local48 = arg11 + local171;
				arg11 = local48 % local60;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "ho", descriptor = "(IIIIIII)V", line = 1361)
	@Override
	public void method17226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(8) Class12 local8 = this.method3165(Thread.currentThread());
		@Pc(11) Class103 local11 = local8.aClass103_1;
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(19) int local19 = arg3 - arg1;
		@Pc(26) int local26 = local15 >= 0 ? local15 : -local15;
		@Pc(33) int local33 = local19 >= 0 ? local19 : -local19;
		@Pc(35) int local35 = local26;
		if (local26 < local33) {
			local35 = local33;
		}
		if (local35 == 0) {
			return;
		}
		@Pc(50) int local50 = (local15 << 16) / local35;
		@Pc(56) int local56 = (local19 << 16) / local35;
		local15 += local50 >> 16;
		local19 += local56 >> 16;
		if (local56 <= local50) {
			local50 = -local50;
		} else {
			local56 = -local56;
		}
		@Pc(84) int local84 = local56 * arg5 >> 17;
		@Pc(92) int local92 = local56 * arg5 + 1 >> 17;
		@Pc(98) int local98 = local50 * arg5 >> 17;
		@Pc(106) int local106 = arg5 * local50 + 1 >> 17;
		@Pc(111) int local111 = arg0 - local11.method21884();
		@Pc(116) int local116 = arg1 - local11.method21877();
		@Pc(120) int local120 = local111 + local84;
		@Pc(124) int local124 = local111 - local92;
		@Pc(130) int local130 = local111 + local15 - local92;
		@Pc(136) int local136 = local84 + local111 + local15;
		@Pc(140) int local140 = local98 + local116;
		@Pc(144) int local144 = local116 - local106;
		@Pc(150) int local150 = local19 + local116 - local106;
		@Pc(156) int local156 = local116 + local19 + local98;
		if (arg6 == 0) {
			local11.anInt2973 = 0;
		} else if (arg6 == 1) {
			local11.anInt2973 = 255 - (arg4 >>> 24);
		} else {
			throw new IllegalArgumentException();
		}
		this.method17108(false);
		local11.aBoolean538 = local120 < 0 || local120 > local11.anInt2978 || local124 < 0 || local124 > local11.anInt2978 || local130 < 0 || local130 > local11.anInt2978;
		local11.method21898(true, false, false, (float) local140, (float) local144, (float) local150, (float) local120, (float) local124, (float) local130, 100.0F, 100.0F, 100.0F, arg4);
		local11.aBoolean538 = local120 < 0 || local120 > local11.anInt2978 || local130 < 0 || local130 > local11.anInt2978 || local136 < 0 || local136 > local11.anInt2978;
		local11.method21898(true, false, false, (float) local140, (float) local150, (float) local156, (float) local120, (float) local130, (float) local136, 100.0F, 100.0F, 100.0F, arg4);
		this.method17108(true);
	}

	@OriginalMember(owner = "client!abl", name = "bu", descriptor = "(IIIIIII)V", line = 1361)
	@Override
	public void method17078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(8) Class12 local8 = this.method3165(Thread.currentThread());
		@Pc(11) Class103 local11 = local8.aClass103_1;
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(19) int local19 = arg3 - arg1;
		@Pc(26) int local26 = local15 >= 0 ? local15 : -local15;
		@Pc(33) int local33 = local19 >= 0 ? local19 : -local19;
		@Pc(35) int local35 = local26;
		if (local26 < local33) {
			local35 = local33;
		}
		if (local35 == 0) {
			return;
		}
		@Pc(50) int local50 = (local15 << 16) / local35;
		@Pc(56) int local56 = (local19 << 16) / local35;
		local15 += local50 >> 16;
		local19 += local56 >> 16;
		if (local56 <= local50) {
			local50 = -local50;
		} else {
			local56 = -local56;
		}
		@Pc(84) int local84 = local56 * arg5 >> 17;
		@Pc(92) int local92 = local56 * arg5 + 1 >> 17;
		@Pc(98) int local98 = local50 * arg5 >> 17;
		@Pc(106) int local106 = arg5 * local50 + 1 >> 17;
		@Pc(111) int local111 = arg0 - local11.method21884();
		@Pc(116) int local116 = arg1 - local11.method21877();
		@Pc(120) int local120 = local111 + local84;
		@Pc(124) int local124 = local111 - local92;
		@Pc(130) int local130 = local111 + local15 - local92;
		@Pc(136) int local136 = local84 + local111 + local15;
		@Pc(140) int local140 = local98 + local116;
		@Pc(144) int local144 = local116 - local106;
		@Pc(150) int local150 = local19 + local116 - local106;
		@Pc(156) int local156 = local116 + local19 + local98;
		if (arg6 == 0) {
			local11.anInt2973 = 0;
		} else if (arg6 == 1) {
			local11.anInt2973 = 255 - (arg4 >>> 24);
		} else {
			throw new IllegalArgumentException();
		}
		this.method17108(false);
		local11.aBoolean538 = local120 < 0 || local120 > local11.anInt2978 || local124 < 0 || local124 > local11.anInt2978 || local130 < 0 || local130 > local11.anInt2978;
		local11.method21898(true, false, false, (float) local140, (float) local144, (float) local150, (float) local120, (float) local124, (float) local130, 100.0F, 100.0F, 100.0F, arg4);
		local11.aBoolean538 = local120 < 0 || local120 > local11.anInt2978 || local130 < 0 || local130 > local11.anInt2978 || local136 < 0 || local136 > local11.anInt2978;
		local11.method21898(true, false, false, (float) local140, (float) local150, (float) local156, (float) local120, (float) local130, (float) local136, 100.0F, 100.0F, 100.0F, arg4);
		this.method17108(true);
	}

	@OriginalMember(owner = "client!abl", name = "hc", descriptor = "(IIIIIII)V", line = 1361)
	@Override
	public void method17224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(8) Class12 local8 = this.method3165(Thread.currentThread());
		@Pc(11) Class103 local11 = local8.aClass103_1;
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(19) int local19 = arg3 - arg1;
		@Pc(26) int local26 = local15 >= 0 ? local15 : -local15;
		@Pc(33) int local33 = local19 >= 0 ? local19 : -local19;
		@Pc(35) int local35 = local26;
		if (local26 < local33) {
			local35 = local33;
		}
		if (local35 == 0) {
			return;
		}
		@Pc(50) int local50 = (local15 << 16) / local35;
		@Pc(56) int local56 = (local19 << 16) / local35;
		local15 += local50 >> 16;
		local19 += local56 >> 16;
		if (local56 <= local50) {
			local50 = -local50;
		} else {
			local56 = -local56;
		}
		@Pc(84) int local84 = local56 * arg5 >> 17;
		@Pc(92) int local92 = local56 * arg5 + 1 >> 17;
		@Pc(98) int local98 = local50 * arg5 >> 17;
		@Pc(106) int local106 = arg5 * local50 + 1 >> 17;
		@Pc(111) int local111 = arg0 - local11.method21884();
		@Pc(116) int local116 = arg1 - local11.method21877();
		@Pc(120) int local120 = local111 + local84;
		@Pc(124) int local124 = local111 - local92;
		@Pc(130) int local130 = local111 + local15 - local92;
		@Pc(136) int local136 = local84 + local111 + local15;
		@Pc(140) int local140 = local98 + local116;
		@Pc(144) int local144 = local116 - local106;
		@Pc(150) int local150 = local19 + local116 - local106;
		@Pc(156) int local156 = local116 + local19 + local98;
		if (arg6 == 0) {
			local11.anInt2973 = 0;
		} else if (arg6 == 1) {
			local11.anInt2973 = 255 - (arg4 >>> 24);
		} else {
			throw new IllegalArgumentException();
		}
		this.method17108(false);
		local11.aBoolean538 = local120 < 0 || local120 > local11.anInt2978 || local124 < 0 || local124 > local11.anInt2978 || local130 < 0 || local130 > local11.anInt2978;
		local11.method21898(true, false, false, (float) local140, (float) local144, (float) local150, (float) local120, (float) local124, (float) local130, 100.0F, 100.0F, 100.0F, arg4);
		local11.aBoolean538 = local120 < 0 || local120 > local11.anInt2978 || local130 < 0 || local130 > local11.anInt2978 || local136 < 0 || local136 > local11.anInt2978;
		local11.method21898(true, false, false, (float) local140, (float) local150, (float) local156, (float) local120, (float) local130, (float) local136, 100.0F, 100.0F, 100.0F, arg4);
		this.method17108(true);
	}

	@OriginalMember(owner = "client!abl", name = "hd", descriptor = "(IIIIIII)V", line = 1361)
	@Override
	public void method17225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(8) Class12 local8 = this.method3165(Thread.currentThread());
		@Pc(11) Class103 local11 = local8.aClass103_1;
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(19) int local19 = arg3 - arg1;
		@Pc(26) int local26 = local15 >= 0 ? local15 : -local15;
		@Pc(33) int local33 = local19 >= 0 ? local19 : -local19;
		@Pc(35) int local35 = local26;
		if (local26 < local33) {
			local35 = local33;
		}
		if (local35 == 0) {
			return;
		}
		@Pc(50) int local50 = (local15 << 16) / local35;
		@Pc(56) int local56 = (local19 << 16) / local35;
		local15 += local50 >> 16;
		local19 += local56 >> 16;
		if (local56 <= local50) {
			local50 = -local50;
		} else {
			local56 = -local56;
		}
		@Pc(84) int local84 = local56 * arg5 >> 17;
		@Pc(92) int local92 = local56 * arg5 + 1 >> 17;
		@Pc(98) int local98 = local50 * arg5 >> 17;
		@Pc(106) int local106 = arg5 * local50 + 1 >> 17;
		@Pc(111) int local111 = arg0 - local11.method21884();
		@Pc(116) int local116 = arg1 - local11.method21877();
		@Pc(120) int local120 = local111 + local84;
		@Pc(124) int local124 = local111 - local92;
		@Pc(130) int local130 = local111 + local15 - local92;
		@Pc(136) int local136 = local84 + local111 + local15;
		@Pc(140) int local140 = local98 + local116;
		@Pc(144) int local144 = local116 - local106;
		@Pc(150) int local150 = local19 + local116 - local106;
		@Pc(156) int local156 = local116 + local19 + local98;
		if (arg6 == 0) {
			local11.anInt2973 = 0;
		} else if (arg6 == 1) {
			local11.anInt2973 = 255 - (arg4 >>> 24);
		} else {
			throw new IllegalArgumentException();
		}
		this.method17108(false);
		local11.aBoolean538 = local120 < 0 || local120 > local11.anInt2978 || local124 < 0 || local124 > local11.anInt2978 || local130 < 0 || local130 > local11.anInt2978;
		local11.method21898(true, false, false, (float) local140, (float) local144, (float) local150, (float) local120, (float) local124, (float) local130, 100.0F, 100.0F, 100.0F, arg4);
		local11.aBoolean538 = local120 < 0 || local120 > local11.anInt2978 || local130 < 0 || local130 > local11.anInt2978 || local136 < 0 || local136 > local11.anInt2978;
		local11.method21898(true, false, false, (float) local140, (float) local150, (float) local156, (float) local120, (float) local130, (float) local136, 100.0F, 100.0F, 100.0F, arg4);
		this.method17108(true);
	}

	@OriginalMember(owner = "client!abl", name = "ba", descriptor = "(IIIIII)I", line = 1403)
	@Override
	public int method17145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = (float) arg2 * this.aClass328_5.aFloatArray106[10] + this.aClass328_5.aFloatArray106[14] + this.aClass328_5.aFloatArray106[2] * (float) arg0 + this.aClass328_5.aFloatArray106[6] * (float) arg1;
		@Pc(67) float local67 = this.aClass328_5.aFloatArray106[6] * (float) arg4 + this.aClass328_5.aFloatArray106[14] + (float) arg3 * this.aClass328_5.aFloatArray106[2] + this.aClass328_5.aFloatArray106[10] * (float) arg5;
		@Pc(100) float local100 = (float) arg2 * this.aClass328_5.aFloatArray106[11] + this.aClass328_5.aFloatArray106[7] * (float) arg1 + this.aClass328_5.aFloatArray106[3] * (float) arg0 + this.aClass328_5.aFloatArray106[15];
		@Pc(133) float local133 = this.aClass328_5.aFloatArray106[7] * (float) arg4 + (float) arg3 * this.aClass328_5.aFloatArray106[3] + this.aClass328_5.aFloatArray106[15] + this.aClass328_5.aFloatArray106[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass328_5.aFloatArray106[0] * (float) arg0 + this.aClass328_5.aFloatArray106[12] + this.aClass328_5.aFloatArray106[4] * (float) arg1 + (float) arg2 * this.aClass328_5.aFloatArray106[8];
		@Pc(226) float local226 = (float) arg5 * this.aClass328_5.aFloatArray106[8] + this.aClass328_5.aFloatArray106[4] * (float) arg4 + this.aClass328_5.aFloatArray106[0] * (float) arg3 + this.aClass328_5.aFloatArray106[12];
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass328_5.aFloatArray106[1] * (float) arg0 + this.aClass328_5.aFloatArray106[13] + this.aClass328_5.aFloatArray106[5] * (float) arg1 + this.aClass328_5.aFloatArray106[9] * (float) arg2;
		@Pc(318) float local318 = (float) arg5 * this.aClass328_5.aFloatArray106[9] + this.aClass328_5.aFloatArray106[5] * (float) arg4 + this.aClass328_5.aFloatArray106[1] * (float) arg3 + this.aClass328_5.aFloatArray106[13];
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!abl", name = "hb", descriptor = "(IIIIII)I", line = 1403)
	@Override
	public int method17227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = (float) arg2 * this.aClass328_5.aFloatArray106[10] + this.aClass328_5.aFloatArray106[14] + this.aClass328_5.aFloatArray106[2] * (float) arg0 + this.aClass328_5.aFloatArray106[6] * (float) arg1;
		@Pc(67) float local67 = this.aClass328_5.aFloatArray106[6] * (float) arg4 + this.aClass328_5.aFloatArray106[14] + (float) arg3 * this.aClass328_5.aFloatArray106[2] + this.aClass328_5.aFloatArray106[10] * (float) arg5;
		@Pc(100) float local100 = (float) arg2 * this.aClass328_5.aFloatArray106[11] + this.aClass328_5.aFloatArray106[7] * (float) arg1 + this.aClass328_5.aFloatArray106[3] * (float) arg0 + this.aClass328_5.aFloatArray106[15];
		@Pc(133) float local133 = this.aClass328_5.aFloatArray106[7] * (float) arg4 + (float) arg3 * this.aClass328_5.aFloatArray106[3] + this.aClass328_5.aFloatArray106[15] + this.aClass328_5.aFloatArray106[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass328_5.aFloatArray106[0] * (float) arg0 + this.aClass328_5.aFloatArray106[12] + this.aClass328_5.aFloatArray106[4] * (float) arg1 + (float) arg2 * this.aClass328_5.aFloatArray106[8];
		@Pc(226) float local226 = (float) arg5 * this.aClass328_5.aFloatArray106[8] + this.aClass328_5.aFloatArray106[4] * (float) arg4 + this.aClass328_5.aFloatArray106[0] * (float) arg3 + this.aClass328_5.aFloatArray106[12];
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass328_5.aFloatArray106[1] * (float) arg0 + this.aClass328_5.aFloatArray106[13] + this.aClass328_5.aFloatArray106[5] * (float) arg1 + this.aClass328_5.aFloatArray106[9] * (float) arg2;
		@Pc(318) float local318 = (float) arg5 * this.aClass328_5.aFloatArray106[9] + this.aClass328_5.aFloatArray106[5] * (float) arg4 + this.aClass328_5.aFloatArray106[1] * (float) arg3 + this.aClass328_5.aFloatArray106[13];
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!abl", name = "hx", descriptor = "(IIIIII)I", line = 1403)
	@Override
	public int method17229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = (float) arg2 * this.aClass328_5.aFloatArray106[10] + this.aClass328_5.aFloatArray106[14] + this.aClass328_5.aFloatArray106[2] * (float) arg0 + this.aClass328_5.aFloatArray106[6] * (float) arg1;
		@Pc(67) float local67 = this.aClass328_5.aFloatArray106[6] * (float) arg4 + this.aClass328_5.aFloatArray106[14] + (float) arg3 * this.aClass328_5.aFloatArray106[2] + this.aClass328_5.aFloatArray106[10] * (float) arg5;
		@Pc(100) float local100 = (float) arg2 * this.aClass328_5.aFloatArray106[11] + this.aClass328_5.aFloatArray106[7] * (float) arg1 + this.aClass328_5.aFloatArray106[3] * (float) arg0 + this.aClass328_5.aFloatArray106[15];
		@Pc(133) float local133 = this.aClass328_5.aFloatArray106[7] * (float) arg4 + (float) arg3 * this.aClass328_5.aFloatArray106[3] + this.aClass328_5.aFloatArray106[15] + this.aClass328_5.aFloatArray106[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass328_5.aFloatArray106[0] * (float) arg0 + this.aClass328_5.aFloatArray106[12] + this.aClass328_5.aFloatArray106[4] * (float) arg1 + (float) arg2 * this.aClass328_5.aFloatArray106[8];
		@Pc(226) float local226 = (float) arg5 * this.aClass328_5.aFloatArray106[8] + this.aClass328_5.aFloatArray106[4] * (float) arg4 + this.aClass328_5.aFloatArray106[0] * (float) arg3 + this.aClass328_5.aFloatArray106[12];
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass328_5.aFloatArray106[1] * (float) arg0 + this.aClass328_5.aFloatArray106[13] + this.aClass328_5.aFloatArray106[5] * (float) arg1 + this.aClass328_5.aFloatArray106[9] * (float) arg2;
		@Pc(318) float local318 = (float) arg5 * this.aClass328_5.aFloatArray106[9] + this.aClass328_5.aFloatArray106[5] * (float) arg4 + this.aClass328_5.aFloatArray106[1] * (float) arg3 + this.aClass328_5.aFloatArray106[13];
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!abl", name = "hz", descriptor = "(IIIIII)I", line = 1403)
	@Override
	public int method17228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(34) float local34 = (float) arg2 * this.aClass328_5.aFloatArray106[10] + this.aClass328_5.aFloatArray106[14] + this.aClass328_5.aFloatArray106[2] * (float) arg0 + this.aClass328_5.aFloatArray106[6] * (float) arg1;
		@Pc(67) float local67 = this.aClass328_5.aFloatArray106[6] * (float) arg4 + this.aClass328_5.aFloatArray106[14] + (float) arg3 * this.aClass328_5.aFloatArray106[2] + this.aClass328_5.aFloatArray106[10] * (float) arg5;
		@Pc(100) float local100 = (float) arg2 * this.aClass328_5.aFloatArray106[11] + this.aClass328_5.aFloatArray106[7] * (float) arg1 + this.aClass328_5.aFloatArray106[3] * (float) arg0 + this.aClass328_5.aFloatArray106[15];
		@Pc(133) float local133 = this.aClass328_5.aFloatArray106[7] * (float) arg4 + (float) arg3 * this.aClass328_5.aFloatArray106[3] + this.aClass328_5.aFloatArray106[15] + this.aClass328_5.aFloatArray106[11] * (float) arg5;
		if (local34 < -local100 && local67 < -local133) {
			local1 |= 0x10;
		} else if (local34 > local100 && local67 > local133) {
			local1 |= 0x20;
		}
		@Pc(193) float local193 = this.aClass328_5.aFloatArray106[0] * (float) arg0 + this.aClass328_5.aFloatArray106[12] + this.aClass328_5.aFloatArray106[4] * (float) arg1 + (float) arg2 * this.aClass328_5.aFloatArray106[8];
		@Pc(226) float local226 = (float) arg5 * this.aClass328_5.aFloatArray106[8] + this.aClass328_5.aFloatArray106[4] * (float) arg4 + this.aClass328_5.aFloatArray106[0] * (float) arg3 + this.aClass328_5.aFloatArray106[12];
		if (local193 < -local100 && local226 < -local133) {
			local1 |= 0x1;
		}
		if (local193 > local100 && local226 > local133) {
			local1 |= 0x2;
		}
		@Pc(285) float local285 = this.aClass328_5.aFloatArray106[1] * (float) arg0 + this.aClass328_5.aFloatArray106[13] + this.aClass328_5.aFloatArray106[5] * (float) arg1 + this.aClass328_5.aFloatArray106[9] * (float) arg2;
		@Pc(318) float local318 = (float) arg5 * this.aClass328_5.aFloatArray106[9] + this.aClass328_5.aFloatArray106[5] * (float) arg4 + this.aClass328_5.aFloatArray106[1] * (float) arg3 + this.aClass328_5.aFloatArray106[13];
		if (local285 < -local100 && local318 < -local133) {
			local1 |= 0x4;
		}
		if (local285 > local100 && local318 > local133) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!abl", name = "bc", descriptor = "(IIIILclient!mu;Lclient!mk;)Z", line = 1422)
	@Override
	boolean method17029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class332 arg4, @OriginalArg(5) Class323 arg5) {
		@Pc(2) Class328 local2 = this.method17333();
		local2.method26056(arg4);
		local2.method26046(this.aClass328_5);
		return arg5.method25988(arg0, arg1, arg2, arg3, local2, this.aFloat19, this.aFloat17, this.aFloat22, this.aFloat20);
	}

	@OriginalMember(owner = "client!abl", name = "hs", descriptor = "(IIIILclient!mu;Lclient!mk;)Z", line = 1422)
	@Override
	boolean method17230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class332 arg4, @OriginalArg(5) Class323 arg5) {
		@Pc(2) Class328 local2 = this.method17333();
		local2.method26056(arg4);
		local2.method26046(this.aClass328_5);
		return arg5.method25988(arg0, arg1, arg2, arg3, local2, this.aFloat19, this.aFloat17, this.aFloat22, this.aFloat20);
	}

	@OriginalMember(owner = "client!abl", name = "hn", descriptor = "(Lclient!mu;Lclient!du;Lclient!mk;)V", line = 1429)
	@Override
	public void method17122(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class323 arg2) {
		@Pc(2) Class328 local2 = this.method17333();
		local2.method26056(arg0);
		local2.method26046(this.aClass328_5);
		arg1.method22929(arg2, this.aClass328_4, local2, this.aFloat19, this.aFloat17, this.aFloat22, this.aFloat20);
	}

	@OriginalMember(owner = "client!abl", name = "bn", descriptor = "(Lclient!mu;Lclient!du;Lclient!mk;)V", line = 1429)
	@Override
	public void method17082(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class323 arg2) {
		@Pc(2) Class328 local2 = this.method17333();
		local2.method26056(arg0);
		local2.method26046(this.aClass328_5);
		arg1.method22929(arg2, this.aClass328_4, local2, this.aFloat19, this.aFloat17, this.aFloat22, this.aFloat20);
	}

	@OriginalMember(owner = "client!abl", name = "be", descriptor = "(I)Lclient!afu;", line = 1436)
	@Override
	public Class3_Sub11 method17348(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "lr", descriptor = "(I)Lclient!afu;", line = 1436)
	@Override
	public Class3_Sub11 method17144(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "lz", descriptor = "(I)Lclient!afu;", line = 1436)
	@Override
	public Class3_Sub11 method17141(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "bx", descriptor = "(Lclient!afu;)V", line = 1439)
	@Override
	public void method17084(@OriginalArg(0) Class3_Sub11 arg0) {
	}

	@OriginalMember(owner = "client!abl", name = "hw", descriptor = "(Lclient!afu;)V", line = 1439)
	@Override
	public void method17232(@OriginalArg(0) Class3_Sub11 arg0) {
	}

	@OriginalMember(owner = "client!abl", name = "hy", descriptor = "(Lclient!afu;)V", line = 1439)
	@Override
	public void method17233(@OriginalArg(0) Class3_Sub11 arg0) {
	}

	@OriginalMember(owner = "client!abl", name = "hr", descriptor = "(Lclient!afu;)V", line = 1439)
	@Override
	public void method17137(@OriginalArg(0) Class3_Sub11 arg0) {
	}

	@OriginalMember(owner = "client!abl", name = "bj", descriptor = "(IIZZ)Lclient!co;", line = 1442)
	@Override
	public Class6 method17086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return arg2 ? new Class6_Sub1_Sub3(this, arg0, arg1) : new Class6_Sub1_Sub1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "hf", descriptor = "(IIZZ)Lclient!co;", line = 1442)
	@Override
	public Class6 method17235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return arg2 ? new Class6_Sub1_Sub3(this, arg0, arg1) : new Class6_Sub1_Sub1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "hq", descriptor = "(IIZZ)Lclient!co;", line = 1442)
	@Override
	public Class6 method17237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return arg2 ? new Class6_Sub1_Sub3(this, arg0, arg1) : new Class6_Sub1_Sub1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "hv", descriptor = "(IIZZ)Lclient!co;", line = 1442)
	@Override
	public Class6 method17404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return arg2 ? new Class6_Sub1_Sub3(this, arg0, arg1) : new Class6_Sub1_Sub1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "hp", descriptor = "(IIZZ)Lclient!co;", line = 1442)
	@Override
	public Class6 method17335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		return arg2 ? new Class6_Sub1_Sub3(this, arg0, arg1) : new Class6_Sub1_Sub1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "he", descriptor = "([IIIIIZ)Lclient!co;", line = 1447)
	@Override
	public Class6 method17240(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = arg1;
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
				@Pc(20) int local20 = arg0[local3++] >>> 24;
				if (local20 != 0 && local20 != 255) {
					local1 = true;
					return local1 ? new Class6_Sub1_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5) : new Class6_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
				}
			}
		}
		return local1 ? new Class6_Sub1_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5) : new Class6_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!abl", name = "ht", descriptor = "([IIIIIZ)Lclient!co;", line = 1447)
	@Override
	public Class6 method17280(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = arg1;
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
				@Pc(20) int local20 = arg0[local3++] >>> 24;
				if (local20 != 0 && local20 != 255) {
					local1 = true;
					return local1 ? new Class6_Sub1_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5) : new Class6_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
				}
			}
		}
		return local1 ? new Class6_Sub1_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5) : new Class6_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!abl", name = "bq", descriptor = "([IIIIIZ)Lclient!co;", line = 1447)
	@Override
	public Class6 method17087(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = arg1;
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			for (@Pc(10) int local10 = 0; local10 < arg3; local10++) {
				@Pc(20) int local20 = arg0[local3++] >>> 24;
				if (local20 != 0 && local20 != 255) {
					local1 = true;
					return local1 ? new Class6_Sub1_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5) : new Class6_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
				}
			}
		}
		return local1 ? new Class6_Sub1_Sub3(this, arg0, arg1, arg2, arg3, arg4, arg5) : new Class6_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!abl", name = "bz", descriptor = "(Lclient!dx;Z)Lclient!co;", line = 1463)
	@Override
	public Class6 method17089(@OriginalArg(0) Class15 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int local2 = arg0.method3433();
		@Pc(5) int local5 = arg0.method3440();
		@Pc(80) Class6_Sub1 local80;
		if (arg1 && !arg0.method3432() && arg0.method3465()) {
			@Pc(16) Class15_Sub1 local16 = (Class15_Sub1) arg0;
			@Pc(21) int[] local21 = new int[local16.anIntArray26.length];
			@Pc(26) byte[] local26 = new byte[local5 * local2];
			@Pc(28) int local28;
			for (local28 = 0; local28 < local5; local28++) {
				@Pc(35) int local35 = local2 * local28;
				for (@Pc(37) int local37 = 0; local37 < local2; local37++) {
					local26[local35 + local37] = local16.aByteArray1[local37 + local35];
				}
			}
			for (local28 = 0; local28 < local16.anIntArray26.length; local28++) {
				local21[local28] = local16.anIntArray26[local28];
			}
			local80 = new Class6_Sub1_Sub2(this, local26, local21, local2, local5);
		} else {
			@Pc(85) int[] local85 = arg0.method3448(false);
			if (arg0.method3432()) {
				local80 = new Class6_Sub1_Sub3(this, local85, local2, local5);
			} else {
				local80 = new Class6_Sub1_Sub1(this, local85, local2, local5);
			}
		}
		local80.method16775(arg0.method3453(), arg0.method3431(), arg0.method3436(), arg0.method3437());
		return local80;
	}

	@OriginalMember(owner = "client!abl", name = "hj", descriptor = "(Lclient!dx;Z)Lclient!co;", line = 1463)
	@Override
	public Class6 method17373(@OriginalArg(0) Class15 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int local2 = arg0.method3433();
		@Pc(5) int local5 = arg0.method3440();
		@Pc(80) Class6_Sub1 local80;
		if (arg1 && !arg0.method3432() && arg0.method3465()) {
			@Pc(16) Class15_Sub1 local16 = (Class15_Sub1) arg0;
			@Pc(21) int[] local21 = new int[local16.anIntArray26.length];
			@Pc(26) byte[] local26 = new byte[local5 * local2];
			@Pc(28) int local28;
			for (local28 = 0; local28 < local5; local28++) {
				@Pc(35) int local35 = local2 * local28;
				for (@Pc(37) int local37 = 0; local37 < local2; local37++) {
					local26[local35 + local37] = local16.aByteArray1[local37 + local35];
				}
			}
			for (local28 = 0; local28 < local16.anIntArray26.length; local28++) {
				local21[local28] = local16.anIntArray26[local28];
			}
			local80 = new Class6_Sub1_Sub2(this, local26, local21, local2, local5);
		} else {
			@Pc(85) int[] local85 = arg0.method3448(false);
			if (arg0.method3432()) {
				local80 = new Class6_Sub1_Sub3(this, local85, local2, local5);
			} else {
				local80 = new Class6_Sub1_Sub1(this, local85, local2, local5);
			}
		}
		local80.method16775(arg0.method3453(), arg0.method3431(), arg0.method3436(), arg0.method3437());
		return local80;
	}

	@OriginalMember(owner = "client!abl", name = "li", descriptor = "(IIIIZ)Lclient!co;", line = 1489)
	@Override
	public Class6 method17399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.anIntArray39 == null) {
			throw new IllegalStateException("");
		}
		@Pc(12) int[] local12 = new int[arg2 * arg3];
		@Pc(21) int local21 = arg1 * this.anInt287 * -355627019 + arg0;
		@Pc(28) int local28 = this.anInt287 * -355627019 - arg2;
		for (@Pc(30) int local30 = 0; local30 < arg3; local30++) {
			@Pc(37) int local37 = local30 * arg2;
			for (@Pc(39) int local39 = 0; local39 < arg2; local39++) {
				local12[local37 + local39] = this.anIntArray39[local21++];
			}
			local21 += local28;
		}
		if (arg4) {
			return new Class6_Sub1_Sub3(this, local12, arg2, arg3);
		} else {
			return new Class6_Sub1_Sub1(this, local12, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!abl", name = "ck", descriptor = "(IIIIZ)Lclient!co;", line = 1489)
	@Override
	public Class6 method17090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.anIntArray39 == null) {
			throw new IllegalStateException("");
		}
		@Pc(12) int[] local12 = new int[arg2 * arg3];
		@Pc(21) int local21 = arg1 * this.anInt287 * -355627019 + arg0;
		@Pc(28) int local28 = this.anInt287 * -355627019 - arg2;
		for (@Pc(30) int local30 = 0; local30 < arg3; local30++) {
			@Pc(37) int local37 = local30 * arg2;
			for (@Pc(39) int local39 = 0; local39 < arg2; local39++) {
				local12[local37 + local39] = this.anIntArray39[local21++];
			}
			local21 += local28;
		}
		if (arg4) {
			return new Class6_Sub1_Sub3(this, local12, arg2, arg3);
		} else {
			return new Class6_Sub1_Sub1(this, local12, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!abl", name = "lb", descriptor = "(IIIIZ)Lclient!co;", line = 1489)
	@Override
	public Class6 method17340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.anIntArray39 == null) {
			throw new IllegalStateException("");
		}
		@Pc(12) int[] local12 = new int[arg2 * arg3];
		@Pc(21) int local21 = arg1 * this.anInt287 * -355627019 + arg0;
		@Pc(28) int local28 = this.anInt287 * -355627019 - arg2;
		for (@Pc(30) int local30 = 0; local30 < arg3; local30++) {
			@Pc(37) int local37 = local30 * arg2;
			for (@Pc(39) int local39 = 0; local39 < arg2; local39++) {
				local12[local37 + local39] = this.anIntArray39[local21++];
			}
			local21 += local28;
		}
		if (arg4) {
			return new Class6_Sub1_Sub3(this, local12, arg2, arg3);
		} else {
			return new Class6_Sub1_Sub1(this, local12, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!abl", name = "lf", descriptor = "(IIIIZ)Lclient!co;", line = 1489)
	@Override
	public Class6 method17195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.anIntArray39 == null) {
			throw new IllegalStateException("");
		}
		@Pc(12) int[] local12 = new int[arg2 * arg3];
		@Pc(21) int local21 = arg1 * this.anInt287 * -355627019 + arg0;
		@Pc(28) int local28 = this.anInt287 * -355627019 - arg2;
		for (@Pc(30) int local30 = 0; local30 < arg3; local30++) {
			@Pc(37) int local37 = local30 * arg2;
			for (@Pc(39) int local39 = 0; local39 < arg2; local39++) {
				local12[local37 + local39] = this.anIntArray39[local21++];
			}
			local21 += local28;
		}
		if (arg4) {
			return new Class6_Sub1_Sub3(this, local12, arg2, arg3);
		} else {
			return new Class6_Sub1_Sub1(this, local12, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!abl", name = "cv", descriptor = "(II[I[I)Lclient!ch;", line = 1505)
	@Override
	public Class5 method17094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class5_Sub3(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!abl", name = "hu", descriptor = "(II[I[I)Lclient!ch;", line = 1505)
	@Override
	public Class5 method17127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class5_Sub3(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!abl", name = "hl", descriptor = "(ILclient!ch;II)V", line = 1509)
	@Override
	public void method17243(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(6) Class5_Sub3 local6 = (Class5_Sub3) arg1;
		@Pc(9) int[] local9 = local6.anIntArray11;
		@Pc(12) int[] local12 = local6.anIntArray12;
		@Pc(28) int local28;
		if (this.anInt274 * 2066290591 < local9.length + arg3) {
			local28 = this.anInt274 * 2066290591 - arg3;
		} else {
			local28 = local9.length;
		}
		@Pc(45) int local45;
		if (this.anInt273 * 1850088287 > arg3) {
			local45 = this.anInt273 * 1850088287 - arg3;
			arg3 = this.anInt273 * 1850088287;
		} else {
			local45 = 0;
		}
		if (local28 - local45 <= 0) {
			return;
		}
		@Pc(65) int local65 = this.anInt287 * -355627019 * arg3;
		for (@Pc(67) int local67 = local45; local67 < local28; local67++) {
			@Pc(76) int local76 = arg2 + local9[local67];
			@Pc(80) int local80 = local12[local67];
			if (this.anInt272 * 45613833 > local76) {
				local80 -= this.anInt272 * 45613833 - local76;
				local76 = this.anInt272 * 45613833;
			}
			if (this.anInt278 * -886740031 < local80 + local76) {
				local80 = this.anInt278 * -886740031 - local76;
			}
			local76 += local65;
			for (@Pc(122) int local122 = -local80; local122 < 0; local122++) {
				this.anIntArray39[local76++] = arg0;
			}
			local65 += this.anInt287 * -355627019;
		}
	}

	@OriginalMember(owner = "client!abl", name = "cl", descriptor = "(ILclient!ch;II)V", line = 1509)
	@Override
	public void method17095(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(6) Class5_Sub3 local6 = (Class5_Sub3) arg1;
		@Pc(9) int[] local9 = local6.anIntArray11;
		@Pc(12) int[] local12 = local6.anIntArray12;
		@Pc(28) int local28;
		if (this.anInt274 * 2066290591 < local9.length + arg3) {
			local28 = this.anInt274 * 2066290591 - arg3;
		} else {
			local28 = local9.length;
		}
		@Pc(45) int local45;
		if (this.anInt273 * 1850088287 > arg3) {
			local45 = this.anInt273 * 1850088287 - arg3;
			arg3 = this.anInt273 * 1850088287;
		} else {
			local45 = 0;
		}
		if (local28 - local45 <= 0) {
			return;
		}
		@Pc(65) int local65 = this.anInt287 * -355627019 * arg3;
		for (@Pc(67) int local67 = local45; local67 < local28; local67++) {
			@Pc(76) int local76 = arg2 + local9[local67];
			@Pc(80) int local80 = local12[local67];
			if (this.anInt272 * 45613833 > local76) {
				local80 -= this.anInt272 * 45613833 - local76;
				local76 = this.anInt272 * 45613833;
			}
			if (this.anInt278 * -886740031 < local80 + local76) {
				local80 = this.anInt278 * -886740031 - local76;
			}
			local76 += local65;
			for (@Pc(122) int local122 = -local80; local122 < 0; local122++) {
				this.anIntArray39[local76++] = arg0;
			}
			local65 += this.anInt287 * -355627019;
		}
	}

	@OriginalMember(owner = "client!abl", name = "ik", descriptor = "(ILclient!ch;II)V", line = 1509)
	@Override
	public void method17327(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(6) Class5_Sub3 local6 = (Class5_Sub3) arg1;
		@Pc(9) int[] local9 = local6.anIntArray11;
		@Pc(12) int[] local12 = local6.anIntArray12;
		@Pc(28) int local28;
		if (this.anInt274 * 2066290591 < local9.length + arg3) {
			local28 = this.anInt274 * 2066290591 - arg3;
		} else {
			local28 = local9.length;
		}
		@Pc(45) int local45;
		if (this.anInt273 * 1850088287 > arg3) {
			local45 = this.anInt273 * 1850088287 - arg3;
			arg3 = this.anInt273 * 1850088287;
		} else {
			local45 = 0;
		}
		if (local28 - local45 <= 0) {
			return;
		}
		@Pc(65) int local65 = this.anInt287 * -355627019 * arg3;
		for (@Pc(67) int local67 = local45; local67 < local28; local67++) {
			@Pc(76) int local76 = arg2 + local9[local67];
			@Pc(80) int local80 = local12[local67];
			if (this.anInt272 * 45613833 > local76) {
				local80 -= this.anInt272 * 45613833 - local76;
				local76 = this.anInt272 * 45613833;
			}
			if (this.anInt278 * -886740031 < local80 + local76) {
				local80 = this.anInt278 * -886740031 - local76;
			}
			local76 += local65;
			for (@Pc(122) int local122 = -local80; local122 < 0; local122++) {
				this.anIntArray39[local76++] = arg0;
			}
			local65 += this.anInt287 * -355627019;
		}
	}

	@OriginalMember(owner = "client!abl", name = "id", descriptor = "(ILclient!ch;II)V", line = 1509)
	@Override
	public void method17245(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray39 == null) {
			return;
		}
		@Pc(6) Class5_Sub3 local6 = (Class5_Sub3) arg1;
		@Pc(9) int[] local9 = local6.anIntArray11;
		@Pc(12) int[] local12 = local6.anIntArray12;
		@Pc(28) int local28;
		if (this.anInt274 * 2066290591 < local9.length + arg3) {
			local28 = this.anInt274 * 2066290591 - arg3;
		} else {
			local28 = local9.length;
		}
		@Pc(45) int local45;
		if (this.anInt273 * 1850088287 > arg3) {
			local45 = this.anInt273 * 1850088287 - arg3;
			arg3 = this.anInt273 * 1850088287;
		} else {
			local45 = 0;
		}
		if (local28 - local45 <= 0) {
			return;
		}
		@Pc(65) int local65 = this.anInt287 * -355627019 * arg3;
		for (@Pc(67) int local67 = local45; local67 < local28; local67++) {
			@Pc(76) int local76 = arg2 + local9[local67];
			@Pc(80) int local80 = local12[local67];
			if (this.anInt272 * 45613833 > local76) {
				local80 -= this.anInt272 * 45613833 - local76;
				local76 = this.anInt272 * 45613833;
			}
			if (this.anInt278 * -886740031 < local80 + local76) {
				local80 = this.anInt278 * -886740031 - local76;
			}
			local76 += local65;
			for (@Pc(122) int local122 = -local80; local122 < 0; local122++) {
				this.anIntArray39[local76++] = arg0;
			}
			local65 += this.anInt287 * -355627019;
		}
	}

	@OriginalMember(owner = "client!abl", name = "cq", descriptor = "(Lclient!yx;[Lclient!abc;Z)Lclient!dw;", line = 1539)
	@Override
	public Class14 method17096(@OriginalArg(0) Class611 arg0, @OriginalArg(1) Class15_Sub1[] arg1, @OriginalArg(2) boolean arg2) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].method3433();
			local7[local11] = arg1[local11].method3440();
			if (arg1[local11].method3432()) {
				local9 = true;
			}
		}
		if (arg2) {
			if (local9) {
				return new Class14_Sub3(this, arg0, arg1, local3, local7);
			} else {
				return new Class14_Sub1(this, arg0, arg1, local3, local7);
			}
		} else if (local9) {
			throw new IllegalArgumentException("");
		} else {
			return new Class14_Sub5(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!abl", name = "il", descriptor = "(Lclient!yx;[Lclient!abc;Z)Lclient!dw;", line = 1539)
	@Override
	public Class14 method17246(@OriginalArg(0) Class611 arg0, @OriginalArg(1) Class15_Sub1[] arg1, @OriginalArg(2) boolean arg2) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].method3433();
			local7[local11] = arg1[local11].method3440();
			if (arg1[local11].method3432()) {
				local9 = true;
			}
		}
		if (arg2) {
			if (local9) {
				return new Class14_Sub3(this, arg0, arg1, local3, local7);
			} else {
				return new Class14_Sub1(this, arg0, arg1, local3, local7);
			}
		} else if (local9) {
			throw new IllegalArgumentException("");
		} else {
			return new Class14_Sub5(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!abl", name = "cc", descriptor = "(I)V", line = 1558)
	@Override
	public void method17343(@OriginalArg(0) int arg0) {
		Class20_Sub3.anInt547 = arg0;
		Class20_Sub3.anInt559 = arg0;
		if (this.anInt276 * -570787021 > 1) {
			throw new IllegalStateException();
		}
		this.method3191(this.anInt276 * -570787021);
		this.method3164(0);
	}

	@OriginalMember(owner = "client!abl", name = "iu", descriptor = "(I)V", line = 1558)
	@Override
	public void method17247(@OriginalArg(0) int arg0) {
		Class20_Sub3.anInt547 = arg0;
		Class20_Sub3.anInt559 = arg0;
		if (this.anInt276 * -570787021 > 1) {
			throw new IllegalStateException();
		}
		this.method3191(this.anInt276 * -570787021);
		this.method3164(0);
	}

	@OriginalMember(owner = "client!abl", name = "cs", descriptor = "(Lclient!dy;IIII)Lclient!dh;", line = 1565)
	@Override
	public Class20 method17100(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class20_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!abl", name = "iq", descriptor = "(Lclient!dy;IIII)Lclient!dh;", line = 1565)
	@Override
	public Class20 method17146(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class20_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!abl", name = "ct", descriptor = "(II)I", line = 1569)
	@Override
	public int method17117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!abl", name = "im", descriptor = "(II)I", line = 1569)
	@Override
	public int method17173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!abl", name = "ir", descriptor = "(II)I", line = 1569)
	@Override
	public int method17250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!abl", name = "ig", descriptor = "(II)I", line = 1569)
	@Override
	public int method17251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!abl", name = "cx", descriptor = "(II)I", line = 1574)
	@Override
	public int method17102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!abl", name = "ip", descriptor = "(II)I", line = 1574)
	@Override
	public int method17338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!abl", name = "cy", descriptor = "(II[[I[[IIII)Lclient!ci;", line = 1578)
	@Override
	public Class17 method17273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class17_Sub2(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!abl", name = "ix", descriptor = "(II[[I[[IIII)Lclient!ci;", line = 1578)
	@Override
	public Class17 method17253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		return new Class17_Sub2(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!abl", name = "if", descriptor = "()Lclient!mq;", line = 1582)
	@Override
	public Class328 method17381() {
		@Pc(3) Class12 local3 = this.method3165(Thread.currentThread());
		return local3.aClass328_1;
	}

	@OriginalMember(owner = "client!abl", name = "in", descriptor = "()Lclient!mq;", line = 1582)
	@Override
	public Class328 method17254() {
		@Pc(3) Class12 local3 = this.method3165(Thread.currentThread());
		return local3.aClass328_1;
	}

	@OriginalMember(owner = "client!abl", name = "cg", descriptor = "()Lclient!mq;", line = 1582)
	@Override
	public Class328 method17333() {
		@Pc(3) Class12 local3 = this.method3165(Thread.currentThread());
		return local3.aClass328_1;
	}

	@OriginalMember(owner = "client!abl", name = "ia", descriptor = "()Lclient!mq;", line = 1582)
	@Override
	public Class328 method17255() {
		@Pc(3) Class12 local3 = this.method3165(Thread.currentThread());
		return local3.aClass328_1;
	}

	@OriginalMember(owner = "client!abl", name = "ih", descriptor = "()Lclient!mq;", line = 1582)
	@Override
	public Class328 method17169() {
		@Pc(3) Class12 local3 = this.method3165(Thread.currentThread());
		return local3.aClass328_1;
	}

	@OriginalMember(owner = "client!abl", name = "iy", descriptor = "()Lclient!mu;", line = 1587)
	@Override
	public Class332 method17238() {
		@Pc(3) Class12 local3 = this.method3165(Thread.currentThread());
		return local3.aClass332_1;
	}

	@OriginalMember(owner = "client!abl", name = "cp", descriptor = "()Lclient!mu;", line = 1587)
	@Override
	public Class332 method17098() {
		@Pc(3) Class12 local3 = this.method3165(Thread.currentThread());
		return local3.aClass332_1;
	}

	@OriginalMember(owner = "client!abl", name = "ij", descriptor = "()Lclient!mu;", line = 1587)
	@Override
	public Class332 method17258() {
		@Pc(3) Class12 local3 = this.method3165(Thread.currentThread());
		return local3.aClass332_1;
	}

	@OriginalMember(owner = "client!abl", name = "is", descriptor = "()Lclient!mu;", line = 1587)
	@Override
	public Class332 method17260() {
		@Pc(3) Class12 local3 = this.method3165(Thread.currentThread());
		return local3.aClass332_1;
	}

	@OriginalMember(owner = "client!abl", name = "it", descriptor = "()Lclient!mu;", line = 1587)
	@Override
	public Class332 method17185() {
		@Pc(3) Class12 local3 = this.method3165(Thread.currentThread());
		return local3.aClass332_1;
	}

	@OriginalMember(owner = "client!abl", name = "cf", descriptor = "()I", line = 1592)
	@Override
	public int method17023() {
		return 0;
	}

	@OriginalMember(owner = "client!abl", name = "iw", descriptor = "()I", line = 1592)
	@Override
	public int method17375() {
		return 0;
	}

	@OriginalMember(owner = "client!abl", name = "ii", descriptor = "()I", line = 1592)
	@Override
	public int method17378() {
		return 0;
	}

	@OriginalMember(owner = "client!abl", name = "dv", descriptor = "(IIIIIF)Lclient!afz;", line = 1596)
	@Override
	public Class3_Sub15 method17311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "iv", descriptor = "(IIIIIF)Lclient!afz;", line = 1596)
	@Override
	public Class3_Sub15 method17264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "iz", descriptor = "(IIIIIF)Lclient!afz;", line = 1596)
	@Override
	public Class3_Sub15 method17318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "lg", descriptor = "(I[Lclient!afz;)V", line = 1599)
	@Override
	public void method17342(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15[] arg1) {
	}

	@OriginalMember(owner = "client!abl", name = "df", descriptor = "(I[Lclient!afz;)V", line = 1599)
	@Override
	public void method17310(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15[] arg1) {
	}

	@OriginalMember(owner = "client!abl", name = "pe", descriptor = "(I)V", line = 1602)
	void method3164(@OriginalArg(0) int arg0) {
		this.aClass12Array1[arg0].method1244(Thread.currentThread());
	}

	@OriginalMember(owner = "client!abl", name = "qd", descriptor = "(I)V", line = 1602)
	void method3173(@OriginalArg(0) int arg0) {
		this.aClass12Array1[arg0].method1244(Thread.currentThread());
	}

	@OriginalMember(owner = "client!abl", name = "qv", descriptor = "(I)V", line = 1602)
	void method3177(@OriginalArg(0) int arg0) {
		this.aClass12Array1[arg0].method1244(Thread.currentThread());
	}

	@OriginalMember(owner = "client!abl", name = "qo", descriptor = "(I)V", line = 1602)
	void method3195(@OriginalArg(0) int arg0) {
		this.aClass12Array1[arg0].method1244(Thread.currentThread());
	}

	@OriginalMember(owner = "client!abl", name = "qp", descriptor = "(I)V", line = 1602)
	void method3208(@OriginalArg(0) int arg0) {
		this.aClass12Array1[arg0].method1244(Thread.currentThread());
	}

	@OriginalMember(owner = "client!abl", name = "qq", descriptor = "(I)V", line = 1602)
	void method3209(@OriginalArg(0) int arg0) {
		this.aClass12Array1[arg0].method1244(Thread.currentThread());
	}

	@OriginalMember(owner = "client!abl", name = "ql", descriptor = "(I)V", line = 1606)
	void method3188(@OriginalArg(0) int arg0) {
		this.anInt276 = arg0 * 1061812219;
		this.aClass12Array1 = new Class12[this.anInt276 * -570787021];
		for (@Pc(13) int local13 = 0; local13 < this.anInt276 * -570787021; local13++) {
			this.aClass12Array1[local13] = new Class12(this);
		}
	}

	@OriginalMember(owner = "client!abl", name = "pw", descriptor = "(I)V", line = 1606)
	void method3191(@OriginalArg(0) int arg0) {
		this.anInt276 = arg0 * 1061812219;
		this.aClass12Array1 = new Class12[this.anInt276 * -570787021];
		for (@Pc(13) int local13 = 0; local13 < this.anInt276 * -570787021; local13++) {
			this.aClass12Array1[local13] = new Class12(this);
		}
	}

	@OriginalMember(owner = "client!abl", name = "qn", descriptor = "(I)V", line = 1606)
	void method3196(@OriginalArg(0) int arg0) {
		this.anInt276 = arg0 * 1061812219;
		this.aClass12Array1 = new Class12[this.anInt276 * -570787021];
		for (@Pc(13) int local13 = 0; local13 < this.anInt276 * -570787021; local13++) {
			this.aClass12Array1[local13] = new Class12(this);
		}
	}

	@OriginalMember(owner = "client!abl", name = "rz", descriptor = "(I)V", line = 1606)
	void method3198(@OriginalArg(0) int arg0) {
		this.anInt276 = arg0 * 1061812219;
		this.aClass12Array1 = new Class12[this.anInt276 * -570787021];
		for (@Pc(13) int local13 = 0; local13 < this.anInt276 * -570787021; local13++) {
			this.aClass12Array1[local13] = new Class12(this);
		}
	}

	@OriginalMember(owner = "client!abl", name = "py", descriptor = "(Ljava/lang/Runnable;)Lclient!ab;", line = 1614)
	Class12 method3165(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt276 * -570787021; local1++) {
			if (this.aClass12Array1[local1].aRunnable1 == arg0) {
				return this.aClass12Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "rj", descriptor = "(Ljava/lang/Runnable;)Lclient!ab;", line = 1614)
	Class12 method3170(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt276 * -570787021; local1++) {
			if (this.aClass12Array1[local1].aRunnable1 == arg0) {
				return this.aClass12Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "rp", descriptor = "(Ljava/lang/Runnable;)Lclient!ab;", line = 1614)
	Class12 method3199(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt276 * -570787021; local1++) {
			if (this.aClass12Array1[local1].aRunnable1 == arg0) {
				return this.aClass12Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "io", descriptor = "(Lclient!dk;)V", line = 1621)
	@Override
	public void method17266(@OriginalArg(0) Class128 arg0) {
		this.method3166(this.anIntArray39 != null, this.aFloatArray21 != null, false, arg0);
	}

	@OriginalMember(owner = "client!abl", name = "cz", descriptor = "(Lclient!dk;)V", line = 1621)
	@Override
	public void method17105(@OriginalArg(0) Class128 arg0) {
		this.method3166(this.anIntArray39 != null, this.aFloatArray21 != null, false, arg0);
	}

	@OriginalMember(owner = "client!abl", name = "pv", descriptor = "(ZZZLclient!dk;)V", line = 1626)
	void method3166(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class128 arg3) {
		@Pc(3) Class12 local3 = this.method3165(Thread.currentThread());
		for (@Pc(9) Class53_Sub1_Sub1 local9 = (Class53_Sub1_Sub1) arg3.aClass551_1.method32691(); local9 != null; local9 = (Class53_Sub1_Sub1) arg3.aClass551_1.method32684()) {
			@Pc(16) int local16 = local9.anInt2819 >> 12;
			@Pc(21) int local21 = local9.anInt2814 >> 12;
			@Pc(26) int local26 = local9.anInt2816 >> 12;
			@Pc(59) float local59 = (float) local26 * this.aClass328_5.aFloatArray106[10] + (float) local16 * this.aClass328_5.aFloatArray106[2] + (float) local21 * this.aClass328_5.aFloatArray106[6] + this.aClass328_5.aFloatArray106[14];
			@Pc(92) float local92 = this.aClass328_5.aFloatArray106[15] + (float) local26 * this.aClass328_5.aFloatArray106[11] + this.aClass328_5.aFloatArray106[7] * (float) local21 + (float) local16 * this.aClass328_5.aFloatArray106[3];
			if (!(local59 < -local92)) {
				@Pc(108) float local108 = local59 * this.aFloat21 / local92 + this.aFloat18;
				if (!(local59 > local3.aFloat5)) {
					@Pc(147) float local147 = this.aClass328_5.aFloatArray106[12] + this.aClass328_5.aFloatArray106[8] * (float) local26 + this.aClass328_5.aFloatArray106[4] * (float) local21 + (float) local16 * this.aClass328_5.aFloatArray106[0];
					@Pc(180) float local180 = this.aClass328_5.aFloatArray106[5] * (float) local21 + (float) local16 * this.aClass328_5.aFloatArray106[1] + this.aClass328_5.aFloatArray106[9] * (float) local26 + this.aClass328_5.aFloatArray106[13];
					if (!(local147 < -local92) && !(local147 > local92) && !(local180 < -local92) && !(local180 > local92)) {
						@Pc(205) float local205 = (float) local9.anInt2817 / 4096.0F;
						@Pc(215) float local215 = local147 + this.aClass328_4.aFloatArray106[0] * local205;
						@Pc(225) float local225 = local205 * this.aClass328_4.aFloatArray106[3] + local92;
						@Pc(235) float local235 = this.aFloat19 + this.aFloat22 * local147 / local92;
						@Pc(245) float local245 = local180 * this.aFloat20 / local92 + this.aFloat17;
						@Pc(255) float local255 = this.aFloat22 * local215 / local225 + this.aFloat19;
						this.method3167(arg0, arg1, arg2, local9, (int) local235, (int) local245, local108, (int) (local255 < local235 ? local235 - local255 : local255 - local235));
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abl", name = "ry", descriptor = "(ZZZLclient!dk;)V", line = 1626)
	void method3200(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class128 arg3) {
		@Pc(3) Class12 local3 = this.method3165(Thread.currentThread());
		for (@Pc(9) Class53_Sub1_Sub1 local9 = (Class53_Sub1_Sub1) arg3.aClass551_1.method32691(); local9 != null; local9 = (Class53_Sub1_Sub1) arg3.aClass551_1.method32684()) {
			@Pc(16) int local16 = local9.anInt2819 >> 12;
			@Pc(21) int local21 = local9.anInt2814 >> 12;
			@Pc(26) int local26 = local9.anInt2816 >> 12;
			@Pc(59) float local59 = (float) local26 * this.aClass328_5.aFloatArray106[10] + (float) local16 * this.aClass328_5.aFloatArray106[2] + (float) local21 * this.aClass328_5.aFloatArray106[6] + this.aClass328_5.aFloatArray106[14];
			@Pc(92) float local92 = this.aClass328_5.aFloatArray106[15] + (float) local26 * this.aClass328_5.aFloatArray106[11] + this.aClass328_5.aFloatArray106[7] * (float) local21 + (float) local16 * this.aClass328_5.aFloatArray106[3];
			if (!(local59 < -local92)) {
				@Pc(108) float local108 = local59 * this.aFloat21 / local92 + this.aFloat18;
				if (!(local59 > local3.aFloat5)) {
					@Pc(147) float local147 = this.aClass328_5.aFloatArray106[12] + this.aClass328_5.aFloatArray106[8] * (float) local26 + this.aClass328_5.aFloatArray106[4] * (float) local21 + (float) local16 * this.aClass328_5.aFloatArray106[0];
					@Pc(180) float local180 = this.aClass328_5.aFloatArray106[5] * (float) local21 + (float) local16 * this.aClass328_5.aFloatArray106[1] + this.aClass328_5.aFloatArray106[9] * (float) local26 + this.aClass328_5.aFloatArray106[13];
					if (!(local147 < -local92) && !(local147 > local92) && !(local180 < -local92) && !(local180 > local92)) {
						@Pc(205) float local205 = (float) local9.anInt2817 / 4096.0F;
						@Pc(215) float local215 = local147 + this.aClass328_4.aFloatArray106[0] * local205;
						@Pc(225) float local225 = local205 * this.aClass328_4.aFloatArray106[3] + local92;
						@Pc(235) float local235 = this.aFloat19 + this.aFloat22 * local147 / local92;
						@Pc(245) float local245 = local180 * this.aFloat20 / local92 + this.aFloat17;
						@Pc(255) float local255 = this.aFloat22 * local215 / local225 + this.aFloat19;
						this.method3167(arg0, arg1, arg2, local9, (int) local235, (int) local245, local108, (int) (local255 < local235 ? local235 - local255 : local255 - local235));
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abl", name = "px", descriptor = "(ZZZLclient!alj;IIFI)V", line = 1651)
	void method3167(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class53_Sub1_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7) {
		@Pc(2) int local2 = arg3.anInt2818;
		@Pc(8) int local8 = arg7 << 1;
		if (local2 == -1) {
			this.method3158(arg1, arg4, arg5, arg6, arg7, arg3.anInt2815, 1);
			return;
		}
		if (local2 != this.anInt285 * 775558015) {
			@Pc(35) Class6 local35 = (Class6) this.aClass161_1.method23219((long) local2);
			if (local35 == null) {
				@Pc(44) Class133 local44 = this.aClass134_7.method22906(local2);
				@Pc(52) int[] local52 = this.method3194(local2, local44.anInt3351 * -1410868471);
				if (local52 == null) {
					return;
				}
				@Pc(59) int local59 = local44.anInt3355 * -1912965795;
				local35 = this.method17113(local52, 0, local59, local59, local59);
				this.aClass161_1.method23222(local35, (long) local2);
			}
			this.anInt285 = local2 * 1936305279;
			this.aClass6_2 = local35;
		}
		local8++;
		((Class6_Sub1) this.aClass6_2).method16855(arg0, arg1, arg2, arg4 - arg7, arg5 - arg7, arg6, local8, local8, 0, arg3.anInt2815, 1, false);
	}

	@OriginalMember(owner = "client!abl", name = "rr", descriptor = "(ZZZLclient!alj;IIFI)V", line = 1651)
	void method3201(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class53_Sub1_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7) {
		@Pc(2) int local2 = arg3.anInt2818;
		@Pc(8) int local8 = arg7 << 1;
		if (local2 == -1) {
			this.method3158(arg1, arg4, arg5, arg6, arg7, arg3.anInt2815, 1);
			return;
		}
		if (local2 != this.anInt285 * 775558015) {
			@Pc(35) Class6 local35 = (Class6) this.aClass161_1.method23219((long) local2);
			if (local35 == null) {
				@Pc(44) Class133 local44 = this.aClass134_7.method22906(local2);
				@Pc(52) int[] local52 = this.method3194(local2, local44.anInt3351 * -1410868471);
				if (local52 == null) {
					return;
				}
				@Pc(59) int local59 = local44.anInt3355 * -1912965795;
				local35 = this.method17113(local52, 0, local59, local59, local59);
				this.aClass161_1.method23222(local35, (long) local2);
			}
			this.anInt285 = local2 * 1936305279;
			this.aClass6_2 = local35;
		}
		local8++;
		((Class6_Sub1) this.aClass6_2).method16855(arg0, arg1, arg2, arg4 - arg7, arg5 - arg7, arg6, local8, local8, 0, arg3.anInt2815, 1, false);
	}

	@OriginalMember(owner = "client!abl", name = "ri", descriptor = "(ZZZLclient!alj;IIFI)V", line = 1651)
	void method3202(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class53_Sub1_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7) {
		@Pc(2) int local2 = arg3.anInt2818;
		@Pc(8) int local8 = arg7 << 1;
		if (local2 == -1) {
			this.method3158(arg1, arg4, arg5, arg6, arg7, arg3.anInt2815, 1);
			return;
		}
		if (local2 != this.anInt285 * 775558015) {
			@Pc(35) Class6 local35 = (Class6) this.aClass161_1.method23219((long) local2);
			if (local35 == null) {
				@Pc(44) Class133 local44 = this.aClass134_7.method22906(local2);
				@Pc(52) int[] local52 = this.method3194(local2, local44.anInt3351 * -1410868471);
				if (local52 == null) {
					return;
				}
				@Pc(59) int local59 = local44.anInt3355 * -1912965795;
				local35 = this.method17113(local52, 0, local59, local59, local59);
				this.aClass161_1.method23222(local35, (long) local2);
			}
			this.anInt285 = local2 * 1936305279;
			this.aClass6_2 = local35;
		}
		local8++;
		((Class6_Sub1) this.aClass6_2).method16855(arg0, arg1, arg2, arg4 - arg7, arg5 - arg7, arg6, local8, local8, 0, arg3.anInt2815, 1, false);
	}

	@OriginalMember(owner = "client!abl", name = "rw", descriptor = "(ZZZIIFIISIII)V", line = 1678)
	void method3203(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg6 == 0 || arg7 == 0) {
			return;
		}
		if (arg8 != -1) {
			@Pc(13) Class133 local13 = this.aClass134_7.method22906(arg8);
			if (!local13.aBoolean620) {
				if (arg8 != this.anInt285 * 775558015) {
					@Pc(29) Class6 local29 = (Class6) this.aClass161_1.method23219((long) arg8);
					if (local29 == null) {
						@Pc(39) int[] local39 = this.method3194(arg8, local13.anInt3351 * -1410868471);
						if (local39 == null) {
							return;
						}
						@Pc(47) int local47 = local13.anInt3355 * -1912965795;
						local29 = this.method17113(local39, 0, local47, local47, local47);
						this.aClass161_1.method23222(local29, (long) arg8);
					}
					this.anInt285 = arg8 * 1936305279;
					this.aClass6_2 = local29;
				}
				((Class6_Sub1) this.aClass6_2).method16855(arg0, arg1, arg2, arg3 - arg6, arg4 - arg7, arg5, arg6 << 1, arg7 << 1, arg10, arg9, arg11, Class458.aClass458_5 != local13.aClass458_2);
				return;
			}
		}
		this.method3158(arg1, arg3, arg4, arg5, arg6, arg9, arg11);
	}

	@OriginalMember(owner = "client!abl", name = "ro", descriptor = "(ZZZIIFIISIII)V", line = 1678)
	void method3204(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg6 == 0 || arg7 == 0) {
			return;
		}
		if (arg8 != -1) {
			@Pc(13) Class133 local13 = this.aClass134_7.method22906(arg8);
			if (!local13.aBoolean620) {
				if (arg8 != this.anInt285 * 775558015) {
					@Pc(29) Class6 local29 = (Class6) this.aClass161_1.method23219((long) arg8);
					if (local29 == null) {
						@Pc(39) int[] local39 = this.method3194(arg8, local13.anInt3351 * -1410868471);
						if (local39 == null) {
							return;
						}
						@Pc(47) int local47 = local13.anInt3355 * -1912965795;
						local29 = this.method17113(local39, 0, local47, local47, local47);
						this.aClass161_1.method23222(local29, (long) arg8);
					}
					this.anInt285 = arg8 * 1936305279;
					this.aClass6_2 = local29;
				}
				((Class6_Sub1) this.aClass6_2).method16855(arg0, arg1, arg2, arg3 - arg6, arg4 - arg7, arg5, arg6 << 1, arg7 << 1, arg10, arg9, arg11, Class458.aClass458_5 != local13.aClass458_2);
				return;
			}
		}
		this.method3158(arg1, arg3, arg4, arg5, arg6, arg9, arg11);
	}

	@OriginalMember(owner = "client!abl", name = "pf", descriptor = "(ZZZIIFIISIII)V", line = 1678)
	void method3206(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg6 == 0 || arg7 == 0) {
			return;
		}
		if (arg8 != -1) {
			@Pc(13) Class133 local13 = this.aClass134_7.method22906(arg8);
			if (!local13.aBoolean620) {
				if (arg8 != this.anInt285 * 775558015) {
					@Pc(29) Class6 local29 = (Class6) this.aClass161_1.method23219((long) arg8);
					if (local29 == null) {
						@Pc(39) int[] local39 = this.method3194(arg8, local13.anInt3351 * -1410868471);
						if (local39 == null) {
							return;
						}
						@Pc(47) int local47 = local13.anInt3355 * -1912965795;
						local29 = this.method17113(local39, 0, local47, local47, local47);
						this.aClass161_1.method23222(local29, (long) arg8);
					}
					this.anInt285 = arg8 * 1936305279;
					this.aClass6_2 = local29;
				}
				((Class6_Sub1) this.aClass6_2).method16855(arg0, arg1, arg2, arg3 - arg6, arg4 - arg7, arg5, arg6 << 1, arg7 << 1, arg10, arg9, arg11, Class458.aClass458_5 != local13.aClass458_2);
				return;
			}
		}
		this.method3158(arg1, arg3, arg4, arg5, arg6, arg9, arg11);
	}

	@OriginalMember(owner = "client!abl", name = "rc", descriptor = "(ZZZIIFIISIII)V", line = 1678)
	void method3213(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg6 == 0 || arg7 == 0) {
			return;
		}
		if (arg8 != -1) {
			@Pc(13) Class133 local13 = this.aClass134_7.method22906(arg8);
			if (!local13.aBoolean620) {
				if (arg8 != this.anInt285 * 775558015) {
					@Pc(29) Class6 local29 = (Class6) this.aClass161_1.method23219((long) arg8);
					if (local29 == null) {
						@Pc(39) int[] local39 = this.method3194(arg8, local13.anInt3351 * -1410868471);
						if (local39 == null) {
							return;
						}
						@Pc(47) int local47 = local13.anInt3355 * -1912965795;
						local29 = this.method17113(local39, 0, local47, local47, local47);
						this.aClass161_1.method23222(local29, (long) arg8);
					}
					this.anInt285 = arg8 * 1936305279;
					this.aClass6_2 = local29;
				}
				((Class6_Sub1) this.aClass6_2).method16855(arg0, arg1, arg2, arg3 - arg6, arg4 - arg7, arg5, arg6 << 1, arg7 << 1, arg10, arg9, arg11, Class458.aClass458_5 != local13.aClass458_2);
				return;
			}
		}
		this.method3158(arg1, arg3, arg4, arg5, arg6, arg9, arg11);
	}

	@OriginalMember(owner = "client!abl", name = "pa", descriptor = "(ZIIFIII)V", line = 1703)
	void method3158(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg4 < 0) {
			arg4 = -arg4;
		}
		@Pc(12) int local12 = arg2 - arg4;
		if (local12 < this.anInt273 * 1850088287) {
			local12 = this.anInt273 * 1850088287;
		}
		@Pc(29) int local29 = arg4 + arg2 + 1;
		if (local29 > this.anInt274 * 2066290591) {
			local29 = this.anInt274 * 2066290591;
		}
		@Pc(42) int local42 = local12;
		@Pc(46) int local46 = arg4 * arg4;
		@Pc(48) int local48 = 0;
		@Pc(52) int local52 = arg2 - local12;
		@Pc(56) int local56 = local52 * local52;
		@Pc(60) int local60 = local56 - local52;
		if (arg2 > local29) {
			arg2 = local29;
		}
		@Pc(69) int local69 = arg5 >>> 24;
		@Pc(107) int local107;
		@Pc(122) int local122;
		@Pc(142) int local142;
		@Pc(144) int local144;
		if (arg6 == 0 || arg6 == 1 && local69 == 255) {
			while (local42 < arg2) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local107 = arg1 - local48 + 1;
				if (local107 < this.anInt272 * 45613833) {
					local107 = this.anInt272 * 45613833;
				}
				local122 = local48 + arg1;
				if (local122 > this.anInt278 * -886740031) {
					local122 = this.anInt278 * -886740031;
				}
				local142 = this.anInt287 * -355627019 * local42 + local107;
				for (local144 = local107; local144 < local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray21[local142]) {
						this.anIntArray39[local142] = arg5;
					}
					local142++;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg4;
			local52 = local42 - arg2;
			local60 = local46 + local52 * local52;
			local56 = local60 - arg4;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local107 = arg1 - local48;
				if (local107 < this.anInt272 * 45613833) {
					local107 = this.anInt272 * 45613833;
				}
				local122 = local48 + arg1;
				if (local122 > this.anInt278 * -886740031 - 1) {
					local122 = this.anInt278 * -886740031 - 1;
				}
				local142 = local107 + local42 * this.anInt287 * -355627019;
				for (local144 = local107; local144 <= local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray21[local142]) {
						this.anIntArray39[local142] = arg5;
					}
					local142++;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
			return;
		}
		@Pc(399) int local399;
		@Pc(416) int local416;
		if (arg6 == 1) {
			@Pc(329) int local329 = (local69 << 24) + (local69 * (arg5 & 0xFF00FF) >> 8 & 0xFF00FF) + (local69 * (arg5 & 0xFF00) >> 8 & 0xFF00);
			local107 = 256 - local69;
			while (local42 < arg2) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local122 = arg1 - local48 + 1;
				if (local122 < this.anInt272 * 45613833) {
					local122 = this.anInt272 * 45613833;
				}
				local142 = local48 + arg1;
				if (local142 > this.anInt278 * -886740031) {
					local142 = this.anInt278 * -886740031;
				}
				local144 = this.anInt287 * -355627019 * local42 + local122;
				for (local399 = local122; local399 < local142; local399++) {
					if (!arg0 || arg3 < this.aFloatArray21[local144]) {
						local416 = this.anIntArray39[local144];
						@Pc(436) int local436 = ((local416 & 0xFF00FF) * local107 >> 8 & 0xFF00FF) + ((local416 & 0xFF00) * local107 >> 8 & 0xFF00);
						this.anIntArray39[local144] = local436 + local329;
					}
					local144++;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg4;
			local52 = -local52;
			local60 = local52 * local52 + local46;
			local56 = local60 - arg4;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local122 = arg1 - local48;
				if (local122 < this.anInt272 * 45613833) {
					local122 = this.anInt272 * 45613833;
				}
				local142 = local48 + arg1;
				if (local142 > this.anInt278 * -886740031 - 1) {
					local142 = this.anInt278 * -886740031 - 1;
				}
				local144 = local122 + local42 * -355627019 * this.anInt287;
				for (local399 = local122; local399 <= local142; local399++) {
					if (!arg0 || arg3 < this.aFloatArray21[local144]) {
						local416 = this.anIntArray39[local144];
						local416 = ((local416 & 0xFF00) * local107 >> 8 & 0xFF00) + ((local416 & 0xFF00FF) * local107 >> 8 & 0xFF00FF);
						this.anIntArray39[local144] = local329 + local416;
					}
					local144++;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
		} else if (arg6 == 2) {
			@Pc(709) int local709;
			while (local42 < arg2) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local107 = arg1 - local48 + 1;
				if (local107 < this.anInt272 * 45613833) {
					local107 = this.anInt272 * 45613833;
				}
				local122 = local48 + arg1;
				if (local122 > this.anInt278 * -886740031) {
					local122 = this.anInt278 * -886740031;
				}
				local142 = local107 + this.anInt287 * -355627019 * local42;
				for (local144 = local107; local144 < local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray21[local142]) {
						local399 = this.anIntArray39[local142];
						local416 = local399 + arg5;
						local709 = (arg5 & 0xFF00FF) + (local399 & 0xFF00FF);
						local399 = (local416 - local709 & 0x10000) + (local709 & 0x1000100);
						this.anIntArray39[local142] = local416 - local399 | local399 - (local399 >>> 8);
					}
					local142++;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg4;
			local52 = -local52;
			local60 = local52 * local52 + local46;
			local56 = local60 - arg4;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local107 = arg1 - local48;
				if (local107 < this.anInt272 * 45613833) {
					local107 = this.anInt272 * 45613833;
				}
				local122 = arg1 + local48;
				if (local122 > this.anInt278 * -886740031 - 1) {
					local122 = this.anInt278 * -886740031 - 1;
				}
				local142 = this.anInt287 * -355627019 * local42 + local107;
				for (local144 = local107; local144 <= local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray21[local142]) {
						local399 = this.anIntArray39[local142];
						local416 = local399 + arg5;
						local709 = (arg5 & 0xFF00FF) + (local399 & 0xFF00FF);
						local399 = (local416 - local709 & 0x10000) + (local709 & 0x1000100);
						this.anIntArray39[local142] = local416 - local399 | local399 - (local399 >>> 8);
					}
					local142++;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "rq", descriptor = "(ZIIFIII)V", line = 1703)
	void method3172(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.anIntArray39 == null) {
			return;
		}
		if (arg4 < 0) {
			arg4 = -arg4;
		}
		@Pc(12) int local12 = arg2 - arg4;
		if (local12 < this.anInt273 * 1850088287) {
			local12 = this.anInt273 * 1850088287;
		}
		@Pc(29) int local29 = arg4 + arg2 + 1;
		if (local29 > this.anInt274 * 2066290591) {
			local29 = this.anInt274 * 2066290591;
		}
		@Pc(42) int local42 = local12;
		@Pc(46) int local46 = arg4 * arg4;
		@Pc(48) int local48 = 0;
		@Pc(52) int local52 = arg2 - local12;
		@Pc(56) int local56 = local52 * local52;
		@Pc(60) int local60 = local56 - local52;
		if (arg2 > local29) {
			arg2 = local29;
		}
		@Pc(69) int local69 = arg5 >>> 24;
		@Pc(107) int local107;
		@Pc(122) int local122;
		@Pc(142) int local142;
		@Pc(144) int local144;
		if (arg6 == 0 || arg6 == 1 && local69 == 255) {
			while (local42 < arg2) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local107 = arg1 - local48 + 1;
				if (local107 < this.anInt272 * 45613833) {
					local107 = this.anInt272 * 45613833;
				}
				local122 = local48 + arg1;
				if (local122 > this.anInt278 * -886740031) {
					local122 = this.anInt278 * -886740031;
				}
				local142 = this.anInt287 * -355627019 * local42 + local107;
				for (local144 = local107; local144 < local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray21[local142]) {
						this.anIntArray39[local142] = arg5;
					}
					local142++;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg4;
			local52 = local42 - arg2;
			local60 = local46 + local52 * local52;
			local56 = local60 - arg4;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local107 = arg1 - local48;
				if (local107 < this.anInt272 * 45613833) {
					local107 = this.anInt272 * 45613833;
				}
				local122 = local48 + arg1;
				if (local122 > this.anInt278 * -886740031 - 1) {
					local122 = this.anInt278 * -886740031 - 1;
				}
				local142 = local107 + local42 * this.anInt287 * -355627019;
				for (local144 = local107; local144 <= local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray21[local142]) {
						this.anIntArray39[local142] = arg5;
					}
					local142++;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
			return;
		}
		@Pc(399) int local399;
		@Pc(416) int local416;
		if (arg6 == 1) {
			@Pc(329) int local329 = (local69 << 24) + (local69 * (arg5 & 0xFF00FF) >> 8 & 0xFF00FF) + (local69 * (arg5 & 0xFF00) >> 8 & 0xFF00);
			local107 = 256 - local69;
			while (local42 < arg2) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local122 = arg1 - local48 + 1;
				if (local122 < this.anInt272 * 45613833) {
					local122 = this.anInt272 * 45613833;
				}
				local142 = local48 + arg1;
				if (local142 > this.anInt278 * -886740031) {
					local142 = this.anInt278 * -886740031;
				}
				local144 = this.anInt287 * -355627019 * local42 + local122;
				for (local399 = local122; local399 < local142; local399++) {
					if (!arg0 || arg3 < this.aFloatArray21[local144]) {
						local416 = this.anIntArray39[local144];
						@Pc(436) int local436 = ((local416 & 0xFF00FF) * local107 >> 8 & 0xFF00FF) + ((local416 & 0xFF00) * local107 >> 8 & 0xFF00);
						this.anIntArray39[local144] = local436 + local329;
					}
					local144++;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg4;
			local52 = -local52;
			local60 = local52 * local52 + local46;
			local56 = local60 - arg4;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local122 = arg1 - local48;
				if (local122 < this.anInt272 * 45613833) {
					local122 = this.anInt272 * 45613833;
				}
				local142 = local48 + arg1;
				if (local142 > this.anInt278 * -886740031 - 1) {
					local142 = this.anInt278 * -886740031 - 1;
				}
				local144 = local122 + local42 * -355627019 * this.anInt287;
				for (local399 = local122; local399 <= local142; local399++) {
					if (!arg0 || arg3 < this.aFloatArray21[local144]) {
						local416 = this.anIntArray39[local144];
						local416 = ((local416 & 0xFF00) * local107 >> 8 & 0xFF00) + ((local416 & 0xFF00FF) * local107 >> 8 & 0xFF00FF);
						this.anIntArray39[local144] = local329 + local416;
					}
					local144++;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
		} else if (arg6 == 2) {
			@Pc(709) int local709;
			while (local42 < arg2) {
				while (local60 <= local46 || local56 <= local46) {
					local56 += local48 + local48;
					local60 += local48++ + local48;
				}
				local107 = arg1 - local48 + 1;
				if (local107 < this.anInt272 * 45613833) {
					local107 = this.anInt272 * 45613833;
				}
				local122 = local48 + arg1;
				if (local122 > this.anInt278 * -886740031) {
					local122 = this.anInt278 * -886740031;
				}
				local142 = local107 + this.anInt287 * -355627019 * local42;
				for (local144 = local107; local144 < local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray21[local142]) {
						local399 = this.anIntArray39[local142];
						local416 = local399 + arg5;
						local709 = (arg5 & 0xFF00FF) + (local399 & 0xFF00FF);
						local399 = (local416 - local709 & 0x10000) + (local709 & 0x1000100);
						this.anIntArray39[local142] = local416 - local399 | local399 - (local399 >>> 8);
					}
					local142++;
				}
				local42++;
				local56 -= local52-- + local52;
				local60 -= local52 + local52;
			}
			local48 = arg4;
			local52 = -local52;
			local60 = local52 * local52 + local46;
			local56 = local60 - arg4;
			local60 -= local52;
			while (local42 < local29) {
				while (local60 > local46 && local56 > local46) {
					local60 -= local48-- + local48;
					local56 -= local48 + local48;
				}
				local107 = arg1 - local48;
				if (local107 < this.anInt272 * 45613833) {
					local107 = this.anInt272 * 45613833;
				}
				local122 = arg1 + local48;
				if (local122 > this.anInt278 * -886740031 - 1) {
					local122 = this.anInt278 * -886740031 - 1;
				}
				local142 = this.anInt287 * -355627019 * local42 + local107;
				for (local144 = local107; local144 <= local122; local144++) {
					if (!arg0 || arg3 < this.aFloatArray21[local142]) {
						local399 = this.anIntArray39[local142];
						local416 = local399 + arg5;
						local709 = (arg5 & 0xFF00FF) + (local399 & 0xFF00FF);
						local399 = (local416 - local709 & 0x10000) + (local709 & 0x1000100);
						this.anIntArray39[local142] = local416 - local399 | local399 - (local399 >>> 8);
					}
					local142++;
				}
				local42++;
				local60 += local52 + local52;
				local56 += local52++ + local52;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!abl", name = "cn", descriptor = "(Lclient!mu;)V", line = 1872)
	@Override
	public void method17106(@OriginalArg(0) Class332 arg0) {
		this.aClass332_3 = arg0;
		this.method3169();
	}

	@OriginalMember(owner = "client!abl", name = "ie", descriptor = "(Lclient!mu;)V", line = 1872)
	@Override
	public void method17267(@OriginalArg(0) Class332 arg0) {
		this.aClass332_3 = arg0;
		this.method3169();
	}

	@OriginalMember(owner = "client!abl", name = "ic", descriptor = "(Lclient!mu;)V", line = 1872)
	@Override
	public void method17268(@OriginalArg(0) Class332 arg0) {
		this.aClass332_3 = arg0;
		this.method3169();
	}

	@OriginalMember(owner = "client!abl", name = "je", descriptor = "(Lclient!mu;)V", line = 1872)
	@Override
	public void method17075(@OriginalArg(0) Class332 arg0) {
		this.aClass332_3 = arg0;
		this.method3169();
	}

	@OriginalMember(owner = "client!abl", name = "co", descriptor = "()Lclient!mu;", line = 1877)
	@Override
	public Class332 method17107() {
		return new Class332(this.aClass332_3);
	}

	@OriginalMember(owner = "client!abl", name = "jn", descriptor = "()Lclient!mu;", line = 1877)
	@Override
	public Class332 method17341() {
		return new Class332(this.aClass332_3);
	}

	@OriginalMember(owner = "client!abl", name = "jc", descriptor = "()Lclient!mu;", line = 1877)
	@Override
	public Class332 method17271() {
		return new Class332(this.aClass332_3);
	}

	@OriginalMember(owner = "client!abl", name = "ch", descriptor = "(Lclient!mq;)V", line = 1881)
	@Override
	public void method17322(@OriginalArg(0) Class328 arg0) {
		this.aClass328_4.method26104(arg0);
		this.method3169();
	}

	@OriginalMember(owner = "client!abl", name = "jp", descriptor = "(Lclient!mq;)V", line = 1881)
	@Override
	public void method17170(@OriginalArg(0) Class328 arg0) {
		this.aClass328_4.method26104(arg0);
		this.method3169();
	}

	@OriginalMember(owner = "client!abl", name = "jb", descriptor = "(Lclient!mq;)V", line = 1881)
	@Override
	public void method17272(@OriginalArg(0) Class328 arg0) {
		this.aClass328_4.method26104(arg0);
		this.method3169();
	}

	@OriginalMember(owner = "client!abl", name = "jo", descriptor = "(Lclient!mq;)V", line = 1881)
	@Override
	public void method17274(@OriginalArg(0) Class328 arg0) {
		this.aClass328_4.method26104(arg0);
		this.method3169();
	}

	@OriginalMember(owner = "client!abl", name = "ci", descriptor = "()Lclient!mq;", line = 1886)
	@Override
	public Class328 method17110() {
		return new Class328(this.aClass328_4);
	}

	@OriginalMember(owner = "client!abl", name = "jq", descriptor = "()Lclient!mq;", line = 1886)
	@Override
	public Class328 method17275() {
		return new Class328(this.aClass328_4);
	}

	@OriginalMember(owner = "client!abl", name = "ca", descriptor = "(F)V", line = 1890)
	@Override
	public void method17111(@OriginalArg(0) float arg0) {
		this.anInt286 = (int) (arg0 * 65535.0F) * 690619347;
	}

	@OriginalMember(owner = "client!abl", name = "jg", descriptor = "(F)V", line = 1890)
	@Override
	public void method17192(@OriginalArg(0) float arg0) {
		this.anInt286 = (int) (arg0 * 65535.0F) * 690619347;
	}

	@OriginalMember(owner = "client!abl", name = "jy", descriptor = "(F)V", line = 1890)
	@Override
	public void method17099(@OriginalArg(0) float arg0) {
		this.anInt286 = (int) (arg0 * 65535.0F) * 690619347;
	}

	@OriginalMember(owner = "client!abl", name = "jm", descriptor = "(F)V", line = 1890)
	@Override
	public void method17277(@OriginalArg(0) float arg0) {
		this.anInt286 = (int) (arg0 * 65535.0F) * 690619347;
	}

	@OriginalMember(owner = "client!abl", name = "jz", descriptor = "(F)V", line = 1890)
	@Override
	public void method17279(@OriginalArg(0) float arg0) {
		this.anInt286 = (int) (arg0 * 65535.0F) * 690619347;
	}

	@OriginalMember(owner = "client!abl", name = "cr", descriptor = "(IFFFFF)V", line = 1894)
	@Override
	public void method17132(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt277 = (int) (arg1 * 65535.0F) * -939519703;
		this.anInt270 = (int) (arg2 * 65535.0F) * 1282032135;
		@Pc(30) float local30 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt275 = (int) (arg3 * 65535.0F / local30) * 1180603495;
		this.anInt283 = (int) (arg4 * 65535.0F / local30) * 1913464823;
		this.anInt284 = (int) (arg5 * 65535.0F / local30) * 1446178715;
	}

	@OriginalMember(owner = "client!abl", name = "jd", descriptor = "(IFFFFF)V", line = 1894)
	@Override
	public void method17319(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt277 = (int) (arg1 * 65535.0F) * -939519703;
		this.anInt270 = (int) (arg2 * 65535.0F) * 1282032135;
		@Pc(30) float local30 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt275 = (int) (arg3 * 65535.0F / local30) * 1180603495;
		this.anInt283 = (int) (arg4 * 65535.0F / local30) * 1913464823;
		this.anInt284 = (int) (arg5 * 65535.0F / local30) * 1446178715;
	}

	@OriginalMember(owner = "client!abl", name = "ce", descriptor = "(I)V", line = 1902)
	@Override
	public void method17412(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abl", name = "ja", descriptor = "(I)V", line = 1902)
	@Override
	public void method17282(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abl", name = "jx", descriptor = "(I)V", line = 1902)
	@Override
	public void method17406(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abl", name = "cw", descriptor = "(III)V", line = 1905)
	@Override
	public void method17114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass12Array1.length; local1++) {
			@Pc(11) Class12 local11 = this.aClass12Array1[local1];
			local11.anInt132 = (arg0 & 0xFFFFFF) * -635409019;
			@Pc(27) int local27 = local11.anInt132 * 128222029 >>> 16 & 0xFF;
			if (local27 < 2) {
				local27 = 2;
			}
			@Pc(41) int local41 = local11.anInt132 * 128222029 >> 8 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			@Pc(53) int local53 = local11.anInt132 * 128222029 & 0xFF;
			if (local53 < 2) {
				local53 = 2;
			}
			local11.anInt132 = (local27 << 16 | local41 << 8 | local53) * -635409019;
			if (arg1 < 0) {
				local11.aBoolean43 = false;
			} else {
				local11.aBoolean43 = true;
			}
		}
	}

	@OriginalMember(owner = "client!abl", name = "jl", descriptor = "(III)V", line = 1905)
	@Override
	public void method17234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass12Array1.length; local1++) {
			@Pc(11) Class12 local11 = this.aClass12Array1[local1];
			local11.anInt132 = (arg0 & 0xFFFFFF) * -635409019;
			@Pc(27) int local27 = local11.anInt132 * 128222029 >>> 16 & 0xFF;
			if (local27 < 2) {
				local27 = 2;
			}
			@Pc(41) int local41 = local11.anInt132 * 128222029 >> 8 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			@Pc(53) int local53 = local11.anInt132 * 128222029 & 0xFF;
			if (local53 < 2) {
				local53 = 2;
			}
			local11.anInt132 = (local27 << 16 | local41 << 8 | local53) * -635409019;
			if (arg1 < 0) {
				local11.aBoolean43 = false;
			} else {
				local11.aBoolean43 = true;
			}
		}
	}

	@OriginalMember(owner = "client!abl", name = "jr", descriptor = "(III)V", line = 1905)
	@Override
	public void method17027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass12Array1.length; local1++) {
			@Pc(11) Class12 local11 = this.aClass12Array1[local1];
			local11.anInt132 = (arg0 & 0xFFFFFF) * -635409019;
			@Pc(27) int local27 = local11.anInt132 * 128222029 >>> 16 & 0xFF;
			if (local27 < 2) {
				local27 = 2;
			}
			@Pc(41) int local41 = local11.anInt132 * 128222029 >> 8 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			@Pc(53) int local53 = local11.anInt132 * 128222029 & 0xFF;
			if (local53 < 2) {
				local53 = 2;
			}
			local11.anInt132 = (local27 << 16 | local41 << 8 | local53) * -635409019;
			if (arg1 < 0) {
				local11.aBoolean43 = false;
			} else {
				local11.aBoolean43 = true;
			}
		}
	}

	@OriginalMember(owner = "client!abl", name = "pt", descriptor = "()V", line = 1921)
	void method3169() {
		this.aClass328_6.method26056(this.aClass332_3);
		this.aClass328_5.method26104(this.aClass328_6);
		this.aClass328_5.method26046(this.aClass328_4);
		this.aClass328_5.method26066(this.aFloatArrayArray4[0]);
		this.aClass328_5.method26107(this.aFloatArrayArray4[1]);
		this.aClass328_5.method26063(this.aFloatArrayArray4[2]);
		this.aClass328_5.method26064(this.aFloatArrayArray4[3]);
		this.aClass328_5.method26084(this.aFloatArrayArray4[4]);
		this.aClass328_5.method26065(this.aFloatArrayArray4[5]);
		@Pc(66) float local66 = this.aClass328_4.method26062();
		@Pc(82) float local82 = this.aClass328_4.aFloatArray106[14] + this.aClass328_4.aFloatArray106[10] * (local66 - 255.0F);
		@Pc(96) float local96 = this.aClass328_4.aFloatArray106[10] * local66 + this.aClass328_4.aFloatArray106[14];
		@Pc(100) float local100 = local96 - local82;
		for (@Pc(102) int local102 = 0; local102 < this.anInt276 * -570787021; local102++) {
			@Pc(113) Class12 local113 = this.aClass12Array1[local102];
			local113.aFloat5 = local82;
			local113.aFloat7 = local100;
		}
	}

	@OriginalMember(owner = "client!abl", name = "ra", descriptor = "()V", line = 1921)
	void method3207() {
		this.aClass328_6.method26056(this.aClass332_3);
		this.aClass328_5.method26104(this.aClass328_6);
		this.aClass328_5.method26046(this.aClass328_4);
		this.aClass328_5.method26066(this.aFloatArrayArray4[0]);
		this.aClass328_5.method26107(this.aFloatArrayArray4[1]);
		this.aClass328_5.method26063(this.aFloatArrayArray4[2]);
		this.aClass328_5.method26064(this.aFloatArrayArray4[3]);
		this.aClass328_5.method26084(this.aFloatArrayArray4[4]);
		this.aClass328_5.method26065(this.aFloatArrayArray4[5]);
		@Pc(66) float local66 = this.aClass328_4.method26062();
		@Pc(82) float local82 = this.aClass328_4.aFloatArray106[14] + this.aClass328_4.aFloatArray106[10] * (local66 - 255.0F);
		@Pc(96) float local96 = this.aClass328_4.aFloatArray106[10] * local66 + this.aClass328_4.aFloatArray106[14];
		@Pc(100) float local100 = local96 - local82;
		for (@Pc(102) int local102 = 0; local102 < this.anInt276 * -570787021; local102++) {
			@Pc(113) Class12 local113 = this.aClass12Array1[local102];
			local113.aFloat5 = local82;
			local113.aFloat7 = local100;
		}
	}

	@OriginalMember(owner = "client!abl", name = "dh", descriptor = "(I)Lclient!db;", line = 1942)
	@Override
	public Class18 method17248(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "jw", descriptor = "(I)Lclient!db;", line = 1942)
	@Override
	public Class18 method17287(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "jj", descriptor = "(I)Lclient!db;", line = 1942)
	@Override
	public Class18 method17285(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "jt", descriptor = "(I)Lclient!db;", line = 1942)
	@Override
	public Class18 method17286(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "js", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;", line = 1946)
	@Override
	public Class18 method17379(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "db", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;", line = 1946)
	@Override
	public Class18 method17074(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "jv", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;", line = 1946)
	@Override
	public Class18 method17289(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "jk", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;", line = 1946)
	@Override
	public Class18 method17288(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "dp", descriptor = "(Lclient!db;)V", line = 1949)
	@Override
	public void method17400(@OriginalArg(0) Class18 arg0) {
	}

	@OriginalMember(owner = "client!abl", name = "lw", descriptor = "(Lclient!db;)V", line = 1949)
	@Override
	public void method17097(@OriginalArg(0) Class18 arg0) {
	}

	@OriginalMember(owner = "client!abl", name = "lq", descriptor = "(Lclient!db;)V", line = 1949)
	@Override
	public void method17347(@OriginalArg(0) Class18 arg0) {
	}

	@OriginalMember(owner = "client!abl", name = "lo", descriptor = "(Lclient!db;)V", line = 1949)
	@Override
	public void method17346(@OriginalArg(0) Class18 arg0) {
	}

	@OriginalMember(owner = "client!abl", name = "ln", descriptor = "(Lclient!db;)V", line = 1949)
	@Override
	public void method17172(@OriginalArg(0) Class18 arg0) {
	}

	@OriginalMember(owner = "client!abl", name = "lt", descriptor = "(Lclient!db;)V", line = 1949)
	@Override
	public void method17345(@OriginalArg(0) Class18 arg0) {
	}

	@OriginalMember(owner = "client!abl", name = "dk", descriptor = "(IIII)V", line = 1950)
	@Override
	public void method17121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!abl", name = "ji", descriptor = "(IIII)V", line = 1950)
	@Override
	public void method17205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!abl", name = "ju", descriptor = "(IIII)V", line = 1950)
	@Override
	public void method17292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!abl", name = "jh", descriptor = "(IIII)V", line = 1950)
	@Override
	public void method17293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!abl", name = "jf", descriptor = "()V", line = 1951)
	@Override
	public void method17294() {
	}

	@OriginalMember(owner = "client!abl", name = "kf", descriptor = "()V", line = 1951)
	@Override
	public void method17295() {
	}

	@OriginalMember(owner = "client!abl", name = "dy", descriptor = "()V", line = 1951)
	@Override
	public void method17124() {
	}

	@OriginalMember(owner = "client!abl", name = "kx", descriptor = "()Z", line = 1954)
	@Override
	public boolean method17296() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "dg", descriptor = "()Z", line = 1954)
	@Override
	public boolean method17123() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "dq", descriptor = "()Z", line = 1958)
	@Override
	public boolean method17217() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "kw", descriptor = "()Z", line = 1958)
	@Override
	public boolean method17249() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "kl", descriptor = "()Z", line = 1958)
	@Override
	public boolean method17298() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "kr", descriptor = "(FFFFF)V", line = 1961)
	@Override
	public void method17299(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
	}

	@OriginalMember(owner = "client!abl", name = "ds", descriptor = "(FFFFF)V", line = 1961)
	@Override
	public void method17125(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
	}

	@OriginalMember(owner = "client!abl", name = "dr", descriptor = "([I)Lclient!cf;", line = 1964)
	@Override
	public Class16 method17126(@OriginalArg(0) int[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "kn", descriptor = "([I)Lclient!cf;", line = 1964)
	@Override
	public Class16 method17300(@OriginalArg(0) int[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "kv", descriptor = "([I)Lclient!cf;", line = 1964)
	@Override
	public Class16 method17120(@OriginalArg(0) int[] arg0) {
		return null;
	}

	@OriginalMember(owner = "client!abl", name = "dc", descriptor = "()Z", line = 1968)
	@Override
	public boolean method17366() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "kg", descriptor = "()Z", line = 1968)
	@Override
	public boolean method17281() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "km", descriptor = "()Z", line = 1968)
	@Override
	public boolean method17071() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "dt", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V", line = 1971)
	@Override
	public void method17128(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5) {
	}

	@OriginalMember(owner = "client!abl", name = "kk", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V", line = 1971)
	@Override
	public void method17212(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5) {
	}

	@OriginalMember(owner = "client!abl", name = "kh", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V", line = 1971)
	@Override
	public void method17305(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5) {
	}

	@OriginalMember(owner = "client!abl", name = "ke", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V", line = 1971)
	@Override
	public void method17034(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5) {
	}

	@OriginalMember(owner = "client!abl", name = "kz", descriptor = "(Lclient!cf;FLclient!cf;FLclient!cf;F)V", line = 1971)
	@Override
	public void method17307(@OriginalArg(0) Class16 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) float arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) float arg5) {
	}

	@OriginalMember(owner = "client!abl", name = "dd", descriptor = "()Z", line = 1974)
	@Override
	public boolean method17129() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "ki", descriptor = "()Z", line = 1974)
	@Override
	public boolean method17308() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "da", descriptor = "()V", line = 1977)
	@Override
	public void method17130() {
	}

	@OriginalMember(owner = "client!abl", name = "kt", descriptor = "()V", line = 1977)
	@Override
	public void method17309() {
	}

	@OriginalMember(owner = "client!abl", name = "dz", descriptor = "()Z", line = 1980)
	@Override
	public boolean method17131() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "ko", descriptor = "()Z", line = 1980)
	@Override
	public boolean method17057() {
		return false;
	}

	@OriginalMember(owner = "client!abl", name = "dl", descriptor = "(FFFFFF)V", line = 1983)
	@Override
	void method17219(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
	}

	@OriginalMember(owner = "client!abl", name = "ku", descriptor = "(FFFFFF)V", line = 1983)
	@Override
	void method17344(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
	}

	@OriginalMember(owner = "client!abl", name = "kb", descriptor = "(ILclient!dz;)V", line = 1986)
	@Override
	public void method17369(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass12Array1.length; local1++) {
			this.aClass12Array1[local1].anInt134 = this.aClass12Array1[local1].anInt132 * 1650971601;
			this.aClass12Array1[local1].anInt131 = arg0 * 1947982153;
			this.aClass12Array1[local1].anInt132 = arg1.anInt3422 * -586951625;
			this.aClass12Array1[local1].anInt135 = arg1.anInt3417 * -733349801;
			this.aClass12Array1[local1].aBoolean41 = true;
		}
	}

	@OriginalMember(owner = "client!abl", name = "ky", descriptor = "(ILclient!dz;)V", line = 1986)
	@Override
	public void method17316(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass12Array1.length; local1++) {
			this.aClass12Array1[local1].anInt134 = this.aClass12Array1[local1].anInt132 * 1650971601;
			this.aClass12Array1[local1].anInt131 = arg0 * 1947982153;
			this.aClass12Array1[local1].anInt132 = arg1.anInt3422 * -586951625;
			this.aClass12Array1[local1].anInt135 = arg1.anInt3417 * -733349801;
			this.aClass12Array1[local1].aBoolean41 = true;
		}
	}

	@OriginalMember(owner = "client!abl", name = "ks", descriptor = "(ILclient!dz;)V", line = 1986)
	@Override
	public void method17354(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass12Array1.length; local1++) {
			this.aClass12Array1[local1].anInt134 = this.aClass12Array1[local1].anInt132 * 1650971601;
			this.aClass12Array1[local1].anInt131 = arg0 * 1947982153;
			this.aClass12Array1[local1].anInt132 = arg1.anInt3422 * -586951625;
			this.aClass12Array1[local1].anInt135 = arg1.anInt3417 * -733349801;
			this.aClass12Array1[local1].aBoolean41 = true;
		}
	}

	@OriginalMember(owner = "client!abl", name = "dj", descriptor = "(ILclient!dz;)V", line = 1986)
	@Override
	public void method17178(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass12Array1.length; local1++) {
			this.aClass12Array1[local1].anInt134 = this.aClass12Array1[local1].anInt132 * 1650971601;
			this.aClass12Array1[local1].anInt131 = arg0 * 1947982153;
			this.aClass12Array1[local1].anInt132 = arg1.anInt3422 * -586951625;
			this.aClass12Array1[local1].anInt135 = arg1.anInt3417 * -733349801;
			this.aClass12Array1[local1].aBoolean41 = true;
		}
	}

	@OriginalMember(owner = "client!abl", name = "kd", descriptor = "(ILclient!dz;)V", line = 1986)
	@Override
	public void method17314(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass12Array1.length; local1++) {
			this.aClass12Array1[local1].anInt134 = this.aClass12Array1[local1].anInt132 * 1650971601;
			this.aClass12Array1[local1].anInt131 = arg0 * 1947982153;
			this.aClass12Array1[local1].anInt132 = arg1.anInt3422 * -586951625;
			this.aClass12Array1[local1].anInt135 = arg1.anInt3417 * -733349801;
			this.aClass12Array1[local1].aBoolean41 = true;
		}
	}

	@OriginalMember(owner = "client!abl", name = "kj", descriptor = "(ILclient!dz;)V", line = 1986)
	@Override
	public void method17191(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass12Array1.length; local1++) {
			this.aClass12Array1[local1].anInt134 = this.aClass12Array1[local1].anInt132 * 1650971601;
			this.aClass12Array1[local1].anInt131 = arg0 * 1947982153;
			this.aClass12Array1[local1].anInt132 = arg1.anInt3422 * -586951625;
			this.aClass12Array1[local1].anInt135 = arg1.anInt3417 * -733349801;
			this.aClass12Array1[local1].aBoolean41 = true;
		}
	}

	@OriginalMember(owner = "client!abl", name = "kq", descriptor = "(ILclient!dz;)V", line = 1986)
	@Override
	public void method17317(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass12Array1.length; local1++) {
			this.aClass12Array1[local1].anInt134 = this.aClass12Array1[local1].anInt132 * 1650971601;
			this.aClass12Array1[local1].anInt131 = arg0 * 1947982153;
			this.aClass12Array1[local1].anInt132 = arg1.anInt3422 * -586951625;
			this.aClass12Array1[local1].anInt135 = arg1.anInt3417 * -733349801;
			this.aClass12Array1[local1].aBoolean41 = true;
		}
	}

	@OriginalMember(owner = "client!abl", name = "dx", descriptor = "(ILclient!dz;)V", line = 1996)
	@Override
	public void method17101(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		@Pc(3) Class12 local3 = this.method3165(Thread.currentThread());
		local3.anInt131 = arg0 * 1947982153;
		local3.anInt132 = arg1.anInt3422 * -586951625;
		local3.anInt135 = arg1.anInt3417 * -733349801;
	}

	@OriginalMember(owner = "client!abl", name = "kc", descriptor = "(ILclient!dz;)V", line = 1996)
	@Override
	public void method17358(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1) {
		@Pc(3) Class12 local3 = this.method3165(Thread.currentThread());
		local3.anInt131 = arg0 * 1947982153;
		local3.anInt132 = arg1.anInt3422 * -586951625;
		local3.anInt135 = arg1.anInt3417 * -733349801;
	}

	@OriginalMember(owner = "client!abl", name = "dm", descriptor = "()V", line = 2003)
	@Override
	public void method17368() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass12Array1.length; local1++) {
			this.aClass12Array1[local1].anInt132 = this.aClass12Array1[local1].anInt134 * 1230988593;
			this.aClass12Array1[local1].aBoolean41 = false;
		}
	}

	@OriginalMember(owner = "client!abl", name = "ka", descriptor = "()V", line = 2003)
	@Override
	public void method17336() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass12Array1.length; local1++) {
			this.aClass12Array1[local1].anInt132 = this.aClass12Array1[local1].anInt134 * 1230988593;
			this.aClass12Array1[local1].aBoolean41 = false;
		}
	}

	@OriginalMember(owner = "client!abl", name = "kp", descriptor = "()V", line = 2003)
	@Override
	public void method17320() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass12Array1.length; local1++) {
			this.aClass12Array1[local1].anInt132 = this.aClass12Array1[local1].anInt134 * 1230988593;
			this.aClass12Array1[local1].aBoolean41 = false;
		}
	}

	@OriginalMember(owner = "client!abl", name = "bt", descriptor = "(IIFIIFIIFIIII)V", line = 2010)
	@Override
	public void method17070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(7) boolean local7 = this.anIntArray39 != null;
		@Pc(15) boolean local15 = this.aFloatArray21 != null;
		if (!local7 && !local15) {
			return;
		}
		@Pc(24) Class12 local24 = this.method3165(Thread.currentThread());
		@Pc(27) Class103 local27 = local24.aClass103_1;
		local27.aBoolean537 = false;
		@Pc(37) int local37 = arg0 - this.anInt272 * 45613833;
		@Pc(44) int local44 = arg3 - this.anInt272 * 45613833;
		@Pc(51) int local51 = arg6 - this.anInt272 * 45613833;
		@Pc(58) int local58 = arg1 - this.anInt273 * 1850088287;
		@Pc(65) int local65 = arg4 - this.anInt273 * 1850088287;
		@Pc(72) int local72 = arg7 - this.anInt273 * 1850088287;
		local27.aBoolean538 = local37 < 0 || local37 > local27.anInt2978 || local44 < 0 || local44 > local27.anInt2978 || local51 < 0 || local51 > local27.anInt2978;
		@Pc(99) int local99 = arg9 >>> 24;
		if (arg12 == 0 || arg12 == 1 && local99 == 255) {
			local27.anInt2973 = 0;
			local27.aBoolean540 = false;
			local27.method21868(local7, local15, false, (float) local58, (float) local65, (float) local72, (float) local37, (float) local44, (float) local51, arg2, arg5, arg8, arg9, arg10, arg11);
		} else if (arg12 == 1) {
			local27.anInt2973 = 255 - local99;
			local27.aBoolean540 = false;
			local27.method21868(local7, local15, false, (float) local58, (float) local65, (float) local72, (float) local37, (float) local44, (float) local51, arg2, arg5, arg8, arg9, arg10, arg11);
		} else if (arg12 == 2) {
			local27.anInt2973 = 128;
			local27.aBoolean540 = true;
			local27.method21868(local7, local15, false, (float) local58, (float) local65, (float) local72, (float) local37, (float) local44, (float) local51, arg2, arg5, arg8, arg9, arg10, arg11);
		} else {
			throw new IllegalArgumentException();
		}
		local27.aBoolean537 = true;
	}

	@OriginalMember(owner = "client!abl", name = "lu", descriptor = "(IIFIIFIIFIIII)V", line = 2010)
	@Override
	public void method17321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(7) boolean local7 = this.anIntArray39 != null;
		@Pc(15) boolean local15 = this.aFloatArray21 != null;
		if (!local7 && !local15) {
			return;
		}
		@Pc(24) Class12 local24 = this.method3165(Thread.currentThread());
		@Pc(27) Class103 local27 = local24.aClass103_1;
		local27.aBoolean537 = false;
		@Pc(37) int local37 = arg0 - this.anInt272 * 45613833;
		@Pc(44) int local44 = arg3 - this.anInt272 * 45613833;
		@Pc(51) int local51 = arg6 - this.anInt272 * 45613833;
		@Pc(58) int local58 = arg1 - this.anInt273 * 1850088287;
		@Pc(65) int local65 = arg4 - this.anInt273 * 1850088287;
		@Pc(72) int local72 = arg7 - this.anInt273 * 1850088287;
		local27.aBoolean538 = local37 < 0 || local37 > local27.anInt2978 || local44 < 0 || local44 > local27.anInt2978 || local51 < 0 || local51 > local27.anInt2978;
		@Pc(99) int local99 = arg9 >>> 24;
		if (arg12 == 0 || arg12 == 1 && local99 == 255) {
			local27.anInt2973 = 0;
			local27.aBoolean540 = false;
			local27.method21868(local7, local15, false, (float) local58, (float) local65, (float) local72, (float) local37, (float) local44, (float) local51, arg2, arg5, arg8, arg9, arg10, arg11);
		} else if (arg12 == 1) {
			local27.anInt2973 = 255 - local99;
			local27.aBoolean540 = false;
			local27.method21868(local7, local15, false, (float) local58, (float) local65, (float) local72, (float) local37, (float) local44, (float) local51, arg2, arg5, arg8, arg9, arg10, arg11);
		} else if (arg12 == 2) {
			local27.anInt2973 = 128;
			local27.aBoolean540 = true;
			local27.method21868(local7, local15, false, (float) local58, (float) local65, (float) local72, (float) local37, (float) local44, (float) local51, arg2, arg5, arg8, arg9, arg10, arg11);
		} else {
			throw new IllegalArgumentException();
		}
		local27.aBoolean537 = true;
	}

	@OriginalMember(owner = "client!abl", name = "oi", descriptor = "(FFF[F)V", line = 2045)
	@Override
	public void method17236(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = arg0 * this.aClass328_5.aFloatArray106[3] + this.aClass328_5.aFloatArray106[15] + this.aClass328_5.aFloatArray106[7] * arg1 + this.aClass328_5.aFloatArray106[11] * arg2;
		@Pc(59) float local59 = this.aClass328_5.aFloatArray106[12] + arg0 * this.aClass328_5.aFloatArray106[0] + arg1 * this.aClass328_5.aFloatArray106[4] + this.aClass328_5.aFloatArray106[8] * arg2;
		@Pc(89) float local89 = this.aClass328_5.aFloatArray106[9] * arg2 + this.aClass328_5.aFloatArray106[1] * arg0 + this.aClass328_5.aFloatArray106[13] + this.aClass328_5.aFloatArray106[5] * arg1;
		@Pc(119) float local119 = this.aClass328_6.aFloatArray106[10] * arg2 + this.aClass328_6.aFloatArray106[6] * arg1 + arg0 * this.aClass328_6.aFloatArray106[2] + this.aClass328_6.aFloatArray106[14];
		arg3[0] = this.aFloat19 + local59 * this.aFloat22 / local29;
		arg3[1] = this.aFloat17 + local89 * this.aFloat20 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!abl", name = "du", descriptor = "(FFF[F)V", line = 2045)
	@Override
	public void method17138(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = arg0 * this.aClass328_5.aFloatArray106[3] + this.aClass328_5.aFloatArray106[15] + this.aClass328_5.aFloatArray106[7] * arg1 + this.aClass328_5.aFloatArray106[11] * arg2;
		@Pc(59) float local59 = this.aClass328_5.aFloatArray106[12] + arg0 * this.aClass328_5.aFloatArray106[0] + arg1 * this.aClass328_5.aFloatArray106[4] + this.aClass328_5.aFloatArray106[8] * arg2;
		@Pc(89) float local89 = this.aClass328_5.aFloatArray106[9] * arg2 + this.aClass328_5.aFloatArray106[1] * arg0 + this.aClass328_5.aFloatArray106[13] + this.aClass328_5.aFloatArray106[5] * arg1;
		@Pc(119) float local119 = this.aClass328_6.aFloatArray106[10] * arg2 + this.aClass328_6.aFloatArray106[6] * arg1 + arg0 * this.aClass328_6.aFloatArray106[2] + this.aClass328_6.aFloatArray106[14];
		arg3[0] = this.aFloat19 + local59 * this.aFloat22 / local29;
		arg3[1] = this.aFloat17 + local89 * this.aFloat20 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!abl", name = "oc", descriptor = "(FFF[F)V", line = 2045)
	@Override
	public void method17408(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = arg0 * this.aClass328_5.aFloatArray106[3] + this.aClass328_5.aFloatArray106[15] + this.aClass328_5.aFloatArray106[7] * arg1 + this.aClass328_5.aFloatArray106[11] * arg2;
		@Pc(59) float local59 = this.aClass328_5.aFloatArray106[12] + arg0 * this.aClass328_5.aFloatArray106[0] + arg1 * this.aClass328_5.aFloatArray106[4] + this.aClass328_5.aFloatArray106[8] * arg2;
		@Pc(89) float local89 = this.aClass328_5.aFloatArray106[9] * arg2 + this.aClass328_5.aFloatArray106[1] * arg0 + this.aClass328_5.aFloatArray106[13] + this.aClass328_5.aFloatArray106[5] * arg1;
		@Pc(119) float local119 = this.aClass328_6.aFloatArray106[10] * arg2 + this.aClass328_6.aFloatArray106[6] * arg1 + arg0 * this.aClass328_6.aFloatArray106[2] + this.aClass328_6.aFloatArray106[14];
		arg3[0] = this.aFloat19 + local59 * this.aFloat22 / local29;
		arg3[1] = this.aFloat17 + local89 * this.aFloat20 / local29;
		arg3[2] = local119;
	}

	@OriginalMember(owner = "client!abl", name = "lx", descriptor = "(FFF[F)V", line = 2055)
	@Override
	public void method17323(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass328_5.aFloatArray106[10] * arg2 + arg1 * this.aClass328_5.aFloatArray106[6] + this.aClass328_5.aFloatArray106[14] + arg0 * this.aClass328_5.aFloatArray106[2];
		@Pc(59) float local59 = arg2 * this.aClass328_5.aFloatArray106[11] + this.aClass328_5.aFloatArray106[7] * arg1 + this.aClass328_5.aFloatArray106[3] * arg0 + this.aClass328_5.aFloatArray106[15];
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass328_5.aFloatArray106[0] * arg0 + this.aClass328_5.aFloatArray106[12] + this.aClass328_5.aFloatArray106[4] * arg1 + this.aClass328_5.aFloatArray106[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = arg1 * this.aClass328_5.aFloatArray106[5] + this.aClass328_5.aFloatArray106[13] + arg0 * this.aClass328_5.aFloatArray106[1] + arg2 * this.aClass328_5.aFloatArray106[9];
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass328_6.aFloatArray106[14] + this.aClass328_6.aFloatArray106[2] * arg0 + arg1 * this.aClass328_6.aFloatArray106[6] + arg2 * this.aClass328_6.aFloatArray106[10];
			arg3[0] = this.aFloat19 + local115 * this.aFloat22 / local59;
			arg3[1] = this.aFloat17 + this.aFloat20 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!abl", name = "dw", descriptor = "(FFF[F)V", line = 2055)
	@Override
	public void method17030(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass328_5.aFloatArray106[10] * arg2 + arg1 * this.aClass328_5.aFloatArray106[6] + this.aClass328_5.aFloatArray106[14] + arg0 * this.aClass328_5.aFloatArray106[2];
		@Pc(59) float local59 = arg2 * this.aClass328_5.aFloatArray106[11] + this.aClass328_5.aFloatArray106[7] * arg1 + this.aClass328_5.aFloatArray106[3] * arg0 + this.aClass328_5.aFloatArray106[15];
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass328_5.aFloatArray106[0] * arg0 + this.aClass328_5.aFloatArray106[12] + this.aClass328_5.aFloatArray106[4] * arg1 + this.aClass328_5.aFloatArray106[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = arg1 * this.aClass328_5.aFloatArray106[5] + this.aClass328_5.aFloatArray106[13] + arg0 * this.aClass328_5.aFloatArray106[1] + arg2 * this.aClass328_5.aFloatArray106[9];
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass328_6.aFloatArray106[14] + this.aClass328_6.aFloatArray106[2] * arg0 + arg1 * this.aClass328_6.aFloatArray106[6] + arg2 * this.aClass328_6.aFloatArray106[10];
			arg3[0] = this.aFloat19 + local115 * this.aFloat22 / local59;
			arg3[1] = this.aFloat17 + this.aFloat20 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!abl", name = "ls", descriptor = "(FFF[F)V", line = 2055)
	@Override
	public void method17312(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3) {
		@Pc(29) float local29 = this.aClass328_5.aFloatArray106[10] * arg2 + arg1 * this.aClass328_5.aFloatArray106[6] + this.aClass328_5.aFloatArray106[14] + arg0 * this.aClass328_5.aFloatArray106[2];
		@Pc(59) float local59 = arg2 * this.aClass328_5.aFloatArray106[11] + this.aClass328_5.aFloatArray106[7] * arg1 + this.aClass328_5.aFloatArray106[3] * arg0 + this.aClass328_5.aFloatArray106[15];
		if (local29 < -local59 || local29 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(115) float local115 = this.aClass328_5.aFloatArray106[0] * arg0 + this.aClass328_5.aFloatArray106[12] + this.aClass328_5.aFloatArray106[4] * arg1 + this.aClass328_5.aFloatArray106[8] * arg2;
		if (local115 < -local59 || local115 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
			return;
		}
		@Pc(171) float local171 = arg1 * this.aClass328_5.aFloatArray106[5] + this.aClass328_5.aFloatArray106[13] + arg0 * this.aClass328_5.aFloatArray106[1] + arg2 * this.aClass328_5.aFloatArray106[9];
		if (local171 < -local59 || local171 > local59) {
			arg3[2] = Float.NaN;
			arg3[1] = Float.NaN;
			arg3[0] = Float.NaN;
		} else {
			@Pc(227) float local227 = this.aClass328_6.aFloatArray106[14] + this.aClass328_6.aFloatArray106[2] * arg0 + arg1 * this.aClass328_6.aFloatArray106[6] + arg2 * this.aClass328_6.aFloatArray106[10];
			arg3[0] = this.aFloat19 + local115 * this.aFloat22 / local59;
			arg3[1] = this.aFloat17 + this.aFloat20 * local171 / local59;
			arg3[2] = local227;
		}
	}

	@OriginalMember(owner = "client!abl", name = "aq", descriptor = "()Lclient!abj;", line = 2090)
	@Override
	public Class19_Sub1 method17047() {
		return new Class19_Sub1_Sub2(this);
	}

	@OriginalMember(owner = "client!abl", name = "la", descriptor = "()Lclient!abj;", line = 2090)
	@Override
	public Class19_Sub1 method17324() {
		return new Class19_Sub1_Sub2(this);
	}

	@OriginalMember(owner = "client!abl", name = "ps", descriptor = "(II)Lclient!da;", line = 2094)
	Interface10 method3171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class78(arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "rg", descriptor = "(II)Lclient!da;", line = 2094)
	Interface10 method3211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class78(arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "ld", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 2098)
	@Override
	public Interface10 method17257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return this.method3171(arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "ll", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 2098)
	@Override
	public Interface10 method17326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return this.method3171(arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "av", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 2098)
	@Override
	public Interface10 method17048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return this.method3171(arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "lk", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 2098)
	@Override
	public Interface10 method17284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return this.method3171(arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "lm", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 2098)
	@Override
	public Interface10 method17328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return this.method3171(arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "lv", descriptor = "(IILclient!cw;Lclient!dj;I)Lclient!da;", line = 2098)
	@Override
	public Interface10 method17276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4) {
		return this.method3171(arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "mv", descriptor = "(II)Lclient!dr;", line = 2102)
	@Override
	public Interface13 method17349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class98(arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "ma", descriptor = "(II)Lclient!dr;", line = 2102)
	@Override
	public Interface13 method17015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class98(arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "ax", descriptor = "(II)Lclient!dr;", line = 2102)
	@Override
	public Interface13 method17049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class98(arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "az", descriptor = "(III)Lclient!dr;", line = 2106)
	@Override
	public Interface13 method17329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class98(arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "lc", descriptor = "(III)Lclient!dr;", line = 2106)
	@Override
	public Interface13 method17330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class98(arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "le", descriptor = "(III)Lclient!dr;", line = 2106)
	@Override
	public Interface13 method17306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class98(arg0, arg1);
	}

	@OriginalMember(owner = "client!abl", name = "jm", descriptor = "(Lclient!av;I)Z", line = 6081)
	static final boolean method3214(@OriginalArg(0) Class82 arg0) {
		try {
			return Class147.method23099(arg0);
		} catch (@Pc(4) IOException local4) {
			if (client.anInt3039 * 1115111877 == 3) {
				arg0.method21605();
				return false;
			} else {
				Class486.method29181();
				return true;
			}
		} catch (@Pc(19) Exception local19) {
			@Pc(23) Class464 local23 = client.aClass370_1.method26942();
			@Pc(99) String local99 = (arg0.aClass301_2 == null ? -1 : arg0.aClass301_2.anInt4421 * -1607733701) + Class1.aString4 + (arg0.aClass301_1 == null ? -1 : arg0.aClass301_1.anInt4421 * -1607733701) + Class1.aString4 + (arg0.aClass301_4 == null ? -1 : arg0.aClass301_4.anInt4421 * -1607733701) + " " + arg0.anInt2915 * -64841839 + Class1.aString4 + (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray241[0] + local23.anInt5071 * -1567811631) + Class1.aString4 + (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] + local23.anInt5073 * 1360175441) + " ";
			for (@Pc(101) int local101 = 0; local101 < arg0.anInt2915 * -64841839 && local101 < 50; local101++) {
				local99 = local99 + arg0.aClass3_Sub41_Sub1_2.aByteArray51[local101] + Class1.aString4;
			}
			Class27_Sub1.method7214(local99, local19);
			Class394.method27445(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!abl", name = "vn", descriptor = "(Lclient!vs;I)V", line = 7956)
	static final void method3216(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aBoolean584 ? 1 : 0;
	}

	@OriginalMember(owner = "client!abl", name = "amk", descriptor = "(Lclient!vs;I)V", line = 11214)
	static final void method3217(@OriginalArg(0) Class536 arg0) {
		client.aBoolean579 = true;
		Class70_Sub1.method14734();
	}
}
