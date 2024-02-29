package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alm")
public class Class143_Sub10 extends Class143 {

	@OriginalMember(owner = "client!alm", name = "t", descriptor = "I")
	public static final int anInt2097 = 0;

	@OriginalMember(owner = "client!alm", name = "w", descriptor = "I")
	public static final int anInt2098 = 1;

	@OriginalMember(owner = "client!alm", name = "<init>", descriptor = "(Lclient!akq;)V", line = 12)
	public Class143_Sub10(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!alm", name = "<init>", descriptor = "(ILclient!akq;)V", line = 16)
	public Class143_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!alm", name = "i", descriptor = "(I)V", line = 20)
	public void method15216() {
		if (this.aClass77_Sub35_44.method14391() != Class670.aClass670_5) {
			this.anInt2324 = 1823770475;
		}
		if (this.anInt2324 * 189295939 != 0 && this.anInt2324 * 189295939 != 1) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alm", name = "e", descriptor = "()V", line = 20)
	public void method15217() {
		if (this.aClass77_Sub35_44.method14391() != Class670.aClass670_5) {
			this.anInt2324 = 1823770475;
		}
		if (this.anInt2324 * 189295939 != 0 && this.anInt2324 * 189295939 != 1) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alm", name = "p", descriptor = "(I)I", line = 25)
	@Override
	int method16256() {
		return 1;
	}

	@OriginalMember(owner = "client!alm", name = "y", descriptor = "()I", line = 25)
	@Override
	int method16259() {
		return 1;
	}

	@OriginalMember(owner = "client!alm", name = "w", descriptor = "()I", line = 25)
	@Override
	int method16260() {
		return 1;
	}

	@OriginalMember(owner = "client!alm", name = "t", descriptor = "()I", line = 25)
	@Override
	int method16257() {
		return 1;
	}

	@OriginalMember(owner = "client!alm", name = "k", descriptor = "(I)Z", line = 29)
	public boolean method15218() {
		return this.aClass77_Sub35_44.method14391() == Class670.aClass670_5;
	}

	@OriginalMember(owner = "client!alm", name = "b", descriptor = "()Z", line = 29)
	public boolean method15219() {
		return this.aClass77_Sub35_44.method14391() == Class670.aClass670_5;
	}

	@OriginalMember(owner = "client!alm", name = "o", descriptor = "()Z", line = 29)
	public boolean method15220() {
		return this.aClass77_Sub35_44.method14391() == Class670.aClass670_5;
	}

	@OriginalMember(owner = "client!alm", name = "f", descriptor = "()Z", line = 29)
	public boolean method15221() {
		return this.aClass77_Sub35_44.method14391() == Class670.aClass670_5;
	}

	@OriginalMember(owner = "client!alm", name = "s", descriptor = "(I)I", line = 34)
	@Override
	public int method16265(@OriginalArg(0) int arg0) {
		return this.aClass77_Sub35_44.method14391() == Class670.aClass670_5 ? 1 : 3;
	}

	@OriginalMember(owner = "client!alm", name = "z", descriptor = "(I)I", line = 34)
	@Override
	public int method16268(@OriginalArg(0) int arg0) {
		return this.aClass77_Sub35_44.method14391() == Class670.aClass670_5 ? 1 : 3;
	}

	@OriginalMember(owner = "client!alm", name = "c", descriptor = "(II)I", line = 34)
	@Override
	public int method16264(@OriginalArg(0) int arg0) {
		return this.aClass77_Sub35_44.method14391() == Class670.aClass670_5 ? 1 : 3;
	}

	@OriginalMember(owner = "client!alm", name = "r", descriptor = "(I)I", line = 34)
	@Override
	public int method16266(@OriginalArg(0) int arg0) {
		return this.aClass77_Sub35_44.method14391() == Class670.aClass670_5 ? 1 : 3;
	}

	@OriginalMember(owner = "client!alm", name = "g", descriptor = "(I)I", line = 34)
	@Override
	public int method16267(@OriginalArg(0) int arg0) {
		return this.aClass77_Sub35_44.method14391() == Class670.aClass670_5 ? 1 : 3;
	}

	@OriginalMember(owner = "client!alm", name = "l", descriptor = "(II)V", line = 39)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alm", name = "q", descriptor = "(I)V", line = 39)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alm", name = "x", descriptor = "(I)V", line = 39)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alm", name = "d", descriptor = "(I)V", line = 39)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alm", name = "u", descriptor = "(B)I", line = 43)
	public int method15222() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alm", name = "n", descriptor = "()I", line = 43)
	public int method15223() {
		return this.anInt2324 * 189295939;
	}
}
