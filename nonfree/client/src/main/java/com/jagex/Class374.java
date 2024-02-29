package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public class Class374 {

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "F")
	static float aFloat263;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	final int anInt4568 = 64;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
	final int anInt4567 = 768;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
	final int anInt4569 = 1600;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
	final int anInt4570 = Class690.method36319(1600);

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
	final int anInt4571 = 64;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "[I")
	int[] anIntArray452 = new int[8191];

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "[I")
	int[] anIntArray451 = new int[1600];

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "[I")
	int[] anIntArray453 = new int[64];

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "[[Lclient!apl;")
	Class131_Sub2_Sub1[][] aClass131_Sub2_Sub1ArrayArray4 = new Class131_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "[[Lclient!apl;")
	Class131_Sub2_Sub1[][] aClass131_Sub2_Sub1ArrayArray3 = new Class131_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	int anInt4572 = 0;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "Lclient!kt;")
	Class113 aClass113_24;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Lclient!kp;")
	Interface36 anInterface36_19;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "Lclient!kp;")
	Interface36 anInterface36_20;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Lclient!lc;")
	Interface38 anInterface38_8;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!aed;)V", line = 31)
	Class374(@OriginalArg(0) Class86_Sub1 arg0) {
		this.aClass113_24 = arg0.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_2, Class366.aClass366_4 }), new Class391(Class366.aClass366_1) });
		this.anInterface36_19 = arg0.method20656(true);
		this.anInterface36_20 = arg0.method20656(false);
		this.anInterface36_20.method28760(393168, 12);
		this.anInterface38_8 = arg0.method20772(false);
		this.anInterface38_8.method28728(49146);
		@Pc(104) ByteBuffer local104 = arg0.aByteBuffer7;
		local104.clear();
		@Pc(109) int local109;
		for (local109 = 0; local109 < 8191; local109++) {
			@Pc(116) int local116 = local109 * 4;
			local104.putShort((short) local116);
			local104.putShort((short) (local116 + 1));
			local104.putShort((short) (local116 + 2));
			local104.putShort((short) (local116 + 2));
			local104.putShort((short) (local116 + 3));
			local104.putShort((short) local116);
		}
		this.anInterface38_8.method28755(0, local104.position(), arg0.aLong121);
		local104.clear();
		for (local109 = 0; local109 < 8191; local109++) {
			local104.putFloat(0.0F);
			local104.putFloat(-1.0F);
			local104.putFloat(0.0F);
			local104.putFloat(0.0F);
			local104.putFloat(-1.0F);
			local104.putFloat(0.0F);
			local104.putFloat(0.0F);
			local104.putFloat(-1.0F);
			local104.putFloat(0.0F);
			local104.putFloat(0.0F);
			local104.putFloat(-1.0F);
			local104.putFloat(0.0F);
		}
		this.anInterface36_20.method28755(0, local104.position(), arg0.aLong121);
	}

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "(Lclient!aed;)V", line = 69)
	void method28281(@OriginalArg(0) Class86_Sub1 arg0) {
		this.anInterface36_19.method28760(786336, 24);
	}

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "(Lclient!aed;)V", line = 69)
	void method28282(@OriginalArg(0) Class86_Sub1 arg0) {
		this.anInterface36_19.method28760(786336, 24);
	}

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "(Lclient!aed;)V", line = 69)
	void method28283(@OriginalArg(0) Class86_Sub1 arg0) {
		this.anInterface36_19.method28760(786336, 24);
	}

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "(Lclient!aed;)V", line = 69)
	void method28284(@OriginalArg(0) Class86_Sub1 arg0) {
		this.anInterface36_19.method28760(786336, 24);
	}

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "(Lclient!aed;)V", line = 69)
	void method28285(@OriginalArg(0) Class86_Sub1 arg0) {
		this.anInterface36_19.method28760(786336, 24);
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(Lclient!aed;)V", line = 69)
	void method28286(@OriginalArg(0) Class86_Sub1 arg0) {
		this.anInterface36_19.method28760(786336, 24);
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()V", line = 73)
	void method28287() {
		this.anInterface36_19.method30322();
	}

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "()V", line = 73)
	void method28288() {
		this.anInterface36_19.method30322();
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "()V", line = 73)
	void method28289() {
		this.anInterface36_19.method30322();
	}

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "()V", line = 73)
	void method28290() {
		this.anInterface36_19.method30322();
	}

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "(Lclient!aed;Lclient!dm;)V", line = 77)
	void method28291(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class207 arg1) {
		arg0.method20230(false);
		aFloat263 = arg0.aFloat203;
		@Pc(11) float local11 = arg0.aClass442_79.aFloatArray109[2];
		@Pc(17) float local17 = arg0.aClass442_79.aFloatArray109[6];
		@Pc(23) float local23 = arg0.aClass442_79.aFloatArray109[10];
		@Pc(29) float local29 = arg0.aClass442_79.aFloatArray109[14];
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = Integer.MAX_VALUE;
		@Pc(35) int local35 = 0;
		@Pc(39) Class131_Sub2 local39 = arg1.aClass696_1.aClass131_Sub2_8;
		@Pc(75) int local75;
		for (@Pc(42) Class131_Sub2 local42 = local39.aClass131_Sub2_6; local42 != local39; local42 = local42.aClass131_Sub2_6) {
			@Pc(48) Class131_Sub2_Sub1 local48 = (Class131_Sub2_Sub1) local42;
			local75 = (int) (local11 * (float) (local48.anInt3125 >> 12) + local17 * (float) (local48.anInt3128 >> 12) + local23 * (float) (local48.anInt3129 >> 12) + local29);
			if (local75 > local35) {
				local35 = local75;
			}
			if (local75 < local33) {
				local33 = local75;
			}
			this.anIntArray452[local31++] = local75;
		}
		@Pc(99) int local99 = local35 - local33;
		if (local99 + 2 > 1600) {
			local75 = Class690.method36319(local99) + 1 - this.anInt4570;
			local99 = (local99 >> local75) + 2;
		} else {
			local75 = 0;
			local99 += 2;
		}
		arg0.method20659(this.anInterface38_8);
		@Pc(130) Class106 local130 = arg0.aClass106_3;
		local130.method8969(Class442.aClass442_97);
		local130.aClass442_41.method28951();
		local130.anInt1046 = -1;
		@Pc(146) boolean local146 = arg0.anInt2841 > 0;
		if (local146) {
			local130.aClass450_5.method29234(0.0F, 0.0F, 1.0F, -arg0.aFloat205);
			local130.aClass447_16.method29133((float) (arg0.anInt2840 >> 16 & 0xFF) / 255.0F, (float) (arg0.anInt2840 >> 8 & 0xFF) / 255.0F, (float) (arg0.anInt2840 >> 0 & 0xFF) / 255.0F);
			local130.aClass450_5.method29255(arg0.aClass442_80);
			local130.aClass450_5.method29253(1.0F / (arg0.aFloat206 - arg0.aFloat205));
		} else {
			local130.aClass450_5.method29234(0.0F, 0.0F, 0.0F, 0.0F);
			local130.aClass447_16.method29133(0.0F, 0.0F, 0.0F);
		}
		this.method28294(arg0, local39, local99, local33, local75, local130, local146);
		if (arg0.aFloat203 != aFloat263) {
			arg0.method20255(aFloat263);
		}
		arg0.method20230(true);
	}

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "(Lclient!aed;Lclient!dm;)V", line = 77)
	void method28292(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class207 arg1) {
		arg0.method20230(false);
		aFloat263 = arg0.aFloat203;
		@Pc(11) float local11 = arg0.aClass442_79.aFloatArray109[2];
		@Pc(17) float local17 = arg0.aClass442_79.aFloatArray109[6];
		@Pc(23) float local23 = arg0.aClass442_79.aFloatArray109[10];
		@Pc(29) float local29 = arg0.aClass442_79.aFloatArray109[14];
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = Integer.MAX_VALUE;
		@Pc(35) int local35 = 0;
		@Pc(39) Class131_Sub2 local39 = arg1.aClass696_1.aClass131_Sub2_8;
		@Pc(75) int local75;
		for (@Pc(42) Class131_Sub2 local42 = local39.aClass131_Sub2_6; local42 != local39; local42 = local42.aClass131_Sub2_6) {
			@Pc(48) Class131_Sub2_Sub1 local48 = (Class131_Sub2_Sub1) local42;
			local75 = (int) (local11 * (float) (local48.anInt3125 >> 12) + local17 * (float) (local48.anInt3128 >> 12) + local23 * (float) (local48.anInt3129 >> 12) + local29);
			if (local75 > local35) {
				local35 = local75;
			}
			if (local75 < local33) {
				local33 = local75;
			}
			this.anIntArray452[local31++] = local75;
		}
		@Pc(99) int local99 = local35 - local33;
		if (local99 + 2 > 1600) {
			local75 = Class690.method36319(local99) + 1 - this.anInt4570;
			local99 = (local99 >> local75) + 2;
		} else {
			local75 = 0;
			local99 += 2;
		}
		arg0.method20659(this.anInterface38_8);
		@Pc(130) Class106 local130 = arg0.aClass106_3;
		local130.method8969(Class442.aClass442_97);
		local130.aClass442_41.method28951();
		local130.anInt1046 = -1;
		@Pc(146) boolean local146 = arg0.anInt2841 > 0;
		if (local146) {
			local130.aClass450_5.method29234(0.0F, 0.0F, 1.0F, -arg0.aFloat205);
			local130.aClass447_16.method29133((float) (arg0.anInt2840 >> 16 & 0xFF) / 255.0F, (float) (arg0.anInt2840 >> 8 & 0xFF) / 255.0F, (float) (arg0.anInt2840 >> 0 & 0xFF) / 255.0F);
			local130.aClass450_5.method29255(arg0.aClass442_80);
			local130.aClass450_5.method29253(1.0F / (arg0.aFloat206 - arg0.aFloat205));
		} else {
			local130.aClass450_5.method29234(0.0F, 0.0F, 0.0F, 0.0F);
			local130.aClass447_16.method29133(0.0F, 0.0F, 0.0F);
		}
		this.method28294(arg0, local39, local99, local33, local75, local130, local146);
		if (arg0.aFloat203 != aFloat263) {
			arg0.method20255(aFloat263);
		}
		arg0.method20230(true);
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "(Lclient!aed;Lclient!dm;)V", line = 77)
	void method28293(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class207 arg1) {
		arg0.method20230(false);
		aFloat263 = arg0.aFloat203;
		@Pc(11) float local11 = arg0.aClass442_79.aFloatArray109[2];
		@Pc(17) float local17 = arg0.aClass442_79.aFloatArray109[6];
		@Pc(23) float local23 = arg0.aClass442_79.aFloatArray109[10];
		@Pc(29) float local29 = arg0.aClass442_79.aFloatArray109[14];
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = Integer.MAX_VALUE;
		@Pc(35) int local35 = 0;
		@Pc(39) Class131_Sub2 local39 = arg1.aClass696_1.aClass131_Sub2_8;
		@Pc(75) int local75;
		for (@Pc(42) Class131_Sub2 local42 = local39.aClass131_Sub2_6; local42 != local39; local42 = local42.aClass131_Sub2_6) {
			@Pc(48) Class131_Sub2_Sub1 local48 = (Class131_Sub2_Sub1) local42;
			local75 = (int) (local11 * (float) (local48.anInt3125 >> 12) + local17 * (float) (local48.anInt3128 >> 12) + local23 * (float) (local48.anInt3129 >> 12) + local29);
			if (local75 > local35) {
				local35 = local75;
			}
			if (local75 < local33) {
				local33 = local75;
			}
			this.anIntArray452[local31++] = local75;
		}
		@Pc(99) int local99 = local35 - local33;
		if (local99 + 2 > 1600) {
			local75 = Class690.method36319(local99) + 1 - this.anInt4570;
			local99 = (local99 >> local75) + 2;
		} else {
			local75 = 0;
			local99 += 2;
		}
		arg0.method20659(this.anInterface38_8);
		@Pc(130) Class106 local130 = arg0.aClass106_3;
		local130.method8969(Class442.aClass442_97);
		local130.aClass442_41.method28951();
		local130.anInt1046 = -1;
		@Pc(146) boolean local146 = arg0.anInt2841 > 0;
		if (local146) {
			local130.aClass450_5.method29234(0.0F, 0.0F, 1.0F, -arg0.aFloat205);
			local130.aClass447_16.method29133((float) (arg0.anInt2840 >> 16 & 0xFF) / 255.0F, (float) (arg0.anInt2840 >> 8 & 0xFF) / 255.0F, (float) (arg0.anInt2840 >> 0 & 0xFF) / 255.0F);
			local130.aClass450_5.method29255(arg0.aClass442_80);
			local130.aClass450_5.method29253(1.0F / (arg0.aFloat206 - arg0.aFloat205));
		} else {
			local130.aClass450_5.method29234(0.0F, 0.0F, 0.0F, 0.0F);
			local130.aClass447_16.method29133(0.0F, 0.0F, 0.0F);
		}
		this.method28294(arg0, local39, local99, local33, local75, local130, local146);
		if (arg0.aFloat203 != aFloat263) {
			arg0.method20255(aFloat263);
		}
		arg0.method20230(true);
	}

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "(Lclient!aed;Lclient!ain;IIILclient!jn;Z)V", line = 127)
	void method28294(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Class131_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class106 arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) Class131_Sub2 local2 = arg1.aClass131_Sub2_6;
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = -2;
		@Pc(8) boolean local8 = true;
		@Pc(10) boolean local10 = true;
		while (local2 != arg1) {
			this.anInt4572 = 0;
			@Pc(18) int local18;
			for (local18 = 0; local18 < arg2; local18++) {
				this.anIntArray451[local18] = 0;
			}
			for (local18 = 0; local18 < 64; local18++) {
				this.anIntArray453[local18] = 0;
			}
			while (local2 != arg1) {
				@Pc(46) Class131_Sub2_Sub1 local46 = (Class131_Sub2_Sub1) local2;
				if (local10) {
					local6 = local46.anInt3131;
					local8 = local46.aBoolean506;
					local10 = false;
				}
				if (local4 > 0 && (local6 != local46.anInt3131 || local8 != local46.aBoolean506)) {
					local10 = true;
					break;
				}
				this.method28295(this.anIntArray452[local4++] - arg3 >> arg4, local46);
				local2 = local2.aClass131_Sub2_6;
			}
			arg5.anInterface37_15 = null;
			if (local6 >= 0) {
				@Pc(96) Class215 local96 = arg0.aClass209_9.method25584(local6);
				if (local96.aBoolean638) {
					arg5.anInterface37_15 = arg0.aClass370_3.method28225(local96);
				}
				@Pc(107) byte local107 = 0;
				if (local96.aClass597_2 == Class597.aClass597_3) {
					local107 = local96.aByte115;
				}
				arg0.method20583(local107);
			}
			if (local8 && arg0.aFloat203 != aFloat263) {
				arg0.method20255(aFloat263);
			} else if (arg0.aFloat203 != 1.0F) {
				arg0.method20255(1.0F);
			}
			this.method28298(arg0, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "(ILclient!apl;)V", line = 164)
	void method28295(@OriginalArg(0) int arg0, @OriginalArg(1) Class131_Sub2_Sub1 arg1) {
		if (arg0 >= 1600) {
			return;
		}
		if (this.anIntArray451[arg0] < 64) {
			this.aClass131_Sub2_Sub1ArrayArray4[arg0][this.anIntArray451[arg0]++] = arg1;
			return;
		}
		if (this.anIntArray451[arg0] == 64) {
			if (this.anInt4572 == 64) {
				return;
			}
			this.anIntArray451[arg0] += this.anInt4572++ + 1;
		}
		this.aClass131_Sub2_Sub1ArrayArray3[this.anIntArray451[arg0] - 64 - 1][this.anIntArray453[this.anIntArray451[arg0] - 64 - 1]++] = arg1;
	}

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "(ILclient!apl;)V", line = 164)
	void method28296(@OriginalArg(0) int arg0, @OriginalArg(1) Class131_Sub2_Sub1 arg1) {
		if (arg0 >= 1600) {
			return;
		}
		if (this.anIntArray451[arg0] < 64) {
			this.aClass131_Sub2_Sub1ArrayArray4[arg0][this.anIntArray451[arg0]++] = arg1;
			return;
		}
		if (this.anIntArray451[arg0] == 64) {
			if (this.anInt4572 == 64) {
				return;
			}
			this.anIntArray451[arg0] += this.anInt4572++ + 1;
		}
		this.aClass131_Sub2_Sub1ArrayArray3[this.anIntArray451[arg0] - 64 - 1][this.anIntArray453[this.anIntArray451[arg0] - 64 - 1]++] = arg1;
	}

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "(Lclient!aed;IZ)V", line = 179)
	void method28297(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(4) Class442 local4 = arg0.aClass442_79;
		@Pc(9) float local9 = local4.aFloatArray109[0];
		@Pc(14) float local14 = local4.aFloatArray109[4];
		@Pc(19) float local19 = local4.aFloatArray109[8];
		@Pc(24) float local24 = local4.aFloatArray109[1];
		@Pc(29) float local29 = local4.aFloatArray109[5];
		@Pc(34) float local34 = local4.aFloatArray109[9];
		@Pc(38) float local38 = local9 + local24;
		@Pc(42) float local42 = local14 + local29;
		@Pc(46) float local46 = local19 + local34;
		@Pc(50) float local50 = local9 - local24;
		@Pc(54) float local54 = local14 - local29;
		@Pc(58) float local58 = local19 - local34;
		@Pc(62) float local62 = local24 - local9;
		@Pc(66) float local66 = local29 - local14;
		@Pc(70) float local70 = local34 - local19;
		@Pc(73) float[] local73 = new float[3];
		@Pc(76) float[] local76 = new float[3];
		arg0.aClass442_87.method28956(arg0.aClass442_78);
		@Pc(84) ByteBuffer local84 = arg0.aByteBuffer7;
		local84.clear();
		for (@Pc(91) int local91 = arg1 - 1; local91 >= 0; local91--) {
			@Pc(106) int local106 = this.anIntArray451[local91] > 64 ? 64 : this.anIntArray451[local91];
			if (local106 > 0) {
				@Pc(112) int local112;
				@Pc(134) byte local134;
				@Pc(137) byte local137;
				@Pc(142) byte local142;
				@Pc(147) byte local147;
				@Pc(163) float local163;
				@Pc(169) float local169;
				for (local112 = local106 - 1; local112 >= 0; local112--) {
					@Pc(121) Class131_Sub2_Sub1 local121 = this.aClass131_Sub2_Sub1ArrayArray4[local91][local112];
					@Pc(124) int local124 = local121.anInt3126;
					@Pc(129) byte local129 = (byte) (local124 >> 16);
					local134 = (byte) (local124 >> 8);
					local137 = (byte) local124;
					local142 = (byte) (local124 >>> 24);
					if (arg0.anInt2847 == 0) {
						local147 = local129;
						local129 = local137;
						local137 = local147;
					}
					@Pc(157) float local157 = (float) (local121.anInt3125 >> 12);
					local163 = local121.anInt3128 >> 12;
					local169 = local121.anInt3129 >> 12;
					@Pc(174) int local174 = local121.anInt3130 >> 12;
					if (local121.aShort113 == 0) {
						local84.putFloat(local157 + local38 * (float) -local174);
						local84.putFloat(local163 + local42 * (float) -local174);
						local84.putFloat(local169 + local46 * (float) -local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(0.0F);
						local84.putFloat(local157 + local62 * (float) local174);
						local84.putFloat(local163 + local66 * (float) local174);
						local84.putFloat(local169 + local70 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local38 * (float) local174);
						local84.putFloat(local163 + local42 * (float) local174);
						local84.putFloat(local169 + local46 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local50 * (float) local174);
						local84.putFloat(local163 + local54 * (float) local174);
						local84.putFloat(local169 + local58 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(0.0F);
					} else {
						arg0.aClass442_82.method29058(local121.aShort113, local174, local174, 0.0F, 0.0F, 0.0F);
						arg0.aClass442_82.method28965(arg0.aClass442_87);
						arg0.aClass442_82.method28984(1.0F, 0.0F, 0.0F, local73);
						arg0.aClass442_82.method28984(0.0F, 1.0F, 0.0F, local76);
						local84.putFloat(local157 - local73[0] - local76[0]);
						local84.putFloat(local163 - local73[1] - local76[1]);
						local84.putFloat(local169 - local73[2] - local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(0.0F);
						local84.putFloat(local157 - local73[0] + local76[0]);
						local84.putFloat(local163 - local73[1] + local76[1]);
						local84.putFloat(local169 - local73[2] + local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local73[0] + local76[0]);
						local84.putFloat(local163 + local73[1] + local76[1]);
						local84.putFloat(local169 + local73[2] + local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local73[0] - local76[0]);
						local84.putFloat(local163 + local73[1] - local76[1]);
						local84.putFloat(local169 + local73[2] - local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(0.0F);
					}
					local1++;
				}
				if (this.anIntArray451[local91] > 64) {
					local112 = this.anIntArray451[local91] - 64 - 1;
					for (@Pc(679) int local679 = this.anIntArray453[local112] - 1; local679 >= 0; local679--) {
						@Pc(688) Class131_Sub2_Sub1 local688 = this.aClass131_Sub2_Sub1ArrayArray3[local112][local679];
						@Pc(691) int local691 = local688.anInt3126;
						local134 = (byte) (local691 >> 16);
						local137 = (byte) (local691 >> 8);
						local142 = (byte) local691;
						local147 = (byte) (local691 >>> 24);
						local163 = local688.anInt3125 >> 12;
						local169 = local688.anInt3128 >> 12;
						@Pc(727) float local727 = (float) (local688.anInt3129 >> 12);
						@Pc(732) int local732 = local688.anInt3130 >> 12;
						if (arg0.anInt2847 == 0) {
							@Pc(737) byte local737 = local134;
							local134 = local142;
							local142 = local737;
						}
						if (local688.aShort113 == 0) {
							local84.putFloat(local163 + local38 * (float) -local732);
							local84.putFloat(local169 + local42 * (float) -local732);
							local84.putFloat(local727 + local46 * (float) -local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(0.0F);
							local84.putFloat(local163 + local62 * (float) local732);
							local84.putFloat(local169 + local66 * (float) local732);
							local84.putFloat(local727 + local70 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local38 * (float) local732);
							local84.putFloat(local169 + local42 * (float) local732);
							local84.putFloat(local727 + local46 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local50 * (float) local732);
							local84.putFloat(local169 + local54 * (float) local732);
							local84.putFloat(local727 + local58 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(0.0F);
						} else {
							arg0.aClass442_82.method29058(local688.aShort113, local732, local732, 0.0F, 0.0F, 0.0F);
							arg0.aClass442_82.method28965(arg0.aClass442_87);
							arg0.aClass442_82.method28984(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass442_82.method28984(0.0F, 1.0F, 0.0F, local76);
							local84.putFloat(local163 - local73[0] - local76[0]);
							local84.putFloat(local169 - local73[1] - local76[1]);
							local84.putFloat(local727 - local73[2] - local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(0.0F);
							local84.putFloat(local163 - local73[0] + local76[0]);
							local84.putFloat(local169 - local73[1] + local76[1]);
							local84.putFloat(local727 - local73[2] + local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local73[0] + local76[0]);
							local84.putFloat(local169 + local73[1] + local76[1]);
							local84.putFloat(local727 + local73[2] + local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local73[0] - local76[0]);
							local84.putFloat(local169 + local73[1] - local76[1]);
							local84.putFloat(local727 + local73[2] - local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(0.0F);
						}
						local1++;
					}
				}
			}
		}
		this.anInterface36_19.method28755(0, local84.position(), arg0.aLong121);
		arg0.method20670(0, this.anInterface36_19);
		arg0.method20670(1, this.anInterface36_20);
		arg0.method20658(this.aClass113_24);
		@Pc(1252) Class106 local1252 = arg0.aClass106_3;
		local1252.method8971(local1, arg2);
	}

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "(Lclient!aed;IZ)V", line = 179)
	void method28298(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) int local1 = 0;
		@Pc(4) Class442 local4 = arg0.aClass442_79;
		@Pc(9) float local9 = local4.aFloatArray109[0];
		@Pc(14) float local14 = local4.aFloatArray109[4];
		@Pc(19) float local19 = local4.aFloatArray109[8];
		@Pc(24) float local24 = local4.aFloatArray109[1];
		@Pc(29) float local29 = local4.aFloatArray109[5];
		@Pc(34) float local34 = local4.aFloatArray109[9];
		@Pc(38) float local38 = local9 + local24;
		@Pc(42) float local42 = local14 + local29;
		@Pc(46) float local46 = local19 + local34;
		@Pc(50) float local50 = local9 - local24;
		@Pc(54) float local54 = local14 - local29;
		@Pc(58) float local58 = local19 - local34;
		@Pc(62) float local62 = local24 - local9;
		@Pc(66) float local66 = local29 - local14;
		@Pc(70) float local70 = local34 - local19;
		@Pc(73) float[] local73 = new float[3];
		@Pc(76) float[] local76 = new float[3];
		arg0.aClass442_87.method28956(arg0.aClass442_78);
		@Pc(84) ByteBuffer local84 = arg0.aByteBuffer7;
		local84.clear();
		for (@Pc(91) int local91 = arg1 - 1; local91 >= 0; local91--) {
			@Pc(106) int local106 = this.anIntArray451[local91] > 64 ? 64 : this.anIntArray451[local91];
			if (local106 > 0) {
				@Pc(112) int local112;
				@Pc(134) byte local134;
				@Pc(137) byte local137;
				@Pc(142) byte local142;
				@Pc(147) byte local147;
				@Pc(163) float local163;
				@Pc(169) float local169;
				for (local112 = local106 - 1; local112 >= 0; local112--) {
					@Pc(121) Class131_Sub2_Sub1 local121 = this.aClass131_Sub2_Sub1ArrayArray4[local91][local112];
					@Pc(124) int local124 = local121.anInt3126;
					@Pc(129) byte local129 = (byte) (local124 >> 16);
					local134 = (byte) (local124 >> 8);
					local137 = (byte) local124;
					local142 = (byte) (local124 >>> 24);
					if (arg0.anInt2847 == 0) {
						local147 = local129;
						local129 = local137;
						local137 = local147;
					}
					@Pc(157) float local157 = (float) (local121.anInt3125 >> 12);
					local163 = local121.anInt3128 >> 12;
					local169 = local121.anInt3129 >> 12;
					@Pc(174) int local174 = local121.anInt3130 >> 12;
					if (local121.aShort113 == 0) {
						local84.putFloat(local157 + local38 * (float) -local174);
						local84.putFloat(local163 + local42 * (float) -local174);
						local84.putFloat(local169 + local46 * (float) -local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(0.0F);
						local84.putFloat(local157 + local62 * (float) local174);
						local84.putFloat(local163 + local66 * (float) local174);
						local84.putFloat(local169 + local70 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local38 * (float) local174);
						local84.putFloat(local163 + local42 * (float) local174);
						local84.putFloat(local169 + local46 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local50 * (float) local174);
						local84.putFloat(local163 + local54 * (float) local174);
						local84.putFloat(local169 + local58 * (float) local174);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(0.0F);
					} else {
						arg0.aClass442_82.method29058(local121.aShort113, local174, local174, 0.0F, 0.0F, 0.0F);
						arg0.aClass442_82.method28965(arg0.aClass442_87);
						arg0.aClass442_82.method28984(1.0F, 0.0F, 0.0F, local73);
						arg0.aClass442_82.method28984(0.0F, 1.0F, 0.0F, local76);
						local84.putFloat(local157 - local73[0] - local76[0]);
						local84.putFloat(local163 - local73[1] - local76[1]);
						local84.putFloat(local169 - local73[2] - local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(0.0F);
						local84.putFloat(local157 - local73[0] + local76[0]);
						local84.putFloat(local163 - local73[1] + local76[1]);
						local84.putFloat(local169 - local73[2] + local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(0.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local73[0] + local76[0]);
						local84.putFloat(local163 + local73[1] + local76[1]);
						local84.putFloat(local169 + local73[2] + local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(1.0F);
						local84.putFloat(local157 + local73[0] - local76[0]);
						local84.putFloat(local163 + local73[1] - local76[1]);
						local84.putFloat(local169 + local73[2] - local76[2]);
						local84.put(local129);
						local84.put(local134);
						local84.put(local137);
						local84.put(local142);
						local84.putFloat(1.0F);
						local84.putFloat(0.0F);
					}
					local1++;
				}
				if (this.anIntArray451[local91] > 64) {
					local112 = this.anIntArray451[local91] - 64 - 1;
					for (@Pc(679) int local679 = this.anIntArray453[local112] - 1; local679 >= 0; local679--) {
						@Pc(688) Class131_Sub2_Sub1 local688 = this.aClass131_Sub2_Sub1ArrayArray3[local112][local679];
						@Pc(691) int local691 = local688.anInt3126;
						local134 = (byte) (local691 >> 16);
						local137 = (byte) (local691 >> 8);
						local142 = (byte) local691;
						local147 = (byte) (local691 >>> 24);
						local163 = local688.anInt3125 >> 12;
						local169 = local688.anInt3128 >> 12;
						@Pc(727) float local727 = (float) (local688.anInt3129 >> 12);
						@Pc(732) int local732 = local688.anInt3130 >> 12;
						if (arg0.anInt2847 == 0) {
							@Pc(737) byte local737 = local134;
							local134 = local142;
							local142 = local737;
						}
						if (local688.aShort113 == 0) {
							local84.putFloat(local163 + local38 * (float) -local732);
							local84.putFloat(local169 + local42 * (float) -local732);
							local84.putFloat(local727 + local46 * (float) -local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(0.0F);
							local84.putFloat(local163 + local62 * (float) local732);
							local84.putFloat(local169 + local66 * (float) local732);
							local84.putFloat(local727 + local70 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local38 * (float) local732);
							local84.putFloat(local169 + local42 * (float) local732);
							local84.putFloat(local727 + local46 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local50 * (float) local732);
							local84.putFloat(local169 + local54 * (float) local732);
							local84.putFloat(local727 + local58 * (float) local732);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(0.0F);
						} else {
							arg0.aClass442_82.method29058(local688.aShort113, local732, local732, 0.0F, 0.0F, 0.0F);
							arg0.aClass442_82.method28965(arg0.aClass442_87);
							arg0.aClass442_82.method28984(1.0F, 0.0F, 0.0F, local73);
							arg0.aClass442_82.method28984(0.0F, 1.0F, 0.0F, local76);
							local84.putFloat(local163 - local73[0] - local76[0]);
							local84.putFloat(local169 - local73[1] - local76[1]);
							local84.putFloat(local727 - local73[2] - local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(0.0F);
							local84.putFloat(local163 - local73[0] + local76[0]);
							local84.putFloat(local169 - local73[1] + local76[1]);
							local84.putFloat(local727 - local73[2] + local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(0.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local73[0] + local76[0]);
							local84.putFloat(local169 + local73[1] + local76[1]);
							local84.putFloat(local727 + local73[2] + local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(1.0F);
							local84.putFloat(local163 + local73[0] - local76[0]);
							local84.putFloat(local169 + local73[1] - local76[1]);
							local84.putFloat(local727 + local73[2] - local76[2]);
							local84.put(local134);
							local84.put(local137);
							local84.put(local142);
							local84.put(local147);
							local84.putFloat(1.0F);
							local84.putFloat(0.0F);
						}
						local1++;
					}
				}
			}
		}
		this.anInterface36_19.method28755(0, local84.position(), arg0.aLong121);
		arg0.method20670(0, this.anInterface36_19);
		arg0.method20670(1, this.anInterface36_20);
		arg0.method20658(this.aClass113_24);
		@Pc(1252) Class106 local1252 = arg0.aClass106_3;
		local1252.method8971(local1, arg2);
	}
}
