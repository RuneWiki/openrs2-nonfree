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

	@OriginalMember(owner = "client!ami", name = "n", descriptor = "(II)I", line = 41)
	@Override
	int method16543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!ami", name = "<init>", descriptor = "(ILclient!ali;)V", line = 17)
	public Class166_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ami", name = "f", descriptor = "()I", line = 32)
	@Override
	int method16541() {
		return this.aClass93_Sub36_49.method14365(-1628365376).method146(1762313981) ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "<init>", descriptor = "(Lclient!ali;)V", line = 13)
	public Class166_Sub9(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ami", name = "e", descriptor = "(B)I", line = 32)
	@Override
	int method16542(@OriginalArg(0) byte arg0) {
		return this.aClass93_Sub36_49.method14365(285228330).method146(-617658522) ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "k", descriptor = "(II)V", line = 45)
	@Override
	void method16545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!ami", name = "s", descriptor = "(I)I", line = 49)
	public int method15548(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ami", name = "x", descriptor = "()I", line = 49)
	public int method15549() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!ami", name = "w", descriptor = "()I", line = 32)
	@Override
	int method16550() {
		return this.aClass93_Sub36_49.method14365(-1773170871).method146(1295217357) ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "l", descriptor = "()I", line = 32)
	@Override
	int method16547() {
		return this.aClass93_Sub36_49.method14365(-218215329).method146(-1874293544) ? 0 : 1;
	}

	@OriginalMember(owner = "client!ami", name = "u", descriptor = "()I", line = 32)
	@Override
	int method16548() {
		return this.aClass93_Sub36_49.method14365(-506881339).method146(597821288) ? 0 : 1;
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

	@OriginalMember(owner = "client!ami", name = "y", descriptor = "()V", line = 21)
	public void method15550() {
		if (!this.aClass93_Sub36_49.method14365(-2118289122).method146(1525736280)) {
			this.anInt2379 = this.method16542((byte) -72) * -88839937;
		} else if (this.anInt2379 * 960141055 < -1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16542((byte) -64) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ami", name = "q", descriptor = "()V", line = 21)
	public void method15551() {
		if (!this.aClass93_Sub36_49.method14365(79134665).method146(-794507870)) {
			this.anInt2379 = this.method16542((byte) 17) * -88839937;
		} else if (this.anInt2379 * 960141055 < -1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16542((byte) -47) * -88839937;
		}
	}

	@OriginalMember(owner = "client!ami", name = "o", descriptor = "(I)V", line = 21)
	public void method15552(@OriginalArg(0) int arg0) {
		if (!this.aClass93_Sub36_49.method14365(1208262117).method146(1717219492)) {
			this.anInt2379 = this.method16542((byte) 14) * -88839937;
		} else if (this.anInt2379 * 960141055 < -1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16542((byte) -39) * -88839937;
		}
	}
}
