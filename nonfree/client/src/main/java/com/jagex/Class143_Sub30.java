package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amm")
public class Class143_Sub30 extends Class143 {

	@OriginalMember(owner = "client!amm", name = "w", descriptor = "I")
	static final int anInt2235 = -3;

	@OriginalMember(owner = "client!amm", name = "t", descriptor = "I")
	static final int anInt2236 = -2;

	@OriginalMember(owner = "client!amm", name = "<init>", descriptor = "(Lclient!akq;)V", line = 11)
	public Class143_Sub30(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amm", name = "<init>", descriptor = "(ILclient!akq;)V", line = 15)
	public Class143_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amm", name = "i", descriptor = "(B)V", line = 19)
	public void method15967() {
		if (this.anInt2324 * 189295939 < -3) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amm", name = "u", descriptor = "()V", line = 19)
	public void method15968() {
		if (this.anInt2324 * 189295939 < -3) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amm", name = "e", descriptor = "()V", line = 19)
	public void method15969() {
		if (this.anInt2324 * 189295939 < -3) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amm", name = "p", descriptor = "(I)I", line = 23)
	@Override
	int method16256() {
		return -2;
	}

	@OriginalMember(owner = "client!amm", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16260() {
		return -2;
	}

	@OriginalMember(owner = "client!amm", name = "t", descriptor = "()I", line = 23)
	@Override
	int method16257() {
		return -2;
	}

	@OriginalMember(owner = "client!amm", name = "y", descriptor = "()I", line = 23)
	@Override
	int method16259() {
		return -2;
	}

	@OriginalMember(owner = "client!amm", name = "c", descriptor = "(II)I", line = 27)
	@Override
	int method16264(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amm", name = "r", descriptor = "(I)I", line = 27)
	@Override
	int method16266(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amm", name = "s", descriptor = "(I)I", line = 27)
	@Override
	int method16265(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amm", name = "g", descriptor = "(I)I", line = 27)
	@Override
	int method16267(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amm", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method16268(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amm", name = "l", descriptor = "(II)V", line = 31)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amm", name = "x", descriptor = "(I)V", line = 31)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amm", name = "d", descriptor = "(I)V", line = 31)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amm", name = "q", descriptor = "(I)V", line = 31)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amm", name = "f", descriptor = "()I", line = 35)
	public int method15970() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amm", name = "k", descriptor = "(I)I", line = 35)
	public int method15971() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amm", name = "br", descriptor = "(Lclient!anu;IIB)Z", line = 386)
	static final boolean method15972(@OriginalArg(0) Class35_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class599 local5 = (Class599) arg0.method18319(arg1);
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return local5.method31995(arg2);
	}
}
