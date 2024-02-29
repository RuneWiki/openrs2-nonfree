package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agg")
public final class Class103_Sub1 extends Class103 {

	@OriginalMember(owner = "client!agg", name = "s", descriptor = "I")
	static final int anInt958 = 0;

	@OriginalMember(owner = "client!agg", name = "r", descriptor = "I")
	static final int anInt959 = 1;

	@OriginalMember(owner = "client!agg", name = "z", descriptor = "I")
	static final int anInt960 = 3;

	@OriginalMember(owner = "client!agg", name = "j", descriptor = "I")
	static final int anInt961 = 4;

	@OriginalMember(owner = "client!agg", name = "u", descriptor = "I")
	static final int anInt962 = 7;

	@OriginalMember(owner = "client!agg", name = "k", descriptor = "I")
	static final int anInt963 = 6;

	@OriginalMember(owner = "client!agg", name = "i", descriptor = "I")
	static final int anInt964 = 5;

	@OriginalMember(owner = "client!agg", name = "o", descriptor = "I")
	static final int anInt965 = 2;

	@OriginalMember(owner = "client!agg", name = "f", descriptor = "I")
	static final int anInt966 = 1;

	@OriginalMember(owner = "client!agg", name = "g", descriptor = "I")
	static final int anInt967 = 2;

	@OriginalMember(owner = "client!agg", name = "b", descriptor = "I")
	static final int anInt968 = 3;

	@OriginalMember(owner = "client!agg", name = "e", descriptor = "I")
	static final int anInt969 = 0;

	@OriginalMember(owner = "client!agg", name = "d", descriptor = "Lclient!hi;")
	Class112 aClass112_2;

	@OriginalMember(owner = "client!agg", name = "m", descriptor = "[I")
	int[] anIntArray106;

	@OriginalMember(owner = "client!agg", name = "n", descriptor = "[Lclient!hr;")
	final Class105[] aClass105Array1 = new Class105[3];

	@OriginalMember(owner = "client!agg", name = "a", descriptor = "[[I")
	final int[][] anIntArrayArray14 = new int[3][7];

	@OriginalMember(owner = "client!agg", name = "h", descriptor = "Lclient!or;")
	Class450 aClass450_1 = new Class450(1.0F, 1.0F, 1.0F, 1.0F);

	@OriginalMember(owner = "client!agg", name = "aj", descriptor = "Lclient!or;")
	Class450 aClass450_2 = new Class450(0.0F, 0.0F, 0.0F, 0.0F);

	@OriginalMember(owner = "client!agg", name = "<init>", descriptor = "(Lclient!aed;)V", line = 31)
	public Class103_Sub1(@OriginalArg(0) Class86_Sub1 arg0) throws Exception_Sub3 {
		super(arg0);
		this.method7940();
	}

	@OriginalMember(owner = "client!agg", name = "s", descriptor = "()Z", line = 36)
	boolean method7939() throws Exception_Sub3 {
		this.aClass112_2 = this.aClass86_Sub1_17.method20613("Sprite");
		@Pc(11) Class77_Sub12_Sub1 local11 = this.aClass112_2.method9524("WVPMatrix");
		@Pc(17) Class77_Sub12_Sub1 local17 = this.aClass112_2.method9524("SpriteSampler");
		@Pc(23) Class77_Sub12_Sub1 local23 = this.aClass112_2.method9524("MaskSampler");
		@Pc(29) Class77_Sub12_Sub1 local29 = this.aClass112_2.method9524("MulColour");
		@Pc(35) Class77_Sub12_Sub1 local35 = this.aClass112_2.method9524("AddColour");
		@Pc(41) Class77_Sub12_Sub1 local41 = this.aClass112_2.method9524("SpriteTexCoordMatrix");
		@Pc(47) Class77_Sub12_Sub1 local47 = this.aClass112_2.method9524("MaskTexCoordMatrix");
		this.aClass105Array1[0] = this.aClass112_2.method9458("Normal");
		this.aClass105Array1[1] = this.aClass112_2.method9458("Masked");
		this.aClass105Array1[2] = this.aClass112_2.method9458("AlphaTex");
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(88) int local88 = this.aClass112_2.method9463(this.aClass105Array1[local76]);
			this.anIntArrayArray14[local76][0] = local11.method23565(local88);
			this.anIntArrayArray14[local76][1] = local17.method23565(local88);
			this.anIntArrayArray14[local76][2] = local23.method23565(local88);
			this.anIntArrayArray14[local76][5] = local29.method23565(local88);
			this.anIntArrayArray14[local76][6] = local35.method23565(local88);
			this.anIntArrayArray14[local76][3] = local41.method23565(local88);
			this.anIntArrayArray14[local76][4] = local47.method23565(local88);
		}
		this.aClass112_2.method9547(this.aClass105Array1[0]);
		return true;
	}

	@OriginalMember(owner = "client!agg", name = "x", descriptor = "(I)Z", line = 36)
	boolean method7940() throws Exception_Sub3 {
		this.aClass112_2 = this.aClass86_Sub1_17.method20613("Sprite");
		@Pc(11) Class77_Sub12_Sub1 local11 = this.aClass112_2.method9524("WVPMatrix");
		@Pc(17) Class77_Sub12_Sub1 local17 = this.aClass112_2.method9524("SpriteSampler");
		@Pc(23) Class77_Sub12_Sub1 local23 = this.aClass112_2.method9524("MaskSampler");
		@Pc(29) Class77_Sub12_Sub1 local29 = this.aClass112_2.method9524("MulColour");
		@Pc(35) Class77_Sub12_Sub1 local35 = this.aClass112_2.method9524("AddColour");
		@Pc(41) Class77_Sub12_Sub1 local41 = this.aClass112_2.method9524("SpriteTexCoordMatrix");
		@Pc(47) Class77_Sub12_Sub1 local47 = this.aClass112_2.method9524("MaskTexCoordMatrix");
		this.aClass105Array1[0] = this.aClass112_2.method9458("Normal");
		this.aClass105Array1[1] = this.aClass112_2.method9458("Masked");
		this.aClass105Array1[2] = this.aClass112_2.method9458("AlphaTex");
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(88) int local88 = this.aClass112_2.method9463(this.aClass105Array1[local76]);
			this.anIntArrayArray14[local76][0] = local11.method23565(local88);
			this.anIntArrayArray14[local76][1] = local17.method23565(local88);
			this.anIntArrayArray14[local76][2] = local23.method23565(local88);
			this.anIntArrayArray14[local76][5] = local29.method23565(local88);
			this.anIntArrayArray14[local76][6] = local35.method23565(local88);
			this.anIntArrayArray14[local76][3] = local41.method23565(local88);
			this.anIntArrayArray14[local76][4] = local47.method23565(local88);
		}
		this.aClass112_2.method9547(this.aClass105Array1[0]);
		return true;
	}

	@OriginalMember(owner = "client!agg", name = "r", descriptor = "()Z", line = 36)
	boolean method7941() throws Exception_Sub3 {
		this.aClass112_2 = this.aClass86_Sub1_17.method20613("Sprite");
		@Pc(11) Class77_Sub12_Sub1 local11 = this.aClass112_2.method9524("WVPMatrix");
		@Pc(17) Class77_Sub12_Sub1 local17 = this.aClass112_2.method9524("SpriteSampler");
		@Pc(23) Class77_Sub12_Sub1 local23 = this.aClass112_2.method9524("MaskSampler");
		@Pc(29) Class77_Sub12_Sub1 local29 = this.aClass112_2.method9524("MulColour");
		@Pc(35) Class77_Sub12_Sub1 local35 = this.aClass112_2.method9524("AddColour");
		@Pc(41) Class77_Sub12_Sub1 local41 = this.aClass112_2.method9524("SpriteTexCoordMatrix");
		@Pc(47) Class77_Sub12_Sub1 local47 = this.aClass112_2.method9524("MaskTexCoordMatrix");
		this.aClass105Array1[0] = this.aClass112_2.method9458("Normal");
		this.aClass105Array1[1] = this.aClass112_2.method9458("Masked");
		this.aClass105Array1[2] = this.aClass112_2.method9458("AlphaTex");
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(88) int local88 = this.aClass112_2.method9463(this.aClass105Array1[local76]);
			this.anIntArrayArray14[local76][0] = local11.method23565(local88);
			this.anIntArrayArray14[local76][1] = local17.method23565(local88);
			this.anIntArrayArray14[local76][2] = local23.method23565(local88);
			this.anIntArrayArray14[local76][5] = local29.method23565(local88);
			this.anIntArrayArray14[local76][6] = local35.method23565(local88);
			this.anIntArrayArray14[local76][3] = local41.method23565(local88);
			this.anIntArrayArray14[local76][4] = local47.method23565(local88);
		}
		this.aClass112_2.method9547(this.aClass105Array1[0]);
		return true;
	}

	@OriginalMember(owner = "client!agg", name = "g", descriptor = "()Z", line = 36)
	boolean method7942() throws Exception_Sub3 {
		this.aClass112_2 = this.aClass86_Sub1_17.method20613("Sprite");
		@Pc(11) Class77_Sub12_Sub1 local11 = this.aClass112_2.method9524("WVPMatrix");
		@Pc(17) Class77_Sub12_Sub1 local17 = this.aClass112_2.method9524("SpriteSampler");
		@Pc(23) Class77_Sub12_Sub1 local23 = this.aClass112_2.method9524("MaskSampler");
		@Pc(29) Class77_Sub12_Sub1 local29 = this.aClass112_2.method9524("MulColour");
		@Pc(35) Class77_Sub12_Sub1 local35 = this.aClass112_2.method9524("AddColour");
		@Pc(41) Class77_Sub12_Sub1 local41 = this.aClass112_2.method9524("SpriteTexCoordMatrix");
		@Pc(47) Class77_Sub12_Sub1 local47 = this.aClass112_2.method9524("MaskTexCoordMatrix");
		this.aClass105Array1[0] = this.aClass112_2.method9458("Normal");
		this.aClass105Array1[1] = this.aClass112_2.method9458("Masked");
		this.aClass105Array1[2] = this.aClass112_2.method9458("AlphaTex");
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(88) int local88 = this.aClass112_2.method9463(this.aClass105Array1[local76]);
			this.anIntArrayArray14[local76][0] = local11.method23565(local88);
			this.anIntArrayArray14[local76][1] = local17.method23565(local88);
			this.anIntArrayArray14[local76][2] = local23.method23565(local88);
			this.anIntArrayArray14[local76][5] = local29.method23565(local88);
			this.anIntArrayArray14[local76][6] = local35.method23565(local88);
			this.anIntArrayArray14[local76][3] = local41.method23565(local88);
			this.anIntArrayArray14[local76][4] = local47.method23565(local88);
		}
		this.aClass112_2.method9547(this.aClass105Array1[0]);
		return true;
	}

	@OriginalMember(owner = "client!agg", name = "p", descriptor = "(II)V", line = 62)
	@Override
	public void method9177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		switch(arg0) {
			case 0:
				this.aClass450_1.method29243(arg1);
				this.aClass450_2.method29243(0);
				break;
			case 1:
				this.aClass450_1.method29243(-1);
				this.aClass450_2.method29243(0);
				break;
			case 2:
				this.aClass450_1.method29243(arg1);
				this.aClass450_2.method29243(0);
				break;
			case 3:
				this.aClass450_1.method29243(arg1 & 0xFF000000 | 0xFFFFFF);
				this.aClass450_2.method29243(arg1 & 0xFFFFFF);
				break;
			case 4:
				this.aClass450_1.method29243(-1);
				this.aClass450_2.method29243(arg1);
				this.aClass450_2.method29250();
		}
	}

	@OriginalMember(owner = "client!agg", name = "t", descriptor = "(II)V", line = 62)
	@Override
	public void method9183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		switch(arg0) {
			case 0:
				this.aClass450_1.method29243(arg1);
				this.aClass450_2.method29243(0);
				break;
			case 1:
				this.aClass450_1.method29243(-1);
				this.aClass450_2.method29243(0);
				break;
			case 2:
				this.aClass450_1.method29243(arg1);
				this.aClass450_2.method29243(0);
				break;
			case 3:
				this.aClass450_1.method29243(arg1 & 0xFF000000 | 0xFFFFFF);
				this.aClass450_2.method29243(arg1 & 0xFFFFFF);
				break;
			case 4:
				this.aClass450_1.method29243(-1);
				this.aClass450_2.method29243(arg1);
				this.aClass450_2.method29250();
		}
	}

	@OriginalMember(owner = "client!agg", name = "q", descriptor = "(II)V", line = 62)
	@Override
	public void method9178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		switch(arg0) {
			case 0:
				this.aClass450_1.method29243(arg1);
				this.aClass450_2.method29243(0);
				break;
			case 1:
				this.aClass450_1.method29243(-1);
				this.aClass450_2.method29243(0);
				break;
			case 2:
				this.aClass450_1.method29243(arg1);
				this.aClass450_2.method29243(0);
				break;
			case 3:
				this.aClass450_1.method29243(arg1 & 0xFF000000 | 0xFFFFFF);
				this.aClass450_2.method29243(arg1 & 0xFFFFFF);
				break;
			case 4:
				this.aClass450_1.method29243(-1);
				this.aClass450_2.method29243(arg1);
				this.aClass450_2.method29250();
		}
	}

	@OriginalMember(owner = "client!agg", name = "d", descriptor = "(B)V", line = 88)
	void method7943() {
		this.aClass112_2.method9522(this.anIntArray106[1], 0, this.anInterface37_19);
		this.aClass86_Sub1_17.method20675(this.aClass442_52);
		this.aClass112_2.method9517(this.anIntArray106[0], this.aClass442_52);
		this.aClass112_2.method9514(this.anIntArray106[3], this.aClass442_50);
		this.aClass112_2.method9507(this.anIntArray106[5], this.aClass450_1.aFloat279, this.aClass450_1.aFloat280, this.aClass450_1.aFloat282, this.aClass450_1.aFloat281);
		this.aClass112_2.method9507(this.anIntArray106[6], this.aClass450_2.aFloat279, this.aClass450_2.aFloat280, this.aClass450_2.aFloat282, this.aClass450_2.aFloat281);
		this.aClass86_Sub1_17.method20670(0, this.anInterface36_9);
		this.aClass86_Sub1_17.method20658(this.aClass113_10);
		this.aClass86_Sub1_17.method20661(Class384.aClass384_1, this.anInt1094, 2);
	}

	@OriginalMember(owner = "client!agg", name = "z", descriptor = "()V", line = 88)
	void method7944() {
		this.aClass112_2.method9522(this.anIntArray106[1], 0, this.anInterface37_19);
		this.aClass86_Sub1_17.method20675(this.aClass442_52);
		this.aClass112_2.method9517(this.anIntArray106[0], this.aClass442_52);
		this.aClass112_2.method9514(this.anIntArray106[3], this.aClass442_50);
		this.aClass112_2.method9507(this.anIntArray106[5], this.aClass450_1.aFloat279, this.aClass450_1.aFloat280, this.aClass450_1.aFloat282, this.aClass450_1.aFloat281);
		this.aClass112_2.method9507(this.anIntArray106[6], this.aClass450_2.aFloat279, this.aClass450_2.aFloat280, this.aClass450_2.aFloat282, this.aClass450_2.aFloat281);
		this.aClass86_Sub1_17.method20670(0, this.anInterface36_9);
		this.aClass86_Sub1_17.method20658(this.aClass113_10);
		this.aClass86_Sub1_17.method20661(Class384.aClass384_1, this.anInt1094, 2);
	}

	@OriginalMember(owner = "client!agg", name = "c", descriptor = "()V", line = 100)
	@Override
	public void method9179() {
		this.aClass112_2.method9547(this.aClass105Array1[0]);
		this.aClass112_2.method9545();
		this.anIntArray106 = this.anIntArrayArray14[this.aClass112_2.method9470()];
		this.method7943();
	}

	@OriginalMember(owner = "client!agg", name = "l", descriptor = "()V", line = 100)
	@Override
	public void method9180() {
		this.aClass112_2.method9547(this.aClass105Array1[0]);
		this.aClass112_2.method9545();
		this.anIntArray106 = this.anIntArrayArray14[this.aClass112_2.method9470()];
		this.method7943();
	}

	@OriginalMember(owner = "client!agg", name = "v", descriptor = "()V", line = 107)
	@Override
	public void method9182() {
		this.aClass112_2.method9547(this.aClass105Array1[1]);
		this.aClass112_2.method9545();
		this.anIntArray106 = this.anIntArrayArray14[this.aClass112_2.method9470()];
		this.aClass112_2.method9522(this.anIntArray106[2], 1, this.anInterface37_20);
		this.aClass112_2.method9514(this.anIntArray106[4], this.aClass442_51);
		this.method7943();
	}

	@OriginalMember(owner = "client!agg", name = "y", descriptor = "()V", line = 107)
	@Override
	public void method9181() {
		this.aClass112_2.method9547(this.aClass105Array1[1]);
		this.aClass112_2.method9545();
		this.anIntArray106 = this.anIntArrayArray14[this.aClass112_2.method9470()];
		this.aClass112_2.method9522(this.anIntArray106[2], 1, this.anInterface37_20);
		this.aClass112_2.method9514(this.anIntArray106[4], this.aClass442_51);
		this.method7943();
	}

	@OriginalMember(owner = "client!agg", name = "w", descriptor = "()V", line = 107)
	@Override
	public void method9176() {
		this.aClass112_2.method9547(this.aClass105Array1[1]);
		this.aClass112_2.method9545();
		this.anIntArray106 = this.anIntArrayArray14[this.aClass112_2.method9470()];
		this.aClass112_2.method9522(this.anIntArray106[2], 1, this.anInterface37_20);
		this.aClass112_2.method9514(this.anIntArray106[4], this.aClass442_51);
		this.method7943();
	}
}
