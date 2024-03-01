package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ami")
public class Class166_Sub9 extends Class166 {

	@OriginalMember(owner = "client!ami", name = "l", descriptor = "I")
	static final int anInt2122 = 0;

	@OriginalMember(owner = "client!ami", name = "z", descriptor = "I")
	static final int anInt2123 = 3;

	@OriginalMember(owner = "client!ami", name = "u", descriptor = "I")
	static final int anInt2124 = 1;

	@OriginalMember(owner = "client!ami", name = "w", descriptor = "I")
	static final int anInt2125 = -1;

	@OriginalMember(owner = "client!ami", name = "<init>", descriptor = "(Lclient!ali;)V", line = 13)
	public Class166_Sub9(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ami", name = "<init>", descriptor = "(ILclient!ali;)V", line = 17)
	public Class166_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ami", name = "y", descriptor = "()V", line = 21)
	public void method15550() {
		if (!this.aClass93_Sub36_49.method14365().method146()) {
			this.anInt2379 = this.method16542() * -88839937;
		} else if (this.anInt2379 * 960141055 < -1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!ami", name = "q", descriptor = "()V", line = 21)
	public void method15551() {
		if (!this.aClass93_Sub36_49.method14365().method146()) {
			this.anInt2379 = this.method16542() * -88839937;
		} else if (this.anInt2379 * 960141055 < -1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!ami", name = "o", descriptor = "(I)V", line = 21)
	public void method15552() {
		if (!this.aClass93_Sub36_49.method14365().method146()) {
			this.anInt2379 = this.method16542() * -88839937;
		} else if (this.anInt2379 * 960141055 < -1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!ami", name = "f", descriptor = "()I", line = 32)
	@Override
	int method16541() {
		return this.aClass93_Sub36_49.method14365().method146() ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "e", descriptor = "(B)I", line = 32)
	@Override
	int method16542() {
		return this.aClass93_Sub36_49.method14365().method146() ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "w", descriptor = "()I", line = 32)
	@Override
	int method16550() {
		return this.aClass93_Sub36_49.method14365().method146() ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "l", descriptor = "()I", line = 32)
	@Override
	int method16547() {
		return this.aClass93_Sub36_49.method14365().method146() ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "u", descriptor = "()I", line = 32)
	@Override
	int method16548() {
		return this.aClass93_Sub36_49.method14365().method146() ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "n", descriptor = "(II)I", line = 41)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ami", name = "z", descriptor = "(I)I", line = 41)
	@Override
	int method16549(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ami", name = "p", descriptor = "(I)I", line = 41)
	@Override
	int method16540(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ami", name = "k", descriptor = "(II)V", line = 45)
	@Override
	void method16545(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ami", name = "d", descriptor = "(I)V", line = 45)
	@Override
	void method16546(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ami", name = "c", descriptor = "(I)V", line = 45)
	@Override
	void method16551(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ami", name = "s", descriptor = "(I)I", line = 49)
	public int method15548() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ami", name = "x", descriptor = "()I", line = 49)
	public int method15549() {
		return this.anInt2379 * 960141055;
	}
}
