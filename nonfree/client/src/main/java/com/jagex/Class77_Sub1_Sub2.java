package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adj")
public class Class77_Sub1_Sub2 extends Class77_Sub1 implements Interface12, Interface6 {

	@OriginalMember(owner = "client!adj", name = "w", descriptor = "[I")
	public int[] anIntArray20;

	@OriginalMember(owner = "client!adj", name = "y", descriptor = "[I")
	public int[] anIntArray21;

	@OriginalMember(owner = "client!adj", name = "l", descriptor = "I")
	public int anInt266 = 0;

	@OriginalMember(owner = "client!adj", name = "t", descriptor = "I")
	public int anInt267 = 0;

	@OriginalMember(owner = "client!adj", name = "<init>", descriptor = "()V", line = 15)
	Class77_Sub1_Sub2() {
	}

	@OriginalMember(owner = "client!adj", name = "p", descriptor = "(Lclient!akv;B)V", line = 19)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method1493(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!adj", name = "v", descriptor = "(Lclient!akv;)V", line = 19)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method1493(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!adj", name = "l", descriptor = "(Lclient!akv;)V", line = 19)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method1493(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!adj", name = "y", descriptor = "(Lclient!akv;)V", line = 19)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method1493(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!adj", name = "q", descriptor = "(Lclient!akv;IS)V", line = 26)
	void method1493(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt267 = arg0.method22483() * 742803125;
		} else if (arg1 == 4) {
			this.anInt266 = arg0.method22478() * 1380573889;
			this.anIntArray21 = new int[this.anInt266 * 440511809];
			this.anIntArray20 = new int[this.anInt266 * 440511809];
			for (@Pc(36) int local36 = 0; local36 < this.anInt266 * 440511809; local36++) {
				this.anIntArray21[local36] = arg0.method22483();
				this.anIntArray20[local36] = arg0.method22483();
			}
		}
	}

	@OriginalMember(owner = "client!adj", name = "d", descriptor = "(Lclient!akv;I)V", line = 26)
	void method1494(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt267 = arg0.method22483() * 742803125;
		} else if (arg1 == 4) {
			this.anInt266 = arg0.method22478() * 1380573889;
			this.anIntArray21 = new int[this.anInt266 * 440511809];
			this.anIntArray20 = new int[this.anInt266 * 440511809];
			for (@Pc(36) int local36 = 0; local36 < this.anInt266 * 440511809; local36++) {
				this.anIntArray21[local36] = arg0.method22483();
				this.anIntArray20[local36] = arg0.method22483();
			}
		}
	}

	@OriginalMember(owner = "client!adj", name = "s", descriptor = "(Lclient!akv;I)V", line = 26)
	void method1495(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt267 = arg0.method22483() * 742803125;
		} else if (arg1 == 4) {
			this.anInt266 = arg0.method22478() * 1380573889;
			this.anIntArray21 = new int[this.anInt266 * 440511809];
			this.anIntArray20 = new int[this.anInt266 * 440511809];
			for (@Pc(36) int local36 = 0; local36 < this.anInt266 * 440511809; local36++) {
				this.anIntArray21[local36] = arg0.method22483();
				this.anIntArray20[local36] = arg0.method22483();
			}
		}
	}

	@OriginalMember(owner = "client!adj", name = "r", descriptor = "(Lclient!akv;I)V", line = 26)
	void method1496(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 2) {
			this.anInt267 = arg0.method22483() * 742803125;
		} else if (arg1 == 4) {
			this.anInt266 = arg0.method22478() * 1380573889;
			this.anIntArray21 = new int[this.anInt266 * 440511809];
			this.anIntArray20 = new int[this.anInt266 * 440511809];
			for (@Pc(36) int local36 = 0; local36 < this.anInt266 * 440511809; local36++) {
				this.anIntArray21[local36] = arg0.method22483();
				this.anIntArray20[local36] = arg0.method22483();
			}
		}
	}

	@OriginalMember(owner = "client!adj", name = "w", descriptor = "()V", line = 39)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!adj", name = "t", descriptor = "()V", line = 39)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!adj", name = "c", descriptor = "(I)V", line = 39)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!adj", name = "z", descriptor = "(I)V", line = 40)
	@Override
	public void method32872(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adj", name = "g", descriptor = "(I)V", line = 40)
	@Override
	public void method32873(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adj", name = "x", descriptor = "(II)V", line = 40)
	@Override
	public void method32874(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adj", name = "eu", descriptor = "(II)Z", line = 1724)
	static boolean method1497(@OriginalArg(0) int arg0) {
		return arg0 == 8 || arg0 == 11 || arg0 == 4;
	}

	@OriginalMember(owner = "client!adj", name = "gf", descriptor = "(IIII)V", line = 3318)
	static final void method1498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(32) String local32 = "tele " + arg0 + Class184.aString133 + (arg1 >> 6) + Class184.aString133 + (arg2 >> 6) + Class184.aString133 + (arg1 & 0x3F) + Class184.aString133 + (arg2 & 0x3F);
		System.out.println(local32);
		Class509.method30282(local32, true, false);
	}

	@OriginalMember(owner = "client!adj", name = "nv", descriptor = "(Lclient!yf;B)V", line = 6961)
	static final void method1499(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class106_Sub2.method8984(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!adj", name = "axc", descriptor = "(Lclient!yf;I)V", line = 13480)
	static final void method1500(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass104_Sub1_Sub5_Sub1_1.method24134();
	}
}
