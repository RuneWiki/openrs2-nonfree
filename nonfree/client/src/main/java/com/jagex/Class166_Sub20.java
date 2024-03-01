package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amt")
public class Class166_Sub20 extends Class166 {

	@OriginalMember(owner = "client!amt", name = "l", descriptor = "I")
	static final int anInt2196 = 1;

	@OriginalMember(owner = "client!amt", name = "w", descriptor = "I")
	public static final int anInt2197 = 2;

	@OriginalMember(owner = "client!amt", name = "u", descriptor = "I")
	public static final int anInt2198 = 0;

	@OriginalMember(owner = "client!amt", name = "jd", descriptor = "Lclient!uz;")
	static Class160 aClass160_2;

	@OriginalMember(owner = "client!amt", name = "<init>", descriptor = "(Lclient!ali;)V", line = 12)
	public Class166_Sub20(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amt", name = "<init>", descriptor = "(ILclient!ali;)V", line = 16)
	public Class166_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amt", name = "o", descriptor = "(I)V", line = 20)
	public void method15776() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amt", name = "q", descriptor = "()V", line = 20)
	public void method15777() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amt", name = "x", descriptor = "()V", line = 20)
	public void method15780() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amt", name = "b", descriptor = "()V", line = 20)
	public void method15782() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16542() * -88839937;
		}
	}

	@OriginalMember(owner = "client!amt", name = "e", descriptor = "(B)I", line = 24)
	@Override
	int method16542() {
		return 1;
	}

	@OriginalMember(owner = "client!amt", name = "f", descriptor = "()I", line = 24)
	@Override
	int method16541() {
		return 1;
	}

	@OriginalMember(owner = "client!amt", name = "l", descriptor = "()I", line = 24)
	@Override
	int method16547() {
		return 1;
	}

	@OriginalMember(owner = "client!amt", name = "u", descriptor = "()I", line = 24)
	@Override
	int method16548() {
		return 1;
	}

	@OriginalMember(owner = "client!amt", name = "w", descriptor = "()I", line = 24)
	@Override
	int method16550() {
		return 1;
	}

	@OriginalMember(owner = "client!amt", name = "s", descriptor = "(B)Z", line = 28)
	public boolean method15774() {
		return true;
	}

	@OriginalMember(owner = "client!amt", name = "a", descriptor = "()Z", line = 28)
	public boolean method15778() {
		return true;
	}

	@OriginalMember(owner = "client!amt", name = "h", descriptor = "()Z", line = 28)
	public boolean method15781() {
		return true;
	}

	@OriginalMember(owner = "client!amt", name = "z", descriptor = "(I)I", line = 32)
	@Override
	public int method16549(@OriginalArg(0) int arg0) {
		return arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16529() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!amt", name = "n", descriptor = "(II)I", line = 32)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		return arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16529() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!amt", name = "p", descriptor = "(I)I", line = 32)
	@Override
	public int method16540(@OriginalArg(0) int arg0) {
		return arg0 == 0 || this.aClass93_Sub36_49.aClass166_Sub46_1.method16529() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!amt", name = "k", descriptor = "(II)V", line = 37)
	@Override
	void method16545(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amt", name = "c", descriptor = "(I)V", line = 37)
	@Override
	void method16551(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amt", name = "d", descriptor = "(I)V", line = 37)
	@Override
	void method16546(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amt", name = "y", descriptor = "(I)I", line = 41)
	public int method15775() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amt", name = "g", descriptor = "()I", line = 41)
	public int method15779() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amt", name = "ajv", descriptor = "(Lclient!yf;B)V", line = 11415)
	static final void method15783(@OriginalArg(0) Class681 arg0) {
		if (Class112_Sub2_Sub2.aClass158_2.method14308(81)) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		}
	}
}
