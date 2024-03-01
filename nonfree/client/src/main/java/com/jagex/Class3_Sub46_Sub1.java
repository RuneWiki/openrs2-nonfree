package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anq")
public class Class3_Sub46_Sub1 extends Class3_Sub46 {

	@OriginalMember(owner = "client!anq", name = "c", descriptor = "I")
	static final int anInt2784 = 4;

	@OriginalMember(owner = "client!anq", name = "z", descriptor = "I")
	static final int anInt2785 = 4;

	@OriginalMember(owner = "client!anq", name = "n", descriptor = "Z")
	static final boolean aBoolean489 = true;

	@OriginalMember(owner = "client!anq", name = "i", descriptor = "I")
	static final int anInt2788 = 8;

	@OriginalMember(owner = "client!anq", name = "b", descriptor = "I")
	static final int anInt2789 = 0;

	@OriginalMember(owner = "client!anq", name = "j", descriptor = "I")
	static final int anInt2790 = 1638;

	@OriginalMember(owner = "client!anq", name = "e", descriptor = "[S")
	short[] aShortArray58;

	@OriginalMember(owner = "client!anq", name = "r", descriptor = "[S")
	short[] aShortArray59;

	@OriginalMember(owner = "client!anq", name = "d", descriptor = "[B")
	byte[] aByteArray50 = new byte[512];

	@OriginalMember(owner = "client!anq", name = "q", descriptor = "I")
	int anInt2786 = 0;

	@OriginalMember(owner = "client!anq", name = "m", descriptor = "I")
	int anInt2793 = -215608868;

	@OriginalMember(owner = "client!anq", name = "v", descriptor = "I")
	int anInt2787 = 324428636;

	@OriginalMember(owner = "client!anq", name = "t", descriptor = "I")
	int anInt2791 = 291884836;

	@OriginalMember(owner = "client!anq", name = "w", descriptor = "I")
	int anInt2792 = 1177683882;

	@OriginalMember(owner = "client!anq", name = "o", descriptor = "Z")
	boolean aBoolean490 = true;

	@OriginalMember(owner = "client!anq", name = "<init>", descriptor = "()V", line = 24)
	Class3_Sub46_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!anq", name = "p", descriptor = "(I[IS)V", line = 29)
	void method20155(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int local8 = this.anInt2787 * -901457177 * Class602.anIntArray519[arg0];
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
		if (this.anInt2791 * -1004726663 == 1) {
			local19 = this.aShortArray58[0];
			local26 = this.aShortArray59[0] << 12;
			local35 = this.anInt2787 * -901457177 * local26 >> 12;
			local44 = this.anInt2793 * -170551993 * local26 >> 12;
			local50 = local26 * local8 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class45.anIntArray257[local50];
			local80 = this.aByteArray50[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray50[local58 & 0xFF] & 0xFF;
			if (this.aBoolean490) {
				for (local94 = 0; local94 < Class602.anInt5523 * -1178159305; local94++) {
					local108 = Class602.anIntArray520[local94] * -170551993 * this.anInt2793;
					local122 = this.method20154(local26 * local108 >> 12, local50, local80, local89, local71, local44);
					@Pc(128) int local128 = local19 * local122 >> 12;
					arg1[local94] = (local128 >> 1) + 2048;
				}
			} else {
				for (local94 = 0; local94 < Class602.anInt5523 * -1178159305; local94++) {
					local108 = this.anInt2793 * -170551993 * Class602.anIntArray520[local94];
					local122 = this.method20154(local26 * local108 >> 12, local50, local80, local89, local71, local44);
					arg1[local94] = local19 * local122 >> 12;
				}
			}
			return;
		}
		local19 = this.aShortArray58[0];
		if (local19 > 8 || local19 < -8) {
			local26 = this.aShortArray59[0] << 12;
			local35 = local26 * this.anInt2787 * -901457177 >> 12;
			local44 = local26 * -170551993 * this.anInt2793 >> 12;
			local50 = local8 * local26 >> 12;
			local54 = local50 >> 12;
			local58 = local54 + 1;
			if (local58 >= local35) {
				local58 = 0;
			}
			local50 &= 0xFFF;
			local71 = Class45.anIntArray257[local50];
			local80 = this.aByteArray50[local54 & 0xFF] & 0xFF;
			local89 = this.aByteArray50[local58 & 0xFF] & 0xFF;
			for (local94 = 0; local94 < Class602.anInt5523 * -1178159305; local94++) {
				local108 = this.anInt2793 * -170551993 * Class602.anIntArray520[local94];
				local122 = this.method20154(local26 * local108 >> 12, local50, local80, local89, local71, local44);
				arg1[local94] = local122 * local19 >> 12;
			}
		}
		for (@Pc(301) int local301 = 1; local301 < this.anInt2791 * -1004726663; local301++) {
			local19 = this.aShortArray58[local301];
			if (local19 > 8 || local19 < -8) {
				local26 = this.aShortArray59[local301] << 12;
				local35 = local26 * -901457177 * this.anInt2787 >> 12;
				local44 = this.anInt2793 * -170551993 * local26 >> 12;
				local50 = local26 * local8 >> 12;
				local54 = local50 >> 12;
				local58 = local54 + 1;
				if (local58 >= local35) {
					local58 = 0;
				}
				local50 &= 0xFFF;
				local71 = Class45.anIntArray257[local50];
				local80 = this.aByteArray50[local54 & 0xFF] & 0xFF;
				local89 = this.aByteArray50[local58 & 0xFF] & 0xFF;
				if (this.aBoolean490 && local301 == this.anInt2791 * -1004726663 - 1) {
					for (local94 = 0; local94 < Class602.anInt5523 * -1178159305; local94++) {
						local108 = Class602.anIntArray520[local94] * this.anInt2793 * -170551993;
						local122 = this.method20154(local108 * local26 >> 12, local50, local80, local89, local71, local44);
						local122 = (local19 * local122 >> 12) + arg1[local94];
						arg1[local94] = (local122 >> 1) + 2048;
					}
				} else {
					for (local94 = 0; local94 < Class602.anInt5523 * -1178159305; local94++) {
						local108 = this.anInt2793 * -170551993 * Class602.anIntArray520[local94];
						local122 = this.method20154(local108 * local26 >> 12, local50, local80, local89, local71, local44);
						arg1[local94] += local19 * local122 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!anq", name = "a", descriptor = "(IIIIIIB)I", line = 132)
	int method20154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
		@Pc(36) int local36 = Class45.anIntArray257[local16];
		@Pc(45) int local45 = this.aByteArray50[arg2 + local3] & 0x3;
		@Pc(58) int local58;
		if (local45 <= 1) {
			local58 = local45 == 0 ? arg1 + local16 : arg1 - local16;
		} else {
			local58 = local45 == 2 ? local16 - arg1 : -local16 - arg1;
		}
		local45 = this.aByteArray50[local7 + arg2] & 0x3;
		@Pc(93) int local93;
		if (local45 <= 1) {
			local93 = local45 == 0 ? local28 + arg1 : arg1 - local28;
		} else {
			local93 = local45 == 2 ? local28 - arg1 : -local28 - arg1;
		}
		@Pc(116) int local116 = local58 + (local36 * (local93 - local58) >> 12);
		local45 = this.aByteArray50[arg3 + local3] & 0x3;
		if (local45 <= 1) {
			local58 = local45 == 0 ? local32 + local16 : local32 - local16;
		} else {
			local58 = local45 == 2 ? local16 - local32 : -local16 - local32;
		}
		local45 = this.aByteArray50[arg3 + local7] & 0x3;
		if (local45 <= 1) {
			local93 = local45 == 0 ? local28 + local32 : local32 - local28;
		} else {
			local93 = local45 == 2 ? local28 - local32 : -local28 - local32;
		}
		@Pc(197) int local197 = local58 + ((local93 - local58) * local36 >> 12);
		return (arg4 * (local197 - local116) >> 12) + local116;
	}

	@OriginalMember(owner = "client!anq", name = "u", descriptor = "(IIIIII)I", line = 132)
	int method20157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
		@Pc(36) int local36 = Class45.anIntArray257[local16];
		@Pc(45) int local45 = this.aByteArray50[arg2 + local3] & 0x3;
		@Pc(58) int local58;
		if (local45 <= 1) {
			local58 = local45 == 0 ? arg1 + local16 : arg1 - local16;
		} else {
			local58 = local45 == 2 ? local16 - arg1 : -local16 - arg1;
		}
		local45 = this.aByteArray50[local7 + arg2] & 0x3;
		@Pc(93) int local93;
		if (local45 <= 1) {
			local93 = local45 == 0 ? local28 + arg1 : arg1 - local28;
		} else {
			local93 = local45 == 2 ? local28 - arg1 : -local28 - arg1;
		}
		@Pc(116) int local116 = local58 + (local36 * (local93 - local58) >> 12);
		local45 = this.aByteArray50[arg3 + local3] & 0x3;
		if (local45 <= 1) {
			local58 = local45 == 0 ? local32 + local16 : local32 - local16;
		} else {
			local58 = local45 == 2 ? local16 - local32 : -local16 - local32;
		}
		local45 = this.aByteArray50[arg3 + local7] & 0x3;
		if (local45 <= 1) {
			local93 = local45 == 0 ? local28 + local32 : local32 - local28;
		} else {
			local93 = local45 == 2 ? local28 - local32 : -local28 - local32;
		}
		@Pc(197) int local197 = local58 + ((local93 - local58) * local36 >> 12);
		return (arg4 * (local197 - local116) >> 12) + local116;
	}

	@OriginalMember(owner = "client!anq", name = "s", descriptor = "(IIIIII)I", line = 132)
	int method20159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
		@Pc(36) int local36 = Class45.anIntArray257[local16];
		@Pc(45) int local45 = this.aByteArray50[arg2 + local3] & 0x3;
		@Pc(58) int local58;
		if (local45 <= 1) {
			local58 = local45 == 0 ? arg1 + local16 : arg1 - local16;
		} else {
			local58 = local45 == 2 ? local16 - arg1 : -local16 - arg1;
		}
		local45 = this.aByteArray50[local7 + arg2] & 0x3;
		@Pc(93) int local93;
		if (local45 <= 1) {
			local93 = local45 == 0 ? local28 + arg1 : arg1 - local28;
		} else {
			local93 = local45 == 2 ? local28 - arg1 : -local28 - arg1;
		}
		@Pc(116) int local116 = local58 + (local36 * (local93 - local58) >> 12);
		local45 = this.aByteArray50[arg3 + local3] & 0x3;
		if (local45 <= 1) {
			local58 = local45 == 0 ? local32 + local16 : local32 - local16;
		} else {
			local58 = local45 == 2 ? local16 - local32 : -local16 - local32;
		}
		local45 = this.aByteArray50[arg3 + local7] & 0x3;
		if (local45 <= 1) {
			local93 = local45 == 0 ? local28 + local32 : local32 - local28;
		} else {
			local93 = local45 == 2 ? local28 - local32 : -local28 - local32;
		}
		@Pc(197) int local197 = local58 + ((local93 - local58) * local36 >> 12);
		return (arg4 * (local197 - local116) >> 12) + local116;
	}

	@OriginalMember(owner = "client!anq", name = "y", descriptor = "(IIIIII)I", line = 132)
	int method20163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
		@Pc(36) int local36 = Class45.anIntArray257[local16];
		@Pc(45) int local45 = this.aByteArray50[arg2 + local3] & 0x3;
		@Pc(58) int local58;
		if (local45 <= 1) {
			local58 = local45 == 0 ? arg1 + local16 : arg1 - local16;
		} else {
			local58 = local45 == 2 ? local16 - arg1 : -local16 - arg1;
		}
		local45 = this.aByteArray50[local7 + arg2] & 0x3;
		@Pc(93) int local93;
		if (local45 <= 1) {
			local93 = local45 == 0 ? local28 + arg1 : arg1 - local28;
		} else {
			local93 = local45 == 2 ? local28 - arg1 : -local28 - arg1;
		}
		@Pc(116) int local116 = local58 + (local36 * (local93 - local58) >> 12);
		local45 = this.aByteArray50[arg3 + local3] & 0x3;
		if (local45 <= 1) {
			local58 = local45 == 0 ? local32 + local16 : local32 - local16;
		} else {
			local58 = local45 == 2 ? local16 - local32 : -local16 - local32;
		}
		local45 = this.aByteArray50[arg3 + local7] & 0x3;
		if (local45 <= 1) {
			local93 = local45 == 0 ? local28 + local32 : local32 - local28;
		} else {
			local93 = local45 == 2 ? local28 - local32 : -local28 - local32;
		}
		@Pc(197) int local197 = local58 + ((local93 - local58) * local36 >> 12);
		return (arg4 * (local197 - local116) >> 12) + local116;
	}

	@OriginalMember(owner = "client!anq", name = "g", descriptor = "(B)V", line = 176)
	void method20161() {
		this.aByteArray50 = Class602.method33518(this.anInt2786 * -889191087);
		this.method20158();
		for (@Pc(17) int local17 = this.anInt2791 * -1004726663 - 1; local17 >= 1; local17--) {
			@Pc(25) short local25 = this.aShortArray58[local17];
			if (local25 > 8 || local25 < -8) {
				break;
			}
			this.anInt2791 -= 1146713033;
		}
	}

	@OriginalMember(owner = "client!anq", name = "b", descriptor = "()V", line = 176)
	void method20162() {
		this.aByteArray50 = Class602.method33518(this.anInt2786 * -889191087);
		this.method20158();
		for (@Pc(17) int local17 = this.anInt2791 * -1004726663 - 1; local17 >= 1; local17--) {
			@Pc(25) short local25 = this.aShortArray58[local17];
			if (local25 > 8 || local25 < -8) {
				break;
			}
			this.anInt2791 -= 1146713033;
		}
	}

	@OriginalMember(owner = "client!anq", name = "l", descriptor = "(I)V", line = 188)
	void method20158() {
		@Pc(20) int local20;
		if (this.anInt2792 * 1586779879 > 0) {
			this.aShortArray58 = new short[this.anInt2791 * -1004726663];
			this.aShortArray59 = new short[this.anInt2791 * -1004726663];
			for (local20 = 0; local20 < this.anInt2791 * -1004726663; local20++) {
				this.aShortArray58[local20] = (short) (Math.pow((double) ((float) (this.anInt2792 * 1586779879) / 4096.0F), (double) local20) * 4096.0D);
				this.aShortArray59[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		} else if (this.aShortArray58 != null && this.anInt2791 * -1004726663 == this.aShortArray58.length) {
			this.aShortArray59 = new short[this.anInt2791 * -1004726663];
			for (local20 = 0; local20 < this.anInt2791 * -1004726663; local20++) {
				this.aShortArray59[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		}
	}

	@OriginalMember(owner = "client!anq", name = "c", descriptor = "()V", line = 188)
	void method20160() {
		@Pc(20) int local20;
		if (this.anInt2792 * 1586779879 > 0) {
			this.aShortArray58 = new short[this.anInt2791 * -1004726663];
			this.aShortArray59 = new short[this.anInt2791 * -1004726663];
			for (local20 = 0; local20 < this.anInt2791 * -1004726663; local20++) {
				this.aShortArray58[local20] = (short) (Math.pow((double) ((float) (this.anInt2792 * 1586779879) / 4096.0F), (double) local20) * 4096.0D);
				this.aShortArray59[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		} else if (this.aShortArray58 != null && this.anInt2791 * -1004726663 == this.aShortArray58.length) {
			this.aShortArray59 = new short[this.anInt2791 * -1004726663];
			for (local20 = 0; local20 < this.anInt2791 * -1004726663; local20++) {
				this.aShortArray59[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		}
	}

	@OriginalMember(owner = "client!anq", name = "z", descriptor = "(IIIIIFZ)[I", line = 203)
	public static int[] method20164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int[] local2 = new int[arg0];
		@Pc(6) Class3_Sub46_Sub1 local6 = new Class3_Sub46_Sub1();
		local6.anInt2786 = arg1 * -1332845647;
		local6.aBoolean490 = arg6;
		local6.anInt2793 = arg2 * 2093581431;
		local6.anInt2787 = arg3 * -2066376489;
		local6.anInt2791 = arg4 * 1146713033;
		local6.anInt2792 = (int) (arg5 * 4096.0F) * -699376425;
		local6.method20161();
		Class602.method33521(arg0, 1);
		local6.method20155(0, local2);
		return local2;
	}

	@OriginalMember(owner = "client!anq", name = "j", descriptor = "(IIIIIIFZ)[[I", line = 218)
	public static int[][] method20156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) boolean arg6) {
		@Pc(3) int[][] local3 = new int[arg1][arg0];
		@Pc(7) Class3_Sub46_Sub1 local7 = new Class3_Sub46_Sub1();
		local7.aBoolean490 = arg6;
		local7.anInt2793 = arg2 * 2093581431;
		local7.anInt2787 = arg3 * -2066376489;
		local7.anInt2791 = arg4 * 1146713033;
		local7.anInt2792 = (int) (arg5 * 4096.0F) * -699376425;
		local7.method20161();
		Class602.method33521(arg0, arg1);
		for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
			local7.method20155(local42, local3[local42]);
		}
		return local3;
	}
}
