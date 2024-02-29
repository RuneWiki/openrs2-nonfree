package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amy")
public class Class143_Sub42 extends Class143 {

	@OriginalMember(owner = "client!amy", name = "q", descriptor = "I")
	static final int anInt2318 = 3;

	@OriginalMember(owner = "client!amy", name = "w", descriptor = "I")
	static final int anInt2319 = 0;

	@OriginalMember(owner = "client!amy", name = "t", descriptor = "I")
	static final int anInt2320 = 1;

	@OriginalMember(owner = "client!amy", name = "<init>", descriptor = "(Lclient!akq;)V", line = 13)
	public Class143_Sub42(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amy", name = "<init>", descriptor = "(ILclient!akq;)V", line = 17)
	public Class143_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amy", name = "i", descriptor = "(I)V", line = 21)
	public void method16247() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 3) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amy", name = "u", descriptor = "()V", line = 21)
	public void method16248() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 3) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amy", name = "e", descriptor = "()V", line = 21)
	public void method16249() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 3) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amy", name = "p", descriptor = "(I)I", line = 25)
	@Override
	int method16256() {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "t", descriptor = "()I", line = 25)
	@Override
	int method16257() {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "w", descriptor = "()I", line = 25)
	@Override
	int method16260() {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "y", descriptor = "()I", line = 25)
	@Override
	int method16259() {
		return 1;
	}

	@OriginalMember(owner = "client!amy", name = "c", descriptor = "(II)I", line = 29)
	@Override
	int method16264(@OriginalArg(0) int arg0) {
		return Class96_Sub23.method8563(this.aClass77_Sub35_44.aClass143_Sub6_1.method15109()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!amy", name = "r", descriptor = "(I)I", line = 29)
	@Override
	int method16266(@OriginalArg(0) int arg0) {
		return Class96_Sub23.method8563(this.aClass77_Sub35_44.aClass143_Sub6_1.method15109()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!amy", name = "s", descriptor = "(I)I", line = 29)
	@Override
	int method16265(@OriginalArg(0) int arg0) {
		return Class96_Sub23.method8563(this.aClass77_Sub35_44.aClass143_Sub6_1.method15109()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!amy", name = "g", descriptor = "(I)I", line = 29)
	@Override
	int method16267(@OriginalArg(0) int arg0) {
		return Class96_Sub23.method8563(this.aClass77_Sub35_44.aClass143_Sub6_1.method15109()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!amy", name = "z", descriptor = "(I)I", line = 29)
	@Override
	int method16268(@OriginalArg(0) int arg0) {
		return Class96_Sub23.method8563(this.aClass77_Sub35_44.aClass143_Sub6_1.method15109()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!amy", name = "d", descriptor = "(I)V", line = 34)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amy", name = "l", descriptor = "(II)V", line = 34)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amy", name = "x", descriptor = "(I)V", line = 34)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amy", name = "q", descriptor = "(I)V", line = 34)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amy", name = "k", descriptor = "(I)I", line = 38)
	public int method16250() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amy", name = "f", descriptor = "()I", line = 38)
	public int method16251() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amy", name = "o", descriptor = "()I", line = 38)
	public int method16252() {
		return this.anInt2324 * 189295939;
	}
}
