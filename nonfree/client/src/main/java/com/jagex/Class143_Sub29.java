package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aml")
public class Class143_Sub29 extends Class143 {

	@OriginalMember(owner = "client!aml", name = "w", descriptor = "I")
	public static final int anInt2229 = 1;

	@OriginalMember(owner = "client!aml", name = "t", descriptor = "I")
	public static final int anInt2230 = 0;

	@OriginalMember(owner = "client!aml", name = "<init>", descriptor = "(Lclient!akq;)V", line = 11)
	public Class143_Sub29(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aml", name = "<init>", descriptor = "(ILclient!akq;)V", line = 15)
	public Class143_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aml", name = "i", descriptor = "(B)V", line = 19)
	public void method15946() {
		if (this.anInt2324 * 189295939 != 1 && this.anInt2324 * 189295939 != 0) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!aml", name = "p", descriptor = "(I)I", line = 23)
	@Override
	int method16256() {
		return 1;
	}

	@OriginalMember(owner = "client!aml", name = "y", descriptor = "()I", line = 23)
	@Override
	int method16259() {
		return 1;
	}

	@OriginalMember(owner = "client!aml", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16260() {
		return 1;
	}

	@OriginalMember(owner = "client!aml", name = "t", descriptor = "()I", line = 23)
	@Override
	int method16257() {
		return 1;
	}

	@OriginalMember(owner = "client!aml", name = "k", descriptor = "(I)Z", line = 27)
	public boolean method15947() {
		return true;
	}

	@OriginalMember(owner = "client!aml", name = "c", descriptor = "(II)I", line = 31)
	@Override
	public int method16264(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aml", name = "z", descriptor = "(I)I", line = 31)
	@Override
	public int method16268(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aml", name = "s", descriptor = "(I)I", line = 31)
	@Override
	public int method16265(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aml", name = "r", descriptor = "(I)I", line = 31)
	@Override
	public int method16266(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aml", name = "g", descriptor = "(I)I", line = 31)
	@Override
	public int method16267(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aml", name = "d", descriptor = "(I)V", line = 35)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!aml", name = "l", descriptor = "(II)V", line = 35)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!aml", name = "q", descriptor = "(I)V", line = 35)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!aml", name = "x", descriptor = "(I)V", line = 35)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!aml", name = "f", descriptor = "()I", line = 39)
	public int method15948() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!aml", name = "e", descriptor = "()I", line = 39)
	public int method15949() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!aml", name = "u", descriptor = "(I)I", line = 39)
	public int method15950() {
		return this.anInt2324 * 189295939;
	}
}
