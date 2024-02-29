package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahn")
public abstract class Class122_Sub1 extends Class122 {

	@OriginalMember(owner = "client!ahn", name = "e", descriptor = "I")
	static final int anInt2590 = 1;

	@OriginalMember(owner = "client!ahn", name = "f", descriptor = "I")
	static final int anInt2591 = 2;

	@OriginalMember(owner = "client!ahn", name = "o", descriptor = "I")
	static final int anInt2592 = 4;

	@OriginalMember(owner = "client!ahn", name = "b", descriptor = "I")
	static final int anInt2593 = 8;

	@OriginalMember(owner = "client!ahn", name = "n", descriptor = "I")
	static final int anInt2594 = 16;

	@OriginalMember(owner = "client!ahn", name = "a", descriptor = "I")
	static final int anInt2595 = 32;

	@OriginalMember(owner = "client!ahn", name = "m", descriptor = "I")
	static final int anInt2596 = 64;

	@OriginalMember(owner = "client!ahn", name = "h", descriptor = "I")
	static final int anInt2597 = 128;

	@OriginalMember(owner = "client!ahn", name = "ag", descriptor = "Lclient!oi;")
	static final Class442 aClass442_57 = new Class442();

	@OriginalMember(owner = "client!ahn", name = "v", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_62;

	@OriginalMember(owner = "client!ahn", name = "j", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_63;

	@OriginalMember(owner = "client!ahn", name = "g", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_64;

	@OriginalMember(owner = "client!ahn", name = "w", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_65;

	@OriginalMember(owner = "client!ahn", name = "t", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_66;

	@OriginalMember(owner = "client!ahn", name = "q", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_67;

	@OriginalMember(owner = "client!ahn", name = "x", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_68;

	@OriginalMember(owner = "client!ahn", name = "d", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_69;

	@OriginalMember(owner = "client!ahn", name = "s", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_70;

	@OriginalMember(owner = "client!ahn", name = "y", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_71;

	@OriginalMember(owner = "client!ahn", name = "r", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_72;

	@OriginalMember(owner = "client!ahn", name = "c", descriptor = "Lclient!hi;")
	protected Class112 aClass112_10;

	@OriginalMember(owner = "client!ahn", name = "ai", descriptor = "[I")
	int[] anIntArray241;

	@OriginalMember(owner = "client!ahn", name = "i", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_73;

	@OriginalMember(owner = "client!ahn", name = "k", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_74;

	@OriginalMember(owner = "client!ahn", name = "u", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_75;

	@OriginalMember(owner = "client!ahn", name = "aj", descriptor = "I")
	int anInt2598;

	@OriginalMember(owner = "client!ahn", name = "z", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_76;

	@OriginalMember(owner = "client!ahn", name = "l", descriptor = "Lclient!aqz;")
	Class77_Sub12_Sub1 aClass77_Sub12_Sub1_77;

	@OriginalMember(owner = "client!ahn", name = "ao", descriptor = "[F")
	float[] aFloatArray62 = new float[3];

	@OriginalMember(owner = "client!ahn", name = "al", descriptor = "[Lclient!oi;")
	Class442[] aClass442Array4;

	@OriginalMember(owner = "client!ahn", name = "<init>", descriptor = "(Lclient!aed;)V", line = 40)
	Class122_Sub1(@OriginalArg(0) Class86_Sub1 arg0) {
		super(arg0);
		new Class455();
		this.aClass442Array4 = new Class442[this.aClass86_Sub1_30.anInt2848];
		for (@Pc(18) int local18 = 0; local18 < this.aClass86_Sub1_30.anInt2848; local18++) {
			this.aClass442Array4[local18] = new Class442();
		}
	}

	@OriginalMember(owner = "client!ahn", name = "al", descriptor = "(Ljava/lang/String;)Z", line = 49)
	boolean method18557(@OriginalArg(0) String arg0) throws Exception_Sub3 {
		this.aClass112_10 = this.aClass86_Sub1_30.method20613(arg0);
		if (this.aClass112_10 == null) {
			throw new Exception_Sub3("");
		}
		this.aClass77_Sub12_Sub1_62 = this.aClass112_10.method9531("textureMatrix");
		this.aClass77_Sub12_Sub1_77 = this.aClass112_10.method9531("modelMatrix");
		this.aClass77_Sub12_Sub1_71 = this.aClass112_10.method9531("viewMatrix");
		this.aClass77_Sub12_Sub1_65 = this.aClass112_10.method9531("projectionMatrix");
		this.aClass77_Sub12_Sub1_67 = this.aClass112_10.method9531("modelViewMatrix");
		this.aClass77_Sub12_Sub1_68 = this.aClass112_10.method9531("modelViewProjectionMatrix");
		this.aClass77_Sub12_Sub1_69 = this.aClass112_10.method9531("viewProjectionMatrix");
		this.aClass77_Sub12_Sub1_76 = this.aClass112_10.method9531("ambientColour");
		this.aClass77_Sub12_Sub1_74 = this.aClass112_10.method9531("sunDirection");
		this.aClass77_Sub12_Sub1_63 = this.aClass112_10.method9531("sunColour");
		this.aClass77_Sub12_Sub1_73 = this.aClass112_10.method9531("antiSunColour");
		this.aClass77_Sub12_Sub1_75 = this.aClass112_10.method9531("sunExponent");
		this.aClass77_Sub12_Sub1_70 = this.aClass112_10.method9531("eyePosition");
		this.aClass77_Sub12_Sub1_72 = this.aClass112_10.method9531("eyePositionOS");
		this.aClass77_Sub12_Sub1_64 = this.aClass112_10.method9531("sunDirectionOS");
		if (this.method18588()) {
			if (this.aClass112_10.method9469() == null) {
				@Pc(181) Class105 local181 = this.aClass112_10.method9465();
				if (local181 == null) {
					throw new Exception_Sub3(this.aClass112_10.method9454() + "");
				}
				this.aClass112_10.method9547(local181);
			}
			this.anInt2598 = this.aClass112_10.method9460();
			this.anIntArray241 = new int[this.anInt2598];
			return true;
		}
		this.aClass112_10 = null;
		this.aClass77_Sub12_Sub1_62 = null;
		this.aClass77_Sub12_Sub1_77 = null;
		this.aClass77_Sub12_Sub1_71 = null;
		this.aClass77_Sub12_Sub1_65 = null;
		this.aClass77_Sub12_Sub1_67 = null;
		this.aClass77_Sub12_Sub1_68 = null;
		this.aClass77_Sub12_Sub1_69 = null;
		this.aClass77_Sub12_Sub1_76 = null;
		this.aClass77_Sub12_Sub1_74 = null;
		this.aClass77_Sub12_Sub1_63 = null;
		this.aClass77_Sub12_Sub1_73 = null;
		this.aClass77_Sub12_Sub1_75 = null;
		this.aClass77_Sub12_Sub1_70 = null;
		this.aClass77_Sub12_Sub1_72 = null;
		this.aClass77_Sub12_Sub1_64 = null;
		return false;
	}

	@OriginalMember(owner = "client!ahn", name = "ao", descriptor = "(Ljava/lang/String;)Z", line = 49)
	boolean method18558(@OriginalArg(0) String arg0) throws Exception_Sub3 {
		this.aClass112_10 = this.aClass86_Sub1_30.method20613(arg0);
		if (this.aClass112_10 == null) {
			throw new Exception_Sub3("");
		}
		this.aClass77_Sub12_Sub1_62 = this.aClass112_10.method9531("textureMatrix");
		this.aClass77_Sub12_Sub1_77 = this.aClass112_10.method9531("modelMatrix");
		this.aClass77_Sub12_Sub1_71 = this.aClass112_10.method9531("viewMatrix");
		this.aClass77_Sub12_Sub1_65 = this.aClass112_10.method9531("projectionMatrix");
		this.aClass77_Sub12_Sub1_67 = this.aClass112_10.method9531("modelViewMatrix");
		this.aClass77_Sub12_Sub1_68 = this.aClass112_10.method9531("modelViewProjectionMatrix");
		this.aClass77_Sub12_Sub1_69 = this.aClass112_10.method9531("viewProjectionMatrix");
		this.aClass77_Sub12_Sub1_76 = this.aClass112_10.method9531("ambientColour");
		this.aClass77_Sub12_Sub1_74 = this.aClass112_10.method9531("sunDirection");
		this.aClass77_Sub12_Sub1_63 = this.aClass112_10.method9531("sunColour");
		this.aClass77_Sub12_Sub1_73 = this.aClass112_10.method9531("antiSunColour");
		this.aClass77_Sub12_Sub1_75 = this.aClass112_10.method9531("sunExponent");
		this.aClass77_Sub12_Sub1_70 = this.aClass112_10.method9531("eyePosition");
		this.aClass77_Sub12_Sub1_72 = this.aClass112_10.method9531("eyePositionOS");
		this.aClass77_Sub12_Sub1_64 = this.aClass112_10.method9531("sunDirectionOS");
		if (this.method18588()) {
			if (this.aClass112_10.method9469() == null) {
				@Pc(181) Class105 local181 = this.aClass112_10.method9465();
				if (local181 == null) {
					throw new Exception_Sub3(this.aClass112_10.method9454() + "");
				}
				this.aClass112_10.method9547(local181);
			}
			this.anInt2598 = this.aClass112_10.method9460();
			this.anIntArray241 = new int[this.anInt2598];
			return true;
		}
		this.aClass112_10 = null;
		this.aClass77_Sub12_Sub1_62 = null;
		this.aClass77_Sub12_Sub1_77 = null;
		this.aClass77_Sub12_Sub1_71 = null;
		this.aClass77_Sub12_Sub1_65 = null;
		this.aClass77_Sub12_Sub1_67 = null;
		this.aClass77_Sub12_Sub1_68 = null;
		this.aClass77_Sub12_Sub1_69 = null;
		this.aClass77_Sub12_Sub1_76 = null;
		this.aClass77_Sub12_Sub1_74 = null;
		this.aClass77_Sub12_Sub1_63 = null;
		this.aClass77_Sub12_Sub1_73 = null;
		this.aClass77_Sub12_Sub1_75 = null;
		this.aClass77_Sub12_Sub1_70 = null;
		this.aClass77_Sub12_Sub1_72 = null;
		this.aClass77_Sub12_Sub1_64 = null;
		return false;
	}

	@OriginalMember(owner = "client!ahn", name = "e", descriptor = "(Ljava/lang/String;)Z", line = 49)
	boolean method18559(@OriginalArg(0) String arg0) throws Exception_Sub3 {
		this.aClass112_10 = this.aClass86_Sub1_30.method20613(arg0);
		if (this.aClass112_10 == null) {
			throw new Exception_Sub3("");
		}
		this.aClass77_Sub12_Sub1_62 = this.aClass112_10.method9531("textureMatrix");
		this.aClass77_Sub12_Sub1_77 = this.aClass112_10.method9531("modelMatrix");
		this.aClass77_Sub12_Sub1_71 = this.aClass112_10.method9531("viewMatrix");
		this.aClass77_Sub12_Sub1_65 = this.aClass112_10.method9531("projectionMatrix");
		this.aClass77_Sub12_Sub1_67 = this.aClass112_10.method9531("modelViewMatrix");
		this.aClass77_Sub12_Sub1_68 = this.aClass112_10.method9531("modelViewProjectionMatrix");
		this.aClass77_Sub12_Sub1_69 = this.aClass112_10.method9531("viewProjectionMatrix");
		this.aClass77_Sub12_Sub1_76 = this.aClass112_10.method9531("ambientColour");
		this.aClass77_Sub12_Sub1_74 = this.aClass112_10.method9531("sunDirection");
		this.aClass77_Sub12_Sub1_63 = this.aClass112_10.method9531("sunColour");
		this.aClass77_Sub12_Sub1_73 = this.aClass112_10.method9531("antiSunColour");
		this.aClass77_Sub12_Sub1_75 = this.aClass112_10.method9531("sunExponent");
		this.aClass77_Sub12_Sub1_70 = this.aClass112_10.method9531("eyePosition");
		this.aClass77_Sub12_Sub1_72 = this.aClass112_10.method9531("eyePositionOS");
		this.aClass77_Sub12_Sub1_64 = this.aClass112_10.method9531("sunDirectionOS");
		if (this.method18588()) {
			if (this.aClass112_10.method9469() == null) {
				@Pc(181) Class105 local181 = this.aClass112_10.method9465();
				if (local181 == null) {
					throw new Exception_Sub3(this.aClass112_10.method9454() + "");
				}
				this.aClass112_10.method9547(local181);
			}
			this.anInt2598 = this.aClass112_10.method9460();
			this.anIntArray241 = new int[this.anInt2598];
			return true;
		}
		this.aClass112_10 = null;
		this.aClass77_Sub12_Sub1_62 = null;
		this.aClass77_Sub12_Sub1_77 = null;
		this.aClass77_Sub12_Sub1_71 = null;
		this.aClass77_Sub12_Sub1_65 = null;
		this.aClass77_Sub12_Sub1_67 = null;
		this.aClass77_Sub12_Sub1_68 = null;
		this.aClass77_Sub12_Sub1_69 = null;
		this.aClass77_Sub12_Sub1_76 = null;
		this.aClass77_Sub12_Sub1_74 = null;
		this.aClass77_Sub12_Sub1_63 = null;
		this.aClass77_Sub12_Sub1_73 = null;
		this.aClass77_Sub12_Sub1_75 = null;
		this.aClass77_Sub12_Sub1_70 = null;
		this.aClass77_Sub12_Sub1_72 = null;
		this.aClass77_Sub12_Sub1_64 = null;
		return false;
	}

	@OriginalMember(owner = "client!ahn", name = "p", descriptor = "()V", line = 102)
	@Override
	void method18550() {
		this.aClass112_10.method9545();
		this.anIntArray241[this.aClass112_10.method9470()] = -1;
		this.method18587(0);
		this.method18560();
	}

	@OriginalMember(owner = "client!ahn", name = "q", descriptor = "()V", line = 102)
	@Override
	void method18551() {
		this.aClass112_10.method9545();
		this.anIntArray241[this.aClass112_10.method9470()] = -1;
		this.method18587(0);
		this.method18560();
	}

	@OriginalMember(owner = "client!ahn", name = "o", descriptor = "()V", line = 109)
	void method18560() {
		this.method18579(this.aClass86_Sub1_30.aBoolean436);
		this.method18563(this.aClass86_Sub1_30.method20561());
		this.method18569();
		this.method18543();
	}

	@OriginalMember(owner = "client!ahn", name = "ax", descriptor = "()V", line = 109)
	void method18561() {
		this.method18579(this.aClass86_Sub1_30.aBoolean436);
		this.method18563(this.aClass86_Sub1_30.method20561());
		this.method18569();
		this.method18543();
	}

	@OriginalMember(owner = "client!ahn", name = "au", descriptor = "()V", line = 109)
	void method18562() {
		this.method18579(this.aClass86_Sub1_30.aBoolean436);
		this.method18563(this.aClass86_Sub1_30.method20561());
		this.method18569();
		this.method18543();
	}

	@OriginalMember(owner = "client!ahn", name = "d", descriptor = "()V", line = 116)
	@Override
	void method18554() {
		if (this.aClass112_10 != null) {
			this.aClass112_10.method9543();
		}
	}

	@OriginalMember(owner = "client!ahn", name = "c", descriptor = "()V", line = 116)
	@Override
	void method18549() {
		if (this.aClass112_10 != null) {
			this.aClass112_10.method9543();
		}
	}

	@OriginalMember(owner = "client!ahn", name = "x", descriptor = "()V", line = 116)
	@Override
	void method18553() {
		if (this.aClass112_10 != null) {
			this.aClass112_10.method9543();
		}
	}

	@OriginalMember(owner = "client!ahn", name = "b", descriptor = "(Lclient!oi;)V", line = 120)
	void method18563(@OriginalArg(0) Class442 arg0) {
		if (this.aClass112_10 == null || !this.aClass112_10.method9544() || this.aClass86_Sub1_30.method20539() != 0) {
			return;
		}
		@Pc(15) int local15 = this.aClass112_10.method9470();
		if ((this.anIntArray241[local15] & 0x80) != 0 && this.aClass77_Sub12_Sub1_62 != null) {
			this.aClass112_10.method9497(this.aClass77_Sub12_Sub1_62, arg0);
			this.anIntArray241[local15] &= 0xFFFFFF7F;
		}
	}

	@OriginalMember(owner = "client!ahn", name = "ar", descriptor = "(Lclient!oi;)V", line = 120)
	void method18564(@OriginalArg(0) Class442 arg0) {
		if (this.aClass112_10 == null || !this.aClass112_10.method9544() || this.aClass86_Sub1_30.method20539() != 0) {
			return;
		}
		@Pc(15) int local15 = this.aClass112_10.method9470();
		if ((this.anIntArray241[local15] & 0x80) != 0 && this.aClass77_Sub12_Sub1_62 != null) {
			this.aClass112_10.method9497(this.aClass77_Sub12_Sub1_62, arg0);
			this.anIntArray241[local15] &= 0xFFFFFF7F;
		}
	}

	@OriginalMember(owner = "client!ahn", name = "ac", descriptor = "(Lclient!oi;)V", line = 120)
	void method18565(@OriginalArg(0) Class442 arg0) {
		if (this.aClass112_10 == null || !this.aClass112_10.method9544() || this.aClass86_Sub1_30.method20539() != 0) {
			return;
		}
		@Pc(15) int local15 = this.aClass112_10.method9470();
		if ((this.anIntArray241[local15] & 0x80) != 0 && this.aClass77_Sub12_Sub1_62 != null) {
			this.aClass112_10.method9497(this.aClass77_Sub12_Sub1_62, arg0);
			this.anIntArray241[local15] &= 0xFFFFFF7F;
		}
	}

	@OriginalMember(owner = "client!ahn", name = "ad", descriptor = "(Lclient!oi;)V", line = 120)
	void method18566(@OriginalArg(0) Class442 arg0) {
		if (this.aClass112_10 == null || !this.aClass112_10.method9544() || this.aClass86_Sub1_30.method20539() != 0) {
			return;
		}
		@Pc(15) int local15 = this.aClass112_10.method9470();
		if ((this.anIntArray241[local15] & 0x80) != 0 && this.aClass77_Sub12_Sub1_62 != null) {
			this.aClass112_10.method9497(this.aClass77_Sub12_Sub1_62, arg0);
			this.anIntArray241[local15] &= 0xFFFFFF7F;
		}
	}

	@OriginalMember(owner = "client!ahn", name = "av", descriptor = "()V", line = 130)
	void method18567() {
		if (this.aClass112_10 == null || !this.aClass112_10.method9544()) {
			return;
		}
		@Pc(11) int local11 = this.aClass112_10.method9470();
		@Pc(16) int local16 = this.anIntArray241[local11];
		if ((local16 & 0x1) != 0 && this.aClass77_Sub12_Sub1_77 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_77, this.aClass86_Sub1_30.method20476());
		}
		if ((local16 & 0x2) != 0) {
			if (this.aClass77_Sub12_Sub1_71 != null) {
				this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_71, this.aClass86_Sub1_30.method20467());
			}
			if (this.aClass77_Sub12_Sub1_70 != null) {
				this.aFloatArray62[0] = 0.0F;
				this.aFloatArray62[1] = 0.0F;
				this.aFloatArray62[2] = 0.0F;
				this.aClass86_Sub1_30.method20294().method29445(this.aFloatArray62[0], this.aFloatArray62[1], this.aFloatArray62[2], this.aFloatArray62);
				this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_70, this.aFloatArray62[0], this.aFloatArray62[1], this.aFloatArray62[2]);
			}
		}
		if ((local16 & 0x10) != 0 && this.aClass77_Sub12_Sub1_67 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_67, this.aClass86_Sub1_30.method20480());
		}
		if ((local16 & 0x8) != 0 && this.aClass77_Sub12_Sub1_66 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_66, this.aClass86_Sub1_30.method20472());
		}
		if ((local16 & 0x4) != 0 && this.aClass77_Sub12_Sub1_65 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_65, this.aClass86_Sub1_30.method20484());
		}
		if ((local16 & 0x20) != 0 && this.aClass77_Sub12_Sub1_68 != null) {
			aClass442_57.method28960(this.aClass86_Sub1_30.method20480(), this.aClass86_Sub1_30.method20484());
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_68, aClass442_57);
		}
		if ((local16 & 0x40) != 0 && this.aClass77_Sub12_Sub1_69 != null) {
			aClass442_57.method28960(this.aClass86_Sub1_30.method20467(), this.aClass86_Sub1_30.method20484());
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_69, aClass442_57);
		}
		if (this.aClass86_Sub1_30.method20539() == 0 && (this.anIntArray241[local11] & 0x80) != 0 && this.aClass77_Sub12_Sub1_62 != null) {
			this.aClass112_10.method9497(this.aClass77_Sub12_Sub1_62, this.aClass86_Sub1_30.method20561());
			this.anIntArray241[local11] &= 0xFFFFFF7F;
		}
		this.anIntArray241[local11] = 0;
	}

	@OriginalMember(owner = "client!ahn", name = "ae", descriptor = "()V", line = 130)
	void method18568() {
		if (this.aClass112_10 == null || !this.aClass112_10.method9544()) {
			return;
		}
		@Pc(11) int local11 = this.aClass112_10.method9470();
		@Pc(16) int local16 = this.anIntArray241[local11];
		if ((local16 & 0x1) != 0 && this.aClass77_Sub12_Sub1_77 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_77, this.aClass86_Sub1_30.method20476());
		}
		if ((local16 & 0x2) != 0) {
			if (this.aClass77_Sub12_Sub1_71 != null) {
				this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_71, this.aClass86_Sub1_30.method20467());
			}
			if (this.aClass77_Sub12_Sub1_70 != null) {
				this.aFloatArray62[0] = 0.0F;
				this.aFloatArray62[1] = 0.0F;
				this.aFloatArray62[2] = 0.0F;
				this.aClass86_Sub1_30.method20294().method29445(this.aFloatArray62[0], this.aFloatArray62[1], this.aFloatArray62[2], this.aFloatArray62);
				this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_70, this.aFloatArray62[0], this.aFloatArray62[1], this.aFloatArray62[2]);
			}
		}
		if ((local16 & 0x10) != 0 && this.aClass77_Sub12_Sub1_67 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_67, this.aClass86_Sub1_30.method20480());
		}
		if ((local16 & 0x8) != 0 && this.aClass77_Sub12_Sub1_66 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_66, this.aClass86_Sub1_30.method20472());
		}
		if ((local16 & 0x4) != 0 && this.aClass77_Sub12_Sub1_65 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_65, this.aClass86_Sub1_30.method20484());
		}
		if ((local16 & 0x20) != 0 && this.aClass77_Sub12_Sub1_68 != null) {
			aClass442_57.method28960(this.aClass86_Sub1_30.method20480(), this.aClass86_Sub1_30.method20484());
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_68, aClass442_57);
		}
		if ((local16 & 0x40) != 0 && this.aClass77_Sub12_Sub1_69 != null) {
			aClass442_57.method28960(this.aClass86_Sub1_30.method20467(), this.aClass86_Sub1_30.method20484());
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_69, aClass442_57);
		}
		if (this.aClass86_Sub1_30.method20539() == 0 && (this.anIntArray241[local11] & 0x80) != 0 && this.aClass77_Sub12_Sub1_62 != null) {
			this.aClass112_10.method9497(this.aClass77_Sub12_Sub1_62, this.aClass86_Sub1_30.method20561());
			this.anIntArray241[local11] &= 0xFFFFFF7F;
		}
		this.anIntArray241[local11] = 0;
	}

	@OriginalMember(owner = "client!ahn", name = "n", descriptor = "()V", line = 130)
	void method18569() {
		if (this.aClass112_10 == null || !this.aClass112_10.method9544()) {
			return;
		}
		@Pc(11) int local11 = this.aClass112_10.method9470();
		@Pc(16) int local16 = this.anIntArray241[local11];
		if ((local16 & 0x1) != 0 && this.aClass77_Sub12_Sub1_77 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_77, this.aClass86_Sub1_30.method20476());
		}
		if ((local16 & 0x2) != 0) {
			if (this.aClass77_Sub12_Sub1_71 != null) {
				this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_71, this.aClass86_Sub1_30.method20467());
			}
			if (this.aClass77_Sub12_Sub1_70 != null) {
				this.aFloatArray62[0] = 0.0F;
				this.aFloatArray62[1] = 0.0F;
				this.aFloatArray62[2] = 0.0F;
				this.aClass86_Sub1_30.method20294().method29445(this.aFloatArray62[0], this.aFloatArray62[1], this.aFloatArray62[2], this.aFloatArray62);
				this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_70, this.aFloatArray62[0], this.aFloatArray62[1], this.aFloatArray62[2]);
			}
		}
		if ((local16 & 0x10) != 0 && this.aClass77_Sub12_Sub1_67 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_67, this.aClass86_Sub1_30.method20480());
		}
		if ((local16 & 0x8) != 0 && this.aClass77_Sub12_Sub1_66 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_66, this.aClass86_Sub1_30.method20472());
		}
		if ((local16 & 0x4) != 0 && this.aClass77_Sub12_Sub1_65 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_65, this.aClass86_Sub1_30.method20484());
		}
		if ((local16 & 0x20) != 0 && this.aClass77_Sub12_Sub1_68 != null) {
			aClass442_57.method28960(this.aClass86_Sub1_30.method20480(), this.aClass86_Sub1_30.method20484());
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_68, aClass442_57);
		}
		if ((local16 & 0x40) != 0 && this.aClass77_Sub12_Sub1_69 != null) {
			aClass442_57.method28960(this.aClass86_Sub1_30.method20467(), this.aClass86_Sub1_30.method20484());
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_69, aClass442_57);
		}
		if (this.aClass86_Sub1_30.method20539() == 0 && (this.anIntArray241[local11] & 0x80) != 0 && this.aClass77_Sub12_Sub1_62 != null) {
			this.aClass112_10.method9497(this.aClass77_Sub12_Sub1_62, this.aClass86_Sub1_30.method20561());
			this.anIntArray241[local11] &= 0xFFFFFF7F;
		}
		this.anIntArray241[local11] = 0;
	}

	@OriginalMember(owner = "client!ahn", name = "ah", descriptor = "()V", line = 130)
	void method18570() {
		if (this.aClass112_10 == null || !this.aClass112_10.method9544()) {
			return;
		}
		@Pc(11) int local11 = this.aClass112_10.method9470();
		@Pc(16) int local16 = this.anIntArray241[local11];
		if ((local16 & 0x1) != 0 && this.aClass77_Sub12_Sub1_77 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_77, this.aClass86_Sub1_30.method20476());
		}
		if ((local16 & 0x2) != 0) {
			if (this.aClass77_Sub12_Sub1_71 != null) {
				this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_71, this.aClass86_Sub1_30.method20467());
			}
			if (this.aClass77_Sub12_Sub1_70 != null) {
				this.aFloatArray62[0] = 0.0F;
				this.aFloatArray62[1] = 0.0F;
				this.aFloatArray62[2] = 0.0F;
				this.aClass86_Sub1_30.method20294().method29445(this.aFloatArray62[0], this.aFloatArray62[1], this.aFloatArray62[2], this.aFloatArray62);
				this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_70, this.aFloatArray62[0], this.aFloatArray62[1], this.aFloatArray62[2]);
			}
		}
		if ((local16 & 0x10) != 0 && this.aClass77_Sub12_Sub1_67 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_67, this.aClass86_Sub1_30.method20480());
		}
		if ((local16 & 0x8) != 0 && this.aClass77_Sub12_Sub1_66 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_66, this.aClass86_Sub1_30.method20472());
		}
		if ((local16 & 0x4) != 0 && this.aClass77_Sub12_Sub1_65 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_65, this.aClass86_Sub1_30.method20484());
		}
		if ((local16 & 0x20) != 0 && this.aClass77_Sub12_Sub1_68 != null) {
			aClass442_57.method28960(this.aClass86_Sub1_30.method20480(), this.aClass86_Sub1_30.method20484());
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_68, aClass442_57);
		}
		if ((local16 & 0x40) != 0 && this.aClass77_Sub12_Sub1_69 != null) {
			aClass442_57.method28960(this.aClass86_Sub1_30.method20467(), this.aClass86_Sub1_30.method20484());
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_69, aClass442_57);
		}
		if (this.aClass86_Sub1_30.method20539() == 0 && (this.anIntArray241[local11] & 0x80) != 0 && this.aClass77_Sub12_Sub1_62 != null) {
			this.aClass112_10.method9497(this.aClass77_Sub12_Sub1_62, this.aClass86_Sub1_30.method20561());
			this.anIntArray241[local11] &= 0xFFFFFF7F;
		}
		this.anIntArray241[local11] = 0;
	}

	@OriginalMember(owner = "client!ahn", name = "at", descriptor = "()V", line = 130)
	void method18571() {
		if (this.aClass112_10 == null || !this.aClass112_10.method9544()) {
			return;
		}
		@Pc(11) int local11 = this.aClass112_10.method9470();
		@Pc(16) int local16 = this.anIntArray241[local11];
		if ((local16 & 0x1) != 0 && this.aClass77_Sub12_Sub1_77 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_77, this.aClass86_Sub1_30.method20476());
		}
		if ((local16 & 0x2) != 0) {
			if (this.aClass77_Sub12_Sub1_71 != null) {
				this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_71, this.aClass86_Sub1_30.method20467());
			}
			if (this.aClass77_Sub12_Sub1_70 != null) {
				this.aFloatArray62[0] = 0.0F;
				this.aFloatArray62[1] = 0.0F;
				this.aFloatArray62[2] = 0.0F;
				this.aClass86_Sub1_30.method20294().method29445(this.aFloatArray62[0], this.aFloatArray62[1], this.aFloatArray62[2], this.aFloatArray62);
				this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_70, this.aFloatArray62[0], this.aFloatArray62[1], this.aFloatArray62[2]);
			}
		}
		if ((local16 & 0x10) != 0 && this.aClass77_Sub12_Sub1_67 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_67, this.aClass86_Sub1_30.method20480());
		}
		if ((local16 & 0x8) != 0 && this.aClass77_Sub12_Sub1_66 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_66, this.aClass86_Sub1_30.method20472());
		}
		if ((local16 & 0x4) != 0 && this.aClass77_Sub12_Sub1_65 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_65, this.aClass86_Sub1_30.method20484());
		}
		if ((local16 & 0x20) != 0 && this.aClass77_Sub12_Sub1_68 != null) {
			aClass442_57.method28960(this.aClass86_Sub1_30.method20480(), this.aClass86_Sub1_30.method20484());
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_68, aClass442_57);
		}
		if ((local16 & 0x40) != 0 && this.aClass77_Sub12_Sub1_69 != null) {
			aClass442_57.method28960(this.aClass86_Sub1_30.method20467(), this.aClass86_Sub1_30.method20484());
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_69, aClass442_57);
		}
		if (this.aClass86_Sub1_30.method20539() == 0 && (this.anIntArray241[local11] & 0x80) != 0 && this.aClass77_Sub12_Sub1_62 != null) {
			this.aClass112_10.method9497(this.aClass77_Sub12_Sub1_62, this.aClass86_Sub1_30.method20561());
			this.anIntArray241[local11] &= 0xFFFFFF7F;
		}
		this.anIntArray241[local11] = 0;
	}

	@OriginalMember(owner = "client!ahn", name = "a", descriptor = "(ILclient!ow;)V", line = 174)
	void method18572(@OriginalArg(0) int arg0, @OriginalArg(1) Class455 arg1) {
		if (this.aClass77_Sub12_Sub1_72 == null) {
			return;
		}
		@Pc(6) Class442 local6 = this.aClass86_Sub1_30.method20472();
		@Pc(30) float[] local30 = new float[] { local6.aFloatArray109[12], local6.aFloatArray109[13], local6.aFloatArray109[14] };
		@Pc(45) float[] local45 = new float[] { 0.0F, 0.0F, 0.0F };
		local6.method28990(local45);
		@Pc(63) float[] local63 = new float[] { 0.0F, 0.0F, 0.0F };
		this.aClass86_Sub1_30.method20294().method29442(0.0F, 0.0F, 0.0F, local63);
		arg1.method29450(local30);
		this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_72, local30[0], local30[1], local30[2]);
	}

	@OriginalMember(owner = "client!ahn", name = "as", descriptor = "(ILclient!ow;)V", line = 174)
	void method18573(@OriginalArg(1) Class455 arg0) {
		if (this.aClass77_Sub12_Sub1_72 == null) {
			return;
		}
		@Pc(6) Class442 local6 = this.aClass86_Sub1_30.method20472();
		@Pc(30) float[] local30 = new float[] { local6.aFloatArray109[12], local6.aFloatArray109[13], local6.aFloatArray109[14] };
		@Pc(45) float[] local45 = new float[] { 0.0F, 0.0F, 0.0F };
		local6.method28990(local45);
		@Pc(63) float[] local63 = new float[] { 0.0F, 0.0F, 0.0F };
		this.aClass86_Sub1_30.method20294().method29442(0.0F, 0.0F, 0.0F, local63);
		arg0.method29450(local30);
		this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_72, local30[0], local30[1], local30[2]);
	}

	@OriginalMember(owner = "client!ahn", name = "aq", descriptor = "(ILclient!ow;)V", line = 174)
	void method18574(@OriginalArg(1) Class455 arg0) {
		if (this.aClass77_Sub12_Sub1_72 == null) {
			return;
		}
		@Pc(6) Class442 local6 = this.aClass86_Sub1_30.method20472();
		@Pc(30) float[] local30 = new float[] { local6.aFloatArray109[12], local6.aFloatArray109[13], local6.aFloatArray109[14] };
		@Pc(45) float[] local45 = new float[] { 0.0F, 0.0F, 0.0F };
		local6.method28990(local45);
		@Pc(63) float[] local63 = new float[] { 0.0F, 0.0F, 0.0F };
		this.aClass86_Sub1_30.method20294().method29442(0.0F, 0.0F, 0.0F, local63);
		arg0.method29450(local30);
		this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_72, local30[0], local30[1], local30[2]);
	}

	@OriginalMember(owner = "client!ahn", name = "ay", descriptor = "(ILclient!ow;)V", line = 187)
	void method18575(@OriginalArg(1) Class455 arg0) {
		if (this.aClass77_Sub12_Sub1_64 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass86_Sub1_30.aFloatArray71[0], this.aClass86_Sub1_30.aFloatArray71[1], this.aClass86_Sub1_30.aFloatArray71[2] };
			arg0.method29452(local29);
			this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_64, local29[0], local29[1], local29[2]);
		}
	}

	@OriginalMember(owner = "client!ahn", name = "m", descriptor = "(ILclient!ow;)V", line = 187)
	void method18576(@OriginalArg(0) int arg0, @OriginalArg(1) Class455 arg1) {
		if (this.aClass77_Sub12_Sub1_64 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass86_Sub1_30.aFloatArray71[0], this.aClass86_Sub1_30.aFloatArray71[1], this.aClass86_Sub1_30.aFloatArray71[2] };
			arg1.method29452(local29);
			this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_64, local29[0], local29[1], local29[2]);
		}
	}

	@OriginalMember(owner = "client!ahn", name = "am", descriptor = "(ILclient!ow;)V", line = 187)
	void method18577(@OriginalArg(1) Class455 arg0) {
		if (this.aClass77_Sub12_Sub1_64 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass86_Sub1_30.aFloatArray71[0], this.aClass86_Sub1_30.aFloatArray71[1], this.aClass86_Sub1_30.aFloatArray71[2] };
			arg0.method29452(local29);
			this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_64, local29[0], local29[1], local29[2]);
		}
	}

	@OriginalMember(owner = "client!ahn", name = "af", descriptor = "(ILclient!ow;)V", line = 187)
	void method18578(@OriginalArg(1) Class455 arg0) {
		if (this.aClass77_Sub12_Sub1_64 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass86_Sub1_30.aFloatArray71[0], this.aClass86_Sub1_30.aFloatArray71[1], this.aClass86_Sub1_30.aFloatArray71[2] };
			arg0.method29452(local29);
			this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_64, local29[0], local29[1], local29[2]);
		}
	}

	@OriginalMember(owner = "client!ahn", name = "h", descriptor = "(Z)V", line = 195)
	void method18579(@OriginalArg(0) boolean arg0) {
		if (this.aClass112_10 == null || !this.aClass112_10.method9544()) {
			return;
		}
		if (this.aClass77_Sub12_Sub1_76 != null) {
			this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_76, this.aClass86_Sub1_30.aFloat195 * this.aClass86_Sub1_30.aFloat203, this.aClass86_Sub1_30.aFloat209 * this.aClass86_Sub1_30.aFloat203, this.aClass86_Sub1_30.aFloat196 * this.aClass86_Sub1_30.aFloat203);
		}
		if (this.aClass77_Sub12_Sub1_74 != null) {
			this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_74, this.aClass86_Sub1_30.aFloatArray71[0], this.aClass86_Sub1_30.aFloatArray71[1], this.aClass86_Sub1_30.aFloatArray71[2]);
		}
		if (this.aClass77_Sub12_Sub1_63 != null) {
			this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_63, this.aClass86_Sub1_30.aFloat195 * this.aClass86_Sub1_30.aFloat204, this.aClass86_Sub1_30.aFloat209 * this.aClass86_Sub1_30.aFloat204, this.aClass86_Sub1_30.aFloat196 * this.aClass86_Sub1_30.aFloat204);
		}
		if (this.aClass77_Sub12_Sub1_73 != null) {
			this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_73, -this.aClass86_Sub1_30.aFloat195 * this.aClass86_Sub1_30.aFloat208, -this.aClass86_Sub1_30.aFloat209 * this.aClass86_Sub1_30.aFloat208, -this.aClass86_Sub1_30.aFloat196 * this.aClass86_Sub1_30.aFloat208);
		}
		if (this.aClass77_Sub12_Sub1_75 != null) {
			this.aClass112_10.method9474(this.aClass77_Sub12_Sub1_75, Math.abs(this.aClass86_Sub1_30.aFloatArray71[1]) * 928.0F + 64.0F);
		}
	}

	@OriginalMember(owner = "client!ahn", name = "an", descriptor = "(Z)V", line = 195)
	void method18580(@OriginalArg(0) boolean arg0) {
		if (this.aClass112_10 == null || !this.aClass112_10.method9544()) {
			return;
		}
		if (this.aClass77_Sub12_Sub1_76 != null) {
			this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_76, this.aClass86_Sub1_30.aFloat195 * this.aClass86_Sub1_30.aFloat203, this.aClass86_Sub1_30.aFloat209 * this.aClass86_Sub1_30.aFloat203, this.aClass86_Sub1_30.aFloat196 * this.aClass86_Sub1_30.aFloat203);
		}
		if (this.aClass77_Sub12_Sub1_74 != null) {
			this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_74, this.aClass86_Sub1_30.aFloatArray71[0], this.aClass86_Sub1_30.aFloatArray71[1], this.aClass86_Sub1_30.aFloatArray71[2]);
		}
		if (this.aClass77_Sub12_Sub1_63 != null) {
			this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_63, this.aClass86_Sub1_30.aFloat195 * this.aClass86_Sub1_30.aFloat204, this.aClass86_Sub1_30.aFloat209 * this.aClass86_Sub1_30.aFloat204, this.aClass86_Sub1_30.aFloat196 * this.aClass86_Sub1_30.aFloat204);
		}
		if (this.aClass77_Sub12_Sub1_73 != null) {
			this.aClass112_10.method9480(this.aClass77_Sub12_Sub1_73, -this.aClass86_Sub1_30.aFloat195 * this.aClass86_Sub1_30.aFloat208, -this.aClass86_Sub1_30.aFloat209 * this.aClass86_Sub1_30.aFloat208, -this.aClass86_Sub1_30.aFloat196 * this.aClass86_Sub1_30.aFloat208);
		}
		if (this.aClass77_Sub12_Sub1_75 != null) {
			this.aClass112_10.method9474(this.aClass77_Sub12_Sub1_75, Math.abs(this.aClass86_Sub1_30.aFloatArray71[1]) * 928.0F + 64.0F);
		}
	}

	@OriginalMember(owner = "client!ahn", name = "y", descriptor = "()V", line = 204)
	@Override
	void method18543() {
	}

	@OriginalMember(owner = "client!ahn", name = "s", descriptor = "()V", line = 204)
	@Override
	void method18541() {
	}

	@OriginalMember(owner = "client!ahn", name = "r", descriptor = "()V", line = 204)
	@Override
	void method18542() {
	}

	@OriginalMember(owner = "client!ahn", name = "aj", descriptor = "(I)V", line = 207)
	void method18581(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2598; local1++) {
			this.anIntArray241[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!ahn", name = "ab", descriptor = "(I)V", line = 207)
	void method18582(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2598; local1++) {
			this.anIntArray241[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!ahn", name = "aa", descriptor = "(I)V", line = 207)
	void method18583(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2598; local1++) {
			this.anIntArray241[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!ahn", name = "ap", descriptor = "(Lclient!ow;)V", line = 213)
	void method18584(@OriginalArg(0) Class455 arg0) {
		@Pc(3) Class442 local3 = this.aClass86_Sub1_30.aClass442_87;
		local3.method28969(arg0);
		@Pc(11) int local11 = this.aClass112_10.method9470();
		if (this.aClass77_Sub12_Sub1_77 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_77, local3);
			this.anIntArray241[local11] &= 0xFFFFFFFE;
		}
		if (this.aClass77_Sub12_Sub1_67 != null) {
			aClass442_57.method28960(local3, this.aClass86_Sub1_30.method20467());
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_67, aClass442_57);
			this.anIntArray241[local11] &= 0xFFFFFFEF;
		}
		if (this.aClass77_Sub12_Sub1_68 != null) {
			aClass442_57.method28960(local3, this.aClass86_Sub1_30.method20482());
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_68, aClass442_57);
			this.anIntArray241[local11] &= 0xFFFFFFDF;
		}
		this.method18572(local11, arg0);
		this.method18576(local11, arg0);
	}

	@OriginalMember(owner = "client!ahn", name = "ai", descriptor = "(Lclient!ow;)V", line = 213)
	void method18585(@OriginalArg(0) Class455 arg0) {
		@Pc(3) Class442 local3 = this.aClass86_Sub1_30.aClass442_87;
		local3.method28969(arg0);
		@Pc(11) int local11 = this.aClass112_10.method9470();
		if (this.aClass77_Sub12_Sub1_77 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_77, local3);
			this.anIntArray241[local11] &= 0xFFFFFFFE;
		}
		if (this.aClass77_Sub12_Sub1_67 != null) {
			aClass442_57.method28960(local3, this.aClass86_Sub1_30.method20467());
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_67, aClass442_57);
			this.anIntArray241[local11] &= 0xFFFFFFEF;
		}
		if (this.aClass77_Sub12_Sub1_68 != null) {
			aClass442_57.method28960(local3, this.aClass86_Sub1_30.method20482());
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_68, aClass442_57);
			this.anIntArray241[local11] &= 0xFFFFFFDF;
		}
		this.method18572(local11, arg0);
		this.method18576(local11, arg0);
	}

	@OriginalMember(owner = "client!ahn", name = "aw", descriptor = "(Lclient!ow;)V", line = 213)
	void method18586(@OriginalArg(0) Class455 arg0) {
		@Pc(3) Class442 local3 = this.aClass86_Sub1_30.aClass442_87;
		local3.method28969(arg0);
		@Pc(11) int local11 = this.aClass112_10.method9470();
		if (this.aClass77_Sub12_Sub1_77 != null) {
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_77, local3);
			this.anIntArray241[local11] &= 0xFFFFFFFE;
		}
		if (this.aClass77_Sub12_Sub1_67 != null) {
			aClass442_57.method28960(local3, this.aClass86_Sub1_30.method20467());
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_67, aClass442_57);
			this.anIntArray241[local11] &= 0xFFFFFFEF;
		}
		if (this.aClass77_Sub12_Sub1_68 != null) {
			aClass442_57.method28960(local3, this.aClass86_Sub1_30.method20482());
			this.aClass112_10.method9500(this.aClass77_Sub12_Sub1_68, aClass442_57);
			this.anIntArray241[local11] &= 0xFFFFFFDF;
		}
		this.method18572(local11, arg0);
		this.method18576(local11, arg0);
	}

	@OriginalMember(owner = "client!ahn", name = "t", descriptor = "()V", line = 235)
	@Override
	void method18552() {
		this.method18585(Class455.aClass455_53);
	}

	@OriginalMember(owner = "client!ahn", name = "u", descriptor = "()V", line = 235)
	@Override
	void method18556() {
		this.method18585(Class455.aClass455_53);
	}

	@OriginalMember(owner = "client!ahn", name = "k", descriptor = "()V", line = 235)
	@Override
	void method18555() {
		this.method18585(Class455.aClass455_53);
	}

	@OriginalMember(owner = "client!ahn", name = "ag", descriptor = "(I)V", line = 239)
	void method18587(@OriginalArg(0) int arg0) {
		this.aClass442Array4[0].method28951();
		this.method18581(arg0);
	}

	@OriginalMember(owner = "client!ahn", name = "f", descriptor = "()Z")
	abstract boolean method18588() throws Exception_Sub3;

	@OriginalMember(owner = "client!ahn", name = "ak", descriptor = "()Z")
	abstract boolean method18589() throws Exception_Sub3;
}
