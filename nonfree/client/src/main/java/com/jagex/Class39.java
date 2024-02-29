package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abo")
public abstract class Class39 {

	@OriginalMember(owner = "client!abo", name = "q", descriptor = "I")
	public static final int anInt1750 = 2048;

	@OriginalMember(owner = "client!abo", name = "r", descriptor = "I")
	public static final int anInt1751 = 32768;

	@OriginalMember(owner = "client!abo", name = "v", descriptor = "I")
	public static final int anInt1752 = 16;

	@OriginalMember(owner = "client!abo", name = "y", descriptor = "I")
	public static final int anInt1753 = 64;

	@OriginalMember(owner = "client!abo", name = "c", descriptor = "I")
	public static final int anInt1754 = 4;

	@OriginalMember(owner = "client!abo", name = "l", descriptor = "I")
	public static final int anInt1755 = 32;

	@OriginalMember(owner = "client!abo", name = "t", descriptor = "I")
	public static final int anInt1756 = 512;

	@OriginalMember(owner = "client!abo", name = "w", descriptor = "I")
	public static final int anInt1757 = 256;

	@OriginalMember(owner = "client!abo", name = "x", descriptor = "I")
	public static final int anInt1758 = 4096;

	@OriginalMember(owner = "client!abo", name = "d", descriptor = "I")
	public static final int anInt1759 = 8192;

	@OriginalMember(owner = "client!abo", name = "s", descriptor = "I")
	public static final int anInt1760 = 16384;

	@OriginalMember(owner = "client!abo", name = "p", descriptor = "I")
	public static final int anInt1761 = 2;

	@OriginalMember(owner = "client!abo", name = "gj", descriptor = "Lclient!pw;")
	public static Class478 aClass478_42;

	@OriginalMember(owner = "client!abo", name = "jo", descriptor = "Lclient!xc;")
	static Class639 aClass639_3;

	@OriginalMember(owner = "client!abo", name = "u", descriptor = "I")
	protected int anInt1767;

	@OriginalMember(owner = "client!abo", name = "e", descriptor = "I")
	protected int anInt1768;

	@OriginalMember(owner = "client!abo", name = "f", descriptor = "I")
	protected int anInt1769;

	@OriginalMember(owner = "client!abo", name = "g", descriptor = "I")
	protected int anInt1762 = -581203021;

	@OriginalMember(owner = "client!abo", name = "z", descriptor = "I")
	protected int anInt1763 = 211221557;

	@OriginalMember(owner = "client!abo", name = "j", descriptor = "I")
	protected int anInt1764 = 2003428493;

	@OriginalMember(owner = "client!abo", name = "i", descriptor = "I")
	protected int anInt1765 = -1031958597;

	@OriginalMember(owner = "client!abo", name = "k", descriptor = "I")
	protected int anInt1766 = 406105807;

	@OriginalMember(owner = "client!abo", name = "<init>", descriptor = "()V", line = 25)
	Class39() {
	}

	@OriginalMember(owner = "client!abo", name = "d", descriptor = "()I", line = 28)
	public int method14281() {
		return this.anInt1769 * -164430629;
	}

	@OriginalMember(owner = "client!abo", name = "w", descriptor = "(S)I", line = 28)
	public int method14282() {
		return this.anInt1769 * -164430629;
	}

	@OriginalMember(owner = "client!abo", name = "t", descriptor = "()I", line = 28)
	public int method14283() {
		return this.anInt1769 * -164430629;
	}

	@OriginalMember(owner = "client!abo", name = "q", descriptor = "()I", line = 28)
	public int method14284() {
		return this.anInt1769 * -164430629;
	}

	@OriginalMember(owner = "client!abo", name = "x", descriptor = "()I", line = 28)
	public int method14285() {
		return this.anInt1769 * -164430629;
	}

	@OriginalMember(owner = "client!abo", name = "yk", descriptor = "(Lclient!yf;I)V", line = 8954)
	static final void method14286(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (client.aString163 == null || local12 >= Class462.anInt4970 * -217094943) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class204.aClass50Array1[local12].anInt180 * 1829245767;
		}
	}
}
