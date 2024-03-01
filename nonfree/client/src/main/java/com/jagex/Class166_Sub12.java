package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aml")
public class Class166_Sub12 extends Class166 {

	@OriginalMember(owner = "client!aml", name = "r", descriptor = "I")
	public static int anInt2143;

	@OriginalMember(owner = "client!aml", name = "<init>", descriptor = "(Lclient!ali;)V", line = 8)
	public Class166_Sub12(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aml", name = "<init>", descriptor = "(ILclient!ali;)V", line = 12)
	public Class166_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aml", name = "o", descriptor = "(B)V", line = 16)
	public void method15609() {
		if (this.aClass93_Sub36_49.method14365().method146()) {
			this.anInt2379 = Class332.aClass332_1.anInt4147 * 1605425435;
			return;
		}
		@Pc(20) int local20 = this.aClass93_Sub36_49.method14365().method138();
		if (local20 < 245) {
			this.anInt2379 = Class332.aClass332_6.anInt4147 * 1605425435;
		}
		if (this.anInt2379 * 960141055 == Class332.aClass332_5.anInt4147 * 595334117 && local20 < 500) {
			this.anInt2379 = Class332.aClass332_3.anInt4147 * 1605425435;
		}
		if (this.anInt2379 * 960141055 < Class332.aClass332_6.anInt4147 * 595334117 || this.anInt2379 * 960141055 > Class332.aClass332_4.anInt4147 * 595334117) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!aml", name = "q", descriptor = "()V", line = 16)
	public void method15613() {
		if (this.aClass93_Sub36_49.method14365().method146()) {
			this.anInt2379 = Class332.aClass332_1.anInt4147 * 1605425435;
			return;
		}
		@Pc(20) int local20 = this.aClass93_Sub36_49.method14365().method138();
		if (local20 < 245) {
			this.anInt2379 = Class332.aClass332_6.anInt4147 * 1605425435;
		}
		if (this.anInt2379 * 960141055 == Class332.aClass332_5.anInt4147 * 595334117 && local20 < 500) {
			this.anInt2379 = Class332.aClass332_3.anInt4147 * 1605425435;
		}
		if (this.anInt2379 * 960141055 < Class332.aClass332_6.anInt4147 * 595334117 || this.anInt2379 * 960141055 > Class332.aClass332_4.anInt4147 * 595334117) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!aml", name = "u", descriptor = "()I", line = 28)
	@Override
	int method16548() {
		return this.aClass93_Sub36_49.method14365().method146() ? Class332.aClass332_1.anInt4147 * 595334117 : Class332.aClass332_6.anInt4147 * 595334117;
	}

	@OriginalMember(owner = "client!aml", name = "f", descriptor = "()I", line = 28)
	@Override
	int method16541() {
		return this.aClass93_Sub36_49.method14365().method146() ? Class332.aClass332_1.anInt4147 * 595334117 : Class332.aClass332_6.anInt4147 * 595334117;
	}

	@OriginalMember(owner = "client!aml", name = "w", descriptor = "()I", line = 28)
	@Override
	int method16550() {
		return this.aClass93_Sub36_49.method14365().method146() ? Class332.aClass332_1.anInt4147 * 595334117 : Class332.aClass332_6.anInt4147 * 595334117;
	}

	@OriginalMember(owner = "client!aml", name = "e", descriptor = "(B)I", line = 28)
	@Override
	int method16542() {
		return this.aClass93_Sub36_49.method14365().method146() ? Class332.aClass332_1.anInt4147 * 595334117 : Class332.aClass332_6.anInt4147 * 595334117;
	}

	@OriginalMember(owner = "client!aml", name = "l", descriptor = "()I", line = 28)
	@Override
	int method16547() {
		return this.aClass93_Sub36_49.method14365().method146() ? Class332.aClass332_1.anInt4147 * 595334117 : Class332.aClass332_6.anInt4147 * 595334117;
	}

	@OriginalMember(owner = "client!aml", name = "s", descriptor = "(I)Z", line = 33)
	public boolean method15610() {
		if (this.aClass93_Sub36_49.method14365().method146()) {
			return false;
		} else {
			@Pc(15) int local15 = this.aClass93_Sub36_49.method14365().method138();
			return local15 >= 245;
		}
	}

	@OriginalMember(owner = "client!aml", name = "x", descriptor = "()Z", line = 33)
	public boolean method15614() {
		if (this.aClass93_Sub36_49.method14365().method146()) {
			return false;
		} else {
			@Pc(15) int local15 = this.aClass93_Sub36_49.method14365().method138();
			return local15 >= 245;
		}
	}

	@OriginalMember(owner = "client!aml", name = "b", descriptor = "()Z", line = 33)
	public boolean method15615() {
		if (this.aClass93_Sub36_49.method14365().method146()) {
			return false;
		} else {
			@Pc(15) int local15 = this.aClass93_Sub36_49.method14365().method138();
			return local15 >= 245;
		}
	}

	@OriginalMember(owner = "client!aml", name = "h", descriptor = "()Z", line = 33)
	public boolean method15616() {
		if (this.aClass93_Sub36_49.method14365().method146()) {
			return false;
		} else {
			@Pc(15) int local15 = this.aClass93_Sub36_49.method14365().method138();
			return local15 >= 245;
		}
	}

	@OriginalMember(owner = "client!aml", name = "n", descriptor = "(II)I", line = 40)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.method14365().method146()) {
			return 3;
		}
		@Pc(15) int local15 = this.aClass93_Sub36_49.method14365().method138();
		if (local15 < 245) {
			return 3;
		} else if (arg0 == Class332.aClass332_5.anInt4147 * 595334117 && local15 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!aml", name = "z", descriptor = "(I)I", line = 40)
	@Override
	public int method16549(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.method14365().method146()) {
			return 3;
		}
		@Pc(15) int local15 = this.aClass93_Sub36_49.method14365().method138();
		if (local15 < 245) {
			return 3;
		} else if (arg0 == Class332.aClass332_5.anInt4147 * 595334117 && local15 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!aml", name = "p", descriptor = "(I)I", line = 40)
	@Override
	public int method16540(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.method14365().method146()) {
			return 3;
		}
		@Pc(15) int local15 = this.aClass93_Sub36_49.method14365().method138();
		if (local15 < 245) {
			return 3;
		} else if (arg0 == Class332.aClass332_5.anInt4147 * 595334117 && local15 < 500) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!aml", name = "d", descriptor = "(I)V", line = 48)
	@Override
	void method16546(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!aml", name = "k", descriptor = "(II)V", line = 48)
	@Override
	void method16545(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!aml", name = "c", descriptor = "(I)V", line = 48)
	@Override
	void method16551(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!aml", name = "y", descriptor = "(B)I", line = 52)
	public int method15611() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!aml", name = "g", descriptor = "()I", line = 52)
	public int method15612() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!aml", name = "a", descriptor = "()I", line = 52)
	public int method15617() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!aml", name = "i", descriptor = "()I", line = 52)
	public int method15618() {
		return this.anInt2379 * 960141055;
	}
}
