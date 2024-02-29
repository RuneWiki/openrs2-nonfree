package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alu")
public class Class143_Sub16 extends Class143 {

	@OriginalMember(owner = "client!alu", name = "x", descriptor = "I")
	public static final int anInt2137 = 3;

	@OriginalMember(owner = "client!alu", name = "w", descriptor = "I")
	public static final int anInt2138 = 0;

	@OriginalMember(owner = "client!alu", name = "q", descriptor = "I")
	public static final int anInt2139 = 2;

	@OriginalMember(owner = "client!alu", name = "t", descriptor = "I")
	public static final int anInt2140 = 1;

	@OriginalMember(owner = "client!alu", name = "<init>", descriptor = "(Lclient!akq;)V", line = 13)
	public Class143_Sub16(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!alu", name = "<init>", descriptor = "(ILclient!akq;)V", line = 17)
	public Class143_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!alu", name = "i", descriptor = "(I)V", line = 21)
	public void method15436() {
		if (this.aClass77_Sub35_44.aClass143_Sub14_1.method15386() == 2 && this.anInt2324 * 189295939 == 2) {
			this.anInt2324 = 1823770475;
		}
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 3) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alu", name = "u", descriptor = "()V", line = 21)
	public void method15437() {
		if (this.aClass77_Sub35_44.aClass143_Sub14_1.method15386() == 2 && this.anInt2324 * 189295939 == 2) {
			this.anInt2324 = 1823770475;
		}
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 3) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alu", name = "w", descriptor = "()I", line = 26)
	@Override
	int method16260() {
		return 2;
	}

	@OriginalMember(owner = "client!alu", name = "y", descriptor = "()I", line = 26)
	@Override
	int method16259() {
		return 2;
	}

	@OriginalMember(owner = "client!alu", name = "t", descriptor = "()I", line = 26)
	@Override
	int method16257() {
		return 2;
	}

	@OriginalMember(owner = "client!alu", name = "p", descriptor = "(I)I", line = 26)
	@Override
	int method16256() {
		return 2;
	}

	@OriginalMember(owner = "client!alu", name = "c", descriptor = "(II)I", line = 30)
	@Override
	int method16264(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alu", name = "s", descriptor = "(I)I", line = 30)
	@Override
	int method16265(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alu", name = "r", descriptor = "(I)I", line = 30)
	@Override
	int method16266(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alu", name = "g", descriptor = "(I)I", line = 30)
	@Override
	int method16267(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alu", name = "z", descriptor = "(I)I", line = 30)
	@Override
	int method16268(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alu", name = "q", descriptor = "(I)V", line = 34)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alu", name = "l", descriptor = "(II)V", line = 34)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alu", name = "x", descriptor = "(I)V", line = 34)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alu", name = "d", descriptor = "(I)V", line = 34)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alu", name = "k", descriptor = "(B)I", line = 38)
	public int method15438() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alu", name = "f", descriptor = "()I", line = 38)
	public int method15439() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alu", name = "e", descriptor = "()I", line = 38)
	public int method15440() {
		return this.anInt2324 * 189295939;
	}
}
