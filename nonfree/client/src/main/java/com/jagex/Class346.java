package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public class Class346 {

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
	public static final int anInt4615 = 2;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
	static final int anInt4616 = 2;

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
	static final int anInt4617 = 2;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
	public static final int anInt4618 = 4;

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
	public static final int anInt4619 = 8;

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
	static final int anInt4620 = 16;

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!ni", name = "ts", descriptor = "I")
	public static int anInt4621;

	@OriginalMember(owner = "client!ni", name = "s", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(III)V", line = 12)
	public Class346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArrayArrayArray12 = new byte[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "(I)V", line = 17)
	public void method26502() {
		for (@Pc(1) int local1 = 0; local1 < this.aByteArrayArrayArray12.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aByteArrayArrayArray12[0].length; local8++) {
				for (@Pc(17) int local17 = 0; local17 < this.aByteArrayArrayArray12[0][0].length; local17++) {
					this.aByteArrayArrayArray12[local1][local8][local17] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "()V", line = 17)
	public void method26510() {
		for (@Pc(1) int local1 = 0; local1 < this.aByteArrayArrayArray12.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aByteArrayArrayArray12[0].length; local8++) {
				for (@Pc(17) int local17 = 0; local17 < this.aByteArrayArrayArray12[0][0].length; local17++) {
					this.aByteArrayArrayArray12[local1][local8][local17] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIB)Z", line = 27)
	public boolean method26503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[3].length && arg1 < this.aByteArrayArrayArray12[3][arg0].length) {
			return (this.aByteArrayArrayArray12[3][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "(II)Z", line = 27)
	public boolean method26505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[3].length && arg1 < this.aByteArrayArrayArray12[3][arg0].length) {
			return (this.aByteArrayArrayArray12[3][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "s", descriptor = "(II)Z", line = 27)
	public boolean method26508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[3].length && arg1 < this.aByteArrayArrayArray12[3][arg0].length) {
			return (this.aByteArrayArrayArray12[3][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "y", descriptor = "(II)Z", line = 27)
	public boolean method26511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[3].length && arg1 < this.aByteArrayArrayArray12[3][arg0].length) {
			return (this.aByteArrayArrayArray12[3][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "(III)Z", line = 32)
	public boolean method26504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[1].length && arg1 < this.aByteArrayArrayArray12[1][arg0].length) {
			return (this.aByteArrayArrayArray12[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(II)Z", line = 32)
	public boolean method26507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[1].length && arg1 < this.aByteArrayArrayArray12[1][arg0].length) {
			return (this.aByteArrayArrayArray12[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)Z", line = 32)
	public boolean method26513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aByteArrayArrayArray12[1].length && arg1 < this.aByteArrayArrayArray12[1][arg0].length) {
			return (this.aByteArrayArrayArray12[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "(IIIII)Z", line = 38)
	public boolean method26501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((this.aByteArrayArrayArray12[0][arg2][arg3] & 0x2) != 0) {
			return true;
		} else if ((this.aByteArrayArrayArray12[arg1][arg2][arg3] & 0x10) == 0) {
			return this.method26506(arg1, arg2, arg3) == arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "(IIII)Z", line = 38)
	public boolean method26509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((this.aByteArrayArrayArray12[0][arg2][arg3] & 0x2) != 0) {
			return true;
		} else if ((this.aByteArrayArrayArray12[arg1][arg2][arg3] & 0x10) == 0) {
			return this.method26506(arg1, arg2, arg3) == arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "(IIII)Z", line = 38)
	public boolean method26512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((this.aByteArrayArrayArray12[0][arg2][arg3] & 0x2) != 0) {
			return true;
		} else if ((this.aByteArrayArrayArray12[arg1][arg2][arg3] & 0x10) == 0) {
			return this.method26506(arg1, arg2, arg3) == arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "(IIII)I", line = 45)
	int method26506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArrayArray12[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (this.aByteArrayArrayArray12[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "(III)I", line = 45)
	int method26514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArrayArray12[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (this.aByteArrayArrayArray12[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "(III)I", line = 45)
	int method26515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArrayArray12[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (this.aByteArrayArrayArray12[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "(Lclient!aml;Lclient!vs;I)V", line = 502)
	static final void method26516(@OriginalArg(0) Class3_Sub1_Sub7 arg0, @OriginalArg(1) Class536 arg1) {
		arg1.anIntArray496[(arg1.anInt5319 += 312124549) * 960738381 - 1] = Class215.method24288(arg0);
		arg1.anObjectArray42[(arg1.anInt5315 += 790013775) * 996806575 - 1] = Class292.method25552(arg0);
		arg1.anObjectArray42[(arg1.anInt5315 += 790013775) * 996806575 - 1] = Class23.method5943(arg0);
		arg1.anObjectArray42[(arg1.anInt5315 += 790013775) * 996806575 - 1] = Class448.method28361(arg0);
	}

	@OriginalMember(owner = "client!ni", name = "ase", descriptor = "(Lclient!vs;B)V", line = 12358)
	static final void method26517(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub22_1.method13718() ? 1 : 0;
	}
}
