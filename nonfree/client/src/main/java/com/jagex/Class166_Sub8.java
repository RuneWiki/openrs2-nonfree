package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amh")
public class Class166_Sub8 extends Class166 {

	@OriginalMember(owner = "client!amh", name = "l", descriptor = "I")
	public static final int anInt2115 = 1;

	@OriginalMember(owner = "client!amh", name = "w", descriptor = "I")
	public static final int anInt2116 = 0;

	@OriginalMember(owner = "client!amh", name = "u", descriptor = "I")
	public static final int anInt2117 = 2;

	@OriginalMember(owner = "client!amh", name = "<init>", descriptor = "(Lclient!ali;)V", line = 12)
	public Class166_Sub8(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amh", name = "<init>", descriptor = "(ILclient!ali;)V", line = 16)
	public Class166_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amh", name = "o", descriptor = "(S)V", line = 20)
	public void method15526() {
		if (this.aClass93_Sub36_49.aClass166_Sub14_1.method15654() == 0) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amh", name = "q", descriptor = "()V", line = 20)
	public void method15530() {
		if (this.aClass93_Sub36_49.aClass166_Sub14_1.method15654() == 0) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amh", name = "x", descriptor = "()V", line = 20)
	public void method15531() {
		if (this.aClass93_Sub36_49.aClass166_Sub14_1.method15654() == 0) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amh", name = "e", descriptor = "(B)I", line = 25)
	@Override
	int method16542() {
		return 2;
	}

	@OriginalMember(owner = "client!amh", name = "w", descriptor = "()I", line = 25)
	@Override
	int method16550() {
		return 2;
	}

	@OriginalMember(owner = "client!amh", name = "l", descriptor = "()I", line = 25)
	@Override
	int method16547() {
		return 2;
	}

	@OriginalMember(owner = "client!amh", name = "u", descriptor = "()I", line = 25)
	@Override
	int method16548() {
		return 2;
	}

	@OriginalMember(owner = "client!amh", name = "f", descriptor = "()I", line = 25)
	@Override
	int method16541() {
		return 2;
	}

	@OriginalMember(owner = "client!amh", name = "s", descriptor = "(I)Z", line = 29)
	public boolean method15527() {
		return this.aClass93_Sub36_49.aClass166_Sub14_1.method15654() != 0;
	}

	@OriginalMember(owner = "client!amh", name = "b", descriptor = "()Z", line = 29)
	public boolean method15532() {
		return this.aClass93_Sub36_49.aClass166_Sub14_1.method15654() != 0;
	}

	@OriginalMember(owner = "client!amh", name = "n", descriptor = "(II)I", line = 34)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		return this.aClass93_Sub36_49.aClass166_Sub14_1.method15654() == 0 ? 3 : 1;
	}

	@OriginalMember(owner = "client!amh", name = "p", descriptor = "(I)I", line = 34)
	@Override
	public int method16540(@OriginalArg(0) int arg0) {
		return this.aClass93_Sub36_49.aClass166_Sub14_1.method15654() == 0 ? 3 : 1;
	}

	@OriginalMember(owner = "client!amh", name = "z", descriptor = "(I)I", line = 34)
	@Override
	public int method16549(@OriginalArg(0) int arg0) {
		return this.aClass93_Sub36_49.aClass166_Sub14_1.method15654() == 0 ? 3 : 1;
	}

	@OriginalMember(owner = "client!amh", name = "d", descriptor = "(I)V", line = 39)
	@Override
	void method16546(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amh", name = "k", descriptor = "(II)V", line = 39)
	@Override
	void method16545(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amh", name = "c", descriptor = "(I)V", line = 39)
	@Override
	void method16551(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amh", name = "y", descriptor = "(S)I", line = 43)
	public int method15528() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amh", name = "a", descriptor = "()I", line = 43)
	public int method15529() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amh", name = "h", descriptor = "()I", line = 43)
	public int method15533() {
		return this.anInt2379 * 960141055;
	}
}
