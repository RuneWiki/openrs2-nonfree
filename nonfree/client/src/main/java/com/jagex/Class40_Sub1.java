package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adp")
public abstract class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!adp", name = "o", descriptor = "I")
	static final int anInt2446 = 16;

	@OriginalMember(owner = "client!adp", name = "m", descriptor = "I")
	static final int anInt2447 = 1;

	@OriginalMember(owner = "client!adp", name = "v", descriptor = "I")
	static final int anInt2448 = 2;

	@OriginalMember(owner = "client!adp", name = "t", descriptor = "I")
	static final int anInt2449 = 4;

	@OriginalMember(owner = "client!adp", name = "w", descriptor = "I")
	static final int anInt2450 = 8;

	@OriginalMember(owner = "client!adp", name = "i", descriptor = "I")
	static final int anInt2451 = 32;

	@OriginalMember(owner = "client!adp", name = "f", descriptor = "I")
	static final int anInt2452 = 64;

	@OriginalMember(owner = "client!adp", name = "k", descriptor = "I")
	static final int anInt2454 = 128;

	@OriginalMember(owner = "client!adp", name = "ak", descriptor = "Lclient!mq;")
	static final Class328 aClass328_74 = new Class328();

	@OriginalMember(owner = "client!adp", name = "l", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_68;

	@OriginalMember(owner = "client!adp", name = "h", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_69;

	@OriginalMember(owner = "client!adp", name = "x", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_70;

	@OriginalMember(owner = "client!adp", name = "u", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_71;

	@OriginalMember(owner = "client!adp", name = "a", descriptor = "Lclient!fc;")
	protected Class24 aClass24_10;

	@OriginalMember(owner = "client!adp", name = "y", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_72;

	@OriginalMember(owner = "client!adp", name = "b", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_73;

	@OriginalMember(owner = "client!adp", name = "c", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_74;

	@OriginalMember(owner = "client!adp", name = "z", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_75;

	@OriginalMember(owner = "client!adp", name = "af", descriptor = "[I")
	int[] anIntArray248;

	@OriginalMember(owner = "client!adp", name = "n", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_76;

	@OriginalMember(owner = "client!adp", name = "g", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_77;

	@OriginalMember(owner = "client!adp", name = "d", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_78;

	@OriginalMember(owner = "client!adp", name = "q", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_79;

	@OriginalMember(owner = "client!adp", name = "r", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_80;

	@OriginalMember(owner = "client!adp", name = "j", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_81;

	@OriginalMember(owner = "client!adp", name = "at", descriptor = "I")
	int anInt2453;

	@OriginalMember(owner = "client!adp", name = "e", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_82;

	@OriginalMember(owner = "client!adp", name = "s", descriptor = "Lclient!alr;")
	Class3_Sub19_Sub1 aClass3_Sub19_Sub1_83;

	@OriginalMember(owner = "client!adp", name = "ah", descriptor = "[F")
	float[] aFloatArray72 = new float[3];

	@OriginalMember(owner = "client!adp", name = "aa", descriptor = "[Lclient!mq;")
	Class328[] aClass328Array5;

	@OriginalMember(owner = "client!adp", name = "<init>", descriptor = "(Lclient!abv;)V", line = 40)
	Class40_Sub1(@OriginalArg(0) Class21_Sub3 arg0) {
		super(arg0);
		new Class332();
		this.aClass328Array5 = new Class328[this.aClass21_Sub3_30.anInt2525];
		for (@Pc(18) int local18 = 0; local18 < this.aClass21_Sub3_30.anInt2525; local18++) {
			this.aClass328Array5[local18] = new Class328();
		}
	}

	@OriginalMember(owner = "client!adp", name = "w", descriptor = "(Ljava/lang/String;)Z", line = 49)
	boolean method16967(@OriginalArg(0) String arg0) throws Exception_Sub1 {
		this.aClass24_10 = this.aClass21_Sub3_30.method17435(arg0);
		if (this.aClass24_10 == null) {
			throw new Exception_Sub1("");
		}
		this.aClass3_Sub19_Sub1_77 = this.aClass24_10.method6586("textureMatrix");
		this.aClass3_Sub19_Sub1_68 = this.aClass24_10.method6586("modelMatrix");
		this.aClass3_Sub19_Sub1_69 = this.aClass24_10.method6586("viewMatrix");
		this.aClass3_Sub19_Sub1_70 = this.aClass24_10.method6586("projectionMatrix");
		this.aClass3_Sub19_Sub1_71 = this.aClass24_10.method6586("modelViewMatrix");
		this.aClass3_Sub19_Sub1_72 = this.aClass24_10.method6586("modelViewProjectionMatrix");
		this.aClass3_Sub19_Sub1_73 = this.aClass24_10.method6586("viewProjectionMatrix");
		this.aClass3_Sub19_Sub1_76 = this.aClass24_10.method6586("ambientColour");
		this.aClass3_Sub19_Sub1_78 = this.aClass24_10.method6586("sunDirection");
		this.aClass3_Sub19_Sub1_82 = this.aClass24_10.method6586("sunColour");
		this.aClass3_Sub19_Sub1_80 = this.aClass24_10.method6586("antiSunColour");
		this.aClass3_Sub19_Sub1_79 = this.aClass24_10.method6586("sunExponent");
		this.aClass3_Sub19_Sub1_74 = this.aClass24_10.method6586("eyePosition");
		this.aClass3_Sub19_Sub1_75 = this.aClass24_10.method6586("eyePositionOS");
		this.aClass3_Sub19_Sub1_81 = this.aClass24_10.method6586("sunDirectionOS");
		if (this.method16988()) {
			if (this.aClass24_10.method6561() == null) {
				@Pc(181) Class25 local181 = this.aClass24_10.method6599();
				if (local181 == null) {
					throw new Exception_Sub1(this.aClass24_10.method6623() + "");
				}
				this.aClass24_10.method6560(local181);
			}
			this.anInt2453 = this.aClass24_10.method6556();
			this.anIntArray248 = new int[this.anInt2453];
			return true;
		}
		this.aClass24_10 = null;
		this.aClass3_Sub19_Sub1_77 = null;
		this.aClass3_Sub19_Sub1_68 = null;
		this.aClass3_Sub19_Sub1_69 = null;
		this.aClass3_Sub19_Sub1_70 = null;
		this.aClass3_Sub19_Sub1_71 = null;
		this.aClass3_Sub19_Sub1_72 = null;
		this.aClass3_Sub19_Sub1_73 = null;
		this.aClass3_Sub19_Sub1_76 = null;
		this.aClass3_Sub19_Sub1_78 = null;
		this.aClass3_Sub19_Sub1_82 = null;
		this.aClass3_Sub19_Sub1_80 = null;
		this.aClass3_Sub19_Sub1_79 = null;
		this.aClass3_Sub19_Sub1_74 = null;
		this.aClass3_Sub19_Sub1_75 = null;
		this.aClass3_Sub19_Sub1_81 = null;
		return false;
	}

	@OriginalMember(owner = "client!adp", name = "aj", descriptor = "(Ljava/lang/String;)Z", line = 49)
	boolean method16979(@OriginalArg(0) String arg0) throws Exception_Sub1 {
		this.aClass24_10 = this.aClass21_Sub3_30.method17435(arg0);
		if (this.aClass24_10 == null) {
			throw new Exception_Sub1("");
		}
		this.aClass3_Sub19_Sub1_77 = this.aClass24_10.method6586("textureMatrix");
		this.aClass3_Sub19_Sub1_68 = this.aClass24_10.method6586("modelMatrix");
		this.aClass3_Sub19_Sub1_69 = this.aClass24_10.method6586("viewMatrix");
		this.aClass3_Sub19_Sub1_70 = this.aClass24_10.method6586("projectionMatrix");
		this.aClass3_Sub19_Sub1_71 = this.aClass24_10.method6586("modelViewMatrix");
		this.aClass3_Sub19_Sub1_72 = this.aClass24_10.method6586("modelViewProjectionMatrix");
		this.aClass3_Sub19_Sub1_73 = this.aClass24_10.method6586("viewProjectionMatrix");
		this.aClass3_Sub19_Sub1_76 = this.aClass24_10.method6586("ambientColour");
		this.aClass3_Sub19_Sub1_78 = this.aClass24_10.method6586("sunDirection");
		this.aClass3_Sub19_Sub1_82 = this.aClass24_10.method6586("sunColour");
		this.aClass3_Sub19_Sub1_80 = this.aClass24_10.method6586("antiSunColour");
		this.aClass3_Sub19_Sub1_79 = this.aClass24_10.method6586("sunExponent");
		this.aClass3_Sub19_Sub1_74 = this.aClass24_10.method6586("eyePosition");
		this.aClass3_Sub19_Sub1_75 = this.aClass24_10.method6586("eyePositionOS");
		this.aClass3_Sub19_Sub1_81 = this.aClass24_10.method6586("sunDirectionOS");
		if (this.method16988()) {
			if (this.aClass24_10.method6561() == null) {
				@Pc(181) Class25 local181 = this.aClass24_10.method6599();
				if (local181 == null) {
					throw new Exception_Sub1(this.aClass24_10.method6623() + "");
				}
				this.aClass24_10.method6560(local181);
			}
			this.anInt2453 = this.aClass24_10.method6556();
			this.anIntArray248 = new int[this.anInt2453];
			return true;
		}
		this.aClass24_10 = null;
		this.aClass3_Sub19_Sub1_77 = null;
		this.aClass3_Sub19_Sub1_68 = null;
		this.aClass3_Sub19_Sub1_69 = null;
		this.aClass3_Sub19_Sub1_70 = null;
		this.aClass3_Sub19_Sub1_71 = null;
		this.aClass3_Sub19_Sub1_72 = null;
		this.aClass3_Sub19_Sub1_73 = null;
		this.aClass3_Sub19_Sub1_76 = null;
		this.aClass3_Sub19_Sub1_78 = null;
		this.aClass3_Sub19_Sub1_82 = null;
		this.aClass3_Sub19_Sub1_80 = null;
		this.aClass3_Sub19_Sub1_79 = null;
		this.aClass3_Sub19_Sub1_74 = null;
		this.aClass3_Sub19_Sub1_75 = null;
		this.aClass3_Sub19_Sub1_81 = null;
		return false;
	}

	@OriginalMember(owner = "client!adp", name = "p", descriptor = "()V", line = 102)
	@Override
	void method16963() {
		this.aClass24_10.method6550();
		this.anIntArray248[this.aClass24_10.method6628()] = -1;
		this.method16976(0);
		this.method16969();
	}

	@OriginalMember(owner = "client!adp", name = "u", descriptor = "()V", line = 102)
	@Override
	void method16952() {
		this.aClass24_10.method6550();
		this.anIntArray248[this.aClass24_10.method6628()] = -1;
		this.method16976(0);
		this.method16969();
	}

	@OriginalMember(owner = "client!adp", name = "i", descriptor = "()V", line = 109)
	void method16969() {
		this.method16970(this.aClass21_Sub3_30.aBoolean430);
		this.method16968(this.aClass21_Sub3_30.method17646());
		this.method16977();
		this.method16950();
	}

	@OriginalMember(owner = "client!adp", name = "ai", descriptor = "()V", line = 109)
	void method16978() {
		this.method16970(this.aClass21_Sub3_30.aBoolean430);
		this.method16968(this.aClass21_Sub3_30.method17646());
		this.method16977();
		this.method16950();
	}

	@OriginalMember(owner = "client!adp", name = "y", descriptor = "()V", line = 116)
	@Override
	void method16953() {
		if (this.aClass24_10 != null) {
			this.aClass24_10.method6551();
		}
	}

	@OriginalMember(owner = "client!adp", name = "b", descriptor = "()V", line = 116)
	@Override
	void method16946() {
		if (this.aClass24_10 != null) {
			this.aClass24_10.method6551();
		}
	}

	@OriginalMember(owner = "client!adp", name = "a", descriptor = "()V", line = 116)
	@Override
	void method16947() {
		if (this.aClass24_10 != null) {
			this.aClass24_10.method6551();
		}
	}

	@OriginalMember(owner = "client!adp", name = "f", descriptor = "(Lclient!mq;)V", line = 120)
	void method16968(@OriginalArg(0) Class328 arg0) {
		if (this.aClass24_10 == null || !this.aClass24_10.method6574() || this.aClass21_Sub3_30.method17719() != 0) {
			return;
		}
		@Pc(15) int local15 = this.aClass24_10.method6628();
		if ((this.anIntArray248[local15] & 0x80) != 0 && this.aClass3_Sub19_Sub1_77 != null) {
			this.aClass24_10.method6572(this.aClass3_Sub19_Sub1_77, arg0);
			this.anIntArray248[local15] &= 0xFFFFFF7F;
		}
	}

	@OriginalMember(owner = "client!adp", name = "ax", descriptor = "(Lclient!mq;)V", line = 120)
	void method16971(@OriginalArg(0) Class328 arg0) {
		if (this.aClass24_10 == null || !this.aClass24_10.method6574() || this.aClass21_Sub3_30.method17719() != 0) {
			return;
		}
		@Pc(15) int local15 = this.aClass24_10.method6628();
		if ((this.anIntArray248[local15] & 0x80) != 0 && this.aClass3_Sub19_Sub1_77 != null) {
			this.aClass24_10.method6572(this.aClass3_Sub19_Sub1_77, arg0);
			this.anIntArray248[local15] &= 0xFFFFFF7F;
		}
	}

	@OriginalMember(owner = "client!adp", name = "aq", descriptor = "(Lclient!mq;)V", line = 120)
	void method16980(@OriginalArg(0) Class328 arg0) {
		if (this.aClass24_10 == null || !this.aClass24_10.method6574() || this.aClass21_Sub3_30.method17719() != 0) {
			return;
		}
		@Pc(15) int local15 = this.aClass24_10.method6628();
		if ((this.anIntArray248[local15] & 0x80) != 0 && this.aClass3_Sub19_Sub1_77 != null) {
			this.aClass24_10.method6572(this.aClass3_Sub19_Sub1_77, arg0);
			this.anIntArray248[local15] &= 0xFFFFFF7F;
		}
	}

	@OriginalMember(owner = "client!adp", name = "av", descriptor = "(Lclient!mq;)V", line = 120)
	void method16981(@OriginalArg(0) Class328 arg0) {
		if (this.aClass24_10 == null || !this.aClass24_10.method6574() || this.aClass21_Sub3_30.method17719() != 0) {
			return;
		}
		@Pc(15) int local15 = this.aClass24_10.method6628();
		if ((this.anIntArray248[local15] & 0x80) != 0 && this.aClass3_Sub19_Sub1_77 != null) {
			this.aClass24_10.method6572(this.aClass3_Sub19_Sub1_77, arg0);
			this.anIntArray248[local15] &= 0xFFFFFF7F;
		}
	}

	@OriginalMember(owner = "client!adp", name = "k", descriptor = "()V", line = 130)
	void method16977() {
		if (this.aClass24_10 == null || !this.aClass24_10.method6574()) {
			return;
		}
		@Pc(11) int local11 = this.aClass24_10.method6628();
		@Pc(16) int local16 = this.anIntArray248[local11];
		if ((local16 & 0x1) != 0 && this.aClass3_Sub19_Sub1_68 != null) {
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_68, this.aClass21_Sub3_30.method17478());
		}
		if ((local16 & 0x2) != 0) {
			if (this.aClass3_Sub19_Sub1_69 != null) {
				this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_69, this.aClass21_Sub3_30.method17466());
			}
			if (this.aClass3_Sub19_Sub1_74 != null) {
				this.aFloatArray72[0] = 0.0F;
				this.aFloatArray72[1] = 0.0F;
				this.aFloatArray72[2] = 0.0F;
				this.aClass21_Sub3_30.method17107().method26207(this.aFloatArray72[0], this.aFloatArray72[1], this.aFloatArray72[2], this.aFloatArray72);
				this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_74, this.aFloatArray72[0], this.aFloatArray72[1], this.aFloatArray72[2]);
			}
		}
		if ((local16 & 0x10) != 0 && this.aClass3_Sub19_Sub1_71 != null) {
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_71, this.aClass21_Sub3_30.method17480());
		}
		if ((local16 & 0x8) != 0 && this.aClass3_Sub19_Sub1_83 != null) {
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_83, this.aClass21_Sub3_30.method17548());
		}
		if ((local16 & 0x4) != 0 && this.aClass3_Sub19_Sub1_70 != null) {
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_70, this.aClass21_Sub3_30.method17482());
		}
		if ((local16 & 0x20) != 0 && this.aClass3_Sub19_Sub1_72 != null) {
			aClass328_74.method26045(this.aClass21_Sub3_30.method17480(), this.aClass21_Sub3_30.method17482());
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_72, aClass328_74);
		}
		if ((local16 & 0x40) != 0 && this.aClass3_Sub19_Sub1_73 != null) {
			aClass328_74.method26045(this.aClass21_Sub3_30.method17466(), this.aClass21_Sub3_30.method17482());
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_73, aClass328_74);
		}
		if (this.aClass21_Sub3_30.method17719() == 0 && (this.anIntArray248[local11] & 0x80) != 0 && this.aClass3_Sub19_Sub1_77 != null) {
			this.aClass24_10.method6572(this.aClass3_Sub19_Sub1_77, this.aClass21_Sub3_30.method17646());
			this.anIntArray248[local11] &= 0xFFFFFF7F;
		}
		this.anIntArray248[local11] = 0;
	}

	@OriginalMember(owner = "client!adp", name = "az", descriptor = "()V", line = 130)
	void method16983() {
		if (this.aClass24_10 == null || !this.aClass24_10.method6574()) {
			return;
		}
		@Pc(11) int local11 = this.aClass24_10.method6628();
		@Pc(16) int local16 = this.anIntArray248[local11];
		if ((local16 & 0x1) != 0 && this.aClass3_Sub19_Sub1_68 != null) {
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_68, this.aClass21_Sub3_30.method17478());
		}
		if ((local16 & 0x2) != 0) {
			if (this.aClass3_Sub19_Sub1_69 != null) {
				this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_69, this.aClass21_Sub3_30.method17466());
			}
			if (this.aClass3_Sub19_Sub1_74 != null) {
				this.aFloatArray72[0] = 0.0F;
				this.aFloatArray72[1] = 0.0F;
				this.aFloatArray72[2] = 0.0F;
				this.aClass21_Sub3_30.method17107().method26207(this.aFloatArray72[0], this.aFloatArray72[1], this.aFloatArray72[2], this.aFloatArray72);
				this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_74, this.aFloatArray72[0], this.aFloatArray72[1], this.aFloatArray72[2]);
			}
		}
		if ((local16 & 0x10) != 0 && this.aClass3_Sub19_Sub1_71 != null) {
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_71, this.aClass21_Sub3_30.method17480());
		}
		if ((local16 & 0x8) != 0 && this.aClass3_Sub19_Sub1_83 != null) {
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_83, this.aClass21_Sub3_30.method17548());
		}
		if ((local16 & 0x4) != 0 && this.aClass3_Sub19_Sub1_70 != null) {
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_70, this.aClass21_Sub3_30.method17482());
		}
		if ((local16 & 0x20) != 0 && this.aClass3_Sub19_Sub1_72 != null) {
			aClass328_74.method26045(this.aClass21_Sub3_30.method17480(), this.aClass21_Sub3_30.method17482());
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_72, aClass328_74);
		}
		if ((local16 & 0x40) != 0 && this.aClass3_Sub19_Sub1_73 != null) {
			aClass328_74.method26045(this.aClass21_Sub3_30.method17466(), this.aClass21_Sub3_30.method17482());
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_73, aClass328_74);
		}
		if (this.aClass21_Sub3_30.method17719() == 0 && (this.anIntArray248[local11] & 0x80) != 0 && this.aClass3_Sub19_Sub1_77 != null) {
			this.aClass24_10.method6572(this.aClass3_Sub19_Sub1_77, this.aClass21_Sub3_30.method17646());
			this.anIntArray248[local11] &= 0xFFFFFF7F;
		}
		this.anIntArray248[local11] = 0;
	}

	@OriginalMember(owner = "client!adp", name = "at", descriptor = "(ILclient!mu;)V", line = 174)
	void method16972(@OriginalArg(0) int arg0, @OriginalArg(1) Class332 arg1) {
		if (this.aClass3_Sub19_Sub1_75 == null) {
			return;
		}
		@Pc(6) Class328 local6 = this.aClass21_Sub3_30.method17548();
		@Pc(30) float[] local30 = new float[] { local6.aFloatArray106[12], local6.aFloatArray106[13], local6.aFloatArray106[14] };
		@Pc(45) float[] local45 = new float[] { 0.0F, 0.0F, 0.0F };
		local6.method26053(local45);
		@Pc(63) float[] local63 = new float[] { 0.0F, 0.0F, 0.0F };
		this.aClass21_Sub3_30.method17107().method26206(0.0F, 0.0F, 0.0F, local63);
		arg1.method26208(local30);
		this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_75, local30[0], local30[1], local30[2]);
	}

	@OriginalMember(owner = "client!adp", name = "al", descriptor = "(ILclient!mu;)V", line = 174)
	void method16984(@OriginalArg(1) Class332 arg0) {
		if (this.aClass3_Sub19_Sub1_75 == null) {
			return;
		}
		@Pc(6) Class328 local6 = this.aClass21_Sub3_30.method17548();
		@Pc(30) float[] local30 = new float[] { local6.aFloatArray106[12], local6.aFloatArray106[13], local6.aFloatArray106[14] };
		@Pc(45) float[] local45 = new float[] { 0.0F, 0.0F, 0.0F };
		local6.method26053(local45);
		@Pc(63) float[] local63 = new float[] { 0.0F, 0.0F, 0.0F };
		this.aClass21_Sub3_30.method17107().method26206(0.0F, 0.0F, 0.0F, local63);
		arg0.method26208(local30);
		this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_75, local30[0], local30[1], local30[2]);
	}

	@OriginalMember(owner = "client!adp", name = "af", descriptor = "(ILclient!mu;)V", line = 187)
	void method16973(@OriginalArg(0) int arg0, @OriginalArg(1) Class332 arg1) {
		if (this.aClass3_Sub19_Sub1_81 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass21_Sub3_30.aFloatArray76[0], this.aClass21_Sub3_30.aFloatArray76[1], this.aClass21_Sub3_30.aFloatArray76[2] };
			arg1.method26227(local29);
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_81, local29[0], local29[1], local29[2]);
		}
	}

	@OriginalMember(owner = "client!adp", name = "ao", descriptor = "(ILclient!mu;)V", line = 187)
	void method16985(@OriginalArg(1) Class332 arg0) {
		if (this.aClass3_Sub19_Sub1_81 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass21_Sub3_30.aFloatArray76[0], this.aClass21_Sub3_30.aFloatArray76[1], this.aClass21_Sub3_30.aFloatArray76[2] };
			arg0.method26227(local29);
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_81, local29[0], local29[1], local29[2]);
		}
	}

	@OriginalMember(owner = "client!adp", name = "ap", descriptor = "(ILclient!mu;)V", line = 187)
	void method16986(@OriginalArg(1) Class332 arg0) {
		if (this.aClass3_Sub19_Sub1_81 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass21_Sub3_30.aFloatArray76[0], this.aClass21_Sub3_30.aFloatArray76[1], this.aClass21_Sub3_30.aFloatArray76[2] };
			arg0.method26227(local29);
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_81, local29[0], local29[1], local29[2]);
		}
	}

	@OriginalMember(owner = "client!adp", name = "ab", descriptor = "(ILclient!mu;)V", line = 187)
	void method16987(@OriginalArg(1) Class332 arg0) {
		if (this.aClass3_Sub19_Sub1_81 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass21_Sub3_30.aFloatArray76[0], this.aClass21_Sub3_30.aFloatArray76[1], this.aClass21_Sub3_30.aFloatArray76[2] };
			arg0.method26227(local29);
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_81, local29[0], local29[1], local29[2]);
		}
	}

	@OriginalMember(owner = "client!adp", name = "ak", descriptor = "(Z)V", line = 195)
	void method16970(@OriginalArg(0) boolean arg0) {
		if (this.aClass24_10 == null || !this.aClass24_10.method6574()) {
			return;
		}
		if (this.aClass3_Sub19_Sub1_76 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_76, this.aClass21_Sub3_30.aFloat193 * this.aClass21_Sub3_30.aFloat197, this.aClass21_Sub3_30.aFloat194 * this.aClass21_Sub3_30.aFloat197, this.aClass21_Sub3_30.aFloat185 * this.aClass21_Sub3_30.aFloat197);
		}
		if (this.aClass3_Sub19_Sub1_78 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_78, this.aClass21_Sub3_30.aFloatArray76[0], this.aClass21_Sub3_30.aFloatArray76[1], this.aClass21_Sub3_30.aFloatArray76[2]);
		}
		if (this.aClass3_Sub19_Sub1_82 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_82, this.aClass21_Sub3_30.aFloat193 * this.aClass21_Sub3_30.aFloat195, this.aClass21_Sub3_30.aFloat194 * this.aClass21_Sub3_30.aFloat195, this.aClass21_Sub3_30.aFloat185 * this.aClass21_Sub3_30.aFloat195);
		}
		if (this.aClass3_Sub19_Sub1_80 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_80, -this.aClass21_Sub3_30.aFloat193 * this.aClass21_Sub3_30.aFloat196, -this.aClass21_Sub3_30.aFloat194 * this.aClass21_Sub3_30.aFloat196, -this.aClass21_Sub3_30.aFloat185 * this.aClass21_Sub3_30.aFloat196);
		}
		if (this.aClass3_Sub19_Sub1_79 != null) {
			this.aClass24_10.method6564(this.aClass3_Sub19_Sub1_79, Math.abs(this.aClass21_Sub3_30.aFloatArray76[1]) * 928.0F + 64.0F);
		}
	}

	@OriginalMember(owner = "client!adp", name = "ay", descriptor = "(Z)V", line = 195)
	void method16989(@OriginalArg(0) boolean arg0) {
		if (this.aClass24_10 == null || !this.aClass24_10.method6574()) {
			return;
		}
		if (this.aClass3_Sub19_Sub1_76 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_76, this.aClass21_Sub3_30.aFloat193 * this.aClass21_Sub3_30.aFloat197, this.aClass21_Sub3_30.aFloat194 * this.aClass21_Sub3_30.aFloat197, this.aClass21_Sub3_30.aFloat185 * this.aClass21_Sub3_30.aFloat197);
		}
		if (this.aClass3_Sub19_Sub1_78 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_78, this.aClass21_Sub3_30.aFloatArray76[0], this.aClass21_Sub3_30.aFloatArray76[1], this.aClass21_Sub3_30.aFloatArray76[2]);
		}
		if (this.aClass3_Sub19_Sub1_82 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_82, this.aClass21_Sub3_30.aFloat193 * this.aClass21_Sub3_30.aFloat195, this.aClass21_Sub3_30.aFloat194 * this.aClass21_Sub3_30.aFloat195, this.aClass21_Sub3_30.aFloat185 * this.aClass21_Sub3_30.aFloat195);
		}
		if (this.aClass3_Sub19_Sub1_80 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_80, -this.aClass21_Sub3_30.aFloat193 * this.aClass21_Sub3_30.aFloat196, -this.aClass21_Sub3_30.aFloat194 * this.aClass21_Sub3_30.aFloat196, -this.aClass21_Sub3_30.aFloat185 * this.aClass21_Sub3_30.aFloat196);
		}
		if (this.aClass3_Sub19_Sub1_79 != null) {
			this.aClass24_10.method6564(this.aClass3_Sub19_Sub1_79, Math.abs(this.aClass21_Sub3_30.aFloatArray76[1]) * 928.0F + 64.0F);
		}
	}

	@OriginalMember(owner = "client!adp", name = "ag", descriptor = "(Z)V", line = 195)
	void method16990(@OriginalArg(0) boolean arg0) {
		if (this.aClass24_10 == null || !this.aClass24_10.method6574()) {
			return;
		}
		if (this.aClass3_Sub19_Sub1_76 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_76, this.aClass21_Sub3_30.aFloat193 * this.aClass21_Sub3_30.aFloat197, this.aClass21_Sub3_30.aFloat194 * this.aClass21_Sub3_30.aFloat197, this.aClass21_Sub3_30.aFloat185 * this.aClass21_Sub3_30.aFloat197);
		}
		if (this.aClass3_Sub19_Sub1_78 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_78, this.aClass21_Sub3_30.aFloatArray76[0], this.aClass21_Sub3_30.aFloatArray76[1], this.aClass21_Sub3_30.aFloatArray76[2]);
		}
		if (this.aClass3_Sub19_Sub1_82 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_82, this.aClass21_Sub3_30.aFloat193 * this.aClass21_Sub3_30.aFloat195, this.aClass21_Sub3_30.aFloat194 * this.aClass21_Sub3_30.aFloat195, this.aClass21_Sub3_30.aFloat185 * this.aClass21_Sub3_30.aFloat195);
		}
		if (this.aClass3_Sub19_Sub1_80 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_80, -this.aClass21_Sub3_30.aFloat193 * this.aClass21_Sub3_30.aFloat196, -this.aClass21_Sub3_30.aFloat194 * this.aClass21_Sub3_30.aFloat196, -this.aClass21_Sub3_30.aFloat185 * this.aClass21_Sub3_30.aFloat196);
		}
		if (this.aClass3_Sub19_Sub1_79 != null) {
			this.aClass24_10.method6564(this.aClass3_Sub19_Sub1_79, Math.abs(this.aClass21_Sub3_30.aFloatArray76[1]) * 928.0F + 64.0F);
		}
	}

	@OriginalMember(owner = "client!adp", name = "am", descriptor = "(Z)V", line = 195)
	void method16991(@OriginalArg(0) boolean arg0) {
		if (this.aClass24_10 == null || !this.aClass24_10.method6574()) {
			return;
		}
		if (this.aClass3_Sub19_Sub1_76 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_76, this.aClass21_Sub3_30.aFloat193 * this.aClass21_Sub3_30.aFloat197, this.aClass21_Sub3_30.aFloat194 * this.aClass21_Sub3_30.aFloat197, this.aClass21_Sub3_30.aFloat185 * this.aClass21_Sub3_30.aFloat197);
		}
		if (this.aClass3_Sub19_Sub1_78 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_78, this.aClass21_Sub3_30.aFloatArray76[0], this.aClass21_Sub3_30.aFloatArray76[1], this.aClass21_Sub3_30.aFloatArray76[2]);
		}
		if (this.aClass3_Sub19_Sub1_82 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_82, this.aClass21_Sub3_30.aFloat193 * this.aClass21_Sub3_30.aFloat195, this.aClass21_Sub3_30.aFloat194 * this.aClass21_Sub3_30.aFloat195, this.aClass21_Sub3_30.aFloat185 * this.aClass21_Sub3_30.aFloat195);
		}
		if (this.aClass3_Sub19_Sub1_80 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_80, -this.aClass21_Sub3_30.aFloat193 * this.aClass21_Sub3_30.aFloat196, -this.aClass21_Sub3_30.aFloat194 * this.aClass21_Sub3_30.aFloat196, -this.aClass21_Sub3_30.aFloat185 * this.aClass21_Sub3_30.aFloat196);
		}
		if (this.aClass3_Sub19_Sub1_79 != null) {
			this.aClass24_10.method6564(this.aClass3_Sub19_Sub1_79, Math.abs(this.aClass21_Sub3_30.aFloatArray76[1]) * 928.0F + 64.0F);
		}
	}

	@OriginalMember(owner = "client!adp", name = "au", descriptor = "(Z)V", line = 195)
	void method16996(@OriginalArg(0) boolean arg0) {
		if (this.aClass24_10 == null || !this.aClass24_10.method6574()) {
			return;
		}
		if (this.aClass3_Sub19_Sub1_76 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_76, this.aClass21_Sub3_30.aFloat193 * this.aClass21_Sub3_30.aFloat197, this.aClass21_Sub3_30.aFloat194 * this.aClass21_Sub3_30.aFloat197, this.aClass21_Sub3_30.aFloat185 * this.aClass21_Sub3_30.aFloat197);
		}
		if (this.aClass3_Sub19_Sub1_78 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_78, this.aClass21_Sub3_30.aFloatArray76[0], this.aClass21_Sub3_30.aFloatArray76[1], this.aClass21_Sub3_30.aFloatArray76[2]);
		}
		if (this.aClass3_Sub19_Sub1_82 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_82, this.aClass21_Sub3_30.aFloat193 * this.aClass21_Sub3_30.aFloat195, this.aClass21_Sub3_30.aFloat194 * this.aClass21_Sub3_30.aFloat195, this.aClass21_Sub3_30.aFloat185 * this.aClass21_Sub3_30.aFloat195);
		}
		if (this.aClass3_Sub19_Sub1_80 != null) {
			this.aClass24_10.method6566(this.aClass3_Sub19_Sub1_80, -this.aClass21_Sub3_30.aFloat193 * this.aClass21_Sub3_30.aFloat196, -this.aClass21_Sub3_30.aFloat194 * this.aClass21_Sub3_30.aFloat196, -this.aClass21_Sub3_30.aFloat185 * this.aClass21_Sub3_30.aFloat196);
		}
		if (this.aClass3_Sub19_Sub1_79 != null) {
			this.aClass24_10.method6564(this.aClass3_Sub19_Sub1_79, Math.abs(this.aClass21_Sub3_30.aFloatArray76[1]) * 928.0F + 64.0F);
		}
	}

	@OriginalMember(owner = "client!adp", name = "r", descriptor = "()V", line = 204)
	@Override
	void method16961() {
	}

	@OriginalMember(owner = "client!adp", name = "h", descriptor = "()V", line = 204)
	@Override
	void method16950() {
	}

	@OriginalMember(owner = "client!adp", name = "aa", descriptor = "(I)V", line = 207)
	void method16966(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2453; local1++) {
			this.anIntArray248[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!adp", name = "ar", descriptor = "(I)V", line = 207)
	void method16992(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2453; local1++) {
			this.anIntArray248[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!adp", name = "ae", descriptor = "(I)V", line = 207)
	void method16993(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2453; local1++) {
			this.anIntArray248[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!adp", name = "aw", descriptor = "(Lclient!mu;)V", line = 213)
	void method16974(@OriginalArg(0) Class332 arg0) {
		@Pc(3) Class328 local3 = this.aClass21_Sub3_30.aClass328_86;
		local3.method26056(arg0);
		@Pc(11) int local11 = this.aClass24_10.method6628();
		if (this.aClass3_Sub19_Sub1_68 != null) {
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_68, local3);
			this.anIntArray248[local11] &= 0xFFFFFFFE;
		}
		if (this.aClass3_Sub19_Sub1_71 != null) {
			aClass328_74.method26045(local3, this.aClass21_Sub3_30.method17466());
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_71, aClass328_74);
			this.anIntArray248[local11] &= 0xFFFFFFEF;
		}
		if (this.aClass3_Sub19_Sub1_72 != null) {
			aClass328_74.method26045(local3, this.aClass21_Sub3_30.method17481());
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_72, aClass328_74);
			this.anIntArray248[local11] &= 0xFFFFFFDF;
		}
		this.method16972(local11, arg0);
		this.method16973(local11, arg0);
	}

	@OriginalMember(owner = "client!adp", name = "ah", descriptor = "(Lclient!mu;)V", line = 213)
	void method16975(@OriginalArg(0) Class332 arg0) {
		@Pc(3) Class328 local3 = this.aClass21_Sub3_30.aClass328_86;
		local3.method26056(arg0);
		@Pc(11) int local11 = this.aClass24_10.method6628();
		if (this.aClass3_Sub19_Sub1_68 != null) {
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_68, local3);
			this.anIntArray248[local11] &= 0xFFFFFFFE;
		}
		if (this.aClass3_Sub19_Sub1_71 != null) {
			aClass328_74.method26045(local3, this.aClass21_Sub3_30.method17466());
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_71, aClass328_74);
			this.anIntArray248[local11] &= 0xFFFFFFEF;
		}
		if (this.aClass3_Sub19_Sub1_72 != null) {
			aClass328_74.method26045(local3, this.aClass21_Sub3_30.method17481());
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_72, aClass328_74);
			this.anIntArray248[local11] &= 0xFFFFFFDF;
		}
		this.method16972(local11, arg0);
		this.method16973(local11, arg0);
	}

	@OriginalMember(owner = "client!adp", name = "ad", descriptor = "(Lclient!mu;)V", line = 213)
	void method16994(@OriginalArg(0) Class332 arg0) {
		@Pc(3) Class328 local3 = this.aClass21_Sub3_30.aClass328_86;
		local3.method26056(arg0);
		@Pc(11) int local11 = this.aClass24_10.method6628();
		if (this.aClass3_Sub19_Sub1_68 != null) {
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_68, local3);
			this.anIntArray248[local11] &= 0xFFFFFFFE;
		}
		if (this.aClass3_Sub19_Sub1_71 != null) {
			aClass328_74.method26045(local3, this.aClass21_Sub3_30.method17466());
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_71, aClass328_74);
			this.anIntArray248[local11] &= 0xFFFFFFEF;
		}
		if (this.aClass3_Sub19_Sub1_72 != null) {
			aClass328_74.method26045(local3, this.aClass21_Sub3_30.method17481());
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_72, aClass328_74);
			this.anIntArray248[local11] &= 0xFFFFFFDF;
		}
		this.method16972(local11, arg0);
		this.method16973(local11, arg0);
	}

	@OriginalMember(owner = "client!adp", name = "ac", descriptor = "(Lclient!mu;)V", line = 213)
	void method16995(@OriginalArg(0) Class332 arg0) {
		@Pc(3) Class328 local3 = this.aClass21_Sub3_30.aClass328_86;
		local3.method26056(arg0);
		@Pc(11) int local11 = this.aClass24_10.method6628();
		if (this.aClass3_Sub19_Sub1_68 != null) {
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_68, local3);
			this.anIntArray248[local11] &= 0xFFFFFFFE;
		}
		if (this.aClass3_Sub19_Sub1_71 != null) {
			aClass328_74.method26045(local3, this.aClass21_Sub3_30.method17466());
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_71, aClass328_74);
			this.anIntArray248[local11] &= 0xFFFFFFEF;
		}
		if (this.aClass3_Sub19_Sub1_72 != null) {
			aClass328_74.method26045(local3, this.aClass21_Sub3_30.method17481());
			this.aClass24_10.method6620(this.aClass3_Sub19_Sub1_72, aClass328_74);
			this.anIntArray248[local11] &= 0xFFFFFFDF;
		}
		this.method16972(local11, arg0);
		this.method16973(local11, arg0);
	}

	@OriginalMember(owner = "client!adp", name = "v", descriptor = "()V", line = 235)
	@Override
	void method16964() {
		this.method16975(Class332.aClass332_54);
	}

	@OriginalMember(owner = "client!adp", name = "s", descriptor = "()V", line = 235)
	@Override
	void method16960() {
		this.method16975(Class332.aClass332_54);
	}

	@OriginalMember(owner = "client!adp", name = "q", descriptor = "()V", line = 235)
	@Override
	void method16962() {
		this.method16975(Class332.aClass332_54);
	}

	@OriginalMember(owner = "client!adp", name = "m", descriptor = "()V", line = 235)
	@Override
	void method16958() {
		this.method16975(Class332.aClass332_54);
	}

	@OriginalMember(owner = "client!adp", name = "t", descriptor = "()V", line = 235)
	@Override
	void method16965() {
		this.method16975(Class332.aClass332_54);
	}

	@OriginalMember(owner = "client!adp", name = "an", descriptor = "(I)V", line = 239)
	void method16976(@OriginalArg(0) int arg0) {
		this.aClass328Array5[0].method26042();
		this.method16966(arg0);
	}

	@OriginalMember(owner = "client!adp", name = "bw", descriptor = "(I)V", line = 239)
	void method16997(@OriginalArg(0) int arg0) {
		this.aClass328Array5[0].method26042();
		this.method16966(arg0);
	}

	@OriginalMember(owner = "client!adp", name = "bp", descriptor = "(I)V", line = 239)
	void method16998(@OriginalArg(0) int arg0) {
		this.aClass328Array5[0].method26042();
		this.method16966(arg0);
	}

	@OriginalMember(owner = "client!adp", name = "bd", descriptor = "(I)V", line = 239)
	void method16999(@OriginalArg(0) int arg0) {
		this.aClass328Array5[0].method26042();
		this.method16966(arg0);
	}

	@OriginalMember(owner = "client!adp", name = "bs", descriptor = "(I)V", line = 239)
	void method17000(@OriginalArg(0) int arg0) {
		this.aClass328Array5[0].method26042();
		this.method16966(arg0);
	}

	@OriginalMember(owner = "client!adp", name = "bm", descriptor = "(I)V", line = 239)
	void method17001(@OriginalArg(0) int arg0) {
		this.aClass328Array5[0].method26042();
		this.method16966(arg0);
	}

	@OriginalMember(owner = "client!adp", name = "as", descriptor = "()Z")
	abstract boolean method16982() throws Exception_Sub1;

	@OriginalMember(owner = "client!adp", name = "o", descriptor = "()Z")
	abstract boolean method16988() throws Exception_Sub1;
}
