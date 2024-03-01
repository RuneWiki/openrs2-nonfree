package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amw")
public class Class166_Sub23 extends Class166 {

	@OriginalMember(owner = "client!amw", name = "l", descriptor = "I")
	public static final int anInt2216 = 2;

	@OriginalMember(owner = "client!amw", name = "u", descriptor = "I")
	public static final int anInt2217 = 3;

	@OriginalMember(owner = "client!amw", name = "w", descriptor = "I")
	public static final int anInt2218 = 1;

	@OriginalMember(owner = "client!amw", name = "<init>", descriptor = "(Lclient!ali;)V", line = 12)
	public Class166_Sub23(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amw", name = "<init>", descriptor = "(ILclient!ali;)V", line = 16)
	public Class166_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amw", name = "y", descriptor = "()V", line = 20)
	public void method15840() {
		if (this.anInt2379 * 960141055 < 1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amw", name = "o", descriptor = "(I)V", line = 20)
	public void method15841() {
		if (this.anInt2379 * 960141055 < 1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amw", name = "x", descriptor = "()V", line = 20)
	public void method15842() {
		if (this.anInt2379 * 960141055 < 1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amw", name = "q", descriptor = "()V", line = 20)
	public void method15843() {
		if (this.anInt2379 * 960141055 < 1 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amw", name = "e", descriptor = "(B)I", line = 24)
	@Override
	int method16542() {
		return this.aClass93_Sub36_49.method14365().method139() ? 3 : 2;
	}

	@OriginalMember(owner = "client!amw", name = "f", descriptor = "()I", line = 24)
	@Override
	int method16541() {
		return this.aClass93_Sub36_49.method14365().method139() ? 3 : 2;
	}

	@OriginalMember(owner = "client!amw", name = "w", descriptor = "()I", line = 24)
	@Override
	int method16550() {
		return this.aClass93_Sub36_49.method14365().method139() ? 3 : 2;
	}

	@OriginalMember(owner = "client!amw", name = "l", descriptor = "()I", line = 24)
	@Override
	int method16547() {
		return this.aClass93_Sub36_49.method14365().method139() ? 3 : 2;
	}

	@OriginalMember(owner = "client!amw", name = "u", descriptor = "()I", line = 24)
	@Override
	int method16548() {
		return this.aClass93_Sub36_49.method14365().method139() ? 3 : 2;
	}

	@OriginalMember(owner = "client!amw", name = "n", descriptor = "(II)I", line = 28)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amw", name = "z", descriptor = "(I)I", line = 28)
	@Override
	int method16549(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amw", name = "p", descriptor = "(I)I", line = 28)
	@Override
	int method16540(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amw", name = "d", descriptor = "(I)V", line = 32)
	@Override
	void method16546(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amw", name = "c", descriptor = "(I)V", line = 32)
	@Override
	void method16551(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amw", name = "k", descriptor = "(II)V", line = 32)
	@Override
	void method16545(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amw", name = "s", descriptor = "(I)I", line = 36)
	public int method15844() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amw", name = "b", descriptor = "()I", line = 36)
	public int method15845() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amw", name = "h", descriptor = "()I", line = 36)
	public int method15846() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amw", name = "a", descriptor = "()I", line = 36)
	public int method15847() {
		return this.anInt2379 * 960141055;
	}
}
