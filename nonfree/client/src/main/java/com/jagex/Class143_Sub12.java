package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alp")
public class Class143_Sub12 extends Class143 {

	@OriginalMember(owner = "client!alp", name = "t", descriptor = "I")
	public static final int anInt2111 = 0;

	@OriginalMember(owner = "client!alp", name = "w", descriptor = "I")
	public static final int anInt2112 = 1;

	@OriginalMember(owner = "client!alp", name = "<init>", descriptor = "(Lclient!akq;)V", line = 11)
	public Class143_Sub12(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!alp", name = "<init>", descriptor = "(ILclient!akq;)V", line = 15)
	public Class143_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!alp", name = "i", descriptor = "(I)V", line = 19)
	public void method15326() {
		if (this.anInt2324 * 189295939 != 0 && this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() != 1) {
			this.anInt2324 = 0;
		}
		if (this.anInt2324 * 189295939 != 0 && this.aClass77_Sub35_44.aClass143_Sub14_1.method15386() == 2) {
			this.anInt2324 = 0;
		}
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 1) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alp", name = "f", descriptor = "()V", line = 19)
	public void method15327() {
		if (this.anInt2324 * 189295939 != 0 && this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() != 1) {
			this.anInt2324 = 0;
		}
		if (this.anInt2324 * 189295939 != 0 && this.aClass77_Sub35_44.aClass143_Sub14_1.method15386() == 2) {
			this.anInt2324 = 0;
		}
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 1) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alp", name = "o", descriptor = "()V", line = 19)
	public void method15328() {
		if (this.anInt2324 * 189295939 != 0 && this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() != 1) {
			this.anInt2324 = 0;
		}
		if (this.anInt2324 * 189295939 != 0 && this.aClass77_Sub35_44.aClass143_Sub14_1.method15386() == 2) {
			this.anInt2324 = 0;
		}
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 1) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alp", name = "e", descriptor = "()V", line = 19)
	public void method15329() {
		if (this.anInt2324 * 189295939 != 0 && this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() != 1) {
			this.anInt2324 = 0;
		}
		if (this.anInt2324 * 189295939 != 0 && this.aClass77_Sub35_44.aClass143_Sub14_1.method15386() == 2) {
			this.anInt2324 = 0;
		}
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 1) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alp", name = "p", descriptor = "(I)I", line = 25)
	@Override
	int method16256() {
		return 1;
	}

	@OriginalMember(owner = "client!alp", name = "w", descriptor = "()I", line = 25)
	@Override
	int method16260() {
		return 1;
	}

	@OriginalMember(owner = "client!alp", name = "t", descriptor = "()I", line = 25)
	@Override
	int method16257() {
		return 1;
	}

	@OriginalMember(owner = "client!alp", name = "y", descriptor = "()I", line = 25)
	@Override
	int method16259() {
		return 1;
	}

	@OriginalMember(owner = "client!alp", name = "k", descriptor = "(B)Z", line = 29)
	public boolean method15330() {
		return true;
	}

	@OriginalMember(owner = "client!alp", name = "b", descriptor = "()Z", line = 29)
	public boolean method15331() {
		return true;
	}

	@OriginalMember(owner = "client!alp", name = "n", descriptor = "()Z", line = 29)
	public boolean method15332() {
		return true;
	}

	@OriginalMember(owner = "client!alp", name = "c", descriptor = "(II)I", line = 33)
	@Override
	public int method16264(@OriginalArg(0) int arg0) {
		if (arg0 != 0 && this.aClass77_Sub35_44.aClass143_Sub14_1.method15386() == 2) {
			return 3;
		} else if (arg0 == 0 || this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!alp", name = "s", descriptor = "(I)I", line = 33)
	@Override
	public int method16265(@OriginalArg(0) int arg0) {
		if (arg0 != 0 && this.aClass77_Sub35_44.aClass143_Sub14_1.method15386() == 2) {
			return 3;
		} else if (arg0 == 0 || this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!alp", name = "g", descriptor = "(I)I", line = 33)
	@Override
	public int method16267(@OriginalArg(0) int arg0) {
		if (arg0 != 0 && this.aClass77_Sub35_44.aClass143_Sub14_1.method15386() == 2) {
			return 3;
		} else if (arg0 == 0 || this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!alp", name = "z", descriptor = "(I)I", line = 33)
	@Override
	public int method16268(@OriginalArg(0) int arg0) {
		if (arg0 != 0 && this.aClass77_Sub35_44.aClass143_Sub14_1.method15386() == 2) {
			return 3;
		} else if (arg0 == 0 || this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!alp", name = "r", descriptor = "(I)I", line = 33)
	@Override
	public int method16266(@OriginalArg(0) int arg0) {
		if (arg0 != 0 && this.aClass77_Sub35_44.aClass143_Sub14_1.method15386() == 2) {
			return 3;
		} else if (arg0 == 0 || this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!alp", name = "l", descriptor = "(II)V", line = 39)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alp", name = "q", descriptor = "(I)V", line = 39)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alp", name = "x", descriptor = "(I)V", line = 39)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alp", name = "d", descriptor = "(I)V", line = 39)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alp", name = "u", descriptor = "(I)I", line = 43)
	public int method15333() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alp", name = "a", descriptor = "()I", line = 43)
	public int method15334() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alp", name = "m", descriptor = "()I", line = 43)
	public int method15335() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alp", name = "adl", descriptor = "(Lclient!yf;I)V", line = 9755)
	static final void method15336(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class37.method643(local13);
	}
}
