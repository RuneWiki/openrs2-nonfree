package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alw")
public class Class143_Sub18 extends Class143 {

	@OriginalMember(owner = "client!alw", name = "q", descriptor = "I")
	static final int anInt2152 = 3;

	@OriginalMember(owner = "client!alw", name = "w", descriptor = "I")
	static final int anInt2153 = 0;

	@OriginalMember(owner = "client!alw", name = "t", descriptor = "I")
	static final int anInt2154 = 2;

	@OriginalMember(owner = "client!alw", name = "<init>", descriptor = "(Lclient!akq;)V", line = 12)
	public Class143_Sub18(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!alw", name = "<init>", descriptor = "(ILclient!akq;)V", line = 16)
	public Class143_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!alw", name = "i", descriptor = "(I)V", line = 20)
	public void method15481() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 != 3) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alw", name = "p", descriptor = "(I)I", line = 24)
	@Override
	int method16256() {
		return 2;
	}

	@OriginalMember(owner = "client!alw", name = "y", descriptor = "()I", line = 24)
	@Override
	int method16259() {
		return 2;
	}

	@OriginalMember(owner = "client!alw", name = "w", descriptor = "()I", line = 24)
	@Override
	int method16260() {
		return 2;
	}

	@OriginalMember(owner = "client!alw", name = "t", descriptor = "()I", line = 24)
	@Override
	int method16257() {
		return 2;
	}

	@OriginalMember(owner = "client!alw", name = "c", descriptor = "(II)I", line = 28)
	@Override
	int method16264(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!alw", name = "s", descriptor = "(I)I", line = 28)
	@Override
	int method16265(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!alw", name = "z", descriptor = "(I)I", line = 28)
	@Override
	int method16268(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!alw", name = "r", descriptor = "(I)I", line = 28)
	@Override
	int method16266(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!alw", name = "g", descriptor = "(I)I", line = 28)
	@Override
	int method16267(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!alw", name = "l", descriptor = "(II)V", line = 32)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alw", name = "x", descriptor = "(I)V", line = 32)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alw", name = "d", descriptor = "(I)V", line = 32)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alw", name = "q", descriptor = "(I)V", line = 32)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alw", name = "k", descriptor = "(I)I", line = 36)
	public int method15482() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alw", name = "u", descriptor = "()I", line = 36)
	public int method15483() {
		return this.anInt2324 * 189295939;
	}
}
