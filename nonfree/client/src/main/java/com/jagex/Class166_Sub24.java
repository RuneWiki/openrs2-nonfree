package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amx")
public class Class166_Sub24 extends Class166 {

	@OriginalMember(owner = "client!amx", name = "w", descriptor = "I")
	public static final int anInt2223 = 0;

	@OriginalMember(owner = "client!amx", name = "l", descriptor = "I")
	public static final int anInt2224 = 1;

	@OriginalMember(owner = "client!amx", name = "u", descriptor = "I")
	public static final int anInt2225 = 2;

	@OriginalMember(owner = "client!amx", name = "<init>", descriptor = "(Lclient!ali;)V", line = 13)
	public Class166_Sub24(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amx", name = "<init>", descriptor = "(ILclient!ali;)V", line = 17)
	public Class166_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amx", name = "o", descriptor = "(I)V", line = 21)
	public void method15863() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amx", name = "x", descriptor = "()V", line = 21)
	public void method15867() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amx", name = "q", descriptor = "()V", line = 21)
	public void method15868() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amx", name = "b", descriptor = "()V", line = 21)
	public void method15869() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amx", name = "e", descriptor = "(B)I", line = 25)
	@Override
	int method16542() {
		return this.aClass93_Sub36_49.aClass166_Sub4_2.method15425() && Class499.method30147(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424()) ? 1 : 0;
	}

	@OriginalMember(owner = "client!amx", name = "f", descriptor = "()I", line = 25)
	@Override
	int method16541() {
		return this.aClass93_Sub36_49.aClass166_Sub4_2.method15425() && Class499.method30147(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424()) ? 1 : 0;
	}

	@OriginalMember(owner = "client!amx", name = "l", descriptor = "()I", line = 25)
	@Override
	int method16547() {
		return this.aClass93_Sub36_49.aClass166_Sub4_2.method15425() && Class499.method30147(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424()) ? 1 : 0;
	}

	@OriginalMember(owner = "client!amx", name = "u", descriptor = "()I", line = 25)
	@Override
	int method16548() {
		return this.aClass93_Sub36_49.aClass166_Sub4_2.method15425() && Class499.method30147(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424()) ? 1 : 0;
	}

	@OriginalMember(owner = "client!amx", name = "w", descriptor = "()I", line = 25)
	@Override
	int method16550() {
		return this.aClass93_Sub36_49.aClass166_Sub4_2.method15425() && Class499.method30147(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424()) ? 1 : 0;
	}

	@OriginalMember(owner = "client!amx", name = "n", descriptor = "(I)I", line = 26)
	public static int method15871() {
		return Class329.anInt4145 * -1643878723 - 1;
	}

	@OriginalMember(owner = "client!amx", name = "s", descriptor = "(B)Z", line = 30)
	public boolean method15862() {
		return true;
	}

	@OriginalMember(owner = "client!amx", name = "h", descriptor = "()Z", line = 30)
	public boolean method15866() {
		return true;
	}

	@OriginalMember(owner = "client!amx", name = "z", descriptor = "(I)I", line = 34)
	@Override
	public int method16549(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amx", name = "p", descriptor = "(I)I", line = 34)
	@Override
	public int method16540(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amx", name = "n", descriptor = "(II)I", line = 34)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amx", name = "k", descriptor = "(II)V", line = 38)
	@Override
	void method16545(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amx", name = "d", descriptor = "(I)V", line = 38)
	@Override
	void method16546(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amx", name = "c", descriptor = "(I)V", line = 38)
	@Override
	void method16551(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amx", name = "a", descriptor = "()I", line = 42)
	public int method15864() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amx", name = "y", descriptor = "(I)I", line = 42)
	public int method15865() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amx", name = "g", descriptor = "()I", line = 42)
	public int method15870() {
		return this.anInt2379 * 960141055;
	}
}
