package com.jagex;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amz")
public class Class3_Sub18_Sub4 extends Class3_Sub18 {

	@OriginalMember(owner = "client!amz", name = "u", descriptor = "Lclient!jagtheora/vorbis/DSPState;")
	DSPState aDSPState1;

	@OriginalMember(owner = "client!amz", name = "z", descriptor = "D")
	double aDouble3;

	@OriginalMember(owner = "client!amz", name = "y", descriptor = "Lclient!jagtheora/vorbis/VorbisBlock;")
	VorbisBlock aVorbisBlock1;

	@OriginalMember(owner = "client!amz", name = "c", descriptor = "Lclient!amg;")
	Class3_Sub35_Sub1 aClass3_Sub35_Sub1_1;

	@OriginalMember(owner = "client!amz", name = "b", descriptor = "Lclient!pa;")
	Class383 aClass383_1;

	@OriginalMember(owner = "client!amz", name = "j", descriptor = "I")
	int anInt2709;

	@OriginalMember(owner = "client!amz", name = "x", descriptor = "Lclient!jagtheora/vorbis/VorbisInfo;")
	final VorbisInfo aVorbisInfo1 = new VorbisInfo();

	@OriginalMember(owner = "client!amz", name = "s", descriptor = "Lclient!jagtheora/vorbis/VorbisComment;")
	final VorbisComment aVorbisComment1 = new VorbisComment();

	@OriginalMember(owner = "client!amz", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V", line = 20)
	Class3_Sub18_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amz", name = "y", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)V", line = 26)
	@Override
	void method19496(@OriginalArg(0) OggPacket arg0) {
		if (this.anInt2708 * -1552515449 < 3) {
			@Pc(12) int local12 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local12 < 0) {
				throw new IllegalStateException("" + local12);
			}
			if (this.anInt2708 * -1552515449 == 2) {
				if (this.aVorbisInfo1.anInt4180 > 2 || this.aVorbisInfo1.anInt4180 < 1) {
					throw new RuntimeException("" + this.aVorbisInfo1.anInt4180);
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass383_1 = new Class383(this.aVorbisInfo1.anInt4181, Class388.anInt4752);
				this.aClass3_Sub35_Sub1_1 = new Class3_Sub35_Sub1(this.aVorbisInfo1.anInt4180);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(105) float[][] local105 = this.aDSPState1.pcmOut(this.aVorbisInfo1.anInt4180);
		this.aDouble3 = this.aDSPState1.granuleTime();
		if (-1.0D == this.aDouble3) {
			this.aDouble3 = (float) (this.anInt2709 * 602395215) / (float) this.aVorbisInfo1.anInt4181;
		}
		this.aDSPState1.read(local105[0].length);
		this.anInt2709 += local105[0].length * -1117649745;
		@Pc(156) Class3_Sub39 local156 = this.aClass3_Sub35_Sub1_1.method18844(local105[0].length, this.aDouble3);
		Class405.method27654(local105, local156.aShortArrayArray3);
		for (@Pc(164) int local164 = 0; local164 < this.aVorbisInfo1.anInt4180; local164++) {
			local156.aShortArrayArray3[local164] = this.aClass383_1.method27324(local156.aShortArrayArray3[local164]);
		}
		this.aClass3_Sub35_Sub1_1.method18857(local156);
	}

	@OriginalMember(owner = "client!amz", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V", line = 26)
	@Override
	void method19497(@OriginalArg(0) OggPacket arg0) {
		if (this.anInt2708 * -1552515449 < 3) {
			@Pc(12) int local12 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local12 < 0) {
				throw new IllegalStateException("" + local12);
			}
			if (this.anInt2708 * -1552515449 == 2) {
				if (this.aVorbisInfo1.anInt4180 > 2 || this.aVorbisInfo1.anInt4180 < 1) {
					throw new RuntimeException("" + this.aVorbisInfo1.anInt4180);
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass383_1 = new Class383(this.aVorbisInfo1.anInt4181, Class388.anInt4752);
				this.aClass3_Sub35_Sub1_1 = new Class3_Sub35_Sub1(this.aVorbisInfo1.anInt4180);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(105) float[][] local105 = this.aDSPState1.pcmOut(this.aVorbisInfo1.anInt4180);
		this.aDouble3 = this.aDSPState1.granuleTime();
		if (-1.0D == this.aDouble3) {
			this.aDouble3 = (float) (this.anInt2709 * 602395215) / (float) this.aVorbisInfo1.anInt4181;
		}
		this.aDSPState1.read(local105[0].length);
		this.anInt2709 += local105[0].length * -1117649745;
		@Pc(156) Class3_Sub39 local156 = this.aClass3_Sub35_Sub1_1.method18844(local105[0].length, this.aDouble3);
		Class405.method27654(local105, local156.aShortArrayArray3);
		for (@Pc(164) int local164 = 0; local164 < this.aVorbisInfo1.anInt4180; local164++) {
			local156.aShortArrayArray3[local164] = this.aClass383_1.method27324(local156.aShortArrayArray3[local164]);
		}
		this.aClass3_Sub35_Sub1_1.method18857(local156);
	}

	@OriginalMember(owner = "client!amz", name = "s", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)V", line = 26)
	@Override
	void method19502(@OriginalArg(0) OggPacket arg0) {
		if (this.anInt2708 * -1552515449 < 3) {
			@Pc(12) int local12 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local12 < 0) {
				throw new IllegalStateException("" + local12);
			}
			if (this.anInt2708 * -1552515449 == 2) {
				if (this.aVorbisInfo1.anInt4180 > 2 || this.aVorbisInfo1.anInt4180 < 1) {
					throw new RuntimeException("" + this.aVorbisInfo1.anInt4180);
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass383_1 = new Class383(this.aVorbisInfo1.anInt4181, Class388.anInt4752);
				this.aClass3_Sub35_Sub1_1 = new Class3_Sub35_Sub1(this.aVorbisInfo1.anInt4180);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(105) float[][] local105 = this.aDSPState1.pcmOut(this.aVorbisInfo1.anInt4180);
		this.aDouble3 = this.aDSPState1.granuleTime();
		if (-1.0D == this.aDouble3) {
			this.aDouble3 = (float) (this.anInt2709 * 602395215) / (float) this.aVorbisInfo1.anInt4181;
		}
		this.aDSPState1.read(local105[0].length);
		this.anInt2709 += local105[0].length * -1117649745;
		@Pc(156) Class3_Sub39 local156 = this.aClass3_Sub35_Sub1_1.method18844(local105[0].length, this.aDouble3);
		Class405.method27654(local105, local156.aShortArrayArray3);
		for (@Pc(164) int local164 = 0; local164 < this.aVorbisInfo1.anInt4180; local164++) {
			local156.aShortArrayArray3[local164] = this.aClass383_1.method27324(local156.aShortArrayArray3[local164]);
		}
		this.aClass3_Sub35_Sub1_1.method18857(local156);
	}

	@OriginalMember(owner = "client!amz", name = "u", descriptor = "(Lclient!jagtheora/ogg/OggPacket;)V", line = 26)
	@Override
	void method19506(@OriginalArg(0) OggPacket arg0) {
		if (this.anInt2708 * -1552515449 < 3) {
			@Pc(12) int local12 = this.aVorbisInfo1.headerIn(this.aVorbisComment1, arg0);
			if (local12 < 0) {
				throw new IllegalStateException("" + local12);
			}
			if (this.anInt2708 * -1552515449 == 2) {
				if (this.aVorbisInfo1.anInt4180 > 2 || this.aVorbisInfo1.anInt4180 < 1) {
					throw new RuntimeException("" + this.aVorbisInfo1.anInt4180);
				}
				this.aDSPState1 = new DSPState(this.aVorbisInfo1);
				this.aVorbisBlock1 = new VorbisBlock(this.aDSPState1);
				this.aClass383_1 = new Class383(this.aVorbisInfo1.anInt4181, Class388.anInt4752);
				this.aClass3_Sub35_Sub1_1 = new Class3_Sub35_Sub1(this.aVorbisInfo1.anInt4180);
			}
			return;
		}
		if (this.aVorbisBlock1.synthesis(arg0) == 0) {
			this.aDSPState1.blockIn(this.aVorbisBlock1);
		}
		@Pc(105) float[][] local105 = this.aDSPState1.pcmOut(this.aVorbisInfo1.anInt4180);
		this.aDouble3 = this.aDSPState1.granuleTime();
		if (-1.0D == this.aDouble3) {
			this.aDouble3 = (float) (this.anInt2709 * 602395215) / (float) this.aVorbisInfo1.anInt4181;
		}
		this.aDSPState1.read(local105[0].length);
		this.anInt2709 += local105[0].length * -1117649745;
		@Pc(156) Class3_Sub39 local156 = this.aClass3_Sub35_Sub1_1.method18844(local105[0].length, this.aDouble3);
		Class405.method27654(local105, local156.aShortArrayArray3);
		for (@Pc(164) int local164 = 0; local164 < this.aVorbisInfo1.anInt4180; local164++) {
			local156.aShortArrayArray3[local164] = this.aClass383_1.method27324(local156.aShortArrayArray3[local164]);
		}
		this.aClass3_Sub35_Sub1_1.method18857(local156);
	}

	@OriginalMember(owner = "client!amz", name = "k", descriptor = "([[F[[S)[[S", line = 56)
	static short[][] method19512(@OriginalArg(0) float[][] arg0, @OriginalArg(1) short[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			for (@Pc(7) int local7 = 0; local7 < arg1[local1].length; local7++) {
				arg1[local1][local7] = (short) (arg0[local1][local7] * 16383.0F);
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!amz", name = "at", descriptor = "([[F[[S)[[S", line = 56)
	static short[][] method19513(@OriginalArg(0) float[][] arg0, @OriginalArg(1) short[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			for (@Pc(7) int local7 = 0; local7 < arg1[local1].length; local7++) {
				arg1[local1][local7] = (short) (arg0[local1][local7] * 16383.0F);
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!amz", name = "n", descriptor = "(I)Lclient!amg;", line = 65)
	public Class3_Sub35_Sub1 method19508() {
		return this.aClass3_Sub35_Sub1_1;
	}

	@OriginalMember(owner = "client!amz", name = "af", descriptor = "()Lclient!amg;", line = 65)
	public Class3_Sub35_Sub1 method19514() {
		return this.aClass3_Sub35_Sub1_1;
	}

	@OriginalMember(owner = "client!amz", name = "g", descriptor = "(B)V", line = 69)
	@Override
	void method19499() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.method25193();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.method25193();
		}
		this.aVorbisComment1.method25193();
		this.aVorbisInfo1.method25193();
		if (this.aClass3_Sub35_Sub1_1 != null) {
			this.aClass3_Sub35_Sub1_1.method18863();
		}
	}

	@OriginalMember(owner = "client!amz", name = "b", descriptor = "()V", line = 69)
	@Override
	void method19504() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.method25193();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.method25193();
		}
		this.aVorbisComment1.method25193();
		this.aVorbisInfo1.method25193();
		if (this.aClass3_Sub35_Sub1_1 != null) {
			this.aClass3_Sub35_Sub1_1.method18863();
		}
	}

	@OriginalMember(owner = "client!amz", name = "z", descriptor = "()V", line = 69)
	@Override
	void method19498() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.method25193();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.method25193();
		}
		this.aVorbisComment1.method25193();
		this.aVorbisInfo1.method25193();
		if (this.aClass3_Sub35_Sub1_1 != null) {
			this.aClass3_Sub35_Sub1_1.method18863();
		}
	}

	@OriginalMember(owner = "client!amz", name = "c", descriptor = "()V", line = 69)
	@Override
	void method19505() {
		if (this.aVorbisBlock1 != null) {
			this.aVorbisBlock1.method25193();
		}
		if (this.aDSPState1 != null) {
			this.aDSPState1.method25193();
		}
		this.aVorbisComment1.method25193();
		this.aVorbisInfo1.method25193();
		if (this.aClass3_Sub35_Sub1_1 != null) {
			this.aClass3_Sub35_Sub1_1.method18863();
		}
	}

	@OriginalMember(owner = "client!amz", name = "aa", descriptor = "()D", line = 77)
	double method19509() {
		@Pc(2) double local2 = this.aDouble3;
		if (this.aClass3_Sub35_Sub1_1 != null) {
			local2 = this.aClass3_Sub35_Sub1_1.method18859();
			if (local2 < 0.0D) {
				local2 = this.aDouble3;
			}
		}
		return local2 - (double) (256.0F / (float) Class388.anInt4752);
	}

	@OriginalMember(owner = "client!amz", name = "i", descriptor = "(B)D", line = 77)
	double method19511() {
		@Pc(2) double local2 = this.aDouble3;
		if (this.aClass3_Sub35_Sub1_1 != null) {
			local2 = this.aClass3_Sub35_Sub1_1.method18859();
			if (local2 < 0.0D) {
				local2 = this.aDouble3;
			}
		}
		return local2 - (double) (256.0F / (float) Class388.anInt4752);
	}

	@OriginalMember(owner = "client!amz", name = "ak", descriptor = "()D", line = 77)
	double method19515() {
		@Pc(2) double local2 = this.aDouble3;
		if (this.aClass3_Sub35_Sub1_1 != null) {
			local2 = this.aClass3_Sub35_Sub1_1.method18859();
			if (local2 < 0.0D) {
				local2 = this.aDouble3;
			}
		}
		return local2 - (double) (256.0F / (float) Class388.anInt4752);
	}

	@OriginalMember(owner = "client!amz", name = "f", descriptor = "(I)I", line = 86)
	int method19510() {
		return this.aClass3_Sub35_Sub1_1 == null ? 0 : this.aClass3_Sub35_Sub1_1.method18843();
	}
}
