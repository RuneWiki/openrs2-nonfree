package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!and")
public class Class166_Sub28 extends Class166 {

	@OriginalMember(owner = "client!and", name = "l", descriptor = "I")
	public static final int anInt2252 = 1;

	@OriginalMember(owner = "client!and", name = "u", descriptor = "I")
	public static final int anInt2253 = 0;

	@OriginalMember(owner = "client!and", name = "w", descriptor = "I")
	static final int anInt2254 = 3;

	@OriginalMember(owner = "client!and", name = "<init>", descriptor = "(Lclient!ali;)V", line = 13)
	public Class166_Sub28(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!and", name = "<init>", descriptor = "(ILclient!ali;)V", line = 17)
	public Class166_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!and", name = "o", descriptor = "(I)V", line = 21)
	public void method16038() {
		if (this.aClass93_Sub36_49.aClass166_Sub4_2.method15425() && !Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424())) {
			this.anInt2379 = 0;
		}
		if (this.aClass93_Sub36_49.method14365().method146()) {
			if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 3) {
				this.anInt2379 = this.method16542() * -88839937;
			}
		} else if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!and", name = "q", descriptor = "()V", line = 21)
	public void method16039() {
		if (this.aClass93_Sub36_49.aClass166_Sub4_2.method15425() && !Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424())) {
			this.anInt2379 = 0;
		}
		if (this.aClass93_Sub36_49.method14365().method146()) {
			if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 3) {
				this.anInt2379 = this.method16542() * -88839937;
			}
		} else if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 1) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!and", name = "e", descriptor = "(B)I", line = 37)
	@Override
	int method16542() {
		return 0;
	}

	@OriginalMember(owner = "client!and", name = "f", descriptor = "()I", line = 37)
	@Override
	int method16541() {
		return 0;
	}

	@OriginalMember(owner = "client!and", name = "w", descriptor = "()I", line = 37)
	@Override
	int method16550() {
		return 0;
	}

	@OriginalMember(owner = "client!and", name = "u", descriptor = "()I", line = 37)
	@Override
	int method16548() {
		return 0;
	}

	@OriginalMember(owner = "client!and", name = "l", descriptor = "()I", line = 37)
	@Override
	int method16547() {
		return 0;
	}

	@OriginalMember(owner = "client!and", name = "s", descriptor = "(I)Z", line = 41)
	public boolean method16036() {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424());
	}

	@OriginalMember(owner = "client!and", name = "x", descriptor = "()Z", line = 41)
	public boolean method16040() {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424());
	}

	@OriginalMember(owner = "client!and", name = "b", descriptor = "()Z", line = 41)
	public boolean method16041() {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424());
	}

	@OriginalMember(owner = "client!and", name = "z", descriptor = "(I)I", line = 46)
	@Override
	public int method16549(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!and", name = "n", descriptor = "(II)I", line = 46)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!and", name = "p", descriptor = "(I)I", line = 46)
	@Override
	public int method16540(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!and", name = "c", descriptor = "(I)V", line = 51)
	@Override
	void method16551(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!and", name = "k", descriptor = "(II)V", line = 51)
	@Override
	void method16545(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!and", name = "d", descriptor = "(I)V", line = 51)
	@Override
	void method16546(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!and", name = "y", descriptor = "(B)I", line = 55)
	public int method16037() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!and", name = "h", descriptor = "()I", line = 55)
	public int method16042() {
		return this.anInt2379 * 960141055;
	}
}
