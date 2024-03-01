package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!anq")
public class Class166_Sub39 extends Class166 {

	@OriginalMember(owner = "client!anq", name = "w", descriptor = "I")
	static final int anInt2326 = 2;

	@OriginalMember(owner = "client!anq", name = "l", descriptor = "I")
	public static final int anInt2327 = 0;

	@OriginalMember(owner = "client!anq", name = "al", descriptor = "I")
	static int anInt2328;

	@OriginalMember(owner = "client!anq", name = "<init>", descriptor = "(Lclient!ali;)V", line = 12)
	public Class166_Sub39(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anq", name = "<init>", descriptor = "(ILclient!ali;)V", line = 16)
	public Class166_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anq", name = "o", descriptor = "(B)V", line = 20)
	public void method16341() {
		if (this.aClass93_Sub36_49.aClass166_Sub4_2.method15425() && !Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424())) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!anq", name = "q", descriptor = "()V", line = 20)
	public void method16345() {
		if (this.aClass93_Sub36_49.aClass166_Sub4_2.method15425() && !Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424())) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!anq", name = "f", descriptor = "()I", line = 25)
	@Override
	int method16541() {
		return 0;
	}

	@OriginalMember(owner = "client!anq", name = "w", descriptor = "()I", line = 25)
	@Override
	int method16550() {
		return 0;
	}

	@OriginalMember(owner = "client!anq", name = "l", descriptor = "()I", line = 25)
	@Override
	int method16547() {
		return 0;
	}

	@OriginalMember(owner = "client!anq", name = "u", descriptor = "()I", line = 25)
	@Override
	int method16548() {
		return 0;
	}

	@OriginalMember(owner = "client!anq", name = "e", descriptor = "(B)I", line = 25)
	@Override
	int method16542() {
		return 0;
	}

	@OriginalMember(owner = "client!anq", name = "s", descriptor = "(I)Z", line = 29)
	public boolean method16342() {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424());
	}

	@OriginalMember(owner = "client!anq", name = "x", descriptor = "()Z", line = 29)
	public boolean method16344() {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424());
	}

	@OriginalMember(owner = "client!anq", name = "z", descriptor = "(I)I", line = 34)
	@Override
	public int method16549(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anq", name = "n", descriptor = "(II)I", line = 34)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anq", name = "p", descriptor = "(I)I", line = 34)
	@Override
	public int method16540(@OriginalArg(0) int arg0) {
		return Class136.method10214(this.aClass93_Sub36_49.aClass166_Sub4_2.method15424()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!anq", name = "k", descriptor = "(II)V", line = 39)
	@Override
	public void method16545(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anq", name = "c", descriptor = "(I)V", line = 39)
	@Override
	public void method16551(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anq", name = "d", descriptor = "(I)V", line = 39)
	@Override
	public void method16546(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anq", name = "y", descriptor = "(I)I", line = 43)
	public int method16343() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anq", name = "b", descriptor = "()I", line = 43)
	public int method16346() {
		return this.anInt2379 * 960141055;
	}
}
