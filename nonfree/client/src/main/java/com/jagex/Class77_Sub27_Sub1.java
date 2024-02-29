package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arf")
public class Class77_Sub27_Sub1 extends Class77_Sub27 {

	@OriginalMember(owner = "client!arf", name = "d", descriptor = "I")
	static final int anInt3030 = 0;

	@OriginalMember(owner = "client!arf", name = "r", descriptor = "I")
	static final int anInt3031 = 4;

	@OriginalMember(owner = "client!arf", name = "a", descriptor = "I")
	static final int anInt3032 = 8;

	@OriginalMember(owner = "client!arf", name = "z", descriptor = "Z")
	static final boolean aBoolean497 = true;

	@OriginalMember(owner = "client!arf", name = "s", descriptor = "I")
	static final int anInt3033 = 4;

	@OriginalMember(owner = "client!arf", name = "g", descriptor = "I")
	static final int anInt3036 = 1638;

	@OriginalMember(owner = "client!arf", name = "j", descriptor = "[S")
	short[] aShortArray69;

	@OriginalMember(owner = "client!arf", name = "i", descriptor = "[S")
	short[] aShortArray70;

	@OriginalMember(owner = "client!arf", name = "k", descriptor = "[B")
	byte[] aByteArray52 = new byte[512];

	@OriginalMember(owner = "client!arf", name = "u", descriptor = "I")
	int anInt3034 = 0;

	@OriginalMember(owner = "client!arf", name = "e", descriptor = "I")
	int anInt3039 = 872580036;

	@OriginalMember(owner = "client!arf", name = "f", descriptor = "I")
	int anInt3035 = 1909614252;

	@OriginalMember(owner = "client!arf", name = "o", descriptor = "I")
	int anInt3037 = -950340980;

	@OriginalMember(owner = "client!arf", name = "b", descriptor = "I")
	int anInt3038 = -49532410;

	@OriginalMember(owner = "client!arf", name = "n", descriptor = "Z")
	boolean aBoolean496 = true;

	@OriginalMember(owner = "client!arf", name = "<init>", descriptor = "()V", line = 24)
	Class77_Sub27_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!arf", name = "p", descriptor = "(I[II)V", line = 29)
	void method22245(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int local8 = Class32.anIntArray13[arg0] * 1130469635 * this.anInt3035;
		@Pc(108) int local108;
		@Pc(122) int local122;
		@Pc(26) int local26;
		@Pc(19) short local19;
		@Pc(94) int local94;
		@Pc(50) int local50;
		@Pc(44) int local44;
		@Pc(35) int local35;
		@Pc(71) int local71;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(80) int local80;
		@Pc(89) int local89;
		if (this.anInt3037 * 601085707 == 1) {
			local19 = this.aShortArray69[0];
			local26 = this.aShortArray70[0] << 12;
			local35 = local26 * this.anInt3035 * 1130469635 >> 12;
			local44 = local26 * 1531596817 * this.anInt3039 >> 12;
			local50 = local26 * local8 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class119.anIntArray280[local50];
			local80 = this.aByteArray52[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray52[local58 & 0xFF] & 0xFF;
			if (this.aBoolean496) {
				for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
					local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
					local122 = this.method22250(local26 * local108 >> 12, local50, local80, local89, local71, local44);
					@Pc(128) int local128 = local122 * local19 >> 12;
					arg1[local94] = (local128 >> 1) + 2048;
				}
			} else {
				for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
					local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
					local122 = this.method22250(local108 * local26 >> 12, local50, local80, local89, local71, local44);
					arg1[local94] = local122 * local19 >> 12;
				}
			}
			return;
		}
		local19 = this.aShortArray69[0];
		if (local19 > 8 || local19 < -8) {
			local26 = this.aShortArray70[0] << 12;
			local35 = this.anInt3035 * 1130469635 * local26 >> 12;
			local44 = this.anInt3039 * 1531596817 * local26 >> 12;
			local50 = local26 * local8 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class119.anIntArray280[local50];
			local80 = this.aByteArray52[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray52[local58 & 0xFF] & 0xFF;
			for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
				local108 = Class32.anIntArray12[local94] * this.anInt3039 * 1531596817;
				local122 = this.method22250(local26 * local108 >> 12, local50, local80, local89, local71, local44);
				arg1[local94] = local122 * local19 >> 12;
			}
		}
		for (@Pc(301) int local301 = 1; local301 < this.anInt3037 * 601085707; local301++) {
			local19 = this.aShortArray69[local301];
			if (local19 > 8 || local19 < -8) {
				local26 = this.aShortArray70[local301] << 12;
				local35 = this.anInt3035 * 1130469635 * local26 >> 12;
				local44 = local26 * 1531596817 * this.anInt3039 >> 12;
				local50 = local26 * local8 >> 12;
				local54 = local50 >> 12;
				local58 = local54 + 1;
				if (local58 >= local35) {
					local58 = 0;
				}
				local50 &= 0xFFF;
				local71 = Class119.anIntArray280[local50];
				local80 = this.aByteArray52[local54 & 0xFF] & 0xFF;
				local89 = this.aByteArray52[local58 & 0xFF] & 0xFF;
				if (this.aBoolean496 && local301 == this.anInt3037 * 601085707 - 1) {
					for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
						local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
						local122 = this.method22250(local108 * local26 >> 12, local50, local80, local89, local71, local44);
						local122 = (local122 * local19 >> 12) + arg1[local94];
						arg1[local94] = (local122 >> 1) + 2048;
					}
				} else {
					for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
						local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
						local122 = this.method22250(local26 * local108 >> 12, local50, local80, local89, local71, local44);
						arg1[local94] += local19 * local122 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!arf", name = "q", descriptor = "(I[I)V", line = 29)
	void method22246(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int local8 = Class32.anIntArray13[arg0] * 1130469635 * this.anInt3035;
		@Pc(108) int local108;
		@Pc(122) int local122;
		@Pc(26) int local26;
		@Pc(19) short local19;
		@Pc(94) int local94;
		@Pc(50) int local50;
		@Pc(44) int local44;
		@Pc(35) int local35;
		@Pc(71) int local71;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(80) int local80;
		@Pc(89) int local89;
		if (this.anInt3037 * 601085707 == 1) {
			local19 = this.aShortArray69[0];
			local26 = this.aShortArray70[0] << 12;
			local35 = local26 * this.anInt3035 * 1130469635 >> 12;
			local44 = local26 * 1531596817 * this.anInt3039 >> 12;
			local50 = local26 * local8 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class119.anIntArray280[local50];
			local80 = this.aByteArray52[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray52[local58 & 0xFF] & 0xFF;
			if (this.aBoolean496) {
				for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
					local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
					local122 = this.method22250(local26 * local108 >> 12, local50, local80, local89, local71, local44);
					@Pc(128) int local128 = local122 * local19 >> 12;
					arg1[local94] = (local128 >> 1) + 2048;
				}
			} else {
				for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
					local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
					local122 = this.method22250(local108 * local26 >> 12, local50, local80, local89, local71, local44);
					arg1[local94] = local122 * local19 >> 12;
				}
			}
			return;
		}
		local19 = this.aShortArray69[0];
		if (local19 > 8 || local19 < -8) {
			local26 = this.aShortArray70[0] << 12;
			local35 = this.anInt3035 * 1130469635 * local26 >> 12;
			local44 = this.anInt3039 * 1531596817 * local26 >> 12;
			local50 = local26 * local8 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class119.anIntArray280[local50];
			local80 = this.aByteArray52[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray52[local58 & 0xFF] & 0xFF;
			for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
				local108 = Class32.anIntArray12[local94] * this.anInt3039 * 1531596817;
				local122 = this.method22250(local26 * local108 >> 12, local50, local80, local89, local71, local44);
				arg1[local94] = local122 * local19 >> 12;
			}
		}
		for (@Pc(301) int local301 = 1; local301 < this.anInt3037 * 601085707; local301++) {
			local19 = this.aShortArray69[local301];
			if (local19 > 8 || local19 < -8) {
				local26 = this.aShortArray70[local301] << 12;
				local35 = this.anInt3035 * 1130469635 * local26 >> 12;
				local44 = local26 * 1531596817 * this.anInt3039 >> 12;
				local50 = local26 * local8 >> 12;
				local54 = local50 >> 12;
				local58 = local54 + 1;
				if (local58 >= local35) {
					local58 = 0;
				}
				local50 &= 0xFFF;
				local71 = Class119.anIntArray280[local50];
				local80 = this.aByteArray52[local54 & 0xFF] & 0xFF;
				local89 = this.aByteArray52[local58 & 0xFF] & 0xFF;
				if (this.aBoolean496 && local301 == this.anInt3037 * 601085707 - 1) {
					for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
						local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
						local122 = this.method22250(local108 * local26 >> 12, local50, local80, local89, local71, local44);
						local122 = (local122 * local19 >> 12) + arg1[local94];
						arg1[local94] = (local122 >> 1) + 2048;
					}
				} else {
					for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
						local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
						local122 = this.method22250(local26 * local108 >> 12, local50, local80, local89, local71, local44);
						arg1[local94] += local19 * local122 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!arf", name = "x", descriptor = "(I[I)V", line = 29)
	void method22247(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int local8 = Class32.anIntArray13[arg0] * 1130469635 * this.anInt3035;
		@Pc(108) int local108;
		@Pc(122) int local122;
		@Pc(26) int local26;
		@Pc(19) short local19;
		@Pc(94) int local94;
		@Pc(50) int local50;
		@Pc(44) int local44;
		@Pc(35) int local35;
		@Pc(71) int local71;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(80) int local80;
		@Pc(89) int local89;
		if (this.anInt3037 * 601085707 == 1) {
			local19 = this.aShortArray69[0];
			local26 = this.aShortArray70[0] << 12;
			local35 = local26 * this.anInt3035 * 1130469635 >> 12;
			local44 = local26 * 1531596817 * this.anInt3039 >> 12;
			local50 = local26 * local8 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class119.anIntArray280[local50];
			local80 = this.aByteArray52[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray52[local58 & 0xFF] & 0xFF;
			if (this.aBoolean496) {
				for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
					local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
					local122 = this.method22250(local26 * local108 >> 12, local50, local80, local89, local71, local44);
					@Pc(128) int local128 = local122 * local19 >> 12;
					arg1[local94] = (local128 >> 1) + 2048;
				}
			} else {
				for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
					local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
					local122 = this.method22250(local108 * local26 >> 12, local50, local80, local89, local71, local44);
					arg1[local94] = local122 * local19 >> 12;
				}
			}
			return;
		}
		local19 = this.aShortArray69[0];
		if (local19 > 8 || local19 < -8) {
			local26 = this.aShortArray70[0] << 12;
			local35 = this.anInt3035 * 1130469635 * local26 >> 12;
			local44 = this.anInt3039 * 1531596817 * local26 >> 12;
			local50 = local26 * local8 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class119.anIntArray280[local50];
			local80 = this.aByteArray52[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray52[local58 & 0xFF] & 0xFF;
			for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
				local108 = Class32.anIntArray12[local94] * this.anInt3039 * 1531596817;
				local122 = this.method22250(local26 * local108 >> 12, local50, local80, local89, local71, local44);
				arg1[local94] = local122 * local19 >> 12;
			}
		}
		for (@Pc(301) int local301 = 1; local301 < this.anInt3037 * 601085707; local301++) {
			local19 = this.aShortArray69[local301];
			if (local19 > 8 || local19 < -8) {
				local26 = this.aShortArray70[local301] << 12;
				local35 = this.anInt3035 * 1130469635 * local26 >> 12;
				local44 = local26 * 1531596817 * this.anInt3039 >> 12;
				local50 = local26 * local8 >> 12;
				local54 = local50 >> 12;
				local58 = local54 + 1;
				if (local58 >= local35) {
					local58 = 0;
				}
				local50 &= 0xFFF;
				local71 = Class119.anIntArray280[local50];
				local80 = this.aByteArray52[local54 & 0xFF] & 0xFF;
				local89 = this.aByteArray52[local58 & 0xFF] & 0xFF;
				if (this.aBoolean496 && local301 == this.anInt3037 * 601085707 - 1) {
					for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
						local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
						local122 = this.method22250(local108 * local26 >> 12, local50, local80, local89, local71, local44);
						local122 = (local122 * local19 >> 12) + arg1[local94];
						arg1[local94] = (local122 >> 1) + 2048;
					}
				} else {
					for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
						local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
						local122 = this.method22250(local26 * local108 >> 12, local50, local80, local89, local71, local44);
						arg1[local94] += local19 * local122 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!arf", name = "d", descriptor = "(I[I)V", line = 29)
	void method22248(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int local8 = Class32.anIntArray13[arg0] * 1130469635 * this.anInt3035;
		@Pc(108) int local108;
		@Pc(122) int local122;
		@Pc(26) int local26;
		@Pc(19) short local19;
		@Pc(94) int local94;
		@Pc(50) int local50;
		@Pc(44) int local44;
		@Pc(35) int local35;
		@Pc(71) int local71;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(80) int local80;
		@Pc(89) int local89;
		if (this.anInt3037 * 601085707 == 1) {
			local19 = this.aShortArray69[0];
			local26 = this.aShortArray70[0] << 12;
			local35 = local26 * this.anInt3035 * 1130469635 >> 12;
			local44 = local26 * 1531596817 * this.anInt3039 >> 12;
			local50 = local26 * local8 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class119.anIntArray280[local50];
			local80 = this.aByteArray52[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray52[local58 & 0xFF] & 0xFF;
			if (this.aBoolean496) {
				for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
					local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
					local122 = this.method22250(local26 * local108 >> 12, local50, local80, local89, local71, local44);
					@Pc(128) int local128 = local122 * local19 >> 12;
					arg1[local94] = (local128 >> 1) + 2048;
				}
			} else {
				for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
					local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
					local122 = this.method22250(local108 * local26 >> 12, local50, local80, local89, local71, local44);
					arg1[local94] = local122 * local19 >> 12;
				}
			}
			return;
		}
		local19 = this.aShortArray69[0];
		if (local19 > 8 || local19 < -8) {
			local26 = this.aShortArray70[0] << 12;
			local35 = this.anInt3035 * 1130469635 * local26 >> 12;
			local44 = this.anInt3039 * 1531596817 * local26 >> 12;
			local50 = local26 * local8 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class119.anIntArray280[local50];
			local80 = this.aByteArray52[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray52[local58 & 0xFF] & 0xFF;
			for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
				local108 = Class32.anIntArray12[local94] * this.anInt3039 * 1531596817;
				local122 = this.method22250(local26 * local108 >> 12, local50, local80, local89, local71, local44);
				arg1[local94] = local122 * local19 >> 12;
			}
		}
		for (@Pc(301) int local301 = 1; local301 < this.anInt3037 * 601085707; local301++) {
			local19 = this.aShortArray69[local301];
			if (local19 > 8 || local19 < -8) {
				local26 = this.aShortArray70[local301] << 12;
				local35 = this.anInt3035 * 1130469635 * local26 >> 12;
				local44 = local26 * 1531596817 * this.anInt3039 >> 12;
				local50 = local26 * local8 >> 12;
				local54 = local50 >> 12;
				local58 = local54 + 1;
				if (local58 >= local35) {
					local58 = 0;
				}
				local50 &= 0xFFF;
				local71 = Class119.anIntArray280[local50];
				local80 = this.aByteArray52[local54 & 0xFF] & 0xFF;
				local89 = this.aByteArray52[local58 & 0xFF] & 0xFF;
				if (this.aBoolean496 && local301 == this.anInt3037 * 601085707 - 1) {
					for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
						local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
						local122 = this.method22250(local108 * local26 >> 12, local50, local80, local89, local71, local44);
						local122 = (local122 * local19 >> 12) + arg1[local94];
						arg1[local94] = (local122 >> 1) + 2048;
					}
				} else {
					for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
						local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
						local122 = this.method22250(local26 * local108 >> 12, local50, local80, local89, local71, local44);
						arg1[local94] += local19 * local122 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!arf", name = "t", descriptor = "(I[I)V", line = 29)
	void method22249(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int local8 = Class32.anIntArray13[arg0] * 1130469635 * this.anInt3035;
		@Pc(108) int local108;
		@Pc(122) int local122;
		@Pc(26) int local26;
		@Pc(19) short local19;
		@Pc(94) int local94;
		@Pc(50) int local50;
		@Pc(44) int local44;
		@Pc(35) int local35;
		@Pc(71) int local71;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(80) int local80;
		@Pc(89) int local89;
		if (this.anInt3037 * 601085707 == 1) {
			local19 = this.aShortArray69[0];
			local26 = this.aShortArray70[0] << 12;
			local35 = local26 * this.anInt3035 * 1130469635 >> 12;
			local44 = local26 * 1531596817 * this.anInt3039 >> 12;
			local50 = local26 * local8 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class119.anIntArray280[local50];
			local80 = this.aByteArray52[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray52[local58 & 0xFF] & 0xFF;
			if (this.aBoolean496) {
				for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
					local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
					local122 = this.method22250(local26 * local108 >> 12, local50, local80, local89, local71, local44);
					@Pc(128) int local128 = local122 * local19 >> 12;
					arg1[local94] = (local128 >> 1) + 2048;
				}
			} else {
				for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
					local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
					local122 = this.method22250(local108 * local26 >> 12, local50, local80, local89, local71, local44);
					arg1[local94] = local122 * local19 >> 12;
				}
			}
			return;
		}
		local19 = this.aShortArray69[0];
		if (local19 > 8 || local19 < -8) {
			local26 = this.aShortArray70[0] << 12;
			local35 = this.anInt3035 * 1130469635 * local26 >> 12;
			local44 = this.anInt3039 * 1531596817 * local26 >> 12;
			local50 = local26 * local8 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class119.anIntArray280[local50];
			local80 = this.aByteArray52[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray52[local58 & 0xFF] & 0xFF;
			for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
				local108 = Class32.anIntArray12[local94] * this.anInt3039 * 1531596817;
				local122 = this.method22250(local26 * local108 >> 12, local50, local80, local89, local71, local44);
				arg1[local94] = local122 * local19 >> 12;
			}
		}
		for (@Pc(301) int local301 = 1; local301 < this.anInt3037 * 601085707; local301++) {
			local19 = this.aShortArray69[local301];
			if (local19 > 8 || local19 < -8) {
				local26 = this.aShortArray70[local301] << 12;
				local35 = this.anInt3035 * 1130469635 * local26 >> 12;
				local44 = local26 * 1531596817 * this.anInt3039 >> 12;
				local50 = local26 * local8 >> 12;
				local54 = local50 >> 12;
				local58 = local54 + 1;
				if (local58 >= local35) {
					local58 = 0;
				}
				local50 &= 0xFFF;
				local71 = Class119.anIntArray280[local50];
				local80 = this.aByteArray52[local54 & 0xFF] & 0xFF;
				local89 = this.aByteArray52[local58 & 0xFF] & 0xFF;
				if (this.aBoolean496 && local301 == this.anInt3037 * 601085707 - 1) {
					for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
						local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
						local122 = this.method22250(local108 * local26 >> 12, local50, local80, local89, local71, local44);
						local122 = (local122 * local19 >> 12) + arg1[local94];
						arg1[local94] = (local122 >> 1) + 2048;
					}
				} else {
					for (local94 = 0; local94 < Class32.anInt128 * 327132075; local94++) {
						local108 = this.anInt3039 * 1531596817 * Class32.anIntArray12[local94];
						local122 = this.method22250(local26 * local108 >> 12, local50, local80, local89, local71, local44);
						arg1[local94] += local19 * local122 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!arf", name = "c", descriptor = "(IIIIIII)I", line = 132)
	int method22250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 >> 12;
		@Pc(7) int local7 = local3 + 1;
		if (local7 >= arg5) {
			local7 = 0;
		}
		@Pc(16) int local16 = arg0 & 0xFFF;
		local3 &= 0xFF;
		local7 &= 0xFF;
		@Pc(28) int local28 = local16 - 4096;
		@Pc(32) int local32 = arg1 - 4096;
		@Pc(36) int local36 = Class119.anIntArray280[local16];
		@Pc(45) int local45 = this.aByteArray52[arg2 + local3] & 0x3;
		@Pc(58) int local58;
		if (local45 <= 1) {
			local58 = local45 == 0 ? arg1 + local16 : arg1 - local16;
		} else {
			local58 = local45 == 2 ? local16 - arg1 : -local16 - arg1;
		}
		local45 = this.aByteArray52[arg2 + local7] & 0x3;
		@Pc(93) int local93;
		if (local45 <= 1) {
			local93 = local45 == 0 ? arg1 + local28 : arg1 - local28;
		} else {
			local93 = local45 == 2 ? local28 - arg1 : -local28 - arg1;
		}
		@Pc(116) int local116 = (local36 * (local93 - local58) >> 12) + local58;
		local45 = this.aByteArray52[arg3 + local3] & 0x3;
		if (local45 <= 1) {
			local58 = local45 == 0 ? local32 + local16 : local32 - local16;
		} else {
			local58 = local45 == 2 ? local16 - local32 : -local16 - local32;
		}
		local45 = this.aByteArray52[local7 + arg3] & 0x3;
		if (local45 <= 1) {
			local93 = local45 == 0 ? local32 + local28 : local32 - local28;
		} else {
			local93 = local45 == 2 ? local28 - local32 : -local28 - local32;
		}
		@Pc(196) int local196 = ((local93 - local58) * local36 >> 12) + local58;
		return ((local196 - local116) * arg4 >> 12) + local116;
	}

	@OriginalMember(owner = "client!arf", name = "s", descriptor = "(IIIIII)I", line = 132)
	int method22251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 >> 12;
		@Pc(7) int local7 = local3 + 1;
		if (local7 >= arg5) {
			local7 = 0;
		}
		@Pc(16) int local16 = arg0 & 0xFFF;
		local3 &= 0xFF;
		local7 &= 0xFF;
		@Pc(28) int local28 = local16 - 4096;
		@Pc(32) int local32 = arg1 - 4096;
		@Pc(36) int local36 = Class119.anIntArray280[local16];
		@Pc(45) int local45 = this.aByteArray52[arg2 + local3] & 0x3;
		@Pc(58) int local58;
		if (local45 <= 1) {
			local58 = local45 == 0 ? arg1 + local16 : arg1 - local16;
		} else {
			local58 = local45 == 2 ? local16 - arg1 : -local16 - arg1;
		}
		local45 = this.aByteArray52[arg2 + local7] & 0x3;
		@Pc(93) int local93;
		if (local45 <= 1) {
			local93 = local45 == 0 ? arg1 + local28 : arg1 - local28;
		} else {
			local93 = local45 == 2 ? local28 - arg1 : -local28 - arg1;
		}
		@Pc(116) int local116 = (local36 * (local93 - local58) >> 12) + local58;
		local45 = this.aByteArray52[arg3 + local3] & 0x3;
		if (local45 <= 1) {
			local58 = local45 == 0 ? local32 + local16 : local32 - local16;
		} else {
			local58 = local45 == 2 ? local16 - local32 : -local16 - local32;
		}
		local45 = this.aByteArray52[local7 + arg3] & 0x3;
		if (local45 <= 1) {
			local93 = local45 == 0 ? local32 + local28 : local32 - local28;
		} else {
			local93 = local45 == 2 ? local28 - local32 : -local28 - local32;
		}
		@Pc(196) int local196 = ((local93 - local58) * local36 >> 12) + local58;
		return ((local196 - local116) * arg4 >> 12) + local116;
	}

	@OriginalMember(owner = "client!arf", name = "r", descriptor = "(IIIIII)I", line = 132)
	int method22252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 >> 12;
		@Pc(7) int local7 = local3 + 1;
		if (local7 >= arg5) {
			local7 = 0;
		}
		@Pc(16) int local16 = arg0 & 0xFFF;
		local3 &= 0xFF;
		local7 &= 0xFF;
		@Pc(28) int local28 = local16 - 4096;
		@Pc(32) int local32 = arg1 - 4096;
		@Pc(36) int local36 = Class119.anIntArray280[local16];
		@Pc(45) int local45 = this.aByteArray52[arg2 + local3] & 0x3;
		@Pc(58) int local58;
		if (local45 <= 1) {
			local58 = local45 == 0 ? arg1 + local16 : arg1 - local16;
		} else {
			local58 = local45 == 2 ? local16 - arg1 : -local16 - arg1;
		}
		local45 = this.aByteArray52[arg2 + local7] & 0x3;
		@Pc(93) int local93;
		if (local45 <= 1) {
			local93 = local45 == 0 ? arg1 + local28 : arg1 - local28;
		} else {
			local93 = local45 == 2 ? local28 - arg1 : -local28 - arg1;
		}
		@Pc(116) int local116 = (local36 * (local93 - local58) >> 12) + local58;
		local45 = this.aByteArray52[arg3 + local3] & 0x3;
		if (local45 <= 1) {
			local58 = local45 == 0 ? local32 + local16 : local32 - local16;
		} else {
			local58 = local45 == 2 ? local16 - local32 : -local16 - local32;
		}
		local45 = this.aByteArray52[local7 + arg3] & 0x3;
		if (local45 <= 1) {
			local93 = local45 == 0 ? local32 + local28 : local32 - local28;
		} else {
			local93 = local45 == 2 ? local28 - local32 : -local28 - local32;
		}
		@Pc(196) int local196 = ((local93 - local58) * local36 >> 12) + local58;
		return ((local196 - local116) * arg4 >> 12) + local116;
	}

	@OriginalMember(owner = "client!arf", name = "g", descriptor = "(IIIIII)I", line = 132)
	int method22253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 >> 12;
		@Pc(7) int local7 = local3 + 1;
		if (local7 >= arg5) {
			local7 = 0;
		}
		@Pc(16) int local16 = arg0 & 0xFFF;
		local3 &= 0xFF;
		local7 &= 0xFF;
		@Pc(28) int local28 = local16 - 4096;
		@Pc(32) int local32 = arg1 - 4096;
		@Pc(36) int local36 = Class119.anIntArray280[local16];
		@Pc(45) int local45 = this.aByteArray52[arg2 + local3] & 0x3;
		@Pc(58) int local58;
		if (local45 <= 1) {
			local58 = local45 == 0 ? arg1 + local16 : arg1 - local16;
		} else {
			local58 = local45 == 2 ? local16 - arg1 : -local16 - arg1;
		}
		local45 = this.aByteArray52[arg2 + local7] & 0x3;
		@Pc(93) int local93;
		if (local45 <= 1) {
			local93 = local45 == 0 ? arg1 + local28 : arg1 - local28;
		} else {
			local93 = local45 == 2 ? local28 - arg1 : -local28 - arg1;
		}
		@Pc(116) int local116 = (local36 * (local93 - local58) >> 12) + local58;
		local45 = this.aByteArray52[arg3 + local3] & 0x3;
		if (local45 <= 1) {
			local58 = local45 == 0 ? local32 + local16 : local32 - local16;
		} else {
			local58 = local45 == 2 ? local16 - local32 : -local16 - local32;
		}
		local45 = this.aByteArray52[local7 + arg3] & 0x3;
		if (local45 <= 1) {
			local93 = local45 == 0 ? local32 + local28 : local32 - local28;
		} else {
			local93 = local45 == 2 ? local28 - local32 : -local28 - local32;
		}
		@Pc(196) int local196 = ((local93 - local58) * local36 >> 12) + local58;
		return ((local196 - local116) * arg4 >> 12) + local116;
	}

	@OriginalMember(owner = "client!arf", name = "z", descriptor = "(IIIIII)I", line = 132)
	int method22254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 >> 12;
		@Pc(7) int local7 = local3 + 1;
		if (local7 >= arg5) {
			local7 = 0;
		}
		@Pc(16) int local16 = arg0 & 0xFFF;
		local3 &= 0xFF;
		local7 &= 0xFF;
		@Pc(28) int local28 = local16 - 4096;
		@Pc(32) int local32 = arg1 - 4096;
		@Pc(36) int local36 = Class119.anIntArray280[local16];
		@Pc(45) int local45 = this.aByteArray52[arg2 + local3] & 0x3;
		@Pc(58) int local58;
		if (local45 <= 1) {
			local58 = local45 == 0 ? arg1 + local16 : arg1 - local16;
		} else {
			local58 = local45 == 2 ? local16 - arg1 : -local16 - arg1;
		}
		local45 = this.aByteArray52[arg2 + local7] & 0x3;
		@Pc(93) int local93;
		if (local45 <= 1) {
			local93 = local45 == 0 ? arg1 + local28 : arg1 - local28;
		} else {
			local93 = local45 == 2 ? local28 - arg1 : -local28 - arg1;
		}
		@Pc(116) int local116 = (local36 * (local93 - local58) >> 12) + local58;
		local45 = this.aByteArray52[arg3 + local3] & 0x3;
		if (local45 <= 1) {
			local58 = local45 == 0 ? local32 + local16 : local32 - local16;
		} else {
			local58 = local45 == 2 ? local16 - local32 : -local16 - local32;
		}
		local45 = this.aByteArray52[local7 + arg3] & 0x3;
		if (local45 <= 1) {
			local93 = local45 == 0 ? local32 + local28 : local32 - local28;
		} else {
			local93 = local45 == 2 ? local28 - local32 : -local28 - local32;
		}
		@Pc(196) int local196 = ((local93 - local58) * local36 >> 12) + local58;
		return ((local196 - local116) * arg4 >> 12) + local116;
	}

	@OriginalMember(owner = "client!arf", name = "b", descriptor = "()V", line = 176)
	void method22255() {
		this.aByteArray52 = Class32.method529(this.anInt3034 * -1209107165);
		this.method22259();
		for (@Pc(17) int local17 = this.anInt3037 * 601085707 - 1; local17 >= 1; local17--) {
			@Pc(25) short local25 = this.aShortArray69[local17];
			if (local25 > 8 || local25 < -8) {
				break;
			}
			this.anInt3037 -= 1909898403;
		}
	}

	@OriginalMember(owner = "client!arf", name = "v", descriptor = "(I)V", line = 176)
	void method22256() {
		this.aByteArray52 = Class32.method529(this.anInt3034 * -1209107165);
		this.method22259();
		for (@Pc(17) int local17 = this.anInt3037 * 601085707 - 1; local17 >= 1; local17--) {
			@Pc(25) short local25 = this.aShortArray69[local17];
			if (local25 > 8 || local25 < -8) {
				break;
			}
			this.anInt3037 -= 1909898403;
		}
	}

	@OriginalMember(owner = "client!arf", name = "j", descriptor = "()V", line = 176)
	void method22257() {
		this.aByteArray52 = Class32.method529(this.anInt3034 * -1209107165);
		this.method22259();
		for (@Pc(17) int local17 = this.anInt3037 * 601085707 - 1; local17 >= 1; local17--) {
			@Pc(25) short local25 = this.aShortArray69[local17];
			if (local25 > 8 || local25 < -8) {
				break;
			}
			this.anInt3037 -= 1909898403;
		}
	}

	@OriginalMember(owner = "client!arf", name = "n", descriptor = "()V", line = 176)
	void method22258() {
		this.aByteArray52 = Class32.method529(this.anInt3034 * -1209107165);
		this.method22259();
		for (@Pc(17) int local17 = this.anInt3037 * 601085707 - 1; local17 >= 1; local17--) {
			@Pc(25) short local25 = this.aShortArray69[local17];
			if (local25 > 8 || local25 < -8) {
				break;
			}
			this.anInt3037 -= 1909898403;
		}
	}

	@OriginalMember(owner = "client!arf", name = "l", descriptor = "(B)V", line = 188)
	void method22259() {
		@Pc(20) int local20;
		if (this.anInt3038 * 739122705 > 0) {
			this.aShortArray69 = new short[this.anInt3037 * 601085707];
			this.aShortArray70 = new short[this.anInt3037 * 601085707];
			for (local20 = 0; local20 < this.anInt3037 * 601085707; local20++) {
				this.aShortArray69[local20] = (short) (Math.pow((double) ((float) (this.anInt3038 * 739122705) / 4096.0F), (double) local20) * 4096.0D);
				this.aShortArray70[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		} else if (this.aShortArray69 != null && this.anInt3037 * 601085707 == this.aShortArray69.length) {
			this.aShortArray70 = new short[this.anInt3037 * 601085707];
			for (local20 = 0; local20 < this.anInt3037 * 601085707; local20++) {
				this.aShortArray70[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		}
	}

	@OriginalMember(owner = "client!arf", name = "a", descriptor = "()V", line = 188)
	void method22260() {
		@Pc(20) int local20;
		if (this.anInt3038 * 739122705 > 0) {
			this.aShortArray69 = new short[this.anInt3037 * 601085707];
			this.aShortArray70 = new short[this.anInt3037 * 601085707];
			for (local20 = 0; local20 < this.anInt3037 * 601085707; local20++) {
				this.aShortArray69[local20] = (short) (Math.pow((double) ((float) (this.anInt3038 * 739122705) / 4096.0F), (double) local20) * 4096.0D);
				this.aShortArray70[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		} else if (this.aShortArray69 != null && this.anInt3037 * 601085707 == this.aShortArray69.length) {
			this.aShortArray70 = new short[this.anInt3037 * 601085707];
			for (local20 = 0; local20 < this.anInt3037 * 601085707; local20++) {
				this.aShortArray70[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		}
	}

	@OriginalMember(owner = "client!arf", name = "m", descriptor = "()V", line = 188)
	void method22261() {
		@Pc(20) int local20;
		if (this.anInt3038 * 739122705 > 0) {
			this.aShortArray69 = new short[this.anInt3037 * 601085707];
			this.aShortArray70 = new short[this.anInt3037 * 601085707];
			for (local20 = 0; local20 < this.anInt3037 * 601085707; local20++) {
				this.aShortArray69[local20] = (short) (Math.pow((double) ((float) (this.anInt3038 * 739122705) / 4096.0F), (double) local20) * 4096.0D);
				this.aShortArray70[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		} else if (this.aShortArray69 != null && this.anInt3037 * 601085707 == this.aShortArray69.length) {
			this.aShortArray70 = new short[this.anInt3037 * 601085707];
			for (local20 = 0; local20 < this.anInt3037 * 601085707; local20++) {
				this.aShortArray70[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		}
	}

	@OriginalMember(owner = "client!arf", name = "h", descriptor = "(IIIIIFZ)[I", line = 203)
	public static int[] method22262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int[] local2 = new int[arg0];
		@Pc(6) Class77_Sub27_Sub1 local6 = new Class77_Sub27_Sub1();
		local6.anInt3034 = arg1 * -334914933;
		local6.aBoolean496 = arg6;
		local6.anInt3039 = arg2 * -855596815;
		local6.anInt3035 = arg3 * 477403563;
		local6.anInt3037 = arg4 * 1909898403;
		local6.anInt3038 = (int) (arg5 * 4096.0F) * -1869573391;
		local6.method22256();
		Class32.method526(arg0, 1);
		local6.method22245(0, local2);
		return local2;
	}

	@OriginalMember(owner = "client!arf", name = "aj", descriptor = "(IIIIIFZ)[I", line = 203)
	public static int[] method22263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int[] local2 = new int[arg0];
		@Pc(6) Class77_Sub27_Sub1 local6 = new Class77_Sub27_Sub1();
		local6.anInt3034 = arg1 * -334914933;
		local6.aBoolean496 = arg6;
		local6.anInt3039 = arg2 * -855596815;
		local6.anInt3035 = arg3 * 477403563;
		local6.anInt3037 = arg4 * 1909898403;
		local6.anInt3038 = (int) (arg5 * 4096.0F) * -1869573391;
		local6.method22256();
		Class32.method526(arg0, 1);
		local6.method22245(0, local2);
		return local2;
	}

	@OriginalMember(owner = "client!arf", name = "al", descriptor = "(IIIIIIFZ)[[I", line = 218)
	public static int[][] method22264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) boolean arg6) {
		@Pc(3) int[][] local3 = new int[arg1][arg0];
		@Pc(7) Class77_Sub27_Sub1 local7 = new Class77_Sub27_Sub1();
		local7.aBoolean496 = arg6;
		local7.anInt3039 = arg2 * -855596815;
		local7.anInt3035 = arg3 * 477403563;
		local7.anInt3037 = arg4 * 1909898403;
		local7.anInt3038 = (int) (arg5 * 4096.0F) * -1869573391;
		local7.method22256();
		Class32.method526(arg0, arg1);
		for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
			local7.method22245(local42, local3[local42]);
		}
		return local3;
	}

	@OriginalMember(owner = "client!arf", name = "ai", descriptor = "(IIIIIIFZ)[[I", line = 218)
	public static int[][] method22265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) boolean arg6) {
		@Pc(3) int[][] local3 = new int[arg1][arg0];
		@Pc(7) Class77_Sub27_Sub1 local7 = new Class77_Sub27_Sub1();
		local7.aBoolean496 = arg6;
		local7.anInt3039 = arg2 * -855596815;
		local7.anInt3035 = arg3 * 477403563;
		local7.anInt3037 = arg4 * 1909898403;
		local7.anInt3038 = (int) (arg5 * 4096.0F) * -1869573391;
		local7.method22256();
		Class32.method526(arg0, arg1);
		for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
			local7.method22245(local42, local3[local42]);
		}
		return local3;
	}

	@OriginalMember(owner = "client!arf", name = "ag", descriptor = "(IIIIIIFZ)[[I", line = 218)
	public static int[][] method22266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) boolean arg6) {
		@Pc(3) int[][] local3 = new int[arg1][arg0];
		@Pc(7) Class77_Sub27_Sub1 local7 = new Class77_Sub27_Sub1();
		local7.aBoolean496 = arg6;
		local7.anInt3039 = arg2 * -855596815;
		local7.anInt3035 = arg3 * 477403563;
		local7.anInt3037 = arg4 * 1909898403;
		local7.anInt3038 = (int) (arg5 * 4096.0F) * -1869573391;
		local7.method22256();
		Class32.method526(arg0, arg1);
		for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
			local7.method22245(local42, local3[local42]);
		}
		return local3;
	}

	@OriginalMember(owner = "client!arf", name = "ao", descriptor = "(IIIIIIFZ)[[I", line = 218)
	public static int[][] method22267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) boolean arg6) {
		@Pc(3) int[][] local3 = new int[arg1][arg0];
		@Pc(7) Class77_Sub27_Sub1 local7 = new Class77_Sub27_Sub1();
		local7.aBoolean496 = arg6;
		local7.anInt3039 = arg2 * -855596815;
		local7.anInt3035 = arg3 * 477403563;
		local7.anInt3037 = arg4 * 1909898403;
		local7.anInt3038 = (int) (arg5 * 4096.0F) * -1869573391;
		local7.method22256();
		Class32.method526(arg0, arg1);
		for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
			local7.method22245(local42, local3[local42]);
		}
		return local3;
	}
}
