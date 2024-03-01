package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anu")
public class Class166_Sub43 extends Class166 {

	@OriginalMember(owner = "client!anu", name = "u", descriptor = "I")
	static final int anInt2354 = 3;

	@OriginalMember(owner = "client!anu", name = "w", descriptor = "I")
	static final int anInt2355 = 0;

	@OriginalMember(owner = "client!anu", name = "l", descriptor = "I")
	static final int anInt2356 = 1;

	@OriginalMember(owner = "client!anu", name = "<init>", descriptor = "(Lclient!ali;)V", line = 13)
	public Class166_Sub43(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anu", name = "<init>", descriptor = "(ILclient!ali;)V", line = 17)
	public Class166_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anu", name = "o", descriptor = "(I)V", line = 21)
	public void method16422() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!anu", name = "y", descriptor = "()V", line = 21)
	public void method16425() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!anu", name = "q", descriptor = "()V", line = 21)
	public void method16426() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!anu", name = "l", descriptor = "()I", line = 25)
	@Override
	int method16547() {
		return 1;
	}

	@OriginalMember(owner = "client!anu", name = "e", descriptor = "(B)I", line = 25)
	@Override
	int method16542() {
		return 1;
	}

	@OriginalMember(owner = "client!anu", name = "f", descriptor = "()I", line = 25)
	@Override
	int method16541() {
		return 1;
	}

	@OriginalMember(owner = "client!anu", name = "w", descriptor = "()I", line = 25)
	@Override
	int method16550() {
		return 1;
	}

	@OriginalMember(owner = "client!anu", name = "u", descriptor = "()I", line = 25)
	@Override
	int method16548() {
		return 1;
	}

	@OriginalMember(owner = "client!anu", name = "n", descriptor = "(II)I", line = 29)
	@Override
	int method16543(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anu", name = "z", descriptor = "(I)I", line = 29)
	@Override
	int method16549(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anu", name = "p", descriptor = "(I)I", line = 29)
	@Override
	int method16540(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anu", name = "d", descriptor = "(I)V", line = 34)
	@Override
	void method16546(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anu", name = "c", descriptor = "(I)V", line = 34)
	@Override
	void method16551(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anu", name = "k", descriptor = "(II)V", line = 34)
	@Override
	void method16545(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anu", name = "s", descriptor = "(I)I", line = 38)
	public int method16423() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anu", name = "x", descriptor = "()I", line = 38)
	public int method16424() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anu", name = "r", descriptor = "(Lclient!yf;I)V", line = 75)
	static void method16427(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class589.method31683();
	}
}
