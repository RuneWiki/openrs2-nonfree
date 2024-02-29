package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

@OriginalClass("client!ln")
public class Class381 {

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "Lclient!kx;")
	Class369 aClass369_5;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "Lclient!kx;")
	Class369 aClass369_4 = Class369.aClass369_1;

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
	int anInt4582 = 128;

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "I")
	int anInt4583 = 0;

	@OriginalMember(owner = "client!ln", name = "w", descriptor = "[F")
	float[] aFloatArray102 = new float[this.anInt4582 * 16];

	@OriginalMember(owner = "client!ln", name = "t", descriptor = "[Lclient!ks;")
	Interface37[] anInterface37Array3 = new Interface37[this.anInt4582];

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "[I")
	int[] anIntArray454 = new int[this.anInt4582];

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "[I")
	int[] anIntArray455 = new int[4];

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "Lclient!aed;")
	final Class86_Sub1 aClass86_Sub1_40;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "Lclient!kp;")
	Interface36 anInterface36_21;

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "Lclient!kt;")
	Class113 aClass113_25;

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "Lclient!lc;")
	Interface38 anInterface38_9;

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "I")
	int anInt4584;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!aed;I)V", line = 26)
	Class381(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass86_Sub1_40 = arg0;
		this.anInterface36_21 = this.aClass86_Sub1_40.method20656(true);
		this.anInterface36_21.method28760(arg1 * 96, 24);
		this.aClass113_25 = this.aClass86_Sub1_40.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_4, Class366.aClass366_2 }) });
		this.anInterface38_9 = this.aClass86_Sub1_40.method20772(false);
		@Pc(85) int local85 = arg1 * 6;
		this.anInterface38_9.method28728(local85);
		@Pc(98) int local98 = local85 * this.anInterface38_9.method28727().anInt3581 * 1899960707;
		@Pc(102) ByteBuffer local102 = this.aClass86_Sub1_40.aByteBuffer7;
		this.aClass86_Sub1_40.method20393(local98);
		local102.clear();
		for (@Pc(111) int local111 = 0; local111 < arg1; local111++) {
			local102.putShort((short) (local111 * 4));
			local102.putShort((short) (local111 * 4 + 2));
			local102.putShort((short) (local111 * 4 + 1));
			local102.putShort((short) (local111 * 4 + 2));
			local102.putShort((short) (local111 * 4 + 3));
			local102.putShort((short) (local111 * 4 + 1));
		}
		this.anInterface38_9.method28755(0, local85 * this.anInterface38_9.method28727().anInt3581 * 1899960707, this.aClass86_Sub1_40.aLong121);
		this.anInt4584 = arg1;
		this.anInt4583 = 0;
	}

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "()V", line = 52)
	void method28312() {
		this.anInterface36_21.method30322();
		this.anInterface38_9.method30322();
		this.anInterface36_21 = null;
		this.anInterface38_9 = null;
		this.aClass113_25 = null;
		this.anInt4583 = 0;
	}

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "()V", line = 52)
	void method28313() {
		this.anInterface36_21.method30322();
		this.anInterface38_9.method30322();
		this.anInterface36_21 = null;
		this.anInterface38_9 = null;
		this.aClass113_25 = null;
		this.anInt4583 = 0;
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "()V", line = 61)
	void method28314() {
		if (this.anInt4583 == 0) {
			return;
		}
		this.aClass86_Sub1_40.method20597();
		this.aClass86_Sub1_40.method20579(1);
		this.aClass86_Sub1_40.method20659(this.anInterface38_9);
		this.aClass86_Sub1_40.method20670(0, this.anInterface36_21);
		this.aClass86_Sub1_40.method20658(this.aClass113_25);
		@Pc(30) Class99 local30 = this.aClass86_Sub1_40.aClass99_3;
		@Pc(34) Unsafe local34 = this.aClass86_Sub1_40.anUnsafe4;
		@Pc(38) ByteBuffer local38 = this.aClass86_Sub1_40.aByteBuffer7;
		local38.clear();
		this.aClass86_Sub1_40.method20564().method28954(Class442.aClass442_97);
		this.aClass86_Sub1_40.method20566(Class377.aClass377_1);
		@Pc(61) int local61 = (this.anInt4583 + this.anInt4584 - 1) / this.anInt4584;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
			@Pc(78) int local78 = Math.min(this.anInt4584, this.anInt4583 - local63);
			@Pc(86) long local86 = this.anInterface36_21.method28745(0, local78 * 96);
			@Pc(93) int local93 = local67 * this.anInt4584 + local78;
			@Pc(100) int local100;
			for (@Pc(95) int local95 = local63; local95 < local93; local95++) {
				for (local100 = 0; local100 < 4; local100++) {
					local34.putFloat(local86, this.aFloatArray102[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray102[local65++]);
					local86 += 4L;
					local34.putFloat(local86, 0.0F);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray102[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray102[local65++]);
					local86 += 4L;
					local34.putInt(local86, this.anIntArray454[local95]);
					local86 += 4L;
				}
			}
			this.anInterface36_21.method28746();
			@Pc(182) Interface37 local182 = this.anInterface37Array3[local63];
			local100 = 1;
			@Pc(186) int local186 = 0;
			for (@Pc(190) int local190 = local63 + 1; local190 < local93; local190++) {
				if (local182 == this.anInterface37Array3[local190]) {
					local100++;
				} else {
					local30.anInterface37_12 = local182;
					local30.method8409();
					this.aClass86_Sub1_40.method20662(this.anInterface38_9, Class384.aClass384_4, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
					local182 = this.anInterface37Array3[local190];
					local100 = 1;
					local186 = local190 - local63;
				}
			}
			local30.anInterface37_12 = local182;
			local30.method8409();
			this.aClass86_Sub1_40.method20662(this.anInterface38_9, Class384.aClass384_4, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
			local63 += this.anInt4584;
		}
		this.anInt4583 = 0;
	}

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "()V", line = 61)
	void method28315() {
		if (this.anInt4583 == 0) {
			return;
		}
		this.aClass86_Sub1_40.method20597();
		this.aClass86_Sub1_40.method20579(1);
		this.aClass86_Sub1_40.method20659(this.anInterface38_9);
		this.aClass86_Sub1_40.method20670(0, this.anInterface36_21);
		this.aClass86_Sub1_40.method20658(this.aClass113_25);
		@Pc(30) Class99 local30 = this.aClass86_Sub1_40.aClass99_3;
		@Pc(34) Unsafe local34 = this.aClass86_Sub1_40.anUnsafe4;
		@Pc(38) ByteBuffer local38 = this.aClass86_Sub1_40.aByteBuffer7;
		local38.clear();
		this.aClass86_Sub1_40.method20564().method28954(Class442.aClass442_97);
		this.aClass86_Sub1_40.method20566(Class377.aClass377_1);
		@Pc(61) int local61 = (this.anInt4583 + this.anInt4584 - 1) / this.anInt4584;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
			@Pc(78) int local78 = Math.min(this.anInt4584, this.anInt4583 - local63);
			@Pc(86) long local86 = this.anInterface36_21.method28745(0, local78 * 96);
			@Pc(93) int local93 = local67 * this.anInt4584 + local78;
			@Pc(100) int local100;
			for (@Pc(95) int local95 = local63; local95 < local93; local95++) {
				for (local100 = 0; local100 < 4; local100++) {
					local34.putFloat(local86, this.aFloatArray102[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray102[local65++]);
					local86 += 4L;
					local34.putFloat(local86, 0.0F);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray102[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray102[local65++]);
					local86 += 4L;
					local34.putInt(local86, this.anIntArray454[local95]);
					local86 += 4L;
				}
			}
			this.anInterface36_21.method28746();
			@Pc(182) Interface37 local182 = this.anInterface37Array3[local63];
			local100 = 1;
			@Pc(186) int local186 = 0;
			for (@Pc(190) int local190 = local63 + 1; local190 < local93; local190++) {
				if (local182 == this.anInterface37Array3[local190]) {
					local100++;
				} else {
					local30.anInterface37_12 = local182;
					local30.method8409();
					this.aClass86_Sub1_40.method20662(this.anInterface38_9, Class384.aClass384_4, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
					local182 = this.anInterface37Array3[local190];
					local100 = 1;
					local186 = local190 - local63;
				}
			}
			local30.anInterface37_12 = local182;
			local30.method8409();
			this.aClass86_Sub1_40.method20662(this.anInterface38_9, Class384.aClass384_4, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
			local63 += this.anInt4584;
		}
		this.anInt4583 = 0;
	}

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "()V", line = 61)
	void method28316() {
		if (this.anInt4583 == 0) {
			return;
		}
		this.aClass86_Sub1_40.method20597();
		this.aClass86_Sub1_40.method20579(1);
		this.aClass86_Sub1_40.method20659(this.anInterface38_9);
		this.aClass86_Sub1_40.method20670(0, this.anInterface36_21);
		this.aClass86_Sub1_40.method20658(this.aClass113_25);
		@Pc(30) Class99 local30 = this.aClass86_Sub1_40.aClass99_3;
		@Pc(34) Unsafe local34 = this.aClass86_Sub1_40.anUnsafe4;
		@Pc(38) ByteBuffer local38 = this.aClass86_Sub1_40.aByteBuffer7;
		local38.clear();
		this.aClass86_Sub1_40.method20564().method28954(Class442.aClass442_97);
		this.aClass86_Sub1_40.method20566(Class377.aClass377_1);
		@Pc(61) int local61 = (this.anInt4583 + this.anInt4584 - 1) / this.anInt4584;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
			@Pc(78) int local78 = Math.min(this.anInt4584, this.anInt4583 - local63);
			@Pc(86) long local86 = this.anInterface36_21.method28745(0, local78 * 96);
			@Pc(93) int local93 = local67 * this.anInt4584 + local78;
			@Pc(100) int local100;
			for (@Pc(95) int local95 = local63; local95 < local93; local95++) {
				for (local100 = 0; local100 < 4; local100++) {
					local34.putFloat(local86, this.aFloatArray102[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray102[local65++]);
					local86 += 4L;
					local34.putFloat(local86, 0.0F);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray102[local65++]);
					local86 += 4L;
					local34.putFloat(local86, this.aFloatArray102[local65++]);
					local86 += 4L;
					local34.putInt(local86, this.anIntArray454[local95]);
					local86 += 4L;
				}
			}
			this.anInterface36_21.method28746();
			@Pc(182) Interface37 local182 = this.anInterface37Array3[local63];
			local100 = 1;
			@Pc(186) int local186 = 0;
			for (@Pc(190) int local190 = local63 + 1; local190 < local93; local190++) {
				if (local182 == this.anInterface37Array3[local190]) {
					local100++;
				} else {
					local30.anInterface37_12 = local182;
					local30.method8409();
					this.aClass86_Sub1_40.method20662(this.anInterface38_9, Class384.aClass384_4, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
					local182 = this.anInterface37Array3[local190];
					local100 = 1;
					local186 = local190 - local63;
				}
			}
			local30.anInterface37_12 = local182;
			local30.method8409();
			this.aClass86_Sub1_40.method20662(this.anInterface38_9, Class384.aClass384_4, local186 * 4, local100 * 4, local186 * 6, local100 * 2);
			local63 += this.anInt4584;
		}
		this.anInt4583 = 0;
	}

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "(FFFFFFFFLclient!ks;I)V", line = 122)
	void method28317(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Interface37 arg8, @OriginalArg(9) int arg9) {
		if ((arg9 & 0xFF000000) == 0) {
			return;
		}
		this.aClass86_Sub1_40.method20142(this.anIntArray455);
		@Pc(14) int local14 = this.anIntArray455[0];
		@Pc(19) int local19 = this.anIntArray455[1];
		@Pc(24) int local24 = this.anIntArray455[2];
		@Pc(29) int local29 = this.anIntArray455[3];
		if (arg0 > (float) local24 || (arg1 > (float) local29 || (arg2 < (float) local14 || arg3 < (float) local19))) {
			return;
		}
		@Pc(57) float local57 = arg2 - arg0;
		@Pc(61) float local61 = arg3 - arg1;
		@Pc(65) float local65 = arg6 - arg4;
		@Pc(69) float local69 = arg7 - arg5;
		if (arg0 < (float) local14) {
			arg4 += ((float) local14 - arg0) / local57 * local65;
			arg0 = local14;
		}
		if (arg1 < (float) local19) {
			arg5 += ((float) local19 - arg1) / local61 * local69;
			arg1 = local19;
		}
		if (arg2 > (float) local24) {
			arg6 -= (arg2 - (float) local24) / local57 * local65;
			arg2 = local24;
		}
		if (arg3 > (float) local29) {
			arg7 -= (arg3 - (float) local29) / local61 * local69;
			arg3 = local29;
		}
		this.method28323();
		arg0 = this.method28325(arg0);
		arg1 = this.method28328(arg1);
		arg2 = this.method28325(arg2);
		arg3 = this.method28328(arg3);
		this.aFloatArray102[this.anInt4583 * 16] = arg0;
		this.aFloatArray102[this.anInt4583 * 16 + 1] = arg1;
		this.aFloatArray102[this.anInt4583 * 16 + 2] = arg4;
		this.aFloatArray102[this.anInt4583 * 16 + 3] = arg5;
		this.aFloatArray102[this.anInt4583 * 16 + 4] = arg2;
		this.aFloatArray102[this.anInt4583 * 16 + 5] = arg1;
		this.aFloatArray102[this.anInt4583 * 16 + 6] = arg6;
		this.aFloatArray102[this.anInt4583 * 16 + 7] = arg5;
		this.aFloatArray102[this.anInt4583 * 16 + 8] = arg0;
		this.aFloatArray102[this.anInt4583 * 16 + 9] = arg3;
		this.aFloatArray102[this.anInt4583 * 16 + 10] = arg4;
		this.aFloatArray102[this.anInt4583 * 16 + 11] = arg7;
		this.aFloatArray102[this.anInt4583 * 16 + 12] = arg2;
		this.aFloatArray102[this.anInt4583 * 16 + 13] = arg3;
		this.aFloatArray102[this.anInt4583 * 16 + 14] = arg6;
		this.aFloatArray102[this.anInt4583 * 16 + 15] = arg7;
		this.anInterface37Array3[this.anInt4583] = arg8;
		if (this.aClass86_Sub1_40.anInt2847 == 1) {
			this.anIntArray454[this.anInt4583] = arg9 & 0xFF00FF00 | (arg9 & 0xFF) << 16 | arg9 >> 16 & 0xFF;
		} else {
			this.anIntArray454[this.anInt4583] = arg9;
		}
		this.anInt4583++;
		if (this.aClass369_4 == Class369.aClass369_3) {
			this.method28314();
		}
	}

	@OriginalMember(owner = "client!ln", name = "z", descriptor = "(FFFFFFFFLclient!ks;I)V", line = 122)
	void method28318(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Interface37 arg8, @OriginalArg(9) int arg9) {
		if ((arg9 & 0xFF000000) == 0) {
			return;
		}
		this.aClass86_Sub1_40.method20142(this.anIntArray455);
		@Pc(14) int local14 = this.anIntArray455[0];
		@Pc(19) int local19 = this.anIntArray455[1];
		@Pc(24) int local24 = this.anIntArray455[2];
		@Pc(29) int local29 = this.anIntArray455[3];
		if (arg0 > (float) local24 || (arg1 > (float) local29 || (arg2 < (float) local14 || arg3 < (float) local19))) {
			return;
		}
		@Pc(57) float local57 = arg2 - arg0;
		@Pc(61) float local61 = arg3 - arg1;
		@Pc(65) float local65 = arg6 - arg4;
		@Pc(69) float local69 = arg7 - arg5;
		if (arg0 < (float) local14) {
			arg4 += ((float) local14 - arg0) / local57 * local65;
			arg0 = local14;
		}
		if (arg1 < (float) local19) {
			arg5 += ((float) local19 - arg1) / local61 * local69;
			arg1 = local19;
		}
		if (arg2 > (float) local24) {
			arg6 -= (arg2 - (float) local24) / local57 * local65;
			arg2 = local24;
		}
		if (arg3 > (float) local29) {
			arg7 -= (arg3 - (float) local29) / local61 * local69;
			arg3 = local29;
		}
		this.method28323();
		arg0 = this.method28325(arg0);
		arg1 = this.method28328(arg1);
		arg2 = this.method28325(arg2);
		arg3 = this.method28328(arg3);
		this.aFloatArray102[this.anInt4583 * 16] = arg0;
		this.aFloatArray102[this.anInt4583 * 16 + 1] = arg1;
		this.aFloatArray102[this.anInt4583 * 16 + 2] = arg4;
		this.aFloatArray102[this.anInt4583 * 16 + 3] = arg5;
		this.aFloatArray102[this.anInt4583 * 16 + 4] = arg2;
		this.aFloatArray102[this.anInt4583 * 16 + 5] = arg1;
		this.aFloatArray102[this.anInt4583 * 16 + 6] = arg6;
		this.aFloatArray102[this.anInt4583 * 16 + 7] = arg5;
		this.aFloatArray102[this.anInt4583 * 16 + 8] = arg0;
		this.aFloatArray102[this.anInt4583 * 16 + 9] = arg3;
		this.aFloatArray102[this.anInt4583 * 16 + 10] = arg4;
		this.aFloatArray102[this.anInt4583 * 16 + 11] = arg7;
		this.aFloatArray102[this.anInt4583 * 16 + 12] = arg2;
		this.aFloatArray102[this.anInt4583 * 16 + 13] = arg3;
		this.aFloatArray102[this.anInt4583 * 16 + 14] = arg6;
		this.aFloatArray102[this.anInt4583 * 16 + 15] = arg7;
		this.anInterface37Array3[this.anInt4583] = arg8;
		if (this.aClass86_Sub1_40.anInt2847 == 1) {
			this.anIntArray454[this.anInt4583] = arg9 & 0xFF00FF00 | (arg9 & 0xFF) << 16 | arg9 >> 16 & 0xFF;
		} else {
			this.anIntArray454[this.anInt4583] = arg9;
		}
		this.anInt4583++;
		if (this.aClass369_4 == Class369.aClass369_3) {
			this.method28314();
		}
	}

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "(FFFFFFFFFFFFFFFFLclient!ks;I)V", line = 183)
	void method28319(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) Interface37 arg16, @OriginalArg(17) int arg17) {
		if ((arg17 & 0xFF000000) == 0) {
			return;
		}
		this.aClass86_Sub1_40.method20142(this.anIntArray455);
		@Pc(14) int local14 = this.anIntArray455[0];
		@Pc(19) int local19 = this.anIntArray455[1];
		@Pc(24) int local24 = this.anIntArray455[2];
		@Pc(29) int local29 = this.anIntArray455[3];
		@Pc(31) byte local31 = 0;
		@Pc(67) int local67 = (arg0 < (float) local14 ? 1 : 0) + (arg2 < (float) local14 ? 1 : 0) + (arg4 < (float) local14 ? 1 : 0) + (arg6 < (float) local14 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		@Pc(75) int local75 = local31 | local67;
		local67 = (arg0 > (float) local24 ? 1 : 0) + (arg2 > (float) local24 ? 1 : 0) + (arg4 > (float) local24 ? 1 : 0) + (arg6 > (float) local24 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 < (float) local19 ? 1 : 0) + (arg3 < (float) local19 ? 1 : 0) + (arg5 < (float) local19 ? 1 : 0) + (arg7 < (float) local19 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 > (float) local29 ? 1 : 0) + (arg3 > (float) local29 ? 1 : 0) + (arg5 > (float) local29 ? 1 : 0) + (arg7 > (float) local29 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		if (local75 != 0) {
			this.method28314();
			this.aClass86_Sub1_40.method19979(true);
			this.aClass86_Sub1_40.method20151(local14, local19, local24, local29);
		}
		this.method28323();
		@Pc(228) float local228 = this.method28325(arg0);
		@Pc(232) float local232 = this.method28328(arg1);
		@Pc(236) float local236 = this.method28325(arg2);
		@Pc(240) float local240 = this.method28328(arg3);
		@Pc(244) float local244 = this.method28325(arg4);
		@Pc(248) float local248 = this.method28328(arg5);
		@Pc(252) float local252 = this.method28325(arg6);
		@Pc(256) float local256 = this.method28328(arg7);
		this.aFloatArray102[this.anInt4583 * 16] = local228;
		this.aFloatArray102[this.anInt4583 * 16 + 1] = local232;
		this.aFloatArray102[this.anInt4583 * 16 + 2] = arg8;
		this.aFloatArray102[this.anInt4583 * 16 + 3] = arg9;
		this.aFloatArray102[this.anInt4583 * 16 + 4] = local236;
		this.aFloatArray102[this.anInt4583 * 16 + 5] = local240;
		this.aFloatArray102[this.anInt4583 * 16 + 6] = arg10;
		this.aFloatArray102[this.anInt4583 * 16 + 7] = arg11;
		this.aFloatArray102[this.anInt4583 * 16 + 8] = local244;
		this.aFloatArray102[this.anInt4583 * 16 + 9] = local248;
		this.aFloatArray102[this.anInt4583 * 16 + 10] = arg12;
		this.aFloatArray102[this.anInt4583 * 16 + 11] = arg13;
		this.aFloatArray102[this.anInt4583 * 16 + 12] = local252;
		this.aFloatArray102[this.anInt4583 * 16 + 13] = local256;
		this.aFloatArray102[this.anInt4583 * 16 + 14] = arg14;
		this.aFloatArray102[this.anInt4583 * 16 + 15] = arg15;
		this.anInterface37Array3[this.anInt4583] = arg16;
		if (this.aClass86_Sub1_40.anInt2847 == 1) {
			this.anIntArray454[this.anInt4583] = arg17 & 0xFF00FF00 | (arg17 & 0xFF) << 16 | arg17 >> 16 & 0xFF;
		} else {
			this.anIntArray454[this.anInt4583] = arg17;
		}
		this.anInt4583++;
		if (this.aClass369_4 == Class369.aClass369_3 || local75 > 0) {
			this.method28314();
		}
		if (local75 != 0) {
			this.aClass86_Sub1_40.method19979(false);
			this.aClass86_Sub1_40.method20299();
			this.aClass86_Sub1_40.method20151(local14, local19, local24, local29);
		}
	}

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "(FFFFFFFFFFFFFFFFLclient!ks;I)V", line = 183)
	void method28320(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) Interface37 arg16, @OriginalArg(17) int arg17) {
		if ((arg17 & 0xFF000000) == 0) {
			return;
		}
		this.aClass86_Sub1_40.method20142(this.anIntArray455);
		@Pc(14) int local14 = this.anIntArray455[0];
		@Pc(19) int local19 = this.anIntArray455[1];
		@Pc(24) int local24 = this.anIntArray455[2];
		@Pc(29) int local29 = this.anIntArray455[3];
		@Pc(31) byte local31 = 0;
		@Pc(67) int local67 = (arg0 < (float) local14 ? 1 : 0) + (arg2 < (float) local14 ? 1 : 0) + (arg4 < (float) local14 ? 1 : 0) + (arg6 < (float) local14 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		@Pc(75) int local75 = local31 | local67;
		local67 = (arg0 > (float) local24 ? 1 : 0) + (arg2 > (float) local24 ? 1 : 0) + (arg4 > (float) local24 ? 1 : 0) + (arg6 > (float) local24 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 < (float) local19 ? 1 : 0) + (arg3 < (float) local19 ? 1 : 0) + (arg5 < (float) local19 ? 1 : 0) + (arg7 < (float) local19 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 > (float) local29 ? 1 : 0) + (arg3 > (float) local29 ? 1 : 0) + (arg5 > (float) local29 ? 1 : 0) + (arg7 > (float) local29 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		if (local75 != 0) {
			this.method28314();
			this.aClass86_Sub1_40.method19979(true);
			this.aClass86_Sub1_40.method20151(local14, local19, local24, local29);
		}
		this.method28323();
		@Pc(228) float local228 = this.method28325(arg0);
		@Pc(232) float local232 = this.method28328(arg1);
		@Pc(236) float local236 = this.method28325(arg2);
		@Pc(240) float local240 = this.method28328(arg3);
		@Pc(244) float local244 = this.method28325(arg4);
		@Pc(248) float local248 = this.method28328(arg5);
		@Pc(252) float local252 = this.method28325(arg6);
		@Pc(256) float local256 = this.method28328(arg7);
		this.aFloatArray102[this.anInt4583 * 16] = local228;
		this.aFloatArray102[this.anInt4583 * 16 + 1] = local232;
		this.aFloatArray102[this.anInt4583 * 16 + 2] = arg8;
		this.aFloatArray102[this.anInt4583 * 16 + 3] = arg9;
		this.aFloatArray102[this.anInt4583 * 16 + 4] = local236;
		this.aFloatArray102[this.anInt4583 * 16 + 5] = local240;
		this.aFloatArray102[this.anInt4583 * 16 + 6] = arg10;
		this.aFloatArray102[this.anInt4583 * 16 + 7] = arg11;
		this.aFloatArray102[this.anInt4583 * 16 + 8] = local244;
		this.aFloatArray102[this.anInt4583 * 16 + 9] = local248;
		this.aFloatArray102[this.anInt4583 * 16 + 10] = arg12;
		this.aFloatArray102[this.anInt4583 * 16 + 11] = arg13;
		this.aFloatArray102[this.anInt4583 * 16 + 12] = local252;
		this.aFloatArray102[this.anInt4583 * 16 + 13] = local256;
		this.aFloatArray102[this.anInt4583 * 16 + 14] = arg14;
		this.aFloatArray102[this.anInt4583 * 16 + 15] = arg15;
		this.anInterface37Array3[this.anInt4583] = arg16;
		if (this.aClass86_Sub1_40.anInt2847 == 1) {
			this.anIntArray454[this.anInt4583] = arg17 & 0xFF00FF00 | (arg17 & 0xFF) << 16 | arg17 >> 16 & 0xFF;
		} else {
			this.anIntArray454[this.anInt4583] = arg17;
		}
		this.anInt4583++;
		if (this.aClass369_4 == Class369.aClass369_3 || local75 > 0) {
			this.method28314();
		}
		if (local75 != 0) {
			this.aClass86_Sub1_40.method19979(false);
			this.aClass86_Sub1_40.method20299();
			this.aClass86_Sub1_40.method20151(local14, local19, local24, local29);
		}
	}

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "(FFFFFFFFFFFFFFFFLclient!ks;I)V", line = 183)
	void method28321(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) Interface37 arg16, @OriginalArg(17) int arg17) {
		if ((arg17 & 0xFF000000) == 0) {
			return;
		}
		this.aClass86_Sub1_40.method20142(this.anIntArray455);
		@Pc(14) int local14 = this.anIntArray455[0];
		@Pc(19) int local19 = this.anIntArray455[1];
		@Pc(24) int local24 = this.anIntArray455[2];
		@Pc(29) int local29 = this.anIntArray455[3];
		@Pc(31) byte local31 = 0;
		@Pc(67) int local67 = (arg0 < (float) local14 ? 1 : 0) + (arg2 < (float) local14 ? 1 : 0) + (arg4 < (float) local14 ? 1 : 0) + (arg6 < (float) local14 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		@Pc(75) int local75 = local31 | local67;
		local67 = (arg0 > (float) local24 ? 1 : 0) + (arg2 > (float) local24 ? 1 : 0) + (arg4 > (float) local24 ? 1 : 0) + (arg6 > (float) local24 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 < (float) local19 ? 1 : 0) + (arg3 < (float) local19 ? 1 : 0) + (arg5 < (float) local19 ? 1 : 0) + (arg7 < (float) local19 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		local67 = (arg1 > (float) local29 ? 1 : 0) + (arg3 > (float) local29 ? 1 : 0) + (arg5 > (float) local29 ? 1 : 0) + (arg7 > (float) local29 ? 1 : 0);
		if (local67 == 4) {
			return;
		}
		local75 |= local67;
		if (local75 != 0) {
			this.method28314();
			this.aClass86_Sub1_40.method19979(true);
			this.aClass86_Sub1_40.method20151(local14, local19, local24, local29);
		}
		this.method28323();
		@Pc(228) float local228 = this.method28325(arg0);
		@Pc(232) float local232 = this.method28328(arg1);
		@Pc(236) float local236 = this.method28325(arg2);
		@Pc(240) float local240 = this.method28328(arg3);
		@Pc(244) float local244 = this.method28325(arg4);
		@Pc(248) float local248 = this.method28328(arg5);
		@Pc(252) float local252 = this.method28325(arg6);
		@Pc(256) float local256 = this.method28328(arg7);
		this.aFloatArray102[this.anInt4583 * 16] = local228;
		this.aFloatArray102[this.anInt4583 * 16 + 1] = local232;
		this.aFloatArray102[this.anInt4583 * 16 + 2] = arg8;
		this.aFloatArray102[this.anInt4583 * 16 + 3] = arg9;
		this.aFloatArray102[this.anInt4583 * 16 + 4] = local236;
		this.aFloatArray102[this.anInt4583 * 16 + 5] = local240;
		this.aFloatArray102[this.anInt4583 * 16 + 6] = arg10;
		this.aFloatArray102[this.anInt4583 * 16 + 7] = arg11;
		this.aFloatArray102[this.anInt4583 * 16 + 8] = local244;
		this.aFloatArray102[this.anInt4583 * 16 + 9] = local248;
		this.aFloatArray102[this.anInt4583 * 16 + 10] = arg12;
		this.aFloatArray102[this.anInt4583 * 16 + 11] = arg13;
		this.aFloatArray102[this.anInt4583 * 16 + 12] = local252;
		this.aFloatArray102[this.anInt4583 * 16 + 13] = local256;
		this.aFloatArray102[this.anInt4583 * 16 + 14] = arg14;
		this.aFloatArray102[this.anInt4583 * 16 + 15] = arg15;
		this.anInterface37Array3[this.anInt4583] = arg16;
		if (this.aClass86_Sub1_40.anInt2847 == 1) {
			this.anIntArray454[this.anInt4583] = arg17 & 0xFF00FF00 | (arg17 & 0xFF) << 16 | arg17 >> 16 & 0xFF;
		} else {
			this.anIntArray454[this.anInt4583] = arg17;
		}
		this.anInt4583++;
		if (this.aClass369_4 == Class369.aClass369_3 || local75 > 0) {
			this.method28314();
		}
		if (local75 != 0) {
			this.aClass86_Sub1_40.method19979(false);
			this.aClass86_Sub1_40.method20299();
			this.aClass86_Sub1_40.method20151(local14, local19, local24, local29);
		}
	}

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "()V", line = 248)
	void method28322() {
		if (this.anInt4583 != this.anInt4582) {
			return;
		}
		this.anInt4582 *= 2;
		@Pc(16) float[] local16 = new float[this.anInt4582 * 16];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4583 * 16; local18++) {
			local16[local18] = this.aFloatArray102[local18];
		}
		this.aFloatArray102 = local16;
		@Pc(40) Interface37[] local40 = new Interface37[this.anInt4582];
		@Pc(44) int[] local44 = new int[this.anInt4582];
		for (@Pc(46) int local46 = 0; local46 < this.anInt4583; local46++) {
			local40[local46] = this.anInterface37Array3[local46];
			local44[local46] = this.anIntArray454[local46];
		}
		this.anInterface37Array3 = local40;
		this.anIntArray454 = local44;
	}

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "()V", line = 248)
	void method28323() {
		if (this.anInt4583 != this.anInt4582) {
			return;
		}
		this.anInt4582 *= 2;
		@Pc(16) float[] local16 = new float[this.anInt4582 * 16];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4583 * 16; local18++) {
			local16[local18] = this.aFloatArray102[local18];
		}
		this.aFloatArray102 = local16;
		@Pc(40) Interface37[] local40 = new Interface37[this.anInt4582];
		@Pc(44) int[] local44 = new int[this.anInt4582];
		for (@Pc(46) int local46 = 0; local46 < this.anInt4583; local46++) {
			local40[local46] = this.anInterface37Array3[local46];
			local44[local46] = this.anIntArray454[local46];
		}
		this.anInterface37Array3 = local40;
		this.anIntArray454 = local44;
	}

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "()V", line = 248)
	void method28324() {
		if (this.anInt4583 != this.anInt4582) {
			return;
		}
		this.anInt4582 *= 2;
		@Pc(16) float[] local16 = new float[this.anInt4582 * 16];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4583 * 16; local18++) {
			local16[local18] = this.aFloatArray102[local18];
		}
		this.aFloatArray102 = local16;
		@Pc(40) Interface37[] local40 = new Interface37[this.anInt4582];
		@Pc(44) int[] local44 = new int[this.anInt4582];
		for (@Pc(46) int local46 = 0; local46 < this.anInt4583; local46++) {
			local40[local46] = this.anInterface37Array3[local46];
			local44[local46] = this.anIntArray454[local46];
		}
		this.anInterface37Array3 = local40;
		this.anIntArray454 = local44;
	}

	@OriginalMember(owner = "client!ln", name = "w", descriptor = "(F)F", line = 267)
	float method28325(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass86_Sub1_40.method19940().method23491();
		return (arg0 + this.aClass86_Sub1_40.method20664()) / (float) local5 * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(F)F", line = 267)
	float method28326(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass86_Sub1_40.method19940().method23491();
		return (arg0 + this.aClass86_Sub1_40.method20664()) / (float) local5 * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "(F)F", line = 267)
	float method28327(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass86_Sub1_40.method19940().method23491();
		return (arg0 + this.aClass86_Sub1_40.method20664()) / (float) local5 * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!ln", name = "t", descriptor = "(F)F", line = 273)
	float method28328(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass86_Sub1_40.method19940().method23493();
		return (1.0F - (arg0 + this.aClass86_Sub1_40.method20664()) / (float) local5) * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(F)F", line = 273)
	float method28329(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass86_Sub1_40.method19940().method23493();
		return (1.0F - (arg0 + this.aClass86_Sub1_40.method20664()) / (float) local5) * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "(F)F", line = 273)
	float method28330(@OriginalArg(0) float arg0) {
		@Pc(5) int local5 = this.aClass86_Sub1_40.method19940().method23493();
		return (1.0F - (arg0 + this.aClass86_Sub1_40.method20664()) / (float) local5) * 2.0F - 1.0F;
	}

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "()V", line = 279)
	void method28331() {
		this.aClass369_5 = this.aClass369_4;
		this.aClass369_4 = Class369.aClass369_2;
	}

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "()V", line = 279)
	void method28332() {
		this.aClass369_5 = this.aClass369_4;
		this.aClass369_4 = Class369.aClass369_2;
	}

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "()V", line = 284)
	void method28333() {
		if (this.aClass369_5 != null) {
			this.aClass369_4 = this.aClass369_5;
			this.aClass369_5 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "aj", descriptor = "()V", line = 284)
	void method28334() {
		if (this.aClass369_5 != null) {
			this.aClass369_4 = this.aClass369_5;
			this.aClass369_5 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "()V", line = 284)
	void method28335() {
		if (this.aClass369_5 != null) {
			this.aClass369_4 = this.aClass369_5;
			this.aClass369_5 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "()V", line = 284)
	void method28336() {
		if (this.aClass369_5 != null) {
			this.aClass369_4 = this.aClass369_5;
			this.aClass369_5 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "()V", line = 284)
	void method28337() {
		if (this.aClass369_5 != null) {
			this.aClass369_4 = this.aClass369_5;
			this.aClass369_5 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "ai", descriptor = "()V", line = 284)
	void method28338() {
		if (this.aClass369_5 != null) {
			this.aClass369_4 = this.aClass369_5;
			this.aClass369_5 = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "()Lclient!kx;", line = 291)
	Class369 method28339() {
		return this.aClass369_4;
	}

	@OriginalMember(owner = "client!ln", name = "ag", descriptor = "()Lclient!kx;", line = 291)
	Class369 method28340() {
		return this.aClass369_4;
	}

	@OriginalMember(owner = "client!ln", name = "al", descriptor = "()Lclient!kx;", line = 291)
	Class369 method28341() {
		return this.aClass369_4;
	}
}
