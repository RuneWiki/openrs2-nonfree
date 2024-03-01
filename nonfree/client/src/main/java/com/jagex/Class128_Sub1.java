package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahi")
public abstract class Class128_Sub1 extends Class128 {

	@OriginalMember(owner = "client!ahi", name = "i", descriptor = "I")
	static final int anInt2966 = 32;

	@OriginalMember(owner = "client!ahi", name = "t", descriptor = "I")
	static final int anInt2967 = 128;

	@OriginalMember(owner = "client!ahi", name = "g", descriptor = "I")
	static final int anInt2969 = 16;

	@OriginalMember(owner = "client!ahi", name = "b", descriptor = "I")
	static final int anInt2970 = 2;

	@OriginalMember(owner = "client!ahi", name = "h", descriptor = "I")
	static final int anInt2971 = 4;

	@OriginalMember(owner = "client!ahi", name = "x", descriptor = "I")
	static final int anInt2972 = 1;

	@OriginalMember(owner = "client!ahi", name = "j", descriptor = "I")
	static final int anInt2973 = 64;

	@OriginalMember(owner = "client!ahi", name = "a", descriptor = "I")
	static final int anInt2974 = 8;

	@OriginalMember(owner = "client!ahi", name = "ah", descriptor = "Lclient!pq;")
	static final Class489 aClass489_89 = new Class489();

	@OriginalMember(owner = "client!ahi", name = "q", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_68;

	@OriginalMember(owner = "client!ahi", name = "f", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_69;

	@OriginalMember(owner = "client!ahi", name = "n", descriptor = "Lclient!ho;")
	protected Class115 aClass115_10;

	@OriginalMember(owner = "client!ahi", name = "l", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_70;

	@OriginalMember(owner = "client!ahi", name = "y", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_71;

	@OriginalMember(owner = "client!ahi", name = "z", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_72;

	@OriginalMember(owner = "client!ahi", name = "p", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_73;

	@OriginalMember(owner = "client!ahi", name = "d", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_74;

	@OriginalMember(owner = "client!ahi", name = "c", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_75;

	@OriginalMember(owner = "client!ahi", name = "r", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_76;

	@OriginalMember(owner = "client!ahi", name = "v", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_77;

	@OriginalMember(owner = "client!ahi", name = "ae", descriptor = "I")
	int anInt2968;

	@OriginalMember(owner = "client!ahi", name = "s", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_78;

	@OriginalMember(owner = "client!ahi", name = "o", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_79;

	@OriginalMember(owner = "client!ahi", name = "u", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_80;

	@OriginalMember(owner = "client!ahi", name = "m", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_81;

	@OriginalMember(owner = "client!ahi", name = "w", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_82;

	@OriginalMember(owner = "client!ahi", name = "k", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_83;

	@OriginalMember(owner = "client!ahi", name = "ag", descriptor = "[I")
	int[] anIntArray256;

	@OriginalMember(owner = "client!ahi", name = "ac", descriptor = "[F")
	float[] aFloatArray67 = new float[3];

	@OriginalMember(owner = "client!ahi", name = "al", descriptor = "[Lclient!pq;")
	Class489[] aClass489Array6;

	@OriginalMember(owner = "client!ahi", name = "<init>", descriptor = "(Lclient!afc;)V", line = 40)
	Class128_Sub1(@OriginalArg(0) Class104_Sub2 arg0) {
		super(arg0);
		new Class470();
		this.aClass489Array6 = new Class489[this.aClass104_Sub2_31.anInt2954];
		for (@Pc(18) int local18 = 0; local18 < this.aClass104_Sub2_31.anInt2954; local18++) {
			this.aClass489Array6[local18] = new Class489();
		}
	}

	@OriginalMember(owner = "client!ahi", name = "h", descriptor = "(Ljava/lang/String;)Z", line = 49)
	boolean method21362(@OriginalArg(0) String arg0) throws Exception_Sub2 {
		this.aClass115_10 = this.aClass104_Sub2_31.method20892(arg0);
		if (this.aClass115_10 == null) {
			throw new Exception_Sub2("");
		}
		this.aClass93_Sub33_Sub1_81 = this.aClass115_10.method8229("textureMatrix");
		this.aClass93_Sub33_Sub1_83 = this.aClass115_10.method8229("modelMatrix");
		this.aClass93_Sub33_Sub1_69 = this.aClass115_10.method8229("viewMatrix");
		this.aClass93_Sub33_Sub1_82 = this.aClass115_10.method8229("projectionMatrix");
		this.aClass93_Sub33_Sub1_80 = this.aClass115_10.method8229("modelViewMatrix");
		this.aClass93_Sub33_Sub1_72 = this.aClass115_10.method8229("modelViewProjectionMatrix");
		this.aClass93_Sub33_Sub1_73 = this.aClass115_10.method8229("viewProjectionMatrix");
		this.aClass93_Sub33_Sub1_77 = this.aClass115_10.method8229("ambientColour");
		this.aClass93_Sub33_Sub1_71 = this.aClass115_10.method8229("sunDirection");
		this.aClass93_Sub33_Sub1_79 = this.aClass115_10.method8229("sunColour");
		this.aClass93_Sub33_Sub1_78 = this.aClass115_10.method8229("antiSunColour");
		this.aClass93_Sub33_Sub1_68 = this.aClass115_10.method8229("sunExponent");
		this.aClass93_Sub33_Sub1_74 = this.aClass115_10.method8229("eyePosition");
		this.aClass93_Sub33_Sub1_75 = this.aClass115_10.method8229("eyePositionOS");
		this.aClass93_Sub33_Sub1_76 = this.aClass115_10.method8229("sunDirectionOS");
		if (this.method21363()) {
			if (this.aClass115_10.method8204() == null) {
				@Pc(181) Class116 local181 = this.aClass115_10.method8258();
				if (local181 == null) {
					throw new Exception_Sub2(this.aClass115_10.method8227() + "");
				}
				this.aClass115_10.method8203(local181);
			}
			this.anInt2968 = this.aClass115_10.method8199();
			this.anIntArray256 = new int[this.anInt2968];
			return true;
		}
		this.aClass115_10 = null;
		this.aClass93_Sub33_Sub1_81 = null;
		this.aClass93_Sub33_Sub1_83 = null;
		this.aClass93_Sub33_Sub1_69 = null;
		this.aClass93_Sub33_Sub1_82 = null;
		this.aClass93_Sub33_Sub1_80 = null;
		this.aClass93_Sub33_Sub1_72 = null;
		this.aClass93_Sub33_Sub1_73 = null;
		this.aClass93_Sub33_Sub1_77 = null;
		this.aClass93_Sub33_Sub1_71 = null;
		this.aClass93_Sub33_Sub1_79 = null;
		this.aClass93_Sub33_Sub1_78 = null;
		this.aClass93_Sub33_Sub1_68 = null;
		this.aClass93_Sub33_Sub1_74 = null;
		this.aClass93_Sub33_Sub1_75 = null;
		this.aClass93_Sub33_Sub1_76 = null;
		return false;
	}

	@OriginalMember(owner = "client!ahi", name = "e", descriptor = "()V", line = 102)
	@Override
	void method21345() {
		this.aClass115_10.method8285();
		this.anIntArray256[this.aClass115_10.method8253()] = -1;
		this.method21374(0);
		this.method21369();
	}

	@OriginalMember(owner = "client!ahi", name = "z", descriptor = "()V", line = 102)
	@Override
	void method21351() {
		this.aClass115_10.method8285();
		this.anIntArray256[this.aClass115_10.method8253()] = -1;
		this.method21374(0);
		this.method21369();
	}

	@OriginalMember(owner = "client!ahi", name = "u", descriptor = "()V", line = 102)
	@Override
	void method21350() {
		this.aClass115_10.method8285();
		this.anIntArray256[this.aClass115_10.method8253()] = -1;
		this.method21374(0);
		this.method21369();
	}

	@OriginalMember(owner = "client!ahi", name = "g", descriptor = "()V", line = 109)
	void method21369() {
		this.method21370(this.aClass104_Sub2_31.aBoolean466);
		this.method21366(this.aClass104_Sub2_31.method20973());
		this.method21367();
		this.method21347();
	}

	@OriginalMember(owner = "client!ahi", name = "as", descriptor = "()V", line = 109)
	void method21378() {
		this.method21370(this.aClass104_Sub2_31.aBoolean466);
		this.method21366(this.aClass104_Sub2_31.method20973());
		this.method21367();
		this.method21347();
	}

	@OriginalMember(owner = "client!ahi", name = "at", descriptor = "()V", line = 109)
	void method21392() {
		this.method21370(this.aClass104_Sub2_31.aBoolean466);
		this.method21366(this.aClass104_Sub2_31.method20973());
		this.method21367();
		this.method21347();
	}

	@OriginalMember(owner = "client!ahi", name = "p", descriptor = "()V", line = 116)
	@Override
	void method21352() {
		if (this.aClass115_10 != null) {
			this.aClass115_10.method8255();
		}
	}

	@OriginalMember(owner = "client!ahi", name = "d", descriptor = "()V", line = 116)
	@Override
	void method21353() {
		if (this.aClass115_10 != null) {
			this.aClass115_10.method8255();
		}
	}

	@OriginalMember(owner = "client!ahi", name = "n", descriptor = "()V", line = 116)
	@Override
	void method21344() {
		if (this.aClass115_10 != null) {
			this.aClass115_10.method8255();
		}
	}

	@OriginalMember(owner = "client!ahi", name = "ad", descriptor = "(Lclient!pq;)V", line = 120)
	void method21364(@OriginalArg(0) Class489 arg0) {
		if (this.aClass115_10 == null || !this.aClass115_10.method8225() || this.aClass104_Sub2_31.method20965() != 0) {
			return;
		}
		@Pc(15) int local15 = this.aClass115_10.method8253();
		if ((this.anIntArray256[local15] & 0x80) != 0 && this.aClass93_Sub33_Sub1_81 != null) {
			this.aClass115_10.method8242(this.aClass93_Sub33_Sub1_81, arg0);
			this.anIntArray256[local15] &= 0xFFFFFF7F;
		}
	}

	@OriginalMember(owner = "client!ahi", name = "i", descriptor = "(Lclient!pq;)V", line = 120)
	void method21366(@OriginalArg(0) Class489 arg0) {
		if (this.aClass115_10 == null || !this.aClass115_10.method8225() || this.aClass104_Sub2_31.method20965() != 0) {
			return;
		}
		@Pc(15) int local15 = this.aClass115_10.method8253();
		if ((this.anIntArray256[local15] & 0x80) != 0 && this.aClass93_Sub33_Sub1_81 != null) {
			this.aClass115_10.method8242(this.aClass93_Sub33_Sub1_81, arg0);
			this.anIntArray256[local15] &= 0xFFFFFF7F;
		}
	}

	@OriginalMember(owner = "client!ahi", name = "am", descriptor = "(Lclient!pq;)V", line = 120)
	void method21379(@OriginalArg(0) Class489 arg0) {
		if (this.aClass115_10 == null || !this.aClass115_10.method8225() || this.aClass104_Sub2_31.method20965() != 0) {
			return;
		}
		@Pc(15) int local15 = this.aClass115_10.method8253();
		if ((this.anIntArray256[local15] & 0x80) != 0 && this.aClass93_Sub33_Sub1_81 != null) {
			this.aClass115_10.method8242(this.aClass93_Sub33_Sub1_81, arg0);
			this.anIntArray256[local15] &= 0xFFFFFF7F;
		}
	}

	@OriginalMember(owner = "client!ahi", name = "j", descriptor = "()V", line = 130)
	void method21367() {
		if (this.aClass115_10 == null || !this.aClass115_10.method8225()) {
			return;
		}
		@Pc(11) int local11 = this.aClass115_10.method8253();
		@Pc(16) int local16 = this.anIntArray256[local11];
		if ((local16 & 0x1) != 0 && this.aClass93_Sub33_Sub1_83 != null) {
			this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_83, this.aClass104_Sub2_31.method20930());
		}
		if ((local16 & 0x2) != 0) {
			if (this.aClass93_Sub33_Sub1_69 != null) {
				this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_69, this.aClass104_Sub2_31.method20928());
			}
			if (this.aClass93_Sub33_Sub1_74 != null) {
				this.aFloatArray67[0] = 0.0F;
				this.aFloatArray67[1] = 0.0F;
				this.aFloatArray67[2] = 0.0F;
				this.aClass104_Sub2_31.method20517().method29391(this.aFloatArray67[0], this.aFloatArray67[1], this.aFloatArray67[2], this.aFloatArray67);
				this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_74, this.aFloatArray67[0], this.aFloatArray67[1], this.aFloatArray67[2]);
			}
		}
		if ((local16 & 0x10) != 0 && this.aClass93_Sub33_Sub1_80 != null) {
			this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_80, this.aClass104_Sub2_31.method21173());
		}
		if ((local16 & 0x8) != 0 && this.aClass93_Sub33_Sub1_70 != null) {
			this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_70, this.aClass104_Sub2_31.method20963());
		}
		if ((local16 & 0x4) != 0 && this.aClass93_Sub33_Sub1_82 != null) {
			this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_82, this.aClass104_Sub2_31.method20933());
		}
		if ((local16 & 0x20) != 0 && this.aClass93_Sub33_Sub1_72 != null) {
			aClass489_89.method29839(this.aClass104_Sub2_31.method21173(), this.aClass104_Sub2_31.method20933());
			this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_72, aClass489_89);
		}
		if ((local16 & 0x40) != 0 && this.aClass93_Sub33_Sub1_73 != null) {
			aClass489_89.method29839(this.aClass104_Sub2_31.method20928(), this.aClass104_Sub2_31.method20933());
			this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_73, aClass489_89);
		}
		if (this.aClass104_Sub2_31.method20965() == 0 && (this.anIntArray256[local11] & 0x80) != 0 && this.aClass93_Sub33_Sub1_81 != null) {
			this.aClass115_10.method8242(this.aClass93_Sub33_Sub1_81, this.aClass104_Sub2_31.method20973());
			this.anIntArray256[local11] &= 0xFFFFFF7F;
		}
		this.anIntArray256[local11] = 0;
	}

	@OriginalMember(owner = "client!ahi", name = "t", descriptor = "(ILclient!ou;)V", line = 174)
	void method21368(@OriginalArg(0) int arg0, @OriginalArg(1) Class470 arg1) {
		if (this.aClass93_Sub33_Sub1_75 == null) {
			return;
		}
		@Pc(6) Class489 local6 = this.aClass104_Sub2_31.method20963();
		@Pc(30) float[] local30 = new float[] { local6.aFloatArray116[12], local6.aFloatArray116[13], local6.aFloatArray116[14] };
		@Pc(45) float[] local45 = new float[] { 0.0F, 0.0F, 0.0F };
		local6.method29903(local45);
		@Pc(63) float[] local63 = new float[] { 0.0F, 0.0F, 0.0F };
		this.aClass104_Sub2_31.method20517().method29367(0.0F, 0.0F, 0.0F, local63);
		arg1.method29392(local30);
		this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_75, local30[0], local30[1], local30[2]);
	}

	@OriginalMember(owner = "client!ahi", name = "ap", descriptor = "(ILclient!ou;)V", line = 174)
	void method21377(@OriginalArg(1) Class470 arg0) {
		if (this.aClass93_Sub33_Sub1_75 == null) {
			return;
		}
		@Pc(6) Class489 local6 = this.aClass104_Sub2_31.method20963();
		@Pc(30) float[] local30 = new float[] { local6.aFloatArray116[12], local6.aFloatArray116[13], local6.aFloatArray116[14] };
		@Pc(45) float[] local45 = new float[] { 0.0F, 0.0F, 0.0F };
		local6.method29903(local45);
		@Pc(63) float[] local63 = new float[] { 0.0F, 0.0F, 0.0F };
		this.aClass104_Sub2_31.method20517().method29367(0.0F, 0.0F, 0.0F, local63);
		arg0.method29392(local30);
		this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_75, local30[0], local30[1], local30[2]);
	}

	@OriginalMember(owner = "client!ahi", name = "au", descriptor = "(ILclient!ou;)V", line = 174)
	void method21380(@OriginalArg(1) Class470 arg0) {
		if (this.aClass93_Sub33_Sub1_75 == null) {
			return;
		}
		@Pc(6) Class489 local6 = this.aClass104_Sub2_31.method20963();
		@Pc(30) float[] local30 = new float[] { local6.aFloatArray116[12], local6.aFloatArray116[13], local6.aFloatArray116[14] };
		@Pc(45) float[] local45 = new float[] { 0.0F, 0.0F, 0.0F };
		local6.method29903(local45);
		@Pc(63) float[] local63 = new float[] { 0.0F, 0.0F, 0.0F };
		this.aClass104_Sub2_31.method20517().method29367(0.0F, 0.0F, 0.0F, local63);
		arg0.method29392(local30);
		this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_75, local30[0], local30[1], local30[2]);
	}

	@OriginalMember(owner = "client!ahi", name = "ar", descriptor = "(ILclient!ou;)V", line = 174)
	void method21381(@OriginalArg(1) Class470 arg0) {
		if (this.aClass93_Sub33_Sub1_75 == null) {
			return;
		}
		@Pc(6) Class489 local6 = this.aClass104_Sub2_31.method20963();
		@Pc(30) float[] local30 = new float[] { local6.aFloatArray116[12], local6.aFloatArray116[13], local6.aFloatArray116[14] };
		@Pc(45) float[] local45 = new float[] { 0.0F, 0.0F, 0.0F };
		local6.method29903(local45);
		@Pc(63) float[] local63 = new float[] { 0.0F, 0.0F, 0.0F };
		this.aClass104_Sub2_31.method20517().method29367(0.0F, 0.0F, 0.0F, local63);
		arg0.method29392(local30);
		this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_75, local30[0], local30[1], local30[2]);
	}

	@OriginalMember(owner = "client!ahi", name = "ae", descriptor = "(ILclient!ou;)V", line = 187)
	void method21382(@OriginalArg(0) int arg0, @OriginalArg(1) Class470 arg1) {
		if (this.aClass93_Sub33_Sub1_76 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass104_Sub2_31.aFloatArray63[0], this.aClass104_Sub2_31.aFloatArray63[1], this.aClass104_Sub2_31.aFloatArray63[2] };
			arg1.method29393(local29);
			this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_76, local29[0], local29[1], local29[2]);
		}
	}

	@OriginalMember(owner = "client!ahi", name = "aq", descriptor = "(ILclient!ou;)V", line = 187)
	void method21383(@OriginalArg(1) Class470 arg0) {
		if (this.aClass93_Sub33_Sub1_76 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass104_Sub2_31.aFloatArray63[0], this.aClass104_Sub2_31.aFloatArray63[1], this.aClass104_Sub2_31.aFloatArray63[2] };
			arg0.method29393(local29);
			this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_76, local29[0], local29[1], local29[2]);
		}
	}

	@OriginalMember(owner = "client!ahi", name = "ax", descriptor = "(ILclient!ou;)V", line = 187)
	void method21384(@OriginalArg(1) Class470 arg0) {
		if (this.aClass93_Sub33_Sub1_76 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass104_Sub2_31.aFloatArray63[0], this.aClass104_Sub2_31.aFloatArray63[1], this.aClass104_Sub2_31.aFloatArray63[2] };
			arg0.method29393(local29);
			this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_76, local29[0], local29[1], local29[2]);
		}
	}

	@OriginalMember(owner = "client!ahi", name = "av", descriptor = "(ILclient!ou;)V", line = 187)
	void method21385(@OriginalArg(1) Class470 arg0) {
		if (this.aClass93_Sub33_Sub1_76 != null) {
			@Pc(29) float[] local29 = new float[] { this.aClass104_Sub2_31.aFloatArray63[0], this.aClass104_Sub2_31.aFloatArray63[1], this.aClass104_Sub2_31.aFloatArray63[2] };
			arg0.method29393(local29);
			this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_76, local29[0], local29[1], local29[2]);
		}
	}

	@OriginalMember(owner = "client!ahi", name = "ag", descriptor = "(Z)V", line = 195)
	void method21370(@OriginalArg(0) boolean arg0) {
		if (this.aClass115_10 == null || !this.aClass115_10.method8225()) {
			return;
		}
		if (this.aClass93_Sub33_Sub1_77 != null) {
			this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_77, this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat211, this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat211, this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat211);
		}
		if (this.aClass93_Sub33_Sub1_71 != null) {
			this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_71, this.aClass104_Sub2_31.aFloatArray63[0], this.aClass104_Sub2_31.aFloatArray63[1], this.aClass104_Sub2_31.aFloatArray63[2]);
		}
		if (this.aClass93_Sub33_Sub1_79 != null) {
			this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_79, this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat212, this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat212, this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat212);
		}
		if (this.aClass93_Sub33_Sub1_78 != null) {
			this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_78, -this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat213, -this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat213, -this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat213);
		}
		if (this.aClass93_Sub33_Sub1_68 != null) {
			this.aClass115_10.method8309(this.aClass93_Sub33_Sub1_68, Math.abs(this.aClass104_Sub2_31.aFloatArray63[1]) * 928.0F + 64.0F);
		}
	}

	@OriginalMember(owner = "client!ahi", name = "ao", descriptor = "(Z)V", line = 195)
	void method21386(@OriginalArg(0) boolean arg0) {
		if (this.aClass115_10 == null || !this.aClass115_10.method8225()) {
			return;
		}
		if (this.aClass93_Sub33_Sub1_77 != null) {
			this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_77, this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat211, this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat211, this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat211);
		}
		if (this.aClass93_Sub33_Sub1_71 != null) {
			this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_71, this.aClass104_Sub2_31.aFloatArray63[0], this.aClass104_Sub2_31.aFloatArray63[1], this.aClass104_Sub2_31.aFloatArray63[2]);
		}
		if (this.aClass93_Sub33_Sub1_79 != null) {
			this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_79, this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat212, this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat212, this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat212);
		}
		if (this.aClass93_Sub33_Sub1_78 != null) {
			this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_78, -this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat213, -this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat213, -this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat213);
		}
		if (this.aClass93_Sub33_Sub1_68 != null) {
			this.aClass115_10.method8309(this.aClass93_Sub33_Sub1_68, Math.abs(this.aClass104_Sub2_31.aFloatArray63[1]) * 928.0F + 64.0F);
		}
	}

	@OriginalMember(owner = "client!ahi", name = "aj", descriptor = "(Z)V", line = 195)
	void method21387(@OriginalArg(0) boolean arg0) {
		if (this.aClass115_10 == null || !this.aClass115_10.method8225()) {
			return;
		}
		if (this.aClass93_Sub33_Sub1_77 != null) {
			this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_77, this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat211, this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat211, this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat211);
		}
		if (this.aClass93_Sub33_Sub1_71 != null) {
			this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_71, this.aClass104_Sub2_31.aFloatArray63[0], this.aClass104_Sub2_31.aFloatArray63[1], this.aClass104_Sub2_31.aFloatArray63[2]);
		}
		if (this.aClass93_Sub33_Sub1_79 != null) {
			this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_79, this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat212, this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat212, this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat212);
		}
		if (this.aClass93_Sub33_Sub1_78 != null) {
			this.aClass115_10.method8259(this.aClass93_Sub33_Sub1_78, -this.aClass104_Sub2_31.aFloat214 * this.aClass104_Sub2_31.aFloat213, -this.aClass104_Sub2_31.aFloat210 * this.aClass104_Sub2_31.aFloat213, -this.aClass104_Sub2_31.aFloat217 * this.aClass104_Sub2_31.aFloat213);
		}
		if (this.aClass93_Sub33_Sub1_68 != null) {
			this.aClass115_10.method8309(this.aClass93_Sub33_Sub1_68, Math.abs(this.aClass104_Sub2_31.aFloatArray63[1]) * 928.0F + 64.0F);
		}
	}

	@OriginalMember(owner = "client!ahi", name = "f", descriptor = "()V", line = 204)
	@Override
	void method21347() {
	}

	@OriginalMember(owner = "client!ahi", name = "o", descriptor = "()V", line = 204)
	@Override
	void method21342() {
	}

	@OriginalMember(owner = "client!ahi", name = "ah", descriptor = "(I)V", line = 207)
	void method21371(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2968; local1++) {
			this.anIntArray256[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!ahi", name = "ay", descriptor = "(I)V", line = 207)
	void method21375(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2968; local1++) {
			this.anIntArray256[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!ahi", name = "ab", descriptor = "(I)V", line = 207)
	void method21388(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2968; local1++) {
			this.anIntArray256[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!ahi", name = "az", descriptor = "(I)V", line = 207)
	void method21389(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2968; local1++) {
			this.anIntArray256[local1] |= 0x80 << arg0;
		}
	}

	@OriginalMember(owner = "client!ahi", name = "al", descriptor = "(Lclient!ou;)V", line = 213)
	void method21372(@OriginalArg(0) Class470 arg0) {
		@Pc(3) Class489 local3 = this.aClass104_Sub2_31.aClass489_78;
		local3.method29842(arg0);
		@Pc(11) int local11 = this.aClass115_10.method8253();
		if (this.aClass93_Sub33_Sub1_83 != null) {
			this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_83, local3);
			this.anIntArray256[local11] &= 0xFFFFFFFE;
		}
		if (this.aClass93_Sub33_Sub1_80 != null) {
			aClass489_89.method29839(local3, this.aClass104_Sub2_31.method20928());
			this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_80, aClass489_89);
			this.anIntArray256[local11] &= 0xFFFFFFEF;
		}
		if (this.aClass93_Sub33_Sub1_72 != null) {
			aClass489_89.method29839(local3, this.aClass104_Sub2_31.method21157());
			this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_72, aClass489_89);
			this.anIntArray256[local11] &= 0xFFFFFFDF;
		}
		this.method21368(local11, arg0);
		this.method21382(local11, arg0);
	}

	@OriginalMember(owner = "client!ahi", name = "aa", descriptor = "(Lclient!ou;)V", line = 213)
	void method21390(@OriginalArg(0) Class470 arg0) {
		@Pc(3) Class489 local3 = this.aClass104_Sub2_31.aClass489_78;
		local3.method29842(arg0);
		@Pc(11) int local11 = this.aClass115_10.method8253();
		if (this.aClass93_Sub33_Sub1_83 != null) {
			this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_83, local3);
			this.anIntArray256[local11] &= 0xFFFFFFFE;
		}
		if (this.aClass93_Sub33_Sub1_80 != null) {
			aClass489_89.method29839(local3, this.aClass104_Sub2_31.method20928());
			this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_80, aClass489_89);
			this.anIntArray256[local11] &= 0xFFFFFFEF;
		}
		if (this.aClass93_Sub33_Sub1_72 != null) {
			aClass489_89.method29839(local3, this.aClass104_Sub2_31.method21157());
			this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_72, aClass489_89);
			this.anIntArray256[local11] &= 0xFFFFFFDF;
		}
		this.method21368(local11, arg0);
		this.method21382(local11, arg0);
	}

	@OriginalMember(owner = "client!ahi", name = "af", descriptor = "(Lclient!ou;)V", line = 213)
	void method21391(@OriginalArg(0) Class470 arg0) {
		@Pc(3) Class489 local3 = this.aClass104_Sub2_31.aClass489_78;
		local3.method29842(arg0);
		@Pc(11) int local11 = this.aClass115_10.method8253();
		if (this.aClass93_Sub33_Sub1_83 != null) {
			this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_83, local3);
			this.anIntArray256[local11] &= 0xFFFFFFFE;
		}
		if (this.aClass93_Sub33_Sub1_80 != null) {
			aClass489_89.method29839(local3, this.aClass104_Sub2_31.method20928());
			this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_80, aClass489_89);
			this.anIntArray256[local11] &= 0xFFFFFFEF;
		}
		if (this.aClass93_Sub33_Sub1_72 != null) {
			aClass489_89.method29839(local3, this.aClass104_Sub2_31.method21157());
			this.aClass115_10.method8207(this.aClass93_Sub33_Sub1_72, aClass489_89);
			this.anIntArray256[local11] &= 0xFFFFFFDF;
		}
		this.method21368(local11, arg0);
		this.method21382(local11, arg0);
	}

	@OriginalMember(owner = "client!ahi", name = "l", descriptor = "()V", line = 235)
	@Override
	void method21349() {
		this.method21372(Class470.aClass470_54);
	}

	@OriginalMember(owner = "client!ahi", name = "b", descriptor = "()V", line = 235)
	@Override
	void method21343() {
		this.method21372(Class470.aClass470_54);
	}

	@OriginalMember(owner = "client!ahi", name = "x", descriptor = "()V", line = 235)
	@Override
	void method21360() {
		this.method21372(Class470.aClass470_54);
	}

	@OriginalMember(owner = "client!ahi", name = "an", descriptor = "(I)V", line = 239)
	void method21373(@OriginalArg(0) int arg0) {
		this.aClass489Array6[0].method29836();
		this.method21371(arg0);
	}

	@OriginalMember(owner = "client!ahi", name = "ac", descriptor = "(I)V", line = 239)
	void method21374(@OriginalArg(0) int arg0) {
		this.aClass489Array6[0].method29836();
		this.method21371(arg0);
	}

	@OriginalMember(owner = "client!ahi", name = "ak", descriptor = "(I)V", line = 239)
	void method21393(@OriginalArg(0) int arg0) {
		this.aClass489Array6[0].method29836();
		this.method21371(arg0);
	}

	@OriginalMember(owner = "client!ahi", name = "a", descriptor = "()Z")
	abstract boolean method21363() throws Exception_Sub2;

	@OriginalMember(owner = "client!ahi", name = "aw", descriptor = "()Z")
	abstract boolean method21365() throws Exception_Sub2;

	@OriginalMember(owner = "client!ahi", name = "ai", descriptor = "()Z")
	abstract boolean method21376() throws Exception_Sub2;
}
