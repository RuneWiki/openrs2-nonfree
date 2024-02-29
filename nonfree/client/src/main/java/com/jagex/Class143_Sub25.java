package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amh")
public class Class143_Sub25 extends Class143 {

	@OriginalMember(owner = "client!amh", name = "w", descriptor = "I")
	static final int anInt2205 = 0;

	@OriginalMember(owner = "client!amh", name = "t", descriptor = "I")
	static final int anInt2206 = 1;

	@OriginalMember(owner = "client!amh", name = "<init>", descriptor = "(Lclient!akq;)V", line = 11)
	public Class143_Sub25(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amh", name = "<init>", descriptor = "(ILclient!akq;)V", line = 15)
	public Class143_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amh", name = "i", descriptor = "(I)V", line = 19)
	public void method15849() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 1) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amh", name = "p", descriptor = "(I)I", line = 23)
	@Override
	int method16256() {
		return 1;
	}

	@OriginalMember(owner = "client!amh", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16260() {
		return 1;
	}

	@OriginalMember(owner = "client!amh", name = "y", descriptor = "()I", line = 23)
	@Override
	int method16259() {
		return 1;
	}

	@OriginalMember(owner = "client!amh", name = "t", descriptor = "()I", line = 23)
	@Override
	int method16257() {
		return 1;
	}

	@OriginalMember(owner = "client!amh", name = "r", descriptor = "(I)I", line = 27)
	@Override
	int method16266(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amh", name = "s", descriptor = "(I)I", line = 27)
	@Override
	int method16265(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amh", name = "g", descriptor = "(I)I", line = 27)
	@Override
	int method16267(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amh", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method16268(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amh", name = "c", descriptor = "(II)I", line = 27)
	@Override
	int method16264(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amh", name = "l", descriptor = "(II)V", line = 31)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amh", name = "q", descriptor = "(I)V", line = 31)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amh", name = "x", descriptor = "(I)V", line = 31)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amh", name = "d", descriptor = "(I)V", line = 31)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amh", name = "k", descriptor = "(I)I", line = 35)
	public int method15850() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amh", name = "e", descriptor = "()I", line = 35)
	public int method15851() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amh", name = "u", descriptor = "()I", line = 35)
	public int method15852() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amh", name = "f", descriptor = "()I", line = 35)
	public int method15853() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amh", name = "o", descriptor = "()I", line = 35)
	public int method15854() {
		return this.anInt2324 * 189295939;
	}
}
