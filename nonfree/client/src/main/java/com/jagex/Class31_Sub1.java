package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adc")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!adc", name = "w", descriptor = "I")
	static final int anInt773 = 3;

	@OriginalMember(owner = "client!adc", name = "c", descriptor = "I")
	static final int anInt774 = 0;

	@OriginalMember(owner = "client!adc", name = "q", descriptor = "I")
	static final int anInt775 = 7;

	@OriginalMember(owner = "client!adc", name = "n", descriptor = "I")
	static final int anInt776 = 3;

	@OriginalMember(owner = "client!adc", name = "r", descriptor = "I")
	static final int anInt777 = 5;

	@OriginalMember(owner = "client!adc", name = "d", descriptor = "I")
	static final int anInt778 = 6;

	@OriginalMember(owner = "client!adc", name = "j", descriptor = "I")
	static final int anInt779 = 2;

	@OriginalMember(owner = "client!adc", name = "m", descriptor = "I")
	static final int anInt780 = 0;

	@OriginalMember(owner = "client!adc", name = "v", descriptor = "I")
	static final int anInt781 = 1;

	@OriginalMember(owner = "client!adc", name = "t", descriptor = "I")
	static final int anInt782 = 2;

	@OriginalMember(owner = "client!adc", name = "z", descriptor = "I")
	static final int anInt783 = 1;

	@OriginalMember(owner = "client!adc", name = "e", descriptor = "I")
	static final int anInt784 = 4;

	@OriginalMember(owner = "client!adc", name = "b", descriptor = "Lclient!fc;")
	Class24 aClass24_1;

	@OriginalMember(owner = "client!adc", name = "f", descriptor = "[I")
	int[] anIntArray92;

	@OriginalMember(owner = "client!adc", name = "o", descriptor = "[Lclient!fk;")
	final Class25[] aClass25Array4 = new Class25[3];

	@OriginalMember(owner = "client!adc", name = "i", descriptor = "[[I")
	final int[][] anIntArrayArray14 = new int[3][7];

	@OriginalMember(owner = "client!adc", name = "k", descriptor = "Lclient!mv;")
	Class333 aClass333_2 = new Class333(1.0F, 1.0F, 1.0F, 1.0F);

	@OriginalMember(owner = "client!adc", name = "at", descriptor = "Lclient!mv;")
	Class333 aClass333_1 = new Class333(0.0F, 0.0F, 0.0F, 0.0F);

	@OriginalMember(owner = "client!adc", name = "<init>", descriptor = "(Lclient!abv;)V", line = 31)
	public Class31_Sub1(@OriginalArg(0) Class21_Sub3 arg0) throws Exception_Sub1 {
		super(arg0);
		this.method7475();
	}

	@OriginalMember(owner = "client!adc", name = "j", descriptor = "(I)Z", line = 36)
	boolean method7475() throws Exception_Sub1 {
		this.aClass24_1 = this.aClass21_Sub3_22.method17435("Sprite");
		@Pc(11) Class3_Sub19_Sub1 local11 = this.aClass24_1.method6583("WVPMatrix");
		@Pc(17) Class3_Sub19_Sub1 local17 = this.aClass24_1.method6583("SpriteSampler");
		@Pc(23) Class3_Sub19_Sub1 local23 = this.aClass24_1.method6583("MaskSampler");
		@Pc(29) Class3_Sub19_Sub1 local29 = this.aClass24_1.method6583("MulColour");
		@Pc(35) Class3_Sub19_Sub1 local35 = this.aClass24_1.method6583("AddColour");
		@Pc(41) Class3_Sub19_Sub1 local41 = this.aClass24_1.method6583("SpriteTexCoordMatrix");
		@Pc(47) Class3_Sub19_Sub1 local47 = this.aClass24_1.method6583("MaskTexCoordMatrix");
		this.aClass25Array4[0] = this.aClass24_1.method6555("Normal");
		this.aClass25Array4[1] = this.aClass24_1.method6555("Masked");
		this.aClass25Array4[2] = this.aClass24_1.method6555("AlphaTex");
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(88) int local88 = this.aClass24_1.method6592(this.aClass25Array4[local76]);
			this.anIntArrayArray14[local76][0] = local11.method20815(local88);
			this.anIntArrayArray14[local76][1] = local17.method20815(local88);
			this.anIntArrayArray14[local76][2] = local23.method20815(local88);
			this.anIntArrayArray14[local76][5] = local29.method20815(local88);
			this.anIntArrayArray14[local76][6] = local35.method20815(local88);
			this.anIntArrayArray14[local76][3] = local41.method20815(local88);
			this.anIntArrayArray14[local76][4] = local47.method20815(local88);
		}
		this.aClass24_1.method6560(this.aClass25Array4[0]);
		return true;
	}

	@OriginalMember(owner = "client!adc", name = "e", descriptor = "()Z", line = 36)
	boolean method7476() throws Exception_Sub1 {
		this.aClass24_1 = this.aClass21_Sub3_22.method17435("Sprite");
		@Pc(11) Class3_Sub19_Sub1 local11 = this.aClass24_1.method6583("WVPMatrix");
		@Pc(17) Class3_Sub19_Sub1 local17 = this.aClass24_1.method6583("SpriteSampler");
		@Pc(23) Class3_Sub19_Sub1 local23 = this.aClass24_1.method6583("MaskSampler");
		@Pc(29) Class3_Sub19_Sub1 local29 = this.aClass24_1.method6583("MulColour");
		@Pc(35) Class3_Sub19_Sub1 local35 = this.aClass24_1.method6583("AddColour");
		@Pc(41) Class3_Sub19_Sub1 local41 = this.aClass24_1.method6583("SpriteTexCoordMatrix");
		@Pc(47) Class3_Sub19_Sub1 local47 = this.aClass24_1.method6583("MaskTexCoordMatrix");
		this.aClass25Array4[0] = this.aClass24_1.method6555("Normal");
		this.aClass25Array4[1] = this.aClass24_1.method6555("Masked");
		this.aClass25Array4[2] = this.aClass24_1.method6555("AlphaTex");
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(88) int local88 = this.aClass24_1.method6592(this.aClass25Array4[local76]);
			this.anIntArrayArray14[local76][0] = local11.method20815(local88);
			this.anIntArrayArray14[local76][1] = local17.method20815(local88);
			this.anIntArrayArray14[local76][2] = local23.method20815(local88);
			this.anIntArrayArray14[local76][5] = local29.method20815(local88);
			this.anIntArrayArray14[local76][6] = local35.method20815(local88);
			this.anIntArrayArray14[local76][3] = local41.method20815(local88);
			this.anIntArrayArray14[local76][4] = local47.method20815(local88);
		}
		this.aClass24_1.method6560(this.aClass25Array4[0]);
		return true;
	}

	@OriginalMember(owner = "client!adc", name = "r", descriptor = "()Z", line = 36)
	boolean method7479() throws Exception_Sub1 {
		this.aClass24_1 = this.aClass21_Sub3_22.method17435("Sprite");
		@Pc(11) Class3_Sub19_Sub1 local11 = this.aClass24_1.method6583("WVPMatrix");
		@Pc(17) Class3_Sub19_Sub1 local17 = this.aClass24_1.method6583("SpriteSampler");
		@Pc(23) Class3_Sub19_Sub1 local23 = this.aClass24_1.method6583("MaskSampler");
		@Pc(29) Class3_Sub19_Sub1 local29 = this.aClass24_1.method6583("MulColour");
		@Pc(35) Class3_Sub19_Sub1 local35 = this.aClass24_1.method6583("AddColour");
		@Pc(41) Class3_Sub19_Sub1 local41 = this.aClass24_1.method6583("SpriteTexCoordMatrix");
		@Pc(47) Class3_Sub19_Sub1 local47 = this.aClass24_1.method6583("MaskTexCoordMatrix");
		this.aClass25Array4[0] = this.aClass24_1.method6555("Normal");
		this.aClass25Array4[1] = this.aClass24_1.method6555("Masked");
		this.aClass25Array4[2] = this.aClass24_1.method6555("AlphaTex");
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(88) int local88 = this.aClass24_1.method6592(this.aClass25Array4[local76]);
			this.anIntArrayArray14[local76][0] = local11.method20815(local88);
			this.anIntArrayArray14[local76][1] = local17.method20815(local88);
			this.anIntArrayArray14[local76][2] = local23.method20815(local88);
			this.anIntArrayArray14[local76][5] = local29.method20815(local88);
			this.anIntArrayArray14[local76][6] = local35.method20815(local88);
			this.anIntArrayArray14[local76][3] = local41.method20815(local88);
			this.anIntArrayArray14[local76][4] = local47.method20815(local88);
		}
		this.aClass24_1.method6560(this.aClass25Array4[0]);
		return true;
	}

	@OriginalMember(owner = "client!adc", name = "p", descriptor = "(II)V", line = 62)
	@Override
	public void method8274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		switch(arg0) {
			case 0:
				this.aClass333_2.method26253(arg1);
				this.aClass333_1.method26253(0);
				break;
			case 1:
				this.aClass333_2.method26253(-1);
				this.aClass333_1.method26253(0);
				break;
			case 2:
				this.aClass333_2.method26253(arg1);
				this.aClass333_1.method26253(0);
				break;
			case 3:
				this.aClass333_2.method26253(arg1 & 0xFF000000 | 0xFFFFFF);
				this.aClass333_1.method26253(arg1 & 0xFFFFFF);
				break;
			case 4:
				this.aClass333_2.method26253(-1);
				this.aClass333_1.method26253(arg1);
				this.aClass333_1.method26266();
		}
	}

	@OriginalMember(owner = "client!adc", name = "l", descriptor = "(II)V", line = 62)
	@Override
	public void method8273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		switch(arg0) {
			case 0:
				this.aClass333_2.method26253(arg1);
				this.aClass333_1.method26253(0);
				break;
			case 1:
				this.aClass333_2.method26253(-1);
				this.aClass333_1.method26253(0);
				break;
			case 2:
				this.aClass333_2.method26253(arg1);
				this.aClass333_1.method26253(0);
				break;
			case 3:
				this.aClass333_2.method26253(arg1 & 0xFF000000 | 0xFFFFFF);
				this.aClass333_1.method26253(arg1 & 0xFFFFFF);
				break;
			case 4:
				this.aClass333_2.method26253(-1);
				this.aClass333_1.method26253(arg1);
				this.aClass333_1.method26266();
		}
	}

	@OriginalMember(owner = "client!adc", name = "h", descriptor = "(II)V", line = 62)
	@Override
	public void method8271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		switch(arg0) {
			case 0:
				this.aClass333_2.method26253(arg1);
				this.aClass333_1.method26253(0);
				break;
			case 1:
				this.aClass333_2.method26253(-1);
				this.aClass333_1.method26253(0);
				break;
			case 2:
				this.aClass333_2.method26253(arg1);
				this.aClass333_1.method26253(0);
				break;
			case 3:
				this.aClass333_2.method26253(arg1 & 0xFF000000 | 0xFFFFFF);
				this.aClass333_1.method26253(arg1 & 0xFFFFFF);
				break;
			case 4:
				this.aClass333_2.method26253(-1);
				this.aClass333_1.method26253(arg1);
				this.aClass333_1.method26266();
		}
	}

	@OriginalMember(owner = "client!adc", name = "n", descriptor = "(I)V", line = 88)
	void method7472() {
		this.aClass24_1.method6657(this.anIntArray92[1], 0, this.anInterface20_18);
		this.aClass21_Sub3_22.method17483(this.aClass328_51);
		this.aClass24_1.method6585(this.anIntArray92[0], this.aClass328_51);
		this.aClass24_1.method6627(this.anIntArray92[3], this.aClass328_53);
		this.aClass24_1.method6576(this.anIntArray92[5], this.aClass333_2.aFloat283, this.aClass333_2.aFloat282, this.aClass333_2.aFloat284, this.aClass333_2.aFloat281);
		this.aClass24_1.method6576(this.anIntArray92[6], this.aClass333_1.aFloat283, this.aClass333_1.aFloat282, this.aClass333_1.aFloat284, this.aClass333_1.aFloat281);
		this.aClass21_Sub3_22.method17544(0, this.anInterface21_9);
		this.aClass21_Sub3_22.method17738(this.aClass37_10);
		this.aClass21_Sub3_22.method17554(Class263.aClass263_3, this.anInt884, 2);
	}

	@OriginalMember(owner = "client!adc", name = "v", descriptor = "()V", line = 88)
	void method7473() {
		this.aClass24_1.method6657(this.anIntArray92[1], 0, this.anInterface20_18);
		this.aClass21_Sub3_22.method17483(this.aClass328_51);
		this.aClass24_1.method6585(this.anIntArray92[0], this.aClass328_51);
		this.aClass24_1.method6627(this.anIntArray92[3], this.aClass328_53);
		this.aClass24_1.method6576(this.anIntArray92[5], this.aClass333_2.aFloat283, this.aClass333_2.aFloat282, this.aClass333_2.aFloat284, this.aClass333_2.aFloat281);
		this.aClass24_1.method6576(this.anIntArray92[6], this.aClass333_1.aFloat283, this.aClass333_1.aFloat282, this.aClass333_1.aFloat284, this.aClass333_1.aFloat281);
		this.aClass21_Sub3_22.method17544(0, this.anInterface21_9);
		this.aClass21_Sub3_22.method17738(this.aClass37_10);
		this.aClass21_Sub3_22.method17554(Class263.aClass263_3, this.anInt884, 2);
	}

	@OriginalMember(owner = "client!adc", name = "q", descriptor = "()V", line = 88)
	void method7474() {
		this.aClass24_1.method6657(this.anIntArray92[1], 0, this.anInterface20_18);
		this.aClass21_Sub3_22.method17483(this.aClass328_51);
		this.aClass24_1.method6585(this.anIntArray92[0], this.aClass328_51);
		this.aClass24_1.method6627(this.anIntArray92[3], this.aClass328_53);
		this.aClass24_1.method6576(this.anIntArray92[5], this.aClass333_2.aFloat283, this.aClass333_2.aFloat282, this.aClass333_2.aFloat284, this.aClass333_2.aFloat281);
		this.aClass24_1.method6576(this.anIntArray92[6], this.aClass333_1.aFloat283, this.aClass333_1.aFloat282, this.aClass333_1.aFloat284, this.aClass333_1.aFloat281);
		this.aClass21_Sub3_22.method17544(0, this.anInterface21_9);
		this.aClass21_Sub3_22.method17738(this.aClass37_10);
		this.aClass21_Sub3_22.method17554(Class263.aClass263_3, this.anInt884, 2);
	}

	@OriginalMember(owner = "client!adc", name = "d", descriptor = "()V", line = 88)
	void method7477() {
		this.aClass24_1.method6657(this.anIntArray92[1], 0, this.anInterface20_18);
		this.aClass21_Sub3_22.method17483(this.aClass328_51);
		this.aClass24_1.method6585(this.anIntArray92[0], this.aClass328_51);
		this.aClass24_1.method6627(this.anIntArray92[3], this.aClass328_53);
		this.aClass24_1.method6576(this.anIntArray92[5], this.aClass333_2.aFloat283, this.aClass333_2.aFloat282, this.aClass333_2.aFloat284, this.aClass333_2.aFloat281);
		this.aClass24_1.method6576(this.anIntArray92[6], this.aClass333_1.aFloat283, this.aClass333_1.aFloat282, this.aClass333_1.aFloat284, this.aClass333_1.aFloat281);
		this.aClass21_Sub3_22.method17544(0, this.anInterface21_9);
		this.aClass21_Sub3_22.method17738(this.aClass37_10);
		this.aClass21_Sub3_22.method17554(Class263.aClass263_3, this.anInt884, 2);
	}

	@OriginalMember(owner = "client!adc", name = "m", descriptor = "()V", line = 88)
	void method7478() {
		this.aClass24_1.method6657(this.anIntArray92[1], 0, this.anInterface20_18);
		this.aClass21_Sub3_22.method17483(this.aClass328_51);
		this.aClass24_1.method6585(this.anIntArray92[0], this.aClass328_51);
		this.aClass24_1.method6627(this.anIntArray92[3], this.aClass328_53);
		this.aClass24_1.method6576(this.anIntArray92[5], this.aClass333_2.aFloat283, this.aClass333_2.aFloat282, this.aClass333_2.aFloat284, this.aClass333_2.aFloat281);
		this.aClass24_1.method6576(this.anIntArray92[6], this.aClass333_1.aFloat283, this.aClass333_1.aFloat282, this.aClass333_1.aFloat284, this.aClass333_1.aFloat281);
		this.aClass21_Sub3_22.method17544(0, this.anInterface21_9);
		this.aClass21_Sub3_22.method17738(this.aClass37_10);
		this.aClass21_Sub3_22.method17554(Class263.aClass263_3, this.anInt884, 2);
	}

	@OriginalMember(owner = "client!adc", name = "x", descriptor = "()V", line = 100)
	@Override
	public void method8278() {
		this.aClass24_1.method6560(this.aClass25Array4[0]);
		this.aClass24_1.method6550();
		this.anIntArray92 = this.anIntArrayArray14[this.aClass24_1.method6628()];
		this.method7472();
	}

	@OriginalMember(owner = "client!adc", name = "s", descriptor = "()V", line = 100)
	@Override
	public void method8275() {
		this.aClass24_1.method6560(this.aClass25Array4[0]);
		this.aClass24_1.method6550();
		this.anIntArray92 = this.anIntArrayArray14[this.aClass24_1.method6628()];
		this.method7472();
	}

	@OriginalMember(owner = "client!adc", name = "u", descriptor = "()V", line = 100)
	@Override
	public void method8276() {
		this.aClass24_1.method6560(this.aClass25Array4[0]);
		this.aClass24_1.method6550();
		this.anIntArray92 = this.anIntArrayArray14[this.aClass24_1.method6628()];
		this.method7472();
	}

	@OriginalMember(owner = "client!adc", name = "y", descriptor = "()V", line = 100)
	@Override
	public void method8277() {
		this.aClass24_1.method6560(this.aClass25Array4[0]);
		this.aClass24_1.method6550();
		this.anIntArray92 = this.anIntArrayArray14[this.aClass24_1.method6628()];
		this.method7472();
	}

	@OriginalMember(owner = "client!adc", name = "b", descriptor = "()V", line = 100)
	@Override
	public void method8280() {
		this.aClass24_1.method6560(this.aClass25Array4[0]);
		this.aClass24_1.method6550();
		this.anIntArray92 = this.anIntArrayArray14[this.aClass24_1.method6628()];
		this.method7472();
	}

	@OriginalMember(owner = "client!adc", name = "a", descriptor = "()V", line = 100)
	@Override
	public void method8270() {
		this.aClass24_1.method6560(this.aClass25Array4[0]);
		this.aClass24_1.method6550();
		this.anIntArray92 = this.anIntArrayArray14[this.aClass24_1.method6628()];
		this.method7472();
	}

	@OriginalMember(owner = "client!adc", name = "c", descriptor = "()V", line = 107)
	@Override
	public void method8279() {
		this.aClass24_1.method6560(this.aClass25Array4[1]);
		this.aClass24_1.method6550();
		this.anIntArray92 = this.anIntArrayArray14[this.aClass24_1.method6628()];
		this.aClass24_1.method6657(this.anIntArray92[2], 1, this.anInterface20_19);
		this.aClass24_1.method6627(this.anIntArray92[4], this.aClass328_52);
		this.method7472();
	}

	@OriginalMember(owner = "client!adc", name = "g", descriptor = "()V", line = 107)
	@Override
	public void method8272() {
		this.aClass24_1.method6560(this.aClass25Array4[1]);
		this.aClass24_1.method6550();
		this.anIntArray92 = this.anIntArrayArray14[this.aClass24_1.method6628()];
		this.aClass24_1.method6657(this.anIntArray92[2], 1, this.anInterface20_19);
		this.aClass24_1.method6627(this.anIntArray92[4], this.aClass328_52);
		this.method7472();
	}

	@OriginalMember(owner = "client!adc", name = "z", descriptor = "()V", line = 107)
	@Override
	public void method8269() {
		this.aClass24_1.method6560(this.aClass25Array4[1]);
		this.aClass24_1.method6550();
		this.anIntArray92 = this.anIntArrayArray14[this.aClass24_1.method6628()];
		this.aClass24_1.method6657(this.anIntArray92[2], 1, this.anInterface20_19);
		this.aClass24_1.method6627(this.anIntArray92[4], this.aClass328_52);
		this.method7472();
	}

	@OriginalMember(owner = "client!adc", name = "dd", descriptor = "(Lclient!vs;I)V", line = 4678)
	static final void method7481(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class284.method25466(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!adc", name = "ain", descriptor = "(Lclient!vs;B)V", line = 10614)
	static final void method7480(@OriginalArg(0) Class536 arg0) {
		Class174.method23400();
	}
}
