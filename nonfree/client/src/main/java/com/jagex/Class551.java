package com.jagex;

import java.util.Stack;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public class Class551 {

	@OriginalMember(owner = "client!te", name = "cc", descriptor = "I")
	public static int anInt5221;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "Ljava/util/Stack;")
	static Stack aStack1 = new Stack();

	@OriginalMember(owner = "client!te", name = "c", descriptor = "Lclient!alc;")
	public Class104_Sub1 aClass104_Sub1_25;

	@OriginalMember(owner = "client!te", name = "v", descriptor = "Z")
	boolean aBoolean789;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "Lclient!tm;")
	Class557 aClass557_1;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 12)
	Class551() {
	}

	@OriginalMember(owner = "client!te", name = "y", descriptor = "(Z)Lclient!te;", line = 15)
	public static Class551 method30987(@OriginalArg(0) boolean arg0) {
		@Pc(2) Stack local2 = aStack1;
		synchronized (aStack1) {
			@Pc(10) Class551 local10;
			if (aStack1.isEmpty()) {
				local10 = new Class551();
			} else {
				local10 = (Class551) aStack1.pop();
			}
			local10.aBoolean789 = arg0;
			return local10;
		}
	}

	@OriginalMember(owner = "client!te", name = "w", descriptor = "(Z)Lclient!te;", line = 15)
	public static Class551 method30988(@OriginalArg(0) boolean arg0) {
		@Pc(2) Stack local2 = aStack1;
		synchronized (aStack1) {
			@Pc(10) Class551 local10;
			if (aStack1.isEmpty()) {
				local10 = new Class551();
			} else {
				local10 = (Class551) aStack1.pop();
			}
			local10.aBoolean789 = arg0;
			return local10;
		}
	}

	@OriginalMember(owner = "client!te", name = "v", descriptor = "(Lclient!akv;I)Lclient!vn;", line = 27)
	public static Class600 method30989(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		@Pc(6) int[] local6 = new int[local3];
		for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
			local6[local8] = arg0.method22478();
		}
		return new Class600(local6);
	}

	@OriginalMember(owner = "client!te", name = "q", descriptor = "(Lclient!te;)V", line = 29)
	static void method30990(@OriginalArg(0) Class551 arg0) {
		arg0.aClass104_Sub1_25 = null;
		@Pc(5) Stack local5 = aStack1;
		synchronized (aStack1) {
			if (aStack1.size() < 200) {
				aStack1.push(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "t", descriptor = "(Lclient!te;)V", line = 29)
	static void method30991(@OriginalArg(0) Class551 arg0) {
		arg0.aClass104_Sub1_25 = null;
		@Pc(5) Stack local5 = aStack1;
		synchronized (aStack1) {
			if (aStack1.size() < 200) {
				aStack1.push(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "x", descriptor = "()V", line = 38)
	public static void method30992() {
		@Pc(2) Stack local2 = aStack1;
		synchronized (aStack1) {
			aStack1 = new Stack();
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "()V", line = 38)
	public static void method30993() {
		@Pc(2) Stack local2 = aStack1;
		synchronized (aStack1) {
			aStack1 = new Stack();
		}
	}

	@OriginalMember(owner = "client!te", name = "l", descriptor = "(Lclient!dx;III)Z", line = 44)
	public boolean method30994(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.aClass104_Sub1_25.method24121();
		if (this.aClass104_Sub1_25.aClass224Array21 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.aClass104_Sub1_25.aClass224Array21.length; local11++) {
				this.aClass104_Sub1_25.aClass224Array21[local11].anInt3744 <<= local4;
				if (this.aClass104_Sub1_25.aClass224Array21[local11].method25773(arg1 + this.aClass557_1.anInt5268 * 1061504705, arg2 + this.aClass557_1.anInt5269 * 28868363) && this.aClass104_Sub1_25.method24137(arg0, arg1, arg2)) {
					this.aClass104_Sub1_25.aClass224Array21[local11].anInt3744 >>= local4;
					return true;
				}
				this.aClass104_Sub1_25.aClass224Array21[local11].anInt3744 >>= local4;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!te", name = "s", descriptor = "(Lclient!dx;II)Z", line = 44)
	public boolean method30995(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.aClass104_Sub1_25.method24121();
		if (this.aClass104_Sub1_25.aClass224Array21 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.aClass104_Sub1_25.aClass224Array21.length; local11++) {
				this.aClass104_Sub1_25.aClass224Array21[local11].anInt3744 <<= local4;
				if (this.aClass104_Sub1_25.aClass224Array21[local11].method25773(arg1 + this.aClass557_1.anInt5268 * 1061504705, arg2 + this.aClass557_1.anInt5269 * 28868363) && this.aClass104_Sub1_25.method24137(arg0, arg1, arg2)) {
					this.aClass104_Sub1_25.aClass224Array21[local11].anInt3744 >>= local4;
					return true;
				}
				this.aClass104_Sub1_25.aClass224Array21[local11].anInt3744 >>= local4;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(Lclient!aas;Lclient!akv;II)Lclient!aau;", line = 48)
	static Class20 method30996(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class77_Sub39 arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class20 local4 = new Class20(arg0);
		@Pc(8) int local8 = arg1.method22478();
		@Pc(16) boolean local16 = (local8 & 0x1) != 0;
		@Pc(24) boolean local24 = (local8 & 0x2) != 0;
		@Pc(33) boolean local33 = (local8 & 0x4) != 0;
		@Pc(42) boolean local42 = (local8 & 0x8) != 0;
		if (local16) {
			if (arg2 <= 1) {
				local4.anIntArray10[0] = arg1.method22483();
				local4.anIntArray8[0] = arg1.method22483();
			} else {
				local4.anIntArray10[0] = arg1.method22549();
				local4.anIntArray8[0] = arg1.method22549();
			}
			if (arg0.anInt75 * 384637321 != -1 || arg0.anInt77 * 1184936625 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray10[1] = arg1.method22483();
					local4.anIntArray8[1] = arg1.method22483();
				} else {
					local4.anIntArray10[1] = arg1.method22549();
					local4.anIntArray8[1] = arg1.method22549();
				}
			}
			if (arg0.anInt78 * -1908318299 != -1 || arg0.anInt79 * 914690775 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray10[2] = arg1.method22483();
					local4.anIntArray8[2] = arg1.method22483();
				} else {
					local4.anIntArray10[2] = arg1.method22549();
					local4.anIntArray8[2] = arg1.method22549();
				}
			}
		}
		if (local24) {
			if (arg2 <= 1) {
				local4.anIntArray9[0] = arg1.method22483();
				local4.anIntArray11[0] = arg1.method22483();
			} else {
				local4.anIntArray9[0] = arg1.method22549();
				local4.anIntArray11[0] = arg1.method22549();
			}
			if (arg0.anInt84 * 331707609 != -1 || arg0.anInt86 * -1648499137 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray9[1] = arg1.method22483();
					local4.anIntArray11[1] = arg1.method22483();
				} else {
					local4.anIntArray9[1] = arg1.method22549();
					local4.anIntArray11[1] = arg1.method22549();
				}
			}
		}
		@Pc(248) int local248;
		@Pc(251) int[] local251;
		@Pc(283) int local283;
		if (local33) {
			local248 = arg1.method22483();
			local251 = new int[] { local248 & 0xF, local248 >> 4 & 0xF, local248 >> 8 & 0xF, local248 >> 12 & 0xF };
			for (local283 = 0; local283 < 4; local283++) {
				if (local251[local283] != 15) {
					local4.aShortArray7[local251[local283]] = (short) arg1.method22483();
				}
			}
		}
		if (local42) {
			local248 = arg1.method22478();
			local251 = new int[] { local248 & 0xF, local248 >> 4 & 0xF };
			for (local283 = 0; local283 < 2; local283++) {
				if (local251[local283] != 15) {
					local4.aShortArray6[local251[local283]] = (short) arg1.method22483();
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!te", name = "aha", descriptor = "(Lclient!yf;B)V", line = 10637)
	static final void method30997(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
	}
}
